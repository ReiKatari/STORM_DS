package defpackage;

import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fv5  reason: default package */
/* loaded from: classes.dex */
public final class fv5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ RomDetailsActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fv5(RomDetailsActivity romDetailsActivity, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = romDetailsActivity;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((fv5) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((fv5) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        RomDetailsActivity romDetailsActivity = this.Z;
        switch (i) {
            case 0:
                return new fv5(romDetailsActivity, r41Var, 0);
            default:
                return new fv5(romDetailsActivity, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        RomDetailsActivity romDetailsActivity = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    int i3 = RomDetailsActivity.J0;
                    be5 be5Var = romDetailsActivity.A().g;
                    y6 y6Var = new y6(romDetailsActivity, 13);
                    this.Y = 1;
                    if (be5Var.A.b(y6Var, this) == x61Var) {
                        return x61Var;
                    }
                }
                e41.c();
                return null;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    int i5 = RomDetailsActivity.J0;
                    be5 be5Var2 = romDetailsActivity.A().r;
                    m5 m5Var = new m5(romDetailsActivity, null, 25);
                    this.Y = 1;
                    if (f04.v(be5Var2, m5Var, this) == x61Var2) {
                        return x61Var2;
                    }
                }
                return jg7.a;
        }
    }
}
