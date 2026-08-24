package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wv6  reason: default package */
/* loaded from: classes.dex */
public final class wv6 implements java.io.Closeable {
    public final java.lang.Object A;
    public final android.view.Surface B;
    public final int L;
    public final android.util.Size R;
    public final float[] X;
    public final float[] Y;
    public defpackage.b31 Z;
    public java.util.concurrent.Executor d0;
    public boolean e0;
    public boolean f0;
    public final defpackage.tb0 g0;
    public final defpackage.qb0 h0;

    public wv6(android.view.Surface r7, int r8, android.util.Size r9, defpackage.zy r10, defpackage.zy r11) {
            r6 = this;
            java.lang.String r0 = "SurfaceOutputImpl close future complete"
            r6.<init>()
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r6.A = r1
            r1 = 16
            float[] r2 = new float[r1]
            r6.X = r2
            float[] r3 = new float[r1]
            r6.Y = r3
            float[] r4 = new float[r1]
            float[] r1 = new float[r1]
            r5 = 0
            r6.e0 = r5
            r6.f0 = r5
            r6.B = r7
            r6.L = r8
            r6.R = r9
            e(r2, r4, r10)
            e(r3, r1, r11)
            qb0 r7 = new qb0
            r7.<init>()
            hl5 r8 = new hl5
            r8.<init>()
            r7.c = r8
            tb0 r8 = new tb0
            r8.<init>(r7)
            r7.b = r8
            r6.h0 = r7     // Catch: java.lang.Exception -> L43
            r7.a = r0     // Catch: java.lang.Exception -> L43
            goto L47
        L43:
            r7 = move-exception
            r8.b(r7)
        L47:
            r6.g0 = r8
            return
    }

    public static void e(float[] r13, float[] r14, defpackage.zy r15) {
            r0 = 0
            android.opengl.Matrix.setIdentityM(r13, r0)
            if (r15 != 0) goto L7
            return
        L7:
            android.util.Size r1 = r15.a
            boolean r2 = r15.e
            int r3 = r15.d
            defpackage.kj2.U(r13)
            float r4 = (float) r3
            defpackage.kj2.T(r4, r13)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L21
            android.opengl.Matrix.translateM(r13, r0, r6, r5, r5)
            android.opengl.Matrix.scaleM(r13, r0, r4, r6, r6)
        L21:
            android.util.Size r7 = defpackage.k97.g(r3, r1)
            android.graphics.RectF r1 = defpackage.k97.h(r1)
            android.graphics.RectF r8 = defpackage.k97.h(r7)
            android.graphics.Matrix r1 = defpackage.k97.a(r1, r8, r3, r2)
            android.graphics.RectF r2 = new android.graphics.RectF
            android.graphics.Rect r3 = r15.b
            r2.<init>(r3)
            r1.mapRect(r2)
            float r1 = r2.left
            int r3 = r7.getWidth()
            float r3 = (float) r3
            float r1 = r1 / r3
            int r3 = r7.getHeight()
            float r3 = (float) r3
            float r8 = r2.height()
            float r3 = r3 - r8
            float r8 = r2.top
            float r3 = r3 - r8
            int r8 = r7.getHeight()
            float r8 = (float) r8
            float r3 = r3 / r8
            float r8 = r2.width()
            int r9 = r7.getWidth()
            float r9 = (float) r9
            float r8 = r8 / r9
            float r2 = r2.height()
            int r7 = r7.getHeight()
            float r7 = (float) r7
            float r2 = r2 / r7
            android.opengl.Matrix.translateM(r13, r0, r1, r3, r5)
            android.opengl.Matrix.scaleM(r13, r0, r8, r2, r6)
            eg0 r15 = r15.c
            android.opengl.Matrix.setIdentityM(r14, r0)
            defpackage.kj2.U(r14)
            if (r15 == 0) goto L9b
            boolean r1 = r15.o()
            java.lang.String r2 = "Camera has no transform."
            defpackage.np2.A(r2, r1)
            zf0 r1 = r15.a()
            int r1 = r1.b()
            float r1 = (float) r1
            defpackage.kj2.T(r1, r14)
            boolean r15 = r15.c()
            if (r15 == 0) goto L9b
            android.opengl.Matrix.translateM(r14, r0, r6, r5, r5)
            android.opengl.Matrix.scaleM(r14, r0, r4, r6, r6)
        L9b:
            android.opengl.Matrix.invertM(r14, r0, r14, r0)
            r10 = 0
            r12 = 0
            r8 = 0
            r11 = r13
            r7 = r13
            r9 = r14
            android.opengl.Matrix.multiplyMM(r7, r8, r9, r10, r11, r12)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            java.lang.Object r0 = r2.A
            monitor-enter(r0)
            boolean r1 = r2.f0     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            r1 = 1
            r2.f0 = r1     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r2 = move-exception
            goto L15
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            qb0 r2 = r2.h0
            r0 = 0
            r2.a(r0)
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    public final android.view.Surface h(defpackage.ov2 r2, defpackage.b31 r3) {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            r1.d0 = r2     // Catch: java.lang.Throwable -> L12
            r1.Z = r3     // Catch: java.lang.Throwable -> L12
            boolean r2 = r1.e0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto Lf
            r1.k()
        Lf:
            android.view.Surface r1 = r1.B
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    public final void k() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            java.lang.Object r1 = r4.A
            monitor-enter(r1)
            java.util.concurrent.Executor r2 = r4.d0     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L20
            b31 r2 = r4.Z     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L11
            goto L20
        L11:
            boolean r3 = r4.f0     // Catch: java.lang.Throwable -> L1e
            if (r3 != 0) goto L23
            r0.set(r2)     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.Executor r2 = r4.d0     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            r4.e0 = r3     // Catch: java.lang.Throwable -> L1e
            goto L24
        L1e:
            r4 = move-exception
            goto L45
        L20:
            r2 = 1
            r4.e0 = r2     // Catch: java.lang.Throwable -> L1e
        L23:
            r2 = 0
        L24:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L44
            q64 r1 = new q64     // Catch: java.util.concurrent.RejectedExecutionException -> L31
            r3 = 7
            r1.<init>(r3, r4, r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L31
            r2.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L31
            return
        L31:
            r4 = move-exception
            java.lang.String r0 = "SurfaceOutputImpl"
            java.lang.String r1 = "Processor executor closed. Close request not posted."
            java.lang.String r0 = defpackage.kj2.c0(r0)
            r2 = 3
            boolean r2 = defpackage.kj2.J(r2, r0)
            if (r2 == 0) goto L44
            android.util.Log.d(r0, r1, r4)
        L44:
            return
        L45:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r4
    }
}
