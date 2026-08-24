package defpackage;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vd5  reason: default package */
/* loaded from: classes.dex */
public final class vd5 extends zl1 {
    public final File a;

    public vd5(File file) {
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

    @Override // defpackage.zl1
    public final boolean a() {
        return this.a.canRead();
    }

    @Override // defpackage.zl1
    public final zl1 b(String str) {
        File file = new File(this.a, str);
        if (!file.isDirectory() && !file.mkdir()) {
            return null;
        }
        return new vd5(file);
    }

    @Override // defpackage.zl1
    public final zl1 c(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = lb1.m(str2, ".", extensionFromMimeType);
        }
        File file = new File(this.a, str2);
        try {
            if (!file.createNewFile()) {
                return null;
            }
            return new vd5(file);
        } catch (IOException e) {
            Log.w("DocumentFile", "Failed to createFile: " + e);
            return null;
        }
    }

    @Override // defpackage.zl1
    public final boolean d() {
        File file = this.a;
        p(file);
        return file.delete();
    }

    @Override // defpackage.zl1
    public final boolean e() {
        return this.a.exists();
    }

    @Override // defpackage.zl1
    public final String i() {
        return this.a.getName();
    }

    @Override // defpackage.zl1
    public final Uri j() {
        return Uri.fromFile(this.a);
    }

    @Override // defpackage.zl1
    public final boolean k() {
        return this.a.isDirectory();
    }

    @Override // defpackage.zl1
    public final boolean l() {
        return this.a.isFile();
    }

    @Override // defpackage.zl1
    public final long m() {
        return this.a.lastModified();
    }

    @Override // defpackage.zl1
    public final long n() {
        return this.a.length();
    }

    @Override // defpackage.zl1
    public final zl1[] o() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.a.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                arrayList.add(new vd5(file));
            }
        }
        return (zl1[]) arrayList.toArray(new zl1[0]);
    }
}
