package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vy3  reason: default package */
/* loaded from: classes.dex */
public final class vy3 extends defpackage.u25 {
    public static final defpackage.vy3 c = null;

    static {
            vy3 r0 = new vy3
            fz3 r1 = defpackage.fz3.a
            r0.<init>(r1)
            defpackage.vy3.c = r0
            return
    }

    @Override // defpackage.m0
    public final int i(java.lang.Object r1) {
            r0 = this;
            long[] r1 = (long[]) r1
            r1.getClass()
            int r0 = r1.length
            return r0
    }

    @Override // defpackage.ct0, defpackage.m0
    public final void k(defpackage.ux0 r3, int r4, java.lang.Object r5) {
            r2 = this;
            ty3 r5 = (defpackage.ty3) r5
            r5.getClass()
            t25 r2 = r2.b
            long r2 = r3.c0(r2, r4)
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
            long[] r1 = (long[]) r1
            r1.getClass()
            ty3 r0 = new ty3
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
            long[] r0 = new long[r0]
            return r0
    }

    @Override // defpackage.u25
    public final void p(defpackage.vx0 r5, java.lang.Object r6, int r7) {
            r4 = this;
            long[] r6 = (long[]) r6
            r5.getClass()
            r6.getClass()
            r0 = 0
        L9:
            if (r0 >= r7) goto L15
            t25 r1 = r4.b
            r2 = r6[r0]
            r5.n(r1, r0, r2)
            int r0 = r0 + 1
            goto L9
        L15:
            return
    }
}
