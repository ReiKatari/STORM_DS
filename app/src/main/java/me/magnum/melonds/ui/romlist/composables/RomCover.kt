package me.magnum.melonds.ui.romlist.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import coil.request.ImageRequest
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.rom.Rom

@Composable
fun RomCover(
    rom: Rom,
    coverUrl: String?,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Crop,
) {
    val context = LocalContext.current
    val placeholderModifier = modifier.background(MaterialTheme.colors.surface)
    var raFailed by remember(rom.uri, coverUrl) { mutableStateOf(false) }

    Box(modifier = placeholderModifier, contentAlignment = Alignment.Center) {
        if (coverUrl != null && !raFailed) {
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(coverUrl)
                    .crossfade(true)
                    .listener(onError = { _, _ -> raFailed = true })
                    .build(),
                contentDescription = rom.name,
                contentScale = contentScale,
                modifier = Modifier.fillMaxSize(),
            )
        } else {
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(rom)
                    .crossfade(true)
                    .build(),
                contentDescription = rom.name,
                contentScale = contentScale,
                filterQuality = FilterQuality.None,
                modifier = Modifier.fillMaxSize(),
                placeholder = painterResource(R.drawable.ic_file),
                error = painterResource(R.drawable.ic_file),
            )
        }
    }
}
