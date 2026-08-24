package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rf7  reason: default package */
/* loaded from: classes.dex */
public final class rf7 implements java.lang.Comparable {
    public final long A;

    public /* synthetic */ rf7(long r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r5) {
            r4 = this;
            rf7 r5 = (defpackage.rf7) r5
            long r0 = r5.A
            long r4 = r4.A
            r2 = -9223372036854775808
            long r4 = r4 ^ r2
            long r0 = r0 ^ r2
            int r4 = defpackage.nb3.q(r4, r0)
            return r4
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.rf7
            if (r0 != 0) goto L5
            goto Lf
        L5:
            rf7 r3 = (defpackage.rf7) r3
            long r0 = r3.A
            long r2 = r2.A
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.A
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.A
            r2 = 10
            java.lang.String r2 = defpackage.jx2.R(r2, r0)
            return r2
    }
}
