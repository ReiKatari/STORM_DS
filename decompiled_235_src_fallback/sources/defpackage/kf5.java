package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kf5  reason: default package */
/* loaded from: classes.dex */
public final class kf5 implements android.view.inputmethod.InputConnection {
    public final defpackage.s35 a;
    public final boolean b;
    public int c;
    public defpackage.c37 d;
    public int e;
    public boolean f;
    public final java.util.ArrayList g;
    public boolean h;

    public kf5(defpackage.c37 r1, defpackage.s35 r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r3
            r0.d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.g = r1
            r1 = 1
            r0.h = r1
            return
    }

    public final void a(defpackage.ds1 r2) {
            r1 = this;
            int r0 = r1.c
            int r0 = r0 + 1
            r1.c = r0
            java.util.ArrayList r0 = r1.g     // Catch: java.lang.Throwable -> Lf
            r0.add(r2)     // Catch: java.lang.Throwable -> Lf
            r1.b()
            return
        Lf:
            r2 = move-exception
            r1.b()
            throw r2
    }

    public final boolean b() {
            r3 = this;
            int r0 = r3.c
            int r0 = r0 + (-1)
            r3.c = r0
            if (r0 != 0) goto L23
            java.util.ArrayList r0 = r3.g
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L23
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            s35 r2 = r3.a
            java.lang.Object r2 = r2.A
            r37 r2 = (defpackage.r37) r2
            qn2 r2 = r2.e
            r2.g(r1)
            r0.clear()
        L23:
            int r3 = r3.c
            if (r3 <= 0) goto L29
            r3 = 1
            return r3
        L29:
            r3 = 0
            return r3
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
            r2 = this;
            boolean r0 = r2.h
            if (r0 == 0) goto Lb
            int r0 = r2.c
            r1 = 1
            int r0 = r0 + r1
            r2.c = r0
            return r1
        Lb:
            return r0
    }

    public final void c(int r3) {
            r2 = this;
            android.view.KeyEvent r0 = new android.view.KeyEvent
            r1 = 0
            r0.<init>(r1, r3)
            r2.sendKeyEvent(r0)
            android.view.KeyEvent r0 = new android.view.KeyEvent
            r1 = 1
            r0.<init>(r1, r3)
            r2.sendKeyEvent(r0)
            return
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int r1) {
            r0 = this;
            boolean r0 = r0.h
            if (r0 == 0) goto L5
            r0 = 0
        L5:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
            r4 = this;
            java.util.ArrayList r0 = r4.g
            r0.clear()
            r0 = 0
            r4.c = r0
            r4.h = r0
            s35 r1 = r4.a
            java.lang.Object r1 = r1.A
            r37 r1 = (defpackage.r37) r1
            java.util.ArrayList r1 = r1.i
            int r2 = r1.size()
        L16:
            if (r0 >= r2) goto L2f
            java.lang.Object r3 = r1.get(r0)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 == 0) goto L2c
            r1.remove(r0)
            return
        L2c:
            int r0 = r0 + 1
            goto L16
        L2f:
            return
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(android.view.inputmethod.CompletionInfo r1) {
            r0 = this;
            boolean r0 = r0.h
            if (r0 == 0) goto L5
            r0 = 0
        L5:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo r1, int r2, android.os.Bundle r3) {
            r0 = this;
            boolean r0 = r0.h
            if (r0 == 0) goto L5
            r0 = 0
        L5:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo r1) {
            r0 = this;
            boolean r1 = r0.h
            if (r1 == 0) goto L7
            boolean r0 = r0.b
            return r0
        L7:
            return r1
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence r3, int r4) {
            r2 = this;
            boolean r0 = r2.h
            if (r0 == 0) goto L10
            pu0 r1 = new pu0
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.<init>(r3, r4)
            r2.a(r1)
        L10:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.h
            if (r0 == 0) goto Le
            hh1 r0 = new hh1
            r0.<init>(r2, r3)
            r1.a(r0)
            r1 = 1
            return r1
        Le:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.h
            if (r0 == 0) goto Le
            ih1 r0 = new ih1
            r0.<init>(r2, r3)
            r1.a(r0)
            r1 = 1
            return r1
        Le:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
            r0 = this;
            boolean r0 = r0.b()
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
            r1 = this;
            boolean r0 = r1.h
            if (r0 == 0) goto Le
            qc2 r0 = new qc2
            r0.<init>()
            r1.a(r0)
            r1 = 1
            return r1
        Le:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int r4) {
            r3 = this;
            c37 r3 = r3.d
            fp r0 = r3.a
            java.lang.String r0 = r0.B
            long r1 = r3.b
            int r3 = defpackage.k47.f(r1)
            int r3 = android.text.TextUtils.getCapsMode(r0, r3, r4)
            return r3
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest r3, int r4) {
            r2 = this;
            r0 = 1
            r4 = r4 & r0
            r1 = 0
            if (r4 == 0) goto L6
            goto L7
        L6:
            r0 = r1
        L7:
            r2.f = r0
            if (r0 == 0) goto L11
            if (r3 == 0) goto Lf
            int r1 = r3.token
        Lf:
            r2.e = r1
        L11:
            c37 r2 = r2.d
            android.view.inputmethod.ExtractedText r2 = defpackage.uj2.c0(r2)
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getSelectedText(int r3) {
            r2 = this;
            c37 r3 = r2.d
            long r0 = r3.b
            boolean r3 = defpackage.k47.c(r0)
            if (r3 == 0) goto Lc
            r2 = 0
            return r2
        Lc:
            c37 r2 = r2.d
            fp r2 = defpackage.ln2.A(r2)
            java.lang.String r2 = r2.B
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int r1, int r2) {
            r0 = this;
            c37 r0 = r0.d
            fp r0 = defpackage.ln2.C(r0, r1)
            java.lang.String r0 = r0.B
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int r1, int r2) {
            r0 = this;
            c37 r0 = r0.d
            fp r0 = defpackage.ln2.D(r0, r1)
            java.lang.String r0 = r0.B
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int r3) {
            r2 = this;
            boolean r0 = r2.h
            if (r0 == 0) goto L2d
            r0 = 0
            switch(r3) {
                case 16908319: goto L1b;
                case 16908320: goto L15;
                case 16908321: goto Lf;
                case 16908322: goto L9;
                default: goto L8;
            }
        L8:
            return r0
        L9:
            r3 = 279(0x117, float:3.91E-43)
            r2.c(r3)
            return r0
        Lf:
            r3 = 278(0x116, float:3.9E-43)
            r2.c(r3)
            return r0
        L15:
            r3 = 277(0x115, float:3.88E-43)
            r2.c(r3)
            return r0
        L1b:
            dd6 r3 = new dd6
            c37 r1 = r2.d
            fp r1 = r1.a
            java.lang.String r1 = r1.B
            int r1 = r1.length()
            r3.<init>(r0, r1)
            r2.a(r3)
        L2d:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int r4) {
            r3 = this;
            boolean r0 = r3.h
            if (r0 == 0) goto L3a
            r0 = 1
            if (r4 == 0) goto L1d
            switch(r4) {
                case 2: goto L29;
                case 3: goto L27;
                case 4: goto L25;
                case 5: goto L23;
                case 6: goto L21;
                case 7: goto L1f;
                default: goto La;
            }
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "IME sends unsupported Editor Action: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "RecordingIC"
            android.util.Log.w(r1, r4)
        L1d:
            r4 = r0
            goto L2a
        L1f:
            r4 = 5
            goto L2a
        L21:
            r4 = 7
            goto L2a
        L23:
            r4 = 6
            goto L2a
        L25:
            r4 = 4
            goto L2a
        L27:
            r4 = 3
            goto L2a
        L29:
            r4 = 2
        L2a:
            s35 r3 = r3.a
            java.lang.Object r3 = r3.A
            r37 r3 = (defpackage.r37) r3
            qn2 r3 = r3.f
            k33 r1 = new k33
            r1.<init>(r4)
            r3.g(r1)
        L3a:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String r1, android.os.Bundle r2) {
            r0 = this;
            boolean r0 = r0.h
            if (r0 == 0) goto L5
            r0 = 1
        L5:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int r10) {
            r9 = this;
            boolean r0 = r9.h
            if (r0 == 0) goto L77
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            s35 r9 = r9.a
            java.lang.Object r9 = r9.A
            r37 r9 = (defpackage.r37) r9
            b81 r9 = r9.l
            java.lang.Object r4 = r9.c
            monitor-enter(r4)
            r9.f = r5     // Catch: java.lang.Throwable -> L6f
            r9.g = r6     // Catch: java.lang.Throwable -> L6f
            r9.h = r1     // Catch: java.lang.Throwable -> L6f
            r9.i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r9.e = r2     // Catch: java.lang.Throwable -> L6f
            c37 r10 = r9.j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r9.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r9 = move-exception
            goto L75
        L71:
            r9.d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r4)
            return r2
        L75:
            monitor-exit(r4)
            throw r9
        L77:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = r1.h
            if (r0 == 0) goto L17
            s35 r1 = r1.a
            java.lang.Object r1 = r1.A
            r37 r1 = (defpackage.r37) r1
            go3 r1 = r1.j
            java.lang.Object r1 = r1.getValue()
            android.view.inputmethod.BaseInputConnection r1 = (android.view.inputmethod.BaseInputConnection) r1
            r1.sendKeyEvent(r2)
            r1 = 1
            return r1
        L17:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int r3, int r4) {
            r2 = this;
            boolean r0 = r2.h
            if (r0 == 0) goto Lc
            bd6 r1 = new bd6
            r1.<init>(r3, r4)
            r2.a(r1)
        Lc:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence r3, int r4) {
            r2 = this;
            boolean r0 = r2.h
            if (r0 == 0) goto L10
            cd6 r1 = new cd6
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.<init>(r3, r4)
            r2.a(r1)
        L10:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.h
            if (r0 == 0) goto Le
            dd6 r0 = new dd6
            r0.<init>(r2, r3)
            r1.a(r0)
            r1 = 1
            return r1
        Le:
            return r0
    }
}
