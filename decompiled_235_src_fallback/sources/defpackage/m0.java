package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m0  reason: default package */
/* loaded from: classes.dex */
public abstract class m0 implements defpackage.gg3 {
    @Override // defpackage.gg3
    public java.lang.Object c(defpackage.sc1 r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r1 = r1.j(r2, r0)
            return r1
    }

    public abstract java.lang.Object f();

    public abstract int g(java.lang.Object r1);

    public abstract java.util.Iterator h(java.lang.Object r1);

    public abstract int i(java.lang.Object r1);

    public final java.lang.Object j(defpackage.sc1 r4, java.lang.Object r5) {
            r3 = this;
            if (r5 == 0) goto L7
            java.lang.Object r5 = r3.l(r5)
            goto Lb
        L7:
            java.lang.Object r5 = r3.f()
        Lb:
            int r0 = r3.g(r5)
            wb6 r1 = r3.e()
            ux0 r4 = r4.c(r1)
            r4.getClass()
        L1a:
            wb6 r1 = r3.e()
            int r1 = r4.q(r1)
            r2 = -1
            if (r1 == r2) goto L2a
            int r1 = r1 + r0
            r3.k(r4, r1, r5)
            goto L1a
        L2a:
            wb6 r0 = r3.e()
            r4.a(r0)
            java.lang.Object r3 = r3.m(r5)
            return r3
    }

    public abstract void k(defpackage.ux0 r1, int r2, java.lang.Object r3);

    public abstract java.lang.Object l(java.lang.Object r1);

    public abstract java.lang.Object m(java.lang.Object r1);
}
