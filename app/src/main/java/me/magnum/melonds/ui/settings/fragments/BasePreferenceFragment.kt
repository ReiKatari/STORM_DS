package me.magnum.melonds.ui.settings.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceGroupAdapter
import androidx.preference.TwoStatePreference
import androidx.recyclerview.widget.RecyclerView
import me.magnum.melonds.ui.settings.dialogs.SettingsChoiceDialogContent
import me.magnum.melonds.ui.settings.dialogs.SettingsEditTextDialogContent
import me.magnum.melonds.ui.settings.dialogs.SettingsMultiChoiceDialogContent
import me.magnum.melonds.ui.settings.dialogs.SettingsSeekBarDialogContent
import me.magnum.melonds.ui.settings.dialogs.showSettingsComposeDialog

abstract class BasePreferenceFragment : PreferenceFragmentCompat() {

    protected fun hideDependentsWhenInactive(
        switchKey: String,
        vararg dependentKeys: String,
        showWhenChecked: Boolean = true,
    ) {
        val switch = findPreference<TwoStatePreference>(switchKey) ?: return
        fun apply(checked: Boolean) {
            val visible = checked == showWhenChecked
            dependentKeys.forEach { key -> findPreference<Preference>(key)?.isVisible = visible }
        }
        apply(switch.isChecked)
        val existing = switch.onPreferenceChangeListener
        switch.onPreferenceChangeListener = Preference.OnPreferenceChangeListener { pref, newValue ->
            val allowed = existing?.onPreferenceChange(pref, newValue) ?: true
            if (allowed && newValue is Boolean) {
                apply(newValue)
            }
            allowed
        }
    }

    private var lastActivatedKey: String? = null

    override fun onCreateRecyclerView(inflater: LayoutInflater, parent: ViewGroup, savedInstanceState: Bundle?): RecyclerView {
        return super.onCreateRecyclerView(inflater, parent, savedInstanceState).apply {
            clipToPadding = false

            ViewCompat.setOnApplyWindowInsetsListener(this) { view, windowInsets ->
                val insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout())
                view.updatePadding(bottom = insets.bottom)

                WindowInsetsCompat.CONSUMED
            }

            val recyclerView = this
            addOnChildAttachStateChangeListener(object : RecyclerView.OnChildAttachStateChangeListener {
                override fun onChildViewAttachedToWindow(view: View) {
                    view.post {
                        val color = me.magnum.melonds.ui.theme.AppThemeManager.getAccentColor()
                        val states = arrayOf(
                            intArrayOf(-android.R.attr.state_checked),
                            intArrayOf(android.R.attr.state_checked),
                        )
                        val thumbColors = intArrayOf(0xFF888888.toInt(), color)
                        val trackColors = intArrayOf(0x44888888.toInt(), (color and 0x00FFFFFF) or 0x66000000.toInt())
                        tintChildControls(view, android.content.res.ColorStateList(states, thumbColors), android.content.res.ColorStateList(states, trackColors), color)
                    }
                    view.setOnFocusChangeListener { v, hasFocus ->
                        if (hasFocus) {
                            val pos = recyclerView.getChildAdapterPosition(v)
                            val adapter = recyclerView.adapter as? PreferenceGroupAdapter
                            if (pos != RecyclerView.NO_POSITION && adapter != null) {
                                (adapter.getItem(pos) as? Preference)?.let { pref ->
                                    (activity as? me.magnum.melonds.ui.settings.SettingsActivity)?.onPreferenceFocused(pref)
                                }
                            }
                        }
                    }
                }

                override fun onChildViewDetachedFromWindow(view: View) {
                    view.onFocusChangeListener = null
                }
            })
        }
    }

    override fun onPreferenceTreeClick(preference: Preference): Boolean {
        lastActivatedKey = preference.key
        return super.onPreferenceTreeClick(preference)
    }

    private val accentListener: (String) -> Unit = {
        view?.post { applyAccentColorToViews() }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.post { applyAccentColorToViews() }
    }

    override fun onResume() {
        super.onResume()
        me.magnum.melonds.ui.theme.AppThemeManager.addAccentChangeListener(accentListener)
        view?.post { applyAccentColorToViews() }
        val key = lastActivatedKey ?: return
        val recyclerView = listView ?: return
        recyclerView.post { restoreFocusToPreference(recyclerView, key) }
    }

    override fun onPause() {
        super.onPause()
        me.magnum.melonds.ui.theme.AppThemeManager.removeAccentChangeListener(accentListener)
    }

    protected fun applyAccentColorToViews() {
        val color = me.magnum.melonds.ui.theme.AppThemeManager.getAccentColor()
        val states = arrayOf(
            intArrayOf(-android.R.attr.state_checked),
            intArrayOf(android.R.attr.state_checked),
        )
        val thumbColors = intArrayOf(
            0xFF888888.toInt(),
            color,
        )
        val trackColors = intArrayOf(
            0x44888888.toInt(),
            (color and 0x00FFFFFF) or 0x66000000.toInt(),
        )
        val thumbColorStateList = android.content.res.ColorStateList(states, thumbColors)
        val trackColorStateList = android.content.res.ColorStateList(states, trackColors)

        val rv = listView ?: return
        rv.post {
            for (i in 0 until rv.childCount) {
                val child = rv.getChildAt(i)
                tintChildControls(child, thumbColorStateList, trackColorStateList, color)
            }
        }
    }

    private fun tintChildControls(
        view: View,
        thumb: android.content.res.ColorStateList,
        track: android.content.res.ColorStateList,
        accent: Int,
    ) {
        if (view is androidx.appcompat.widget.SwitchCompat) {
            view.thumbTintList = thumb
            view.trackTintList = track
        } else if (view is android.widget.Switch) {
            view.thumbTintList = thumb
            view.trackTintList = track
        } else if (view is android.widget.CompoundButton) {
            view.buttonTintList = thumb
        } else if (view is android.widget.SeekBar) {
            view.thumbTintList = android.content.res.ColorStateList.valueOf(accent)
            view.progressTintList = android.content.res.ColorStateList.valueOf(accent)
        } else if (view is android.widget.ImageView) {
            val id = view.id
            if (id == android.R.id.icon || id == me.magnum.melonds.R.id.buttonResetDefault || view.tag == "tint_accent") {
                androidx.core.widget.ImageViewCompat.setImageTintList(view, android.content.res.ColorStateList.valueOf(accent))
            }
        }
        if (view is ViewGroup) {
            for (i in 0 until view.childCount) {
                tintChildControls(view.getChildAt(i), thumb, track, accent)
            }
        }
    }

    override fun onDisplayPreferenceDialog(preference: Preference) {
        when (preference) {
            is androidx.preference.ListPreference -> {
                showStyledListPreferenceDialog(preference)
            }
            is androidx.preference.EditTextPreference -> {
                showStyledEditTextPreferenceDialog(preference)
            }
            is androidx.preference.MultiSelectListPreference -> {
                showStyledMultiSelectListPreferenceDialog(preference)
            }
            is androidx.preference.SeekBarPreference -> {
                showStyledSeekBarPreferenceDialog(preference)
            }
            else -> {
                super.onDisplayPreferenceDialog(preference)
            }
        }
    }

    protected open fun showStyledListPreferenceDialog(preference: androidx.preference.ListPreference) {
        val context = context ?: return
        val entries = preference.entries ?: return
        val entryValues = preference.entryValues ?: return
        val currentValue = preference.value
        val icon = resolvePreferenceIcon(preference.key)

        showSettingsComposeDialog(context) { dismiss ->
            SettingsChoiceDialogContent(
                title = preference.title?.toString() ?: "",
                subtitle = preference.summary?.toString()?.takeIf { it != "%s" },
                icon = icon,
                options = entries.toList(),
                values = entryValues.toList(),
                selectedValue = currentValue,
                onSelect = { newValue ->
                    preference.value = newValue
                    preference.callChangeListener(newValue)
                },
                onDismiss = dismiss,
            )
        }
    }

    protected open fun showStyledEditTextPreferenceDialog(preference: androidx.preference.EditTextPreference) {
        val context = context ?: return
        val icon = resolvePreferenceIcon(preference.key)

        showSettingsComposeDialog(context) { dismiss ->
            SettingsEditTextDialogContent(
                title = preference.title?.toString() ?: "",
                subtitle = preference.summary?.toString()?.takeIf { it != "%s" },
                icon = icon,
                currentText = preference.text ?: "",
                onConfirm = { newValue ->
                    preference.text = newValue
                    preference.callChangeListener(newValue)
                },
                onDismiss = dismiss,
            )
        }
    }

    protected open fun showStyledMultiSelectListPreferenceDialog(preference: androidx.preference.MultiSelectListPreference) {
        val context = context ?: return
        val entries = preference.entries ?: return
        val entryValues = preference.entryValues ?: return
        val currentValues = preference.values ?: emptySet()
        val icon = resolvePreferenceIcon(preference.key)

        showSettingsComposeDialog(context) { dismiss ->
            SettingsMultiChoiceDialogContent(
                title = preference.title?.toString() ?: "",
                subtitle = preference.summary?.toString()?.takeIf { it != "%s" },
                icon = icon,
                options = entries.toList(),
                values = entryValues.toList(),
                selectedValues = currentValues,
                onConfirm = { newValues ->
                    preference.values = newValues
                    preference.callChangeListener(newValues)
                },
                onDismiss = dismiss,
            )
        }
    }

    protected open fun showStyledSeekBarPreferenceDialog(preference: androidx.preference.SeekBarPreference) {
        val context = context ?: return
        val icon = resolvePreferenceIcon(preference.key)

        showSettingsComposeDialog(context) { dismiss ->
            SettingsSeekBarDialogContent(
                title = preference.title?.toString() ?: "",
                subtitle = preference.summary?.toString()?.takeIf { it != "%s" },
                icon = icon,
                currentValue = preference.value,
                minValue = preference.min,
                maxValue = preference.max,
                onConfirm = { newValue ->
                    preference.value = newValue
                    preference.callChangeListener(newValue)
                },
                onDismiss = dismiss,
            )
        }
    }

    private fun resolvePreferenceIcon(key: String?): ImageVector {
        if (key == null) return Icons.Filled.Tune
        val k = key.lowercase()
        return when {
            k.contains("theme") || k.contains("color") || k.contains("accent") -> Icons.Filled.Palette
            k.contains("card") || k.contains("style") -> Icons.Filled.Dashboard
            k.contains("speed") || k.contains("rewind") || k.contains("fast") -> Icons.Filled.FastForward
            k.contains("update") -> Icons.Filled.CloudSync
            k.contains("dir") || k.contains("search") || k.contains("folder") -> Icons.Filled.Folder
            k.contains("icon") || k.contains("filter") -> Icons.Filled.Filter
            k.contains("title") || k.contains("name") -> Icons.Filled.TextFields
            k.contains("view") || k.contains("mode") || k.contains("display") -> Icons.Filled.GridView
            k.contains("save") || k.contains("state") -> Icons.Filled.Save
            k.contains("dsiware") || k.contains("dsi") -> Icons.Filled.SportsEsports
            k.contains("lang") -> Icons.Filled.Language
            k.contains("cpu") || k.contains("arm") || k.contains("overclock") || k.contains("jit") -> Icons.Filled.Memory
            k.contains("sd") || k.contains("dldi") || k.contains("nand") -> Icons.Filled.SdCard
            k.contains("wfc") || k.contains("dns") || k.contains("server") || k.contains("wifi") -> Icons.Filled.Wifi
            k.contains("audio") || k.contains("sound") || k.contains("volume") || k.contains("mic") -> Icons.Filled.VolumeUp
            k.contains("video") || k.contains("renderer") || k.contains("shader") || k.contains("fps") -> Icons.Filled.Tv
            k.contains("haptic") || k.contains("vibrat") || k.contains("touch") -> Icons.Filled.TouchApp
            else -> Icons.Filled.Tune
        }
    }

    private fun restoreFocusToPreference(recyclerView: RecyclerView, key: String) {
        val adapter = recyclerView.adapter as? PreferenceGroupAdapter ?: return
        for (i in 0 until adapter.itemCount) {
            val item = adapter.getItem(i)
            if (item?.key == key) {
                val viewHolder = recyclerView.findViewHolderForAdapterPosition(i)
                viewHolder?.itemView?.requestFocus()
                break
            }
        }
    }
}