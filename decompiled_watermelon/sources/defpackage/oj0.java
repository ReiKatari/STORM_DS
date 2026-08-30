package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oj0  reason: default package */
/* loaded from: classes.dex */
public abstract class oj0 extends nj0 {
    public final u92 R;

    public oj0(int i, h60 h60Var, e31 e31Var, u92 u92Var) {
        super(e31Var, i, h60Var);
        this.R = u92Var;
    }

    @Override // defpackage.nj0, defpackage.u92
    public final Object a(w92 w92Var, j11 j11Var) {
        e31 r;
        if (this.B == -3) {
            e31 a = j11Var.a();
            Boolean bool = Boolean.FALSE;
            qt0 qt0Var = new qt0(7);
            e31 e31Var = this.A;
            if (!((Boolean) e31Var.N(qt0Var, bool)).booleanValue()) {
                r = a.C(e31Var);
            } else {
                r = pu.r(a, e31Var, false);
            }
            if (b53.x(r, a)) {
                Object j = j(w92Var, j11Var);
                if (j == p31.COROUTINE_SUSPENDED) {
                    return j;
                }
            } else {
                k45 k45Var = k45.Y;
                if (b53.x(r.I(k45Var), a.I(k45Var))) {
                    e31 a2 = j11Var.a();
                    if (!(w92Var instanceof a06) && !(w92Var instanceof a84)) {
                        w92Var = new hc(w92Var, a2);
                    }
                    Object Q = pu.Q(r, w92Var, ts6.b(r), new y(this, (j11) null, 14), j11Var);
                    if (Q == p31.COROUTINE_SUSPENDED) {
                        return Q;
                    }
                }
            }
            return o27.a;
        }
        Object a3 = super.a(w92Var, j11Var);
        if (a3 == p31.COROUTINE_SUSPENDED) {
            return a3;
        }
        return o27.a;
    }

    @Override // defpackage.nj0
    public final Object f(nu4 nu4Var, j11 j11Var) {
        Object j = j(new a06(nu4Var), j11Var);
        if (j == p31.COROUTINE_SUSPENDED) {
            return j;
        }
        return o27.a;
    }

    public abstract Object j(w92 w92Var, j11 j11Var);

    @Override // defpackage.nj0
    public final String toString() {
        return this.R + " -> " + super.toString();
    }
}
