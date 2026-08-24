package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fy4  reason: default package */
/* loaded from: classes.dex */
public abstract class fy4 {
    public static final nq6 a = new l55(iy0.m0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final x61 a(et3 et3Var, l5 l5Var, s41 s41Var) {
        dy4 dy4Var;
        int i;
        if (s41Var instanceof dy4) {
            dy4 dy4Var2 = (dy4) s41Var;
            int i2 = dy4Var2.X;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dy4Var2.X = i2 - Integer.MIN_VALUE;
                dy4Var = dy4Var2;
                Object obj = dy4Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = dy4Var.X;
                if (i == 0) {
                    if (i != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    if (et3Var.A.j0) {
                        zp4 g0 = nc1.g0(et3Var);
                        xv4 xv4Var = (xv4) nc1.f0(et3Var).x0;
                        xv4Var.getClass();
                        if (q60.U(xv4Var, a) == null) {
                            dy4Var.X = 1;
                            if (b(g0, l5Var, dy4Var) == x61Var) {
                                return x61Var;
                            }
                        } else {
                            u34.a();
                            return null;
                        }
                    } else {
                        i.h("establishTextInputSession called from an unattached node");
                        return null;
                    }
                }
                e41.c();
                return null;
            }
        }
        dy4Var = new s41(s41Var);
        Object obj2 = dy4Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = dy4Var.X;
        if (i == 0) {
        }
        e41.c();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final x61 b(zp4 zp4Var, eo2 eo2Var, s41 s41Var) {
        ey4 ey4Var;
        int i;
        if (s41Var instanceof ey4) {
            ey4 ey4Var2 = (ey4) s41Var;
            int i2 = ey4Var2.X;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ey4Var2.X = i2 - Integer.MIN_VALUE;
                ey4Var = ey4Var2;
                Object obj = ey4Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ey4Var.X;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        e41.c();
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    ey4Var.X = 1;
                    if (((te) zp4Var).G(eo2Var, ey4Var) == x61Var) {
                        return x61Var;
                    }
                }
                e41.c();
                return null;
            }
        }
        ey4Var = new s41(s41Var);
        Object obj2 = ey4Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ey4Var.X;
        if (i == 0) {
        }
        e41.c();
        return null;
    }
}
