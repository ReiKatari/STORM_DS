package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ty7  reason: default package */
/* loaded from: classes.dex */
public final class ty7 implements defpackage.sy7 {
    public final defpackage.lg0 a;
    public final defpackage.ex6 b;
    public final defpackage.m44 c;
    public boolean d;
    public final boolean e;
    public defpackage.re5 f;
    public defpackage.o33 g;

    public ty7(defpackage.sg0 r3) {
            r2 = this;
            r2.<init>()
            lg0 r3 = r3.b
            r2.a = r3
            t46 r3 = new t46
            r0 = 26
            r3.<init>(r2, r0)
            ex6 r0 = new ex6
            r0.<init>(r3)
            r2.b = r0
            m44 r3 = new m44
            fa6 r0 = new fa6
            r1 = 22
            r0.<init>(r1)
            r3.<init>(r0)
            r2.c = r3
            java.lang.Class<androidx.camera.camera2.compat.quirk.ZslDisablerQuirk> r3 = androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.class
            y65 r0 = defpackage.si1.a()
            u65 r3 = r0.b(r3)
            if (r3 == 0) goto L31
            r3 = 1
            goto L32
        L31:
            r3 = 0
        L32:
            r2.e = r3
            return
    }

    @Override // defpackage.sy7
    public final void a() {
            r0 = this;
            r0.g()
            return
    }

    @Override // defpackage.sy7
    public final void b(defpackage.lc6 r11) {
            r10 = this;
            dk0 r0 = r11.b
            r10.g()
            boolean r1 = r10.d
            r2 = 1
            if (r1 == 0) goto Ld
            r0.L = r2
            return
        Ld:
            boolean r1 = r10.e
            if (r1 == 0) goto L14
            r0.L = r2
            return
        L14:
            kg0 r1 = defpackage.lg0.g
            r1.getClass()
            lg0 r1 = r10.a
            r1.getClass()
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            r3.getClass()
            qc0 r1 = (defpackage.qc0) r1
            java.lang.Object r1 = r1.c(r3)
            int[] r1 = (int[]) r1
            if (r1 != 0) goto L2f
            int[] r1 = defpackage.kg0.b
        L2f:
            r3 = 4
            boolean r1 = defpackage.fv.m0(r1, r3)
            java.lang.String r3 = "CXCP"
            if (r1 != 0) goto L46
            boolean r10 = defpackage.kj2.H()
            if (r10 == 0) goto L43
            java.lang.String r10 = "ZslControlImpl: Private reprocessing isn't supported"
            android.util.Log.i(r3, r10)
        L43:
            r0.L = r2
            return
        L46:
            ex6 r1 = r10.b
            java.lang.Object r2 = r1.getValue()
            android.hardware.camera2.params.StreamConfigurationMap r2 = (android.hardware.camera2.params.StreamConfigurationMap) r2
            r4 = 34
            android.util.Size[] r2 = r2.getInputSizes(r4)
            r2.getClass()
            java.util.List r2 = defpackage.fv.T0(r2)
            java.util.Iterator r2 = r2.iterator()
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L168
            java.lang.Object r5 = r2.next()
            boolean r6 = r2.hasNext()
            if (r6 != 0) goto L70
            goto L9c
        L70:
            r6 = r5
            android.util.Size r6 = (android.util.Size) r6
            r6.getClass()
            int r7 = r6.getWidth()
            int r6 = r6.getHeight()
            int r6 = r6 * r7
        L7f:
            java.lang.Object r7 = r2.next()
            r8 = r7
            android.util.Size r8 = (android.util.Size) r8
            r8.getClass()
            int r9 = r8.getWidth()
            int r8 = r8.getHeight()
            int r8 = r8 * r9
            if (r6 >= r8) goto L96
            r5 = r7
            r6 = r8
        L96:
            boolean r7 = r2.hasNext()
            if (r7 != 0) goto L7f
        L9c:
            android.util.Size r5 = (android.util.Size) r5
            if (r5 != 0) goto Lac
            boolean r10 = defpackage.kj2.L()
            if (r10 == 0) goto Le3
            java.lang.String r10 = "ZslControlImpl: Unable to find a supported size for ZSL"
            android.util.Log.w(r3, r10)
            return
        Lac:
            boolean r2 = defpackage.kj2.F(r3)
            if (r2 == 0) goto Lc3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "ZslControlImpl: Selected ZSL size: "
            r2.<init>(r6)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r3, r2)
        Lc3:
            java.lang.Object r1 = r1.getValue()
            android.hardware.camera2.params.StreamConfigurationMap r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1
            int[] r1 = r1.getValidOutputFormatsForInput(r4)
            r1.getClass()
            r2 = 256(0x100, float:3.59E-43)
            boolean r1 = defpackage.fv.m0(r1, r2)
            if (r1 != 0) goto Le4
            boolean r10 = defpackage.kj2.L()
            if (r10 == 0) goto Le3
            java.lang.String r10 = "ZslControlImpl: JPEG isn't valid output for ZSL format"
            android.util.Log.w(r3, r10)
        Le3:
            return
        Le4:
            o54 r1 = new o54
            int r2 = r5.getWidth()
            int r3 = r5.getHeight()
            r5 = 9
            r1.<init>(r2, r3, r4, r5)
            ce0 r2 = r1.B
            r2.getClass()
            re5 r3 = new re5
            r3.<init>(r1)
            h61 r5 = new h61
            r6 = 24
            r5.<init>(r10, r6)
            ec3 r6 = defpackage.u24.u()
            r1.e(r5, r6)
            o33 r1 = new o33
            android.view.Surface r5 = r3.getSurface()
            if (r5 == 0) goto L162
            android.util.Size r6 = new android.util.Size
            int r7 = r3.getWidth()
            int r8 = r3.getHeight()
            r6.<init>(r7, r8)
            r1.<init>(r5, r6, r4)
            tb0 r4 = r1.e
            gx3 r4 = defpackage.l.F(r4)
            ik0 r5 = new ik0
            r6 = 3
            r5.<init>(r3, r6)
            ov2 r6 = defpackage.u24.x()
            r4.a(r6, r5)
            yq1 r4 = defpackage.yq1.d
            r5 = -1
            r11.b(r1, r4, r5)
            r0.d(r2)
            java.util.ArrayList r0 = r11.e
            boolean r4 = r0.contains(r2)
            if (r4 != 0) goto L14a
            r0.add(r2)
        L14a:
            android.hardware.camera2.params.InputConfiguration r0 = new android.hardware.camera2.params.InputConfiguration
            int r2 = r3.getWidth()
            int r4 = r3.getHeight()
            int r5 = r3.b()
            r0.<init>(r2, r4, r5)
            r11.g = r0
            r10.f = r3
            r10.g = r1
            return
        L162:
            java.lang.String r10 = "Required value was null."
            defpackage.i.m(r10)
            return
        L168:
            defpackage.fa6.c()
            return
    }

    @Override // defpackage.sy7
    public final void c(boolean r1) {
            r0 = this;
            return
    }

    @Override // defpackage.sy7
    public final void d(boolean r2) {
            r1 = this;
            boolean r0 = r1.d
            if (r0 == r2) goto L9
            if (r2 == 0) goto L9
            r1.f()
        L9:
            r1.d = r2
            return
    }

    @Override // defpackage.sy7
    public final boolean e(defpackage.ig1 r2, defpackage.rc6 r3) {
            r1 = this;
            android.util.Size r1 = r2.h
            r3.getClass()
            android.hardware.camera2.params.InputConfiguration r3 = r3.i
            if (r3 == 0) goto L27
            int r2 = r2.i
            int r0 = r3.getFormat()
            if (r2 != r0) goto L27
            int r2 = r1.getWidth()
            int r0 = r3.getWidth()
            if (r2 != r0) goto L27
            int r1 = r1.getHeight()
            int r2 = r3.getHeight()
            if (r1 != r2) goto L27
            r1 = 1
            return r1
        L27:
            r1 = 0
            return r1
    }

    public final void f() {
            r2 = this;
            m44 r2 = r2.c
        L2:
            java.lang.Object r0 = r2.L
            monitor-enter(r0)
            java.lang.Object r1 = r2.B     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1a
            java.lang.Object r0 = r2.e()
            s23 r0 = (defpackage.s23) r0
            r0.close()
            goto L2
        L1a:
            return
        L1b:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r2
    }

    public final void g() {
            r6 = this;
            o33 r0 = r6.g
            if (r0 == 0) goto L26
            re5 r1 = r6.f
            r2 = 0
            if (r1 == 0) goto L21
            tb0 r3 = r0.e
            gx3 r3 = defpackage.l.F(r3)
            ik0 r4 = new ik0
            r5 = 4
            r4.<init>(r1, r5)
            ov2 r5 = defpackage.u24.x()
            r3.a(r5, r4)
            r1.d()
            r6.f = r2
        L21:
            r0.a()
            r6.g = r2
        L26:
            r6.f()
            return
    }
}
