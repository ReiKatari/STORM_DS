package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final b3.h f2452a;

    /* renamed from: b  reason: collision with root package name */
    public final mc.l f2453b;

    /* renamed from: c  reason: collision with root package name */
    public final d1.x f2454c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2455d;

    public k0(b3.h hVar, mc.l lVar, d1.x xVar, boolean z10) {
        this.f2452a = hVar;
        this.f2453b = lVar;
        this.f2454c = xVar;
        this.f2455d = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k0) {
                k0 k0Var = (k0) obj;
                if (!this.f2452a.equals(k0Var.f2452a) || !this.f2453b.equals(k0Var.f2453b) || !nc.k.a(this.f2454c, k0Var.f2454c) || this.f2455d != k0Var.f2455d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f2453b.hashCode();
        int hashCode2 = this.f2454c.hashCode();
        return Boolean.hashCode(this.f2455d) + ((hashCode2 + ((hashCode + (this.f2452a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f2452a + ", size=" + this.f2453b + ", animationSpec=" + this.f2454c + ", clip=" + this.f2455d + ')';
    }
}
