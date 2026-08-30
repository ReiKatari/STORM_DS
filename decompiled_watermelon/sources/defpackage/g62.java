package defpackage;

import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g62  reason: default package */
/* loaded from: classes.dex */
public final class g62 {
    public final String a;
    public final HashMap b = new HashMap();

    public g62(String str) {
        this.a = str;
    }

    public final File a(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        if (indexOf != -1) {
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (FileProvider.a(canonicalFile.getPath()).startsWith(FileProvider.a(file.getPath()).concat("/"))) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    f81.x(file2, "Failed to resolve canonical path for ");
                    return null;
                }
            }
            i.i(wh1.i(uri, "Unable to find configured root for "));
            return null;
        }
        i.i(wh1.i(uri, "Unable to find path from root: "));
        return null;
    }
}
