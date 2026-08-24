package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kw4  reason: default package */
/* loaded from: classes.dex */
public final class kw4 extends defpackage.a1 {
    public final java.lang.Object[] L;
    public final defpackage.zb7 R;

    public kw4(java.lang.Object[] r1, java.lang.Object[] r2, int r3, int r4, int r5) {
            r0 = this;
            r0.<init>(r3, r4)
            r0.L = r2
            int r4 = r4 + (-1)
            r2 = r4 & (-32)
            if (r3 <= r2) goto Lc
            r3 = r2
        Lc:
            zb7 r4 = new zb7
            r4.<init>(r1, r3, r2, r5)
            r0.R = r4
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            zb7 r0 = r3.R
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            int r1 = r3.A
            int r1 = r1 + 1
            r3.A = r1
            java.lang.Object r3 = r0.next()
            return r3
        L19:
            int r1 = r3.A
            int r2 = r1 + 1
            r3.A = r2
            int r0 = r0.B
            int r1 = r1 - r0
            java.lang.Object[] r3 = r3.L
            r3 = r3[r1]
            return r3
        L27:
            defpackage.fa6.c()
            r3 = 0
            return r3
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r3 = this;
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L21
            int r0 = r3.A
            zb7 r1 = r3.R
            int r2 = r1.B
            if (r0 <= r2) goto L18
            int r0 = r0 + (-1)
            r3.A = r0
            int r0 = r0 - r2
            java.lang.Object[] r3 = r3.L
            r3 = r3[r0]
            return r3
        L18:
            int r0 = r0 + (-1)
            r3.A = r0
            java.lang.Object r3 = r1.previous()
            return r3
        L21:
            defpackage.fa6.c()
            r3 = 0
            return r3
    }
}
