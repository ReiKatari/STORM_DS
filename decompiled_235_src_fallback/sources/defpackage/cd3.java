package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cd3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cd3 extends defpackage.po2 implements defpackage.fo2 {
    public static final defpackage.cd3 d0 = null;

    static {
            cd3 r0 = new cd3
            java.lang.String r4 = "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
            r5 = 0
            r1 = 3
            java.lang.Class<ed3> r2 = defpackage.ed3.class
            java.lang.String r3 = "onAwaitInternalProcessResFunc"
            r0.<init>(r1, r2, r3, r4, r5)
            defpackage.cd3.d0 = r0
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            ed3 r1 = (defpackage.ed3) r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ed3.A
            r1.getClass()
            boolean r0 = r3 instanceof defpackage.av0
            if (r0 != 0) goto Lc
            return r3
        Lc:
            av0 r3 = (defpackage.av0) r3
            java.lang.Throwable r0 = r3.a
            throw r0
    }
}
