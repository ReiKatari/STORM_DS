package k6;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final File f7984a;

    public b(File file) {
        this.f7984a = file;
    }

    public static boolean l(File file) {
        File[] listFiles = file.listFiles();
        boolean z10 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z10 &= l(file2);
                }
                if (!file2.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file2);
                    z10 = false;
                }
            }
        }
        return z10;
    }

    @Override // k6.a
    public final a a(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + "." + extensionFromMimeType;
        }
        File file = new File(this.f7984a, str2);
        try {
            if (!file.createNewFile()) {
                return null;
            }
            return new b(file);
        } catch (IOException e6) {
            Log.w("DocumentFile", "Failed to createFile: " + e6);
            return null;
        }
    }

    @Override // k6.a
    public final boolean b() {
        File file = this.f7984a;
        l(file);
        return file.delete();
    }

    @Override // k6.a
    public final String f() {
        return this.f7984a.getName();
    }

    @Override // k6.a
    public final Uri g() {
        return Uri.fromFile(this.f7984a);
    }

    @Override // k6.a
    public final boolean h() {
        return this.f7984a.isDirectory();
    }

    @Override // k6.a
    public final boolean i() {
        return this.f7984a.isFile();
    }

    @Override // k6.a
    public final long j() {
        return this.f7984a.lastModified();
    }

    @Override // k6.a
    public final a[] k() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.f7984a.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                arrayList.add(new b(file));
            }
        }
        return (a[]) arrayList.toArray(new a[0]);
    }
}
