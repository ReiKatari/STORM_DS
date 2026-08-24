package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mw4  reason: default package */
/* loaded from: classes.dex */
public final class mw4 implements defpackage.zf0, defpackage.hh7 {
    public final defpackage.sg0 A;
    public final defpackage.ex6 B;

    public mw4(defpackage.sg0 r2) {
            r1 = this;
            r1.<init>()
            r1.A = r2
            er2 r2 = new er2
            r0 = 13
            r2.<init>(r1, r0)
            ex6 r0 = new ex6
            r0.<init>(r2)
            r1.B = r0
            return
    }

    @Override // defpackage.zf0
    public final int b() {
            r1 = this;
            r0 = 0
            int r1 = r1.p(r0)
            return r1
    }

    @Override // defpackage.hh7
    public final java.lang.Object e(defpackage.ar0 r2) {
            r1 = this;
            java.lang.Class<oc0> r0 = defpackage.oc0.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L18
            ex6 r1 = r1.B
            java.lang.Object r1 = r1.getValue()
            oc0 r1 = (defpackage.oc0) r1
            r1.getClass()
            return r1
        L18:
            java.lang.Class<sg0> r0 = defpackage.sg0.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r0 = r2.equals(r0)
            sg0 r1 = r1.A
            if (r0 == 0) goto L27
            return r1
        L27:
            java.lang.Class<android.hardware.camera2.CameraMetadata> r0 = android.hardware.camera2.CameraMetadata.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r0 = r2.equals(r0)
            lg0 r1 = r1.b
            if (r0 == 0) goto L39
            r1.getClass()
            return r1
        L39:
            qc0 r1 = (defpackage.qc0) r1
            java.lang.Object r1 = r1.e(r2)
            return r1
    }

    @Override // defpackage.zf0
    public final int m() {
            r3 = this;
            sg0 r3 = r3.A
            lg0 r3 = r3.b
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            r0.getClass()
            qc0 r3 = (defpackage.qc0) r3
            java.lang.Object r3 = r3.c(r0)
            r3.getClass()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r0 = 0
            if (r3 == 0) goto L2f
            r1 = 1
            if (r3 == r1) goto L2e
            r1 = 2
            if (r3 != r1) goto L22
            return r1
        L22:
            java.lang.String r1 = "The specified lens facing integer "
            java.lang.String r2 = " can not be recognized."
            java.lang.String r3 = defpackage.lb1.k(r1, r3, r2)
            defpackage.i.h(r3)
            return r0
        L2e:
            return r1
        L2f:
            return r0
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
}
