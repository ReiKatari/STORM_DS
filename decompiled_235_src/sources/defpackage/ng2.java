package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ng2  reason: default package */
/* loaded from: classes.dex */
public final class ng2 implements le2 {
    public final /* synthetic */ le2 A;
    public final /* synthetic */ m16 B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ qn2 R;

    public ng2(le2 le2Var, m16 m16Var, boolean z, qn2 qn2Var) {
        this.A = le2Var;
        this.B = m16Var;
        this.L = z;
        this.R = qn2Var;
    }

    @Override // defpackage.le2
    public final Object b(ne2 ne2Var, r41 r41Var) {
        Object b = this.A.b(new mg2(ne2Var, this.B, this.L, this.R), r41Var);
        if (b == x61.COROUTINE_SUSPENDED) {
            return b;
        }
        return jg7.a;
    }
}
