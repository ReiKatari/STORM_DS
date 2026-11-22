package me.magnum.melonds.ui.romlist

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import me.magnum.melonds.domain.model.DownloadProgress
import me.magnum.melonds.domain.model.appupdate.AppUpdate
import me.magnum.melonds.domain.repositories.UpdatesRepository
import me.magnum.melonds.domain.services.UpdateInstallManager
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.io.File

@OptIn(ExperimentalCoroutinesApi::class)
class UpdatesViewModelSilentCheckTest {

    private class FakeUpdatesRepository : UpdatesRepository {
        var nextResult: Result<AppUpdate?> = Result.success(null)
        val recordedIgnorePreferences = mutableListOf<Boolean>()

        override suspend fun checkNewUpdate(ignorePreferences: Boolean): Result<AppUpdate?> {
            recordedIgnorePreferences.add(ignorePreferences)
            return nextResult
        }

        override fun skipUpdate(update: AppUpdate) = Unit
        override fun notifyUpdateDownloaded(update: AppUpdate) = Unit
    }

    private class FakeUpdateInstallManager : UpdateInstallManager {
        override fun downloadAndInstallUpdate(update: AppUpdate): Flow<DownloadProgress> = emptyFlow()
    }

    @Before
    fun setUp() {
        Dispatchers.setMain(UnconfinedTestDispatcher())
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun checkForUpdatesSilently_suppressesUpToDateAndErrorDialogs() = runTest {
        val repo = FakeUpdatesRepository()
        val viewModel = UpdatesViewModel(repo, FakeUpdateInstallManager())

        val manualResults = mutableListOf<ManualUpdateResult>()
        val updateEvents = mutableListOf<AppUpdate>()
        val manualJob = backgroundScope.launch(UnconfinedTestDispatcher(testScheduler)) {
            viewModel.manualUpdateResult.collect { manualResults.add(it) }
        }
        val updateJob = backgroundScope.launch(UnconfinedTestDispatcher(testScheduler)) {
            viewModel.appUpdate.collect { updateEvents.add(it) }
        }

        repo.recordedIgnorePreferences.clear()
        repo.nextResult = Result.success(null)
        viewModel.checkForUpdatesSilently()

        assertEquals(listOf(true), repo.recordedIgnorePreferences)
        assertTrue(manualResults.isEmpty())
        assertTrue(updateEvents.isEmpty())

        repo.nextResult = Result.failure(RuntimeException("Network error"))
        viewModel.checkForUpdatesSilently()

        assertEquals(listOf(true, true), repo.recordedIgnorePreferences)
        assertTrue(manualResults.isEmpty())
        assertTrue(updateEvents.isEmpty())

        manualJob.cancel()
        updateJob.cancel()
    }

    @Test
    fun checkForUpdatesManually_stillEmitsCheckingAndUpToDate() = runTest {
        val repo = FakeUpdatesRepository()
        val viewModel = UpdatesViewModel(repo, FakeUpdateInstallManager())

        val manualResults = mutableListOf<ManualUpdateResult>()
        val manualJob = backgroundScope.launch(UnconfinedTestDispatcher(testScheduler)) {
            viewModel.manualUpdateResult.collect { manualResults.add(it) }
        }

        repo.recordedIgnorePreferences.clear()
        repo.nextResult = Result.success(null)
        viewModel.checkForUpdatesManually()

        assertEquals(listOf(true), repo.recordedIgnorePreferences)
        assertEquals(2, manualResults.size)
        assertTrue(manualResults[0] is ManualUpdateResult.Checking)
        assertTrue(manualResults[1] is ManualUpdateResult.UpToDate)

        manualJob.cancel()
    }

    @Test
    fun checkForUpdatesManually_emitsCheckingAndErrorOnFailure() = runTest {
        val repo = FakeUpdatesRepository()
        val viewModel = UpdatesViewModel(repo, FakeUpdateInstallManager())

        val manualResults = mutableListOf<ManualUpdateResult>()
        val manualJob = backgroundScope.launch(UnconfinedTestDispatcher(testScheduler)) {
            viewModel.manualUpdateResult.collect { manualResults.add(it) }
        }

        repo.recordedIgnorePreferences.clear()
        repo.nextResult = Result.failure(RuntimeException("Network error"))
        viewModel.checkForUpdatesManually()

        assertEquals(listOf(true), repo.recordedIgnorePreferences)
        assertEquals(2, manualResults.size)
        assertTrue(manualResults[0] is ManualUpdateResult.Checking)
        assertEquals(ManualUpdateResult.Error("Network error"), manualResults[1])

        manualJob.cancel()
    }

    @Test
    fun romListRefreshPaths_useSilentUpdateCheck() {
        fun resolveFile(relativePath: String): File? {
            return listOf(File(relativePath), File("app/$relativePath")).firstOrNull { it.isFile }
        }

        val fragmentFile = resolveFile("src/main/java/me/magnum/melonds/ui/romlist/RomListFragment.kt")
        val activityFile = resolveFile("src/main/java/me/magnum/melonds/ui/romlist/RomListActivity.kt")
        assertNotNull(fragmentFile)
        assertNotNull(activityFile)

        val fragmentText = fragmentFile!!.readText(Charsets.UTF_8)
        assertTrue(fragmentText.contains("checkForUpdatesSilently()"))
        assertTrue(fragmentText.contains("onCheckUpdates = { (activity as? RomListActivity)?.checkForUpdatesManually() }"))

        val activityText = activityFile!!.readText(Charsets.UTF_8)
        assertTrue(activityText.contains("updatesViewModel.checkForUpdatesSilently()"))
    }
}
