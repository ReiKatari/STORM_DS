package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k10  reason: default package */
/* loaded from: classes.dex */
public final class k10 {
    public final Context a;

    public k10(Context context) {
        this.a = context;
    }

    public final File a(n00 n00Var) {
        File externalCacheDir = this.a.getExternalCacheDir();
        if (externalCacheDir != null) {
            File file = new File(externalCacheDir, "background_thumbnails");
            if (file.isDirectory() || file.mkdirs()) {
                return new File(file, String.valueOf(n00Var.a));
            }
            return null;
        }
        return null;
    }
}
