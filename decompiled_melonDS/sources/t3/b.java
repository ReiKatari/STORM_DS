package t3;

import android.view.KeyEvent;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final KeyEvent f13107a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            if (!k.a(this.f13107a, ((b) obj).f13107a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13107a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f13107a + ')';
    }
}
