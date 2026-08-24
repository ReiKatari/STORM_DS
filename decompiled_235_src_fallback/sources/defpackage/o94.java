package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o94  reason: default package */
/* loaded from: classes.dex */
public final class o94 {
    public int[] a;
    public int b;

    public /* synthetic */ o94() {
            r1 = this;
            r0 = 16
            r1.<init>(r0)
            return
    }

    public o94(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L8
            int[] r1 = defpackage.p93.a
            goto La
        L8:
            int[] r1 = new int[r1]
        La:
            r0.a = r1
            return
    }

    public final void a(int r3) {
            r2 = this;
            int r0 = r2.b
            int r0 = r0 + 1
            r2.b(r0)
            int[] r0 = r2.a
            int r1 = r2.b
            r0[r1] = r3
            int r1 = r1 + 1
            r2.b = r1
            return
    }

    public final void b(int r3) {
            r2 = this;
            int[] r0 = r2.a
            int r1 = r0.length
            if (r1 >= r3) goto L14
            int r1 = r0.length
            int r1 = r1 * 3
            int r1 = r1 / 2
            int r3 = java.lang.Math.max(r3, r1)
            int[] r3 = java.util.Arrays.copyOf(r0, r3)
            r2.a = r3
        L14:
            return
    }

    public final int c(int r2) {
            r1 = this;
            if (r2 < 0) goto Lb
            int r0 = r1.b
            if (r2 >= r0) goto Lb
            int[] r1 = r1.a
            r1 = r1[r2]
            return r1
        Lb:
            java.lang.String r1 = "Index must be between 0 and size"
            defpackage.e41.q(r1)
            r1 = 0
            return r1
    }

    public final int d() {
            r1 = this;
            int r0 = r1.b
            if (r0 == 0) goto Lb
            int[] r1 = r1.a
            int r0 = r0 + (-1)
            r1 = r1[r0]
            return r1
        Lb:
            java.lang.String r1 = "IntList is empty."
            defpackage.fa6.e(r1)
            r1 = 0
            return r1
    }

    public final void e(int r4) {
            r3 = this;
            if (r4 < 0) goto L1a
            int r0 = r3.b
            if (r4 >= r0) goto L1a
            int[] r1 = r3.a
            r2 = r1[r4]
            int r2 = r0 + (-1)
            if (r4 == r2) goto L13
            int r2 = r4 + 1
            defpackage.fv.r0(r4, r2, r0, r1, r1)
        L13:
            int r4 = r3.b
            int r4 = r4 + (-1)
            r3.b = r4
            return
        L1a:
            java.lang.String r3 = "Index must be between 0 and size"
            defpackage.e41.q(r3)
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof defpackage.o94
            r1 = 0
            if (r0 == 0) goto L2a
            o94 r6 = (defpackage.o94) r6
            int r0 = r6.b
            int r2 = r5.b
            if (r0 == r2) goto Le
            goto L2a
        Le:
            int[] r5 = r5.a
            int[] r6 = r6.a
            l93 r0 = defpackage.gi2.R(r1, r2)
            int r2 = r0.A
            int r0 = r0.B
            if (r2 > r0) goto L28
        L1c:
            r3 = r5[r2]
            r4 = r6[r2]
            if (r3 == r4) goto L23
            return r1
        L23:
            if (r2 == r0) goto L28
            int r2 = r2 + 1
            goto L1c
        L28:
            r5 = 1
            return r5
        L2a:
            return r1
    }

    public final void f(int r2, int r3) {
            r1 = this;
            if (r2 < 0) goto Ld
            int r0 = r1.b
            if (r2 >= r0) goto Ld
            int[] r1 = r1.a
            r0 = r1[r2]
            r1[r2] = r3
            return
        Ld:
            java.lang.String r1 = "Index must be between 0 and size"
            defpackage.e41.q(r1)
            return
    }

    public final int hashCode() {
            r4 = this;
            int[] r0 = r4.a
            int r4 = r4.b
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r4) goto L14
            r3 = r0[r1]
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 * 31
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L14:
            return r2
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            int[] r1 = r5.a
            int r5 = r5.b
            r2 = 0
        Lf:
            if (r2 >= r5) goto L29
            r3 = r1[r2]
            r4 = -1
            if (r2 != r4) goto L1c
            java.lang.String r5 = "..."
            r0.append(r5)
            goto L2e
        L1c:
            if (r2 == 0) goto L23
            java.lang.String r4 = ", "
            r0.append(r4)
        L23:
            r0.append(r3)
            int r2 = r2 + 1
            goto Lf
        L29:
            java.lang.String r5 = "]"
            r0.append(r5)
        L2e:
            java.lang.String r5 = r0.toString()
            return r5
    }
}
