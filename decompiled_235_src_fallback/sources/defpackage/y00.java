package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y00  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class y00 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.qn2 B;

    public /* synthetic */ y00(int r1, defpackage.qn2 r2) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.A
            r1 = 0
            qn2 r3 = r3.B
            switch(r0) {
                case 0: goto L1bb;
                case 1: goto L1b3;
                case 2: goto L1a8;
                case 3: goto L18d;
                case 4: goto L177;
                case 5: goto L16c;
                case 6: goto L161;
                case 7: goto L151;
                case 8: goto L144;
                case 9: goto L134;
                case 10: goto L124;
                case 11: goto L117;
                case 12: goto Lff;
                case 13: goto Lf2;
                case 14: goto Lda;
                case 15: goto Lb5;
                case 16: goto La8;
                case 17: goto L99;
                case 18: goto L8a;
                case 19: goto L72;
                case 20: goto L61;
                case 21: goto L51;
                case 22: goto L44;
                case 23: goto L39;
                case 24: goto L2e;
                case 25: goto L12;
                default: goto L8;
            }
        L8:
            java.lang.Long r4 = (java.lang.Long) r4
            r4.getClass()
            java.lang.Object r3 = r3.g(r4)
            return r3
        L12:
            zl6 r4 = (defpackage.zl6) r4
            java.lang.Object r3 = r3.g(r4)
            vl6 r3 = (defpackage.vl6) r3
            java.lang.Object r4 = defpackage.bm6.c
            monitor-enter(r4)
            zl6 r0 = defpackage.bm6.d     // Catch: java.lang.Throwable -> L2b
            long r1 = r3.g()     // Catch: java.lang.Throwable -> L2b
            zl6 r0 = r0.f(r1)     // Catch: java.lang.Throwable -> L2b
            defpackage.bm6.d = r0     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r4)
            return r3
        L2b:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        L2e:
            pq5 r4 = (defpackage.pq5) r4
            r4.getClass()
            r3.g(r4)
            jg7 r3 = defpackage.jg7.a
            return r3
        L39:
            o6 r4 = (defpackage.o6) r4
            r4.getClass()
            r3.g(r4)
            jg7 r3 = defpackage.jg7.a
            return r3
        L44:
            me.magnum.melonds.domain.model.VideoRenderer r4 = (me.magnum.melonds.domain.model.VideoRenderer) r4
            su5 r0 = new su5
            r0.<init>(r4)
            r3.g(r0)
            jg7 r3 = defpackage.jg7.a
            return r3
        L51:
            a36 r4 = (defpackage.a36) r4
            r4.getClass()
            ou5 r0 = new ou5
            r0.<init>(r4)
            r3.g(r0)
            jg7 r3 = defpackage.jg7.a
            return r3
        L61:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            qu5 r0 = new qu5
            r0.<init>(r4)
            r3.g(r0)
            jg7 r3 = defpackage.jg7.a
            return r3
        L72:
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            boolean r0 = defpackage.qs6.v0(r4)
            if (r0 == 0) goto L7e
            goto L7f
        L7e:
            r1 = r4
        L7f:
            du5 r4 = new du5
            r4.<init>(r1)
            r3.g(r4)
            jg7 r3 = defpackage.jg7.a
            return r3
        L8a:
            android.net.Uri r4 = (android.net.Uri) r4
            if (r4 == 0) goto L96
            fu5 r0 = new fu5
            r0.<init>(r4)
            r3.g(r0)
        L96:
            jg7 r3 = defpackage.jg7.a
            return r3
        L99:
            android.net.Uri r4 = (android.net.Uri) r4
            if (r4 == 0) goto La5
            eu5 r0 = new eu5
            r0.<init>(r4)
            r3.g(r0)
        La5:
            jg7 r3 = defpackage.jg7.a
            return r3
        La8:
            me.magnum.melonds.domain.model.VideoFiltering r4 = (me.magnum.melonds.domain.model.VideoFiltering) r4
            ru5 r0 = new ru5
            r0.<init>(r4)
            r3.g(r0)
            jg7 r3 = defpackage.jg7.a
            return r3
        Lb5:
            z8 r4 = (defpackage.z8) r4
            r4.getClass()
            int r0 = r4.A
            r2 = -1
            if (r0 != r2) goto Ld7
            android.content.Intent r4 = r4.B
            if (r4 == 0) goto Lcf
            java.lang.String r0 = "selected_layout_id"
            java.lang.String r4 = r4.getStringExtra(r0)
            if (r4 == 0) goto Lcf
            java.util.UUID r1 = java.util.UUID.fromString(r4)
        Lcf:
            ju5 r4 = new ju5
            r4.<init>(r1)
            r3.g(r4)
        Ld7:
            jg7 r3 = defpackage.jg7.a
            return r3
        Lda:
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            boolean r0 = defpackage.qs6.v0(r4)
            if (r0 == 0) goto Le6
            goto Le7
        Le6:
            r1 = r4
        Le7:
            lu5 r4 = new lu5
            r4.<init>(r1)
            r3.g(r4)
            jg7 r3 = defpackage.jg7.a
            return r3
        Lf2:
            java.lang.Integer r4 = (java.lang.Integer) r4
            iu5 r0 = new iu5
            r0.<init>(r4)
            r3.g(r0)
            jg7 r3 = defpackage.jg7.a
            return r3
        Lff:
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            boolean r0 = defpackage.qs6.v0(r4)
            if (r0 == 0) goto L10b
            goto L10c
        L10b:
            r1 = r4
        L10c:
            mu5 r4 = new mu5
            r4.<init>(r1)
            r3.g(r4)
            jg7 r3 = defpackage.jg7.a
            return r3
        L117:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            pu5 r0 = new pu5
            r0.<init>(r4)
            r3.g(r0)
            jg7 r3 = defpackage.jg7.a
            return r3
        L124:
            u26 r4 = (defpackage.u26) r4
            r4.getClass()
            nu5 r0 = new nu5
            r0.<init>(r4)
            r3.g(r0)
            jg7 r3 = defpackage.jg7.a
            return r3
        L134:
            ax5 r4 = (defpackage.ax5) r4
            r4.getClass()
            gu5 r0 = new gu5
            r0.<init>(r4)
            r3.g(r0)
            jg7 r3 = defpackage.jg7.a
            return r3
        L144:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            ku5 r0 = new ku5
            r0.<init>(r4)
            r3.g(r0)
            jg7 r3 = defpackage.jg7.a
            return r3
        L151:
            nx5 r4 = (defpackage.nx5) r4
            r4.getClass()
            hu5 r0 = new hu5
            r0.<init>(r4)
            r3.g(r0)
            jg7 r3 = defpackage.jg7.a
            return r3
        L161:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.booleanValue()
            r3.g(r4)
            jg7 r3 = defpackage.jg7.a
            return r3
        L16c:
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            r3.g(r4)
            jg7 r3 = defpackage.jg7.a
            return r3
        L177:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            t52 r0 = me.magnum.melonds.domain.model.layout.BackgroundMode.getEntries()
            u52 r0 = (defpackage.u52) r0
            java.lang.Object r4 = r0.get(r4)
            r3.g(r4)
            jg7 r3 = defpackage.jg7.a
            return r3
        L18d:
            ub7 r4 = (defpackage.ub7) r4
            boolean r0 = r4 instanceof defpackage.vr2
            if (r0 == 0) goto L1a2
            vr2 r4 = (defpackage.vr2) r4
            ur2 r4 = r4.k0
            java.lang.Object r3 = r3.g(r4)
            r1 = r3
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            goto L1a7
        L1a2:
            java.lang.String r3 = "Node is not a GestureNode instance"
            defpackage.i.m(r3)
        L1a7:
            return r1
        L1a8:
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            r3.g(r4)
            jg7 r3 = defpackage.jg7.a
            return r3
        L1b3:
            fp1 r4 = (defpackage.fp1) r4
            ep1 r0 = new ep1
            r0.<init>(r4, r3)
            return r0
        L1bb:
            n00 r4 = (defpackage.n00) r4
            r4.getClass()
            r3.g(r4)
            jg7 r3 = defpackage.jg7.a
            return r3
    }
}
