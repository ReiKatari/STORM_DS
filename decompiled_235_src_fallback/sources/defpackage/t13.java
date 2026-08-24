package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t13  reason: default package */
/* loaded from: classes.dex */
public abstract class t13 implements defpackage.u23 {
    public defpackage.h61 A;
    public volatile int B;
    public volatile int L;
    public volatile int R;
    public volatile boolean X;
    public volatile boolean Y;
    public java.util.concurrent.Executor Z;
    public defpackage.re5 d0;
    public android.media.ImageWriter e0;
    public android.graphics.Rect f0;
    public android.graphics.Rect g0;
    public android.graphics.Matrix h0;
    public android.graphics.Matrix i0;
    public java.nio.ByteBuffer j0;
    public java.nio.ByteBuffer k0;
    public java.nio.ByteBuffer l0;
    public java.nio.ByteBuffer m0;
    public java.nio.ByteBuffer n0;
    public java.nio.ByteBuffer o0;
    public final java.lang.Object p0;
    public boolean q0;

    public t13() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.R = r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.f0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.g0 = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r2.h0 = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r2.i0 = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.p0 = r1
            r2.q0 = r0
            return
    }

    public abstract defpackage.s23 a(defpackage.v23 r1);

    @Override // defpackage.u23
    public final void b(defpackage.v23 r2) {
            r1 = this;
            s23 r2 = r1.a(r2)     // Catch: java.lang.IllegalStateException -> La
            if (r2 == 0) goto L9
            r1.f(r2)     // Catch: java.lang.IllegalStateException -> La
        L9:
            return
        La:
            r1 = move-exception
            java.lang.String r2 = "ImageAnalysisAnalyzer"
            java.lang.String r0 = "Failed to acquire image."
            defpackage.kj2.w(r2, r0, r1)
            return
    }

    public final defpackage.gx3 c(defpackage.s23 r18) {
            r17 = this;
            r1 = r17
            r2 = r18
            boolean r0 = r1.X
            if (r0 == 0) goto Lc
            int r0 = r1.B
            r8 = r0
            goto Ld
        Lc:
            r8 = 0
        Ld:
            java.lang.Object r3 = r1.p0
            monitor-enter(r3)
            java.util.concurrent.Executor r10 = r1.Z     // Catch: java.lang.Throwable -> L1f
            h61 r0 = r1.A     // Catch: java.lang.Throwable -> L1f
            boolean r4 = r1.X     // Catch: java.lang.Throwable -> L1f
            r11 = 1
            if (r4 == 0) goto L23
            int r4 = r1.L     // Catch: java.lang.Throwable -> L1f
            if (r8 == r4) goto L23
            r12 = r11
            goto L24
        L1f:
            r0 = move-exception
            r14 = r3
            goto L122
        L23:
            r12 = 0
        L24:
            if (r12 == 0) goto L29
            r1.h(r2, r8)     // Catch: java.lang.Throwable -> L1f
        L29:
            boolean r4 = r1.X     // Catch: java.lang.Throwable -> L1f
            r5 = 3
            if (r4 != 0) goto L35
            int r4 = r1.R     // Catch: java.lang.Throwable -> L1f
            if (r4 != r5) goto L33
            goto L35
        L33:
            r4 = r3
            goto L39
        L35:
            r17.e(r18)     // Catch: java.lang.Throwable -> L1f
            goto L33
        L39:
            re5 r3 = r1.d0     // Catch: java.lang.Throwable -> L120
            r6 = r4
            android.media.ImageWriter r4 = r1.e0     // Catch: java.lang.Throwable -> L11d
            java.nio.ByteBuffer r7 = r1.j0     // Catch: java.lang.Throwable -> L11d
            r13 = r5
            java.nio.ByteBuffer r5 = r1.k0     // Catch: java.lang.Throwable -> L11d
            r14 = r6
            java.nio.ByteBuffer r6 = r1.l0     // Catch: java.lang.Throwable -> L11b
            java.nio.ByteBuffer r15 = r1.m0     // Catch: java.lang.Throwable -> L11b
            r16 = r6
            java.nio.ByteBuffer r6 = r1.n0     // Catch: java.lang.Throwable -> L11b
            java.nio.ByteBuffer r9 = r1.o0     // Catch: java.lang.Throwable -> L11b
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L11b
            if (r0 == 0) goto L10e
            if (r10 == 0) goto L10e
            boolean r14 = r1.q0
            if (r14 == 0) goto L10e
            int r14 = r1.R
            if (r3 == 0) goto L81
            r6 = 2
            if (r14 != r6) goto L66
            boolean r4 = r1.Y
            x13 r3 = androidx.camera.core.ImageProcessingUtil.b(r2, r3, r7, r8, r4)
        L64:
            r2 = r3
            goto La1
        L66:
            int r6 = r1.R
            if (r6 != r11) goto La0
            boolean r6 = r1.Y
            if (r6 == 0) goto L71
            androidx.camera.core.ImageProcessingUtil.a(r2)
        L71:
            if (r4 == 0) goto La0
            if (r5 == 0) goto La0
            if (r16 == 0) goto La0
            if (r15 == 0) goto La0
            r7 = r15
            r6 = r16
            x13 r3 = androidx.camera.core.ImageProcessingUtil.f(r2, r3, r4, r5, r6, r7, r8)
            goto L64
        L81:
            r3 = r5
            r5 = r15
            if (r14 != r13) goto La0
            boolean r2 = r1.Y
            if (r2 == 0) goto L8c
            androidx.camera.core.ImageProcessingUtil.a(r18)
        L8c:
            if (r3 == 0) goto La0
            if (r16 == 0) goto La0
            if (r5 == 0) goto La0
            if (r6 == 0) goto La0
            if (r9 == 0) goto La0
            r2 = r18
            r7 = r9
            r4 = r16
            x13 r3 = androidx.camera.core.ImageProcessingUtil.g(r2, r3, r4, r5, r6, r7, r8)
            goto L64
        La0:
            r2 = 0
        La1:
            if (r2 != 0) goto La5
            r9 = r11
            goto La6
        La5:
            r9 = 0
        La6:
            if (r9 == 0) goto Lab
            r4 = r18
            goto Lac
        Lab:
            r4 = r2
        Lac:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            java.lang.Object r2 = r1.p0
            monitor-enter(r2)
            if (r12 == 0) goto Ld3
            if (r9 != 0) goto Ld3
            int r6 = r18.getWidth()     // Catch: java.lang.Throwable -> Ld1
            int r7 = r18.getHeight()     // Catch: java.lang.Throwable -> Ld1
            int r9 = r4.getWidth()     // Catch: java.lang.Throwable -> Ld1
            int r11 = r4.getHeight()     // Catch: java.lang.Throwable -> Ld1
            r1.g(r6, r7, r9, r11)     // Catch: java.lang.Throwable -> Ld1
            goto Ld3
        Ld1:
            r0 = move-exception
            goto L10c
        Ld3:
            r1.L = r8     // Catch: java.lang.Throwable -> Ld1
            android.graphics.Rect r6 = r1.g0     // Catch: java.lang.Throwable -> Ld1
            r5.set(r6)     // Catch: java.lang.Throwable -> Ld1
            android.graphics.Matrix r6 = r1.i0     // Catch: java.lang.Throwable -> Ld1
            r3.set(r6)     // Catch: java.lang.Throwable -> Ld1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld1
            qb0 r7 = new qb0
            r7.<init>()
            hl5 r2 = new hl5
            r2.<init>()
            r7.c = r2
            tb0 r8 = new tb0
            r8.<init>(r7)
            r7.b = r8
            java.lang.Class<i61> r2 = defpackage.i61.class
            r7.a = r2
            r6 = r0
            s13 r0 = new s13     // Catch: java.lang.Exception -> L107
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L107
            r10.execute(r0)     // Catch: java.lang.Exception -> L107
            java.lang.String r0 = "analyzeImage"
            r7.a = r0     // Catch: java.lang.Exception -> L107
            return r8
        L107:
            r0 = move-exception
            r8.b(r0)
            return r8
        L10c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld1
            throw r0
        L10e:
            ug r0 = new ug
            java.lang.String r1 = "No analyzer or executor currently set."
            r0.<init>(r1)
            n33 r1 = new n33
            r1.<init>(r0, r11)
            return r1
        L11b:
            r0 = move-exception
            goto L122
        L11d:
            r0 = move-exception
            r14 = r6
            goto L122
        L120:
            r0 = move-exception
            r14 = r4
        L122:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L11b
            throw r0
    }

    public abstract void d();

    public final void e(defpackage.s23 r6) {
            r5 = this;
            int r0 = r5.R
            r1 = 1
            r2 = 2
            r3 = 3
            if (r0 == r1) goto L26
            int r0 = r5.R
            if (r0 != r3) goto Lc
            goto L26
        Lc:
            int r0 = r5.R
            if (r0 != r2) goto La8
            java.nio.ByteBuffer r0 = r5.j0
            if (r0 != 0) goto La8
            int r0 = r6.getWidth()
            int r6 = r6.getHeight()
            int r6 = r6 * r0
            int r6 = r6 * 4
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocateDirect(r6)
            r5.j0 = r6
            return
        L26:
            java.nio.ByteBuffer r0 = r5.k0
            if (r0 != 0) goto L39
            int r0 = r6.getWidth()
            int r1 = r6.getHeight()
            int r1 = r1 * r0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r1)
            r5.k0 = r0
        L39:
            java.nio.ByteBuffer r0 = r5.k0
            r1 = 0
            r0.position(r1)
            java.nio.ByteBuffer r0 = r5.l0
            if (r0 != 0) goto L54
            int r0 = r6.getWidth()
            int r4 = r6.getHeight()
            int r4 = r4 * r0
            int r4 = r4 / 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r4)
            r5.l0 = r0
        L54:
            java.nio.ByteBuffer r0 = r5.l0
            r0.position(r1)
            java.nio.ByteBuffer r0 = r5.m0
            if (r0 != 0) goto L6e
            int r0 = r6.getWidth()
            int r4 = r6.getHeight()
            int r4 = r4 * r0
            int r4 = r4 / 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r4)
            r5.m0 = r0
        L6e:
            java.nio.ByteBuffer r0 = r5.m0
            r0.position(r1)
            int r0 = r5.R
            if (r0 != r3) goto La8
            java.nio.ByteBuffer r0 = r5.n0
            if (r0 != 0) goto L8a
            int r0 = r6.getWidth()
            int r3 = r6.getHeight()
            int r3 = r3 * r0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r3)
            r5.n0 = r0
        L8a:
            java.nio.ByteBuffer r0 = r5.n0
            r0.position(r1)
            java.nio.ByteBuffer r0 = r5.o0
            if (r0 != 0) goto La3
            int r0 = r6.getWidth()
            int r6 = r6.getHeight()
            int r6 = r6 * r0
            int r6 = r6 / r2
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocateDirect(r6)
            r5.o0 = r6
        La3:
            java.nio.ByteBuffer r5 = r5.o0
            r5.position(r1)
        La8:
            return
    }

    public abstract void f(defpackage.s23 r1);

    public final void g(int r5, int r6, int r7, int r8) {
            r4 = this;
            int r0 = r4.B
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            if (r0 <= 0) goto L2e
            android.graphics.RectF r2 = new android.graphics.RectF
            float r5 = (float) r5
            float r6 = (float) r6
            r3 = 0
            r2.<init>(r3, r3, r5, r6)
            android.graphics.RectF r5 = defpackage.k97.a
            android.graphics.Matrix$ScaleToFit r6 = android.graphics.Matrix.ScaleToFit.FILL
            r1.setRectToRect(r2, r5, r6)
            float r0 = (float) r0
            r1.postRotate(r0)
            android.graphics.RectF r0 = new android.graphics.RectF
            float r7 = (float) r7
            float r8 = (float) r8
            r0.<init>(r3, r3, r7, r8)
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            r7.setRectToRect(r5, r0, r6)
            r1.postConcat(r7)
        L2e:
            android.graphics.Rect r5 = r4.f0
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r5)
            r1.mapRect(r6)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r6.round(r5)
            r4.g0 = r5
            android.graphics.Matrix r5 = r4.i0
            android.graphics.Matrix r4 = r4.h0
            r5.setConcat(r4, r1)
            return
    }

    public final void h(defpackage.s23 r6, int r7) {
            r5 = this;
            re5 r0 = r5.d0
            if (r0 != 0) goto L5
            goto L5a
        L5:
            r0.i()
            int r0 = r6.getWidth()
            int r6 = r6.getHeight()
            re5 r1 = r5.d0
            int r1 = r1.b()
            re5 r2 = r5.d0
            int r2 = r2.f()
            r3 = 90
            r4 = 1
            if (r7 == r3) goto L28
            r3 = 270(0x10e, float:3.78E-43)
            if (r7 != r3) goto L26
            goto L28
        L26:
            r7 = 0
            goto L29
        L28:
            r7 = r4
        L29:
            if (r7 == 0) goto L2d
            r3 = r6
            goto L2e
        L2d:
            r3 = r0
        L2e:
            if (r7 == 0) goto L31
            goto L32
        L31:
            r0 = r6
        L32:
            re5 r6 = new re5
            ci r7 = defpackage.ln2.l(r3, r0, r1, r2)
            r6.<init>(r7)
            r5.d0 = r6
            int r6 = r5.R
            if (r6 != r4) goto L5a
            android.media.ImageWriter r6 = r5.e0
            if (r6 == 0) goto L48
            r6.close()
        L48:
            re5 r6 = r5.d0
            android.view.Surface r6 = r6.getSurface()
            re5 r7 = r5.d0
            int r7 = r7.f()
            android.media.ImageWriter r6 = android.media.ImageWriter.newInstance(r6, r7)
            r5.e0 = r6
        L5a:
            return
    }

    public final void i(android.graphics.Matrix r3) {
            r2 = this;
            java.lang.Object r0 = r2.p0
            monitor-enter(r0)
            r2.h0 = r3     // Catch: java.lang.Throwable -> L10
            android.graphics.Matrix r3 = new android.graphics.Matrix     // Catch: java.lang.Throwable -> L10
            android.graphics.Matrix r1 = r2.h0     // Catch: java.lang.Throwable -> L10
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L10
            r2.i0 = r3     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public final void j(android.graphics.Rect r3) {
            r2 = this;
            java.lang.Object r0 = r2.p0
            monitor-enter(r0)
            r2.f0 = r3     // Catch: java.lang.Throwable -> L10
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L10
            android.graphics.Rect r1 = r2.f0     // Catch: java.lang.Throwable -> L10
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L10
            r2.g0 = r3     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }
}
