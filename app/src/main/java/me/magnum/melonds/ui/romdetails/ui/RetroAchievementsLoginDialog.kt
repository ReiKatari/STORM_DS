package me.magnum.melonds.ui.romdetails.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.autofill.ContentType
import androidx.compose.ui.autofill.contentType
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import me.magnum.melonds.R
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.SpaceGrotesk

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun RetroAchievementsLoginDialog(
    existingUsername: String?,
    onDismiss: () -> Unit,
    onLogin: (username: String, password: String) -> Unit,
) {
    val colors = LocalWatermelonColors.current
    var username by rememberSaveable {
        mutableStateOf(existingUsername.orEmpty())
    }
    var password by remember {
        mutableStateOf("")
    }
    var passwordVisible by remember {
        mutableStateOf(false)
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false),
    ) {
        Box(
            modifier = Modifier
                .widthIn(max = 460.dp)
                .fillMaxWidth(0.90f)
                .clip(RoundedCornerShape(20.dp))
                .background(colors.surface)
                .border(1.2.dp, colors.line, RoundedCornerShape(20.dp)),
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                // Themed Header
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 18.dp, end = 18.dp, top = 16.dp, bottom = 14.dp),
                ) {
                    Box(
                        modifier = Modifier
                            .size(38.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(colors.surface2)
                            .border(1.dp, colors.line, RoundedCornerShape(10.dp)),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = Icons.Filled.EmojiEvents,
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(21.dp),
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = stringResource(id = R.string.login_with_retro_achievements),
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis,
                        )
                        Text(
                            text = stringResource(id = R.string.retroachievements_login_summary),
                            color = colors.text2,
                            fontFamily = SpaceGrotesk,
                            fontSize = 11.5.sp,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }

                // Divider
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(colors.line)
                )

                // Body Inputs
                Column(
                    modifier = Modifier.padding(horizontal = 18.dp, vertical = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                ) {
                    // Username Input
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        Text(
                            text = stringResource(id = R.string.username),
                            color = colors.text2,
                            fontFamily = SpaceGrotesk,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(12.dp))
                                .background(colors.surface2)
                                .border(
                                    width = 1.2.dp,
                                    color = if (username.isNotEmpty()) colors.green.copy(alpha = 0.65f) else colors.line,
                                    shape = RoundedCornerShape(12.dp),
                                )
                                .padding(horizontal = 14.dp, vertical = 13.dp),
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Person,
                                contentDescription = null,
                                tint = colors.green,
                                modifier = Modifier.size(19.dp),
                            )
                            Spacer(Modifier.width(10.dp))
                            Box(modifier = Modifier.weight(1f)) {
                                if (username.isEmpty()) {
                                    Text(
                                        text = stringResource(id = R.string.username),
                                        color = colors.text3,
                                        fontFamily = SpaceGrotesk,
                                        fontSize = 14.5.sp,
                                    )
                                }
                                BasicTextField(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .contentType(ContentType.Username),
                                    value = username,
                                    onValueChange = { username = it },
                                    textStyle = TextStyle(
                                        color = colors.text,
                                        fontFamily = SpaceGrotesk,
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.Medium,
                                    ),
                                    cursorBrush = SolidColor(colors.green),
                                    singleLine = true,
                                )
                            }
                        }
                    }

                    // Password Input
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        Text(
                            text = stringResource(id = R.string.password),
                            color = colors.text2,
                            fontFamily = SpaceGrotesk,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(12.dp))
                                .background(colors.surface2)
                                .border(
                                    width = 1.2.dp,
                                    color = if (password.isNotEmpty()) colors.green.copy(alpha = 0.65f) else colors.line,
                                    shape = RoundedCornerShape(12.dp),
                                )
                                .padding(horizontal = 14.dp, vertical = 13.dp),
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Lock,
                                contentDescription = null,
                                tint = colors.green,
                                modifier = Modifier.size(19.dp),
                            )
                            Spacer(Modifier.width(10.dp))
                            Box(modifier = Modifier.weight(1f)) {
                                if (password.isEmpty()) {
                                    Text(
                                        text = stringResource(id = R.string.password),
                                        color = colors.text3,
                                        fontFamily = SpaceGrotesk,
                                        fontSize = 14.5.sp,
                                    )
                                }
                                BasicTextField(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .contentType(ContentType.Password),
                                    value = password,
                                    onValueChange = { password = it },
                                    textStyle = TextStyle(
                                        color = colors.text,
                                        fontFamily = SpaceGrotesk,
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.Medium,
                                    ),
                                    cursorBrush = SolidColor(colors.green),
                                    singleLine = true,
                                    visualTransformation = if (passwordVisible) {
                                        VisualTransformation.None
                                    } else {
                                        PasswordVisualTransformation()
                                    },
                                    keyboardOptions = KeyboardOptions(
                                        autoCorrectEnabled = false,
                                        keyboardType = KeyboardType.Password,
                                    ),
                                )
                            }
                            Spacer(Modifier.width(8.dp))
                            Icon(
                                imageVector = if (passwordVisible) Icons.Filled.VisibilityOff else Icons.Filled.Visibility,
                                contentDescription = null,
                                tint = colors.text3,
                                modifier = Modifier
                                    .size(20.dp)
                                    .clickable { passwordVisible = !passwordVisible },
                            )
                        }
                    }

                    Spacer(Modifier.height(4.dp))

                    // Action Buttons Row
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                    ) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .background(colors.surface2)
                                .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                                .clickable { onDismiss() }
                                .padding(vertical = 12.dp),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = stringResource(id = R.string.cancel),
                                color = colors.text2,
                                fontFamily = SpaceGrotesk,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .background(colors.green)
                                .clickable {
                                    onLogin(username.trim(), password)
                                }
                                .padding(vertical = 12.dp),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = stringResource(id = R.string.login),
                                color = colors.bg,
                                fontFamily = SpaceGrotesk,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }
                }
            }
        }
    }
}