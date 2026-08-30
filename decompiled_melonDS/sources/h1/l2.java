package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l2 implements u1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p2 f5969a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n2 f5970b;

    public l2(p2 p2Var, n2 n2Var) {
        this.f5969a = p2Var;
        this.f5970b = n2Var;
    }

    @Override // h1.u1
    public final float a(float f8) {
        int i2 = (Math.abs(f8) > 0.0f ? 1 : (Math.abs(f8) == 0.0f ? 0 : -1));
        p2 p2Var = this.f5969a;
        if (i2 == 0 || ((Boolean) p2Var.f5996h.b()).booleanValue()) {
            return p2Var.d(p2Var.g(this.f5970b.a(2, p2Var.e(p2Var.h(f8)))));
        }
        throw new k1.c("The fling animation was cancelled", 0);
    }
}
