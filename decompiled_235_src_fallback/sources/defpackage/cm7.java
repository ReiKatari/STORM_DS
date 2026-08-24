package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cm7  reason: default package */
/* loaded from: classes.dex */
public final class cm7 implements java.lang.Comparable {
    public static final defpackage.cm7 Y = null;
    public final int A;
    public final int B;
    public final int L;
    public final java.lang.String R;
    public final defpackage.ex6 X;

    static {
            cm7 r0 = new cm7
            r1 = 0
            java.lang.String r2 = ""
            r0.<init>(r1, r1, r1, r2)
            cm7 r0 = new cm7
            r3 = 1
            r0.<init>(r1, r3, r1, r2)
            defpackage.cm7.Y = r0
            cm7 r0 = new cm7
            r0.<init>(r3, r1, r1, r2)
            return
    }

    public cm7(int r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            t46 r1 = new t46
            r2 = 20
            r1.<init>(r0, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.X = r2
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r1) {
            r0 = this;
            cm7 r1 = (defpackage.cm7) r1
            r1.getClass()
            ex6 r0 = r0.X
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            ex6 r1 = r1.X
            java.lang.Object r1 = r1.getValue()
            r1.getClass()
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            int r0 = r0.compareTo(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof defpackage.cm7
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            cm7 r4 = (defpackage.cm7) r4
            int r0 = r4.A
            int r2 = r3.A
            if (r2 != r0) goto L1c
            int r0 = r3.B
            int r2 = r4.B
            if (r0 != r2) goto L1c
            int r3 = r3.L
            int r4 = r4.L
            if (r3 != r4) goto L1c
            r3 = 1
            return r3
        L1c:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            r0 = 527(0x20f, float:7.38E-43)
            int r1 = r2.A
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.B
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.L
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.R
            boolean r1 = defpackage.qs6.v0(r0)
            if (r1 != 0) goto Lf
            java.lang.String r1 = "-"
            java.lang.String r0 = r1.concat(r0)
            goto L11
        Lf:
            java.lang.String r0 = ""
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r4.A
            r1.append(r2)
            r2 = 46
            r1.append(r2)
            int r3 = r4.B
            r1.append(r3)
            r1.append(r2)
            int r4 = r4.L
            java.lang.String r4 = defpackage.lb1.o(r1, r4, r0)
            return r4
    }
}
