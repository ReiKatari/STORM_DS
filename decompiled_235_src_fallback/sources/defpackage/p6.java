package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class p6 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.o3 B;
    public final /* synthetic */ defpackage.n3 L;

    public /* synthetic */ p6(defpackage.o3 r1, defpackage.n3 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.A
            r1 = 0
            r2 = 1
            r3 = 0
            n3 r4 = r5.L
            o3 r5 = r5.B
            v3 r6 = (defpackage.v3) r6
            switch(r0) {
                case 0: goto L2f;
                default: goto Le;
            }
        Le:
            r6.getClass()
            boolean r0 = r6 instanceof defpackage.p3
            if (r0 == 0) goto L18
            p3 r6 = (defpackage.p3) r6
            goto L19
        L18:
            r6 = r3
        L19:
            if (r6 == 0) goto L1d
            ls3 r3 = r6.a
        L1d:
            ls3 r5 = r5.a
            boolean r5 = defpackage.nb3.k(r3, r5)
            if (r5 == 0) goto L2a
            n3 r5 = r6.e
            if (r5 != r4) goto L2a
            r1 = r2
        L2a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L2f:
            r6.getClass()
            boolean r0 = r6 instanceof defpackage.p3
            if (r0 == 0) goto L39
            p3 r6 = (defpackage.p3) r6
            goto L3a
        L39:
            r6 = r3
        L3a:
            if (r6 == 0) goto L3e
            ls3 r3 = r6.a
        L3e:
            ls3 r5 = r5.a
            boolean r5 = defpackage.nb3.k(r3, r5)
            if (r5 == 0) goto L4b
            n3 r5 = r6.e
            if (r5 != r4) goto L4b
            r1 = r2
        L4b:
            if (r1 == 0) goto L52
            bt r5 = r6.f
            r5.E()
        L52:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
    }
}
