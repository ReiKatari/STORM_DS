package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uy6  reason: default package */
/* loaded from: classes.dex */
public final class uy6 implements m93 {
    public final m93 a;
    public final m93 b;
    public final m93 c;
    public final j06 d;

    public uy6(m93 m93Var, m93 m93Var2, m93 m93Var3) {
        j06 j06Var;
        m93Var.getClass();
        m93Var2.getClass();
        m93Var3.getClass();
        this.a = m93Var;
        this.b = m93Var2;
        this.c = m93Var3;
        h06[] h06VarArr = new h06[0];
        n95 n95Var = new n95(25, this);
        if (!zg6.B0("kotlin.Triple")) {
            ro0 ro0Var = new ro0("kotlin.Triple");
            n95Var.n(ro0Var);
            j06Var = new j06("kotlin.Triple", kh6.h, ro0Var.c.size(), nu.F0(h06VarArr), ro0Var);
        } else {
            i.i("Blank serial names are prohibited");
            j06Var = null;
        }
        this.d = j06Var;
    }

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        j06 j06Var = this.d;
        yu0 c = b91Var.c(j06Var);
        c.getClass();
        Object obj = b53.e;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int v = c.v(j06Var);
            if (v != -1) {
                if (v != 0) {
                    if (v != 1) {
                        if (v == 2) {
                            obj4 = c.U(j06Var, 2, this.c, null);
                        } else {
                            throw new IllegalArgumentException(wh1.g(v, "Unexpected index "));
                        }
                    } else {
                        obj3 = c.U(j06Var, 1, this.b, null);
                    }
                } else {
                    obj2 = c.U(j06Var, 0, this.a, null);
                }
            } else {
                c.a(j06Var);
                if (obj2 != obj) {
                    if (obj3 != obj) {
                        if (obj4 != obj) {
                            return new ty6(obj2, obj3, obj4);
                        }
                        throw new IllegalArgumentException("Element 'third' is missing");
                    }
                    throw new IllegalArgumentException("Element 'second' is missing");
                }
                throw new IllegalArgumentException("Element 'first' is missing");
            }
        }
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        ty6 ty6Var = (ty6) obj;
        ty6Var.getClass();
        j06 j06Var = this.d;
        zu0 c = mz1Var.c(j06Var);
        c.F(j06Var, 0, this.a, ty6Var.A);
        c.F(j06Var, 1, this.b, ty6Var.B);
        c.F(j06Var, 2, this.c, ty6Var.L);
        c.a(j06Var);
    }

    @Override // defpackage.m93
    public final h06 e() {
        return this.d;
    }
}
