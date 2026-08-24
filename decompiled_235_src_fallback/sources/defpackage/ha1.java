package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ha1  reason: default package */
/* loaded from: classes.dex */
public final class ha1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.la1 Z;
    public final /* synthetic */ me.magnum.melonds.domain.model.DSiWareTitle d0;
    public final /* synthetic */ defpackage.bb1 e0;
    public final /* synthetic */ android.net.Uri f0;

    public /* synthetic */ ha1(defpackage.la1 r1, me.magnum.melonds.domain.model.DSiWareTitle r2, defpackage.bb1 r3, android.net.Uri r4, defpackage.r41 r5, int r6) {
            r0 = this;
            r0.X = r6
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r0.f0 = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L2c;
                case 1: goto L21;
                case 2: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            ha1 r2 = (defpackage.ha1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            ha1 r2 = (defpackage.ha1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            ha1 r2 = (defpackage.ha1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            ha1 r2 = (defpackage.ha1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r9, java.lang.Object r10) {
            r8 = this;
            int r10 = r8.X
            switch(r10) {
                case 0: goto L35;
                case 1: goto L25;
                case 2: goto L15;
                default: goto L5;
            }
        L5:
            ha1 r0 = new ha1
            android.net.Uri r4 = r8.f0
            r6 = 3
            la1 r1 = r8.Z
            me.magnum.melonds.domain.model.DSiWareTitle r2 = r8.d0
            bb1 r3 = r8.e0
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L15:
            r6 = r9
            ha1 r1 = new ha1
            android.net.Uri r5 = r8.f0
            r7 = 2
            la1 r2 = r8.Z
            me.magnum.melonds.domain.model.DSiWareTitle r3 = r8.d0
            bb1 r4 = r8.e0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L25:
            r6 = r9
            ha1 r1 = new ha1
            android.net.Uri r5 = r8.f0
            r7 = 1
            la1 r2 = r8.Z
            me.magnum.melonds.domain.model.DSiWareTitle r3 = r8.d0
            bb1 r4 = r8.e0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L35:
            r6 = r9
            ha1 r1 = new ha1
            android.net.Uri r5 = r8.f0
            r7 = 0
            la1 r2 = r8.Z
            me.magnum.melonds.domain.model.DSiWareTitle r3 = r8.d0
            bb1 r4 = r8.e0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r17) {
            r16 = this;
            r0 = r16
            int r1 = r0.X
            android.net.Uri r2 = r0.f0
            me.magnum.melonds.domain.model.DSiWareTitle r3 = r0.d0
            la1 r4 = r0.Z
            bb1 r5 = r0.e0
            jg7 r6 = defpackage.jg7.a
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r8 = 1
            r9 = 0
            switch(r1) {
                case 0: goto Lbe;
                case 1: goto L8f;
                case 2: goto L44;
                default: goto L15;
            }
        L15:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L26
            if (r2 != r8) goto L21
            defpackage.oi2.Y(r17)
            goto L43
        L21:
            defpackage.i.m(r7)
            r6 = r9
            goto L43
        L26:
            defpackage.oi2.Y(r17)
            xe1 r2 = defpackage.xk1.a
            ha1 r9 = new ha1
            r14 = 0
            r15 = 2
            la1 r10 = r0.Z
            me.magnum.melonds.domain.model.DSiWareTitle r11 = r0.d0
            bb1 r12 = r0.e0
            android.net.Uri r13 = r0.f0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.Y = r8
            java.lang.Object r0 = defpackage.hv.d0(r2, r9, r0)
            if (r0 != r1) goto L43
            r6 = r1
        L43:
            return r6
        L44:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r10 = r0.Y
            if (r10 == 0) goto L57
            if (r10 != r8) goto L52
            defpackage.oi2.Y(r17)
            r0 = r17
            goto L66
        L52:
            defpackage.i.m(r7)
            r6 = r9
            goto L8e
        L57:
            defpackage.oi2.Y(r17)
            fg r7 = r4.b
            r0.Y = r8
            java.lang.Object r0 = r7.g(r3, r5, r2, r0)
            if (r0 != r1) goto L66
            r6 = r1
            goto L8e
        L66:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7d
            of6 r0 = r4.m
            x33 r1 = new x33
            java.lang.String r2 = r5.getFileName()
            r1.<init>(r2)
            r0.k(r1)
            goto L84
        L7d:
            of6 r0 = r4.m
            w33 r1 = defpackage.w33.a
            r0.k(r1)
        L84:
            tp6 r0 = r4.i
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.getClass()
            r0.m(r9, r1)
        L8e:
            return r6
        L8f:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto La0
            if (r2 != r8) goto L9b
            defpackage.oi2.Y(r17)
            goto Lbd
        L9b:
            defpackage.i.m(r7)
            r6 = r9
            goto Lbd
        La0:
            defpackage.oi2.Y(r17)
            xe1 r2 = defpackage.xk1.a
            ha1 r9 = new ha1
            r14 = 0
            r15 = 0
            la1 r10 = r0.Z
            me.magnum.melonds.domain.model.DSiWareTitle r11 = r0.d0
            bb1 r12 = r0.e0
            android.net.Uri r13 = r0.f0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.Y = r8
            java.lang.Object r0 = defpackage.hv.d0(r2, r9, r0)
            if (r0 != r1) goto Lbd
            r6 = r1
        Lbd:
            return r6
        Lbe:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r10 = r0.Y
            if (r10 == 0) goto Ld1
            if (r10 != r8) goto Lcc
            defpackage.oi2.Y(r17)
            r0 = r17
            goto Le0
        Lcc:
            defpackage.i.m(r7)
            r6 = r9
            goto L108
        Ld1:
            defpackage.oi2.Y(r17)
            fg r7 = r4.b
            r0.Y = r8
            java.lang.Object r0 = r7.e(r3, r5, r2, r0)
            if (r0 != r1) goto Le0
            r6 = r1
            goto L108
        Le0:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lf7
            of6 r0 = r4.m
            v33 r1 = new v33
            java.lang.String r2 = r5.getFileName()
            r1.<init>(r2)
            r0.k(r1)
            goto Lfe
        Lf7:
            of6 r0 = r4.m
            u33 r1 = defpackage.u33.a
            r0.k(r1)
        Lfe:
            tp6 r0 = r4.i
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.getClass()
            r0.m(r9, r1)
        L108:
            return r6
    }
}
