package kf;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8177a;

    /* renamed from: b  reason: collision with root package name */
    public final cf.d f8178b;

    /* renamed from: c  reason: collision with root package name */
    public final bd.h f8179c = ij.a.s(-1, 6, null);

    public d1(Context context, cf.d dVar) {
        this.f8177a = context;
        this.f8178b = dVar;
    }

    public final void a(ze.a aVar, zd.b bVar) {
        File file;
        boolean z10;
        aVar.getClass();
        ij.i iVar = (ij.i) bVar.f15044a;
        File externalCacheDir = this.f8177a.getExternalCacheDir();
        if (externalCacheDir != null) {
            file = new File(externalCacheDir, "extracted_roms");
        } else {
            file = null;
        }
        if (file != null && (file.isDirectory() || file.mkdirs())) {
            File file2 = new File(file, "temp");
            try {
                c((oe.k0) iVar.B);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                cc.c cVar = ((cc.i) bVar.f15045b).A;
                byte[] bArr = new byte[8192];
                do {
                    z10 = false;
                    try {
                        int read = iVar.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (IOException unused) {
                    }
                } while (zc.x.s(cVar.g()));
                z10 = zc.x.s(cVar.g());
                if (z10) {
                    file2.renameTo(new File(file, String.valueOf(aVar.f15056d.hashCode())));
                    this.f8179c.a(yb.y.f14813a);
                } else {
                    file2.delete();
                }
                fileOutputStream.close();
                return;
            } catch (Exception e6) {
                file2.delete();
                throw e6;
            }
        }
        throw new Exception("Failed to create ROM cache directory");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [oe.o0, oe.k0] */
    public final oe.k0 b() {
        File file;
        File[] listFiles;
        File externalCacheDir = this.f8177a.getExternalCacheDir();
        if (externalCacheDir != null) {
            file = new File(externalCacheDir, "extracted_roms");
        } else {
            file = null;
        }
        long j2 = 0;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                j2 += file2.length();
            }
        }
        return new oe.o0(j2);
    }

    public final void c(oe.k0 k0Var) {
        File file;
        Object[] listFiles;
        oe.k0 b10 = b();
        long pow = new oe.n0(128L).A * ((long) Math.pow(2.0d, ((d2) this.f8178b).f8181b.getInt("rom_cache_max_size", 3)));
        k0Var.getClass();
        long j2 = b10.A + k0Var.A;
        if (nc.k.c(j2, pow) > 0) {
            long j10 = j2 - pow;
            File externalCacheDir = this.f8177a.getExternalCacheDir();
            if (externalCacheDir != null) {
                file = new File(externalCacheDir, "extracted_roms");
            } else {
                file = null;
            }
            if (file != null && (listFiles = file.listFiles()) != null) {
                ah.b0 b0Var = new ah.b0(10);
                if (listFiles.length != 0) {
                    listFiles = Arrays.copyOf(listFiles, listFiles.length);
                    if (listFiles.length > 1) {
                        Arrays.sort(listFiles, b0Var);
                    }
                }
                List<File> asList = Arrays.asList(listFiles);
                asList.getClass();
                oe.o0 o0Var = new oe.o0(0L);
                for (File file2 : asList) {
                    long length = o0Var.A + file2.length();
                    oe.o0 o0Var2 = new oe.o0(length);
                    file2.delete();
                    if (nc.k.c(length, j10) < 0) {
                        o0Var = o0Var2;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final Uri d(ze.a aVar, boolean z10) {
        File file;
        aVar.getClass();
        String valueOf = String.valueOf(aVar.f15056d.hashCode());
        File externalCacheDir = this.f8177a.getExternalCacheDir();
        if (externalCacheDir != null) {
            file = new File(externalCacheDir, "extracted_roms");
        } else {
            file = null;
        }
        if (file != null && file.isDirectory()) {
            File file2 = new File(file, valueOf);
            if (file2.isFile()) {
                if (z10) {
                    file2.setLastModified(new Date().getTime());
                }
                return Uri.fromFile(file2);
            }
        }
        return null;
    }
}
