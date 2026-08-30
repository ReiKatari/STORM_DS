package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a  reason: collision with root package name */
    public final p f3553a;

    /* renamed from: b  reason: collision with root package name */
    public final v f3554b;

    public d2(p pVar, v vVar) {
        this.f3553a = pVar;
        this.f3554b = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d2) {
            d2 d2Var = (d2) obj;
            if (nc.k.a(this.f3553a, d2Var.f3553a) && nc.k.a(this.f3554b, d2Var.f3554b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f3554b.hashCode();
        return Integer.hashCode(0) + ((hashCode + (this.f3553a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f3553a + ", easing=" + this.f3554b + ", arcMode=ArcMode(value=0))";
    }
}
