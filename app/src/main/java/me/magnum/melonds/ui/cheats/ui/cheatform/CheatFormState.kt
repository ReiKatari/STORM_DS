package me.magnum.melonds.ui.cheats.ui.cheatform

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import me.magnum.melonds.ui.cheats.model.CheatFormDialogState
import me.magnum.melonds.ui.cheats.model.CheatSubmissionForm

class CheatFormState(
    val isNewCheat: Boolean,
    cheatName: String,
    cheatDescription: String,
    cheatCode: String,
) {

    constructor(isNewCheat: Boolean) : this(isNewCheat, "", "", "")

    var cheatName by mutableStateOf(TextFieldValue(cheatName, selection = TextRange(cheatName.length)))
    var cheatDescription by mutableStateOf(TextFieldValue(cheatDescription, selection = TextRange(cheatDescription.length)))
    var cheatCode by mutableStateOf(formatCheatCode(TextFieldValue(cheatCode, selection = TextRange(cheatCode.length))))

    var cheatNameFieldError by mutableStateOf<FieldError?>(null)
        private set

    var cheatCodeFieldError by mutableStateOf<FieldError?>(null)
        private set

    var cheatCodeErrorLine by mutableStateOf<Int?>(null)
        private set

    fun buildSubmissionForm(): CheatSubmissionForm {
        return CheatSubmissionForm(
            name = cheatName.text.trim(),
            description = cheatDescription.text.trim(),
            code = cheatCode.text.trim().replace('\n', ' '),
        )
    }

    fun validateFields(): Boolean {
        val isNameFieldValid = validateCheatNameField()
        val isCodeFieldValid = validateCheatCodeField()

        return isNameFieldValid && isCodeFieldValid
    }

    fun validateCheatNameField(): Boolean {
        return if (cheatName.text.isBlank()) {
            cheatNameFieldError = FieldError.CANNOT_BE_EMPTY
            false
        } else {
            cheatNameFieldError = null
            true
        }
    }

    fun validateCheatCodeField(): Boolean {
        if (cheatCode.text.isBlank()) {
            cheatCodeFieldError = FieldError.CANNOT_BE_EMPTY
            cheatCodeErrorLine = null
            return false
        }
        val syntax = checkActionReplaySyntax(cheatCode.text)
        return if (!syntax.isValid) {
            cheatCodeFieldError = FieldError.INVALID_FORMAT
            cheatCodeErrorLine = syntax.errorLine
            false
        } else {
            cheatCodeFieldError = null
            cheatCodeErrorLine = null
            true
        }
    }

    companion object {
        enum class FieldError {
            CANNOT_BE_EMPTY,
            INVALID_FORMAT,
        }

        val Saver = listSaver<CheatFormState, Any?>(
            save = {
                with(TextFieldValue.Saver) {
                    listOf(
                        it.isNewCheat,
                        save(it.cheatName),
                        save(it.cheatDescription),
                        save(it.cheatCode),
                    )
                }
            },
            restore = {
                with(TextFieldValue.Saver) {
                    CheatFormState(it[0] as Boolean).apply {
                        cheatName = it[1]?.let { restore(it) } ?: TextFieldValue()
                        cheatDescription = it[2]?.let { restore(it) } ?: TextFieldValue()
                        cheatCode = it[3]?.let { restore(it) } ?: TextFieldValue()
                    }
                }
            }
        )
    }
}

@Composable
fun rememberCheatFormState(state: CheatFormDialogState): CheatFormState {
    return rememberSaveable(state, saver = CheatFormState.Saver) {
        if (state is CheatFormDialogState.EditCheat) {
            CheatFormState(
                isNewCheat = false,
                cheatName = state.cheat.name,
                cheatDescription = state.cheat.description.orEmpty(),
                cheatCode = state.cheat.code,
            )
        } else {
            CheatFormState(isNewCheat = true)
        }
    }
}

fun formatCheatCode(cheatCodeState: TextFieldValue): TextFieldValue {
    val selection = cheatCodeState.selection.start

    val stringBuilder = StringBuilder()

    // Tracks the amount of offset we need to add to the cursor due to introduced characters
    var cursorOffset = 0

    var cheatLineSize = 0
    var cheatWordSize = 0
    var isTextModified = false
    cheatCodeState.text.forEachIndexed { index, char ->
        if (cheatLineSize == 16) {
            stringBuilder.append('\n')
            cheatLineSize = 0
            cheatWordSize = 0
            if (char != '\n') {
                if (index <= (selection + cursorOffset)) {
                    isTextModified = true
                    cursorOffset++
                }
            } else {
                return@forEachIndexed
            }
        } else if (cheatWordSize == 8) {
            stringBuilder.append(' ')
            cheatWordSize = 0
            if (char != ' ') {
                if (index <= (selection + cursorOffset)) {
                    isTextModified = true
                    cursorOffset++
                }
            } else {
                return@forEachIndexed
            }
        }

        if (isValidChar(char)) {
            stringBuilder.append(char.uppercaseChar())
            cheatLineSize++
            cheatWordSize++
            if (!char.isDigit() && !char.isUpperCase()) {
                // Char case was changed. Mark text as modified
                isTextModified = true
            }
        } else {
            isTextModified = true
        }
    }

    return if (isTextModified) {
        TextFieldValue(stringBuilder.toString(), selection = TextRange(cheatCodeState.selection.start + cursorOffset))
    } else {
        cheatCodeState
    }
}

private fun isValidChar(char: Char): Boolean {
    val lowerChar = char.uppercaseChar()
    return lowerChar in ('0'..'9') || lowerChar in ('A'..'F')
}

private fun isCheatCodeValid(codeText: String): Boolean {
    return codeText.replace("[ \n]".toRegex(), "").length % 16 == 0
}
data class CheatCodeSyntaxResult(
    val isValid: Boolean,
    val errorLine: Int? = null,
)

fun checkActionReplaySyntax(codeText: String): CheatCodeSyntaxResult {
    val lines = codeText.split('\n')
    var nonBlankLineCount = 0
    val lineRegex = "^[0-9A-Fa-f]{8} [0-9A-Fa-f]{8}$".toRegex()
    for ((index, rawLine) in lines.withIndex()) {
        val trimmed = rawLine.trim()
        if (trimmed.isEmpty()) continue
        nonBlankLineCount++
        val normalized = trimmed.replace("\\s+".toRegex(), " ")
        if (!lineRegex.matches(normalized)) {
            return CheatCodeSyntaxResult(isValid = false, errorLine = index + 1)
        }
    }
    if (nonBlankLineCount == 0) {
        return CheatCodeSyntaxResult(isValid = false, errorLine = null)
    }
    return CheatCodeSyntaxResult(isValid = true)
}
