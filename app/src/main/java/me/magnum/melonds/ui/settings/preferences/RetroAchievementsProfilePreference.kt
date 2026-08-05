package me.magnum.melonds.ui.settings.preferences

import android.content.Context
import android.util.AttributeSet
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.preference.Preference
import androidx.preference.PreferenceViewHolder
import coil.compose.AsyncImage
import coil.request.ImageRequest
import me.magnum.melonds.R
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.Manrope
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonColors
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import me.magnum.rcheevosapi.model.RAUserProfile
import java.text.NumberFormat

class RetroAchievementsProfilePreference(context: Context, attrs: AttributeSet?) : Preference(context, attrs) {

    private var displayedProfile by mutableStateOf<RAUserProfile?>(null)

    init {
        layoutResource = R.layout.preference_retroachievements_profile
        isSelectable = false
        isVisible = false
    }

    fun setProfile(profile: RAUserProfile?) {
        displayedProfile = profile
        isVisible = profile != null
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)
        val composeView = holder.itemView as? ComposeView ?: return
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
        composeView.setContent {
            MelonTheme {
                displayedProfile?.let {
                    RetroAchievementsProfileCard(it)
                }
            }
        }
    }
}

@Composable
private fun RetroAchievementsProfileCard(profile: RAUserProfile) {
    val colors = watermelon
    val shape = RoundedCornerShape(15.dp)
    val numberFormat = NumberFormat.getIntegerInstance()

    Box(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clip(shape)
            .background(colors.surface2)
            .border(1.dp, WatermelonColors.gold.copy(alpha = 0.35f), shape),
    ) {
        Row(Modifier.padding(14.dp), verticalAlignment = Alignment.CenterVertically) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data("https://media.retroachievements.org/UserPic/${profile.username}.png")
                    .crossfade(true)
                    .build(),
                contentDescription = null,
                modifier = Modifier
                    .size(46.dp)
                    .clip(CircleShape)
                    .background(WatermelonColors.gold.copy(alpha = 0.18f)),
            )

            Column(Modifier.padding(start = 13.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        Icons.Filled.EmojiEvents,
                        null,
                        tint = WatermelonColors.gold,
                        modifier = Modifier.size(12.dp),
                    )
                    Text(
                        text = stringResource(R.string.ra_welcome_eyebrow),
                        color = WatermelonColors.gold,
                        fontFamily = WatermelonMono,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.8.sp,
                        modifier = Modifier.padding(start = 5.dp),
                    )
                }
                Text(
                    text = profile.username,
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(top = 2.dp),
                )
                Row(Modifier.padding(top = 6.dp), verticalAlignment = Alignment.CenterVertically) {
                    ScorePill(
                        text = stringResource(
                            R.string.ra_profile_hardcore_points,
                            numberFormat.format(profile.score),
                        ),
                        accent = WatermelonColors.gold,
                    )
                    Box(Modifier.padding(start = 6.dp)) {
                        ScorePill(
                            text = stringResource(
                                R.string.ra_profile_casual_points,
                                numberFormat.format(profile.softcoreScore),
                            ),
                            accent = colors.green,
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun ScorePill(text: String, accent: Color) {
    Text(
        text = text,
        color = accent,
        fontFamily = Manrope,
        fontSize = 10.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.4.sp,
        modifier = Modifier
            .clip(RoundedCornerShape(6.dp))
            .background(accent.copy(alpha = 0.14f))
            .padding(horizontal = 7.dp, vertical = 3.dp),
    )
}
