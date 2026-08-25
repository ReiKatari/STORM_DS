package me.magnum.melonds.ui.settings.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceGroupAdapter
import androidx.preference.TwoStatePreference
import androidx.recyclerview.widget.RecyclerView

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

    private fun restoreFocusToPreference(recyclerView: RecyclerView, key: String, attempt: Int = 0) {
        val adapter = recyclerView.adapter as? PreferenceGroupAdapter ?: return
        val position = adapter.getPreferenceAdapterPosition(key)
        if (position == RecyclerView.NO_POSITION) {
            return
        }

        val holder = recyclerView.findViewHolderForAdapterPosition(position)
        if (holder != null) {
            holder.itemView.requestFocus()
        } else if (attempt < 6) {
            recyclerView.scrollToPosition(position)
            recyclerView.post { restoreFocusToPreference(recyclerView, key, attempt + 1) }
        }
    }
}
