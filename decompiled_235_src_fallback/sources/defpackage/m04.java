package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m04  reason: default package */
/* loaded from: classes.dex */
public final class m04 extends defpackage.o04 implements java.util.Iterator, defpackage.zf3 {
    public final /* synthetic */ int X;

    public m04(defpackage.p04 r1, int r2) {
            r0 = this;
            r0.X = r2
            r1.getClass()
            r0.<init>()
            r0.R = r1
            r2 = -1
            r0.B = r2
            int r1 = r1.d0
            r0.L = r1
            r0.e()
            return
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            int r0 = r4.X
            r1 = 0
            switch(r0) {
                case 0: goto L49;
                case 1: goto L2a;
                default: goto L6;
            }
        L6:
            r4.b()
            int r0 = r4.A
            java.lang.Object r2 = r4.R
            p04 r2 = (defpackage.p04) r2
            int r3 = r2.Y
            if (r0 >= r3) goto L26
            int r1 = r0 + 1
            r4.A = r1
            r4.B = r0
            java.lang.Object[] r0 = r2.B
            r0.getClass()
            int r1 = r4.B
            r1 = r0[r1]
            r4.e()
            goto L29
        L26:
            defpackage.fa6.c()
        L29:
            return r1
        L2a:
            r4.b()
            int r0 = r4.A
            java.lang.Object r2 = r4.R
            p04 r2 = (defpackage.p04) r2
            int r3 = r2.Y
            if (r0 >= r3) goto L45
            int r1 = r0 + 1
            r4.A = r1
            r4.B = r0
            java.lang.Object[] r1 = r2.A
            r1 = r1[r0]
            r4.e()
            goto L48
        L45:
            defpackage.fa6.c()
        L48:
            return r1
        L49:
            r4.b()
            int r0 = r4.A
            java.lang.Object r2 = r4.R
            p04 r2 = (defpackage.p04) r2
            int r3 = r2.Y
            if (r0 >= r3) goto L65
            int r1 = r0 + 1
            r4.A = r1
            r4.B = r0
            n04 r1 = new n04
            r1.<init>(r2, r0)
            r4.e()
            goto L68
        L65:
            defpackage.fa6.c()
        L68:
            return r1
    }
}
