package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nc0  reason: default package */
/* loaded from: classes.dex */
public final class nc0 implements defpackage.l54, defpackage.hh7 {
    public final java.lang.String A;
    public final int B;
    public final android.hardware.camera2.CameraExtensionCharacteristics L;
    public final defpackage.go3 R;

    public nc0(java.lang.String r1, int r2, android.hardware.camera2.CameraExtensionCharacteristics r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            xr3 r1 = defpackage.xr3.PUBLICATION
            mc0 r2 = new mc0
            r3 = 0
            r2.<init>(r0, r3)
            defpackage.kj2.M(r1, r2)
            mc0 r2 = new mc0
            r3 = 1
            r2.<init>(r0, r3)
            defpackage.kj2.M(r1, r2)
            mc0 r2 = new mc0
            r3 = 2
            r2.<init>(r0, r3)
            go3 r2 = defpackage.kj2.M(r1, r2)
            r0.R = r2
            mc0 r2 = new mc0
            r3 = 3
            r2.<init>(r0, r3)
            defpackage.kj2.M(r1, r2)
            return
    }

    @Override // defpackage.hh7
    public final java.lang.Object e(defpackage.ar0 r2) {
            r1 = this;
            java.lang.Class r0 = defpackage.ma.p()
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L11
            android.hardware.camera2.CameraExtensionCharacteristics r1 = r1.L
            return r1
        L11:
            r1 = 0
            return r1
    }
}
