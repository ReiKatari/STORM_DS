package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pc7  reason: default package */
/* loaded from: classes.dex */
public final class pc7 implements gg3 {
    public final gg3 a;
    public final gg3 b;
    public final gg3 c;
    public final yb6 d;

    public pc7(gg3 gg3Var, gg3 gg3Var2, gg3 gg3Var3) {
        yb6 yb6Var;
        gg3Var.getClass();
        gg3Var2.getClass();
        gg3Var3.getClass();
        this.a = gg3Var;
        this.b = gg3Var2;
        this.c = gg3Var3;
        wb6[] wb6VarArr = new wb6[0];
        ro5 ro5Var = new ro5(this, 24);
        if (!qs6.v0("kotlin.Triple")) {
            br0 br0Var = new br0("kotlin.Triple");
            ro5Var.g(br0Var);
            yb6Var = new yb6("kotlin.Triple", bt6.e, br0Var.c.size(), fv.T0(wb6VarArr), br0Var);
        } else {
            i.h("Blank serial names are prohibited");
            yb6Var = null;
        }
        this.d = yb6Var;
    }

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        yb6 yb6Var = this.d;
        ux0 c = sc1Var.c(yb6Var);
        c.getClass();
        Object obj = ge7.j;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int q = c.q(yb6Var);
            if (q != -1) {
                if (q != 0) {
                    if (q != 1) {
                        if (q == 2) {
                            obj4 = c.G(yb6Var, 2, this.c, null);
                        } else {
                            throw new IllegalArgumentException(lb1.g(q, "Unexpected index "));
                        }
                    } else {
                        obj3 = c.G(yb6Var, 1, this.b, null);
                    }
                } else {
                    obj2 = c.G(yb6Var, 0, this.a, null);
                }
            } else {
                c.a(yb6Var);
                if (obj2 != obj) {
                    if (obj3 != obj) {
                        if (obj4 != obj) {
                            return new oc7(obj2, obj3, obj4);
                        }
                        throw new IllegalArgumentException("Element 'third' is missing");
                    }
                    throw new IllegalArgumentException("Element 'second' is missing");
                }
                throw new IllegalArgumentException("Element 'first' is missing");
            }
        }
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        oc7 oc7Var = (oc7) obj;
        oc7Var.getClass();
        yb6 yb6Var = this.d;
        vx0 c = x32Var.c(yb6Var);
        c.w(yb6Var, 0, this.a, oc7Var.A);
        c.w(yb6Var, 1, this.b, oc7Var.B);
        c.w(yb6Var, 2, this.c, oc7Var.L);
        c.a(yb6Var);
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return this.d;
    }
}
