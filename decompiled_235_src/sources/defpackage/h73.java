package defpackage;

import me.magnum.melonds.ui.inputsetup.InputSetupActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h73  reason: default package */
/* loaded from: classes.dex */
public final class h73 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ InputSetupActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h73(InputSetupActivity inputSetupActivity, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = inputSetupActivity;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((h73) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((h73) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        InputSetupActivity inputSetupActivity = this.Z;
        switch (i) {
            case 0:
                return new h73(inputSetupActivity, r41Var, 0);
            default:
                return new h73(inputSetupActivity, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        InputSetupActivity inputSetupActivity = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                int i3 = InputSetupActivity.D0;
                de5 de5Var = inputSetupActivity.B().j;
                de5 de5Var2 = inputSetupActivity.B().l;
                hw6 hw6Var = new hw6(3, null);
                y6 y6Var = new y6(inputSetupActivity, 9);
                this.Y = 1;
                Object o = nb3.o(this, y6Var, jz.R, new o12(hw6Var, (r41) null, 5), new le2[]{de5Var, de5Var2});
                if (o != x61Var) {
                    o = jg7Var;
                }
                if (o == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ku3 ku3Var = inputSetupActivity.A;
                tt3 tt3Var = tt3.STARTED;
                h73 h73Var = new h73(inputSetupActivity, null, 0);
                this.Y = 1;
                if (np2.c0(ku3Var, tt3Var, h73Var, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
        }
    }
}
