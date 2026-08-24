package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t17  reason: default package */
/* loaded from: classes.dex */
public final class t17 implements fo2 {
    public final /* synthetic */ i17 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ r94 R;

    public t17(i17 i17Var, boolean z, boolean z2, r94 r94Var) {
        this.A = i17Var;
        this.B = z;
        this.L = z2;
        this.R = r94Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        z63 z63Var = (z63) obj;
        ((Number) obj3).intValue();
        xq2 xq2Var = (xq2) ((px0) obj2);
        xq2Var.b0(1423138213);
        if (z63Var == z63.UnfocusedEmpty) {
            z = false;
        } else {
            z = this.L;
        }
        long j = ((kt0) this.A.e(this.B, z, this.R, xq2Var).getValue()).a;
        xq2Var.p(false);
        return new kt0(j);
    }
}
