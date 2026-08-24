package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ek7  reason: default package */
/* loaded from: classes.dex */
public final class ek7 implements java.lang.Comparable, java.io.Serializable {
    public static final defpackage.ek7 L = null;
    public final long A;
    public final long B;

    static {
            ek7 r0 = new ek7
            r1 = 0
            r0.<init>(r1, r1)
            defpackage.ek7.L = r0
            return
    }

    public ek7(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r3
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r8) {
            r7 = this;
            ek7 r8 = (defpackage.ek7) r8
            r8.getClass()
            long r0 = r8.A
            long r2 = r7.A
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r5 = -9223372036854775808
            if (r4 == 0) goto L17
            long r7 = r2 ^ r5
            long r0 = r0 ^ r5
            int r7 = java.lang.Long.compare(r7, r0)
            return r7
        L17:
            long r0 = r8.B
            long r7 = r7.B
            long r7 = r7 ^ r5
            long r0 = r0 ^ r5
            int r7 = java.lang.Long.compare(r7, r0)
            return r7
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.ek7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ek7 r8 = (defpackage.ek7) r8
            long r3 = r8.A
            long r5 = r7.A
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L1d
            long r3 = r7.B
            long r7 = r8.B
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 != 0) goto L1d
            return r0
        L1d:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.A
            long r2 = r4.B
            long r0 = r0 ^ r2
            int r4 = java.lang.Long.hashCode(r0)
            return r4
    }

    public final java.lang.String toString() {
            r8 = this;
            r0 = 36
            byte[] r3 = new byte[r0]
            r5 = 0
            r6 = 4
            long r1 = r8.A
            r4 = 0
            defpackage.xk2.i(r1, r3, r4, r5, r6)
            r0 = 8
            r7 = 45
            r3[r0] = r7
            r5 = 4
            r6 = 6
            long r1 = r8.A
            r4 = 9
            defpackage.xk2.i(r1, r3, r4, r5, r6)
            r0 = 13
            r3[r0] = r7
            r5 = 6
            r6 = 8
            long r1 = r8.A
            r4 = 14
            defpackage.xk2.i(r1, r3, r4, r5, r6)
            r0 = 18
            r3[r0] = r7
            r5 = 0
            r6 = 2
            long r1 = r8.B
            r4 = 19
            defpackage.xk2.i(r1, r3, r4, r5, r6)
            r0 = 23
            r3[r0] = r7
            r5 = 2
            r6 = 8
            long r1 = r8.B
            r4 = 24
            defpackage.xk2.i(r1, r3, r4, r5, r6)
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r0 = defpackage.qm0.a
            r8.<init>(r3, r0)
            return r8
    }
}
