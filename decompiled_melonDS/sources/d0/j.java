package d0;

import android.view.Surface;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f3405a;

    /* renamed from: b  reason: collision with root package name */
    public final Surface f3406b;

    public j(int i2, Surface surface) {
        this.f3405a = i2;
        if (surface != null) {
            this.f3406b = surface;
        } else {
            m9.o.i("Null surface");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (this.f3405a == jVar.f3405a && this.f3406b.equals(jVar.f3406b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f3405a ^ 1000003) * 1000003) ^ this.f3406b.hashCode();
    }

    public final String toString() {
        return "Result{resultCode=" + this.f3405a + ", surface=" + this.f3406b + "}";
    }
}
