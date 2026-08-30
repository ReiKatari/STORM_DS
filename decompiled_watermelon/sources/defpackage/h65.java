package defpackage;

import android.database.Observable;
import androidx.preference.Preference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h65  reason: default package */
/* loaded from: classes.dex */
public final class h65 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((i65) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i, int i2, Preference preference) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((i65) ((Observable) this).mObservers.get(size)).b(i, i2, preference);
        }
    }
}
