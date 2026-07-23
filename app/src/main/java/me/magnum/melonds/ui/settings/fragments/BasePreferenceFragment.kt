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

    override fun onResume() {
        super.onResume()
        val key = lastActivatedKey ?: return
        val recyclerView = listView ?: return
        recyclerView.post { restoreFocusToPreference(recyclerView, key) }
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
