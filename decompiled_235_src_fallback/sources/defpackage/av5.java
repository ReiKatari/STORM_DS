package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: av5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class av5 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.romdetails.RomDetailsActivity B;

    public /* synthetic */ av5(me.magnum.melonds.ui.romdetails.RomDetailsActivity r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r6 = this;
            int r0 = r6.A
            r1 = 3
            r2 = 0
            jg7 r3 = defpackage.jg7.a
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r6 = r6.B
            switch(r0) {
                case 0: goto L4f;
                case 1: goto L3b;
                case 2: goto L19;
                case 3: goto L11;
                default: goto Lb;
            }
        Lb:
            int r0 = me.magnum.melonds.ui.romdetails.RomDetailsActivity.J0
            r6.onNavigateUp()
            return r3
        L11:
            int r0 = me.magnum.melonds.ui.romdetails.RomDetailsActivity.J0
            v82 r0 = new v82
            r0.<init>(r6)
            return r0
        L19:
            int r0 = me.magnum.melonds.ui.romdetails.RomDetailsActivity.J0
            qv5 r6 = r6.A()
            tp6 r0 = r6.o
            java.lang.Object r0 = r0.getValue()
            oi4 r0 = (defpackage.oi4) r0
            boolean r0 = r0.g
            if (r0 == 0) goto L2c
            goto L3a
        L2c:
            as0 r0 = defpackage.to7.a(r6)
            ns3 r4 = new ns3
            r5 = 8
            r4.<init>(r6, r2, r5)
            defpackage.hv.L(r0, r2, r2, r4, r1)
        L3a:
            return r3
        L3b:
            int r0 = me.magnum.melonds.ui.romdetails.RomDetailsActivity.J0
            qv5 r6 = r6.A()
            tp6 r0 = r6.d
            r0.getClass()
            f06 r1 = defpackage.f06.a
            r0.m(r2, r1)
            r6.m()
            return r3
        L4f:
            int r0 = me.magnum.melonds.ui.romdetails.RomDetailsActivity.J0
            uo7 r6 = r6.C0
            java.lang.Object r6 = r6.getValue()
            hw5 r6 = (defpackage.hw5) r6
            as0 r0 = defpackage.to7.a(r6)
            ns3 r4 = new ns3
            r5 = 9
            r4.<init>(r6, r2, r5)
            defpackage.hv.L(r0, r2, r2, r4, r1)
            return r3
    }
}
