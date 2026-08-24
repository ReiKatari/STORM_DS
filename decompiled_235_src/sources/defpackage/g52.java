package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g52  reason: default package */
/* loaded from: classes.dex */
public final class g52 extends aj3 implements qn2 {
    public final /* synthetic */ boolean B;
    public final /* synthetic */ on2 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g52(on2 on2Var, boolean z) {
        super(1);
        this.B = z;
        this.L = on2Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        boolean z;
        op5 op5Var = (op5) obj;
        if (!this.B && ((Boolean) this.L.c()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        op5Var.f(z);
        return jg7.a;
    }
}
