package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l06  reason: default package */
/* loaded from: classes.dex */
public final class l06 {
    public final Context a;
    public final kd6 b;
    public final uh7 c;

    public l06(Context context, kd6 kd6Var, uh7 uh7Var) {
        kd6Var.getClass();
        uh7Var.getClass();
        this.a = context;
        this.b = kd6Var;
        this.c = uh7Var;
    }

    public final zl1 a(pq5 pq5Var) {
        Uri u = ((ng6) this.b).u(pq5Var);
        zl1 b = this.c.b(u);
        if (b != null) {
            return b;
        }
        i.m(xg6.n(u, "Could not open save directory: "));
        return null;
    }

    public final void b(pq5 pq5Var, Uri uri) {
        pq5Var.getClass();
        uri.getClass();
        if (c(uri)) {
            zl1 a = a(pq5Var);
            String g = g(pq5Var);
            zl1 f = a.f(g);
            if (f == null && (f = a.c("application/octet-stream", g)) == null && (f = a.f(g)) == null) {
                i.m(xg6.n(a.j(), "Could not create save file at "));
                return;
            }
            Uri j = f.j();
            j.getClass();
            if (uri.equals(j)) {
                return;
            }
            InputStream d = d(uri);
            try {
                OutputStream e = e(j);
                f04.w(d, e);
                e.close();
                d.close();
            } finally {
            }
        } else {
            i.h("Selected file is not a plausible DS save file");
        }
    }

    public final boolean c(Uri uri) {
        uri.getClass();
        Long l = null;
        if (nb3.k(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                l = Long.valueOf(new File(path).length());
            }
        } else {
            AssetFileDescriptor openAssetFileDescriptor = this.a.getContentResolver().openAssetFileDescriptor(uri, "r");
            if (openAssetFileDescriptor != null) {
                try {
                    long length = openAssetFileDescriptor.getLength();
                    Long valueOf = Long.valueOf(length);
                    if (length >= 0) {
                        l = valueOf;
                    }
                    openAssetFileDescriptor.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ge7.t(openAssetFileDescriptor, th);
                        throw th2;
                    }
                }
            }
        }
        if (l != null) {
            long longValue = l.longValue();
            if (1 <= longValue && longValue < 67108865) {
                return true;
            }
        } else {
            InputStream d = d(uri);
            try {
                byte[] bArr = new byte[8192];
                long j = 0;
                do {
                    int read = d.read(bArr);
                    if (read < 0) {
                        d.close();
                        if (j > 0) {
                            return true;
                        }
                    } else {
                        j += read;
                    }
                } while (j <= 67108864);
                d.close();
                return false;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    ge7.t(d, th3);
                    throw th4;
                }
            }
        }
        return false;
    }

    public final InputStream d(Uri uri) {
        if (nb3.k(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new FileInputStream(new File(path));
            }
            i.m(xg6.n(uri, "Invalid file URI: "));
            return null;
        }
        InputStream openInputStream = this.a.getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            return openInputStream;
        }
        i.m(xg6.n(uri, "Could not open input stream: "));
        return null;
    }

    public final OutputStream e(Uri uri) {
        if (nb3.k(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new FileOutputStream(new File(path), false);
            }
            i.m(xg6.n(uri, "Invalid file URI: "));
            return null;
        }
        OutputStream openOutputStream = this.a.getContentResolver().openOutputStream(uri, "wt");
        if (openOutputStream != null) {
            return openOutputStream;
        }
        i.m(xg6.n(uri, "Could not open output stream: "));
        return null;
    }

    public final k06 f(pq5 pq5Var) {
        String substring;
        pq5Var.getClass();
        zl1 f = a(pq5Var).f(g(pq5Var));
        if (f == null) {
            return null;
        }
        Uri j = f.j();
        j.getClass();
        String i = f.i();
        if (i == null) {
            i = g(pq5Var);
        }
        Context context = this.a;
        File file = new File(context.getCacheDir(), "shared_saves");
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        File file2 = new File(file, i);
        InputStream d = d(j);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
            f04.w(d, fileOutputStream);
            fileOutputStream.close();
            d.close();
            ab2 c = FileProvider.c(context, context.getPackageName() + ".fileprovider");
            try {
                String canonicalPath = file2.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : c.b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (FileProvider.a(canonicalPath).startsWith(FileProvider.a(path).concat("/")) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = ((File) entry.getValue()).getPath();
                    if (path2.endsWith("/")) {
                        substring = canonicalPath.substring(path2.length());
                    } else {
                        substring = canonicalPath.substring(path2.length() + 1);
                    }
                    Uri build = new Uri.Builder().scheme("content").authority(c.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
                    build.getClass();
                    return new k06(build, i);
                }
                i.h(i61.m("Failed to find configured root that contains ", canonicalPath));
                return null;
            } catch (IOException unused) {
                e41.w(file2, "Failed to resolve canonical path for ");
                return null;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ge7.t(d, th);
                throw th2;
            }
        }
    }

    public final String g(pq5 pq5Var) {
        String i;
        String str;
        zl1 a = this.c.a(pq5Var.d);
        if (a != null && (i = a.i()) != null) {
            if (((ng6) this.b).b.getBoolean("save_file_use_srm_extension", false)) {
                str = "srm";
            } else {
                str = "sav";
            }
            return qs6.F0(i, str, i + "." + str);
        }
        i.m(xg6.n(pq5Var.d, "Could not determine ROM file name: "));
        return null;
    }
}
