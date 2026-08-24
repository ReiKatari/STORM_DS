package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g62  reason: default package */
/* loaded from: classes.dex */
public final class g62 {
    public final defpackage.kj7 a;
    public final defpackage.ou0 b;
    public final android.util.Range c;
    public final boolean d;
    public final android.util.Rational e;
    public defpackage.tu0 f;
    public defpackage.f62 g;

    public g62(defpackage.sg0 r1, defpackage.kj7 r2, defpackage.ou0 r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.a = r2
            r0.b = r3
            lg0 r1 = r1.b
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE
            r2.getClass()
            android.util.Range r3 = defpackage.d62.a
            qc0 r1 = (defpackage.qc0) r1
            r1.getClass()
            java.lang.Object r2 = r1.c(r2)
            if (r2 != 0) goto L25
            goto L26
        L25:
            r3 = r2
        L26:
            r3.getClass()
            android.util.Range r3 = (android.util.Range) r3
            r0.c = r3
            java.lang.Comparable r2 = r3.getUpper()
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L36
            goto L3c
        L36:
            int r2 = r2.intValue()
            if (r2 == 0) goto L4d
        L3c:
            java.lang.Comparable r2 = r3.getLower()
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L45
            goto L4b
        L45:
            int r2 = r2.intValue()
            if (r2 == 0) goto L4d
        L4b:
            r2 = 1
            goto L4e
        L4d:
            r2 = 0
        L4e:
            r0.d = r2
            if (r2 != 0) goto L58
            android.util.Rational r1 = android.util.Rational.ZERO
            r1.getClass()
            goto L66
        L58:
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP
            r2.getClass()
            java.lang.Object r1 = r1.c(r2)
            r1.getClass()
            android.util.Rational r1 = (android.util.Rational) r1
        L66:
            r0.e = r1
            return
    }
}
