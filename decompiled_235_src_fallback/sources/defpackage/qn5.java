package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qn5  reason: default package */
/* loaded from: classes.dex */
public final class qn5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.sn5 Z;

    public /* synthetic */ qn5(defpackage.sn5 r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
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
                case 0: goto L21;
                case 1: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            qn5 r2 = (defpackage.qn5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            qn5 r2 = (defpackage.qn5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            qn5 r2 = (defpackage.qn5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            sn5 r1 = r1.Z
            switch(r3) {
                case 0: goto L15;
                case 1: goto Le;
                default: goto L7;
            }
        L7:
            qn5 r3 = new qn5
            r0 = 2
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            qn5 r3 = new qn5
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        L15:
            qn5 r3 = new qn5
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            jg7 r1 = defpackage.jg7.a
            sn5 r2 = r8.Z
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L74;
                case 1: goto L2f;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r8.Y
            if (r6 == 0) goto L1e
            if (r6 != r4) goto L19
            defpackage.oi2.Y(r9)
            goto L2e
        L19:
            defpackage.i.m(r3)
            r1 = r5
            goto L2e
        L1e:
            defpackage.oi2.Y(r9)
            pn5 r9 = r2.b
            r8.Y = r4
            pl r9 = (defpackage.pl) r9
            java.lang.Object r8 = r9.y(r8)
            if (r8 != r0) goto L2e
            r1 = r0
        L2e:
            return r1
        L2f:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r8.Y
            r7 = 2
            if (r6 == 0) goto L47
            if (r6 == r4) goto L43
            if (r6 != r7) goto L3e
            defpackage.oi2.Y(r9)
            goto L73
        L3e:
            defpackage.i.m(r3)
            r1 = r5
            goto L73
        L43:
            defpackage.oi2.Y(r9)
            goto L57
        L47:
            defpackage.oi2.Y(r9)
            pn5 r9 = r2.b
            r8.Y = r4
            pl r9 = (defpackage.pl) r9
            java.lang.Object r9 = r9.w(r8)
            if (r9 != r0) goto L57
            goto L72
        L57:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L6a
            tp6 r8 = r2.c
            om5 r9 = defpackage.om5.a
            r8.getClass()
            r8.m(r5, r9)
            goto L73
        L6a:
            r8.Y = r7
            java.lang.Object r8 = defpackage.sn5.e(r2, r8)
            if (r8 != r0) goto L73
        L72:
            r1 = r0
        L73:
            return r1
        L74:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r8.Y
            if (r6 == 0) goto L85
            if (r6 != r4) goto L80
            defpackage.oi2.Y(r9)
            goto L91
        L80:
            defpackage.i.m(r3)
            r1 = r5
            goto L91
        L85:
            defpackage.oi2.Y(r9)
            r8.Y = r4
            java.lang.Object r8 = defpackage.sn5.e(r2, r8)
            if (r8 != r0) goto L91
            r1 = r0
        L91:
            return r1
    }
}
