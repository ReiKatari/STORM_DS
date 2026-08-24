package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gc  reason: default package */
/* loaded from: classes.dex */
public final class gc implements eo2 {
    public final /* synthetic */ zv0 A;
    public final /* synthetic */ a74 B;
    public final /* synthetic */ eo2 L;
    public final /* synthetic */ eo2 R;
    public final /* synthetic */ ke6 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;

    public gc(zv0 zv0Var, a74 a74Var, eo2 eo2Var, eo2 eo2Var2, ke6 ke6Var, long j, long j2) {
        this.A = zv0Var;
        this.B = a74Var;
        this.L = eo2Var;
        this.R = eo2Var2;
        this.X = ke6Var;
        this.Y = j;
        this.Z = j2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        px0 px0Var = (px0) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        xq2 xq2Var = (xq2) px0Var;
        if (xq2Var.S(intValue & 1, z)) {
            hc.b(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, xq2Var, 0);
        } else {
            xq2Var.V();
        }
        return jg7.a;
    }
}
