package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t94  reason: default package */
/* loaded from: classes.dex */
public final class t94 {
    public long[] a;
    public int b;

    public /* synthetic */ t94() {
            r1 = this;
            r0 = 16
            r1.<init>(r0)
            return
    }

    public t94(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L8
            long[] r1 = defpackage.gz3.a
            goto La
        L8:
            long[] r1 = new long[r1]
        La:
            r0.a = r1
            return
    }

    public final void a(long r4) {
            r3 = this;
            int r0 = r3.b
            int r0 = r0 + 1
            long[] r1 = r3.a
            int r2 = r1.length
            if (r2 >= r0) goto L18
            int r2 = r1.length
            int r2 = r2 * 3
            int r2 = r2 / 2
            int r0 = java.lang.Math.max(r0, r2)
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.a = r0
        L18:
            long[] r0 = r3.a
            int r1 = r3.b
            r0[r1] = r4
            int r1 = r1 + 1
            r3.b = r1
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            boolean r0 = r8 instanceof defpackage.t94
            r1 = 0
            if (r0 == 0) goto L2c
            t94 r8 = (defpackage.t94) r8
            int r0 = r8.b
            int r2 = r7.b
            if (r0 == r2) goto Le
            goto L2c
        Le:
            long[] r7 = r7.a
            long[] r8 = r8.a
            l93 r0 = defpackage.gi2.R(r1, r2)
            int r2 = r0.A
            int r0 = r0.B
            if (r2 > r0) goto L2a
        L1c:
            r3 = r7[r2]
            r5 = r8[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L25
            return r1
        L25:
            if (r2 == r0) goto L2a
            int r2 = r2 + 1
            goto L1c
        L2a:
            r7 = 1
            return r7
        L2c:
            return r1
    }

    public final int hashCode() {
            r5 = this;
            long[] r0 = r5.a
            int r5 = r5.b
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r5) goto L14
            r3 = r0[r1]
            int r3 = java.lang.Long.hashCode(r3)
            int r3 = r3 * 31
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L14:
            return r2
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            long[] r1 = r6.a
            int r6 = r6.b
            r2 = 0
        Lf:
            if (r2 >= r6) goto L29
            r3 = r1[r2]
            r5 = -1
            if (r2 != r5) goto L1c
            java.lang.String r6 = "..."
            r0.append(r6)
            goto L2e
        L1c:
            if (r2 == 0) goto L23
            java.lang.String r5 = ", "
            r0.append(r5)
        L23:
            r0.append(r3)
            int r2 = r2 + 1
            goto Lf
        L29:
            java.lang.String r6 = "]"
            r0.append(r6)
        L2e:
            java.lang.String r6 = r0.toString()
            return r6
    }
}
