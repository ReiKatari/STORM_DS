package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ck6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ck6 extends po2 implements qn2 {
    public final /* synthetic */ bs0 d0;
    public final /* synthetic */ ah5 e0;
    public final /* synthetic */ ah5 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck6(bs0 bs0Var, ah5 ah5Var, ah5 ah5Var2) {
        super(1, mb3.class, "scaleToOffset", "Slider$lambda$3$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.d0 = bs0Var;
        this.e0 = ah5Var;
        this.f0 = ah5Var2;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        float f;
        float floatValue = ((Number) obj).floatValue();
        bs0 bs0Var = this.d0;
        float f2 = bs0Var.a;
        float f3 = bs0Var.b;
        float f4 = this.e0.A;
        float f5 = this.f0.A;
        float f6 = f3 - f2;
        float f7 = RecyclerView.B1;
        if (f6 == RecyclerView.B1) {
            f = 0.0f;
        } else {
            f = (floatValue - f2) / f6;
        }
        if (f >= RecyclerView.B1) {
            f7 = f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        return Float.valueOf(oi2.L(f4, f5, f7));
    }
}
