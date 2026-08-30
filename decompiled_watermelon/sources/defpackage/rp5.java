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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rp5  reason: default package */
/* loaded from: classes.dex */
public final class rp5 {
    public final Context a;
    public final w16 b;
    public final w37 c;

    public rp5(Context context, w16 w16Var, w37 w37Var) {
        w16Var.getClass();
        w37Var.getClass();
        this.a = context;
        this.b = w16Var;
        this.c = w37Var;
    }

    public final uh1 a(rg5 rg5Var) {
        Uri u = ((b56) this.b).u(rg5Var);
        uh1 b = this.c.b(u);
        if (b != null) {
            return b;
        }
        i.n(wh1.i(u, "Could not open save directory: "));
        return null;
    }

    public final void b(rg5 rg5Var, Uri uri) {
        rg5Var.getClass();
        uri.getClass();
        if (c(uri)) {
            uh1 a = a(rg5Var);
            String g = g(rg5Var);
            uh1 f = a.f(g);
            if (f == null && (f = a.c("application/octet-stream", g)) == null && (f = a.f(g)) == null) {
                i.n(wh1.i(a.j(), "Could not create save file at "));
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
                pu.o(d, e);
                e.close();
                d.close();
            } finally {
            }
        } else {
            i.i("Selected file is not a plausible DS save file");
        }
    }

    public final boolean c(Uri uri) {
        uri.getClass();
        Long l = null;
        if (b53.x(uri.getScheme(), "file")) {
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
                        dt3.W(openAssetFileDescriptor, th);
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
                    dt3.W(d, th3);
                    throw th4;
                }
            }
        }
        return false;
    }

    public final InputStream d(Uri uri) {
        if (b53.x(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new FileInputStream(new File(path));
            }
            i.n(wh1.i(uri, "Invalid file URI: "));
            return null;
        }
        InputStream openInputStream = this.a.getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            return openInputStream;
        }
        i.n(wh1.i(uri, "Could not open input stream: "));
        return null;
    }

    public final OutputStream e(Uri uri) {
        if (b53.x(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new FileOutputStream(new File(path), false);
            }
            i.n(wh1.i(uri, "Invalid file URI: "));
            return null;
        }
        OutputStream openOutputStream = this.a.getContentResolver().openOutputStream(uri, "wt");
        if (openOutputStream != null) {
            return openOutputStream;
        }
        i.n(wh1.i(uri, "Could not open output stream: "));
        return null;
    }

    public final qp5 f(rg5 rg5Var) {
        String substring;
        rg5Var.getClass();
        uh1 f = a(rg5Var).f(g(rg5Var));
        if (f == null) {
            return null;
        }
        Uri j = f.j();
        j.getClass();
        String i = f.i();
        if (i == null) {
            i = g(rg5Var);
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
            pu.o(d, fileOutputStream);
            fileOutputStream.close();
            d.close();
            g62 c = FileProvider.c(context, context.getPackageName() + ".fileprovider");
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
                    return new qp5(build, i);
                }
                i.i(b31.p("Failed to find configured root that contains ", canonicalPath));
                return null;
            } catch (IOException unused) {
                f81.x(file2, "Failed to resolve canonical path for ");
                return null;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                dt3.W(d, th);
                throw th2;
            }
        }
    }

    public final String g(rg5 rg5Var) {
        String i;
        String str;
        uh1 a = this.c.a(rg5Var.d);
        if (a != null && (i = a.i()) != null) {
            if (((b56) this.b).b.getBoolean("save_file_use_srm_extension", false)) {
                str = "srm";
            } else {
                str = "sav";
            }
            return zg6.L0(i, str, i + "." + str);
        }
        i.n(wh1.i(rg5Var.d, "Could not determine ROM file name: "));
        return null;
    }
}
