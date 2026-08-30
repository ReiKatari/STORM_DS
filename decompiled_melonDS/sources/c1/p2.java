package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a  reason: collision with root package name */
    public final nc.l f2503a;

    /* renamed from: b  reason: collision with root package name */
    public final d1.a1 f2504b;

    public p2(mc.l lVar, d1.a1 a1Var) {
        this.f2503a = (nc.l) lVar;
        this.f2504b = a1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p2) {
                p2 p2Var = (p2) obj;
                if (!this.f2503a.equals(p2Var.f2503a) || !this.f2504b.equals(p2Var.f2504b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2504b.hashCode() + (this.f2503a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f2503a + ", animationSpec=" + this.f2504b + ')';
    }
}
