package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w51  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w51 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ jt3 B;

    public /* synthetic */ w51(jt3 jt3Var, int i) {
        this.A = i;
        this.B = jt3Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        String str;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        jt3 jt3Var = this.B;
        switch (i) {
            case 0:
                jk3 jk3Var = (jk3) obj;
                b47 d = jt3Var.d();
                if (d != null) {
                    d.c = jk3Var;
                }
                return jg7Var;
            case 1:
                vs4 vs4Var = jt3Var.t;
                c37 c37Var = (c37) obj;
                String str2 = c37Var.a.B;
                fp fpVar = jt3Var.j;
                if (fpVar != null) {
                    str = fpVar.B;
                } else {
                    str = null;
                }
                if (!nb3.k(str2, str)) {
                    jt3Var.k.setValue(hv2.None);
                    if (((Boolean) vs4Var.getValue()).booleanValue()) {
                        vs4Var.setValue(Boolean.FALSE);
                    } else {
                        jt3Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = k47.b;
                jt3Var.f(j);
                jt3Var.e(j);
                jt3Var.u.g(c37Var);
                cf5 cf5Var = jt3Var.b;
                ey0 ey0Var = cf5Var.a;
                if (ey0Var != null) {
                    ey0Var.s(cf5Var, null);
                }
                return jg7Var;
            case 2:
                jt3Var.r.b(((k33) obj).a);
                return jg7Var;
            case 3:
                return Boolean.valueOf(jt3Var.r.b(((k33) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                jt3Var.q.setValue(bool);
                return jg7Var;
        }
    }
}
