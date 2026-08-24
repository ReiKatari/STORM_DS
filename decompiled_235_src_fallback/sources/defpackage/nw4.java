package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nw4  reason: default package */
/* loaded from: classes.dex */
public final class nw4 implements me.magnum.melonds.common.camera.DSiCameraSource {
    public final android.content.Context a;
    public final defpackage.iu3 b;
    public final defpackage.uv4 c;
    public final defpackage.o41 d;
    public defpackage.f35 e;
    public final defpackage.zb f;
    public final java.util.concurrent.ExecutorService g;
    public final android.os.Handler h;
    public final float[] i;
    public final float[] j;

    public nw4(android.content.Context r1, defpackage.iu3 r2, defpackage.uv4 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            xe1 r1 = defpackage.xk1.a
            jv2 r1 = defpackage.e04.a
            jv2 r1 = r1.Y
            o41 r1 = defpackage.g04.i(r1)
            r0.d = r1
            zb r1 = new zb
            r2 = 3
            r3 = 0
            r1.<init>(r2, r3)
            r0.f = r1
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r0.g = r1
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.h = r1
            r1 = 614400(0x96000, float:8.60958E-40)
            float[] r2 = new float[r1]
            r0.i = r2
            float[] r1 = new float[r1]
            r0.j = r1
            return
    }

    public final void a(int r12) {
            r11 = this;
            f35 r0 = defpackage.f35.b
            android.content.Context r0 = r11.a
            f35 r1 = defpackage.f35.b
            ci0 r1 = r1.a
            java.lang.Object r2 = r1.a
            monitor-enter(r2)
            java.lang.Object r3 = defpackage.q41.a     // Catch: java.lang.Throwable -> Ldc
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Ldc
            r4 = 34
            r5 = 0
            if (r3 < r4) goto L19
            int r4 = defpackage.c2.f(r0)     // Catch: java.lang.Throwable -> Ldc
            goto L1a
        L19:
            r4 = r5
        L1a:
            java.util.LinkedHashMap r6 = defpackage.xt3.a     // Catch: java.lang.Throwable -> Ldc
            monitor-enter(r6)     // Catch: java.lang.Throwable -> Ldc
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r7 = r6.get(r4)     // Catch: java.lang.Throwable -> L30
            if (r7 != 0) goto L33
            zt3 r7 = new zt3     // Catch: java.lang.Throwable -> L30
            r7.<init>()     // Catch: java.lang.Throwable -> L30
            r6.put(r4, r7)     // Catch: java.lang.Throwable -> L30
            goto L33
        L30:
            r11 = move-exception
            goto Lde
        L33:
            zt3 r7 = (defpackage.zt3) r7     // Catch: java.lang.Throwable -> L30
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ldc
            r1.e = r7     // Catch: java.lang.Throwable -> Ldc
            java.lang.Object r4 = r1.b     // Catch: java.lang.Throwable -> Ldc
            to2 r4 = (defpackage.to2) r4     // Catch: java.lang.Throwable -> Ldc
            r6 = 23
            if (r4 == 0) goto L42
        L40:
            monitor-exit(r2)
            goto La2
        L42:
            gj0 r4 = new gj0     // Catch: java.lang.Throwable -> Ldc
            r7 = 0
            r4.<init>(r0, r7)     // Catch: java.lang.Throwable -> Ldc
            java.lang.Object r7 = r1.c     // Catch: java.lang.Throwable -> Ldc
            gx3 r7 = (defpackage.gx3) r7     // Catch: java.lang.Throwable -> Ldc
            boolean r8 = r7 instanceof defpackage.to2     // Catch: java.lang.Throwable -> Ldc
            if (r8 == 0) goto L53
            to2 r7 = (defpackage.to2) r7     // Catch: java.lang.Throwable -> Ldc
            goto L59
        L53:
            to2 r8 = new to2     // Catch: java.lang.Throwable -> Ldc
            r8.<init>(r7)     // Catch: java.lang.Throwable -> Ldc
            r7 = r8
        L59:
            bg2 r8 = new bg2     // Catch: java.lang.Throwable -> Ldc
            r9 = 10
            r8.<init>(r4, r9)     // Catch: java.lang.Throwable -> Ldc
            h61 r9 = new h61     // Catch: java.lang.Throwable -> Ldc
            r10 = 12
            r9.<init>(r8, r10)     // Catch: java.lang.Throwable -> Ldc
            uj1 r8 = defpackage.u24.j()     // Catch: java.lang.Throwable -> Ldc
            ll0 r7 = defpackage.l.T(r7, r9, r8)     // Catch: java.lang.Throwable -> Ldc
            t00 r8 = new t00     // Catch: java.lang.Throwable -> Ldc
            r8.<init>(r1, r4, r0)     // Catch: java.lang.Throwable -> Ldc
            h61 r0 = new h61     // Catch: java.lang.Throwable -> Ldc
            r4 = 13
            r0.<init>(r8, r4)     // Catch: java.lang.Throwable -> Ldc
            uj1 r4 = defpackage.u24.j()     // Catch: java.lang.Throwable -> Ldc
            d51 r8 = new d51     // Catch: java.lang.Throwable -> Ldc
            r8.<init>(r0, r6)     // Catch: java.lang.Throwable -> Ldc
            ll0 r0 = defpackage.l.T(r7, r8, r4)     // Catch: java.lang.Throwable -> Ldc
            r1.b = r0     // Catch: java.lang.Throwable -> Ldc
            s63 r4 = new s63     // Catch: java.lang.Throwable -> Ldc
            r7 = 11
            r4.<init>(r1, r7)     // Catch: java.lang.Throwable -> Ldc
            uj1 r1 = defpackage.u24.j()     // Catch: java.lang.Throwable -> Ldc
            uo2 r7 = new uo2     // Catch: java.lang.Throwable -> Ldc
            r7.<init>(r5, r0, r4)     // Catch: java.lang.Throwable -> Ldc
            r0.a(r1, r7)     // Catch: java.lang.Throwable -> Ldc
            gx3 r4 = defpackage.l.F(r0)     // Catch: java.lang.Throwable -> Ldc
            goto L40
        La2:
            dv4 r0 = new dv4
            r1 = 4
            r0.<init>(r1)
            u34 r0 = new u34
            r0.<init>()
            uj1 r1 = defpackage.u24.j()
            d51 r2 = new d51
            r2.<init>(r0, r6)
            ll0 r0 = defpackage.l.T(r4, r2, r1)
            xd0 r1 = new xd0
            r1.<init>(r0, r11, r12)
            android.content.Context r11 = r11.a
            r12 = 28
            if (r3 < r12) goto Lca
            java.util.concurrent.Executor r11 = defpackage.pp.g(r11)
            goto Ld8
        Lca:
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r11 = r11.getMainLooper()
            r12.<init>(r11)
            d72 r11 = new d72
            r11.<init>(r12, r5)
        Ld8:
            r0.a(r11, r1)
            return
        Ldc:
            r11 = move-exception
            goto Le0
        Lde:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ldc
            throw r11     // Catch: java.lang.Throwable -> Ldc
        Le0:
            monitor-exit(r2)
            throw r11
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void captureFrame(int r1, byte[] r2, int r3, int r4, boolean r5) {
            r0 = this;
            r2.getClass()
            zb r0 = r0.f
            java.lang.Object r1 = r0.L
            byte[][] r1 = (byte[][]) r1
            int r0 = r0.B
            r0 = r1[r0]
            r1 = 0
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
            return
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void dispose() {
            r2 = this;
            o41 r0 = r2.d
            r1 = 0
            defpackage.g04.x(r0, r1)
            f35 r0 = r2.e
            if (r0 == 0) goto Lf
            ci0 r0 = r0.a
            r0.m()
        Lf:
            r2.e = r1
            java.util.concurrent.ExecutorService r2 = r2.g
            r2.shutdownNow()
            return
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final boolean isAvailable() {
            r1 = this;
            android.content.Context r1 = r1.a
            java.lang.String r0 = "camera"
            java.lang.Object r1 = r1.getSystemService(r0)
            r1.getClass()
            android.hardware.camera2.CameraManager r1 = (android.hardware.camera2.CameraManager) r1
            java.lang.String[] r1 = r1.getCameraIdList()
            r1.getClass()
            int r1 = r1.length
            r0 = 1
            if (r1 != 0) goto L1a
            r1 = r0
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r1 = r1 ^ r0
            return r1
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void startCamera(int r7) {
            r6 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r2) goto L20
            r2 = r0
        L7:
            r3 = 640(0x280, float:8.97E-43)
            if (r2 >= r3) goto L1d
            int r3 = r1 * 640
            int r3 = r3 + r2
            int r3 = r3 * 2
            float r4 = (float) r2
            float[] r5 = r6.i
            r5[r3] = r4
            int r3 = r3 + 1
            float r4 = (float) r1
            r5[r3] = r4
            int r2 = r2 + 1
            goto L7
        L1d:
            int r1 = r1 + 1
            goto L2
        L20:
            zb r1 = r6.f
            java.lang.Object r2 = r1.L
            byte[][] r2 = (byte[][]) r2
            int r1 = r1.B
            r1 = r2[r1]
            java.util.Arrays.fill(r1, r0)
            android.content.Context r0 = r6.a
            java.lang.String r1 = "android.permission.CAMERA"
            int r0 = defpackage.ge7.s(r0, r1)
            r1 = 4
            if (r0 == 0) goto L45
            l7 r0 = new l7
            r2 = 0
            r0.<init>(r6, r7, r2, r1)
            r7 = 3
            o41 r6 = r6.d
            defpackage.hv.L(r6, r2, r2, r0, r7)
            return
        L45:
            om r0 = new om
            r0.<init>(r6, r7, r1)
            android.os.Handler r6 = r6.h
            r6.post(r0)
            return
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void stopCamera(int r2) {
            r1 = this;
            rk3 r2 = new rk3
            r0 = 5
            r2.<init>(r1, r0)
            android.os.Handler r1 = r1.h
            r1.post(r2)
            return
    }
}
