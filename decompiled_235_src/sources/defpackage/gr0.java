package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gr0  reason: default package */
/* loaded from: classes.dex */
public final class gr0 extends k16 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public gr0(q61 q61Var) {
        q61Var.getClass();
        this.b = q61Var;
    }

    @Override // defpackage.k16
    public final void b(vm2 vm2Var) {
        int i = this.a;
        Object obj = this.b;
        vm2Var.getClass();
        switch (i) {
            case 0:
                vm2Var.e();
                try {
                    StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                    ((q61) obj).getClass();
                    sb.append(System.currentTimeMillis() - 86400000);
                    sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    vm2Var.r(sb.toString());
                    vm2Var.D();
                    return;
                } finally {
                    vm2Var.n();
                }
            default:
                ((ro5) obj).g(vm2Var);
                return;
        }
    }

    public gr0(ro5 ro5Var) {
        this.b = ro5Var;
    }
}
