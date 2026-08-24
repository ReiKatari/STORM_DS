package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.github.junrar.unpack.vm.VMCmdFlags;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k40  reason: default package */
/* loaded from: classes.dex */
public final class k40 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ m40 Y;
    public final /* synthetic */ qn2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k40(m40 m40Var, qn2 qn2Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = m40Var;
        this.Z = qn2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((k40) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((k40) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        qn2 qn2Var = this.Z;
        m40 m40Var = this.Y;
        switch (i) {
            case 0:
                return new k40(m40Var, qn2Var, r41Var, 0);
            default:
                return new k40(m40Var, qn2Var, r41Var, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c1  */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        boolean z;
        Exception exc;
        Object obj2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Exception exc2;
        Object obj3;
        int i = this.X;
        m40 m40Var = this.Y;
        qn2 qn2Var = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                kd6 kd6Var = m40Var.b;
                Context context = m40Var.a;
                File file = new File(context.getFilesDir(), "bios/ds");
                file.mkdirs();
                File file2 = new File(context.getCacheDir(), lb1.i(System.currentTimeMillis(), "temp_ds_bios_", ".zip"));
                Iterator it = m40.c.iterator();
                Exception exc3 = null;
                while (true) {
                    if (it.hasNext()) {
                        try {
                            m40.a(m40Var, (String) it.next(), file2, qn2Var);
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            m40.b(m40Var, file2, file, false);
                        } catch (Throwable th2) {
                            th = th2;
                            exc3 = th;
                            file2.delete();
                        }
                        if (m40.c(m40Var, file)) {
                            file2.delete();
                            z = true;
                        } else {
                            file2.delete();
                        }
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    try {
                        for (String str : hf.c0("bios7.bin", "bios9.bin", "firmware.bin")) {
                            InputStream open = context.getAssets().open("bios/ds/" + str);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, str));
                            try {
                                open.getClass();
                                f04.w(open, fileOutputStream);
                                fileOutputStream.close();
                                open.close();
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        }
                        if (m40.c(m40Var, file)) {
                            z = true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (z && m40.c(m40Var, file)) {
                    qn2Var.g(new Integer(100));
                    Uri fromFile = Uri.fromFile(file);
                    fromFile.getClass();
                    ng6 ng6Var = (ng6) kd6Var;
                    ng6Var.getClass();
                    SharedPreferences.Editor edit = ng6Var.b.edit();
                    edit.putStringSet("bios_dir", ii2.R(fromFile.toString()));
                    edit.apply();
                    SharedPreferences.Editor edit2 = ((ng6) kd6Var).b.edit();
                    edit2.putBoolean("use_custom_bios", true);
                    edit2.apply();
                    obj2 = file;
                } else {
                    if (exc3 == null) {
                        exc = new Exception("Не удалось скачать файлы BIOS DS.");
                    } else {
                        exc = exc3;
                    }
                    obj2 = new em5(exc);
                }
                return new hm5(obj2);
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                kd6 kd6Var2 = m40Var.b;
                Context context2 = m40Var.a;
                File file3 = new File(context2.getFilesDir(), "bios/dsi");
                file3.mkdirs();
                File file4 = new File(context2.getCacheDir(), lb1.i(System.currentTimeMillis(), "temp_dsi_bios_", ".zip"));
                Iterator it2 = m40.d.iterator();
                Exception exc4 = null;
                while (true) {
                    if (it2.hasNext()) {
                        try {
                            m40.a(m40Var, (String) it2.next(), file4, qn2Var);
                            m40.b(m40Var, file4, file3, true);
                        } catch (Throwable th3) {
                            exc4 = th3;
                        }
                        if (m40.d(m40Var, file3)) {
                            file4.delete();
                            z2 = true;
                        } else {
                            file4.delete();
                        }
                    } else {
                        z2 = false;
                    }
                }
                if (!z2) {
                    try {
                        for (String str2 : hf.c0("bios7.bin", "bios9.bin", "firmware.bin")) {
                            InputStream open2 = context2.getAssets().open("bios/dsi/" + str2);
                            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file3, str2));
                            try {
                                open2.getClass();
                                f04.w(open2, fileOutputStream2);
                                fileOutputStream2.close();
                                open2.close();
                            } finally {
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                    if (!m40.d(m40Var, file3)) {
                        File file5 = new File(file3, "nand.bin");
                        if (!file5.exists() || !m40.d(m40Var, file3)) {
                            try {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(file5, "rw");
                                try {
                                    try {
                                        randomAccessFile.setLength(251658240L);
                                        byte[] bArr = new byte[512];
                                        bArr[446] = Byte.MIN_VALUE;
                                        bArr[450] = 6;
                                        bArr[454] = 0;
                                        bArr[455] = 8;
                                        bArr[456] = 0;
                                        bArr[457] = 0;
                                        bArr[458] = 0;
                                        bArr[459] = 0;
                                        bArr[460] = 6;
                                        bArr[461] = 0;
                                        bArr[510] = 85;
                                        bArr[511] = -86;
                                        z3 = z2;
                                        try {
                                            randomAccessFile.seek(0L);
                                            randomAccessFile.write(bArr);
                                            byte[] bArr2 = new byte[512];
                                            bArr2[0] = -21;
                                            bArr2[1] = 60;
                                            bArr2[2] = -112;
                                            Charset charset = qm0.d;
                                            byte[] bytes = "MSDOS5.0".getBytes(charset);
                                            bytes.getClass();
                                            System.arraycopy(bytes, 0, bArr2, 3, 8);
                                            bArr2[11] = 0;
                                            bArr2[12] = 2;
                                            bArr2[13] = 8;
                                            bArr2[14] = 4;
                                            bArr2[15] = 0;
                                            bArr2[16] = 2;
                                            bArr2[17] = 0;
                                            bArr2[18] = 2;
                                            bArr2[21] = -8;
                                            bArr2[22] = 0;
                                            bArr2[23] = 1;
                                            bArr2[24] = VMCmdFlags.VMCF_USEFLAGS;
                                            bArr2[25] = 0;
                                            bArr2[26] = VMCmdFlags.VMCF_CHFLAGS;
                                            bArr2[27] = 0;
                                            bArr2[28] = 0;
                                            bArr2[29] = 8;
                                            bArr2[30] = 0;
                                            bArr2[31] = 0;
                                            bArr2[32] = 0;
                                            bArr2[33] = 0;
                                            bArr2[34] = 6;
                                            bArr2[35] = 0;
                                            bArr2[38] = 41;
                                            byte[] bytes2 = "DSi NAND   ".getBytes(charset);
                                            bytes2.getClass();
                                            z4 = true;
                                            try {
                                                System.arraycopy(bytes2, 0, bArr2, 43, 11);
                                                byte[] bytes3 = "FAT16   ".getBytes(charset);
                                                bytes3.getClass();
                                                System.arraycopy(bytes3, 0, bArr2, 54, 8);
                                                bArr2[510] = 85;
                                                bArr2[511] = -86;
                                                randomAccessFile.seek(1048576L);
                                                randomAccessFile.write(bArr2);
                                                byte[] bArr3 = {-8, -1, -1, -1};
                                                randomAccessFile.seek(1050624L);
                                                randomAccessFile.write(bArr3);
                                                randomAccessFile.seek(1181696L);
                                                randomAccessFile.write(bArr3);
                                                byte[] bArr4 = new byte[64];
                                                byte[] bytes4 = "DSi eMMC CID/CPU".getBytes(charset);
                                                bytes4.getClass();
                                                System.arraycopy(bytes4, 0, bArr4, 0, bytes4.length);
                                                System.arraycopy(new byte[]{21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, 0, bArr4, 16, 16);
                                                bArr4[32] = 1;
                                                bArr4[36] = 1;
                                                randomAccessFile.seek(1046528L);
                                                randomAccessFile.write(bArr4);
                                                randomAccessFile.seek(251658176L);
                                                randomAccessFile.write(bArr4);
                                                randomAccessFile.close();
                                            } catch (Throwable th4) {
                                                th = th4;
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            throw th;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                } catch (Throwable unused3) {
                                }
                            } catch (Throwable unused4) {
                            }
                            if (m40.d(m40Var, file3)) {
                                z5 = z4;
                                if (!z5 && m40.d(m40Var, file3)) {
                                    qn2Var.g(new Integer(100));
                                    Uri fromFile2 = Uri.fromFile(file3);
                                    fromFile2.getClass();
                                    ng6 ng6Var2 = (ng6) kd6Var2;
                                    ng6Var2.getClass();
                                    SharedPreferences.Editor edit3 = ng6Var2.b.edit();
                                    edit3.putStringSet("dsi_bios_dir", ii2.R(fromFile2.toString()));
                                    edit3.apply();
                                    SharedPreferences.Editor edit4 = ((ng6) kd6Var2).b.edit();
                                    edit4.putBoolean("use_custom_bios", z4);
                                    edit4.apply();
                                    obj3 = file3;
                                } else {
                                    if (exc4 != null) {
                                        exc2 = new Exception("Не удалось скачать файлы BIOS DSi и образ NAND.");
                                    } else {
                                        exc2 = exc4;
                                    }
                                    obj3 = new em5(exc2);
                                }
                                return new hm5(obj3);
                            }
                        }
                    }
                    z3 = z2;
                    z4 = true;
                    if (m40.d(m40Var, file3)) {
                    }
                } else {
                    z3 = z2;
                    z4 = true;
                }
                z5 = z3;
                if (!z5) {
                }
                if (exc4 != null) {
                }
                obj3 = new em5(exc2);
                return new hm5(obj3);
        }
    }
}
