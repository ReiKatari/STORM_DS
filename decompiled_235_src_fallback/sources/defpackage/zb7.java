package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zb7  reason: default package */
/* loaded from: classes.dex */
public final class zb7 extends defpackage.a1 {
    public int L;
    public java.lang.Object[] R;
    public boolean X;

    public zb7(java.lang.Object[] r3, int r4, int r5, int r6) {
            r2 = this;
            r2.<init>(r4, r5)
            r2.L = r6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r2.R = r6
            r0 = 0
            r1 = 1
            if (r4 != r5) goto Lf
            r5 = r1
            goto L10
        Lf:
            r5 = r0
        L10:
            r2.X = r5
            r6[r0] = r3
            int r4 = r4 - r5
            r2.b(r4, r1)
            return
    }

    public final java.lang.Object a() {
            r2 = this;
            int r0 = r2.A
            r0 = r0 & 31
            java.lang.Object[] r1 = r2.R
            int r2 = r2.L
            int r2 = r2 + (-1)
            r2 = r1[r2]
            r2.getClass()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r2 = r2[r0]
            return r2
    }

    public final void b(int r5, int r6) {
            r4 = this;
            int r0 = r4.L
            int r0 = r0 - r6
            int r0 = r0 * 5
        L5:
            int r1 = r4.L
            if (r6 >= r1) goto L21
            java.lang.Object[] r1 = r4.R
            int r2 = r6 + (-1)
            r2 = r1[r2]
            r2.getClass()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r3 = defpackage.uj2.R(r5, r0)
            r2 = r2[r3]
            r1[r6] = r2
            int r0 = r0 + (-5)
            int r6 = r6 + 1
            goto L5
        L21:
            return
    }

    public final void c(int r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.A
            int r1 = defpackage.uj2.R(r1, r0)
            if (r1 != r3) goto Lc
            int r0 = r0 + 5
            goto L1
        Lc:
            if (r0 <= 0) goto L1c
            int r3 = r2.L
            int r3 = r3 + (-1)
            int r0 = r0 / 5
            int r3 = r3 - r0
            int r0 = r2.A
            int r3 = r3 + 1
            r2.b(r0, r3)
        L1c:
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r4.a()
            int r1 = r4.A
            r2 = 1
            int r1 = r1 + r2
            r4.A = r1
            int r3 = r4.B
            if (r1 != r3) goto L17
            r4.X = r2
            return r0
        L17:
            r1 = 0
            r4.c(r1)
            return r0
        L1c:
            defpackage.fa6.c()
            r4 = 0
            return r4
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r1 = this;
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L22
            int r0 = r1.A
            int r0 = r0 + (-1)
            r1.A = r0
            boolean r0 = r1.X
            if (r0 == 0) goto L18
            r0 = 0
            r1.X = r0
            java.lang.Object r1 = r1.a()
            return r1
        L18:
            r0 = 31
            r1.c(r0)
            java.lang.Object r1 = r1.a()
            return r1
        L22:
            defpackage.fa6.c()
            r1 = 0
            return r1
    }
}
