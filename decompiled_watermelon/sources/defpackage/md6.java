package defpackage;

import android.net.Uri;
import java.io.File;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: md6  reason: default package */
/* loaded from: classes.dex */
public final class md6 implements w37 {
    @Override // defpackage.w37
    public final uh1 a(Uri uri) {
        uri.getClass();
        String path = uri.getPath();
        if (path != null) {
            return new i45(new File(path));
        }
        return null;
    }

    @Override // defpackage.w37
    public final uh1 b(Uri uri) {
        uri.getClass();
        return a(uri);
    }

    @Override // defpackage.w37
    public final uh1 c(Uri uri) {
        String path = uri.getPath();
        if (path != null) {
            File file = new File(path);
            String name = file.getName();
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                return new i45(parentFile).c("*/*", name);
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.w37
    public final boolean d(Uri uri) {
        String path = uri.getPath();
        if (path != null) {
            return new File(path).isFile();
        }
        return false;
    }
}
