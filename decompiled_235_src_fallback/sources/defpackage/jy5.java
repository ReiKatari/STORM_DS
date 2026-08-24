package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jy5  reason: default package */
/* loaded from: classes.dex */
public final class jy5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ me.magnum.melonds.ui.romlist.RomListActivity Y;

    public /* synthetic */ jy5(me.magnum.melonds.ui.romlist.RomListActivity r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Y = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L23;
                case 1: goto L15;
                default: goto L7;
            }
        L7:
            n06 r3 = (defpackage.n06) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            jy5 r2 = (defpackage.jy5) r2
            r2.s(r1)
            return r1
        L15:
            jg7 r3 = (defpackage.jg7) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            jy5 r2 = (defpackage.jy5) r2
            r2.s(r1)
            return r1
        L23:
            jg7 r3 = (defpackage.jg7) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            jy5 r2 = (defpackage.jy5) r2
            r2.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            me.magnum.melonds.ui.romlist.RomListActivity r1 = r1.Y
            switch(r3) {
                case 0: goto L15;
                case 1: goto Le;
                default: goto L7;
            }
        L7:
            jy5 r3 = new jy5
            r0 = 2
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            jy5 r3 = new jy5
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        L15:
            jy5 r3 = new jy5
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.X
            r1 = 1
            r2 = 0
            r3 = 2131952357(0x7f1302e5, float:1.9541154E38)
            jg7 r4 = defpackage.jg7.a
            me.magnum.melonds.ui.romlist.RomListActivity r6 = r6.Y
            switch(r0) {
                case 0: goto L48;
                case 1: goto L17;
                default: goto Le;
            }
        Le:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r7)
            r6.invalidateOptionsMenu()
            return r4
        L17:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r7)
            int r7 = me.magnum.melonds.ui.romlist.RomListActivity.K0
            zb r7 = new zb
            r7.<init>(r6)
            r0 = 2131952534(0x7f130396, float:1.9541513E38)
            r7.z(r0)
            r0 = 2131952533(0x7f130395, float:1.9541511E38)
            r7.w(r0)
            ey5 r0 = new ey5
            r5 = 0
            r0.<init>(r6, r5)
            r6 = 2131952616(0x7f1303e8, float:1.954168E38)
            r7.y(r6, r0)
            r7.x(r3, r2)
            java.lang.Object r6 = r7.L
            wb r6 = (defpackage.wb) r6
            r6.m = r1
            r7.B()
            return r4
        L48:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r7)
            int r7 = me.magnum.melonds.ui.romlist.RomListActivity.K0
            zb r7 = new zb
            r7.<init>(r6)
            r6 = 2131951947(0x7f13014b, float:1.9540323E38)
            r7.z(r6)
            r6 = 2131951948(0x7f13014c, float:1.9540325E38)
            r7.w(r6)
            r7.y(r3, r2)
            java.lang.Object r6 = r7.L
            wb r6 = (defpackage.wb) r6
            r6.m = r1
            r7.B()
            return r4
    }
}
