package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mv  reason: default package */
/* loaded from: classes.dex */
public abstract class mv {
    public static final android.util.Rational a = null;
    public static final android.util.Rational b = null;
    public static final android.util.Rational c = null;
    public static final android.util.Rational d = null;

    static {
            android.util.Rational r0 = new android.util.Rational
            r1 = 4
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.mv.a = r0
            android.util.Rational r0 = new android.util.Rational
            r0.<init>(r2, r1)
            defpackage.mv.b = r0
            android.util.Rational r0 = new android.util.Rational
            r1 = 16
            r2 = 9
            r0.<init>(r1, r2)
            defpackage.mv.c = r0
            android.util.Rational r0 = new android.util.Rational
            r0.<init>(r2, r1)
            defpackage.mv.d = r0
            return
    }

    public static boolean a(android.util.Rational r5, android.util.Size r6) {
            android.util.Size r0 = defpackage.mj6.b
            r1 = 0
            if (r5 != 0) goto L6
            goto L70
        L6:
            android.util.Rational r2 = new android.util.Rational
            int r3 = r6.getWidth()
            int r4 = r6.getHeight()
            r2.<init>(r3, r4)
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1a
            goto L5e
        L1a:
            int r2 = r6.getWidth()
            int r3 = r6.getHeight()
            int r3 = r3 * r2
            int r0 = defpackage.mj6.a(r0)
            if (r3 < r0) goto L70
            int r0 = r6.getWidth()
            int r6 = r6.getHeight()
            android.util.Rational r2 = new android.util.Rational
            int r3 = r5.getDenominator()
            int r4 = r5.getNumerator()
            r2.<init>(r3, r4)
            int r3 = r0 % 16
            if (r3 != 0) goto L60
            int r4 = r6 % 16
            if (r4 != 0) goto L60
            int r3 = r6 + (-16)
            int r3 = java.lang.Math.max(r1, r3)
            boolean r5 = b(r3, r0, r5)
            if (r5 != 0) goto L5e
            int r0 = r0 + (-16)
            int r5 = java.lang.Math.max(r1, r0)
            boolean r5 = b(r5, r6, r2)
            if (r5 == 0) goto L70
        L5e:
            r5 = 1
            return r5
        L60:
            if (r3 != 0) goto L67
            boolean r5 = b(r6, r0, r5)
            return r5
        L67:
            int r5 = r6 % 16
            if (r5 != 0) goto L70
            boolean r5 = b(r0, r6, r2)
            return r5
        L70:
            return r1
    }

    public static boolean b(int r7, int r8, android.util.Rational r9) {
            int r0 = r8 % 16
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = r2
        L9:
            defpackage.np2.t(r0)
            int r0 = r9.getNumerator()
            int r0 = r0 * r7
            double r3 = (double) r0
            int r7 = r9.getDenominator()
            double r5 = (double) r7
            double r3 = r3 / r5
            int r7 = r8 + (-16)
            int r7 = java.lang.Math.max(r2, r7)
            double r5 = (double) r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2b
            int r8 = r8 + 16
            double r7 = (double) r8
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 >= 0) goto L2b
            return r1
        L2b:
            return r2
    }
}
