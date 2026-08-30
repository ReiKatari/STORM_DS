package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vn  reason: default package */
/* loaded from: classes.dex */
public final class vn extends ic3 implements bj2 {
    public final /* synthetic */ mi2 B;
    public final /* synthetic */ kx6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(mi2 mi2Var, kx6 kx6Var) {
        super(3);
        this.B = mi2Var;
        this.L = kx6Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        long j;
        vv3 vv3Var = (vv3) obj;
        yn4 c = ((mv3) obj2).c(((lz0) obj3).a);
        if (vv3Var.w()) {
            if (!((Boolean) this.B.n(this.L.d.getValue())).booleanValue()) {
                j = 0;
                return vv3Var.s0((int) (j >> 32), (int) (4294967295L & j), qp1.A, new sd(c, 2));
            }
        }
        j = (c.A << 32) | (c.B & 4294967295L);
        return vv3Var.s0((int) (j >> 32), (int) (4294967295L & j), qp1.A, new sd(c, 2));
    }
}
