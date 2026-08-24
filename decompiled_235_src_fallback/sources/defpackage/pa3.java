package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pa3  reason: default package */
/* loaded from: classes.dex */
public final class pa3 implements defpackage.le2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.cf2 B;
    public final /* synthetic */ defpackage.wa3 L;

    public /* synthetic */ pa3(defpackage.cf2 r1, defpackage.wa3 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.le2
    public final java.lang.Object b(defpackage.ne2 r5, defpackage.r41 r6) {
            r4 = this;
            int r0 = r4.A
            jg7 r1 = defpackage.jg7.a
            wa3 r2 = r4.L
            cf2 r4 = r4.B
            switch(r0) {
                case 0: goto L1b;
                default: goto Lb;
            }
        Lb:
            oa3 r0 = new oa3
            r3 = 1
            r0.<init>(r5, r2, r3)
            java.lang.Object r4 = r4.b(r0, r6)
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            if (r4 != r5) goto L1a
            r1 = r4
        L1a:
            return r1
        L1b:
            oa3 r0 = new oa3
            r3 = 0
            r0.<init>(r5, r2, r3)
            java.lang.Object r4 = r4.b(r0, r6)
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            if (r4 != r5) goto L2a
            r1 = r4
        L2a:
            return r1
    }
}
