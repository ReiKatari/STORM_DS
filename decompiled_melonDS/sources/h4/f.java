package h4;

import m4.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f6074a;

    /* renamed from: b  reason: collision with root package name */
    public float f6075b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f6076c;

    public f(k kVar) {
        this.f6076c = kVar;
        this.f6074a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f6076c
            m4.k r0 = (m4.k) r0
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L1d
            android.text.Layout r3 = r0.f9221f
            int r3 = q8.r.G(r3, r6, r7)
            android.text.Layout r4 = r0.f9221f
            int r4 = r4.getLineStart(r3)
            int r3 = r0.f(r3)
            if (r6 == r4) goto L1f
            if (r6 != r3) goto L1d
            goto L1f
        L1d:
            r3 = r2
            goto L20
        L1f:
            r3 = r1
        L20:
            int r4 = r6 * 4
            if (r9 == 0) goto L28
            if (r3 == 0) goto L2d
            r1 = r2
            goto L2d
        L28:
            if (r3 == 0) goto L2c
            r1 = 2
            goto L2d
        L2c:
            r1 = 3
        L2d:
            int r4 = r4 + r1
            int r1 = r5.f6074a
            if (r1 != r4) goto L35
            float r6 = r5.f6075b
            return r6
        L35:
            if (r9 == 0) goto L3c
            float r6 = r0.h(r6, r7)
            goto L40
        L3c:
            float r6 = r0.i(r6, r7)
        L40:
            if (r8 == 0) goto L46
            r5.f6074a = r4
            r5.f6075b = r6
        L46:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.f.a(int, boolean, boolean, boolean):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(float r5, ec.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof h4.e
            if (r0 == 0) goto L13
            r0 = r6
            h4.e r0 = (h4.e) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            h4.e r0 = new h4.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r6)
            goto L43
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L2e:
            p7.j.I(r6)
            java.lang.Object r6 = r4.f6076c
            g2.b r6 = (g2.b) r6
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.Y = r3
            java.lang.Object r6 = r6.j(r2, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.f6075b
            float r6 = r6 + r5
            r4.f6075b = r6
            yb.y r5 = yb.y.f14813a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.f.b(float, ec.c):java.lang.Object");
    }

    public f(int i2, g2.b bVar) {
        this.f6074a = i2;
        this.f6076c = bVar;
    }
}
