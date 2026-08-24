package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dd3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dd3 extends defpackage.po2 implements defpackage.fo2 {
    public static final defpackage.dd3 d0 = null;

    static {
            dd3 r0 = new dd3
            java.lang.String r4 = "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"
            r5 = 0
            r1 = 3
            java.lang.Class<ed3> r2 = defpackage.ed3.class
            java.lang.String r3 = "registerSelectForOnJoin"
            r0.<init>(r1, r2, r3, r4, r5)
            defpackage.dd3.d0 = r0
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            ed3 r2 = (defpackage.ed3) r2
            v96 r3 = (defpackage.v96) r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.ed3.A
        L6:
            java.lang.Object r1 = r2.Q()
            boolean r4 = r1 instanceof defpackage.e43
            jg7 r0 = defpackage.jg7.a
            if (r4 != 0) goto L13
            r3.X = r0
            return r0
        L13:
            int r1 = r2.o0(r1)
            if (r1 < 0) goto L6
            ad3 r1 = new ad3
            r1.<init>(r2, r3)
            r4 = 1
            il1 r1 = defpackage.yh2.y(r2, r4, r1)
            r3.L = r1
            return r0
    }
}
