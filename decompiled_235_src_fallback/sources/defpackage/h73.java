package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h73  reason: default package */
/* loaded from: classes.dex */
public final class h73 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ me.magnum.melonds.ui.inputsetup.InputSetupActivity Z;

    public /* synthetic */ h73(me.magnum.melonds.ui.inputsetup.InputSetupActivity r1, defpackage.r41 r2, int r3) {
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
            h73 r2 = (defpackage.h73) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            h73 r2 = (defpackage.h73) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            me.magnum.melonds.ui.inputsetup.InputSetupActivity r1 = r1.Z
            switch(r3) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            h73 r3 = new h73
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            h73 r3 = new h73
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.X
            jg7 r1 = defpackage.jg7.a
            r2 = 0
            me.magnum.melonds.ui.inputsetup.InputSetupActivity r3 = r10.Z
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L35;
                default: goto Le;
            }
        Le:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r10.Y
            if (r7 == 0) goto L1f
            if (r7 != r5) goto L1a
            defpackage.oi2.Y(r11)
            goto L34
        L1a:
            defpackage.i.m(r4)
            r1 = r6
            goto L34
        L1f:
            defpackage.oi2.Y(r11)
            ku3 r11 = r3.A
            tt3 r4 = defpackage.tt3.STARTED
            h73 r7 = new h73
            r7.<init>(r3, r6, r2)
            r10.Y = r5
            java.lang.Object r10 = defpackage.np2.c0(r11, r4, r7, r10)
            if (r10 != r0) goto L34
            r1 = r0
        L34:
            return r1
        L35:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r10.Y
            if (r7 == 0) goto L46
            if (r7 != r5) goto L41
            defpackage.oi2.Y(r11)
            goto L80
        L41:
            defpackage.i.m(r4)
            r1 = r6
            goto L80
        L46:
            defpackage.oi2.Y(r11)
            int r11 = me.magnum.melonds.ui.inputsetup.InputSetupActivity.D0
            me.magnum.melonds.ui.inputsetup.b r11 = r3.B()
            de5 r11 = r11.j
            me.magnum.melonds.ui.inputsetup.b r4 = r3.B()
            de5 r4 = r4.l
            me.magnum.melonds.ui.inputsetup.a r7 = new me.magnum.melonds.ui.inputsetup.a
            r8 = 3
            r7.<init>(r8, r6)
            y6 r8 = new y6
            r9 = 9
            r8.<init>(r3, r9)
            r10.Y = r5
            r3 = 2
            le2[] r3 = new defpackage.le2[r3]
            r3[r2] = r11
            r3[r5] = r4
            jz r11 = defpackage.jz.R
            o12 r2 = new o12
            r4 = 5
            r2.<init>(r7, r6, r4)
            java.lang.Object r10 = defpackage.nb3.o(r10, r8, r11, r2, r3)
            if (r10 != r0) goto L7c
            goto L7d
        L7c:
            r10 = r1
        L7d:
            if (r10 != r0) goto L80
            r1 = r0
        L80:
            return r1
    }
}
