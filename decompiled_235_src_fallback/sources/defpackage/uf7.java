package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uf7  reason: default package */
/* loaded from: classes.dex */
public final class uf7 extends defpackage.u25 {
    public static final defpackage.uf7 c = null;

    static {
            uf7 r0 = new uf7
            vf7 r1 = defpackage.vf7.a
            r0.<init>(r1)
            defpackage.uf7.c = r0
            return
    }

    @Override // defpackage.m0
    public final int i(java.lang.Object r1) {
            r0 = this;
            sf7 r1 = (defpackage.sf7) r1
            long[] r0 = r1.A
            int r0 = r0.length
            return r0
    }

    @Override // defpackage.ct0, defpackage.m0
    public final void k(defpackage.ux0 r3, int r4, java.lang.Object r5) {
            r2 = this;
            tf7 r5 = (defpackage.tf7) r5
            r5.getClass()
            t25 r2 = r2.b
            sc1 r2 = r3.e(r2, r4)
            long r2 = r2.L()
            defpackage.s25.c(r5)
            long[] r4 = r5.a
            int r0 = r5.b
            int r1 = r0 + 1
            r5.b = r1
            r4[r0] = r2
            return
    }

    @Override // defpackage.m0
    public final java.lang.Object l(java.lang.Object r1) {
            r0 = this;
            sf7 r1 = (defpackage.sf7) r1
            long[] r0 = r1.A
            tf7 r1 = new tf7
            r1.<init>()
            r1.a = r0
            int r0 = r0.length
            r1.b = r0
            r0 = 10
            r1.b(r0)
            return r1
    }

    @Override // defpackage.u25
    public final java.lang.Object o() {
            r1 = this;
            r1 = 0
            long[] r1 = new long[r1]
            sf7 r0 = new sf7
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.u25
    public final void p(defpackage.vx0 r5, java.lang.Object r6, int r7) {
            r4 = this;
            sf7 r6 = (defpackage.sf7) r6
            long[] r6 = r6.A
            r5.getClass()
            r0 = 0
        L8:
            if (r0 >= r7) goto L18
            t25 r1 = r4.b
            x32 r1 = r5.a0(r1, r0)
            r2 = r6[r0]
            r1.X(r2)
            int r0 = r0 + 1
            goto L8
        L18:
            return
    }
}
