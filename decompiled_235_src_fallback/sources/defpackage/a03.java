package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a03  reason: default package */
/* loaded from: classes.dex */
public final class a03 extends defpackage.c03 {
    public final /* synthetic */ int d;
    public final defpackage.ib0 e;

    public /* synthetic */ a03(defpackage.vk5 r1, defpackage.xk4 r2, defpackage.b51 r3, defpackage.ib0 r4, int r5) {
            r0 = this;
            r0.d = r5
            r0.<init>(r1, r2, r3)
            r0.e = r4
            return
    }

    @Override // defpackage.c03
    public final java.lang.Object a(defpackage.vk4 r3, java.lang.Object[] r4) {
            r2 = this;
            int r0 = r2.d
            ib0 r2 = r2.e
            switch(r0) {
                case 0: goto L3f;
                default: goto L7;
            }
        L7:
            java.lang.Object r2 = r2.b(r3)
            gb0 r2 = (defpackage.gb0) r2
            int r3 = r4.length
            r0 = 1
            int r3 = r3 - r0
            r3 = r4[r3]
            r41 r3 = (defpackage.r41) r3
            rj0 r4 = new rj0     // Catch: java.lang.Exception -> L39
            r41 r1 = defpackage.np2.V(r3)     // Catch: java.lang.Exception -> L39
            r4.<init>(r0, r1)     // Catch: java.lang.Exception -> L39
            r4.v()     // Catch: java.lang.Exception -> L39
            ri3 r0 = new ri3     // Catch: java.lang.Exception -> L39
            r1 = 2
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> L39
            r4.z(r0)     // Catch: java.lang.Exception -> L39
            sp2 r0 = new sp2     // Catch: java.lang.Exception -> L39
            r1 = 3
            r0.<init>(r4, r1)     // Catch: java.lang.Exception -> L39
            r2.h(r0)     // Catch: java.lang.Exception -> L39
            java.lang.Object r2 = r4.s()     // Catch: java.lang.Exception -> L39
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED     // Catch: java.lang.Exception -> L39
            goto L3e
        L39:
            r2 = move-exception
            x61 r2 = defpackage.np2.h0(r2, r3)
        L3e:
            return r2
        L3f:
            java.lang.Object r2 = r2.b(r3)
            return r2
    }
}
