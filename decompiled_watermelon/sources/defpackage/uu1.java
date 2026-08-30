package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uu1  reason: default package */
/* loaded from: classes.dex */
public final class uu1 implements w92 {
    public final /* synthetic */ int A;
    public final /* synthetic */ hv1 B;

    public /* synthetic */ uu1(hv1 hv1Var, int i) {
        this.A = i;
        this.B = hv1Var;
    }

    @Override // defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        Long l;
        switch (this.A) {
            case 0:
                kd5 kd5Var = (kd5) obj;
                hv1 hv1Var = this.B;
                id5 id5Var = hv1Var.d;
                kd5 kd5Var2 = id5Var.c;
                if (kd5Var2 == null) {
                    kd5Var2 = id5Var.a();
                }
                if (hv1Var.n1 != null) {
                    long j = kd5Var2.f;
                    long j2 = kd5Var.f;
                    if (j != j2 && ((l = hv1Var.o1) == null || l.longValue() != j2)) {
                        hv1Var.o1 = new Long(kd5Var.f);
                        hv1Var.J0.p(av6.a);
                        ld5.a(kd5Var, "restart_required");
                    }
                }
                return o27.a;
            case 1:
                nd3 nd3Var = (nd3) obj;
                tf0 tf0Var = this.B.u;
                tf0Var.getClass();
                nd3Var.getClass();
                ee6 ee6Var = (ee6) tf0Var.Z;
                ee6Var.getClass();
                ee6Var.l(null, nd3Var);
                return o27.a;
            case 2:
                o27 o27Var = o27.a;
                hv1 hv1Var2 = this.B;
                int i = ix1.a[((g64) obj).ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        hv1Var2.T0();
                    } else {
                        i.c();
                        return null;
                    }
                } else {
                    mx2 mx2Var = hv1Var2.f0;
                    synchronized (mx2Var) {
                        mx2Var.A = true;
                    }
                    Object h1 = hv1Var2.h1(j11Var);
                    if (h1 == p31.COROUTINE_SUSPENDED) {
                        return h1;
                    }
                }
                return o27Var;
            default:
                s05 s05Var = (s05) obj;
                hv1 hv1Var3 = this.B;
                ht1 ht1Var = hv1Var3.w;
                if (s05Var instanceof g05) {
                    dy4 dy4Var = ((g05) s05Var).a;
                    hv1Var3.J0("achievement_submit_success", new ti4("achievement_id", new Long(dy4Var.a)), new ti4("hardcore", Boolean.valueOf(ht1Var.a)), new ti4("awarded", Boolean.TRUE));
                    hv1Var3.k0(dy4Var.a, "submit_success");
                } else if (s05Var instanceof n05) {
                    n05 n05Var = (n05) s05Var;
                    long j3 = n05Var.a;
                    hv1Var3.J0("leaderboard_submit_success", new ti4("leaderboard_id", new Long(j3)), new ti4("rank", new Long(n05Var.g)));
                    hv1Var3.l0(j3, "submit_success");
                } else if (s05Var instanceof m05) {
                    hv1Var3.J0("leaderboard_submit_failed", new ti4("leaderboard_id", new Long(((m05) s05Var).a)), new ti4("error", "RetryQueued"));
                } else if (s05Var instanceof f05) {
                    hv1Var3.J0("achievement_submit_failed", new ti4("achievement_id", new Long(((f05) s05Var).a.a)), new ti4("hardcore", Boolean.valueOf(ht1Var.a)), new ti4("error", "RetryQueued"));
                }
                Object b = hv1Var3.F0.b(s05Var, j11Var);
                if (b != p31.COROUTINE_SUSPENDED) {
                    return o27.a;
                }
                return b;
        }
    }
}
