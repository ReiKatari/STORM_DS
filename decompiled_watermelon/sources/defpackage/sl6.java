package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sl6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sl6 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int L;

    public /* synthetic */ sl6(int i, String str) {
        this.A = 2;
        this.L = i;
        this.B = str;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        ns5 i0;
        rl6 rl6Var;
        int i = this.A;
        o27 o27Var = o27.a;
        String str = this.B;
        int i2 = this.L;
        ls5 ls5Var = (ls5) obj;
        switch (i) {
            case 0:
                ls5Var.getClass();
                i0 = ls5Var.i0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    i0.M(1, str);
                    i0.g(2, i2);
                    int r = hi2.r(i0, "work_spec_id");
                    int r2 = hi2.r(i0, "generation");
                    int r3 = hi2.r(i0, "system_id");
                    if (i0.a0()) {
                        rl6Var = new rl6(i0.q(r), (int) i0.getLong(r2), (int) i0.getLong(r3));
                    } else {
                        rl6Var = null;
                    }
                    return rl6Var;
                } finally {
                }
            case 1:
                ls5Var.getClass();
                i0 = ls5Var.i0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    i0.M(1, str);
                    i0.g(2, i2);
                    i0.a0();
                    return o27Var;
                } finally {
                }
            default:
                ls5Var.getClass();
                i0 = ls5Var.i0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    i0.g(1, i2);
                    i0.M(2, str);
                    i0.a0();
                    return o27Var;
                } finally {
                }
        }
    }

    public /* synthetic */ sl6(String str, int i, int i2) {
        this.A = i2;
        this.B = str;
        this.L = i;
    }
}
