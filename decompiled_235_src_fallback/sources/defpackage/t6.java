package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t6 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.y95 B;

    public /* synthetic */ t6(defpackage.y95 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.A
            r1 = 0
            y95 r2 = r2.B
            v3 r3 = (defpackage.v3) r3
            switch(r0) {
                case 0: goto L2b;
                default: goto La;
            }
        La:
            r3.getClass()
            boolean r0 = r3 instanceof defpackage.r3
            if (r0 == 0) goto L14
            r3 r3 = (defpackage.r3) r3
            goto L15
        L14:
            r3 = r1
        L15:
            if (r3 == 0) goto L19
            ls3 r1 = r3.a
        L19:
            ls3 r2 = r2.a
            boolean r2 = defpackage.nb3.k(r1, r2)
            if (r2 == 0) goto L26
            bt r3 = r3.e
            r3.E()
        L26:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L2b:
            r3.getClass()
            boolean r0 = r3 instanceof defpackage.r3
            if (r0 == 0) goto L35
            r3 r3 = (defpackage.r3) r3
            goto L36
        L35:
            r3 = r1
        L36:
            if (r3 == 0) goto L3a
            ls3 r1 = r3.a
        L3a:
            ls3 r2 = r2.a
            boolean r2 = defpackage.nb3.k(r1, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }
}
