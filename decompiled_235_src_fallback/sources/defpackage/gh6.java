package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gh6  reason: default package */
/* loaded from: classes.dex */
public final class gh6 extends defpackage.u25 {
    public static final defpackage.gh6 c = null;

    static {
            gh6 r0 = new gh6
            hh6 r1 = defpackage.hh6.a
            r0.<init>(r1)
            defpackage.gh6.c = r0
            return
    }

    @Override // defpackage.m0
    public final int i(java.lang.Object r1) {
            r0 = this;
            short[] r1 = (short[]) r1
            r1.getClass()
            int r0 = r1.length
            return r0
    }

    @Override // defpackage.ct0, defpackage.m0
    public final void k(defpackage.ux0 r2, int r3, java.lang.Object r4) {
            r1 = this;
            fh6 r4 = (defpackage.fh6) r4
            r4.getClass()
            t25 r1 = r1.b
            short r1 = r2.C(r1, r3)
            defpackage.s25.c(r4)
            short[] r2 = r4.a
            int r3 = r4.b
            int r0 = r3 + 1
            r4.b = r0
            r2[r3] = r1
            return
    }

    @Override // defpackage.m0
    public final java.lang.Object l(java.lang.Object r1) {
            r0 = this;
            short[] r1 = (short[]) r1
            r1.getClass()
            fh6 r0 = new fh6
            r0.<init>()
            r0.a = r1
            int r1 = r1.length
            r0.b = r1
            r1 = 10
            r0.b(r1)
            return r0
    }

    @Override // defpackage.u25
    public final java.lang.Object o() {
            r0 = this;
            r0 = 0
            short[] r0 = new short[r0]
            return r0
    }

    @Override // defpackage.u25
    public final void p(defpackage.vx0 r4, java.lang.Object r5, int r6) {
            r3 = this;
            short[] r5 = (short[]) r5
            r4.getClass()
            r5.getClass()
            r0 = 0
        L9:
            if (r0 >= r6) goto L15
            t25 r1 = r3.b
            short r2 = r5[r0]
            r4.N(r1, r0, r2)
            int r0 = r0 + 1
            goto L9
        L15:
            return
    }
}
