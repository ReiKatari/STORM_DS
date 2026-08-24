package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uy2  reason: default package */
/* loaded from: classes.dex */
public final class uy2 extends z64 implements yy4 {
    public r94 k0;
    public oy2 l0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Type inference failed for: r5v3, types: [oy2, java.lang.Object, t93] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object R0(uy2 uy2Var, s41 s41Var) {
        ry2 ry2Var;
        int i;
        oy2 oy2Var;
        if (s41Var instanceof ry2) {
            ry2Var = (ry2) s41Var;
            int i2 = ry2Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ry2Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = ry2Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ry2Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        oy2Var = ry2Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (uy2Var.l0 == null) {
                        ?? obj2 = new Object();
                        r94 r94Var = uy2Var.k0;
                        ry2Var.R = obj2;
                        ry2Var.Z = 1;
                        if (r94Var.a(obj2, ry2Var) == x61Var) {
                            return x61Var;
                        }
                        oy2Var = obj2;
                    }
                    return jg7.a;
                }
                uy2Var.l0 = oy2Var;
                return jg7.a;
            }
        }
        ry2Var = new ry2(uy2Var, s41Var);
        Object obj3 = ry2Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ry2Var.Z;
        if (i == 0) {
        }
        uy2Var.l0 = oy2Var;
        return jg7.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object S0(uy2 uy2Var, s41 s41Var) {
        sy2 sy2Var;
        int i;
        if (s41Var instanceof sy2) {
            sy2Var = (sy2) s41Var;
            int i2 = sy2Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sy2Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = sy2Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = sy2Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    oy2 oy2Var = uy2Var.l0;
                    if (oy2Var != null) {
                        py2 py2Var = new py2(oy2Var);
                        r94 r94Var = uy2Var.k0;
                        sy2Var.Y = 1;
                        if (r94Var.a(py2Var, sy2Var) == x61Var) {
                            return x61Var;
                        }
                    }
                    return jg7.a;
                }
                uy2Var.l0 = null;
                return jg7.a;
            }
        }
        sy2Var = new sy2(uy2Var, s41Var);
        Object obj2 = sy2Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = sy2Var.Y;
        if (i == 0) {
        }
        uy2Var.l0 = null;
        return jg7.a;
    }

    @Override // defpackage.yy4
    public final void I() {
        T0();
    }

    @Override // defpackage.z64
    public final void K0() {
        T0();
    }

    public final void T0() {
        oy2 oy2Var = this.l0;
        if (oy2Var != null) {
            this.k0.b(new py2(oy2Var));
            this.l0 = null;
        }
    }

    @Override // defpackage.yy4
    public final void w(oy4 oy4Var, py4 py4Var, long j) {
        if (py4Var == py4.Main) {
            int i = oy4Var.f;
            if (i == 4) {
                hv.L(F0(), null, null, new ty2(this, null, 0), 3);
            } else if (i == 5) {
                hv.L(F0(), null, null, new ty2(this, null, 1), 3);
            }
        }
    }
}
