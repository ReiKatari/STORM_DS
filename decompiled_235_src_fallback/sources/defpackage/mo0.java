package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mo0  reason: default package */
/* loaded from: classes.dex */
public final class mo0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ me.magnum.melonds.ui.cheats.CheatsActivity Z;

    public /* synthetic */ mo0(me.magnum.melonds.ui.cheats.CheatsActivity r1, defpackage.r41 r2, int r3) {
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
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            mo0 r2 = (defpackage.mo0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            mo0 r2 = (defpackage.mo0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            me.magnum.melonds.ui.cheats.CheatsActivity r1 = r1.Z
            switch(r3) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            mo0 r3 = new mo0
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            mo0 r3 = new mo0
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            jg7 r1 = defpackage.jg7.a
            r2 = 0
            me.magnum.melonds.ui.cheats.CheatsActivity r3 = r8.Z
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L35;
                default: goto Le;
            }
        Le:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L1f
            if (r7 != r5) goto L1a
            defpackage.oi2.Y(r9)
            goto L34
        L1a:
            defpackage.i.m(r4)
            r1 = r6
            goto L34
        L1f:
            defpackage.oi2.Y(r9)
            ku3 r9 = r3.A
            tt3 r4 = defpackage.tt3.STARTED
            mo0 r7 = new mo0
            r7.<init>(r3, r6, r2)
            r8.Y = r5
            java.lang.Object r8 = defpackage.np2.c0(r9, r4, r7, r8)
            if (r8 != r0) goto L34
            r1 = r0
        L34:
            return r1
        L35:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L46
            if (r7 != r5) goto L41
            defpackage.oi2.Y(r9)
            goto L63
        L41:
            defpackage.i.m(r4)
            r1 = r6
            goto L63
        L46:
            defpackage.oi2.Y(r9)
            int r9 = me.magnum.melonds.ui.cheats.CheatsActivity.B0
            uo7 r9 = r3.A0
            java.lang.Object r9 = r9.getValue()
            aq0 r9 = (defpackage.aq0) r9
            vl0 r9 = r9.w
            lo0 r4 = new lo0
            r4.<init>(r3, r6, r2)
            r8.Y = r5
            java.lang.Object r8 = defpackage.f04.v(r9, r4, r8)
            if (r8 != r0) goto L63
            r1 = r0
        L63:
            return r1
    }
}
