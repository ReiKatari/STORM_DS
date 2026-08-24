package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ke7  reason: default package */
/* loaded from: classes.dex */
public class ke7 extends defpackage.bl2 {
    public static java.lang.Class Z = null;
    public static java.lang.reflect.Constructor d0 = null;
    public static java.lang.reflect.Method e0 = null;
    public static java.lang.reflect.Method f0 = null;
    public static boolean g0 = false;

    public static boolean X(java.lang.Object r1, java.lang.String r2, int r3, boolean r4) {
            Y()
            java.lang.reflect.Method r0 = defpackage.ke7.e0     // Catch: java.lang.Throwable -> L1c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L1c
            return r1
        L1c:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }

    public static void Y() {
            boolean r0 = defpackage.ke7.g0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            defpackage.ke7.g0 = r0
            r1 = 0
            java.lang.String r2 = "android.graphics.FontFamily"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.reflect.Constructor r3 = r2.getConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.String r4 = "addFontWeightStyle"
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r6, r7}     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.reflect.Method r4 = r2.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r2, r0)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Class<android.graphics.Typeface> r5 = android.graphics.Typeface.class
            java.lang.String r6 = "createFromFamiliesWithDefault"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.reflect.Method r1 = r5.getMethod(r6, r0)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            r0 = r1
            r1 = r3
            goto L4d
        L3a:
            r0 = move-exception
            goto L3d
        L3c:
            r0 = move-exception
        L3d:
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "TypefaceCompatApi21Impl"
            android.util.Log.e(r3, r2, r0)
            r0 = r1
            r2 = r0
            r4 = r2
        L4d:
            defpackage.ke7.d0 = r1
            defpackage.ke7.Z = r2
            defpackage.ke7.e0 = r4
            defpackage.ke7.f0 = r0
            return
    }

    @Override // defpackage.bl2
    public android.graphics.Typeface o(android.content.Context r8, defpackage.bj2 r9, android.content.res.Resources r10, int r11) {
            r7 = this;
            Y()
            java.lang.reflect.Constructor r7 = defpackage.ke7.d0     // Catch: java.lang.Throwable -> L68
            r11 = 0
            java.lang.Object r7 = r7.newInstance(r11)     // Catch: java.lang.Throwable -> L68
            cj2[] r9 = r9.a
            int r0 = r9.length
            r1 = 0
            r2 = r1
        Lf:
            if (r2 >= r0) goto L47
            r3 = r9[r2]
            java.io.File r4 = defpackage.kn2.M(r8)
            if (r4 != 0) goto L1a
            return r11
        L1a:
            int r5 = r3.f     // Catch: java.lang.Throwable -> L3e java.lang.RuntimeException -> L43
            boolean r5 = defpackage.kn2.x(r4, r10, r5)     // Catch: java.lang.Throwable -> L3e java.lang.RuntimeException -> L43
            if (r5 != 0) goto L26
            r4.delete()
            return r11
        L26:
            java.lang.String r5 = r4.getPath()     // Catch: java.lang.Throwable -> L3e java.lang.RuntimeException -> L43
            int r6 = r3.b     // Catch: java.lang.Throwable -> L3e java.lang.RuntimeException -> L43
            boolean r3 = r3.c     // Catch: java.lang.Throwable -> L3e java.lang.RuntimeException -> L43
            boolean r3 = X(r7, r5, r6, r3)     // Catch: java.lang.Throwable -> L3e java.lang.RuntimeException -> L43
            if (r3 != 0) goto L38
            r4.delete()
            return r11
        L38:
            r4.delete()
            int r2 = r2 + 1
            goto Lf
        L3e:
            r7 = move-exception
            r4.delete()
            throw r7
        L43:
            r4.delete()
            return r11
        L47:
            Y()
            java.lang.Class r8 = defpackage.ke7.Z     // Catch: java.lang.Throwable -> L61
            r9 = 1
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r8, r9)     // Catch: java.lang.Throwable -> L61
            java.lang.reflect.Array.set(r8, r1, r7)     // Catch: java.lang.Throwable -> L61
            java.lang.reflect.Method r7 = defpackage.ke7.f0     // Catch: java.lang.Throwable -> L61
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L61
            java.lang.Object r7 = r7.invoke(r11, r8)     // Catch: java.lang.Throwable -> L61
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7     // Catch: java.lang.Throwable -> L61
            return r7
        L61:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r7)
            throw r8
        L68:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r7)
            throw r8
    }

    @Override // defpackage.bl2
    public android.graphics.Typeface p(android.content.Context r3, defpackage.rj2[] r4, int r5) {
            r2 = this;
            int r2 = r4.length
            r0 = 1
            r1 = 0
            if (r2 >= r0) goto L7
            goto La1
        L7:
            rj2 r2 = defpackage.bl2.x(r4, r5)
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
            java.io.File r3 = defpackage.kn2.M(r3)     // Catch: java.lang.Throwable -> L8e
            if (r3 != 0) goto L6c
        L6a:
            r5 = r1
            goto L87
        L6c:
            boolean r5 = defpackage.kn2.y(r4, r3)     // Catch: java.lang.RuntimeException -> L72 java.lang.Throwable -> L82
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
    }
}
