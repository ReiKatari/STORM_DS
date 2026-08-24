package defpackage;

import android.content.Context;
import com.google.mlkit.common.MlKitException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m40  reason: default package */
/* loaded from: classes.dex */
public final class m40 {
    public static final List c = hf.c0("https://github.com/ReiKatari/STORM_DS_TOOLS/releases/download/0.0.1/Nintendo_DS.zip", "https://raw.githubusercontent.com/archeader/melonDS-android/main/bios/ds_bios.zip", "https://cdn.jsdelivr.net/gh/archeader/melonDS-android@main/bios/ds_bios.zip", "https://github.com/melonds-emu/melonDS/releases/download/bios/nds_bios.zip", "https://archive.org/download/nds_bios_firmware/nds_bios_firmware.zip");
    public static final List d = hf.c0("https://github.com/ReiKatari/STORM_DS_TOOLS/releases/download/0.0.1/Nintendo_DSi.zip", "https://raw.githubusercontent.com/archeader/melonDS-android/main/bios/dsi_bios.zip", "https://cdn.jsdelivr.net/gh/archeader/melonDS-android@main/bios/dsi_bios.zip", "https://github.com/melonds-emu/melonDS/releases/download/bios/dsi_bios.zip", "https://archive.org/download/nds_bios_firmware/nds_bios_firmware.zip");
    public final Context a;
    public final kd6 b;

    public m40(Context context, kd6 kd6Var) {
        kd6Var.getClass();
        this.a = context;
        this.b = kd6Var;
    }

    public static final void a(m40 m40Var, String str, File file, qn2 qn2Var) {
        int i = 0;
        while (i < 10) {
            URL url = new URL(str);
            URLConnection openConnection = url.openConnection();
            openConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setConnectTimeout(20000);
            httpURLConnection.setReadTimeout(45000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 14; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Mobile Safari/537.36");
            httpURLConnection.setRequestProperty("Accept", "*/*");
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (hf.c0(Integer.valueOf((int) MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE), 302, 303, 307, 308).contains(Integer.valueOf(responseCode))) {
                String headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null && !qs6.v0(headerField)) {
                    if (!xs6.g0(headerField, "http://", false) && !xs6.g0(headerField, "https://", false)) {
                        str = new URL(url, headerField).toString();
                        str.getClass();
                    } else {
                        str = headerField;
                    }
                    i++;
                } else {
                    e41.i(lb1.k("HTTP redirect ", responseCode, " with missing Location header"));
                    return;
                }
            } else if (200 <= responseCode && responseCode < 300) {
                int contentLength = httpURLConnection.getContentLength();
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[8192];
                    int i2 = 0;
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                            i2 += read;
                            if (contentLength > 0) {
                                qn2Var.g(Integer.valueOf(gi2.q((int) ((i2 / contentLength) * 100.0d), 0, 100)));
                            }
                        } else {
                            fileOutputStream.close();
                            inputStream.close();
                            return;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ge7.t(inputStream, th);
                        throw th2;
                    }
                }
            } else {
                httpURLConnection.disconnect();
                e41.i(lb1.g(responseCode, "HTTP error "));
                return;
            }
        }
        e41.i(lb1.k("Too many redirects (", i, ")"));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008f A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #5 {all -> 0x001e, blocks: (B:3:0x0005, B:6:0x0017, B:4:0x0011, B:11:0x0021, B:13:0x0040, B:16:0x0049, B:18:0x0051, B:21:0x005a, B:23:0x0062, B:27:0x006d, B:29:0x0075, B:40:0x008f, B:42:0x009c, B:49:0x00a7, B:41:0x0099), top: B:61:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(m40 m40Var, File file, File file2, boolean z) {
        String str;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(fileInputStream, 8192));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    fileInputStream.close();
                    return;
                }
                String name = nextEntry.getName();
                name.getClass();
                String lowerCase = qs6.O0('/', name, name).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (!qs6.j0(lowerCase, "bios7", false) && !qs6.j0(lowerCase, "arm7", false)) {
                    if (!qs6.j0(lowerCase, "bios9", false) && !qs6.j0(lowerCase, "arm9", false)) {
                        if (!qs6.j0(lowerCase, "firmware", false) && !qs6.j0(lowerCase, "bios.bin", false)) {
                            if (!z || (!qs6.j0(lowerCase, "nand", false) && !xs6.Y(lowerCase, ".nand", false))) {
                                str = null;
                                if (str != null) {
                                    FileOutputStream fileOutputStream = new FileOutputStream(new File(file2, str));
                                    f04.w(zipInputStream, fileOutputStream);
                                    fileOutputStream.close();
                                }
                                zipInputStream.closeEntry();
                            }
                            str = "nand.bin";
                            if (str != null) {
                            }
                            zipInputStream.closeEntry();
                        }
                        str = "firmware.bin";
                        if (str != null) {
                        }
                        zipInputStream.closeEntry();
                    }
                    str = "bios9.bin";
                    if (str != null) {
                    }
                    zipInputStream.closeEntry();
                }
                str = "bios7.bin";
                if (str != null) {
                }
                zipInputStream.closeEntry();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ge7.t(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final boolean c(m40 m40Var, File file) {
        File file2 = new File(file, "bios7.bin");
        File file3 = new File(file, "bios9.bin");
        File file4 = new File(file, "firmware.bin");
        if (file2.exists() && file2.length() >= 16384 && file3.exists() && file3.length() >= 4096 && file4.exists() && file4.length() >= 131072) {
            return true;
        }
        return false;
    }

    public static final boolean d(m40 m40Var, File file) {
        File file2 = new File(file, "bios7.bin");
        File file3 = new File(file, "bios9.bin");
        File file4 = new File(file, "firmware.bin");
        File file5 = new File(file, "nand.bin");
        if (file2.exists() && file2.length() >= 65536 && file3.exists() && file3.length() >= 65536 && file4.exists() && file4.length() >= 131072 && file5.exists() && file5.length() >= 1048576) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file5, "r");
                long length = randomAccessFile.length();
                boolean z = true;
                if (length >= 64) {
                    randomAccessFile.seek(length - 64);
                    byte[] bArr = new byte[16];
                    randomAccessFile.readFully(bArr);
                    if (xs6.g0(new String(bArr, qm0.d), "DSi eMMC CID/CPU", false)) {
                        randomAccessFile.close();
                        return z;
                    }
                }
                if (length >= 1046544) {
                    randomAccessFile.seek(1046528L);
                    byte[] bArr2 = new byte[16];
                    randomAccessFile.readFully(bArr2);
                    if (xs6.g0(new String(bArr2, qm0.d), "DSi eMMC CID/CPU", false)) {
                        randomAccessFile.close();
                        return z;
                    }
                }
                randomAccessFile.seek(0L);
                byte[] bArr3 = new byte[512];
                randomAccessFile.readFully(bArr3);
                int i = 0;
                while (true) {
                    if (i < 512) {
                        if (bArr3[i] != 0) {
                            break;
                        }
                        i++;
                    } else {
                        z = false;
                        break;
                    }
                }
                randomAccessFile.close();
                return z;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(i81 i81Var, s41 s41Var) {
        j40 j40Var;
        int i;
        if (s41Var instanceof j40) {
            j40Var = (j40) s41Var;
            int i2 = j40Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j40Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = j40Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = j40Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    xe1 xe1Var = xk1.a;
                    de1 de1Var = de1.L;
                    k40 k40Var = new k40(this, i81Var, null, 0);
                    j40Var.Y = 1;
                    obj = hv.d0(de1Var, k40Var, j40Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                return ((hm5) obj).A;
            }
        }
        j40Var = new j40(this, s41Var);
        Object obj2 = j40Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = j40Var.Y;
        if (i == 0) {
        }
        return ((hm5) obj2).A;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(i81 i81Var, s41 s41Var) {
        l40 l40Var;
        int i;
        if (s41Var instanceof l40) {
            l40Var = (l40) s41Var;
            int i2 = l40Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l40Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = l40Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = l40Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    xe1 xe1Var = xk1.a;
                    de1 de1Var = de1.L;
                    k40 k40Var = new k40(this, i81Var, null, 1);
                    l40Var.Y = 1;
                    obj = hv.d0(de1Var, k40Var, l40Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                return ((hm5) obj).A;
            }
        }
        l40Var = new l40(this, s41Var);
        Object obj2 = l40Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = l40Var.Y;
        if (i == 0) {
        }
        return ((hm5) obj2).A;
    }
}
