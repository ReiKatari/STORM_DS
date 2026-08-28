package me.magnum.melonds.ui.backgrounds.ui

import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarDuration
import androidx.compose.material.SnackbarResult
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.documentfile.provider.DocumentFile
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.common.Permission
import me.magnum.melonds.common.contracts.FilePickerContract
import me.magnum.melonds.domain.model.Background
import me.magnum.melonds.extensions.nameWithoutExtension
import me.magnum.melonds.ui.backgrounds.BackgroundsViewModel
import me.magnum.melonds.ui.common.component.dialog.TextInputDialog
import me.magnum.melonds.ui.common.component.dialog.rememberTextInputDialogState
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.utils.BitmapRegionDecoderCompat
import java.util.UUID

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun BackgroundListScreen(
    viewModel: BackgroundsViewModel,
    sharedTransitionScope: SharedTransitionScope,
    animatedContentScope: AnimatedContentScope,
    onBackgroundSelected: (Background?) -> Unit,
    onPreviewBackgroundClick: (Background) -> Unit,
    onBackClick: () -> Unit,
) {
    val context = LocalContext.current
    val textInputDialogState = rememberTextInputDialogState()
    val backgrounds by viewModel.backgrounds.collectAsStateWithLifecycle()
    val selectedBackgroundId by viewModel.currentSelectedBackground.collectAsStateWithLifecycle()
    val colors = LocalWatermelonColors.current

    val addBackgroundLauncher = rememberLauncherForActivityResult(FilePickerContract(Permission.READ)) { uri ->
        uri?.let {
            if (!isBackgroundValid(context, uri)) {
                Toast.makeText(context, R.string.background_add_processing_failed, Toast.LENGTH_LONG).show()
                return@let
            }

            val documentName = DocumentFile.fromSingleUri(context, it)?.nameWithoutExtension ?: ""
            textInputDialogState.show(
                initialText = documentName,
                onConfirm = { backgroundName ->
                    val newBackground = Background(null, backgroundName, uri)
                    viewModel.addBackground(newBackground)
                }
            )
        }
    }

    val backgroundDeletedMessage = stringResource(R.string.background_deleted)
    val undoMessage = stringResource(R.string.undo)
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        backgroundColor = colors.bg,
        contentWindowInsets = WindowInsets.safeDrawing,
        topBar = {
            Column(
                modifier = Modifier
                    .background(colors.surface)
                    .statusBarsPadding()
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 10.dp),
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(colors.surface2)
                            .clickable(onClick = onBackClick),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = stringResource(R.string.navigate_back),
                            tint = colors.text,
                            modifier = Modifier.size(20.dp),
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = stringResource(R.string.backgrounds),
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                        )
                        Text(
                            text = "Выберите или добавьте фон для макета",
                            color = colors.text3,
                            fontFamily = WatermelonMono,
                            fontSize = 11.sp,
                            maxLines = 1,
                        )
                    }
                    Spacer(Modifier.width(8.dp))
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .background(colors.greenDim)
                            .border(1.dp, colors.green.copy(alpha = 0.5f), RoundedCornerShape(10.dp))
                            .clickable {
                                addBackgroundLauncher.launch(Pair(null, arrayOf("image/png", "image/jpeg")))
                            }
                            .padding(horizontal = 12.dp, vertical = 8.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                painter = painterResource(R.drawable.ic_add),
                                contentDescription = stringResource(R.string.action_backgrounds_new),
                                tint = colors.green,
                                modifier = Modifier.size(16.dp),
                            )
                            Spacer(Modifier.width(6.dp))
                            Text(
                                text = "Добавить",
                                color = colors.green,
                                fontFamily = SpaceGrotesk,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }
                }
                Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
            }
        },
        bottomBar = {
            Column(
                modifier = Modifier
                    .background(colors.surface)
                    .navigationBarsPadding()
            ) {
                Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(colors.surface2)
                            .border(1.2.dp, colors.line, RoundedCornerShape(12.dp))
                            .clickable(onClick = onBackClick),
                        contentAlignment = Alignment.Center,
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = null,
                                tint = colors.text,
                                modifier = Modifier.size(18.dp),
                            )
                            Spacer(Modifier.width(8.dp))
                            Text(
                                text = "Назад к макету",
                                color = colors.text,
                                fontFamily = SpaceGrotesk,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                        }
                    }
                }
            }
        },
    ) { padding ->
        if (backgrounds == null) {
            Loading(
                Modifier
                    .padding(padding)
                    .fillMaxSize()
            )
        } else {
            BackgroundList(
                modifier = Modifier.fillMaxSize(),
                contentPadding = padding,
                backgrounds = backgrounds.orEmpty(),
                selectedBackgroundId = selectedBackgroundId,
                sharedTransitionScope = sharedTransitionScope,
                animatedContentScope = animatedContentScope,
                onBackgroundClick = {
                    viewModel.selectBackground(it)
                    onBackgroundSelected(it)
                },
                onPreviewBackgroundClick = {
                    onPreviewBackgroundClick(it)
                },
                onDeleteBackgroundClick = {
                    viewModel.deleteBackground(it)
                    coroutineScope.launch {
                        val result = scaffoldState.snackbarHostState.showSnackbar(
                            message = backgroundDeletedMessage,
                            actionLabel = undoMessage,
                            duration = SnackbarDuration.Long,
                        )

                        if (result == SnackbarResult.ActionPerformed) {
                            viewModel.addBackground(it)
                        }
                    }
                },
            )
        }
    }

    TextInputDialog(
        title = stringResource(R.string.background_name),
        dialogState = textInputDialogState,
    )
}

@Composable
private fun Loading(modifier: Modifier) {
    val colors = LocalWatermelonColors.current
    Box(modifier) {
        CircularProgressIndicator(
            modifier = Modifier.align(Alignment.Center),
            color = colors.green,
        )
    }
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
private fun BackgroundList(
    modifier: Modifier,
    contentPadding: PaddingValues,
    backgrounds: List<Background?>,
    selectedBackgroundId: UUID?,
    sharedTransitionScope: SharedTransitionScope,
    animatedContentScope: AnimatedContentScope,
    onBackgroundClick: (Background?) -> Unit,
    onPreviewBackgroundClick: (Background) -> Unit,
    onDeleteBackgroundClick: (Background) -> Unit,
) {
    LazyVerticalGrid(
        modifier = modifier.consumeWindowInsets(contentPadding),
        columns = GridCells.Adaptive(minSize = 140.dp),
        contentPadding = PaddingValues(
            start = contentPadding.calculateStartPadding(LocalLayoutDirection.current) + 16.dp,
            top = contentPadding.calculateTopPadding() + 16.dp,
            end = contentPadding.calculateEndPadding(LocalLayoutDirection.current) + 16.dp,
            bottom = contentPadding.calculateBottomPadding() + 16.dp,
        ),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        items(backgrounds) {
            if (it == null) {
                NoneBackgroundItem(
                    isSelected = selectedBackgroundId == null,
                    onClick = { onBackgroundClick(null) },
                )
            } else {
                BackgroundItem(
                    background = it,
                    isSelected = selectedBackgroundId == it.id,
                    sharedTransitionScope = sharedTransitionScope,
                    animatedContentScope = animatedContentScope,
                    onClick = { onBackgroundClick(it) },
                    onPreviewClick = { onPreviewBackgroundClick(it) },
                    onDeleteClick = { onDeleteBackgroundClick(it) },
                )
            }
        }
    }
}

private fun isBackgroundValid(context: Context, backgroundUri: Uri): Boolean {
    return runCatching {
        context.contentResolver.openInputStream(backgroundUri)?.use {
            BitmapRegionDecoderCompat.newInstance(it)?.recycle()
        } ?: throw Exception("Failed to open stream")
    }.isSuccess
}