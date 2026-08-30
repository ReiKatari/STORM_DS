package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o54  reason: default package */
/* loaded from: classes.dex */
public final class o54 {
    public final Context a;
    public final w16 b;
    public final q60 c = n40.f(-1, null, null, 6);

    public o54(Context context, w16 w16Var) {
        this.a = context;
        this.b = w16Var;
    }

    public final void a(rg5 rg5Var, q03 q03Var) {
        File file;
        boolean z;
        rg5Var.getClass();
        fq0 fq0Var = (fq0) q03Var.B;
        File externalCacheDir = this.a.getExternalCacheDir();
        if (externalCacheDir != null) {
            file = new File(externalCacheDir, "extracted_roms");
        } else {
            file = null;
        }
        if (file != null && (file.isDirectory() || file.mkdirs())) {
            File file2 = new File(file, "temp");
            try {
                c((s76) fq0Var.B);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                j11 j11Var = ((rs5) q03Var.L).A;
                byte[] bArr = new byte[8192];
                do {
                    z = false;
                    try {
                        int read = fq0Var.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (IOException unused) {
                    }
                } while (ln2.G(j11Var.a()));
                z = ln2.G(j11Var.a());
                if (z) {
                    file2.renameTo(new File(file, String.valueOf(rg5Var.d.hashCode())));
                    this.c.c(o27.a);
                } else {
                    file2.delete();
                }
                fileOutputStream.close();
                return;
            } catch (Exception e) {
                file2.delete();
                throw e;
            }
        }
        throw new Exception("Failed to create ROM cache directory");
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [s76, w76] */
    public final s76 b() {
        File file;
        File[] listFiles;
        File externalCacheDir = this.a.getExternalCacheDir();
        if (externalCacheDir != null) {
            file = new File(externalCacheDir, "extracted_roms");
        } else {
            file = null;
        }
        long j = 0;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                j += file2.length();
            }
        }
        return new w76(j);
    }

    public final void c(s76 s76Var) {
        File file;
        Object[] listFiles;
        s76 b = b();
        long pow = 134217728 * ((long) Math.pow(2.0d, ((b56) this.b).b.getInt("rom_cache_max_size", 3)));
        s76Var.getClass();
        long j = b.A + s76Var.A;
        if (b53.F(j, pow) > 0) {
            long j2 = j - pow;
            File externalCacheDir = this.a.getExternalCacheDir();
            if (externalCacheDir != null) {
                file = new File(externalCacheDir, "extracted_roms");
            } else {
                file = null;
            }
            if (file != null && (listFiles = file.listFiles()) != null) {
                hd2 hd2Var = new hd2(22);
                if (listFiles.length != 0) {
                    listFiles = Arrays.copyOf(listFiles, listFiles.length);
                    if (listFiles.length > 1) {
                        Arrays.sort(listFiles, hd2Var);
                    }
                }
                List<File> asList = Arrays.asList(listFiles);
                asList.getClass();
                w76 w76Var = new w76(0L);
                for (File file2 : asList) {
                    long length = w76Var.A + file2.length();
                    w76 w76Var2 = new w76(length);
                    file2.delete();
                    if (b53.F(length, j2) < 0) {
                        w76Var = w76Var2;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final Uri d(rg5 rg5Var, boolean z) {
        File file;
        rg5Var.getClass();
        String valueOf = String.valueOf(rg5Var.d.hashCode());
        File externalCacheDir = this.a.getExternalCacheDir();
        if (externalCacheDir != null) {
            file = new File(externalCacheDir, "extracted_roms");
        } else {
            file = null;
        }
        if (file != null && file.isDirectory()) {
            File file2 = new File(file, valueOf);
            if (file2.isFile()) {
                if (z) {
                    file2.setLastModified(new Date().getTime());
                }
                return Uri.fromFile(file2);
            }
        }
        return null;
    }
}
