package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w70  reason: default package */
/* loaded from: classes.dex */
public final class w70 extends z64 implements o70, kj3 {
    public p31 k0;
    public boolean l0;

    public static final of5 R0(w70 w70Var, eg4 eg4Var, le leVar) {
        of5 of5Var;
        if (w70Var.j0 && w70Var.l0) {
            eg4 e0 = nc1.e0(w70Var);
            if (!eg4Var.Y0().j0) {
                eg4Var = null;
            }
            if (eg4Var != null && (of5Var = (of5) leVar.c()) != null) {
                return of5Var.i(e0.O(eg4Var, false).d());
            }
        }
        return null;
    }

    @Override // defpackage.o70
    public final Object G(eg4 eg4Var, le leVar, s41 s41Var) {
        Object C = g04.C(new v70(this, eg4Var, leVar, new u6(this, eg4Var, leVar, 3), (r41) null, 0), s41Var);
        if (C == x61.COROUTINE_SUSPENDED) {
            return C;
        }
        return jg7.a;
    }

    @Override // defpackage.z64
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.kj3
    public final void m(jk3 jk3Var) {
        this.l0 = true;
    }
}
