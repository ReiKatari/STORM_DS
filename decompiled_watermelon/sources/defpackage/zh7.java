package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zh7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zh7 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ String L;

    public /* synthetic */ zh7(String str, int i, long j) {
        this.A = i;
        this.B = j;
        this.L = str;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        ns5 i0;
        int i = this.A;
        String str = this.L;
        long j = this.B;
        ls5 ls5Var = (ls5) obj;
        switch (i) {
            case 0:
                ls5Var.getClass();
                i0 = ls5Var.i0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    i0.g(1, j);
                    i0.M(2, str);
                    i0.a0();
                    int I = cg2.I(ls5Var);
                    i0.close();
                    return Integer.valueOf(I);
                } finally {
                }
            default:
                ls5Var.getClass();
                i0 = ls5Var.i0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    i0.g(1, j);
                    i0.M(2, str);
                    i0.a0();
                    i0.close();
                    return o27.a;
                } finally {
                }
        }
    }
}
