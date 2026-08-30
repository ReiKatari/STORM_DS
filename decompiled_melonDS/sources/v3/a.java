package v3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements q {

    /* renamed from: b  reason: collision with root package name */
    public final int f13629b;

    public a(int i2) {
        this.f13629b = i2;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (a.class.equals(cls)) {
                obj.getClass();
                if (this.f13629b != ((a) obj).f13629b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13629b;
    }

    public final String toString() {
        return w.d.p(new StringBuilder("AndroidPointerIcon(type="), this.f13629b, ')');
    }
}
