package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ax7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ax7 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ String L;

    public /* synthetic */ ax7(String str, int i, long j) {
        this.A = i;
        this.B = j;
        this.L = str;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        j36 i0;
        int i = this.A;
        String str = this.L;
        long j = this.B;
        e36 e36Var = (e36) obj;
        switch (i) {
            case 0:
                e36Var.getClass();
                i0 = e36Var.i0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    i0.c(1, j);
                    i0.w(2, str);
                    i0.f0();
                    int D = oi2.D(e36Var);
                    i0.close();
                    return Integer.valueOf(D);
                } finally {
                }
            default:
                e36Var.getClass();
                i0 = e36Var.i0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    i0.c(1, j);
                    i0.w(2, str);
                    i0.f0();
                    i0.close();
                    return jg7.a;
                } finally {
                }
        }
    }
}
