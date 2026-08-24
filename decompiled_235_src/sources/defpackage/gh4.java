package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gh4  reason: default package */
/* loaded from: classes.dex */
public class gh4 implements InputConnection {
    public final mc a;
    public lf5 b;

    public gh4(lf5 lf5Var, mc mcVar) {
        this.a = mcVar;
        this.b = lf5Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            if (lf5Var != null) {
                lf5Var.closeConnection();
                this.b = null;
            }
            this.a.g(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.setSelection(i, i2);
        }
        return false;
    }
}
