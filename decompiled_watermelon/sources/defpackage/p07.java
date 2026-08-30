package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p07  reason: default package */
/* loaded from: classes.dex */
public class p07 extends hk2 {
    public static Class e = null;
    public static Constructor f = null;
    public static Method g = null;
    public static Method h = null;
    public static boolean i = false;

    public static boolean W(Object obj, String str, int i2, boolean z) {
        X();
        try {
            return ((Boolean) g.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void X() {
        Method method;
        Class<?> cls;
        Method method2;
        if (i) {
            return;
        }
        i = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f = constructor;
        e = cls;
        g = method2;
        h = method;
    }

    @Override // defpackage.hk2
    public Typeface k(Context context, ee2 ee2Var, Resources resources, int i2) {
        fe2[] fe2VarArr;
        X();
        try {
            Object newInstance = f.newInstance(null);
            for (fe2 fe2Var : ee2Var.a) {
                File D = jk2.D(context);
                if (D == null) {
                    return null;
                }
                try {
                    if (!jk2.p(D, resources, fe2Var.f)) {
                        return null;
                    }
                    if (!W(newInstance, D.getPath(), fe2Var.b, fe2Var.c)) {
                        return null;
                    }
                    D.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    D.delete();
                }
            }
            X();
            try {
                Object newInstance2 = Array.newInstance(e, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) h.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface l(android.content.Context r3, defpackage.se2[] r4, int r5) {
        /*
            r2 = this;
            int r2 = r4.length
            r0 = 1
            r1 = 0
            if (r2 >= r0) goto L7
            goto La1
        L7:
            se2 r2 = defpackage.hk2.t(r4, r5)
            android.content.ContentResolver r4 = r3.getContentResolver()
            android.net.Uri r2 = r2.a     // Catch: java.io.IOException -> La1
            java.lang.String r5 = "r"
            android.os.ParcelFileDescriptor r2 = r4.openFileDescriptor(r2, r5, r1)     // Catch: java.io.IOException -> La1
            if (r2 != 0) goto L1f
            if (r2 == 0) goto La1
            r2.close()     // Catch: java.io.IOException -> La1
            return r1
        L1f:
            java.lang.String r4 = "/proc/self/fd/"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            r5.<init>(r4)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            int r4 = r2.getFd()     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            r5.append(r4)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            java.lang.String r4 = r5.toString()     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            java.lang.String r4 = android.system.Os.readlink(r4)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            android.system.StructStat r5 = android.system.Os.stat(r4)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            int r5 = r5.st_mode     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            boolean r5 = android.system.OsConstants.S_ISREG(r5)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            if (r5 == 0) goto L47
            java.io.File r5 = new java.io.File     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            r5.<init>(r4)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            goto L48
        L47:
            r5 = r1
        L48:
            if (r5 == 0) goto L5b
            boolean r4 = r5.canRead()     // Catch: java.lang.Throwable -> L59
            if (r4 != 0) goto L51
            goto L5b
        L51:
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromFile(r5)     // Catch: java.lang.Throwable -> L59
            r2.close()     // Catch: java.io.IOException -> La1
            return r3
        L59:
            r3 = move-exception
            goto L98
        L5b:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L59
            java.io.FileDescriptor r5 = r2.getFileDescriptor()     // Catch: java.lang.Throwable -> L59
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L59
            java.io.File r3 = defpackage.jk2.D(r3)     // Catch: java.lang.Throwable -> L8e
            if (r3 != 0) goto L6c
        L6a:
            r5 = r1
            goto L87
        L6c:
            boolean r5 = defpackage.jk2.q(r3, r4)     // Catch: java.lang.RuntimeException -> L72 java.lang.Throwable -> L82
            if (r5 != 0) goto L76
        L72:
            r3.delete()     // Catch: java.lang.Throwable -> L8e
            goto L6a
        L76:
            java.lang.String r5 = r3.getPath()     // Catch: java.lang.RuntimeException -> L72 java.lang.Throwable -> L82
            android.graphics.Typeface r5 = android.graphics.Typeface.createFromFile(r5)     // Catch: java.lang.RuntimeException -> L72 java.lang.Throwable -> L82
            r3.delete()     // Catch: java.lang.Throwable -> L8e
            goto L87
        L82:
            r5 = move-exception
            r3.delete()     // Catch: java.lang.Throwable -> L8e
            throw r5     // Catch: java.lang.Throwable -> L8e
        L87:
            r4.close()     // Catch: java.lang.Throwable -> L59
            r2.close()     // Catch: java.io.IOException -> La1
            return r5
        L8e:
            r3 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L93
            goto L97
        L93:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch: java.lang.Throwable -> L59
        L97:
            throw r3     // Catch: java.lang.Throwable -> L59
        L98:
            r2.close()     // Catch: java.lang.Throwable -> L9c
            goto La0
        L9c:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.io.IOException -> La1
        La0:
            throw r3     // Catch: java.io.IOException -> La1
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p07.l(android.content.Context, se2[], int):android.graphics.Typeface");
    }
}
