package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lf5  reason: default package */
/* loaded from: classes.dex */
public final class lf5 implements android.view.inputmethod.InputConnection {
    public final defpackage.s63 a;
    public final boolean b;
    public final defpackage.jt3 c;
    public final defpackage.p27 d;
    public final defpackage.fo7 e;
    public int f;
    public defpackage.c37 g;
    public int h;
    public boolean i;
    public final java.util.ArrayList j;
    public boolean k;

    public lf5(defpackage.c37 r1, defpackage.s63 r2, boolean r3, defpackage.jt3 r4, defpackage.p27 r5, defpackage.fo7 r6) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r6
            r0.g = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.j = r1
            r1 = 1
            r0.k = r1
            return
    }

    public final void a(defpackage.ds1 r2) {
            r1 = this;
            int r0 = r1.f
            int r0 = r0 + 1
            r1.f = r0
            java.util.ArrayList r0 = r1.j     // Catch: java.lang.Throwable -> Lf
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
            int r0 = r3.f
            int r0 = r0 + (-1)
            r3.f = r0
            if (r0 != 0) goto L23
            java.util.ArrayList r0 = r3.j
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L23
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            s63 r2 = r3.a
            java.lang.Object r2 = r2.B
            kt3 r2 = (defpackage.kt3) r2
            qn2 r2 = r2.c
            r2.g(r1)
            r0.clear()
        L23:
            int r3 = r3.f
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
            boolean r0 = r2.k
            if (r0 == 0) goto Lb
            int r0 = r2.f
            r1 = 1
            int r0 = r0 + r1
            r2.f = r0
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
            boolean r0 = r0.k
            if (r0 == 0) goto L5
            r0 = 0
        L5:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
            r4 = this;
            java.util.ArrayList r0 = r4.j
            r0.clear()
            r0 = 0
            r4.f = r0
            r4.k = r0
            s63 r1 = r4.a
            java.lang.Object r1 = r1.B
            kt3 r1 = (defpackage.kt3) r1
            java.util.ArrayList r1 = r1.j
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
            boolean r0 = r0.k
            if (r0 == 0) goto L5
            r0 = 0
        L5:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo r1, int r2, android.os.Bundle r3) {
            r0 = this;
            boolean r0 = r0.k
            if (r0 == 0) goto L5
            r0 = 0
        L5:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo r1) {
            r0 = this;
            boolean r1 = r0.k
            if (r1 == 0) goto L7
            boolean r0 = r0.b
            return r0
        L7:
            return r1
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence r3, int r4) {
            r2 = this;
            boolean r0 = r2.k
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
            boolean r0 = r1.k
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
            boolean r0 = r1.k
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
            boolean r0 = r1.k
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
            c37 r3 = r3.g
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
            r2.i = r0
            if (r0 == 0) goto L11
            if (r3 == 0) goto Lf
            int r1 = r3.token
        Lf:
            r2.h = r1
        L11:
            c37 r2 = r2.g
            android.view.inputmethod.ExtractedText r2 = defpackage.oi2.g(r2)
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
            c37 r3 = r2.g
            long r0 = r3.b
            boolean r3 = defpackage.k47.c(r0)
            if (r3 == 0) goto Lc
            r2 = 0
            return r2
        Lc:
            c37 r2 = r2.g
            fp r2 = defpackage.ln2.A(r2)
            java.lang.String r2 = r2.B
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int r1, int r2) {
            r0 = this;
            c37 r0 = r0.g
            fp r0 = defpackage.ln2.C(r0, r1)
            java.lang.String r0 = r0.B
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int r1, int r2) {
            r0 = this;
            c37 r0 = r0.g
            fp r0 = defpackage.ln2.D(r0, r1)
            java.lang.String r0 = r0.B
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int r3) {
            r2 = this;
            boolean r0 = r2.k
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
            c37 r1 = r2.g
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
            boolean r0 = r3.k
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
            s63 r3 = r3.a
            java.lang.Object r3 = r3.B
            kt3 r3 = (defpackage.kt3) r3
            qn2 r3 = r3.d
            k33 r1 = new k33
            r1.<init>(r4)
            r3.g(r1)
        L3a:
            return r0
    }

    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture r18, java.util.concurrent.Executor r19, java.util.function.IntConsumer r20) {
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r3 < r4) goto L35c
            bg2 r3 = new bg2
            r4 = 27
            r3.<init>(r0, r4)
            r4 = 1
            jt3 r5 = r0.c
            r6 = 3
            if (r5 == 0) goto L34a
            fp r7 = r5.j
            if (r7 != 0) goto L1f
            goto L34a
        L1f:
            b47 r8 = r5.d()
            r9 = 0
            if (r8 == 0) goto L2f
            a47 r8 = r8.a
            z37 r8 = r8.a
            if (r8 == 0) goto L2f
            fp r8 = r8.a
            goto L30
        L2f:
            r8 = r9
        L30:
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L38
            goto L34a
        L38:
            boolean r6 = defpackage.qv2.s(r18)
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r8 = 0
            r12 = 32
            p27 r13 = r0.d
            if (r6 == 0) goto L85
            android.view.inputmethod.SelectGesture r0 = defpackage.qv2.p(r18)
            android.graphics.RectF r6 = defpackage.qv2.j(r0)
            of5 r6 = defpackage.ej2.b0(r6)
            int r7 = defpackage.qv2.c(r0)
            if (r7 == r4) goto L5b
            goto L5c
        L5b:
            r8 = r4
        L5c:
            long r5 = defpackage.kn2.H(r5, r6, r8)
            boolean r7 = defpackage.k47.c(r5)
            if (r7 == 0) goto L70
            android.view.inputmethod.HandwritingGesture r0 = defpackage.qv2.l(r0)
            int r6 = defpackage.bl2.w(r0, r3)
            goto L34a
        L70:
            dd6 r0 = new dd6
            long r7 = r5 >> r12
            int r7 = (int) r7
            long r5 = r5 & r10
            int r5 = (int) r5
            r0.<init>(r7, r5)
            r3.g(r0)
            if (r13 == 0) goto L82
            r13.h(r4)
        L82:
            r6 = r4
            goto L34a
        L85:
            boolean r6 = defpackage.qv2.D(r18)
            if (r6 == 0) goto Lbb
            android.view.inputmethod.DeleteGesture r0 = defpackage.qv2.k(r18)
            int r6 = defpackage.qv2.t(r0)
            if (r6 == r4) goto L97
            r6 = r8
            goto L98
        L97:
            r6 = r4
        L98:
            android.graphics.RectF r9 = defpackage.qv2.w(r0)
            of5 r9 = defpackage.ej2.b0(r9)
            long r9 = defpackage.kn2.H(r5, r9, r6)
            boolean r5 = defpackage.k47.c(r9)
            if (r5 == 0) goto Lb4
            android.view.inputmethod.HandwritingGesture r0 = defpackage.qv2.l(r0)
            int r6 = defpackage.bl2.w(r0, r3)
            goto L34a
        Lb4:
            if (r6 != r4) goto Lb7
            r8 = r4
        Lb7:
            defpackage.bl2.M(r9, r7, r8, r3)
            goto L82
        Lbb:
            boolean r6 = defpackage.rv2.m(r18)
            if (r6 == 0) goto L105
            android.view.inputmethod.SelectRangeGesture r0 = defpackage.rv2.j(r18)
            android.graphics.RectF r6 = defpackage.rv2.g(r0)
            of5 r6 = defpackage.ej2.b0(r6)
            android.graphics.RectF r7 = defpackage.rv2.o(r0)
            of5 r7 = defpackage.ej2.b0(r7)
            int r9 = defpackage.qv2.d(r0)
            if (r9 == r4) goto Ldc
            goto Ldd
        Ldc:
            r8 = r4
        Ldd:
            long r5 = defpackage.kn2.m(r5, r6, r7, r8)
            boolean r7 = defpackage.k47.c(r5)
            if (r7 == 0) goto Lf1
            android.view.inputmethod.HandwritingGesture r0 = defpackage.qv2.l(r0)
            int r6 = defpackage.bl2.w(r0, r3)
            goto L34a
        Lf1:
            dd6 r0 = new dd6
            long r7 = r5 >> r12
            int r7 = (int) r7
            long r5 = r5 & r10
            int r5 = (int) r5
            r0.<init>(r7, r5)
            r3.g(r0)
            if (r13 == 0) goto L82
            r13.h(r4)
            goto L82
        L105:
            boolean r6 = defpackage.rv2.q(r18)
            if (r6 == 0) goto L144
            android.view.inputmethod.DeleteRangeGesture r0 = defpackage.rv2.i(r18)
            int r6 = defpackage.qv2.u(r0)
            if (r6 == r4) goto L117
            r6 = r8
            goto L118
        L117:
            r6 = r4
        L118:
            android.graphics.RectF r9 = defpackage.qv2.A(r0)
            of5 r9 = defpackage.ej2.b0(r9)
            android.graphics.RectF r10 = defpackage.qv2.x(r0)
            of5 r10 = defpackage.ej2.b0(r10)
            long r9 = defpackage.kn2.m(r5, r9, r10, r6)
            boolean r5 = defpackage.k47.c(r9)
            if (r5 == 0) goto L13c
            android.view.inputmethod.HandwritingGesture r0 = defpackage.qv2.l(r0)
            int r6 = defpackage.bl2.w(r0, r3)
            goto L34a
        L13c:
            if (r6 != r4) goto L13f
            r8 = r4
        L13f:
            defpackage.bl2.M(r9, r7, r8, r3)
            goto L82
        L144:
            boolean r6 = defpackage.qv2.C(r18)
            r10 = 2
            fo7 r0 = r0.e
            r11 = -1
            if (r6 == 0) goto L1df
            android.view.inputmethod.JoinOrSplitGesture r6 = defpackage.qv2.n(r18)
            if (r0 != 0) goto L15e
            android.view.inputmethod.HandwritingGesture r0 = defpackage.qv2.y(r6)
            int r6 = defpackage.bl2.w(r0, r3)
            goto L34a
        L15e:
            android.graphics.PointF r9 = defpackage.qv2.f(r6)
            long r13 = defpackage.kn2.p(r9)
            int r0 = defpackage.kn2.l(r5, r13, r0)
            if (r0 == r11) goto L1d5
            b47 r5 = r5.d()
            if (r5 == 0) goto L17b
            a47 r5 = r5.a
            boolean r5 = defpackage.kn2.n(r5, r0)
            if (r5 != r4) goto L17b
            goto L1d5
        L17b:
            r5 = r0
        L17c:
            if (r5 <= 0) goto L18f
            int r6 = java.lang.Character.codePointBefore(r7, r5)
            boolean r9 = defpackage.kn2.P(r6)
            if (r9 != 0) goto L189
            goto L18f
        L189:
            int r6 = java.lang.Character.charCount(r6)
            int r5 = r5 - r6
            goto L17c
        L18f:
            java.lang.String r6 = r7.B
            int r6 = r6.length()
            if (r0 >= r6) goto L1a8
            int r6 = java.lang.Character.codePointAt(r7, r0)
            boolean r9 = defpackage.kn2.P(r6)
            if (r9 != 0) goto L1a2
            goto L1a8
        L1a2:
            int r6 = java.lang.Character.charCount(r6)
            int r0 = r0 + r6
            goto L18f
        L1a8:
            long r5 = defpackage.jx2.f(r5, r0)
            boolean r0 = defpackage.k47.c(r5)
            if (r0 == 0) goto L1d0
            long r5 = r5 >> r12
            int r0 = (int) r5
            dd6 r5 = new dd6
            r5.<init>(r0, r0)
            pu0 r0 = new pu0
            java.lang.String r6 = " "
            r0.<init>(r6, r4)
            ds1[] r6 = new defpackage.ds1[r10]
            r6[r8] = r5
            r6[r4] = r0
            sv2 r0 = new sv2
            r0.<init>(r6)
            r3.g(r0)
            goto L82
        L1d0:
            defpackage.bl2.M(r5, r7, r8, r3)
            goto L82
        L1d5:
            android.view.inputmethod.HandwritingGesture r0 = defpackage.qv2.l(r6)
            int r6 = defpackage.bl2.w(r0, r3)
            goto L34a
        L1df:
            boolean r6 = defpackage.qv2.z(r18)
            if (r6 == 0) goto L23a
            android.view.inputmethod.InsertGesture r6 = defpackage.qv2.m(r18)
            if (r0 != 0) goto L1f5
            android.view.inputmethod.HandwritingGesture r0 = defpackage.qv2.y(r6)
            int r6 = defpackage.bl2.w(r0, r3)
            goto L34a
        L1f5:
            android.graphics.PointF r7 = defpackage.qv2.e(r6)
            long r12 = defpackage.kn2.p(r7)
            int r0 = defpackage.kn2.l(r5, r12, r0)
            if (r0 == r11) goto L230
            b47 r5 = r5.d()
            if (r5 == 0) goto L212
            a47 r5 = r5.a
            boolean r5 = defpackage.kn2.n(r5, r0)
            if (r5 != r4) goto L212
            goto L230
        L212:
            java.lang.String r5 = defpackage.qv2.r(r6)
            dd6 r6 = new dd6
            r6.<init>(r0, r0)
            pu0 r0 = new pu0
            r0.<init>(r5, r4)
            ds1[] r5 = new defpackage.ds1[r10]
            r5[r8] = r6
            r5[r4] = r0
            sv2 r0 = new sv2
            r0.<init>(r5)
            r3.g(r0)
            goto L82
        L230:
            android.view.inputmethod.HandwritingGesture r0 = defpackage.qv2.l(r6)
            int r6 = defpackage.bl2.w(r0, r3)
            goto L34a
        L23a:
            boolean r6 = defpackage.qv2.B(r18)
            if (r6 == 0) goto L349
            android.view.inputmethod.RemoveSpaceGesture r6 = defpackage.qv2.o(r18)
            b47 r13 = r5.d()
            if (r13 == 0) goto L24c
            a47 r9 = r13.a
        L24c:
            android.graphics.PointF r13 = defpackage.qv2.g(r6)
            long r13 = defpackage.kn2.p(r13)
            android.graphics.PointF r15 = defpackage.qv2.v(r6)
            r16 = r5
            long r4 = defpackage.kn2.p(r15)
            jk3 r15 = r16.c()
            if (r9 == 0) goto L268
            v84 r9 = r9.b
            if (r15 != 0) goto L26b
        L268:
            r16 = r12
            goto L2c8
        L26b:
            long r13 = r15.N(r13)
            long r4 = r15.N(r4)
            int r15 = defpackage.kn2.F(r9, r13, r0)
            int r0 = defpackage.kn2.F(r9, r4, r0)
            if (r15 != r11) goto L284
            if (r0 != r11) goto L28c
            long r4 = defpackage.k47.b
            r16 = r12
            goto L2ca
        L284:
            if (r0 != r11) goto L287
            goto L28b
        L287:
            int r15 = java.lang.Math.min(r15, r0)
        L28b:
            r0 = r15
        L28c:
            float r15 = r9.f(r0)
            float r0 = r9.b(r0)
            float r0 = r0 + r15
            r15 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r15
            of5 r15 = new of5
            long r13 = r13 >> r12
            int r13 = (int) r13
            float r14 = java.lang.Float.intBitsToFloat(r13)
            long r4 = r4 >> r12
            int r4 = (int) r4
            float r5 = java.lang.Float.intBitsToFloat(r4)
            float r5 = java.lang.Math.min(r14, r5)
            r14 = 1036831949(0x3dcccccd, float:0.1)
            r16 = r12
            float r12 = r0 - r14
            float r13 = java.lang.Float.intBitsToFloat(r13)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r4 = java.lang.Math.max(r13, r4)
            float r0 = r0 + r14
            r15.<init>(r5, r12, r4, r0)
            fa6 r0 = defpackage.cs1.n0
            long r4 = r9.h(r15, r8, r0)
            goto L2ca
        L2c8:
            long r4 = defpackage.k47.b
        L2ca:
            boolean r0 = defpackage.k47.c(r4)
            if (r0 == 0) goto L2d9
            android.view.inputmethod.HandwritingGesture r0 = defpackage.qv2.l(r6)
            int r6 = defpackage.bl2.w(r0, r3)
            goto L34a
        L2d9:
            bh5 r0 = new bh5
            r0.<init>()
            r0.A = r11
            bh5 r9 = new bh5
            r9.<init>()
            r9.A = r11
            int r12 = defpackage.k47.f(r4)
            int r13 = defpackage.k47.e(r4)
            fp r7 = r7.c(r12, r13)
            java.lang.String r7 = r7.B
            xh5 r12 = new xh5
            java.lang.String r13 = "\\s+"
            r12.<init>(r13)
            bi2 r13 = new bi2
            r14 = 7
            r13.<init>(r14, r0, r9)
            java.lang.String r7 = r12.e(r7, r13)
            int r0 = r0.A
            if (r0 == r11) goto L340
            int r12 = r9.A
            if (r12 != r11) goto L30f
            goto L340
        L30f:
            long r13 = r4 >> r16
            int r6 = (int) r13
            int r11 = r6 + r0
            int r6 = r6 + r12
            int r12 = r7.length()
            int r4 = defpackage.k47.d(r4)
            int r5 = r9.A
            int r4 = r4 - r5
            int r12 = r12 - r4
            java.lang.String r0 = r7.substring(r0, r12)
            dd6 r4 = new dd6
            r4.<init>(r11, r6)
            pu0 r5 = new pu0
            r6 = 1
            r5.<init>(r0, r6)
            ds1[] r0 = new defpackage.ds1[r10]
            r0[r8] = r4
            r0[r6] = r5
            sv2 r4 = new sv2
            r4.<init>(r0)
            r3.g(r4)
            r6 = 1
            goto L34a
        L340:
            android.view.inputmethod.HandwritingGesture r0 = defpackage.qv2.l(r6)
            int r6 = defpackage.bl2.w(r0, r3)
            goto L34a
        L349:
            r6 = r10
        L34a:
            if (r2 != 0) goto L34d
            goto L35c
        L34d:
            if (r1 == 0) goto L359
            om r0 = new om
            r3 = 1
            r0.<init>(r2, r6, r3)
            r1.execute(r0)
            return
        L359:
            r2.accept(r6)
        L35c:
            return
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String r1, android.os.Bundle r2) {
            r0 = this;
            boolean r0 = r0.k
            if (r0 == 0) goto L5
            r0 = 1
        L5:
            return r0
    }

    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture r7, android.os.CancellationSignal r8) {
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r2 = 0
            if (r0 < r1) goto L148
            jt3 r0 = r6.c
            if (r0 == 0) goto L148
            fp r1 = r0.j
            if (r1 != 0) goto L11
            goto L148
        L11:
            b47 r3 = r0.d()
            if (r3 == 0) goto L20
            a47 r3 = r3.a
            z37 r3 = r3.a
            if (r3 == 0) goto L20
            fp r3 = r3.a
            goto L21
        L20:
            r3 = 0
        L21:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L29
            goto L148
        L29:
            boolean r1 = defpackage.qv2.s(r7)
            r3 = 1
            p27 r6 = r6.d
            if (r1 == 0) goto L6d
            android.view.inputmethod.SelectGesture r7 = defpackage.qv2.p(r7)
            if (r6 == 0) goto L13d
            android.graphics.RectF r1 = defpackage.qv2.j(r7)
            of5 r1 = defpackage.ej2.b0(r1)
            int r7 = defpackage.qv2.c(r7)
            if (r7 == r3) goto L48
            r7 = r2
            goto L49
        L48:
            r7 = r3
        L49:
            long r0 = defpackage.kn2.H(r0, r1, r7)
            jt3 r7 = r6.d
            if (r7 == 0) goto L54
            r7.f(r0)
        L54:
            jt3 r7 = r6.d
            if (r7 == 0) goto L5d
            long r4 = defpackage.k47.b
            r7.e(r4)
        L5d:
            boolean r7 = defpackage.k47.c(r0)
            if (r7 != 0) goto L13d
            r6.t(r2)
            hv2 r7 = defpackage.hv2.None
            r6.q(r7)
            goto L13d
        L6d:
            boolean r1 = defpackage.qv2.D(r7)
            if (r1 == 0) goto Lae
            android.view.inputmethod.DeleteGesture r7 = defpackage.qv2.k(r7)
            if (r6 == 0) goto L13d
            android.graphics.RectF r1 = defpackage.qv2.h(r7)
            of5 r1 = defpackage.ej2.b0(r1)
            int r7 = defpackage.qv2.a(r7)
            if (r7 == r3) goto L89
            r7 = r2
            goto L8a
        L89:
            r7 = r3
        L8a:
            long r0 = defpackage.kn2.H(r0, r1, r7)
            jt3 r7 = r6.d
            if (r7 == 0) goto L95
            r7.e(r0)
        L95:
            jt3 r7 = r6.d
            if (r7 == 0) goto L9e
            long r4 = defpackage.k47.b
            r7.f(r4)
        L9e:
            boolean r7 = defpackage.k47.c(r0)
            if (r7 != 0) goto L13d
            r6.t(r2)
            hv2 r7 = defpackage.hv2.None
            r6.q(r7)
            goto L13d
        Lae:
            boolean r1 = defpackage.rv2.m(r7)
            if (r1 == 0) goto Lf6
            android.view.inputmethod.SelectRangeGesture r7 = defpackage.rv2.j(r7)
            if (r6 == 0) goto L13d
            android.graphics.RectF r1 = defpackage.rv2.g(r7)
            of5 r1 = defpackage.ej2.b0(r1)
            android.graphics.RectF r4 = defpackage.rv2.o(r7)
            of5 r4 = defpackage.ej2.b0(r4)
            int r7 = defpackage.qv2.d(r7)
            if (r7 == r3) goto Ld2
            r7 = r2
            goto Ld3
        Ld2:
            r7 = r3
        Ld3:
            long r0 = defpackage.kn2.m(r0, r1, r4, r7)
            jt3 r7 = r6.d
            if (r7 == 0) goto Lde
            r7.f(r0)
        Lde:
            jt3 r7 = r6.d
            if (r7 == 0) goto Le7
            long r4 = defpackage.k47.b
            r7.e(r4)
        Le7:
            boolean r7 = defpackage.k47.c(r0)
            if (r7 != 0) goto L13d
            r6.t(r2)
            hv2 r7 = defpackage.hv2.None
            r6.q(r7)
            goto L13d
        Lf6:
            boolean r1 = defpackage.rv2.q(r7)
            if (r1 == 0) goto L148
            android.view.inputmethod.DeleteRangeGesture r7 = defpackage.rv2.i(r7)
            if (r6 == 0) goto L13d
            android.graphics.RectF r1 = defpackage.qv2.i(r7)
            of5 r1 = defpackage.ej2.b0(r1)
            android.graphics.RectF r4 = defpackage.qv2.x(r7)
            of5 r4 = defpackage.ej2.b0(r4)
            int r7 = defpackage.qv2.b(r7)
            if (r7 == r3) goto L11a
            r7 = r2
            goto L11b
        L11a:
            r7 = r3
        L11b:
            long r0 = defpackage.kn2.m(r0, r1, r4, r7)
            jt3 r7 = r6.d
            if (r7 == 0) goto L126
            r7.e(r0)
        L126:
            jt3 r7 = r6.d
            if (r7 == 0) goto L12f
            long r4 = defpackage.k47.b
            r7.f(r4)
        L12f:
            boolean r7 = defpackage.k47.c(r0)
            if (r7 != 0) goto L13d
            r6.t(r2)
            hv2 r7 = defpackage.hv2.None
            r6.q(r7)
        L13d:
            if (r8 == 0) goto L147
            ex0 r7 = new ex0
            r7.<init>(r6, r3)
            r8.setOnCancelListener(r7)
        L147:
            return r3
        L148:
            return r2
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
            boolean r0 = r9.k
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
            s63 r9 = r9.a
            java.lang.Object r9 = r9.B
            kt3 r9 = (defpackage.kt3) r9
            ft3 r9 = r9.m
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
            boolean r0 = r1.k
            if (r0 == 0) goto L17
            s63 r1 = r1.a
            java.lang.Object r1 = r1.B
            kt3 r1 = (defpackage.kt3) r1
            go3 r1 = r1.k
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
            boolean r0 = r2.k
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
            boolean r0 = r2.k
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
            boolean r0 = r1.k
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
