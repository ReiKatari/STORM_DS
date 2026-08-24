package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gh4  reason: default package */
/* loaded from: classes.dex */
public class gh4 implements android.view.inputmethod.InputConnection {
    public final defpackage.mc a;
    public defpackage.lf5 b;

    public gh4(defpackage.lf5 r1, defpackage.mc r2) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r1
            return
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.beginBatchEdit()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int r1) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.clearMetaKeyStates(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
            r1 = this;
            lf5 r0 = r1.b
            if (r0 == 0) goto L11
            if (r0 == 0) goto Lc
            r0.closeConnection()
            r0 = 0
            r1.b = r0
        Lc:
            mc r0 = r1.a
            r0.g(r1)
        L11:
            return
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(android.view.inputmethod.CompletionInfo r1) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.commitCompletion(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(android.view.inputmethod.InputContentInfo r1, int r2, android.os.Bundle r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo r1) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.commitCorrection(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence r1, int r2) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.commitText(r1, r2)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int r1, int r2) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.deleteSurroundingText(r1, r2)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int r1, int r2) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.deleteSurroundingTextInCodePoints(r1, r2)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.b()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.finishComposingText()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int r1) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            int r0 = r0.getCursorCapsMode(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest r1, int r2) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            android.view.inputmethod.ExtractedText r0 = r0.getExtractedText(r1, r2)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getSelectedText(int r1) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getSelectedText(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int r1, int r2) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getTextAfterCursor(r1, r2)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int r1, int r2) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getTextBeforeCursor(r1, r2)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int r1) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.performContextMenuAction(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int r1) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.performEditorAction(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String r1, android.os.Bundle r2) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.performPrivateCommand(r1, r2)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int r1) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.requestCursorUpdates(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent r1) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.sendKeyEvent(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int r1, int r2) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.setComposingRegion(r1, r2)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence r1, int r2) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.setComposingText(r1, r2)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int r1, int r2) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.setSelection(r1, r2)
            return r0
        L9:
            r0 = 0
            return r0
    }
}
