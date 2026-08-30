package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m86  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class m86 extends lj2 implements mi2 {
    public final /* synthetic */ op0 c0;
    public final /* synthetic */ k75 d0;
    public final /* synthetic */ k75 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m86(op0 op0Var, k75 k75Var, k75 k75Var2) {
        super(1, a53.class, "scaleToOffset", "Slider$lambda$3$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.c0 = op0Var;
        this.d0 = k75Var;
        this.e0 = k75Var2;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        float f;
        float floatValue = ((Number) obj).floatValue();
        op0 op0Var = this.c0;
        float f2 = op0Var.a;
        float f3 = op0Var.b;
        float f4 = this.d0.A;
        float f5 = this.e0.A;
        float f6 = f3 - f2;
        float f7 = RecyclerView.A1;
        if (f6 == RecyclerView.A1) {
            f = 0.0f;
        } else {
            f = (floatValue - f2) / f6;
        }
        if (f >= RecyclerView.A1) {
            f7 = f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        return Float.valueOf(ep2.y(f4, f5, f7));
    }
}
