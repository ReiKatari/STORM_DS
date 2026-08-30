package defpackage;

import android.net.Uri;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ms4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ms4 implements z8, jj2 {
    public final /* synthetic */ StoragePickerPreference A;

    public ms4(StoragePickerPreference storagePickerPreference) {
        this.A = storagePickerPreference;
    }

    @Override // defpackage.jj2
    public final wi2 a() {
        return new lj2(1, this.A, StoragePickerPreference.class, "onDirectoryPicked", "onDirectoryPicked(Landroid/net/Uri;)V", 0, 0);
    }

    @Override // defpackage.z8
    public final void b(Object obj) {
        this.A.f((Uri) obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof z8) && (obj instanceof jj2)) {
            return a().equals(((jj2) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
