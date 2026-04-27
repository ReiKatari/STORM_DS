package me.magnum.melonds.ui.common.component.dialog

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import me.magnum.melonds.R

/**
 * Generic single-choice dialog hooked into a [SingleChoiceDialogState] state holder. Mirrors the
 * [TextInputDialog] pattern: keep one state object at the parent and call `state.show(...)` to
 * present the dialog.
 */
@Composable
fun <T> SingleChoiceDialog(
    dialogState: SingleChoiceDialogState<T>,
) {
    if (!dialogState.isVisible) return
    val payload = dialogState.payload ?: return

    BaseDialog(
        title = payload.title,
        onDismiss = { dialogState.dismiss() },
        content = { padding ->
            // Plain Column (not LazyColumn) — option lists are short and BaseDialog already wraps
            // its content in a verticalScroll, which would crash a LazyColumn with infinite height.
            Column(modifier = Modifier.fillMaxWidth().padding(padding)) {
                payload.items.forEach { item ->
                    val isSelected = item == payload.selected
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                payload.onSelect(item)
                                dialogState.dismiss()
                            }
                            .heightIn(min = 48.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        RadioButton(
                            selected = isSelected,
                            onClick = null,
                        )
                        Spacer(Modifier.width(16.dp))
                        Text(
                            text = payload.labelOf(item),
                            style = MaterialTheme.typography.body1,
                        )
                    }
                }
            }
        },
        buttons = {
            DialogButton(
                text = stringResource(R.string.cancel),
                onClick = { dialogState.dismiss() },
            )
        },
    )
}

@Composable
fun <T> rememberSingleChoiceDialogState(): SingleChoiceDialogState<T> {
    return remember { SingleChoiceDialogState() }
}

class SingleChoiceDialogState<T> {
    internal var isVisible by mutableStateOf(false)
    internal var payload by mutableStateOf<Payload<T>?>(null)

    fun show(
        title: String,
        items: List<T>,
        labelOf: (T) -> String,
        selected: T,
        onSelect: (T) -> Unit,
    ) {
        if (isVisible) return
        payload = Payload(title, items, labelOf, selected, onSelect)
        isVisible = true
    }

    internal fun dismiss() {
        isVisible = false
        payload = null
    }

    internal data class Payload<T>(
        val title: String,
        val items: List<T>,
        val labelOf: (T) -> String,
        val selected: T,
        val onSelect: (T) -> Unit,
    )
}
