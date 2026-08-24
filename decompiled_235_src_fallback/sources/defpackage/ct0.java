package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ct0  reason: default package */
/* loaded from: classes.dex */
public abstract class ct0 extends defpackage.m0 {
    public final defpackage.gg3 a;

    public ct0(defpackage.gg3 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.gg3
    public void d(defpackage.x32 r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.i(r8)
            wb6 r1 = r6.e()
            vx0 r7 = r7.g0(r1, r0)
            java.util.Iterator r8 = r6.h(r8)
            r2 = 0
        L11:
            if (r2 >= r0) goto L25
            wb6 r3 = r6.e()
            gg3 r4 = r6.a
            gg3 r4 = (defpackage.gg3) r4
            java.lang.Object r5 = r8.next()
            r7.w(r3, r2, r4, r5)
            int r2 = r2 + 1
            goto L11
        L25:
            r7.a(r1)
            return
    }

    @Override // defpackage.m0
    public void k(defpackage.ux0 r4, int r5, java.lang.Object r6) {
            r3 = this;
            wb6 r0 = r3.e()
            gg3 r1 = r3.a
            gg3 r1 = (defpackage.gg3) r1
            r2 = 0
            java.lang.Object r4 = r4.G(r0, r5, r1, r2)
            r3.n(r5, r6, r4)
            return
    }

    public abstract void n(int r1, java.lang.Object r2, java.lang.Object r3);
}
