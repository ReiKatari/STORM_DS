package defpackage;

import android.net.Uri;
import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cp6  reason: default package */
/* loaded from: classes.dex */
public final class cp6 implements uh7 {
    @Override // defpackage.uh7
    public final zl1 a(Uri uri) {
        uri.getClass();
        String path = uri.getPath();
        if (path != null) {
            return new vd5(new File(path));
        }
        return null;
    }

    @Override // defpackage.uh7
    public final zl1 b(Uri uri) {
        uri.getClass();
        return a(uri);
    }

    @Override // defpackage.uh7
    public final zl1 c(Uri uri) {
        String path = uri.getPath();
        if (path != null) {
            File file = new File(path);
            String name = file.getName();
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                return new vd5(parentFile).c("*/*", name);
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.uh7
    public final boolean d(Uri uri) {
        String path = uri.getPath();
        if (path != null) {
            return new File(path).isFile();
        }
        return false;
    }
}
