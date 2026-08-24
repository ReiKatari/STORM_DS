package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ud4  reason: default package */
/* loaded from: classes.dex */
public final class ud4 {
    public final Context a;
    public final kd6 b;
    public final v80 c = nb3.c(-1, null, null, 6);

    public ud4(Context context, kd6 kd6Var) {
        this.a = context;
        this.b = kd6Var;
    }

    public final void a(pq5 pq5Var, u63 u63Var) {
        File file;
        boolean z;
        pq5Var.getClass();
        ss0 ss0Var = (ss0) u63Var.B;
        File externalCacheDir = this.a.getExternalCacheDir();
        if (externalCacheDir != null) {
            file = new File(externalCacheDir, "extracted_roms");
        } else {
            file = null;
        }
        if (file != null && (file.isDirectory() || file.mkdirs())) {
            File file2 = new File(file, "temp");
            try {
                c((hj6) ss0Var.B);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                r41 r41Var = ((n36) u63Var.L).A;
                byte[] bArr = new byte[8192];
                do {
                    z = false;
                    try {
                        int read = ss0Var.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (IOException unused) {
                    }
                } while (yh2.z(r41Var.b()));
                z = yh2.z(r41Var.b());
                if (z) {
                    file2.renameTo(new File(file, String.valueOf(pq5Var.d.hashCode())));
                    this.c.c(jg7.a);
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

    /* JADX WARN: Type inference failed for: r6v3, types: [hj6, lj6] */
    public final hj6 b() {
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
        return new lj6(j);
    }

    public final void c(hj6 hj6Var) {
        File file;
        Object[] listFiles;
        hj6 b = b();
        long pow = 134217728 * ((long) Math.pow(2.0d, ((ng6) this.b).b.getInt("rom_cache_max_size", 3)));
        hj6Var.getClass();
        long j = b.A + hj6Var.A;
        if (nb3.q(j, pow) > 0) {
            long j2 = j - pow;
            File externalCacheDir = this.a.getExternalCacheDir();
            if (externalCacheDir != null) {
                file = new File(externalCacheDir, "extracted_roms");
            } else {
                file = null;
            }
            if (file != null && (listFiles = file.listFiles()) != null) {
                zh2 zh2Var = new zh2(24);
                if (listFiles.length != 0) {
                    listFiles = Arrays.copyOf(listFiles, listFiles.length);
                    if (listFiles.length > 1) {
                        Arrays.sort(listFiles, zh2Var);
                    }
                }
                List<File> asList = Arrays.asList(listFiles);
                asList.getClass();
                lj6 lj6Var = new lj6(0L);
                for (File file2 : asList) {
                    long length = lj6Var.A + file2.length();
                    lj6 lj6Var2 = new lj6(length);
                    file2.delete();
                    if (nb3.q(length, j2) < 0) {
                        lj6Var = lj6Var2;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final Uri d(pq5 pq5Var, boolean z) {
        File file;
        pq5Var.getClass();
        String valueOf = String.valueOf(pq5Var.d.hashCode());
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
