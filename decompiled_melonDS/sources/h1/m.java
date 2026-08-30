package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m implements u1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f5971a;

    public m(n nVar) {
        this.f5971a = nVar;
    }

    @Override // h1.u1
    public final float a(float f8) {
        boolean z10;
        if (Float.isNaN(f8)) {
            return 0.0f;
        }
        n nVar = this.f5971a;
        float floatValue = ((Number) nVar.f5977a.k(Float.valueOf(f8))).floatValue();
        n2.f1 f1Var = nVar.f5981e;
        boolean z11 = false;
        if (floatValue > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        f1Var.setValue(Boolean.valueOf(z10));
        n2.f1 f1Var2 = nVar.f5982f;
        if (floatValue < 0.0f) {
            z11 = true;
        }
        f1Var2.setValue(Boolean.valueOf(z11));
        return floatValue;
    }
}
