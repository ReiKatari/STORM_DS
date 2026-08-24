package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ke7  reason: default package */
/* loaded from: classes.dex */
public class ke7 extends bl2 {
    public static Class Z = null;
    public static Constructor d0 = null;
    public static Method e0 = null;
    public static Method f0 = null;
    public static boolean g0 = false;

    public static boolean X(Object obj, String str, int i, boolean z) {
        Y();
        try {
            return ((Boolean) e0.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void Y() {
        Method method;
        Class<?> cls;
        Method method2;
        if (g0) {
            return;
        }
        g0 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        d0 = constructor;
        Z = cls;
        e0 = method2;
        f0 = method;
    }

    @Override // defpackage.bl2
    public Typeface o(Context context, bj2 bj2Var, Resources resources, int i) {
        cj2[] cj2VarArr;
        Y();
        try {
            Object newInstance = d0.newInstance(null);
            for (cj2 cj2Var : bj2Var.a) {
                File M = kn2.M(context);
                if (M == null) {
                    return null;
                }
                try {
                    if (!kn2.x(M, resources, cj2Var.f)) {
                        return null;
                    }
                    if (!X(newInstance, M.getPath(), cj2Var.b, cj2Var.c)) {
                        return null;
                    }
                    M.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    M.delete();
                }
            }
            Y();
            try {
                Object newInstance2 = Array.newInstance(Z, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f0.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.bl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface p(Context context, rj2[] rj2VarArr, int i) {
        File file;
        FileInputStream fileInputStream;
        File M;
        Typeface createFromFile;
        String readlink;
        if (rj2VarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(bl2.x(rj2VarArr, i).a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                } else {
                    try {
                        readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                    } catch (ErrnoException unused) {
                    }
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null && file.canRead()) {
                                Typeface createFromFile2 = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile2;
                            }
                            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            M = kn2.M(context);
                            if (M != null) {
                                try {
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    M.delete();
                                    throw th;
                                }
                                if (kn2.y(fileInputStream, M)) {
                                    createFromFile = Typeface.createFromFile(M.getPath());
                                    M.delete();
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                M.delete();
                            }
                            createFromFile = null;
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        M = kn2.M(context);
                        if (M != null) {
                        }
                        createFromFile = null;
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return createFromFile;
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile22 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile22;
                    }
                    fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
