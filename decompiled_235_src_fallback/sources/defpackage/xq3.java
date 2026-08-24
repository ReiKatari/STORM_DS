package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xq3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xq3 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.zq3 B;

    public /* synthetic */ xq3(defpackage.zq3 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.A
            zq3 r4 = r4.B
            switch(r0) {
                case 0: goto L4b;
                default: goto L7;
            }
        L7:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            on2 r0 = r4.k0
            java.lang.Object r0 = r0.c()
            cq3 r0 = (defpackage.cq3) r0
            if (r5 < 0) goto L1e
            int r1 = r0.a()
            if (r5 >= r1) goto L1e
            goto L39
        L1e:
            java.lang.String r1 = "Can't scroll to index "
            java.lang.String r2 = ", it is out of bounds [0, "
            java.lang.StringBuilder r1 = defpackage.xg6.t(r1, r5, r2)
            int r0 = r0.a()
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.s53.a(r0)
        L39:
            w61 r0 = r4.F0()
            l7 r1 = new l7
            r2 = 2
            r3 = 0
            r1.<init>(r4, r5, r3, r2)
            r4 = 3
            defpackage.hv.L(r0, r3, r3, r1, r4)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L4b:
            on2 r4 = r4.k0
            java.lang.Object r4 = r4.c()
            cq3 r4 = (defpackage.cq3) r4
            int r0 = r4.a()
            r1 = 0
        L58:
            if (r1 >= r0) goto L68
            java.lang.Object r2 = r4.c(r1)
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L65
            goto L69
        L65:
            int r1 = r1 + 1
            goto L58
        L68:
            r1 = -1
        L69:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            return r4
    }
}
