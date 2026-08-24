package defpackage;

import android.net.Uri;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o15  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o15 implements a9, no2 {
    public final /* synthetic */ StoragePickerPreference A;

    public o15(StoragePickerPreference storagePickerPreference) {
        this.A = storagePickerPreference;
    }

    @Override // defpackage.a9
    public final void a(Object obj) {
        this.A.f((Uri) obj);
    }

    @Override // defpackage.no2
    public final ao2 b() {
        return new po2(1, this.A, StoragePickerPreference.class, "onDirectoryPicked", "onDirectoryPicked(Landroid/net/Uri;)V", 0, 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a9) && (obj instanceof no2)) {
            return b().equals(((no2) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
