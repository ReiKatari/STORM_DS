package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h62  reason: default package */
/* loaded from: classes.dex */
public final class h62 {
    public final boolean a;
    public final int b;
    public final android.util.Range c;
    public final android.util.Rational d;

    public h62(boolean r1, int r2, android.util.Range r3, android.util.Rational r4) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.h62
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h62 r5 = (defpackage.h62) r5
            boolean r1 = r4.a
            boolean r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            android.util.Range r1 = r4.c
            android.util.Range r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L25
            return r2
        L25:
            android.util.Rational r4 = r4.d
            android.util.Rational r5 = r5.d
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L30
            return r2
        L30:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            android.util.Range r2 = r3.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            android.util.Rational r3 = r3.d
            int r3 = r3.hashCode()
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EvCompValue(supported="
            r0.<init>(r1)
            boolean r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", index="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", range="
            r0.append(r1)
            android.util.Range r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", step="
            r0.append(r1)
            android.util.Rational r2 = r2.d
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
