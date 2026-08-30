package ci;

import android.net.Uri;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements h.b, nc.g {
    public final /* synthetic */ StoragePickerPreference A;

    public j(StoragePickerPreference storagePickerPreference) {
        this.A = storagePickerPreference;
    }

    @Override // h.b
    public final void a(Object obj) {
        this.A.f((Uri) obj);
    }

    @Override // nc.g
    public final yb.d b() {
        return new nc.i(1, this.A, StoragePickerPreference.class, "onDirectoryPicked", "onDirectoryPicked(Landroid/net/Uri;)V", 0, 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof h.b) && (obj instanceof nc.g)) {
            return b().equals(((nc.g) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
