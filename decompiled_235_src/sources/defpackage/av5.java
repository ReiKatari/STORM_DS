package defpackage;

import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: av5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class av5 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ RomDetailsActivity B;

    public /* synthetic */ av5(RomDetailsActivity romDetailsActivity, int i) {
        this.A = i;
        this.B = romDetailsActivity;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        RomDetailsActivity romDetailsActivity = this.B;
        switch (i) {
            case 0:
                int i2 = RomDetailsActivity.J0;
                hw5 hw5Var = (hw5) romDetailsActivity.C0.getValue();
                hv.L(to7.a(hw5Var), null, null, new ns3(hw5Var, null, 9), 3);
                return jg7Var;
            case 1:
                int i3 = RomDetailsActivity.J0;
                qv5 A = romDetailsActivity.A();
                tp6 tp6Var = A.d;
                tp6Var.getClass();
                tp6Var.m(null, f06.a);
                A.m();
                return jg7Var;
            case 2:
                int i4 = RomDetailsActivity.J0;
                qv5 A2 = romDetailsActivity.A();
                if (!((oi4) A2.o.getValue()).g) {
                    hv.L(to7.a(A2), null, null, new ns3(A2, null, 8), 3);
                }
                return jg7Var;
            case 3:
                int i5 = RomDetailsActivity.J0;
                return new v82(romDetailsActivity);
            default:
                int i6 = RomDetailsActivity.J0;
                romDetailsActivity.onNavigateUp();
                return jg7Var;
        }
    }
}
