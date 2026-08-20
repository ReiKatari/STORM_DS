package me.magnum.melonds.ui.romlist.composables

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import me.magnum.melonds.R
import me.magnum.melonds.ui.theme.watermelon

enum class DecryptionState {
    CONFIRM, DECRYPTING, SUCCESS, ERROR
}

@Composable
fun DecryptionDialog(
    show: Boolean,
    onDismiss: () -> Unit,
    onDecrypt: () -> Unit,
    state: DecryptionState,
    progress: Float,
) {
    if (!show) return

    Dialog(
        onDismissRequest = {
            if (state != DecryptionState.DECRYPTING) {
                onDismiss()
            }
        },
        properties = DialogProperties(
            dismissOnBackPress = state != DecryptionState.DECRYPTING,
            dismissOnClickOutside = state != DecryptionState.DECRYPTING
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .background(watermelon.surface2)
                .padding(24.dp)
        ) {
            AnimatedContent(targetState = state, label = "DecryptionState") { targetState ->
                when (targetState) {
                    DecryptionState.CONFIRM -> {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = "🔒",
                                fontSize = 48.sp,
                                modifier = Modifier.padding(bottom = 16.dp)
                            )
                            Text(
                                text = stringResource(R.string.decrypt_rom_title),
                                color = watermelon.text,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(bottom = 8.dp)
                            )
                            Text(
                                text = stringResource(R.string.decrypt_rom_description),
                                color = watermelon.text2,
                                fontSize = 14.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.padding(bottom = 24.dp)
                            )
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.End
                            ) {
                                TextButton(onClick = onDismiss) {
                                    Text(stringResource(R.string.cancel), color = watermelon.text2)
                                }
                                Spacer(modifier = Modifier.width(8.dp))
                                TextButton(onClick = onDecrypt) {
                                    Text(stringResource(R.string.decrypt_rom_button), color = watermelon.green)
                                }
                            }
                        }
                    }
                    DecryptionState.DECRYPTING -> {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = stringResource(R.string.decrypt_rom_progress),
                                color = watermelon.text,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(bottom = 16.dp)
                            )
                            LinearProgressIndicator(
                                progress = progress,
                                color = watermelon.green,
                                backgroundColor = watermelon.surface3,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(8.dp)
                                    .clip(RoundedCornerShape(4.dp))
                            )
                            Text(
                                text = "${(progress * 100).toInt()}%",
                                color = watermelon.text2,
                                fontSize = 14.sp,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                    DecryptionState.SUCCESS -> {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = "🔓",
                                fontSize = 48.sp,
                                modifier = Modifier.padding(bottom = 16.dp)
                            )
                            Text(
                                text = stringResource(R.string.decrypt_rom_success),
                                color = watermelon.text,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.padding(bottom = 24.dp)
                            )
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.End
                            ) {
                                TextButton(onClick = onDismiss) {
                                    Text(stringResource(R.string.ok), color = watermelon.green)
                                }
                            }
                        }
                    }
                    DecryptionState.ERROR -> {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = "❌",
                                fontSize = 48.sp,
                                modifier = Modifier.padding(bottom = 16.dp)
                            )
                            Text(
                                text = stringResource(R.string.decrypt_rom_error),
                                color = watermelon.red,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.padding(bottom = 24.dp)
                            )
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.End
                            ) {
                                TextButton(onClick = onDismiss) {
                                    Text(stringResource(R.string.ok), color = watermelon.text2)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
