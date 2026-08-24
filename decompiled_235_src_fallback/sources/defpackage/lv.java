package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lv  reason: default package */
/* loaded from: classes.dex */
public final class lv implements java.util.Comparator {
    public final /* synthetic */ int a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public lv(android.util.Rational r3, android.util.Rational r4) {
            r2 = this;
            r0 = 0
            r2.a = r0
            r2.<init>()
            if (r4 == 0) goto L9
            goto L10
        L9:
            android.util.Rational r4 = new android.util.Rational
            r0 = 4
            r1 = 3
            r4.<init>(r0, r1)
        L10:
            r2.c = r4
            android.graphics.RectF r3 = r2.b(r3)
            r2.b = r3
            return
    }

    public lv(defpackage.ko5 r2, java.util.Map r3) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r1.b = r2
            r1.c = r3
            return
    }

    public static float a(android.graphics.RectF r3, android.graphics.RectF r4) {
            float r0 = r3.width()
            float r1 = r4.width()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L11
            float r0 = r3.width()
            goto L15
        L11:
            float r0 = r4.width()
        L15:
            float r1 = r3.height()
            float r2 = r4.height()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L26
            float r3 = r3.height()
            goto L2a
        L26:
            float r3 = r4.height()
        L2a:
            float r0 = r0 * r3
            return r0
    }

    public android.graphics.RectF b(android.util.Rational r5) {
            r4 = this;
            float r0 = r5.floatValue()
            java.lang.Object r4 = r4.c
            android.util.Rational r4 = (android.util.Rational) r4
            float r1 = r4.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L21
            android.graphics.RectF r5 = new android.graphics.RectF
            int r0 = r4.getNumerator()
            float r0 = (float) r0
            int r4 = r4.getDenominator()
            float r4 = (float) r4
            r5.<init>(r1, r1, r0, r4)
            return r5
        L21:
            float r0 = r5.floatValue()
            float r2 = r4.floatValue()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L49
            android.graphics.RectF r0 = new android.graphics.RectF
            int r2 = r4.getNumerator()
            float r2 = (float) r2
            int r3 = r5.getDenominator()
            float r3 = (float) r3
            int r4 = r4.getNumerator()
            float r4 = (float) r4
            float r3 = r3 * r4
            int r4 = r5.getNumerator()
            float r4 = (float) r4
            float r3 = r3 / r4
            r0.<init>(r1, r1, r2, r3)
            return r0
        L49:
            android.graphics.RectF r0 = new android.graphics.RectF
            int r2 = r5.getNumerator()
            float r2 = (float) r2
            int r3 = r4.getDenominator()
            float r3 = (float) r3
            float r2 = r2 * r3
            int r5 = r5.getDenominator()
            float r5 = (float) r5
            float r2 = r2 / r5
            int r4 = r4.getDenominator()
            float r4 = (float) r4
            r0.<init>(r1, r1, r2, r4)
            return r0
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.a
            java.lang.Object r1 = r5.b
            switch(r0) {
                case 0: goto L44;
                default: goto L7;
            }
        L7:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object r5 = r5.c
            java.util.Map r5 = (java.util.Map) r5
            ko5 r1 = (defpackage.ko5) r1
            int r1 = r1.compare(r6, r7)
            if (r1 == 0) goto L1d
            goto L43
        L1d:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r5.get(r6)
            dk4 r6 = (defpackage.dk4) r6
            if (r6 == 0) goto L2e
            long r1 = r6.a
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            goto L2f
        L2e:
            r6 = r0
        L2f:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r5.get(r7)
            dk4 r5 = (defpackage.dk4) r5
            if (r5 == 0) goto L3f
            long r0 = r5.a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L3f:
            int r1 = defpackage.g04.z(r6, r0)
        L43:
            return r1
        L44:
            android.util.Rational r6 = (android.util.Rational) r6
            android.util.Rational r7 = (android.util.Rational) r7
            android.graphics.RectF r1 = (android.graphics.RectF) r1
            boolean r0 = r6.equals(r7)
            r2 = 0
            if (r0 == 0) goto L53
            goto Lc4
        L53:
            android.graphics.RectF r6 = r5.b(r6)
            android.graphics.RectF r5 = r5.b(r7)
            float r7 = r6.width()
            float r0 = r1.width()
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r0 = 1
            if (r7 < 0) goto L76
            float r7 = r6.height()
            float r3 = r1.height()
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 < 0) goto L76
            r7 = r0
            goto L77
        L76:
            r7 = r2
        L77:
            float r3 = r5.width()
            float r4 = r1.width()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L90
            float r3 = r5.height()
            float r4 = r1.height()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L90
            r2 = r0
        L90:
            if (r7 == 0) goto Lad
            if (r2 == 0) goto Lad
            float r7 = r6.width()
            float r6 = r6.height()
            float r6 = r6 * r7
            float r7 = r5.width()
            float r5 = r5.height()
            float r5 = r5 * r7
            float r6 = r6 - r5
            float r5 = java.lang.Math.signum(r6)
            int r2 = (int) r5
            goto Lc4
        Lad:
            if (r7 == 0) goto Lb1
            r2 = -1
            goto Lc4
        Lb1:
            if (r2 == 0) goto Lb5
            r2 = r0
            goto Lc4
        Lb5:
            float r6 = a(r6, r1)
            float r5 = a(r5, r1)
            float r6 = r6 - r5
            float r5 = java.lang.Math.signum(r6)
            int r5 = (int) r5
            int r2 = -r5
        Lc4:
            return r2
    }
}
