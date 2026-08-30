package eh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public float f4495a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4496b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (Float.compare(this.f4495a, mVar.f4495a) != 0 || this.f4496b != mVar.f4496b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4496b) + (Float.hashCode(this.f4495a) * 31);
    }

    public final String toString() {
        float f8 = this.f4495a;
        boolean z10 = this.f4496b;
        return "AxisState(value=" + f8 + ", active=" + z10 + ")";
    }
}
