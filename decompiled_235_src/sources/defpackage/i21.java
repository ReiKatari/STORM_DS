package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i21  reason: default package */
/* loaded from: classes.dex */
public abstract class i21 {
    public static final String a = ga0.h("ConstraintTrkngWrkr");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ww2 ww2Var, yw7 yw7Var, s41 s41Var) {
        h21 h21Var;
        int i;
        if (s41Var instanceof h21) {
            h21 h21Var2 = (h21) s41Var;
            int i2 = h21Var2.X;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h21Var2.X = i2 - Integer.MIN_VALUE;
                h21Var = h21Var2;
                Object obj = h21Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = h21Var.X;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    g21 g21Var = new g21(new cf2(ww2Var.s(yw7Var), new y3(yw7Var, (r41) null, 6), 2), 0);
                    h21Var.X = 1;
                    obj = f04.B(g21Var, h21Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                return new Integer(((w21) obj).a);
            }
        }
        h21Var = new s41(s41Var);
        Object obj2 = h21Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = h21Var.X;
        if (i == 0) {
        }
        return new Integer(((w21) obj2).a);
    }
}
