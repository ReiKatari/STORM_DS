package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5329a;

    /* renamed from: b  reason: collision with root package name */
    public final v2.c f5330b;

    public p1(w4 w4Var, v2.c cVar) {
        this.f5329a = w4Var;
        this.f5330b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p1) {
                p1 p1Var = (p1) obj;
                if (!nc.k.a(this.f5329a, p1Var.f5329a) || !this.f5330b.equals(p1Var.f5330b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f5329a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.f5330b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f5329a + ", transition=" + this.f5330b + ')';
    }
}
