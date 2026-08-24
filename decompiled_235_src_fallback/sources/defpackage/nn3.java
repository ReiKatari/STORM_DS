package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nn3  reason: default package */
/* loaded from: classes.dex */
public final class nn3 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ me.magnum.melonds.ui.layouts.LayoutSelectorActivity Z;

    public /* synthetic */ nn3(me.magnum.melonds.ui.layouts.LayoutSelectorActivity r1, defpackage.r41 r2, int r3) {
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
            nn3 r2 = (defpackage.nn3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            nn3 r2 = (defpackage.nn3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            me.magnum.melonds.ui.layouts.LayoutSelectorActivity r1 = r1.Z
            switch(r3) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            nn3 r3 = new nn3
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            nn3 r3 = new nn3
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.X
            me.magnum.melonds.ui.layouts.LayoutSelectorActivity r1 = r7.Z
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L35;
                default: goto Lb;
            }
        Lb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r7.Y
            if (r5 == 0) goto L1b
            if (r5 != r3) goto L17
            defpackage.oi2.Y(r8)
            goto L32
        L17:
            defpackage.i.m(r2)
            goto L34
        L1b:
            defpackage.oi2.Y(r8)
            ku3 r8 = r1.A
            tt3 r2 = defpackage.tt3.STARTED
            nn3 r5 = new nn3
            r6 = 0
            r5.<init>(r1, r4, r6)
            r7.Y = r3
            java.lang.Object r7 = defpackage.np2.c0(r8, r2, r5, r7)
            if (r7 != r0) goto L32
            r4 = r0
            goto L34
        L32:
            jg7 r4 = defpackage.jg7.a
        L34:
            return r4
        L35:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r7.Y
            if (r5 == 0) goto L45
            if (r5 == r3) goto L41
            defpackage.i.m(r2)
            goto L6a
        L41:
            defpackage.oi2.Y(r8)
            goto L67
        L45:
            defpackage.oi2.Y(r8)
            int r8 = me.magnum.melonds.ui.layouts.LayoutSelectorActivity.B0
            uo7 r8 = r1.A0
            java.lang.Object r8 = r8.getValue()
            qn3 r8 = (defpackage.qn3) r8
            de5 r8 = r8.f
            y6 r2 = new y6
            r5 = 11
            r2.<init>(r1, r5)
            r7.Y = r3
            rp6 r8 = r8.A
            java.lang.Object r7 = r8.b(r2, r7)
            if (r7 != r0) goto L67
            r4 = r0
            goto L6a
        L67:
            defpackage.e41.c()
        L6a:
            return r4
    }
}
