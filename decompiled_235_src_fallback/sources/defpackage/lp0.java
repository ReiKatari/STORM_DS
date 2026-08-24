package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lp0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lp0 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.String B;
    public final /* synthetic */ defpackage.qa4 L;

    public /* synthetic */ lp0(java.lang.String r1, defpackage.qa4 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r4 = this;
            int r0 = r4.A
            jg7 r1 = defpackage.jg7.a
            qa4 r2 = r4.L
            java.lang.String r4 = r4.B
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lf;
                default: goto Lb;
            }
        Lb:
            r2.setValue(r4)
            return r1
        Lf:
            r2.setValue(r4)
            return r1
        L13:
            java.lang.Object r0 = r2.getValue()
            sb4 r0 = (defpackage.sb4) r0
            r1 = 0
            if (r0 == 0) goto L2f
            ic4 r0 = r0.B
            if (r0 == 0) goto L2f
            z9 r0 = r0.B
            java.lang.Object r0 = r0.e
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L2f
            java.lang.String r3 = "/"
            java.lang.String r0 = defpackage.qs6.Q0(r0, r3)
            goto L30
        L2f:
            r0 = r1
        L30:
            bp0 r3 = defpackage.cp0.Companion
            gg3 r3 = r3.serializer()
            wb6 r3 = r3.e()
            java.lang.String r3 = r3.a()
            boolean r3 = defpackage.nb3.k(r0, r3)
            if (r3 == 0) goto L5d
            java.lang.Object r4 = r2.getValue()
            sb4 r4 = (defpackage.sb4) r4
            if (r4 == 0) goto L9f
            java.lang.Class<cp0> r0 = defpackage.cp0.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.Object r4 = defpackage.bl2.W(r4, r0)
            cp0 r4 = (defpackage.cp0) r4
            if (r4 == 0) goto L9f
            java.lang.String r4 = r4.h0
            goto La0
        L5d:
            yo0 r3 = defpackage.zo0.Companion
            gg3 r3 = r3.serializer()
            wb6 r3 = r3.e()
            java.lang.String r3 = r3.a()
            boolean r3 = defpackage.nb3.k(r0, r3)
            if (r3 == 0) goto L8a
            java.lang.Object r4 = r2.getValue()
            sb4 r4 = (defpackage.sb4) r4
            if (r4 == 0) goto L9f
            java.lang.Class<zo0> r0 = defpackage.zo0.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.Object r4 = defpackage.bl2.W(r4, r0)
            zo0 r4 = (defpackage.zo0) r4
            if (r4 == 0) goto L9f
            java.lang.String r4 = r4.h0
            goto La0
        L8a:
            wo0 r2 = defpackage.wo0.INSTANCE
            gg3 r2 = r2.serializer()
            wb6 r2 = r2.e()
            java.lang.String r2 = r2.a()
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 == 0) goto L9f
            goto La0
        L9f:
            r4 = r1
        La0:
            return r4
    }
}
