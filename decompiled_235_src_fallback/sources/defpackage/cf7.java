package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cf7  reason: default package */
/* loaded from: classes.dex */
public final class cf7 extends defpackage.u25 {
    public static final defpackage.cf7 c = null;

    static {
            cf7 r0 = new cf7
            df7 r1 = defpackage.df7.a
            r0.<init>(r1)
            defpackage.cf7.c = r0
            return
    }

    @Override // defpackage.m0
    public final int i(java.lang.Object r1) {
            r0 = this;
            af7 r1 = (defpackage.af7) r1
            byte[] r0 = r1.A
            int r0 = r0.length
            return r0
    }

    @Override // defpackage.ct0, defpackage.m0
    public final void k(defpackage.ux0 r2, int r3, java.lang.Object r4) {
            r1 = this;
            bf7 r4 = (defpackage.bf7) r4
            r4.getClass()
            t25 r1 = r1.b
            sc1 r1 = r2.e(r1, r3)
            byte r1 = r1.Y()
            defpackage.s25.c(r4)
            byte[] r2 = r4.a
            int r3 = r4.b
            int r0 = r3 + 1
            r4.b = r0
            r2[r3] = r1
            return
    }

    @Override // defpackage.m0
    public final java.lang.Object l(java.lang.Object r1) {
            r0 = this;
            af7 r1 = (defpackage.af7) r1
            byte[] r0 = r1.A
            bf7 r1 = new bf7
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
            byte[] r1 = new byte[r1]
            af7 r0 = new af7
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.u25
    public final void p(defpackage.vx0 r4, java.lang.Object r5, int r6) {
            r3 = this;
            af7 r5 = (defpackage.af7) r5
            byte[] r5 = r5.A
            r4.getClass()
            r0 = 0
        L8:
            if (r0 >= r6) goto L18
            t25 r1 = r3.b
            x32 r1 = r4.a0(r1, r0)
            r2 = r5[r0]
            r1.o(r2)
            int r0 = r0 + 1
            goto L8
        L18:
            return
    }
}
