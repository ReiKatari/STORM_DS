package q5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class f extends p7.j {

    /* renamed from: b  reason: collision with root package name */
    public static Class f12293b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor f12294c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f12295d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Method f12296e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f12297f = false;

    public static boolean N(Object obj, String str, int i2, boolean z10) {
        O();
        try {
            return ((Boolean) f12295d.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static void O() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f12297f) {
            return;
        }
        f12297f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi21Impl", e6.getClass().getName(), e6);
            method = null;
            cls = null;
            method2 = null;
        }
        f12294c = constructor;
        f12293b = cls;
        f12295d = method2;
        f12296e = method;
    }

    @Override // p7.j
    public Typeface p(Context context, p5.e eVar, Resources resources, int i2) {
        p5.f[] fVarArr;
        O();
        try {
            Object newInstance = f12294c.newInstance(null);
            for (p5.f fVar : eVar.f11336a) {
                File p10 = p7.k.p(context);
                if (p10 == null) {
                    return null;
                }
                try {
                    if (!p7.k.g(p10, resources, fVar.f11342f)) {
                        return null;
                    }
                    if (!N(newInstance, p10.getPath(), fVar.f11338b, fVar.f11339c)) {
                        return null;
                    }
                    p10.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    p10.delete();
                }
            }
            O();
            try {
                Object newInstance2 = Array.newInstance(f12293b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f12296e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface q(android.content.Context r4, v5.g[] r5, int r6) {
        /*
            r3 = this;
            int r0 = r5.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L7
            goto La1
        L7:
            v5.g r5 = p7.j.u(r5, r6)
            android.content.ContentResolver r6 = r4.getContentResolver()
            android.net.Uri r5 = r5.f13745a     // Catch: java.io.IOException -> La1
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r6.openFileDescriptor(r5, r0, r2)     // Catch: java.io.IOException -> La1
            if (r5 != 0) goto L1f
            if (r5 == 0) goto La1
            r5.close()     // Catch: java.io.IOException -> La1
            return r2
        L1f:
            java.lang.String r6 = "/proc/self/fd/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            r0.<init>(r6)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            int r6 = r5.getFd()     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            r0.append(r6)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            java.lang.String r6 = r0.toString()     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            android.system.StructStat r0 = android.system.Os.stat(r6)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            int r0 = r0.st_mode     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            boolean r0 = android.system.OsConstants.S_ISREG(r0)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            if (r0 == 0) goto L47
            java.io.File r0 = new java.io.File     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            r0.<init>(r6)     // Catch: android.system.ErrnoException -> L47 java.lang.Throwable -> L59
            goto L48
        L47:
            r0 = r2
        L48:
            if (r0 == 0) goto L5b
            boolean r6 = r0.canRead()     // Catch: java.lang.Throwable -> L59
            if (r6 != 0) goto L51
            goto L5b
        L51:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r0)     // Catch: java.lang.Throwable -> L59
            r5.close()     // Catch: java.io.IOException -> La1
            return r4
        L59:
            r4 = move-exception
            goto L98
        L5b:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L59
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch: java.lang.Throwable -> L59
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L59
            java.io.File r4 = p7.k.p(r4)     // Catch: java.lang.Throwable -> L8e
            if (r4 != 0) goto L6c
        L6a:
            r0 = r2
            goto L87
        L6c:
            boolean r0 = p7.k.h(r4, r6)     // Catch: java.lang.RuntimeException -> L72 java.lang.Throwable -> L82
            if (r0 != 0) goto L76
        L72:
            r4.delete()     // Catch: java.lang.Throwable -> L8e
            goto L6a
        L76:
            java.lang.String r0 = r4.getPath()     // Catch: java.lang.RuntimeException -> L72 java.lang.Throwable -> L82
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromFile(r0)     // Catch: java.lang.RuntimeException -> L72 java.lang.Throwable -> L82
            r4.delete()     // Catch: java.lang.Throwable -> L8e
            goto L87
        L82:
            r0 = move-exception
            r4.delete()     // Catch: java.lang.Throwable -> L8e
            throw r0     // Catch: java.lang.Throwable -> L8e
        L87:
            r6.close()     // Catch: java.lang.Throwable -> L59
            r5.close()     // Catch: java.io.IOException -> La1
            return r0
        L8e:
            r4 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L93
            goto L97
        L93:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch: java.lang.Throwable -> L59
        L97:
            throw r4     // Catch: java.lang.Throwable -> L59
        L98:
            r5.close()     // Catch: java.lang.Throwable -> L9c
            goto La0
        L9c:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> La1
        La0:
            throw r4     // Catch: java.io.IOException -> La1
        La1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.f.q(android.content.Context, v5.g[], int):android.graphics.Typeface");
    }
}
