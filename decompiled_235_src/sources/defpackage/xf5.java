package defpackage;

import android.database.Observable;
import androidx.preference.Preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xf5  reason: default package */
/* loaded from: classes.dex */
public final class xf5 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((yf5) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i, int i2, Preference preference) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((yf5) ((Observable) this).mObservers.get(size)).b(preference, i, i2);
        }
    }
}
