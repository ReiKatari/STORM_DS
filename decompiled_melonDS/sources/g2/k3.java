package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k3 implements f1.a1 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5216a;

    /* renamed from: b  reason: collision with root package name */
    public final float f5217b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5218c;

    public k3(boolean z10, float f8, long j2) {
        this.f5216a = z10;
        this.f5217b = f8;
        this.f5218c = j2;
    }

    @Override // f1.a1
    public final a4.j a(j1.i iVar) {
        return new g1(iVar, this.f5216a, this.f5217b, new f1(1, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k3) {
            k3 k3Var = (k3) obj;
            if (this.f5216a != k3Var.f5216a || !x4.f.b(this.f5217b, k3Var.f5217b)) {
                return false;
            }
            return i3.s.c(this.f5218c, k3Var.f5218c);
        }
        return false;
    }

    @Override // f1.a1
    public final int hashCode() {
        int b10 = w.d.b(this.f5217b, Boolean.hashCode(this.f5216a) * 31, 961);
        int i2 = i3.s.f6688i;
        return Long.hashCode(this.f5218c) + b10;
    }
}
