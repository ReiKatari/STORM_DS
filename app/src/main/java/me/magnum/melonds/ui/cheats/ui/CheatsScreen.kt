package me.magnum.melonds.ui.cheats.ui

import androidx.activity.compose.BackHandler
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.exclude
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarHostState
import androidx.compose.material.SnackbarResult
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.CheckBox
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalResources
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.coroutines.launch
import kotlinx.serialization.ExperimentalSerializationApi
import me.magnum.melonds.R
import me.magnum.melonds.ui.cheats.CheatsNavigation
import me.magnum.melonds.ui.cheats.CheatsViewModel
import me.magnum.melonds.ui.cheats.model.CheatsScreenUiState

@OptIn(ExperimentalSerializationApi::class)
@Composable
fun CheatsScreen(
    viewModel: CheatsViewModel,
    initialScreen: CheatsNavigation,
) {
    val enabledCheatsTitle = stringResource(R.string.enabled_cheats)
    val navController = rememberNavController()
    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val showEnabledCheatsButton by remember(currentBackStackEntry) {
        derivedStateOf {
            val currentRoute = currentBackStackEntry?.destination?.route?.substringBefore("/")
            currentRoute == CheatsNavigation.GameFolders.serializer().descriptor.serialName || currentRoute == CheatsNavigation.FolderCheats.serializer().descriptor.serialName
        }
    }
    val appBarTitle by remember(currentBackStackEntry) {
        derivedStateOf {
            val currentRoute = currentBackStackEntry?.destination?.route?.substringBefore("/")
            when (currentRoute) {
                CheatsNavigation.GameFolders.serializer().descriptor.serialName -> currentBackStackEntry?.toRoute<CheatsNavigation.GameFolders>()?.gameName
                CheatsNavigation.FolderCheats.serializer().descriptor.serialName -> currentBackStackEntry?.toRoute<CheatsNavigation.FolderCheats>()?.folderName
                CheatsNavigation.EnabledCheats.serializer().descriptor.serialName -> enabledCheatsTitle
                else -> null
            }
        }
    }
    val resources = LocalResources.current
    val snackbarHostState = remember { SnackbarHostState() }
    val scaffoldState = rememberScaffoldState(snackbarHostState = snackbarHostState)
    val coroutineScope = rememberCoroutineScope()
    val navigateBack = {
        if (navController.previousBackStackEntry == null) {
            // The first screen (the loading screen) is not considered as an entry. So, previousBackStackEntry will be null
            viewModel.commitCheatChanges()
        } else {
            navController.navigateUp()
        }
    }

    LaunchedEffect(Unit) {
        viewModel.openGamesEvent.collect {
            navController.navigate(CheatsNavigation.GameList)
        }
    }
    LaunchedEffect(Unit) {
        viewModel.openFoldersEvent.collect {
            navController.navigate(CheatsNavigation.GameFolders(it.newTitle))
        }
    }
    LaunchedEffect(Unit) {
        viewModel.openCheatsEvent.collect {
            navController.navigate(CheatsNavigation.FolderCheats(it.newTitle))
        }
    }
    LaunchedEffect(Unit) {
        viewModel.openEnabledCheatsEvent.collect {
            navController.navigate(CheatsNavigation.EnabledCheats)
        }
    }

    BackHandler {
        navigateBack()
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState,
        topBar = {
            val colors = me.magnum.melonds.ui.theme.watermelon
            androidx.compose.foundation.layout.Column(
                Modifier.background(colors.bg).statusBarsPadding(),
            ) {
                androidx.compose.foundation.layout.Row(
                    verticalAlignment = androidx.compose.ui.Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, top = 16.dp, bottom = 10.dp),
                ) {
                    Icon(
                        painter = androidx.compose.ui.res.painterResource(R.drawable.ic_cheat),
                        contentDescription = null,
                        tint = colors.green,
                        modifier = Modifier.size(22.dp),
                    )
                    androidx.compose.foundation.layout.Spacer(androidx.compose.ui.Modifier.width(10.dp))
                    Text(
                        text = appBarTitle ?: stringResource(R.string.cheats),
                        color = colors.text,
                        fontFamily = me.magnum.melonds.ui.theme.SpaceGrotesk,
                        fontSize = 16.sp,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f),
                    )
                    if (showEnabledCheatsButton) {
                        Box(
                            modifier = Modifier
                                .size(38.dp)
                                .clip(androidx.compose.foundation.shape.CircleShape)
                                .background(colors.surface2)
                                .border(1.dp, colors.line, androidx.compose.foundation.shape.CircleShape)
                                .clickable { viewModel.openEnabledCheats() },
                            contentAlignment = androidx.compose.ui.Alignment.Center,
                        ) {
                            Icon(
                                painter = rememberVectorPainter(Icons.Outlined.CheckBox),
                                contentDescription = stringResource(R.string.enabled_cheats),
                                tint = colors.text,
                                modifier = Modifier.size(20.dp),
                            )
                        }
                    }
                }
                Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
            }
        },
        bottomBar = {
            val colors = me.magnum.melonds.ui.theme.watermelon
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(colors.bg)
                    .navigationBarsPadding()
                    .padding(bottom = 16.dp, top = 4.dp),
                contentAlignment = androidx.compose.ui.Alignment.Center,
            ) {
                me.magnum.melonds.ui.common.UnifiedBackButton(
                    onClick = { navigateBack() },
                )
            }
        },
        backgroundColor = me.magnum.melonds.ui.theme.watermelon.bg,
        contentWindowInsets = WindowInsets.safeDrawing,
    ) { padding ->
        NavHost(
            navController = navController,
            startDestination = initialScreen,
            enterTransition = { slideInHorizontally { it } },
            exitTransition = { slideOutHorizontally { -it } },
            popEnterTransition = { slideInHorizontally { -it } },
            popExitTransition = { slideOutHorizontally { it } },
        ) {
            composable<CheatsNavigation.GameList> {
                val games by viewModel.games.collectAsStateWithLifecycle(CheatsScreenUiState.Loading())

                GameListScreen(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = padding,
                    games = games,
                    onGameClick = { viewModel.setSelectedGame(it) },
                )
            }
            composable<CheatsNavigation.GameFolders> {
                val folders by viewModel.folders.collectAsStateWithLifecycle(CheatsScreenUiState.Loading())

                FolderListScreen(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = padding,
                    folders = folders,
                    onFolderClick = { viewModel.setSelectedFolder(it) },
                    onAddFolder = { viewModel.addFolder(it) },
                )
            }
            composable<CheatsNavigation.FolderCheats> {
                val cheats by viewModel.folderCheats.collectAsStateWithLifecycle(CheatsScreenUiState.Loading())

                CheatListScreen(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = padding,
                    cheats = cheats,
                    onCheatClick = { viewModel.toggleCheat(it) },
                    onAddNewCheat = viewModel::addNewCheat,
                    onUpdateCheat = viewModel::updateCheat,
                    onDeleteCheatClick = {
                        coroutineScope.launch {
                            val result = snackbarHostState.showSnackbar(
                                message = resources.getString(R.string.cheat_deleted, it.name),
                                actionLabel = resources.getString(R.string.undo)
                            )
                            if (result == SnackbarResult.ActionPerformed) {
                                viewModel.undoCheatDeletion(it)
                            }
                        }
                        viewModel.deleteCheat(it)
                    },
                )
            }
            composable<CheatsNavigation.EnabledCheats> {
                val cheats by viewModel.selectedGameCheats.collectAsStateWithLifecycle(CheatsScreenUiState.Loading())

                EnabledCheatsListScreen(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = padding,
                    cheats = cheats,
                    onCheatClick = { viewModel.toggleCheat(it.cheat) }
                )
            }
        }
    }
}