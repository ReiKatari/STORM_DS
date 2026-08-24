package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dx0  reason: default package */
/* loaded from: classes.dex */
public final class dx0 implements android.view.ScrollCaptureCallback {
    public final defpackage.xa6 a;
    public final defpackage.m93 b;
    public final defpackage.s35 c;
    public final defpackage.te d;
    public final defpackage.o41 e;
    public final defpackage.fy2 f;

    public dx0(defpackage.xa6 r1, defpackage.m93 r2, defpackage.o41 r3, defpackage.s35 r4, defpackage.te r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r5
            o41 r1 = new o41
            l61 r3 = r3.B
            ak1 r4 = defpackage.ak1.B
            l61 r3 = r3.N(r4)
            r1.<init>(r3)
            r0.e = r1
            fy2 r1 = new fy2
            int r2 = r2.a()
            qc r3 = new qc
            r4 = 0
            r3.<init>(r0, r4)
            r1.<init>(r2, r3)
            r0.f = r1
            return
    }

    public static final java.lang.Object a(defpackage.dx0 r11, android.view.ScrollCaptureSession r12, defpackage.m93 r13, defpackage.s41 r14) {
            boolean r0 = r14 instanceof defpackage.cx0
            if (r0 == 0) goto L13
            r0 = r14
            cx0 r0 = (defpackage.cx0) r0
            int r1 = r0.f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f0 = r1
            goto L18
        L13:
            cx0 r0 = new cx0
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.d0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.f0
            r3 = 0
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L52
            if (r2 == r4) goto L3e
            if (r2 != r5) goto L38
            int r12 = r0.Z
            int r13 = r0.Y
            m93 r1 = r0.X
            java.lang.Object r0 = r0.R
            android.view.ScrollCaptureSession r0 = defpackage.sd0.n(r0)
            defpackage.oi2.Y(r14)
            goto Lb2
        L38:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            return r3
        L3e:
            int r12 = r0.Z
            int r13 = r0.Y
            m93 r2 = r0.X
            java.lang.Object r3 = r0.R
            android.view.ScrollCaptureSession r3 = defpackage.sd0.n(r3)
            defpackage.oi2.Y(r14)
            r14 = r13
            r13 = r2
            r2 = r12
            r12 = r3
            goto L92
        L52:
            defpackage.oi2.Y(r14)
            int r14 = r13.b
            int r2 = r13.d
            fy2 r6 = r11.f
            r0.R = r12
            r0.X = r13
            r0.Y = r14
            r0.Z = r2
            r0.f0 = r4
            int r4 = r6.a
            if (r14 > r2) goto L12e
            int r7 = r2 - r14
            if (r7 > r4) goto L122
            float r3 = (float) r14
            float r8 = r6.b
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            jg7 r9 = defpackage.jg7.a
            if (r3 < 0) goto L7e
            float r3 = (float) r2
            float r10 = (float) r4
            float r10 = r10 + r8
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 > 0) goto L7e
            goto L8f
        L7e:
            int r7 = r7 / r5
            int r7 = r7 + r14
            int r4 = r4 / r5
            int r7 = r7 - r4
            float r3 = (float) r7
            float r3 = r3 - r8
            java.lang.Object r3 = r6.b(r3, r0)
            if (r3 != r1) goto L8b
            goto L8c
        L8b:
            r3 = r9
        L8c:
            if (r3 != r1) goto L8f
            r9 = r3
        L8f:
            if (r9 != r1) goto L92
            goto Lad
        L92:
            ne r3 = defpackage.ne.o0
            r0.R = r12
            r0.X = r13
            r0.Y = r14
            r0.Z = r2
            r0.f0 = r5
            l61 r4 = r0.B
            r4.getClass()
            um r4 = defpackage.ii2.x(r4)
            java.lang.Object r0 = r4.a(r3, r0)
            if (r0 != r1) goto Lae
        Lad:
            return r1
        Lae:
            r0 = r12
            r1 = r13
            r13 = r14
            r12 = r2
        Lb2:
            fy2 r14 = r11.f
            float r2 = r14.b
            int r2 = defpackage.u24.E(r2)
            int r13 = r13 - r2
            int r14 = r14.a
            r2 = 0
            int r13 = defpackage.gi2.q(r13, r2, r14)
            fy2 r14 = r11.f
            float r3 = r14.b
            int r3 = defpackage.u24.E(r3)
            int r12 = r12 - r3
            int r14 = r14.a
            int r12 = defpackage.gi2.q(r12, r2, r14)
            int r14 = r1.a
            int r1 = r1.c
            if (r13 != r12) goto Lda
            m93 r11 = defpackage.m93.e
            return r11
        Lda:
            android.view.Surface r2 = defpackage.sd0.o(r0)
            android.graphics.Canvas r2 = r2.lockHardwareCanvas()
            r2.save()     // Catch: java.lang.Throwable -> L119
            float r3 = (float) r14     // Catch: java.lang.Throwable -> L119
            float r3 = -r3
            float r4 = (float) r13     // Catch: java.lang.Throwable -> L119
            float r4 = -r4
            r2.translate(r3, r4)     // Catch: java.lang.Throwable -> L119
            m93 r3 = r11.b     // Catch: java.lang.Throwable -> L119
            int r4 = r3.a     // Catch: java.lang.Throwable -> L119
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L119
            float r4 = -r4
            int r3 = r3.b     // Catch: java.lang.Throwable -> L119
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L119
            float r3 = -r3
            r2.translate(r4, r3)     // Catch: java.lang.Throwable -> L119
            te r3 = r11.d     // Catch: java.lang.Throwable -> L119
            android.view.View r3 = r3.getRootView()     // Catch: java.lang.Throwable -> L119
            r3.draw(r2)     // Catch: java.lang.Throwable -> L119
            android.view.Surface r0 = defpackage.sd0.B(r0)
            r0.unlockCanvasAndPost(r2)
            fy2 r11 = r11.f
            float r11 = r11.b
            int r11 = defpackage.u24.E(r11)
            m93 r0 = new m93
            int r13 = r13 + r11
            int r12 = r12 + r11
            r0.<init>(r14, r13, r1, r12)
            return r0
        L119:
            r11 = move-exception
            android.view.Surface r12 = defpackage.sd0.B(r0)
            r12.unlockCanvasAndPost(r2)
            throw r11
        L122:
            java.lang.String r11 = "Expected range ("
            java.lang.String r12 = ") to be ≤ viewportSize="
            java.lang.String r11 = defpackage.lb1.j(r11, r7, r4, r12)
            defpackage.i.f(r11)
            return r3
        L12e:
            java.lang.String r11 = "Expected min="
            java.lang.String r12 = " ≤ max="
            java.lang.String r11 = defpackage.lb1.j(r11, r14, r2, r12)
            defpackage.i.f(r11)
            return r3
    }

    public final void onScrollCaptureEnd(java.lang.Runnable r5) {
            r4 = this;
            kg4 r0 = defpackage.kg4.B
            z r1 = new z
            r2 = 23
            r3 = 0
            r1.<init>(r4, r5, r3, r2)
            r5 = 2
            o41 r4 = r4.e
            defpackage.hv.L(r4, r0, r3, r1, r5)
            return
    }

    public final void onScrollCaptureImageRequest(android.view.ScrollCaptureSession r8, android.os.CancellationSignal r9, android.graphics.Rect r10, java.util.function.Consumer r11) {
            r7 = this;
            l5 r0 = new l5
            r5 = 0
            r6 = 5
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7 = 0
            r8 = 3
            o41 r10 = r1.e
            ap6 r7 = defpackage.hv.L(r10, r7, r7, r0, r8)
            mc r8 = new mc
            r10 = 9
            r8.<init>(r9, r10)
            r7.a0(r8)
            ex0 r8 = new ex0
            r10 = 0
            r8.<init>(r7, r10)
            r9.setOnCancelListener(r8)
            return
    }

    public final void onScrollCaptureSearch(android.os.CancellationSignal r1, java.util.function.Consumer r2) {
            r0 = this;
            m93 r0 = r0.b
            android.graphics.Rect r0 = defpackage.ej2.Z(r0)
            r2.accept(r0)
            return
    }

    public final void onScrollCaptureStart(android.view.ScrollCaptureSession r1, android.os.CancellationSignal r2, java.lang.Runnable r3) {
            r0 = this;
            fy2 r1 = r0.f
            r2 = 0
            r1.b = r2
            s35 r0 = r0.c
            java.lang.Object r0 = r0.A
            vs4 r0 = (defpackage.vs4) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            r3.run()
            return
    }
}
