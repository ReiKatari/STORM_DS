package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wt6  reason: default package */
/* loaded from: classes.dex */
public final class wt6 implements kf6 {
    public final na4 A;
    public final bf4 B;

    public wt6(na4 na4Var, bf4 bf4Var) {
        this.A = na4Var;
        this.B = bf4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    @Override // defpackage.le2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ne2 ne2Var, r41 r41Var) {
        vt6 vt6Var;
        int i;
        if (r41Var instanceof vt6) {
            vt6Var = (vt6) r41Var;
            int i2 = vt6Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vt6Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = vt6Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = vt6Var.Y;
                if (i == 0) {
                    if (i != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    ut6 ut6Var = new ut6(ne2Var, this.B);
                    vt6Var.Y = 1;
                    if (this.A.b(ut6Var, vt6Var) == x61Var) {
                        return x61Var;
                    }
                }
                e41.c();
                return null;
            }
        }
        vt6Var = new vt6(this, r41Var);
        Object obj2 = vt6Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = vt6Var.Y;
        if (i == 0) {
        }
        e41.c();
        return null;
    }
}
