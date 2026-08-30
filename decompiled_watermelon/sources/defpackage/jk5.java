package defpackage;

import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jk5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jk5 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ RomDetailsActivity B;

    public /* synthetic */ jk5(RomDetailsActivity romDetailsActivity, int i) {
        this.A = i;
        this.B = romDetailsActivity;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        o27 o27Var = o27.a;
        RomDetailsActivity romDetailsActivity = this.B;
        switch (i) {
            case 0:
                int i2 = RomDetailsActivity.I0;
                sl5 sl5Var = (sl5) romDetailsActivity.B0.getValue();
                tq5.w(ua7.a(sl5Var), null, null, new ys3(sl5Var, null, 8), 3);
                return o27Var;
            case 1:
                int i3 = RomDetailsActivity.I0;
                al5 A = romDetailsActivity.A();
                ee6 ee6Var = A.d;
                ee6Var.getClass();
                ee6Var.l(null, lp5.a);
                A.m();
                return o27Var;
            case 2:
                int i4 = RomDetailsActivity.I0;
                al5 A2 = romDetailsActivity.A();
                if (!((r94) A2.o.getValue()).g) {
                    tq5.w(ua7.a(A2), null, null, new ys3(A2, null, 7), 3);
                }
                return o27Var;
            case 3:
                int i5 = RomDetailsActivity.I0;
                return new d42(romDetailsActivity);
            default:
                int i6 = RomDetailsActivity.I0;
                romDetailsActivity.onNavigateUp();
                return o27Var;
        }
    }
}
