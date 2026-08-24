package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r6 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.u95 B;

    public /* synthetic */ r6(defpackage.u95 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.A
            r1 = 0
            u95 r5 = r5.B
            v3 r6 = (defpackage.v3) r6
            switch(r0) {
                case 0: goto L34;
                default: goto La;
            }
        La:
            r6.getClass()
            boolean r0 = r6 instanceof defpackage.o3
            if (r0 == 0) goto L14
            r1 = r6
            o3 r1 = (defpackage.o3) r1
        L14:
            r0 = 0
            if (r1 == 0) goto L26
            ta5 r1 = r1.b
            if (r1 == 0) goto L26
            long r1 = r1.a
            ta5 r5 = r5.b
            long r3 = r5.a
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L26
            r0 = 1
        L26:
            if (r0 == 0) goto L2f
            o3 r6 = (defpackage.o3) r6
            bt r5 = r6.e
            r5.E()
        L2f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L34:
            r6.getClass()
            boolean r0 = r6 instanceof defpackage.o3
            if (r0 == 0) goto L3e
            o3 r6 = (defpackage.o3) r6
            goto L3f
        L3e:
            r6 = r1
        L3f:
            if (r6 == 0) goto L43
            ls3 r1 = r6.a
        L43:
            ls3 r5 = r5.a
            boolean r5 = defpackage.nb3.k(r1, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
    }
}
