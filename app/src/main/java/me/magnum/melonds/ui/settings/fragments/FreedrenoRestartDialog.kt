package me.magnum.melonds.ui.settings.fragments

import android.app.Activity
import android.app.Dialog
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.os.Process
import androidx.appcompat.app.AlertDialog
import androidx.core.os.bundleOf
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.lifecycleScope
import androidx.preference.PreferenceManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import me.magnum.melonds.ui.romlist.RomListActivity

class FreedrenoRestartDialog : DialogFragment() {
    companion object {
        private const val KEY = "preference_key"
        private const val VALUE = "preference_value"

        fun create(key: String, value: String) = FreedrenoRestartDialog().apply {
            arguments = bundleOf(KEY to key, VALUE to value)
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        isCancelable = false
        return AlertDialog.Builder(requireContext())
            .setTitle(R.string.freedreno_settings)
            .setMessage(R.string.freedreno_restart)
            .setPositiveButton(R.string.freedreno_restart_button, null)
            .create()
    }

    override fun onStart() {
        super.onStart()
        val dialog = requireDialog() as AlertDialog
        val button = dialog.getButton(AlertDialog.BUTTON_POSITIVE)
        button.setOnClickListener {
            button.isEnabled = false
            val preferences = PreferenceManager.getDefaultSharedPreferences(requireContext())
            val key = requireArguments().getString(KEY)!!
            val value = requireArguments().getString(VALUE)!!
            lifecycleScope.launch {
                val saved = withContext(Dispatchers.IO) {
                    preferences.edit().putString(key, value).commit()
                }
                if (saved) {
                    restartApp(requireActivity())
                } else {
                    dialog.setMessage(getString(R.string.freedreno_save_failed))
                    button.isEnabled = true
                }
            }
        }
    }

    private fun restartApp(activity: Activity) {
        val component = activity.packageManager.getLaunchIntentForPackage(activity.packageName)?.component
            ?: ComponentName(activity, RomListActivity::class.java)
        val restartIntent = Intent.makeRestartActivityTask(component)
        activity.startActivity(restartIntent)
        Process.killProcess(Process.myPid())
    }
}
