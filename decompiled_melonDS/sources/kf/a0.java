package kf;

import android.content.Context;
import java.io.File;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8136a;

    public a0(Context context) {
        this.f8136a = context;
    }

    public final File a(oe.a aVar) {
        File externalCacheDir = this.f8136a.getExternalCacheDir();
        if (externalCacheDir != null) {
            File file = new File(externalCacheDir, "background_thumbnails");
            if (file.isDirectory() || file.mkdirs()) {
                return new File(file, String.valueOf(aVar.f10905a));
            }
            return null;
        }
        return null;
    }
}
