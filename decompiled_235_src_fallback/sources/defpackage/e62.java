package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e62  reason: default package */
/* loaded from: classes.dex */
public final class e62 implements defpackage.gi7 {
    public final defpackage.g62 a;
    public defpackage.h62 b;
    public defpackage.li7 c;

    public e62(defpackage.g62 r5) {
            r4 = this;
            r5.getClass()
            r4.<init>()
            r4.a = r5
            h62 r0 = new h62
            boolean r1 = r5.d
            android.util.Range r2 = r5.c
            android.util.Rational r5 = r5.e
            r3 = 0
            r0.<init>(r1, r3, r2, r5)
            r4.b = r0
            return
    }

    public final defpackage.tu0 a(boolean r9) {
            r8 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            g62 r2 = r8.a
            boolean r3 = r2.d
            android.util.Range r4 = r2.c
            if (r3 != 0) goto L1d
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "ExposureCompensation is not supported"
            r8.<init>(r9)
            tu0 r9 = new tu0
            r9.<init>()
            r9.v0(r8)
            return r9
        L1d:
            boolean r3 = r4.contains(r1)
            if (r3 != 0) goto L54
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Requested ExposureCompensation 0 is not within valid range ["
            r9.<init>(r0)
            java.lang.Comparable r0 = r4.getUpper()
            r9.append(r0)
            java.lang.String r0 = " .. "
            r9.append(r0)
            java.lang.Comparable r0 = r4.getLower()
            r9.append(r0)
            r0 = 93
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            tu0 r9 = new tu0
            r9.<init>()
            r9.v0(r8)
            return r9
        L54:
            li7 r3 = r8.c
            if (r3 == 0) goto Lb4
            h62 r4 = r8.b
            boolean r5 = r4.a
            android.util.Range r6 = r4.c
            android.util.Rational r4 = r4.d
            r6.getClass()
            r4.getClass()
            h62 r7 = new h62
            r7.<init>(r5, r0, r6, r4)
            r8.b = r7
            ou0 r8 = r2.b
            tu0 r0 = new tu0
            r0.<init>()
            tu0 r4 = r2.f
            if (r4 == 0) goto L83
            if (r9 == 0) goto L80
            java.lang.String r9 = "Cancelled by another setExposureCompensationIndex()"
            defpackage.i61.A(r9, r4)
            goto L83
        L80:
            defpackage.nc1.a0(r0, r4)
        L83:
            r2.f = r0
            f62 r9 = r2.g
            if (r9 == 0) goto L8f
            r8.b(r9)
            r9 = 0
            r2.g = r9
        L8f:
            android.hardware.camera2.CaptureRequest$Key r9 = android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION
            java.util.Map r9 = java.util.Collections.singletonMap(r9, r1)
            r9.getClass()
            defpackage.li7.b(r3, r9)
            f62 r9 = new f62
            r9.<init>(r0)
            kj7 r1 = r2.a
            s37 r1 = r1.e
            r8.a(r9, r1)
            y r8 = new y
            r1 = 29
            r8.<init>(r1, r2, r9)
            r0.a0(r8)
            r2.g = r9
            return r0
        Lb4:
            se0 r8 = new se0
            java.lang.String r9 = "Camera is not active."
            r8.<init>(r9)
            tu0 r9 = r2.f
            if (r9 == 0) goto Lc2
            r9.v0(r8)
        Lc2:
            tu0 r9 = new tu0
            r9.<init>()
            r9.v0(r8)
            return r9
    }

    @Override // defpackage.gi7
    public final void b(defpackage.li7 r1) {
            r0 = this;
            r0.c = r1
            r1 = 0
            r0.a(r1)
            return
    }

    @Override // defpackage.gi7
    public final void reset() {
            r5 = this;
            h62 r0 = r5.b
            boolean r1 = r0.a
            android.util.Range r2 = r0.c
            android.util.Rational r0 = r0.d
            r2.getClass()
            r0.getClass()
            h62 r3 = new h62
            r4 = 0
            r3.<init>(r1, r4, r2, r0)
            r5.b = r3
            r0 = 1
            r5.a(r0)
            return
    }
}
