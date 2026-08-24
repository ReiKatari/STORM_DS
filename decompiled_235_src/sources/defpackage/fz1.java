package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fz1  reason: default package */
/* loaded from: classes.dex */
public final class fz1 implements ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ sz1 B;

    public /* synthetic */ fz1(sz1 sz1Var, int i) {
        this.A = i;
        this.B = sz1Var;
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        Long l;
        switch (this.A) {
            case 0:
                en5 en5Var = (en5) obj;
                sz1 sz1Var = this.B;
                cn5 cn5Var = sz1Var.d;
                en5 en5Var2 = cn5Var.c;
                if (en5Var2 == null) {
                    en5Var2 = cn5Var.a();
                }
                if (sz1Var.n1 != null) {
                    long j = en5Var2.f;
                    long j2 = en5Var.f;
                    if (j != j2 && ((l = sz1Var.o1) == null || l.longValue() != j2)) {
                        sz1Var.o1 = new Long(en5Var.f);
                        sz1Var.J0.k(r77.a);
                        fn5.a(en5Var, "restart_required");
                    }
                }
                return jg7.a;
            case 1:
                fk3 fk3Var = (fk3) obj;
                ci0 ci0Var = this.B.u;
                ci0Var.getClass();
                fk3Var.getClass();
                tp6 tp6Var = (tp6) ci0Var.g;
                tp6Var.getClass();
                tp6Var.m(null, fk3Var);
                return jg7.a;
            case 2:
                jg7 jg7Var = jg7.a;
                sz1 sz1Var2 = this.B;
                int i = t12.a[((ue4) obj).ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        sz1Var2.R0();
                    } else {
                        i.d();
                        return null;
                    }
                } else {
                    q33 q33Var = sz1Var2.f0;
                    synchronized (q33Var) {
                        q33Var.A = true;
                    }
                    Object f1 = sz1Var2.f1(r41Var);
                    if (f1 == x61.COROUTINE_SUSPENDED) {
                        return f1;
                    }
                }
                return jg7Var;
            default:
                ca5 ca5Var = (ca5) obj;
                sz1 sz1Var3 = this.B;
                sx1 sx1Var = sz1Var3.w;
                if (ca5Var instanceof q95) {
                    o75 o75Var = ((q95) ca5Var).a;
                    sz1Var3.H0("achievement_submit_success", new vr4("achievement_id", new Long(o75Var.a)), new vr4("hardcore", Boolean.valueOf(sx1Var.a)), new vr4("awarded", Boolean.TRUE));
                    sz1Var3.h0(o75Var.a, "submit_success");
                } else if (ca5Var instanceof x95) {
                    x95 x95Var = (x95) ca5Var;
                    long j3 = x95Var.a;
                    sz1Var3.H0("leaderboard_submit_success", new vr4("leaderboard_id", new Long(j3)), new vr4("rank", new Long(x95Var.g)));
                    sz1Var3.i0(j3, "submit_success");
                } else if (ca5Var instanceof w95) {
                    sz1Var3.H0("leaderboard_submit_failed", new vr4("leaderboard_id", new Long(((w95) ca5Var).a)), new vr4("error", "RetryQueued"));
                } else if (ca5Var instanceof p95) {
                    sz1Var3.H0("achievement_submit_failed", new vr4("achievement_id", new Long(((p95) ca5Var).a.a)), new vr4("hardcore", Boolean.valueOf(sx1Var.a)), new vr4("error", "RetryQueued"));
                }
                Object a = sz1Var3.F0.a(ca5Var, r41Var);
                if (a != x61.COROUTINE_SUSPENDED) {
                    return jg7.a;
                }
                return a;
        }
    }
}
