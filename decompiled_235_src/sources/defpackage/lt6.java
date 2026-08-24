package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lt6  reason: default package */
/* loaded from: classes.dex */
public final class lt6 extends aj3 implements eo2 {
    public final /* synthetic */ pt6 B;
    public final /* synthetic */ a74 L;
    public final /* synthetic */ eo2 R;
    public final /* synthetic */ int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt6(pt6 pt6Var, a74 a74Var, eo2 eo2Var, int i) {
        super(2);
        this.B = pt6Var;
        this.L = a74Var;
        this.R = eo2Var;
        this.X = i;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a0 = ii2.a0(this.X | 1);
        mt6.b(this.B, this.L, this.R, (px0) obj, a0);
        return jg7.a;
    }
}
