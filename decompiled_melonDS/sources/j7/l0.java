package j7;

import android.database.Observable;
import androidx.preference.Preference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((m0) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i2, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((m0) ((Observable) this).mObservers.get(size)).d(i2, i10);
        }
    }

    public final void d(int i2, int i10, Preference preference) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((m0) ((Observable) this).mObservers.get(size)).b(i2, i10, preference);
        }
    }

    public final void e(int i2, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((m0) ((Observable) this).mObservers.get(size)).c(i2, i10);
        }
    }

    public final void f(int i2, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((m0) ((Observable) this).mObservers.get(size)).e(i2, i10);
        }
    }
}
