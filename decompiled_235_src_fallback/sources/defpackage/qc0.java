package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qc0  reason: default package */
/* loaded from: classes.dex */
public final class qc0 implements defpackage.lg0 {
    public final java.lang.String A;
    public final android.hardware.camera2.CameraCharacteristics B;
    public final defpackage.ld0 L;
    public final java.util.Set R;
    public final android.util.ArrayMap X;
    public final android.util.ArrayMap Y;
    public final defpackage.go3 Z;
    public final defpackage.go3 d0;
    public final defpackage.go3 e0;

    public qc0(java.lang.String r1, android.hardware.camera2.CameraCharacteristics r2, defpackage.ld0 r3, java.util.Set r4) {
            r0 = this;
            r1.getClass()
            r4.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            android.util.ArrayMap r1 = new android.util.ArrayMap
            r1.<init>()
            r0.X = r1
            android.util.ArrayMap r1 = new android.util.ArrayMap
            r1.<init>()
            r0.Y = r1
            xr3 r1 = defpackage.xr3.PUBLICATION
            pc0 r2 = new pc0
            r3 = 0
            r2.<init>(r0, r3)
            go3 r2 = defpackage.kj2.M(r1, r2)
            r0.Z = r2
            pc0 r2 = new pc0
            r3 = 1
            r2.<init>(r0, r3)
            defpackage.kj2.M(r1, r2)
            pc0 r2 = new pc0
            r3 = 2
            r2.<init>(r0, r3)
            defpackage.kj2.M(r1, r2)
            pc0 r2 = new pc0
            r3 = 3
            r2.<init>(r0, r3)
            defpackage.kj2.M(r1, r2)
            pc0 r2 = new pc0
            r3 = 4
            r2.<init>(r0, r3)
            go3 r2 = defpackage.kj2.M(r1, r2)
            r0.d0 = r2
            pc0 r2 = new pc0
            r3 = 5
            r2.<init>(r0, r3)
            defpackage.kj2.M(r1, r2)
            pc0 r2 = new pc0
            r3 = 6
            r2.<init>(r0, r3)
            defpackage.kj2.M(r1, r2)
            pc0 r2 = new pc0
            r3 = 7
            r2.<init>(r0, r3)
            go3 r1 = defpackage.kj2.M(r1, r2)
            r0.e0 = r1
            return
    }

    public final java.lang.Object c(android.hardware.camera2.CameraCharacteristics.Key r4) {
            r3 = this;
            java.util.Set r0 = r3.R
            boolean r0 = r0.contains(r4)
            r1 = 0
            if (r0 == 0) goto L18
            android.hardware.camera2.CameraCharacteristics r3 = r3.B
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.AssertionError -> L10
            return r3
        L10:
            java.lang.String r3 = "Failed to get characteristic for "
            java.lang.String r0 = ": Framework throw an AssertionError"
            defpackage.e41.o(r4, r0, r3)
            return r1
        L18:
            android.util.ArrayMap r0 = r3.X
            monitor-enter(r0)
            android.util.ArrayMap r2 = r3.X     // Catch: java.lang.Throwable -> L43
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            if (r2 != 0) goto L42
            android.hardware.camera2.CameraCharacteristics r0 = r3.B
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.AssertionError -> L3a
            if (r0 == 0) goto L39
            android.util.ArrayMap r1 = r3.X
            monitor-enter(r1)
            android.util.ArrayMap r3 = r3.X     // Catch: java.lang.Throwable -> L36
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r1)
            return r0
        L36:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
        L39:
            return r0
        L3a:
            java.lang.String r3 = "Failed to get characteristic for "
            java.lang.String r0 = ": Framework throw an AssertionError"
            defpackage.e41.o(r4, r0, r3)
            return r1
        L42:
            return r2
        L43:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    @Override // defpackage.hh7
    public final java.lang.Object e(defpackage.ar0 r2) {
            r1 = this;
            java.lang.Class<android.hardware.camera2.CameraCharacteristics> r0 = android.hardware.camera2.CameraCharacteristics.class
            ar0 r0 = defpackage.gh5.a(r0)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lf
            android.hardware.camera2.CameraCharacteristics r1 = r1.B
            return r1
        Lf:
            r1 = 0
            return r1
    }
}
