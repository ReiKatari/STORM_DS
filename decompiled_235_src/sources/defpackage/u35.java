package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u35  reason: default package */
/* loaded from: classes.dex */
public abstract class u35 {
    public static final w31 a = new w31(20);

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, Executor executor, t35 t35Var, boolean z) {
        boolean z2;
        ?? r7;
        ti1[] ti1VarArr;
        ti1[] ti1VarArr2;
        ti1[] ti1VarArr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ?? byteArrayOutputStream;
        qi1 qi1Var;
        String str;
        String str2;
        FileInputStream a2;
        boolean z9;
        boolean z10;
        boolean z11;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        long readLong = dataInputStream.readLong();
                        dataInputStream.close();
                        if (readLong == packageInfo.lastUpdateTime) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            t35Var.j(2, null);
                        }
                    } catch (IOException unused) {
                    }
                    if (z11) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        w35.c(context, false);
                        return;
                    }
                }
                z11 = false;
                if (z11) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = nb3.r;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            qi1 qi1Var2 = new qi1(assets, executor, t35Var, name, file2);
            byte[] bArr3 = (byte[]) qi1Var2.e;
            if (bArr3 == null) {
                qi1Var2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            } else {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        qi1Var2.b(4, null);
                    }
                    qi1Var2.b = true;
                    try {
                        r7 = qi1Var2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        t35Var.j(6, e);
                        r7 = 0;
                        if (r7 != 0) {
                        }
                        ti1VarArr2 = (ti1[]) qi1Var2.i;
                        if (ti1VarArr2 != null) {
                        }
                        t35 t35Var2 = (t35) qi1Var2.d;
                        ti1VarArr3 = (ti1[]) qi1Var2.i;
                        byte[] bArr4 = (byte[]) qi1Var2.e;
                        boolean z12 = r7;
                        z12 = r7;
                        if (ti1VarArr3 != null) {
                        }
                        bArr = (byte[]) qi1Var2.f;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                        if (!z6) {
                        }
                        z10 = false;
                        w35.c(context, z10);
                    } catch (IOException e2) {
                        t35Var.j(7, e2);
                        r7 = 0;
                        if (r7 != 0) {
                        }
                        ti1VarArr2 = (ti1[]) qi1Var2.i;
                        if (ti1VarArr2 != null) {
                        }
                        t35 t35Var22 = (t35) qi1Var2.d;
                        ti1VarArr3 = (ti1[]) qi1Var2.i;
                        byte[] bArr42 = (byte[]) qi1Var2.e;
                        boolean z122 = r7;
                        z122 = r7;
                        if (ti1VarArr3 != null) {
                        }
                        bArr = (byte[]) qi1Var2.f;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                        if (!z6) {
                        }
                        z10 = false;
                        w35.c(context, z10);
                    }
                    try {
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IOException e3) {
                                    t35Var.j(7, e3);
                                    try {
                                        r7.close();
                                    } catch (IOException e4) {
                                        t35Var.j(7, e4);
                                    }
                                    ti1VarArr = null;
                                    qi1Var2.i = ti1VarArr;
                                    ti1VarArr2 = (ti1[]) qi1Var2.i;
                                    if (ti1VarArr2 != null) {
                                    }
                                    t35 t35Var222 = (t35) qi1Var2.d;
                                    ti1VarArr3 = (ti1[]) qi1Var2.i;
                                    byte[] bArr422 = (byte[]) qi1Var2.e;
                                    boolean z1222 = r7;
                                    z1222 = r7;
                                    if (ti1VarArr3 != null) {
                                    }
                                    bArr = (byte[]) qi1Var2.f;
                                    if (bArr != null) {
                                    }
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    if (!z6) {
                                    }
                                    z10 = false;
                                    w35.c(context, z10);
                                }
                            } catch (IllegalStateException e5) {
                                t35Var.j(8, e5);
                                r7.close();
                                ti1VarArr = null;
                                qi1Var2.i = ti1VarArr;
                                ti1VarArr2 = (ti1[]) qi1Var2.i;
                                if (ti1VarArr2 != null) {
                                }
                                t35 t35Var2222 = (t35) qi1Var2.d;
                                ti1VarArr3 = (ti1[]) qi1Var2.i;
                                byte[] bArr4222 = (byte[]) qi1Var2.e;
                                boolean z12222 = r7;
                                z12222 = r7;
                                if (ti1VarArr3 != null) {
                                }
                                bArr = (byte[]) qi1Var2.f;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                if (!z6) {
                                }
                                z10 = false;
                                w35.c(context, z10);
                            }
                            if (Arrays.equals(bArr2, nw7.k0(r7, 4))) {
                                ti1VarArr = nb3.S(r7, nw7.k0(r7, 4), (String) qi1Var2.h);
                                try {
                                    r7.close();
                                } catch (IOException e6) {
                                    t35Var.j(7, e6);
                                }
                                qi1Var2.i = ti1VarArr;
                            } else {
                                throw new IllegalStateException("Invalid magic");
                            }
                        }
                        ti1VarArr2 = (ti1[]) qi1Var2.i;
                        if (ti1VarArr2 != null && ((r7 = Build.VERSION.SDK_INT) >= 31 || r7 == 24 || r7 == 25)) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                a2 = qi1Var2.a(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e7) {
                                t35Var.j(9, e7);
                                str = r7;
                            } catch (IOException e8) {
                                t35Var.j(7, e8);
                                str = r7;
                            } catch (IllegalStateException e9) {
                                qi1Var2.i = null;
                                t35Var.j(8, e9);
                                str = r7;
                            }
                            if (a2 == null) {
                                try {
                                    if (Arrays.equals(nb3.s, nw7.k0(a2, 4))) {
                                        byte[] k0 = nw7.k0(a2, 4);
                                        qi1Var2.i = nb3.P(a2, k0, bArr3, ti1VarArr2);
                                        a2.close();
                                        qi1Var = qi1Var2;
                                        r7 = k0;
                                        if (qi1Var != null) {
                                            qi1Var2 = qi1Var;
                                        }
                                    } else {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                } catch (Throwable th) {
                                    try {
                                        a2.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } else {
                                if (a2 != null) {
                                    a2.close();
                                    str = str2;
                                }
                                qi1Var = null;
                                r7 = str;
                                if (qi1Var != null) {
                                }
                            }
                        }
                        t35 t35Var22222 = (t35) qi1Var2.d;
                        ti1VarArr3 = (ti1[]) qi1Var2.i;
                        byte[] bArr42222 = (byte[]) qi1Var2.e;
                        boolean z122222 = r7;
                        z122222 = r7;
                        if (ti1VarArr3 != null && bArr42222 != null) {
                            z7 = qi1Var2.b;
                            if (!z7) {
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    try {
                                        byteArrayOutputStream.write(bArr2);
                                        byteArrayOutputStream.write(bArr42222);
                                    } catch (Throwable th3) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                        }
                                        throw th3;
                                    }
                                } catch (IOException e10) {
                                    t35Var22222.j(7, e10);
                                    z8 = z7;
                                } catch (IllegalStateException e11) {
                                    t35Var22222.j(8, e11);
                                    z8 = z7;
                                }
                                if (!nb3.d0(byteArrayOutputStream, bArr42222, ti1VarArr3)) {
                                    t35Var22222.j(5, null);
                                    qi1Var2.i = null;
                                    byteArrayOutputStream.close();
                                    z122222 = byteArrayOutputStream;
                                } else {
                                    qi1Var2.f = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    z8 = byteArrayOutputStream;
                                    qi1Var2.i = null;
                                    z122222 = z8;
                                }
                            } else {
                                i.m("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                        }
                        bArr = (byte[]) qi1Var2.f;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else if (qi1Var2.b) {
                            try {
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream((File) qi1Var2.g);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    }
                                                                                    fileOutputStream.write(bArr5, 0, read);
                                                                                }
                                                                                z5 = true;
                                                                                qi1Var2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                qi1Var2.f = null;
                                                                                qi1Var2.i = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            Throwable th6 = th;
                                                                            if (tryLock != null) {
                                                                                tryLock.close();
                                                                            }
                                                                            throw th6;
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                    Throwable th8 = th;
                                                                    if (channel != null) {
                                                                        channel.close();
                                                                    }
                                                                    throw th8;
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        Throwable th12 = th;
                                                        fileOutputStream.close();
                                                        throw th12;
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    Throwable th122 = th;
                                                    fileOutputStream.close();
                                                    throw th122;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                Throwable th15 = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                } catch (Throwable th16) {
                                                    th15.addSuppressed(th16);
                                                }
                                                throw th15;
                                            }
                                        } catch (Throwable th17) {
                                            th = th17;
                                            Throwable th152 = th;
                                            byteArrayInputStream.close();
                                            throw th152;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        z122222 = true;
                                        qi1Var2.b(6, e);
                                        z3 = z122222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        if (!z6) {
                                        }
                                        z10 = false;
                                        w35.c(context, z10);
                                    } catch (IOException e13) {
                                        e = e13;
                                        z122222 = true;
                                        qi1Var2.b(7, e);
                                        z3 = z122222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        if (!z6) {
                                        }
                                        z10 = false;
                                        w35.c(context, z10);
                                    }
                                } finally {
                                    qi1Var2.f = null;
                                    qi1Var2.i = null;
                                }
                            } catch (FileNotFoundException e14) {
                                e = e14;
                                qi1Var2.b(6, e);
                                z3 = z122222;
                                z4 = false;
                                z5 = z3;
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                if (!z6) {
                                }
                                z10 = false;
                                w35.c(context, z10);
                            } catch (IOException e15) {
                                e = e15;
                                qi1Var2.b(7, e);
                                z3 = z122222;
                                z4 = false;
                                z5 = z3;
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                if (!z6) {
                                }
                                z10 = false;
                                w35.c(context, z10);
                            }
                        } else {
                            i.m("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            return;
                        }
                        if (z4) {
                            a(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (Throwable th18) {
                        try {
                            r7.close();
                        } catch (IOException e16) {
                            t35Var.j(7, e16);
                        }
                        throw th18;
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            qi1Var2.b(4, null);
                        }
                        qi1Var2.b = true;
                        r7 = qi1Var2.a(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        ti1VarArr2 = (ti1[]) qi1Var2.i;
                        if (ti1VarArr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            a2 = qi1Var2.a(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (a2 == null) {
                            }
                        }
                        t35 t35Var222222 = (t35) qi1Var2.d;
                        ti1VarArr3 = (ti1[]) qi1Var2.i;
                        byte[] bArr422222 = (byte[]) qi1Var2.e;
                        boolean z1222222 = r7;
                        z1222222 = r7;
                        if (ti1VarArr3 != null) {
                            z7 = qi1Var2.b;
                            if (!z7) {
                            }
                        }
                        bArr = (byte[]) qi1Var2.f;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        qi1Var2.b(4, null);
                    }
                }
                if (!z6 && z) {
                    z10 = z9;
                } else {
                    z10 = false;
                }
                w35.c(context, z10);
            }
            z2 = true;
            z6 = false;
            z9 = z2;
            if (!z6) {
            }
            z10 = false;
            w35.c(context, z10);
        } catch (PackageManager.NameNotFoundException e17) {
            t35Var.j(7, e17);
            w35.c(context, false);
        }
    }
}
