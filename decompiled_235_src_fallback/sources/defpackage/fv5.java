package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fv5  reason: default package */
/* loaded from: classes.dex */
public final class fv5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ me.magnum.melonds.ui.romdetails.RomDetailsActivity Z;

    public /* synthetic */ fv5(me.magnum.melonds.ui.romdetails.RomDetailsActivity r1, defpackage.r41 r2, int r3) {
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
            fv5 r2 = (defpackage.fv5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            fv5 r2 = (defpackage.fv5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r1 = r1.Z
            switch(r3) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            fv5 r3 = new fv5
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            fv5 r3 = new fv5
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.X
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = 1
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r3 = r6.Z
            r4 = 0
            switch(r0) {
                case 0: goto L3a;
                default: goto Lb;
            }
        Lb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto L1b
            if (r5 != r2) goto L17
            defpackage.oi2.Y(r7)
            goto L37
        L17:
            defpackage.i.m(r1)
            goto L39
        L1b:
            defpackage.oi2.Y(r7)
            int r7 = me.magnum.melonds.ui.romdetails.RomDetailsActivity.J0
            qv5 r7 = r3.A()
            be5 r7 = r7.r
            m5 r1 = new m5
            r5 = 25
            r1.<init>(r3, r4, r5)
            r6.Y = r2
            java.lang.Object r6 = defpackage.f04.v(r7, r1, r6)
            if (r6 != r0) goto L37
            r4 = r0
            goto L39
        L37:
            jg7 r4 = defpackage.jg7.a
        L39:
            return r4
        L3a:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto L4a
            if (r5 == r2) goto L46
            defpackage.i.m(r1)
            goto L6b
        L46:
            defpackage.oi2.Y(r7)
            goto L68
        L4a:
            defpackage.oi2.Y(r7)
            int r7 = me.magnum.melonds.ui.romdetails.RomDetailsActivity.J0
            qv5 r7 = r3.A()
            be5 r7 = r7.g
            y6 r1 = new y6
            r5 = 13
            r1.<init>(r3, r5)
            r6.Y = r2
            kf6 r7 = r7.A
            java.lang.Object r6 = r7.b(r1, r6)
            if (r6 != r0) goto L68
            r4 = r0
            goto L6b
        L68:
            defpackage.e41.c()
        L6b:
            return r4
    }
}
