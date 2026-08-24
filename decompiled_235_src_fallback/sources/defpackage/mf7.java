package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mf7  reason: default package */
/* loaded from: classes.dex */
public final class mf7 implements java.lang.Comparable {
    public final int A;

    public /* synthetic */ mf7(int r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            mf7 r2 = (defpackage.mf7) r2
            int r2 = r2.A
            int r1 = r1.A
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 ^ r0
            r2 = r2 ^ r0
            int r1 = defpackage.nb3.p(r1, r2)
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.mf7
            if (r0 != 0) goto L5
            goto Ld
        L5:
            mf7 r2 = (defpackage.mf7) r2
            int r2 = r2.A
            int r1 = r1.A
            if (r1 == r2) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.A
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            int r4 = r4.A
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            java.lang.String r4 = java.lang.String.valueOf(r0)
            return r4
    }
}
