package me.magnum.melonds.ui.cheats.ui.item

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Folder
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.domain.model.Cheat
import me.magnum.melonds.domain.model.CheatInFolder
import me.magnum.melonds.ui.common.MelonPreviewSet
import me.magnum.melonds.ui.common.WatermelonSwitch
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon

@Composable
fun CheatInFolderItem(
    modifier: Modifier,
    cheatInFolder: CheatInFolder,
    onClick: () -> Unit,
) {
    val colors = watermelon
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val shape = RoundedCornerShape(13.dp)

    Row(
        modifier = modifier
            .clip(shape)
            .background(if (isFocused) colors.surface3 else colors.surface2)
            .let { if (isFocused) it.border(2.dp, colors.red, shape) else it }
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(start = 14.dp, end = 14.dp, top = 11.dp, bottom = 11.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(3.dp),
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    modifier = Modifier.size(13.dp),
                    imageVector = Icons.Filled.Folder,
                    contentDescription = null,
                    tint = colors.text3,
                )
                Text(
                    text = cheatInFolder.folderName,
                    color = colors.text3,
                    fontFamily = WatermelonMono,
                    fontSize = 9.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            Text(
                text = cheatInFolder.cheat.name,
                color = colors.text,
                fontSize = 13.5.sp,
                fontWeight = FontWeight.Medium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            if (cheatInFolder.cheat.description?.isNotBlank() == true) {
                Text(
                    text = cheatInFolder.cheat.description!!,
                    color = colors.text3,
                    fontSize = 11.5.sp,
                    lineHeight = 15.sp,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
        Spacer(Modifier.width(10.dp))
        WatermelonSwitch(
            checked = cheatInFolder.cheat.enabled,
            onCheckedChange = { onClick() },
        )
    }
}

@MelonPreviewSet
@Composable
private fun PreviewCheatInFolderItem() {
    MelonTheme {
        CheatInFolderItem(
            modifier = Modifier.fillMaxWidth(),
            cheatInFolder = CheatInFolder(
                cheat = Cheat(0, 0, "Some random cheat", "Press some buttons to activate this cheat. What does it do?", "", true),
                folderName = "Best cheats",
            ),
            onClick = { },
        )
    }
}
