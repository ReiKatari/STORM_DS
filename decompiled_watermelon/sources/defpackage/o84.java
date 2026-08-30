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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o84  reason: default package */
/* loaded from: classes.dex */
public class o84 implements InputConnection {
    public final yb a;
    public v55 b;

    public o84(v55 v55Var, yb ybVar) {
        this.a = ybVar;
        this.b = v55Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        v55 v55Var = this.b;
        if (v55Var != null) {
            if (v55Var != null) {
                v55Var.closeConnection();
                this.b = null;
            }
            this.a.n(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        v55 v55Var = this.b;
        if (v55Var != null) {
            return v55Var.setSelection(i, i2);
        }
        return false;
    }
}
