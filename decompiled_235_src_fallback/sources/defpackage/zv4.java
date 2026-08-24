package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zv4  reason: default package */
/* loaded from: classes.dex */
public abstract class zv4 implements java.util.Iterator, defpackage.zf3 {
    public final defpackage.bc7[] A;
    public int B;
    public boolean L;

    public zv4(defpackage.ac7 r3, defpackage.bc7[] r4) {
            r2 = this;
            r2.<init>()
            r2.A = r4
            r0 = 1
            r2.L = r0
            r0 = 0
            r4 = r4[r0]
            java.lang.Object[] r1 = r3.d
            int r3 = r3.a
            int r3 = java.lang.Integer.bitCount(r3)
            int r3 = r3 * 2
            r4.a(r1, r3, r0)
            r2.B = r0
            r2.a()
            return
    }

    public final void a() {
            r9 = this;
            int r0 = r9.B
            bc7[] r1 = r9.A
            r2 = r1[r0]
            int r3 = r2.L
            int r2 = r2.B
            if (r3 >= r2) goto Ld
            return
        Ld:
            r2 = 0
            r3 = -1
            if (r3 >= r0) goto L49
            int r4 = r9.b(r0)
            if (r4 != r3) goto L29
            r5 = r1[r0]
            int r6 = r5.L
            java.lang.Object[] r7 = r5.A
            int r8 = r7.length
            if (r6 >= r8) goto L29
            int r4 = r7.length
            int r6 = r6 + 1
            r5.L = r6
            int r4 = r9.b(r0)
        L29:
            if (r4 == r3) goto L2e
            r9.B = r4
            return
        L2e:
            if (r0 <= 0) goto L3d
            int r3 = r0 + (-1)
            r3 = r1[r3]
            int r4 = r3.L
            java.lang.Object[] r5 = r3.A
            int r5 = r5.length
            int r4 = r4 + 1
            r3.L = r4
        L3d:
            r3 = r1[r0]
            ac7 r4 = defpackage.ac7.e
            java.lang.Object[] r4 = r4.d
            r3.a(r4, r2, r2)
            int r0 = r0 + (-1)
            goto Ld
        L49:
            r9.L = r2
            return
    }

    public final int b(int r5) {
            r4 = this;
            bc7[] r0 = r4.A
            r1 = r0[r5]
            int r2 = r1.L
            int r3 = r1.B
            if (r2 >= r3) goto Lb
            return r5
        Lb:
            java.lang.Object[] r1 = r1.A
            int r3 = r1.length
            if (r2 >= r3) goto L3f
            int r3 = r1.length
            r1 = r1[r2]
            r1.getClass()
            ac7 r1 = (defpackage.ac7) r1
            r2 = 6
            r3 = 0
            if (r5 != r2) goto L27
            int r2 = r5 + 1
            r0 = r0[r2]
            java.lang.Object[] r1 = r1.d
            int r2 = r1.length
            r0.a(r1, r2, r3)
            goto L38
        L27:
            int r2 = r5 + 1
            r0 = r0[r2]
            java.lang.Object[] r2 = r1.d
            int r1 = r1.a
            int r1 = java.lang.Integer.bitCount(r1)
            int r1 = r1 * 2
            r0.a(r2, r1, r3)
        L38:
            int r5 = r5 + 1
            int r4 = r4.b(r5)
            return r4
        L3f:
            r4 = -1
            return r4
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            boolean r0 = r0.L
            return r0
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.L
            if (r0 == 0) goto L12
            bc7[] r0 = r2.A
            int r1 = r2.B
            r0 = r0[r1]
            java.lang.Object r0 = r0.next()
            r2.a()
            return r0
        L12:
            defpackage.fa6.c()
            r2 = 0
            return r2
    }

    @Override // java.util.Iterator
    public void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }
}
