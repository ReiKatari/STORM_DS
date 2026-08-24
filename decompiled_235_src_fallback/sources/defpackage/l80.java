package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l80  reason: default package */
/* loaded from: classes.dex */
public final class l80 extends defpackage.a1 {
    public final /* synthetic */ int L;
    public final java.lang.Object R;

    public l80(java.lang.Object r2, int r3) {
            r1 = this;
            r0 = 1
            r1.L = r0
            r1.<init>(r3, r0)
            r1.R = r2
            return
    }

    public l80(java.lang.Object[] r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.L = r0
            r1.<init>(r3, r4)
            r1.R = r2
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.L
            r1 = 0
            java.lang.Object r2 = r3.R
            switch(r0) {
                case 0: goto L1a;
                default: goto L8;
            }
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L16
            int r0 = r3.A
            int r0 = r0 + 1
            r3.A = r0
            r1 = r2
            goto L19
        L16:
            defpackage.fa6.c()
        L19:
            return r1
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r0 = r3.A
            int r1 = r0 + 1
            r3.A = r1
            r1 = r2[r0]
            goto L2e
        L2b:
            defpackage.fa6.c()
        L2e:
            return r1
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r3 = this;
            int r0 = r3.L
            r1 = 0
            java.lang.Object r2 = r3.R
            switch(r0) {
                case 0: goto L1a;
                default: goto L8;
            }
        L8:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L16
            int r0 = r3.A
            int r0 = r0 + (-1)
            r3.A = r0
            r1 = r2
            goto L19
        L16:
            defpackage.fa6.c()
        L19:
            return r1
        L1a:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L2b
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r0 = r3.A
            int r0 = r0 + (-1)
            r3.A = r0
            r1 = r2[r0]
            goto L2e
        L2b:
            defpackage.fa6.c()
        L2e:
            return r1
    }
}
