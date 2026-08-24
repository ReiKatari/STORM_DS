package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r87  reason: default package */
/* loaded from: classes.dex */
public final class r87 implements defpackage.gi7 {
    public final defpackage.op6 a;
    public defpackage.li7 b;
    public final boolean c;
    public defpackage.q87 d;
    public final defpackage.s94 e;
    public final boolean f;
    public final int g;
    public final defpackage.s94 h;
    public defpackage.tu0 i;
    public defpackage.tu0 j;

    public r87(defpackage.sg0 r5, defpackage.op6 r6, defpackage.kj7 r7) {
            r4 = this;
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r4.<init>()
            r4.a = r6
            boolean r6 = defpackage.nc1.V(r5)
            r4.c = r6
            s94 r6 = new s94
            r7 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r6.<init>(r0)
            r4.e = r6
            kg0 r6 = defpackage.lg0.g
            lg0 r5 = r5.b
            r6.getClass()
            r5.getClass()
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 1
            r1 = 35
            if (r6 < r1) goto L4a
            android.hardware.camera2.CameraCharacteristics$Key r2 = defpackage.xp.o()
            r2.getClass()
            r3 = r5
            qc0 r3 = (defpackage.qc0) r3
            java.lang.Object r2 = r3.c(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L4a
            int r2 = r2.intValue()
            if (r2 <= r0) goto L4a
            r7 = r0
        L4a:
            r4.f = r7
            if (r6 < r1) goto L64
            android.hardware.camera2.CameraCharacteristics$Key r7 = defpackage.xp.a()
            r7.getClass()
            r2 = r5
            qc0 r2 = (defpackage.qc0) r2
            java.lang.Object r7 = r2.c(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L64
            int r0 = r7.intValue()
        L64:
            r4.g = r0
            if (r6 < r1) goto L77
            android.hardware.camera2.CameraCharacteristics$Key r6 = defpackage.xp.o()
            r6.getClass()
            qc0 r5 = (defpackage.qc0) r5
            java.lang.Object r5 = r5.c(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
        L77:
            s94 r5 = new s94
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r5.<init>(r6)
            r4.h = r5
            return
    }

    public final defpackage.tu0 a(int r7, boolean r8, boolean r9) {
            r6 = this;
            op6 r0 = r6.a
            java.lang.String r1 = "CXCP"
            boolean r2 = defpackage.kj2.F(r1)
            if (r2 == 0) goto L2e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "TorchControl#setTorchAsync: torch mode = "
            r2.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "TorchMode(value="
            r3.<init>(r4)
            r3.append(r7)
            r4 = 41
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r1, r2)
        L2e:
            tu0 r2 = new tu0
            r2.<init>()
            if (r9 != 0) goto L44
            boolean r9 = r6.c
            if (r9 != 0) goto L44
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "No flash unit"
            r6.<init>(r7)
            r2.v0(r6)
            return r2
        L44:
            li7 r9 = r6.b
            if (r9 == 0) goto Le6
            r6.c(r7)
            tu0 r3 = r6.i
            r4 = 0
            if (r8 == 0) goto L5a
            if (r3 == 0) goto L57
            java.lang.String r8 = "There is a new enableTorch being set"
            defpackage.i61.A(r8, r3)
        L57:
            r6.i = r4
            goto L5f
        L5a:
            if (r3 == 0) goto L5f
            defpackage.nc1.a0(r2, r3)
        L5f:
            r6.i = r2
            r8 = 0
            r3 = 1
            if (r7 != 0) goto L67
            r5 = r3
            goto L68
        L67:
            r5 = r8
        L68:
            if (r5 != 0) goto L6e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L6e:
            java.lang.Object r5 = r0.d
            monitor-enter(r5)
            r0.k = r4     // Catch: java.lang.Throwable -> Le3
            monitor-exit(r5)
            r0.f()
            java.util.List r4 = defpackage.oa.b
            int r4 = r0.e()
            oa r4 = defpackage.nc1.N(r4)
            if (r4 == 0) goto L86
            int r0 = r4.a
            goto La7
        L86:
            boolean r4 = defpackage.kj2.L()
            if (r4 == 0) goto La6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "TorchControl#setTorchAsync: Failed to convert ae mode of value "
            r4.<init>(r5)
            int r0 = r0.e()
            r4.append(r0)
            java.lang.String r0 = " with AeMode.fromIntOrNull, fallback to AeMode.ON"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.w(r1, r0)
        La6:
            r0 = r3
        La7:
            if (r7 != 0) goto Laa
            r8 = r3
        Laa:
            if (r8 != 0) goto Lca
            if (r7 != r3) goto Lc0
            s94 r7 = r6.h
            java.lang.Object r7 = r7.c()
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto Lc5
            int r7 = r7.intValue()
            r6.d(r7)
            goto Lc5
        Lc0:
            int r7 = r6.g
            r6.d(r7)
        Lc5:
            jg1 r6 = r9.a()
            goto Lce
        Lca:
            jg1 r6 = r9.e(r0)
        Lce:
            h37 r7 = new h37
            r8 = 5
            r7.<init>(r8)
            r6.getClass()
            t00 r8 = new t00
            r9 = 6
            r8.<init>(r6, r2, r7, r9)
            ed3 r6 = (defpackage.ed3) r6
            r6.a0(r8)
            return r2
        Le3:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        Le6:
            java.lang.String r6 = "Camera is not active."
            defpackage.i61.A(r6, r2)
            return r2
    }

    @Override // defpackage.gi7
    public final void b(defpackage.li7 r3) {
            r2 = this;
            r2.b = r3
            q87 r3 = r2.d
            if (r3 == 0) goto L1e
            s94 r3 = r2.e
            java.lang.Object r3 = r3.c()
            java.lang.Integer r3 = (java.lang.Integer) r3
            r0 = 0
            if (r3 != 0) goto L12
            goto L1a
        L12:
            int r3 = r3.intValue()
            r1 = 1
            if (r3 != r1) goto L1a
            goto L1b
        L1a:
            r1 = r0
        L1b:
            r2.a(r1, r0, r0)
        L1e:
            return
    }

    public final void c(int r2) {
            r1 = this;
            q87 r0 = new q87
            r0.<init>(r2)
            r1.d = r0
            r0 = 1
            if (r2 != r0) goto Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            boolean r2 = defpackage.nj2.x()
            s94 r1 = r1.e
            if (r2 == 0) goto L1c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.f(r2)
            return
        L1c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.g(r2)
            return
    }

    public final void d(int r4) {
            r3 = this;
            tu0 r0 = new tu0
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 < r2) goto L4d
            boolean r1 = r3.f
            if (r1 == 0) goto L4d
            tu0 r1 = r3.j
            if (r1 == 0) goto L1d
            if (r1 == 0) goto L1a
            java.lang.String r2 = "There is a new torch strength being set"
            defpackage.i61.A(r2, r1)
        L1a:
            r1 = 0
            r3.j = r1
        L1d:
            r3.j = r0
            ro5 r1 = new ro5
            r2 = 22
            r1.<init>(r3, r2)
            r0.a0(r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            android.hardware.camera2.CaptureRequest$Key r2 = defpackage.xp.d()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.put(r2, r4)
            li7 r3 = r3.b
            if (r3 == 0) goto L47
            jg1 r3 = defpackage.li7.b(r3, r1)
            if (r3 == 0) goto L47
            defpackage.nc1.a0(r3, r0)
            return
        L47:
            java.lang.String r3 = "Camera is not active."
            defpackage.i61.A(r3, r0)
            return
        L4d:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "Configuring torch strength is not supported on the device."
            r3.<init>(r4)
            r0.v0(r3)
            return
    }

    @Override // defpackage.gi7
    public final void reset() {
            r3 = this;
            tu0 r0 = r3.i
            if (r0 == 0) goto L9
            java.lang.String r1 = "There is a new enableTorch being set"
            defpackage.i61.A(r1, r0)
        L9:
            r0 = 0
            r3.i = r0
            tu0 r1 = r3.j
            if (r1 == 0) goto L15
            java.lang.String r2 = "There is a new torch strength being set"
            defpackage.i61.A(r2, r1)
        L15:
            r3.j = r0
            q87 r1 = r3.d
            if (r1 == 0) goto L25
            r1 = 0
            r3.c(r1)
            r2 = 1
            r3.a(r1, r2, r1)
            r3.d = r0
        L25:
            return
    }
}
