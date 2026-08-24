package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: le7  reason: default package */
/* loaded from: classes.dex */
public final class le7 extends defpackage.bl2 {
    public static final java.lang.Class Z = null;
    public static final java.lang.reflect.Constructor d0 = null;
    public static final java.lang.reflect.Method e0 = null;
    public static final java.lang.reflect.Method f0 = null;

    static {
            r0 = 0
            java.lang.String r1 = "android.graphics.FontFamily"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Constructor r2 = r1.getConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.String r3 = "addFontWeightStyle"
            java.lang.Class<java.nio.ByteBuffer> r4 = java.nio.ByteBuffer.class
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r5, r6, r5, r7}     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Method r3 = r1.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            r4 = 1
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r1, r4)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.Class<android.graphics.Typeface> r5 = android.graphics.Typeface.class
            java.lang.String r6 = "createFromFamiliesWithDefault"
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Method r0 = r5.getMethod(r6, r4)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            r8 = r2
            r2 = r0
            r0 = r8
            goto L49
        L36:
            r1 = move-exception
            goto L39
        L38:
            r1 = move-exception
        L39:
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "TypefaceCompatApi24Impl"
            android.util.Log.e(r3, r2, r1)
            r1 = r0
            r2 = r1
            r3 = r2
        L49:
            defpackage.le7.d0 = r0
            defpackage.le7.Z = r1
            defpackage.le7.e0 = r3
            defpackage.le7.f0 = r2
            return
    }

    public static boolean X(java.lang.Object r2, java.nio.ByteBuffer r3, int r4, int r5, boolean r6) {
            java.lang.reflect.Method r0 = defpackage.le7.e0     // Catch: java.lang.Throwable -> L1e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r1, r5, r6}     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r0.invoke(r2, r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L1e
            return r2
        L1e:
            r2 = 0
            return r2
    }

    public static android.graphics.Typeface Y(java.lang.Object r3) {
            r0 = 0
            java.lang.Class r1 = defpackage.le7.Z     // Catch: java.lang.Throwable -> L19
            r2 = 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)     // Catch: java.lang.Throwable -> L19
            r2 = 0
            java.lang.reflect.Array.set(r1, r2, r3)     // Catch: java.lang.Throwable -> L19
            java.lang.reflect.Method r3 = defpackage.le7.f0     // Catch: java.lang.Throwable -> L19
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L19
            java.lang.Object r3 = r3.invoke(r0, r1)     // Catch: java.lang.Throwable -> L19
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3     // Catch: java.lang.Throwable -> L19
            return r3
        L19:
            return r0
    }

    @Override // defpackage.bl2
    public final android.graphics.Typeface o(android.content.Context r17, defpackage.bj2 r18, android.content.res.Resources r19, int r20) {
            r16 = this;
            r1 = 0
            java.lang.reflect.Constructor r0 = defpackage.le7.d0     // Catch: java.lang.Throwable -> L9
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L9
            r2 = r0
            goto La
        L9:
            r2 = r1
        La:
            if (r2 != 0) goto Ld
            goto L67
        Ld:
            r0 = r18
            cj2[] r3 = r0.a
            int r4 = r3.length
            r0 = 0
            r5 = r0
        L14:
            if (r5 >= r4) goto L70
            r6 = r3[r5]
            int r0 = r6.f
            java.io.File r7 = defpackage.kn2.M(r17)
            if (r7 != 0) goto L24
            r8 = r19
        L22:
            r0 = r1
            goto L58
        L24:
            r8 = r19
            boolean r0 = defpackage.kn2.x(r7, r8, r0)     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L30
            r7.delete()
            goto L22
        L30:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L6b
            r9.<init>(r7)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L6b
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L49
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L49
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L49
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L49
            r9.close()     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L6b
            goto L55
        L49:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r0 = move-exception
            r10.addSuppressed(r0)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L6b
        L53:
            throw r10     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L6b
        L54:
            r0 = r1
        L55:
            r7.delete()
        L58:
            if (r0 != 0) goto L5b
            goto L67
        L5b:
            int r7 = r6.e
            int r9 = r6.b
            boolean r6 = r6.c
            boolean r0 = X(r2, r0, r7, r9, r6)
            if (r0 != 0) goto L68
        L67:
            return r1
        L68:
            int r5 = r5 + 1
            goto L14
        L6b:
            r0 = move-exception
            r7.delete()
            throw r0
        L70:
            android.graphics.Typeface r0 = Y(r2)
            return r0
    }

    @Override // defpackage.bl2
    public final android.graphics.Typeface p(android.content.Context r9, defpackage.rj2[] r10, int r11) {
            r8 = this;
            r8 = 0
            java.lang.reflect.Constructor r0 = defpackage.le7.d0     // Catch: java.lang.Throwable -> L8
            java.lang.Object r0 = r0.newInstance(r8)     // Catch: java.lang.Throwable -> L8
            goto L9
        L8:
            r0 = r8
        L9:
            if (r0 != 0) goto Lc
            goto L41
        Lc:
            ci6 r1 = new ci6
            r2 = 0
            r1.<init>(r2)
            int r3 = r10.length
        L13:
            if (r2 >= r3) goto L3b
            r4 = r10[r2]
            android.net.Uri r5 = r4.a
            java.lang.Object r6 = r1.get(r5)
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            if (r6 != 0) goto L28
            java.nio.MappedByteBuffer r6 = defpackage.kn2.T(r9, r5)
            r1.put(r5, r6)
        L28:
            if (r6 != 0) goto L2b
            goto L41
        L2b:
            int r5 = r4.b
            int r7 = r4.c
            boolean r4 = r4.d
            boolean r4 = X(r0, r6, r5, r7, r4)
            if (r4 != 0) goto L38
            goto L41
        L38:
            int r2 = r2 + 1
            goto L13
        L3b:
            android.graphics.Typeface r9 = Y(r0)
            if (r9 != 0) goto L42
        L41:
            return r8
        L42:
            android.graphics.Typeface r8 = android.graphics.Typeface.create(r9, r11)
            return r8
    }
}
