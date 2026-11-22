package me.magnum.melonds.ui.settings.preferences

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.Toast
import androidx.preference.Preference
import androidx.preference.PreferenceViewHolder

class InGameLockedPreference @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : Preference(context, attrs) {
    var isInGameLocked: Boolean = false
    var inGameLockedMessageRes: Int = 0

    override fun setOnPreferenceClickListener(onPreferenceClickListener: OnPreferenceClickListener?) {
        if (onPreferenceClickListener == null) {
            super.setOnPreferenceClickListener(null)
            return
        }
        super.setOnPreferenceClickListener { preference ->
            if (isInGameLocked) {
                showLockedMessage()
                true
            } else {
                onPreferenceClickListener.onPreferenceClick(preference)
            }
        }
    }

    @SuppressLint("RestrictedApi")
    override fun performClick() {
        if (isInGameLocked) {
            showLockedMessage()
            return
        }
        super.performClick()
    }

    override fun onClick() {
        if (isInGameLocked) {
            showLockedMessage()
            return
        }
        super.onClick()
    }

    private fun showLockedMessage() {
        if (inGameLockedMessageRes != 0) {
            Toast.makeText(context, inGameLockedMessageRes, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)
        holder.itemView.alpha = if (isInGameLocked) 0.5f else 1f
    }
}
