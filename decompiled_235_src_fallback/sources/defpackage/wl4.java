package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wl4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wl4 extends defpackage.po2 implements defpackage.fo2 {
    public static final defpackage.wl4 d0 = null;

    static {
            wl4 r0 = new wl4
            java.lang.String r4 = "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"
            r5 = 0
            r1 = 3
            java.lang.Class<xl4> r2 = defpackage.xl4.class
            java.lang.String r3 = "register"
            r0.<init>(r1, r2, r3, r4, r5)
            defpackage.wl4.d0 = r0
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            xl4 r5 = (defpackage.xl4) r5
            v96 r6 = (defpackage.v96) r6
            long r0 = r5.a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            jg7 r7 = defpackage.jg7.a
            if (r4 > 0) goto L11
            r6.X = r7
            return r7
        L11:
            q64 r4 = new q64
            r2 = 2
            r4.<init>(r2, r6, r5)
            r6.getClass()
            l61 r5 = r6.A
            ug1 r2 = defpackage.q60.D(r5)
            il1 r4 = r2.A(r0, r4, r5)
            r6.L = r4
            return r7
    }
}
