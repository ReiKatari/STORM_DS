package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: st5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class st5 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.String B;
    public final /* synthetic */ java.lang.String[] L;
    public final /* synthetic */ android.content.Context R;

    public /* synthetic */ st5(java.lang.String r1, java.lang.String[] r2, android.content.Context r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.A
            android.content.Context r1 = r3.R
            java.lang.String[] r2 = r3.L
            java.lang.String r3 = r3.B
            switch(r0) {
                case 0: goto L7c;
                case 1: goto L67;
                case 2: goto L4c;
                case 3: goto L31;
                case 4: goto L1c;
                default: goto Lb;
            }
        Lb:
            me.magnum.melonds.domain.model.VideoRenderer r4 = (me.magnum.melonds.domain.model.VideoRenderer) r4
            if (r4 == 0) goto L17
            int r4 = r4.ordinal()
            r4 = r2[r4]
            if (r4 != 0) goto L1b
        L17:
            java.lang.String r4 = defpackage.qo2.c(r1, r3)
        L1b:
            return r4
        L1c:
            a36 r4 = (defpackage.a36) r4
            r4.getClass()
            a36 r0 = defpackage.a36.DEFAULT
            if (r4 != r0) goto L2a
            java.lang.String r3 = defpackage.qo2.c(r1, r3)
            goto L30
        L2a:
            int r3 = r4.ordinal()
            r3 = r2[r3]
        L30:
            return r3
        L31:
            me.magnum.melonds.domain.model.VideoFiltering r4 = (me.magnum.melonds.domain.model.VideoFiltering) r4
            if (r4 == 0) goto L47
            int r0 = r4.ordinal()
            java.lang.Object r0 = defpackage.fv.J0(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L45
            java.lang.String r0 = r4.name()
        L45:
            if (r0 != 0) goto L4b
        L47:
            java.lang.String r0 = defpackage.qo2.c(r1, r3)
        L4b:
            return r0
        L4c:
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L62
            int r4 = r4.intValue()
            int r4 = r4 + (-1)
            l93 r0 = defpackage.fv.G0(r2)
            int r4 = defpackage.gi2.r(r4, r0)
            r4 = r2[r4]
            if (r4 != 0) goto L66
        L62:
            java.lang.String r4 = defpackage.qo2.c(r1, r3)
        L66:
            return r4
        L67:
            u26 r4 = (defpackage.u26) r4
            r4.getClass()
            u26 r0 = defpackage.u26.DEFAULT
            if (r4 != r0) goto L75
            java.lang.String r3 = defpackage.qo2.c(r1, r3)
            goto L7b
        L75:
            int r3 = r4.ordinal()
            r3 = r2[r3]
        L7b:
            return r3
        L7c:
            nx5 r4 = (defpackage.nx5) r4
            r4.getClass()
            nx5 r0 = defpackage.nx5.GLOBAL
            if (r4 != r0) goto L8a
            java.lang.String r3 = defpackage.qo2.c(r1, r3)
            goto L90
        L8a:
            int r3 = r4.ordinal()
            r3 = r2[r3]
        L90:
            return r3
    }
}
