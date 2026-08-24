package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qd3  reason: default package */
/* loaded from: classes.dex */
public final class qd3 implements defpackage.gg3 {
    public static final defpackage.qd3 a = null;
    public static final defpackage.pd3 b = null;

    static {
            qd3 r0 = new qd3
            r0.<init>()
            defpackage.qd3.a = r0
            pd3 r0 = defpackage.pd3.b
            defpackage.qd3.b = r0
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r4) {
            r3 = this;
            defpackage.gi2.l(r4)
            nd3 r3 = new nd3
            he3 r0 = defpackage.he3.a
            ru r1 = new ru
            r2 = 0
            r1.<init>(r0, r2)
            r0 = 0
            java.lang.Object r4 = r1.j(r4, r0)
            java.util.List r4 = (java.util.List) r4
            r3.<init>(r4)
            return r3
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r5, java.lang.Object r6) {
            r4 = this;
            nd3 r6 = (defpackage.nd3) r6
            r6.getClass()
            defpackage.gi2.j(r5)
            he3 r4 = defpackage.he3.a
            nu r0 = new nu
            wb6 r1 = r4.e()
            r1.getClass()
            r2 = 1
            r0.<init>(r1, r2)
            int r1 = r6.size()
            vx0 r5 = r5.g0(r0, r1)
            java.util.Iterator r6 = r6.iterator()
            r2 = 0
        L24:
            if (r2 >= r1) goto L30
            java.lang.Object r3 = r6.next()
            r5.w(r0, r2, r4, r3)
            int r2 = r2 + 1
            goto L24
        L30:
            r5.a(r0)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            pd3 r0 = defpackage.qd3.b
            return r0
    }
}
