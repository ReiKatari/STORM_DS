package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y96  reason: default package */
/* loaded from: classes.dex */
public final class y96 implements fo2 {
    public final /* synthetic */ n43 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ mq5 R;
    public final /* synthetic */ on2 X;

    public y96(n43 n43Var, boolean z, boolean z2, mq5 mq5Var, on2 on2Var) {
        this.A = n43Var;
        this.B = z;
        this.L = z2;
        this.R = mq5Var;
        this.X = on2Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        a74 a74Var = (a74) obj;
        ((Number) obj3).intValue();
        xq2 xq2Var = (xq2) ((px0) obj2);
        xq2Var.b0(-1525724089);
        Object P = xq2Var.P();
        if (P == ox0.a) {
            P = i61.f(xq2Var);
        }
        r94 r94Var = (r94) P;
        a74 d = k43.a(x64.a, r94Var, this.A).d(new x96(this.B, r94Var, null, false, this.L, this.R, this.X));
        xq2Var.p(false);
        return d;
    }
}
