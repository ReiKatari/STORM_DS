package f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final float f4658a;

    /* renamed from: b  reason: collision with root package name */
    public final i3.p0 f4659b;

    public v(float f8, i3.p0 p0Var) {
        this.f4658a = f8;
        this.f4659b = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v) {
                v vVar = (v) obj;
                if (!x4.f.b(this.f4658a, vVar.f4658a) || !this.f4659b.equals(vVar.f4659b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4659b.hashCode() + (Float.hashCode(this.f4658a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) x4.f.c(this.f4658a)) + ", brush=" + this.f4659b + ')';
    }
}
