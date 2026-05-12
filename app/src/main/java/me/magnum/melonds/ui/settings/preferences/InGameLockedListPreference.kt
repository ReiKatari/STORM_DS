package me.magnum.melonds.ui.settings.preferences

import android.content.Context
import android.util.AttributeSet
import android.widget.Toast
import androidx.preference.ListPreference
import androidx.preference.PreferenceViewHolder

class InGameLockedListPreference @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = androidx.preference.R.attr.dialogPreferenceStyle,
) : ListPreference(context, attrs, defStyleAttr) {

    var isInGameLocked: Boolean = false
    var inGameLockedMessageRes: Int = 0

    override fun onClick() {
        if (isInGameLocked) {
            if (inGameLockedMessageRes != 0) {
                Toast.makeText(context, inGameLockedMessageRes, Toast.LENGTH_SHORT).show()
            }
            return
        }
        super.onClick()
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)
        holder.itemView.alpha = if (isInGameLocked) 0.5f else 1f
    }
}
