package be;

import android.net.Uri;
import java.io.File;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements c {
    @Override // be.c
    public final k6.a a(Uri uri) {
        uri.getClass();
        String path = uri.getPath();
        if (path != null) {
            return new k6.b(new File(path));
        }
        return null;
    }

    @Override // be.c
    public final k6.a b(Uri uri) {
        uri.getClass();
        return a(uri);
    }

    @Override // be.c
    public final k6.a c(Uri uri) {
        uri.getClass();
        String path = uri.getPath();
        if (path != null) {
            File file = new File(path);
            String name = file.getName();
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                return new k6.b(parentFile).a("*/*", name);
            }
            return null;
        }
        return null;
    }

    @Override // be.c
    public final boolean d(Uri uri) {
        uri.getClass();
        String path = uri.getPath();
        if (path != null) {
            return new File(path).isFile();
        }
        return false;
    }
}
