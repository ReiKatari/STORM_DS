package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kb4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kb4 extends defpackage.po2 implements defpackage.eo2 {
    public static final defpackage.kb4 d0 = null;

    static {
            kb4 r0 = new kb4
            java.lang.String r4 = "lockWithoutOwner(Lkotlinx/coroutines/sync/Mutex;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r5 = 1
            r1 = 2
            java.lang.Class<lb4> r2 = defpackage.lb4.class
            java.lang.String r3 = "lockWithoutOwner"
            r0.<init>(r1, r2, r3, r4, r5)
            defpackage.kb4.d0 = r0
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            fb4 r1 = (defpackage.fb4) r1
            r41 r2 = (defpackage.r41) r2
            java.lang.Object r0 = r1.e(r2)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto Ld
            return r0
        Ld:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
