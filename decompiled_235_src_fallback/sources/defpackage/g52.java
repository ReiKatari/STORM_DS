package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g52  reason: default package */
/* loaded from: classes.dex */
public final class g52 extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ boolean B;
    public final /* synthetic */ defpackage.on2 L;

    public g52(defpackage.on2 r1, boolean r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r2) {
            r1 = this;
            op5 r2 = (defpackage.op5) r2
            boolean r0 = r1.B
            if (r0 != 0) goto L16
            on2 r1 = r1.L
            java.lang.Object r1 = r1.c()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            r2.f(r1)
            jg7 r1 = defpackage.jg7.a
            return r1
    }
}
