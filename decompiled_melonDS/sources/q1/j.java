package q1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements h1.d {

    /* renamed from: b  reason: collision with root package name */
    public final a0 f12146b;

    /* renamed from: c  reason: collision with root package name */
    public final h1.d f12147c;

    public j(a0 a0Var, h1.d dVar) {
        this.f12146b = a0Var;
        this.f12147c = dVar;
    }

    @Override // h1.d
    public final float a(float f8, float f10, float f11) {
        float a10 = this.f12147c.a(f8, f10, f11);
        boolean z10 = false;
        if (f8 <= 0.0f ? f8 + f10 <= 0.0f : f8 + f10 > f11) {
            z10 = true;
        }
        int i2 = (Math.abs(a10) > 0.0f ? 1 : (Math.abs(a10) == 0.0f ? 0 : -1));
        a0 a0Var = this.f12146b;
        if (i2 != 0 && z10) {
            float f12 = a0Var.f12098f * (-1);
            while (a10 > 0.0f && f12 < a10) {
                f12 += a0Var.p();
            }
            while (a10 < 0.0f && f12 > a10) {
                f12 -= a0Var.p();
            }
            return f12;
        } else if (Math.abs(a0Var.f12098f) < 1.0E-6d) {
            return 0.0f;
        } else {
            float f13 = a0Var.f12098f * (-1.0f);
            if (((Boolean) a0Var.G.getValue()).booleanValue()) {
                f13 += a0Var.p();
            }
            return p7.j.f(f13, -f11, f11);
        }
    }
}
