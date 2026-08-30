package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tz  reason: default package */
/* loaded from: classes.dex */
public final class tz {
    public final Context a;

    public tz(Context context) {
        this.a = context;
    }

    public final File a(vy vyVar) {
        File externalCacheDir = this.a.getExternalCacheDir();
        if (externalCacheDir != null) {
            File file = new File(externalCacheDir, "background_thumbnails");
            if (file.isDirectory() || file.mkdirs()) {
                return new File(file, String.valueOf(vyVar.a));
            }
            return null;
        }
        return null;
    }
}
