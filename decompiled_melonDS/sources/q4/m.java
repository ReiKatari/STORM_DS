package q4;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class m implements InputConnection {

    /* renamed from: a  reason: collision with root package name */
    public final a4.a f12258a;

    /* renamed from: b  reason: collision with root package name */
    public d2.v f12259b;

    public m(d2.v vVar, a4.a aVar) {
        this.f12258a = aVar;
        this.f12259b = vVar;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i2) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.clearMetaKeyStates(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            if (vVar != null) {
                vVar.closeConnection();
                this.f12259b = null;
            }
            this.f12258a.k(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i2) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.commitText(charSequence, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i10) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.deleteSurroundingText(i2, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i10) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.deleteSurroundingTextInCodePoints(i2, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i2) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.getCursorCapsMode(i2);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.getExtractedText(extractedTextRequest, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i2) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.getSelectedText(i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i2, int i10) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.getTextAfterCursor(i2, i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i2, int i10) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.getTextBeforeCursor(i2, i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i2) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.performContextMenuAction(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i2) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.performEditorAction(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i2) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.requestCursorUpdates(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i2, int i10) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.setComposingRegion(i2, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i2) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.setComposingText(charSequence, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i2, int i10) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.setSelection(i2, i10);
        }
        return false;
    }
}
