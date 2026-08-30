package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xs3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xs3 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ zs3 B;

    public /* synthetic */ xs3(zs3 zs3Var, int i) {
        this.A = i;
        this.B = zs3Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        long j;
        int i = this.A;
        zs3 zs3Var = this.B;
        switch (i) {
            case 0:
                zs3Var.T0();
                return o27.a;
            case 1:
                return new mb4(zs3Var.r0);
            default:
                rd3 rd3Var = (rd3) zs3Var.p0.getValue();
                if (rd3Var != null) {
                    j = rd3Var.Q(0L);
                } else {
                    j = 9205357640488583168L;
                }
                return new mb4(j);
        }
    }
}
