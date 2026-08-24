package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bd3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bd3 extends defpackage.po2 implements defpackage.fo2 {
    public static final defpackage.bd3 d0 = null;

    static {
            bd3 r0 = new bd3
            java.lang.String r4 = "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"
            r5 = 0
            r1 = 3
            java.lang.Class<ed3> r2 = defpackage.ed3.class
            java.lang.String r3 = "onAwaitInternalRegFunc"
            r0.<init>(r1, r2, r3, r4, r5)
            defpackage.bd3.d0 = r0
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            ed3 r1 = (defpackage.ed3) r1
            v96 r2 = (defpackage.v96) r2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ed3.A
        L6:
            java.lang.Object r0 = r1.Q()
            boolean r3 = r0 instanceof defpackage.e43
            if (r3 != 0) goto L1a
            boolean r1 = r0 instanceof defpackage.av0
            if (r1 == 0) goto L13
            goto L17
        L13:
            java.lang.Object r0 = defpackage.fd3.a(r0)
        L17:
            r2.X = r0
            goto L2c
        L1a:
            int r0 = r1.o0(r0)
            if (r0 < 0) goto L6
            zc3 r0 = new zc3
            r0.<init>(r1, r2)
            r3 = 1
            il1 r0 = defpackage.yh2.y(r1, r3, r0)
            r2.L = r0
        L2c:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
