package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    public final d1.x f2415a;

    public e1(d1.x xVar) {
        this.f2415a = xVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e1) {
                e1 e1Var = (e1) obj;
                if (Float.compare(0.0f, 0.0f) != 0 || !nc.k.a(this.f2415a, e1Var.f2415a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2415a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f2415a + ')';
    }
}
