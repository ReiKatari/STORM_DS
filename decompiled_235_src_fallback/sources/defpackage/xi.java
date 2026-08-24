package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xi  reason: default package */
/* loaded from: classes.dex */
public final class xi implements defpackage.hh7 {
    public final android.hardware.camera2.params.OutputConfiguration A;

    static {
            return
    }

    public xi(android.hardware.camera2.params.OutputConfiguration r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r1.getSurface()
            return
    }

    public final void a(android.view.Surface r3) {
            r2 = this;
            r3.getClass()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L11
            if (r0 < r1) goto L10
            android.hardware.camera2.params.OutputConfiguration r2 = r2.A
            defpackage.k2.q(r2, r3)
        L10:
            return
        L11:
            java.lang.String r2 = "addSurface is not supported on API "
            java.lang.String r3 = " (requires API 26)"
            java.lang.String r2 = defpackage.lb1.k(r2, r0, r3)
            defpackage.u34.f(r2)
            return
    }

    @Override // defpackage.hh7
    public final java.lang.Object e(defpackage.ar0 r2) {
            r1 = this;
            java.lang.Class<android.hardware.camera2.params.OutputConfiguration> r0 = android.hardware.camera2.params.OutputConfiguration.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lf
            android.hardware.camera2.params.OutputConfiguration r1 = r1.A
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public final java.lang.String toString() {
            r0 = this;
            android.hardware.camera2.params.OutputConfiguration r0 = r0.A
            java.lang.String r0 = r0.toString()
            return r0
    }
}
