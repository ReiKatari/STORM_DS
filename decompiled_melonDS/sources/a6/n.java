package a6;

import android.os.Build;
import android.view.DisplayCutout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f493a;

    public n(DisplayCutout displayCutout) {
        this.f493a = displayCutout;
    }

    public final q5.b a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return q5.b.d(l.f(this.f493a));
        }
        return q5.b.f12282e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            return this.f493a.equals(((n) obj).f493a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f493a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f493a + "}";
    }
}
