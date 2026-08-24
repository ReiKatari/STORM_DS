package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t50  reason: default package */
/* loaded from: classes.dex */
public final class t50 extends defpackage.u25 {
    public static final defpackage.t50 c = null;

    static {
            t50 r0 = new t50
            u50 r1 = defpackage.u50.a
            r0.<init>(r1)
            defpackage.t50.c = r0
            return
    }

    @Override // defpackage.m0
    public final int i(java.lang.Object r1) {
            r0 = this;
            boolean[] r1 = (boolean[]) r1
            r1.getClass()
            int r0 = r1.length
            return r0
    }

    @Override // defpackage.ct0, defpackage.m0
    public final void k(defpackage.ux0 r2, int r3, java.lang.Object r4) {
            r1 = this;
            r50 r4 = (defpackage.r50) r4
            r4.getClass()
            t25 r1 = r1.b
            boolean r1 = r2.W(r1, r3)
            defpackage.s25.c(r4)
            boolean[] r2 = r4.a
            int r3 = r4.b
            int r0 = r3 + 1
            r4.b = r0
            r2[r3] = r1
            return
    }

    @Override // defpackage.m0
    public final java.lang.Object l(java.lang.Object r1) {
            r0 = this;
            boolean[] r1 = (boolean[]) r1
            r1.getClass()
            r50 r0 = new r50
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
            boolean[] r0 = new boolean[r0]
            return r0
    }

    @Override // defpackage.u25
    public final void p(defpackage.vx0 r4, java.lang.Object r5, int r6) {
            r3 = this;
            boolean[] r5 = (boolean[]) r5
            r4.getClass()
            r5.getClass()
            r0 = 0
        L9:
            if (r0 >= r6) goto L15
            t25 r1 = r3.b
            boolean r2 = r5[r0]
            r4.u(r1, r0, r2)
            int r0 = r0 + 1
            goto L9
        L15:
            return
    }
}
