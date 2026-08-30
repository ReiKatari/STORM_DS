package y;

import android.os.Build;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final e f14637a;

    public g(e eVar) {
        this.f14637a = eVar;
    }

    public static g a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return new g(new e(obj));
        }
        return new g(new e(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f14637a.equals(((g) obj).f14637a);
    }

    public final int hashCode() {
        return this.f14637a.f14636a.hashCode();
    }

    public final String toString() {
        return this.f14637a.f14636a.toString();
    }
}
