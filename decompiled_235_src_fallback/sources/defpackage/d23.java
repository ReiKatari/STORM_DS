package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d23  reason: default package */
/* loaded from: classes.dex */
public final class d23 extends defpackage.di7 {
    public static final defpackage.b23 z = null;
    public final int q;
    public final java.util.concurrent.atomic.AtomicReference r;
    public final int s;
    public final defpackage.v66 t;
    public defpackage.lc6 u;
    public defpackage.eb v;
    public defpackage.wy6 w;
    public defpackage.mc6 x;
    public final defpackage.x31 y;

    static {
            b23 r0 = new b23
            r0.<init>()
            defpackage.d23.z = r0
            return
    }

    public d23(defpackage.e23 r4) {
            r3 = this;
            r3.<init>(r4)
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r0 = 0
            r4.<init>(r0)
            r3.r = r4
            r4 = -1
            r3.s = r4
            x31 r4 = new x31
            r4.<init>(r3)
            r3.y = r4
            zi7 r4 = r3.h
            e23 r4 = (defpackage.e23) r4
            xx r1 = defpackage.e23.B
            boolean r2 = r4.i(r1)
            if (r2 == 0) goto L2e
            java.lang.Object r1 = r4.e(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.q = r1
            goto L31
        L2e:
            r1 = 1
            r3.q = r1
        L31:
            xx r1 = defpackage.e23.d0
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r4.b(r1, r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            xx r1 = defpackage.e23.e0
            java.lang.Object r4 = r4.b(r1, r0)
            v66 r4 = (defpackage.v66) r4
            v66 r0 = new v66
            r0.<init>(r4)
            r3.t = r0
            return
    }

    public static boolean J(int r2, java.util.List r3) {
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r3.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
    }

    @Override // defpackage.di7
    public final void A() {
            r1 = this;
            v66 r0 = r1.t
            r0.b()
            r0.a()
            wy6 r0 = r1.w
            if (r0 == 0) goto Lf
            r0.a()
        Lf:
            r0 = 0
            r1.G(r0)
            r0 = 0
            ve0 r1 = r1.e()
            r1.e(r0)
            return
    }

    public final void G(boolean r3) {
            r2 = this;
            java.lang.String r0 = "ImageCapture"
            java.lang.String r1 = "clearPipeline"
            android.util.Log.d(r0, r1)
            defpackage.nj2.h()
            mc6 r0 = r2.x
            r1 = 0
            if (r0 == 0) goto L14
            r0.b()
            r2.x = r1
        L14:
            eb r0 = r2.v
            if (r0 == 0) goto L1d
            r0.s()
            r2.v = r1
        L1d:
            if (r3 != 0) goto L28
            wy6 r3 = r2.w
            if (r3 == 0) goto L28
            r3.a()
            r2.w = r1
        L28:
            ve0 r2 = r2.e()
            r2.a()
            return
    }

    public final defpackage.lc6 H(java.lang.String r13, defpackage.e23 r14, defpackage.yy r15) {
            r12 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            defpackage.nj2.h()
            java.lang.String r2 = "ImageCapture"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "createPipeline(cameraId: "
            r3.<init>(r4)
            r3.append(r13)
            java.lang.String r13 = ", streamSpec: "
            r3.append(r13)
            r3.append(r15)
            java.lang.String r13 = ")"
            r3.append(r13)
            java.lang.String r13 = r3.toString()
            android.util.Log.d(r2, r13)
            android.util.Size r13 = r15.a
            eg0 r2 = r12.d()
            java.util.Objects.requireNonNull(r2)
            boolean r2 = r2.o()
            r3 = 1
            r2 = r2 ^ r3
            eb r4 = r12.v
            r5 = 0
            if (r4 == 0) goto L44
            defpackage.np2.A(r5, r2)
            eb r4 = r12.v
            r4.s()
        L44:
            eg0 r4 = r12.d()
            zf0 r4 = r4.a()
            r6 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r8 = r4 instanceof defpackage.w9
            r9 = 4101(0x1005, float:5.747E-42)
            if (r8 != 0) goto L5d
        L5b:
            r11 = r5
            goto Lac
        L5d:
            r8 = r4
            w9 r8 = (defpackage.w9) r8
            oe0 r8 = r8.L
            xx r10 = defpackage.oe0.b
            aj7 r11 = defpackage.cj7.a
            java.lang.Object r8 = r8.b(r10, r11)
            cj7 r8 = (defpackage.cj7) r8
            bj7 r10 = defpackage.bj7.IMAGE_CAPTURE
            yy0 r8 = r8.a(r10, r3)
            if (r8 == 0) goto L5b
            xx r10 = defpackage.n23.v
            go4 r8 = (defpackage.go4) r8
            java.util.TreeMap r11 = r8.A
            boolean r11 = r11.containsKey(r10)
            if (r11 != 0) goto L81
            goto L5b
        L81:
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            r11.add(r1)
            java.lang.Object r8 = r8.e(r10)
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
        L93:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto Lac
            java.lang.Object r10 = r8.next()
            android.util.Pair r10 = (android.util.Pair) r10
            java.lang.Object r10 = r10.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r10 != r9) goto L93
            r11.add(r7)
        Lac:
            r8 = 2
            if (r11 == 0) goto Lb0
            goto Lfa
        Lb0:
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            r11.add(r1)
            if (r4 == 0) goto Lca
            r10 = r4
            cg0 r10 = (defpackage.cg0) r10
            java.util.Set r10 = r10.y()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r9 = r10.contains(r9)
            goto Lcb
        Lca:
            r9 = r0
        Lcb:
            if (r9 == 0) goto Ld0
            r11.add(r7)
        Ld0:
            if (r4 == 0) goto Lde
            cg0 r4 = (defpackage.cg0) r4
            java.util.Set r7 = r4.w()
            boolean r7 = r7.contains(r6)
            if (r7 != 0) goto Le0
        Lde:
            r4 = r0
            goto Lee
        Le0:
            java.util.Set r4 = r4.y()
            r7 = 32
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r4 = r4.contains(r7)
        Lee:
            if (r4 == 0) goto Lfa
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r11.add(r4)
            r11.add(r6)
        Lfa:
            zi7 r4 = r12.h
            xx r6 = defpackage.e23.X
            java.lang.Object r4 = r4.b(r6, r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            boolean r4 = r11.contains(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "The specified output format ("
            r7.<init>(r9)
            zi7 r9 = r12.h
            java.lang.Object r1 = r9.b(r6, r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = r1.intValue()
            r7.append(r1)
            java.lang.String r1 = ") is not supported by current configuration. Supported output formats: "
            r7.append(r1)
            r7.append(r11)
            java.lang.String r1 = r7.toString()
            defpackage.np2.s(r1, r4)
            zi7 r1 = r12.h
            xx r4 = defpackage.e23.f0
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            java.lang.Object r1 = r1.b(r4, r6)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L153
            r14.q()
            eg0 r1 = r12.d()
            oe0 r1 = r1.f()
            r1.z()
        L153:
            eg0 r1 = r12.d()
            if (r1 == 0) goto L175
            eg0 r1 = r12.d()     // Catch: java.lang.Exception -> L16d
            cg0 r1 = r1.q()     // Catch: java.lang.Exception -> L16d
            java.lang.Object r1 = r1.q()     // Catch: java.lang.Exception -> L16d
            boolean r4 = r1 instanceof android.hardware.camera2.CameraCharacteristics     // Catch: java.lang.Exception -> L16d
            if (r4 == 0) goto L175
            android.hardware.camera2.CameraCharacteristics r1 = (android.hardware.camera2.CameraCharacteristics) r1     // Catch: java.lang.Exception -> L16d
            r5 = r1
            goto L175
        L16d:
            r1 = move-exception
            java.lang.String r4 = "ImageCapture"
            java.lang.String r6 = "getCameraCharacteristics failed"
            android.util.Log.e(r4, r6, r1)
        L175:
            eb r1 = new eb
            r1.<init>(r14, r13, r5, r2)
            r12.v = r1
            wy6 r13 = r12.w
            if (r13 != 0) goto L19b
            zi7 r13 = r12.h
            xx r14 = defpackage.zi7.a0
            xi7 r1 = new xi7
            r1.<init>()
            java.lang.Object r13 = r13.b(r14, r1)
            xi7 r13 = (defpackage.xi7) r13
            java.util.Objects.requireNonNull(r13)
            x31 r13 = r12.y
            wy6 r14 = new wy6
            r14.<init>(r13)
            r12.w = r14
        L19b:
            wy6 r13 = r12.w
            eb r14 = r12.v
            r13.getClass()
            defpackage.nj2.h()
            r13.B = r14
            r14.getClass()
            defpackage.nj2.h()
            java.lang.Object r14 = r14.L
            bt r14 = (defpackage.bt) r14
            r14.getClass()
            defpackage.nj2.h()
            java.lang.Object r1 = r14.B
            re5 r1 = (defpackage.re5) r1
            if (r1 == 0) goto L1bf
            r1 = r3
            goto L1c0
        L1bf:
            r1 = r0
        L1c0:
            java.lang.String r2 = "The ImageReader is not initialized."
            defpackage.np2.A(r2, r1)
            java.lang.Object r14 = r14.B
            re5 r14 = (defpackage.re5) r14
            java.lang.Object r1 = r14.R
            monitor-enter(r1)
            r14.Y = r13     // Catch: java.lang.Throwable -> L250
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L250
            eb r13 = r12.v
            android.util.Size r14 = r15.a
            java.lang.Object r1 = r13.B
            e23 r1 = (defpackage.e23) r1
            lc6 r14 = defpackage.lc6.d(r1, r14)
            java.lang.Object r13 = r13.X
            vx r13 = (defpackage.vx) r13
            o33 r1 = r13.a
            java.util.Objects.requireNonNull(r1)
            yq1 r2 = defpackage.yq1.d
            s9 r1 = defpackage.wy.a(r1)
            r1.e = r2
            wy r1 = r1.k()
            java.util.LinkedHashSet r4 = r14.a
            r4.add(r1)
            java.util.ArrayList r1 = r13.f
            int r1 = r1.size()
            if (r1 <= r3) goto L210
            o33 r1 = r13.b
            if (r1 == 0) goto L210
            s9 r1 = defpackage.wy.a(r1)
            r1.e = r2
            wy r1 = r1.k()
            java.util.LinkedHashSet r2 = r14.a
            r2.add(r1)
        L210:
            o33 r13 = r13.c
            if (r13 == 0) goto L21e
            s9 r13 = defpackage.wy.a(r13)
            wy r13 = r13.k()
            r14.i = r13
        L21e:
            int r13 = r15.d
            r14.h = r13
            int r13 = r12.q
            if (r13 != r8) goto L231
            boolean r13 = r15.g
            if (r13 != 0) goto L231
            ve0 r13 = r12.e()
            r13.b(r14)
        L231:
            yy0 r13 = r15.f
            if (r13 == 0) goto L23a
            dk0 r15 = r14.b
            r15.e(r13)
        L23a:
            mc6 r13 = r12.x
            if (r13 == 0) goto L241
            r13.b()
        L241:
            mc6 r13 = new mc6
            a23 r15 = new a23
            r15.<init>(r12, r0)
            r13.<init>(r15)
            r12.x = r13
            r14.f = r13
            return r14
        L250:
            r12 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L250
            throw r12
    }

    public final int I() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r3.r
            monitor-enter(r0)
            int r1 = r3.s     // Catch: java.lang.Throwable -> L20
            r2 = -1
            if (r1 == r2) goto L9
            goto L1e
        L9:
            zi7 r3 = r3.h     // Catch: java.lang.Throwable -> L20
            e23 r3 = (defpackage.e23) r3     // Catch: java.lang.Throwable -> L20
            xx r1 = defpackage.e23.L     // Catch: java.lang.Throwable -> L20
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r3.b(r1, r2)     // Catch: java.lang.Throwable -> L20
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L20
            int r1 = r3.intValue()     // Catch: java.lang.Throwable -> L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r1
        L20:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r3
    }

    @Override // defpackage.di7
    public final defpackage.zi7 g(boolean r4, defpackage.cj7 r5) {
            r3 = this;
            b23 r0 = defpackage.d23.z
            r0.getClass()
            e23 r0 = defpackage.b23.a
            bj7 r1 = r0.x()
            int r2 = r3.q
            yy0 r5 = r5.a(r1, r2)
            if (r4 == 0) goto L17
            go4 r5 = defpackage.yy0.t(r5, r0)
        L17:
            if (r5 != 0) goto L1b
            r3 = 0
            return r3
        L1b:
            yi7 r3 = r3.m(r5)
            jd0 r3 = (defpackage.jd0) r3
            e23 r4 = new e23
            da4 r3 = r3.B
            go4 r3 = defpackage.go4.a(r3)
            r4.<init>(r3)
            return r4
    }

    @Override // defpackage.di7
    public final java.util.Set l() {
            r1 = this;
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
            return r1
    }

    @Override // defpackage.di7
    public final defpackage.yi7 m(defpackage.yy0 r2) {
            r1 = this;
            jd0 r1 = new jd0
            da4 r2 = defpackage.da4.k(r2)
            r0 = 4
            r1.<init>(r2, r0)
            return r1
    }

    @Override // defpackage.di7
    public final boolean n() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.di7
    public final void t() {
            r2 = this;
            eg0 r0 = r2.d()
            java.lang.String r1 = "Attached camera cannot be null"
            defpackage.np2.x(r0, r1)
            int r0 = r2.I()
            r1 = 3
            if (r0 != r1) goto L28
            eg0 r2 = r2.d()
            if (r2 == 0) goto L1f
            zf0 r2 = r2.a()
            int r2 = r2.m()
            goto L20
        L1f:
            r2 = -1
        L20:
            if (r2 != 0) goto L23
            goto L28
        L23:
            java.lang.String r2 = "Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture"
            defpackage.i.h(r2)
        L28:
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r1 = r1.h()
            java.lang.String r0 = "ImageCapture:"
            java.lang.String r1 = r0.concat(r1)
            return r1
    }

    @Override // defpackage.di7
    public final void u() {
            r3 = this;
            java.lang.String r0 = "ImageCapture"
            java.lang.String r1 = "onCameraControlReady"
            defpackage.kj2.t(r0, r1)
            java.util.concurrent.atomic.AtomicReference r0 = r3.r
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r3.r     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L22
        L14:
            r3 = move-exception
            goto L2c
        L16:
            ve0 r1 = r3.e()     // Catch: java.lang.Throwable -> L14
            int r2 = r3.I()     // Catch: java.lang.Throwable -> L14
            r1.d(r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
        L22:
            v66 r0 = r3.t
            ve0 r3 = r3.e()
            r3.e(r0)
            return
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    @Override // defpackage.di7
    public final defpackage.zi7 v(defpackage.cg0 r13, defpackage.yi7 r14) {
            r12 = this;
            r0 = 32
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 35
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 256(0x100, float:3.59E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.util.HashSet r5 = r12.g
            r6 = 0
            if (r5 == 0) goto L3e
            java.util.Iterator r5 = r5.iterator()
            r7 = r6
        L1c:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L31
            java.lang.Object r8 = r5.next()
            qu2 r8 = (defpackage.qu2) r8
            boolean r9 = r8 instanceof defpackage.h23
            if (r9 == 0) goto L1c
            h23 r8 = (defpackage.h23) r8
            int r7 = r8.a
            goto L1c
        L31:
            da4 r5 = r14.f()
            xx r8 = defpackage.e23.X
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.m(r8, r7)
        L3e:
            y65 r13 = r13.s()
            java.lang.Class<androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk> r5 = androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk.class
            boolean r13 = r13.a(r5)
            java.lang.String r5 = "ImageCapture"
            if (r13 == 0) goto L72
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            da4 r7 = r14.f()
            xx r8 = defpackage.e23.Z
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            java.lang.Object r7 = r7.b(r8, r9)
            boolean r13 = r13.equals(r7)
            if (r13 == 0) goto L66
            java.lang.String r13 = "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."
            defpackage.kj2.f0(r5, r13)
            goto L72
        L66:
            java.lang.String r13 = "Requesting software JPEG due to device quirk."
            defpackage.kj2.E(r5, r13)
            da4 r13 = r14.f()
            r13.m(r8, r9)
        L72:
            da4 r13 = r14.f()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            xx r8 = defpackage.e23.Z
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            java.lang.Object r10 = r13.b(r8, r9)
            boolean r7 = r7.equals(r10)
            r10 = 1
            r11 = 0
            if (r7 == 0) goto Lbb
            eg0 r7 = r12.d()
            if (r7 != 0) goto L8f
            goto L9a
        L8f:
            eg0 r7 = r12.d()
            oe0 r7 = r7.f()
            r7.z()
        L9a:
            xx r7 = defpackage.e23.R
            java.lang.Object r7 = r13.b(r7, r11)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto Lb0
            int r7 = r7.intValue()
            if (r7 == r3) goto Lb0
            java.lang.String r7 = "Software JPEG cannot be used with non-JPEG output buffer format."
            defpackage.kj2.f0(r5, r7)
            goto Lb1
        Lb0:
            r6 = r10
        Lb1:
            if (r6 != 0) goto Lbb
            java.lang.String r7 = "Unable to support software JPEG. Disabling."
            defpackage.kj2.f0(r5, r7)
            r13.m(r8, r9)
        Lbb:
            da4 r13 = r14.f()
            xx r5 = defpackage.e23.R
            java.lang.Object r13 = r13.b(r5, r11)
            java.lang.Integer r13 = (java.lang.Integer) r13
            if (r13 == 0) goto Lf1
            eg0 r0 = r12.d()
            if (r0 != 0) goto Ld0
            goto Ldb
        Ld0:
            eg0 r12 = r12.d()
            oe0 r12 = r12.f()
            r12.z()
        Ldb:
            da4 r12 = r14.f()
            xx r0 = defpackage.j23.l
            if (r6 == 0) goto Le4
            goto Le8
        Le4:
            int r1 = r13.intValue()
        Le8:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            r12.m(r0, r13)
            goto L1a8
        Lf1:
            da4 r12 = r14.f()
            xx r13 = defpackage.e23.X
            java.lang.Object r12 = r12.b(r13, r11)
            r5 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r12 = java.util.Objects.equals(r12, r5)
            if (r12 == 0) goto L111
            da4 r12 = r14.f()
            xx r13 = defpackage.j23.l
            r12.m(r13, r0)
            goto L1a8
        L111:
            da4 r12 = r14.f()
            java.lang.Object r12 = r12.b(r13, r11)
            r5 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r12 = java.util.Objects.equals(r12, r5)
            if (r12 == 0) goto L138
            da4 r12 = r14.f()
            xx r13 = defpackage.j23.l
            r12.m(r13, r0)
            da4 r12 = r14.f()
            xx r13 = defpackage.j23.m
            r12.m(r13, r4)
            goto L1a8
        L138:
            da4 r12 = r14.f()
            java.lang.Object r12 = r12.b(r13, r11)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            boolean r12 = java.util.Objects.equals(r12, r13)
            if (r12 == 0) goto L165
            da4 r12 = r14.f()
            xx r13 = defpackage.j23.l
            r0 = 4101(0x1005, float:5.747E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.m(r13, r0)
            da4 r12 = r14.f()
            xx r13 = defpackage.j23.n
            yq1 r0 = defpackage.yq1.c
            r12.m(r13, r0)
            goto L1a8
        L165:
            if (r6 == 0) goto L171
            da4 r12 = r14.f()
            xx r13 = defpackage.j23.l
            r12.m(r13, r2)
            goto L1a8
        L171:
            da4 r12 = r14.f()
            xx r13 = defpackage.n23.v
            java.lang.Object r12 = r12.b(r13, r11)
            java.util.List r12 = (java.util.List) r12
            if (r12 != 0) goto L189
            da4 r12 = r14.f()
            xx r13 = defpackage.j23.l
            r12.m(r13, r4)
            goto L1a8
        L189:
            boolean r13 = J(r3, r12)
            if (r13 == 0) goto L199
            da4 r12 = r14.f()
            xx r13 = defpackage.j23.l
            r12.m(r13, r4)
            goto L1a8
        L199:
            boolean r12 = J(r1, r12)
            if (r12 == 0) goto L1a8
            da4 r12 = r14.f()
            xx r13 = defpackage.j23.l
            r12.m(r13, r2)
        L1a8:
            zi7 r12 = r14.h()
            return r12
    }

    @Override // defpackage.di7
    public final void x() {
            r1 = this;
            v66 r0 = r1.t
            r0.b()
            r0.a()
            wy6 r1 = r1.w
            if (r1 == 0) goto Lf
            r1.a()
        Lf:
            return
    }

    @Override // defpackage.di7
    public final defpackage.yy y(defpackage.yy0 r4) {
            r3 = this;
            lc6 r0 = r3.u
            r0.a(r4)
            lc6 r0 = r3.u
            rc6 r0 = r0.c()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 1
            r1.<init>(r2)
            r2 = 0
            r0 = r0[r2]
            java.util.Objects.requireNonNull(r0)
            r1.add(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            r3.E(r0)
            yy r3 = r3.i
            p87 r3 = r3.b()
            r3.f = r4
            yy r3 = r3.a()
            return r3
    }

    @Override // defpackage.di7
    public final defpackage.yy z(defpackage.yy r3, defpackage.yy r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onSuggestedStreamSpecUpdated: primaryStreamSpec = "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", secondaryStreamSpec "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "ImageCapture"
            defpackage.kj2.t(r0, r4)
            java.lang.String r4 = r2.f()
            zi7 r0 = r2.h
            e23 r0 = (defpackage.e23) r0
            lc6 r4 = r2.H(r4, r0, r3)
            r2.u = r4
            rc6 r4 = r4.c()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r1 = 0
            r4 = r4[r1]
            java.util.Objects.requireNonNull(r4)
            r0.add(r4)
            java.util.List r4 = java.util.Collections.unmodifiableList(r0)
            r2.E(r4)
            r2.q()
            return r3
    }
}
