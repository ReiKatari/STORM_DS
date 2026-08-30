package defpackage;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i45  reason: default package */
/* loaded from: classes.dex */
public final class i45 extends uh1 {
    public final File a;

    public i45(File file) {
        this.a = file;
    }

    public static boolean p(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= p(file2);
                }
                if (!file2.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file2);
                    z = false;
                }
            }
        }
        return z;
    }

    @Override // defpackage.uh1
    public final boolean a() {
        return this.a.canRead();
    }

    @Override // defpackage.uh1
    public final uh1 b(String str) {
        File file = new File(this.a, str);
        if (!file.isDirectory() && !file.mkdir()) {
            return null;
        }
        return new i45(file);
    }

    @Override // defpackage.uh1
    public final uh1 c(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = wh1.l(str2, ".", extensionFromMimeType);
        }
        File file = new File(this.a, str2);
        try {
            if (!file.createNewFile()) {
                return null;
            }
            return new i45(file);
        } catch (IOException e) {
            Log.w("DocumentFile", "Failed to createFile: " + e);
            return null;
        }
    }

    @Override // defpackage.uh1
    public final boolean d() {
        File file = this.a;
        p(file);
        return file.delete();
    }

    @Override // defpackage.uh1
    public final boolean e() {
        return this.a.exists();
    }

    @Override // defpackage.uh1
    public final String i() {
        return this.a.getName();
    }

    @Override // defpackage.uh1
    public final Uri j() {
        return Uri.fromFile(this.a);
    }

    @Override // defpackage.uh1
    public final boolean k() {
        return this.a.isDirectory();
    }

    @Override // defpackage.uh1
    public final boolean l() {
        return this.a.isFile();
    }

    @Override // defpackage.uh1
    public final long m() {
        return this.a.lastModified();
    }

    @Override // defpackage.uh1
    public final long n() {
        return this.a.length();
    }

    @Override // defpackage.uh1
    public final uh1[] o() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.a.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                arrayList.add(new i45(file));
            }
        }
        return (uh1[]) arrayList.toArray(new uh1[0]);
    }
}
