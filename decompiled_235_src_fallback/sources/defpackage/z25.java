package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z25  reason: default package */
/* loaded from: classes.dex */
public final class z25 implements java.lang.Comparable {
    public final byte[] A;

    public z25(byte[] r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.length
            byte[] r2 = java.util.Arrays.copyOf(r2, r0)
            r1.A = r2
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r5) {
            r4 = this;
            z25 r5 = (defpackage.z25) r5
            byte[] r4 = r4.A
            int r0 = r4.length
            byte[] r1 = r5.A
            int r2 = r1.length
            if (r0 == r2) goto Le
            int r4 = r4.length
            int r5 = r1.length
            int r4 = r4 - r5
            return r4
        Le:
            r0 = 0
            r1 = r0
        L10:
            int r2 = r4.length
            if (r1 >= r2) goto L20
            r2 = r4[r1]
            byte[] r3 = r5.A
            r3 = r3[r1]
            if (r2 == r3) goto L1d
            int r2 = r2 - r3
            return r2
        L1d:
            int r1 = r1 + 1
            goto L10
        L20:
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.z25
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            z25 r2 = (defpackage.z25) r2
            byte[] r1 = r1.A
            byte[] r2 = r2.A
            boolean r1 = java.util.Arrays.equals(r1, r2)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            byte[] r0 = r0.A
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            byte[] r0 = r0.A
            java.lang.String r0 = defpackage.np2.L(r0)
            return r0
    }
}
