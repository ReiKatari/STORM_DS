package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kp0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kp0 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.aq0 B;

    public /* synthetic */ kp0(defpackage.aq0 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.A
            java.lang.String r1 = "selected_game"
            aq0 r2 = r10.B
            jg7 r3 = defpackage.jg7.a
            switch(r0) {
                case 0: goto Lb5;
                case 1: goto L95;
                case 2: goto L62;
                case 3: goto L57;
                default: goto Lb;
            }
        Lb:
            cp2 r11 = (defpackage.cp2) r11
            r11.getClass()
            r2.getClass()
            v46 r10 = r2.c
            java.lang.Long r5 = r11.a
            java.lang.String r6 = r11.b
            java.lang.String r7 = r11.c
            java.lang.String r8 = r11.d
            java.util.List r0 = r11.e
            java.util.ArrayList r9 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.ht0.v0(r0, r4)
            r9.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r0.next()
            an0 r4 = (defpackage.an0) r4
            dn0 r4 = defpackage.u24.m(r4)
            r9.add(r4)
            goto L2e
        L42:
            pp2 r4 = new pp2
            r4.<init>(r5, r6, r7, r8, r9)
            r10.c(r4, r1)
            v80 r10 = r2.n
            rm4 r0 = new rm4
            java.lang.String r11 = r11.b
            r0.<init>(r11)
            r10.c(r0)
            return r3
        L57:
            co0 r11 = (defpackage.co0) r11
            r11.getClass()
            me.magnum.melonds.domain.model.Cheat r10 = r11.a
            r2.e(r10)
            return r3
        L62:
            r7 = r11
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            aq0 r6 = r10.B
            r6.getClass()
            boolean r10 = defpackage.qs6.v0(r7)
            if (r10 == 0) goto L74
            goto L94
        L74:
            v46 r10 = r6.c
            java.lang.Object r10 = r10.a(r1)
            pp2 r10 = (defpackage.pp2) r10
            r8 = 0
            if (r10 == 0) goto L85
            cp2 r10 = r10.a()
            r5 = r10
            goto L86
        L85:
            r5 = r8
        L86:
            as0 r10 = defpackage.to7.a(r6)
            l5 r4 = new l5
            r9 = 4
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = 3
            defpackage.hv.L(r10, r8, r8, r4, r11)
        L94:
            return r3
        L95:
            an0 r11 = (defpackage.an0) r11
            r11.getClass()
            r2.getClass()
            v46 r10 = r2.c
            java.lang.String r0 = "selected_folder"
            dn0 r1 = defpackage.u24.m(r11)
            r10.c(r1, r0)
            v80 r10 = r2.p
            rm4 r0 = new rm4
            java.lang.String r11 = r11.b
            r0.<init>(r11)
            r10.c(r0)
            return r3
        Lb5:
            me.magnum.melonds.domain.model.Cheat r11 = (me.magnum.melonds.domain.model.Cheat) r11
            r11.getClass()
            r2.e(r11)
            return r3
    }
}
