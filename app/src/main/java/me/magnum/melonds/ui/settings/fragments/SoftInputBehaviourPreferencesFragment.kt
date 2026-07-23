package me.magnum.melonds.ui.settings.fragments

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.size
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.border
import androidx.compose.foundation.background
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalResources
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.unit.dp
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.preference.PreferenceManager
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.input.SoftInputBehaviour
import me.magnum.melonds.ui.common.MelonPreviewSet
import me.magnum.melonds.ui.common.component.text.CaptionText
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import me.magnum.melonds.ui.theme.MelonTheme

class SoftInputBehaviourPreferencesFragment : Fragment(), PreferenceFragmentTitleProvider {

    override fun getTitle() = getString(R.string.soft_input_behaviour)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return ComposeView(requireContext()).apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                MelonTheme {
                    SoftInputBehaviourPreferencesScreen()
                }
            }
        }
    }
}

@Composable
private fun SoftInputBehaviourPreferencesScreen() {
    val context = LocalContext.current
    val resources = LocalResources.current
    val behaviourValues = remember {
        resources.getStringArray(R.array.soft_input_behaviour)
    }
    val behaviourOptions = remember {
        resources.getStringArray(R.array.soft_input_behaviour_options)
    }
    val behaviourDescriptions = remember {
        resources.getStringArray(R.array.soft_input_behaviour_descriptions)
    }
    val sharedPreferences = remember {
        PreferenceManager.getDefaultSharedPreferences(context)
    }
    var softInputBehaviour by remember(sharedPreferences) {
        val initialPreference = sharedPreferences.getString("soft_input_behaviour", "hide_system_buttons_when_controller_connected")
        val initialBehaviour = SoftInputBehaviour.entries[behaviourValues.indexOf(initialPreference)]
        mutableStateOf(initialBehaviour)
    }

    val colors = me.magnum.melonds.ui.theme.watermelon
    Column(
        modifier = Modifier.fillMaxSize()
            .background(colors.bg)
            .verticalScroll(rememberScrollState())
            .selectableGroup()
            .safeDrawingPadding()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        SoftInputBehaviour.entries.forEachIndexed { index, behaviour ->
            SoftInputBehaviourEntry(
                modifier = Modifier.fillMaxWidth(),
                title = behaviourOptions[index],
                description = behaviourDescriptions[index],
                selected = softInputBehaviour == behaviour,
                onClick = {
                    softInputBehaviour = behaviour
                    sharedPreferences.edit {
                        putString("soft_input_behaviour", behaviourValues[index])
                    }
                }
            )
        }
    }
}

@Composable
private fun SoftInputBehaviourEntry(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    selected: Boolean,
    onClick: () -> Unit,
) {
    val colors = me.magnum.melonds.ui.theme.watermelon
    val interactionSource = remember { androidx.compose.foundation.interaction.MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val shape = androidx.compose.foundation.shape.RoundedCornerShape(13.dp)
    Row(
        modifier = modifier
            .clip(shape)
            .background(if (isFocused) colors.surface3 else colors.surface2)
            .let { if (isFocused) it.border(2.dp, colors.red, shape) else it }
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(horizontal = 14.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(3.dp),
        ) {
            Text(
                text = title,
                color = colors.text,
                fontSize = 13.5.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold,
            )
            Text(
                text = description,
                color = colors.text3,
                fontSize = 11.5.sp,
                lineHeight = 16.sp,
            )
        }
        if (selected) {
            androidx.compose.material.Icon(
                imageVector = androidx.compose.material.icons.Icons.Filled.Check,
                contentDescription = null,
                tint = colors.green,
                modifier = Modifier.padding(start = 12.dp).size(22.dp),
            )
        }
    }
}

@MelonPreviewSet
@Composable
private fun PreviewSoftInputBehaviourPreferencesScreen() {
    MelonTheme {
        SoftInputBehaviourPreferencesScreen()
    }
}