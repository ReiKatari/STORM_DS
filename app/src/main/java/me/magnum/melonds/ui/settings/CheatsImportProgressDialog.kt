package me.magnum.melonds.ui.settings

import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.databinding.DialogCheatsImportProgressBinding
import me.magnum.melonds.domain.model.CheatImportProgress
import me.magnum.melonds.ui.settings.viewmodel.CheatsPreferencesViewModel

@AndroidEntryPoint
class CheatsImportProgressDialog : DialogFragment() {

    private val viewModel by viewModels<CheatsPreferencesViewModel>()
    private lateinit var binding: DialogCheatsImportProgressBinding
    private var sawActiveImport = false

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = DialogCheatsImportProgressBinding.inflate(layoutInflater)

        return AlertDialog.Builder(requireContext())
            .setTitle(R.string.importing_cheats)
            .setView(binding.root)
            .setPositiveButton(R.string.move_to_background) { dialog, _ ->
                dialog.dismiss()
            }
            .setCancelable(false)
            .create()
    }

    override fun onStart() {
        super.onStart()

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.observeCheatsImportProgress().collect {
                    when (it.status) {
                        CheatImportProgress.CheatImportStatus.STARTING -> {
                            sawActiveImport = true
                            binding.progressBarCheatImport.isIndeterminate = true
                            binding.textCheatImportItemName.setText(R.string.starting)
                        }
                        CheatImportProgress.CheatImportStatus.ONGOING -> {
                            sawActiveImport = true
                            binding.progressBarCheatImport.isIndeterminate = false
                            binding.progressBarCheatImport.progress = (it.progress * 100).toInt()
                            binding.textCheatImportItemName.text = it.ongoingItemName
                        }
                        CheatImportProgress.CheatImportStatus.FINISHED -> {
                            Toast.makeText(requireContext(), R.string.cheats_import_finished, Toast.LENGTH_LONG).show()
                            dismiss()
                        }
                        CheatImportProgress.CheatImportStatus.FAILED -> {
                            Toast.makeText(requireContext(), R.string.cheats_import_failed, Toast.LENGTH_LONG).show()
                            dismiss()
                        }
                        CheatImportProgress.CheatImportStatus.NOT_IMPORTING -> {
                            if (sawActiveImport) {
                                Toast.makeText(requireContext(), R.string.cheats_import_finished, Toast.LENGTH_LONG).show()
                            }
                            dismiss()
                        }
                    }
                }
            }
        }
    }
}
