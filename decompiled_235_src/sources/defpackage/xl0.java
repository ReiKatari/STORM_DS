package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xl0  reason: default package */
/* loaded from: classes.dex */
public abstract class xl0 extends wl0 {
    public final le2 R;

    public xl0(int i, m80 m80Var, l61 l61Var, le2 le2Var) {
        super(l61Var, i, m80Var);
        this.R = le2Var;
    }

    @Override // defpackage.wl0, defpackage.le2
    public final Object b(ne2 ne2Var, r41 r41Var) {
        l61 A;
        if (this.B == -3) {
            l61 b = r41Var.b();
            Boolean bool = Boolean.FALSE;
            lw0 lw0Var = new lw0(21, (byte) 0);
            l61 l61Var = this.A;
            if (!((Boolean) l61Var.x(lw0Var, bool)).booleanValue()) {
                A = b.N(l61Var);
            } else {
                A = mb3.A(b, l61Var, false);
            }
            if (nb3.k(A, b)) {
                Object j = j(ne2Var, r41Var);
                if (j == x61.COROUTINE_SUSPENDED) {
                    return j;
                }
            } else {
                d90 d90Var = d90.r0;
                if (nb3.k(A.Z(d90Var), b.Z(d90Var))) {
                    l61 b2 = r41Var.b();
                    if (!(ne2Var instanceof pb6) && !(ne2Var instanceof rg4)) {
                        ne2Var = new vc(ne2Var, b2);
                    }
                    Object P = mb3.P(A, ne2Var, k57.b(A), new z(this, (r41) null, 14), r41Var);
                    if (P == x61.COROUTINE_SUSPENDED) {
                        return P;
                    }
                }
            }
            return jg7.a;
        }
        Object b3 = super.b(ne2Var, r41Var);
        if (b3 == x61.COROUTINE_SUSPENDED) {
            return b3;
        }
        return jg7.a;
    }

    @Override // defpackage.wl0
    public final Object e(r35 r35Var, r41 r41Var) {
        Object j = j(new pb6(r35Var), r41Var);
        if (j == x61.COROUTINE_SUSPENDED) {
            return j;
        }
        return jg7.a;
    }

    public abstract Object j(ne2 ne2Var, r41 r41Var);

    @Override // defpackage.wl0
    public final String toString() {
        return this.R + " -> " + super.toString();
    }
}
