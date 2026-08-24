package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ju1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ju1 implements eo2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ o6 B;

    public /* synthetic */ ju1(o6 o6Var) {
        this.B = o6Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        o6 o6Var = this.B;
        px0 px0Var = (px0) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = EmulatorActivity.Z1;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    g04.j(o6Var, xq2Var, 0);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                num.getClass();
                g04.j(o6Var, px0Var, ii2.a0(1));
                return jg7Var;
        }
    }

    public /* synthetic */ ju1(o6 o6Var, int i) {
        this.B = o6Var;
    }
}
