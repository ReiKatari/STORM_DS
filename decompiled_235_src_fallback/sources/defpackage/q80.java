package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q80  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class q80 extends defpackage.po2 implements defpackage.fo2 {
    public static final defpackage.q80 d0 = null;

    static {
            q80 r0 = new q80
            java.lang.String r4 = "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
            r5 = 0
            r1 = 3
            java.lang.Class<v80> r2 = defpackage.v80.class
            java.lang.String r3 = "processResultSelectReceive"
            r0.<init>(r1, r2, r3, r4, r5)
            defpackage.q80.d0 = r0
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            v80 r1 = (defpackage.v80) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v80.R
            r1.getClass()
            gr1 r0 = defpackage.x80.l
            if (r3 == r0) goto Lc
            return r3
        Lc:
            java.lang.Throwable r0 = r1.x()
            throw r0
    }
}
