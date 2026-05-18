package me.magnum.melonds.ui.layouteditor.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import me.magnum.melonds.R
import me.magnum.melonds.ui.common.component.dialog.BaseDialog
import me.magnum.melonds.ui.common.component.dialog.DialogButton
import me.magnum.melonds.ui.common.melonOutlinedTextFieldColors
import me.magnum.melonds.ui.layouteditor.model.LayoutComponentEditableProperty

@Composable
fun LayoutComponentPropertyValueDialog(
    editableProperty: LayoutComponentEditableProperty?,
    initialValue: Int,
    minValue: Int,
    maxValue: Int,
    onValueChanged: (Int) -> Unit,
    onCancel: () -> Unit,
) {
    if (editableProperty == null) {
        return
    }

    val valueRange = minValue..maxValue
    var valueText by rememberSaveable(editableProperty, initialValue, minValue, maxValue) {
        mutableStateOf(initialValue.toString())
    }
    val parsedValue = valueText.toIntOrNull()?.takeIf(valueRange::contains)
    val isInvalid = valueText.isNotEmpty() && parsedValue == null

    BaseDialog(
        title = when (editableProperty) {
            LayoutComponentEditableProperty.SIZE -> stringResource(R.string.label_size)
            LayoutComponentEditableProperty.WIDTH -> stringResource(R.string.label_width)
            LayoutComponentEditableProperty.HEIGHT -> stringResource(R.string.label_height)
        },
        onDismiss = onCancel,
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(padding),
                verticalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = valueText,
                    onValueChange = { valueText = it },
                    isError = isInvalid,
                    colors = melonOutlinedTextFieldColors(),
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done, keyboardType = KeyboardType.Number),
                    keyboardActions = KeyboardActions(
                        onDone = {
                            parsedValue?.let(onValueChanged)
                        },
                    ),
                    singleLine = true,
                )
                Text(
                    text = stringResource(R.string.layout_position_allowed_range, valueRange.first, valueRange.last),
                    style = MaterialTheme.typography.caption,
                    color = if (isInvalid) MaterialTheme.colors.error else MaterialTheme.colors.onSurface,
                )
            }
        },
        buttons = {
            DialogButton(
                text = stringResource(R.string.cancel),
                onClick = onCancel,
            )
            DialogButton(
                text = stringResource(R.string.ok),
                enabled = parsedValue != null,
                onClick = {
                    parsedValue?.let(onValueChanged)
                },
            )
        },
    )
}
