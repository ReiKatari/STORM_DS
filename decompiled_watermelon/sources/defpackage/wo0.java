package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wo0  reason: default package */
/* loaded from: classes.dex */
public final class wo0 extends qq5 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public wo0(hm1 hm1Var) {
        hm1Var.getClass();
        this.b = hm1Var;
    }

    @Override // defpackage.qq5
    public final void b(vh2 vh2Var) {
        int i = this.a;
        Object obj = this.b;
        vh2Var.getClass();
        switch (i) {
            case 0:
                vh2Var.d();
                try {
                    StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                    ((hm1) obj).getClass();
                    sb.append(System.currentTimeMillis() - 86400000);
                    sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    vh2Var.x(sb.toString());
                    vh2Var.I();
                    return;
                } finally {
                    vh2Var.w();
                }
            default:
                ((n95) obj).n(vh2Var);
                return;
        }
    }

    public wo0(n95 n95Var) {
        this.b = n95Var;
    }
}
