package me.magnum.melonds.ui.dsiwaremanager.ui

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.createBitmap
import androidx.core.graphics.set
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.DSiWareTitle
import me.magnum.melonds.domain.model.RomIconFiltering
import me.magnum.melonds.domain.model.dsinand.DSiWareTitleFileType
import me.magnum.melonds.ui.dsiwaremanager.model.DSiWareItemDropdownMenu
import me.magnum.melonds.ui.romlist.RomIcon
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon

@Composable
fun DSiWareItem(
    modifier: Modifier,
    item: DSiWareTitle,
    onDeleteClicked: () -> Unit,
    onImportFile: (DSiWareTitleFileType) -> Unit,
    onExportFile: (DSiWareTitleFileType) -> Unit,
    retrieveTitleIcon: () -> RomIcon,
) {
    val colors = watermelon
    var dropdownMenu by remember(item) {
        mutableStateOf(DSiWareItemDropdownMenu.NONE)
    }

    Row(
        modifier = modifier
            .padding(horizontal = 12.dp, vertical = 4.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(colors.surface)
            .border(1.dp, colors.line, RoundedCornerShape(10.dp))
            .padding(start = 10.dp, end = 6.dp, top = 9.dp, bottom = 9.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        val icon = remember(item.titleId) {
            retrieveTitleIcon()
        }
        Box(
            modifier = Modifier
                .size(46.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(colors.surface2),
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                bitmap = icon.bitmap?.asImageBitmap() ?: ImageBitmap(1, 1),
                contentDescription = null,
                filterQuality = when (icon.filtering) {
                    RomIconFiltering.NONE -> FilterQuality.None
                    RomIconFiltering.LINEAR -> DrawScope.DefaultFilterQuality
                },
            )
        }
        Spacer(Modifier.width(12.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = item.name,
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 15.sp,
                lineHeight = 19.sp,
                fontWeight = FontWeight.SemiBold,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
            )
            Text(
                text = item.producer,
                color = colors.text3,
                fontFamily = WatermelonMono,
                fontSize = 11.sp,
                lineHeight = 14.sp,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
            )
        }
        Box(
            modifier = Modifier
                .size(38.dp)
                .clip(CircleShape)
                .clickable { dropdownMenu = DSiWareItemDropdownMenu.MAIN },
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                modifier = Modifier.size(22.dp),
                painter = painterResource(id = R.drawable.ic_menu),
                contentDescription = stringResource(id = R.string.delete),
                tint = colors.text3,
            )
        }
    }

    ItemActionsDialog(
        item = item,
        menu = dropdownMenu,
        onOpenMenu = { dropdownMenu = it },
        onDeleteItem = {
            dropdownMenu = DSiWareItemDropdownMenu.NONE
            onDeleteClicked()
        },
        onImportFile = {
            dropdownMenu = DSiWareItemDropdownMenu.NONE
            onImportFile(it)
        },
        onExportFile = {
            dropdownMenu = DSiWareItemDropdownMenu.NONE
            onExportFile(it)
        },
    )
}

@Composable
private fun ItemActionsDialog(
    item: DSiWareTitle,
    menu: DSiWareItemDropdownMenu,
    onOpenMenu: (DSiWareItemDropdownMenu) -> Unit,
    onDeleteItem: () -> Unit,
    onImportFile: (DSiWareTitleFileType) -> Unit,
    onExportFile: (DSiWareTitleFileType) -> Unit,
) {
    when (menu) {
        DSiWareItemDropdownMenu.NONE -> { /* no-op */ }
        DSiWareItemDropdownMenu.MAIN -> {
            ConsoleActionDialog(
                title = item.name,
                onDismiss = { onOpenMenu(DSiWareItemDropdownMenu.NONE) },
            ) {
                ConsoleActionRow(
                    label = stringResource(id = R.string.dsiware_manager_import_data),
                    onClick = { onOpenMenu(DSiWareItemDropdownMenu.IMPORT) },
                )
                ConsoleActionRow(
                    label = stringResource(id = R.string.dsiware_manager_export_data),
                    onClick = { onOpenMenu(DSiWareItemDropdownMenu.EXPORT) },
                )
                ConsoleActionRow(
                    label = stringResource(id = R.string.delete),
                    destructive = true,
                    onClick = onDeleteItem,
                )
            }
        }
        DSiWareItemDropdownMenu.IMPORT -> {
            ConsoleActionDialog(
                title = stringResource(id = R.string.dsiware_manager_import_data),
                onDismiss = { onOpenMenu(DSiWareItemDropdownMenu.NONE) },
            ) {
                FileTypeRow(DSiWareTitleFileType.PUBLIC_SAV, item.hasPublicSavFile()) { onImportFile(DSiWareTitleFileType.PUBLIC_SAV) }
                FileTypeRow(DSiWareTitleFileType.PRIVATE_SAV, item.hasPrivateSavFile()) { onImportFile(DSiWareTitleFileType.PRIVATE_SAV) }
                FileTypeRow(DSiWareTitleFileType.BANNER_SAV, item.hasBannerSavFile()) { onImportFile(DSiWareTitleFileType.BANNER_SAV) }
            }
        }
        DSiWareItemDropdownMenu.EXPORT -> {
            ConsoleActionDialog(
                title = stringResource(id = R.string.dsiware_manager_export_data),
                onDismiss = { onOpenMenu(DSiWareItemDropdownMenu.NONE) },
            ) {
                FileTypeRow(DSiWareTitleFileType.PUBLIC_SAV, item.hasPublicSavFile()) { onExportFile(DSiWareTitleFileType.PUBLIC_SAV) }
                FileTypeRow(DSiWareTitleFileType.PRIVATE_SAV, item.hasPrivateSavFile()) { onExportFile(DSiWareTitleFileType.PRIVATE_SAV) }
                FileTypeRow(DSiWareTitleFileType.BANNER_SAV, item.hasBannerSavFile()) { onExportFile(DSiWareTitleFileType.BANNER_SAV) }
            }
        }
    }
}

@Composable
private fun FileTypeRow(fileType: DSiWareTitleFileType, enabled: Boolean, onClick: () -> Unit) {
    ConsoleActionRow(
        label = fileType.fileName,
        enabled = enabled,
        onClick = onClick,
    )
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun PreviewDSiWareItem() {
    val bitmap = createBitmap(1, 1).apply { this[0, 0] = 0xFF777777.toInt() }

    MelonTheme {
        DSiWareItem(
            modifier = Modifier.fillMaxWidth(),
            item = DSiWareTitle("Highway 4: Mediocre Racing", "Playpark", 0, ByteArray(0), 0, 0, 0),
            onDeleteClicked = { },
            onImportFile = { },
            onExportFile = { },
            retrieveTitleIcon = { RomIcon(bitmap, RomIconFiltering.NONE) },
        )
    }
}
