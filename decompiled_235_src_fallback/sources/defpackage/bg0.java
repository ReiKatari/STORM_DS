package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bg0  reason: default package */
/* loaded from: classes.dex */
public final class bg0 implements defpackage.cg0, defpackage.hh7 {
    public final defpackage.sg0 A;
    public final defpackage.gr1 B;
    public final defpackage.sh0 L;
    public final defpackage.jh0 R;
    public final defpackage.dr6 X;
    public final defpackage.ex6 Y;

    public bg0(defpackage.sg0 r1, defpackage.gr1 r2, defpackage.sh0 r3, defpackage.we0 r4, defpackage.ae0 r5, defpackage.zg2 r6, defpackage.jh0 r7, defpackage.a42 r8, defpackage.dr6 r9, defpackage.lb3 r10, defpackage.rr6 r11) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r8.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r7
            r0.X = r9
            lg0 r1 = r1.b
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            r2.getClass()
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            qc0 r1 = (defpackage.qc0) r1
            r1.getClass()
            java.lang.Object r1 = r1.c(r2)
            if (r1 != 0) goto L46
            goto L47
        L46:
            r3 = r1
        L47:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r1 = r3.intValue()
            r2 = 1
            r4 = 2
            if (r1 != r4) goto L54
            java.lang.String r1 = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY"
            goto L88
        L54:
            r1 = 4
            int r5 = r3.intValue()
            if (r5 != r1) goto L5e
            java.lang.String r1 = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL"
            goto L88
        L5e:
            int r1 = r3.intValue()
            if (r1 != 0) goto L67
            java.lang.String r1 = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED"
            goto L88
        L67:
            int r1 = r3.intValue()
            if (r1 != r2) goto L70
            java.lang.String r1 = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL"
            goto L88
        L70:
            r1 = 3
            int r5 = r3.intValue()
            if (r5 != r1) goto L7a
            java.lang.String r1 = "INFO_SUPPORTED_HARDWARE_LEVEL_3"
            goto L88
        L7a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "Unknown value: "
            r1.<init>(r5)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L88:
            boolean r3 = defpackage.kj2.H()
            if (r3 == 0) goto L99
            java.lang.String r3 = "Device Level: "
            java.lang.String r1 = r3.concat(r1)
            java.lang.String r3 = "CXCP"
            android.util.Log.i(r3, r1)
        L99:
            ag0 r1 = new ag0
            r3 = 0
            r1.<init>(r0, r3)
            ex6 r3 = new ex6
            r3.<init>(r1)
            ag0 r1 = new ag0
            r1.<init>(r0, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            ag0 r1 = new ag0
            r1.<init>(r0, r4)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.Y = r2
            return
    }

    @Override // defpackage.cg0
    public final java.util.Set a() {
            r0 = this;
            sg0 r0 = r0.A
            lg0 r0 = r0.b
            d51 r0 = defpackage.ak7.T(r0)
            java.lang.Object r0 = r0.B
            br1 r0 = (defpackage.br1) r0
            java.util.Set r0 = r0.a()
            return r0
    }

    @Override // defpackage.zf0
    public final int b() {
            r1 = this;
            r0 = 0
            int r1 = r1.p(r0)
            return r1
    }

    @Override // defpackage.cg0
    public final boolean c() {
            r1 = this;
            sg0 r1 = r1.A
            lg0 r1 = r1.b
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES
            r0.getClass()
            qc0 r1 = (defpackage.qc0) r1
            java.lang.Object r1 = r1.c(r0)
            int[] r1 = (int[]) r1
            if (r1 == 0) goto L1b
            r0 = 1
            boolean r1 = defpackage.fv.m0(r1, r0)
            if (r1 == 0) goto L1b
            return r0
        L1b:
            r1 = 0
            return r1
    }

    @Override // defpackage.cg0
    public final java.lang.String d() {
            r0 = this;
            gr1 r0 = r0.B
            java.lang.String r0 = r0.B
            return r0
    }

    @Override // defpackage.hh7
    public final java.lang.Object e(defpackage.ar0 r2) {
            r1 = this;
            java.lang.Class<oc0> r0 = defpackage.oc0.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L18
            ex6 r1 = r1.Y
            java.lang.Object r1 = r1.getValue()
            oc0 r1 = (defpackage.oc0) r1
            r1.getClass()
            return r1
        L18:
            java.lang.Class<sg0> r0 = defpackage.sg0.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r0 = r2.equals(r0)
            sg0 r1 = r1.A
            if (r0 == 0) goto L2a
            r1.getClass()
            return r1
        L2a:
            java.lang.Class<lg0> r0 = defpackage.lg0.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3c
            lg0 r1 = r1.b
            r1.getClass()
            return r1
        L3c:
            lg0 r1 = r1.b
            qc0 r1 = (defpackage.qc0) r1
            java.lang.Object r1 = r1.e(r2)
            return r1
    }

    @Override // defpackage.cg0
    public final android.graphics.Rect j() {
            r3 = this;
            sg0 r3 = r3.A
            lg0 r3 = r3.b
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE
            r0.getClass()
            qc0 r3 = (defpackage.qc0) r3
            java.lang.Object r3 = r3.c(r0)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            java.lang.String r0 = "robolectric"
            java.lang.String r1 = android.os.Build.FINGERPRINT
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L28
            if (r3 != 0) goto L28
            android.graphics.Rect r3 = new android.graphics.Rect
            r0 = 4000(0xfa0, float:5.605E-42)
            r1 = 3000(0xbb8, float:4.204E-42)
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return r3
        L28:
            r3.getClass()
            return r3
    }

    @Override // defpackage.zf0
    public final defpackage.qx3 l() {
            r0 = this;
            sh0 r0 = r0.L
            s94 r0 = r0.c
            return r0
    }

    @Override // defpackage.zf0
    public final int m() {
            r2 = this;
            sg0 r2 = r2.A
            lg0 r2 = r2.b
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            r0.getClass()
            qc0 r2 = (defpackage.qc0) r2
            java.lang.Object r2 = r2.c(r0)
            r2.getClass()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 == 0) goto L41
            r0 = 1
            if (r2 == r0) goto L40
            r0 = 2
            if (r2 == r0) goto L40
            boolean r0 = defpackage.kj2.L()
            if (r0 == 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unrecognized lens facing: "
            r0.<init>(r1)
            r0.append(r2)
            r2 = 33
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "CXCP"
            android.util.Log.w(r0, r2)
        L3e:
            r2 = -1
            return r2
        L40:
            return r0
        L41:
            r2 = 0
            return r2
    }

    @Override // defpackage.zf0
    public final int p(int r3) {
            r2 = this;
            sg0 r0 = r2.A
            lg0 r0 = r0.b
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            r1.getClass()
            qc0 r0 = (defpackage.qc0) r0
            java.lang.Object r0 = r0.c(r1)
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = defpackage.nb3.Z(r3)
            int r2 = r2.m()
            r1 = 1
            if (r1 != r2) goto L24
            goto L25
        L24:
            r1 = 0
        L25:
            int r2 = defpackage.nb3.z(r3, r1, r0)
            return r2
    }

    @Override // defpackage.cg0
    public final java.lang.Object q() {
            r1 = this;
            sg0 r1 = r1.A
            lg0 r1 = r1.b
            java.lang.Class<android.hardware.camera2.CameraCharacteristics> r0 = android.hardware.camera2.CameraCharacteristics.class
            ar0 r0 = defpackage.gh5.a(r0)
            qc0 r1 = (defpackage.qc0) r1
            java.lang.Object r1 = r1.e(r0)
            r1.getClass()
            android.hardware.camera2.CameraCharacteristics r1 = (android.hardware.camera2.CameraCharacteristics) r1
            return r1
    }

    @Override // defpackage.cg0
    public final defpackage.y65 s() {
            r0 = this;
            jh0 r0 = r0.R
            y65 r0 = r0.a()
            return r0
    }

    @Override // defpackage.cg0
    public final java.util.List t(int r1) {
            r0 = this;
            dr6 r0 = r0.X
            android.util.Size[] r0 = r0.a(r1)
            if (r0 == 0) goto Ld
            java.util.List r0 = defpackage.fv.T0(r0)
            return r0
        Ld:
            yt1 r0 = defpackage.yt1.A
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraInfoAdapter<"
            r0.<init>(r1)
            gr1 r2 = r2.B
            r0.append(r2)
            java.lang.String r2 = ".cameraId>"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.cg0
    public final java.util.Set w() {
            r4 = this;
            sg0 r4 = r4.A
            lg0 r4 = r4.b
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            r0.getClass()
            qc0 r4 = (defpackage.qc0) r4
            java.lang.Object r4 = r4.c(r0)
            int[] r4 = (int[]) r4
            du1 r0 = defpackage.du1.A
            if (r4 == 0) goto L41
            int r1 = r4.length
            if (r1 == 0) goto L41
            r0 = 0
            r2 = 1
            if (r1 == r2) goto L36
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            int r2 = r4.length
            int r2 = defpackage.c14.k0(r2)
            r1.<init>(r2)
            int r2 = r4.length
        L27:
            if (r0 >= r2) goto L35
            r3 = r4[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
            int r0 = r0 + 1
            goto L27
        L35:
            return r1
        L36:
            r4 = r4[r0]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.Set r4 = defpackage.ii2.R(r4)
            return r4
        L41:
            return r0
    }

    @Override // defpackage.cg0
    public final java.util.Set y() {
            r0 = this;
            dr6 r0 = r0.X
            s35 r0 = r0.c
            java.lang.Integer[] r0 = r0.w()
            if (r0 == 0) goto Lf
            java.util.Set r0 = defpackage.fv.V0(r0)
            return r0
        Lf:
            du1 r0 = defpackage.du1.A
            return r0
    }

    @Override // defpackage.cg0
    public final boolean z() {
            r1 = this;
            kg0 r0 = defpackage.lg0.g
            sg0 r1 = r1.A
            lg0 r1 = r1.b
            r0.getClass()
            boolean r1 = defpackage.kg0.b(r1)
            return r1
    }
}
