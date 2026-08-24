package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oc4  reason: default package */
/* loaded from: classes.dex */
public final class oc4 implements java.util.Iterator, defpackage.zf3 {
    public int A;
    public boolean B;
    public final /* synthetic */ defpackage.dk0 L;

    public oc4(defpackage.dk0 r1) {
            r0 = this;
            r0.<init>()
            r0.L = r1
            r1 = -1
            r0.A = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.A
            r1 = 1
            int r0 = r0 + r1
            dk0 r2 = r2.L
            java.lang.Object r2 = r2.X
            un6 r2 = (defpackage.un6) r2
            int r2 = r2.f()
            if (r0 >= r2) goto L11
            return r1
        L11:
            r2 = 0
            return r2
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1b
            r0 = 1
            r3.B = r0
            dk0 r1 = r3.L
            java.lang.Object r1 = r1.X
            un6 r1 = (defpackage.un6) r1
            int r2 = r3.A
            int r2 = r2 + r0
            r3.A = r2
            java.lang.Object r3 = r1.g(r2)
            ic4 r3 = (defpackage.ic4) r3
            return r3
        L1b:
            defpackage.fa6.c()
            r3 = 0
            return r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r5 = this;
            boolean r0 = r5.B
            if (r0 == 0) goto L2c
            dk0 r0 = r5.L
            java.lang.Object r0 = r0.X
            un6 r0 = (defpackage.un6) r0
            int r1 = r5.A
            java.lang.Object r1 = r0.g(r1)
            ic4 r1 = (defpackage.ic4) r1
            r2 = 0
            r1.L = r2
            int r1 = r5.A
            java.lang.Object[] r2 = r0.L
            r3 = r2[r1]
            java.lang.Object r4 = defpackage.vy7.d0
            if (r3 == r4) goto L24
            r2[r1] = r4
            r2 = 1
            r0.A = r2
        L24:
            int r1 = r1 + (-1)
            r5.A = r1
            r0 = 0
            r5.B = r0
            return
        L2c:
            java.lang.String r5 = "You must call next() before you can remove an element"
            defpackage.i.m(r5)
            return
    }
}
