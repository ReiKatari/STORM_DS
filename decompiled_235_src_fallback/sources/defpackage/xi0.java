package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xi0  reason: default package */
/* loaded from: classes.dex */
public final class xi0 extends defpackage.vi0 {
    public static final defpackage.xi0 b = null;

    static {
            xi0 r0 = new xi0
            r0.<init>()
            defpackage.xi0.b = r0
            return
    }

    @Override // defpackage.vi0
    public final void a(defpackage.zi7 r3, defpackage.dk0 r4) {
            r2 = this;
            r3.getClass()
            super.a(r3, r4)
            boolean r2 = r3 instanceof defpackage.e23
            if (r2 == 0) goto L66
            da4 r2 = defpackage.da4.d()
            e23 r3 = (defpackage.e23) r3
            java.lang.Class<androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk> r0 = androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk.class
            y65 r1 = defpackage.si1.a()
            u65 r0 = r1.b(r0)
            androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk r0 = (androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk) r0
            if (r0 != 0) goto L1f
            goto L59
        L1f:
            xx r0 = defpackage.e23.B
            boolean r1 = r3.i(r0)
            if (r1 != 0) goto L28
            goto L59
        L28:
            java.lang.Object r3 = r3.e(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 == 0) goto L49
            r0 = 1
            if (r3 == r0) goto L38
            goto L59
        L38:
            android.hardware.camera2.CaptureRequest$Key r3 = defpackage.wa2.i()
            r3.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            xx r3 = defpackage.nw7.T(r3)
            r2.m(r3, r0)
            goto L59
        L49:
            android.hardware.camera2.CaptureRequest$Key r3 = defpackage.wa2.i()
            r3.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            xx r3 = defpackage.nw7.T(r3)
            r2.m(r3, r0)
        L59:
            kd0 r3 = new kd0
            go4 r2 = defpackage.go4.a(r2)
            r3.<init>(r2)
            r4.e(r3)
            return
        L66:
            java.lang.String r2 = "config is not ImageCaptureConfig"
            defpackage.i.h(r2)
            return
    }
}
