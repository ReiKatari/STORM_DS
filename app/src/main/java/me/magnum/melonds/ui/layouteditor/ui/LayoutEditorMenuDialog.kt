package me.magnum.melonds.ui.layouteditor.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import me.magnum.melonds.R
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.MenuOption
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono

private data class LayoutMenuItem(
    val option: MenuOption,
    val stringRes: Int,
    val icon: ImageVector,
)

@Composable
fun LayoutEditorMenuDialog(
    onDismiss: () -> Unit,
    onOptionSelected: (MenuOption) -> Unit,
) {
    val colors = LocalWatermelonColors.current

    val menuItems = listOf(
        LayoutMenuItem(MenuOption.PROPERTIES, R.string.properties, Icons.Filled.Settings),
        LayoutMenuItem(MenuOption.BACKGROUNDS, R.string.background, Icons.Filled.Image),
        LayoutMenuItem(MenuOption.REVERT, R.string.revert_changes, Icons.Filled.Undo),
        LayoutMenuItem(MenuOption.RESET, R.string.reset_default, Icons.Filled.Refresh),
        LayoutMenuItem(MenuOption.SAVE_AS_NEW, R.string.save_as_new, Icons.Filled.Add),
        LayoutMenuItem(MenuOption.SAVE_AND_EXIT, R.string.save_and_exit, Icons.Filled.Check),
        LayoutMenuItem(MenuOption.EXIT_WITHOUT_SAVING, R.string.exit_without_saving, Icons.Filled.Close),
    )

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(colors.surface.copy(alpha = 0.65f))
                .clickable(onClick = onDismiss),
            contentAlignment = Alignment.Center,
        ) {
            Box(
                modifier = Modifier
                    .widthIn(max = 440.dp)
                    .fillMaxWidth(0.92f)
                    .clip(RoundedCornerShape(20.dp))
                    .background(colors.surface)
                    .border(1.2.dp, colors.line, RoundedCornerShape(20.dp))
                    .clickable(enabled = false) {}
                    .padding(20.dp),
            ) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    // Header
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Dashboard,
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(24.dp),
                        )
                        Spacer(Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = stringResource(R.string.menu),
                                color = colors.text,
                                fontFamily = SpaceGrotesk,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                            )
                            Text(
                                text = "Параметры и действия с макетом",
                                color = colors.text3,
                                fontFamily = WatermelonMono,
                                fontSize = 11.sp,
                            )
                        }
                        Box(
                            modifier = Modifier
                                .size(32.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(colors.surface2)
                                .clickable(onClick = onDismiss),
                            contentAlignment = Alignment.Center,
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Close,
                                contentDescription = stringResource(R.string.cancel),
                                tint = colors.text2,
                                modifier = Modifier.size(18.dp),
                            )
                        }
                    }

                    Spacer(Modifier.height(14.dp))
                    Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
                    Spacer(Modifier.height(10.dp))

                    // Menu Options
                    LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        items(menuItems) { item ->
                            val isDestructive = item.option == MenuOption.EXIT_WITHOUT_SAVING || item.option == MenuOption.RESET
                            val isPrimary = item.option == MenuOption.SAVE_AND_EXIT || item.option == MenuOption.SAVE_AS_NEW
                            val tintColor = when {
                                isDestructive -> colors.red
                                isPrimary -> colors.green
                                else -> colors.text
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(if (isPrimary) colors.green.copy(alpha = 0.10f) else colors.surface2)
                                    .border(
                                        1.dp,
                                        if (isPrimary) colors.green.copy(alpha = 0.4f) else colors.line,
                                        RoundedCornerShape(12.dp)
                                    )
                                    .clickable {
                                        onOptionSelected(item.option)
                                    }
                                    .padding(horizontal = 14.dp, vertical = 12.dp),
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.fillMaxWidth(),
                                ) {
                                    Icon(
                                        imageVector = item.icon,
                                        contentDescription = null,
                                        tint = tintColor,
                                        modifier = Modifier.size(20.dp),
                                    )
                                    Spacer(Modifier.width(12.dp))
                                    Text(
                                        text = stringResource(item.stringRes),
                                        color = tintColor,
                                        fontFamily = SpaceGrotesk,
                                        fontSize = 14.5.sp,
                                        fontWeight = if (isPrimary) FontWeight.Bold else FontWeight.Medium,
                                        modifier = Modifier.weight(1f),
                                    )
                                    Icon(
                                        imageVector = Icons.Filled.ChevronRight,
                                        contentDescription = null,
                                        tint = colors.text3,
                                        modifier = Modifier.size(18.dp),
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
