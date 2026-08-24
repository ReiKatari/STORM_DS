package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ox6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ox6 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int L;

    public /* synthetic */ ox6(int i, String str) {
        this.A = 2;
        this.L = i;
        this.B = str;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        j36 i0;
        nx6 nx6Var;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        String str = this.B;
        int i2 = this.L;
        e36 e36Var = (e36) obj;
        switch (i) {
            case 0:
                e36Var.getClass();
                i0 = e36Var.i0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    i0.w(1, str);
                    i0.c(2, i2);
                    int B = ej2.B(i0, "work_spec_id");
                    int B2 = ej2.B(i0, "generation");
                    int B3 = ej2.B(i0, "system_id");
                    if (i0.f0()) {
                        nx6Var = new nx6(i0.R(B), (int) i0.getLong(B2), (int) i0.getLong(B3));
                    } else {
                        nx6Var = null;
                    }
                    return nx6Var;
                } finally {
                }
            case 1:
                e36Var.getClass();
                i0 = e36Var.i0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    i0.w(1, str);
                    i0.c(2, i2);
                    i0.f0();
                    return jg7Var;
                } finally {
                }
            default:
                e36Var.getClass();
                i0 = e36Var.i0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    i0.c(1, i2);
                    i0.w(2, str);
                    i0.f0();
                    return jg7Var;
                } finally {
                }
        }
    }

    public /* synthetic */ ox6(String str, int i, int i2) {
        this.A = i2;
        this.B = str;
        this.L = i;
    }
}
