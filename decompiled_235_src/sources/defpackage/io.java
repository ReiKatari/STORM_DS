package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: io  reason: default package */
/* loaded from: classes.dex */
public final class io extends aj3 implements fo2 {
    public final /* synthetic */ qn2 B;
    public final /* synthetic */ ga7 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io(qn2 qn2Var, ga7 ga7Var) {
        super(3);
        this.B = qn2Var;
        this.L = ga7Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        long j;
        g34 g34Var = (g34) obj;
        dx4 y = ((x24) obj2).y(((q21) obj3).a);
        if (g34Var.a0()) {
            if (!((Boolean) this.B.g(this.L.d.getValue())).booleanValue()) {
                j = 0;
                return g34Var.K((int) (j >> 32), (int) (4294967295L & j), zt1.A, new he(y, 2));
            }
        }
        j = (y.A << 32) | (y.B & 4294967295L);
        return g34Var.K((int) (j >> 32), (int) (4294967295L & j), zt1.A, new he(y, 2));
    }
}
