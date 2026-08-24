package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ne7  reason: default package */
/* loaded from: classes.dex */
public class ne7 extends defpackage.ke7 {
    public final java.lang.Class h0;
    public final java.lang.reflect.Constructor i0;
    public final java.lang.reflect.Method j0;
    public final java.lang.reflect.Method k0;
    public final java.lang.reflect.Method l0;
    public final java.lang.reflect.Method m0;
    public final java.lang.reflect.Method n0;

    public ne7() {
            r9 = this;
            r9.<init>()
            r0 = 0
            java.lang.String r1 = "android.graphics.FontFamily"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Constructor r2 = r1.getConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Method r3 = c0(r1)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.String r4 = "addFontFromBuffer"
            java.lang.Class<java.nio.ByteBuffer> r5 = java.nio.ByteBuffer.class
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r7 = android.graphics.fonts.FontVariationAxis[].class
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r6, r7, r6, r6}     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Method r4 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.String r5 = "freeze"
            java.lang.reflect.Method r5 = r1.getMethod(r5, r0)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.String r6 = "abortCreation"
            java.lang.reflect.Method r6 = r1.getMethod(r6, r0)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Method r0 = r9.d0(r1)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            r8 = r1
            r1 = r0
            r0 = r8
            goto L52
        L36:
            r1 = move-exception
            goto L39
        L38:
            r1 = move-exception
        L39:
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "Unable to collect necessary methods for class "
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r3 = "TypefaceCompatApi26Impl"
            android.util.Log.e(r3, r2, r1)
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L52:
            r9.h0 = r0
            r9.i0 = r2
            r9.j0 = r3
            r9.k0 = r4
            r9.l0 = r5
            r9.m0 = r6
            r9.n0 = r1
            return
    }

    public static java.lang.reflect.Method c0(java.lang.Class r8) {
            java.lang.Class r3 = java.lang.Boolean.TYPE
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r7 = android.graphics.fonts.FontVariationAxis[].class
            java.lang.Class<android.content.res.AssetManager> r0 = android.content.res.AssetManager.class
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class r2 = java.lang.Integer.TYPE
            r4 = r2
            r5 = r2
            r6 = r2
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1, r2, r3, r4, r5, r6, r7}
            java.lang.String r1 = "addFontFromAssetManager"
            java.lang.reflect.Method r8 = r8.getMethod(r1, r0)
            return r8
    }

    public final boolean Z(android.content.Context r10, java.lang.Object r11, java.lang.String r12, int r13, int r14, int r15, android.graphics.fonts.FontVariationAxis[] r16) {
            r9 = this;
            r0 = 0
            java.lang.reflect.Method r9 = r9.j0     // Catch: java.lang.Throwable -> L2b
            android.content.res.AssetManager r1 = r10.getAssets()     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L2b
            r2 = r12
            r8 = r16
            java.lang.Object[] r10 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6, r7, r8}     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r9 = r9.invoke(r11, r10)     // Catch: java.lang.Throwable -> L2b
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2b
            return r9
        L2b:
            return r0
    }

    public android.graphics.Typeface a0(java.lang.Object r5) {
            r4 = this;
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.Class r2 = r4.h0     // Catch: java.lang.Throwable -> L1e
            r3 = 1
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r3)     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            java.lang.reflect.Array.set(r2, r3, r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.reflect.Method r4 = r4.n0     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r0, r0}     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r4 = r4.invoke(r1, r5)     // Catch: java.lang.Throwable -> L1e
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4     // Catch: java.lang.Throwable -> L1e
            return r4
        L1e:
            return r1
    }

    public final boolean b0(java.lang.Object r2) {
            r1 = this;
            java.lang.reflect.Method r1 = r1.l0     // Catch: java.lang.Throwable -> Le
            r0 = 0
            java.lang.Object r1 = r1.invoke(r2, r0)     // Catch: java.lang.Throwable -> Le
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Le
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = 0
            return r1
    }

    public java.lang.reflect.Method d0(java.lang.Class r3) {
            r2 = this;
            r2 = 1
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r0, r0}
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            java.lang.String r1 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r1, r3)
            r3.setAccessible(r2)
            return r3
    }

    @Override // defpackage.ke7, defpackage.bl2
    public final android.graphics.Typeface o(android.content.Context r10, defpackage.bj2 r11, android.content.res.Resources r12, int r13) {
            r9 = this;
            java.lang.reflect.Method r0 = r9.j0
            if (r0 != 0) goto Lb
            java.lang.String r1 = "TypefaceCompatApi26Impl"
            java.lang.String r2 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r1, r2)
        Lb:
            if (r0 == 0) goto L51
            r12 = 0
            java.lang.reflect.Constructor r13 = r9.i0     // Catch: java.lang.Throwable -> L16
            java.lang.Object r13 = r13.newInstance(r12)     // Catch: java.lang.Throwable -> L16
            r2 = r13
            goto L17
        L16:
            r2 = r12
        L17:
            if (r2 != 0) goto L1a
            goto L4b
        L1a:
            cj2[] r11 = r11.a
            int r13 = r11.length
            r0 = 0
            r8 = r0
        L1f:
            if (r8 >= r13) goto L44
            r0 = r11[r8]
            java.lang.String r3 = r0.a
            int r4 = r0.e
            int r5 = r0.b
            boolean r6 = r0.c
            java.lang.String r0 = r0.d
            android.graphics.fonts.FontVariationAxis[] r7 = android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(r0)
            r0 = r9
            r1 = r10
            boolean r9 = r0.Z(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != 0) goto L3f
            java.lang.reflect.Method r9 = r0.m0     // Catch: java.lang.Throwable -> L4b
            r9.invoke(r2, r12)     // Catch: java.lang.Throwable -> L4b
            goto L4b
        L3f:
            int r8 = r8 + 1
            r9 = r0
            r10 = r1
            goto L1f
        L44:
            r0 = r9
            boolean r9 = r0.b0(r2)
            if (r9 != 0) goto L4c
        L4b:
            return r12
        L4c:
            android.graphics.Typeface r9 = r0.a0(r2)
            return r9
        L51:
            r0 = r9
            r1 = r10
            android.graphics.Typeface r9 = super.o(r1, r11, r12, r13)
            return r9
    }

    @Override // defpackage.ke7, defpackage.bl2
    public final android.graphics.Typeface p(android.content.Context r13, defpackage.rj2[] r14, int r15) {
            r12 = this;
            int r0 = r14.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            goto Le2
        L7:
            java.lang.reflect.Method r0 = r12.j0
            if (r0 != 0) goto L12
            java.lang.String r3 = "TypefaceCompatApi26Impl"
            java.lang.String r4 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r3, r4)
        L12:
            if (r0 == 0) goto La3
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r3 = r14.length
            r4 = 0
            r5 = r4
        L1c:
            if (r5 >= r3) goto L38
            r6 = r14[r5]
            int r7 = r6.f
            if (r7 == 0) goto L25
            goto L35
        L25:
            android.net.Uri r6 = r6.a
            boolean r7 = r0.containsKey(r6)
            if (r7 == 0) goto L2e
            goto L35
        L2e:
            java.nio.MappedByteBuffer r7 = defpackage.kn2.T(r13, r6)
            r0.put(r6, r7)
        L35:
            int r5 = r5 + 1
            goto L1c
        L38:
            java.util.Map r13 = java.util.Collections.unmodifiableMap(r0)
            java.lang.reflect.Constructor r0 = r12.i0     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r0 = r1
        L44:
            if (r0 != 0) goto L48
            goto Le2
        L48:
            int r3 = r14.length
            r5 = r4
            r6 = r5
        L4b:
            java.lang.reflect.Method r7 = r12.m0
            if (r5 >= r3) goto L8a
            r8 = r14[r5]
            android.net.Uri r9 = r8.a
            java.lang.Object r9 = r13.get(r9)
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9
            if (r9 != 0) goto L5c
            goto L87
        L5c:
            int r6 = r8.b
            int r10 = r8.c
            boolean r8 = r8.d
            java.lang.reflect.Method r11 = r12.k0     // Catch: java.lang.Throwable -> L7f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L7f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L7f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object[] r6 = new java.lang.Object[]{r9, r6, r1, r10, r8}     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r6 = r11.invoke(r0, r6)     // Catch: java.lang.Throwable -> L7f
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L7f
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L7f
            goto L80
        L7f:
            r6 = r4
        L80:
            if (r6 != 0) goto L86
            r7.invoke(r0, r1)     // Catch: java.lang.Throwable -> Le2
            goto Le2
        L86:
            r6 = r2
        L87:
            int r5 = r5 + 1
            goto L4b
        L8a:
            if (r6 != 0) goto L90
            r7.invoke(r0, r1)     // Catch: java.lang.Throwable -> Le2
            goto Le2
        L90:
            boolean r13 = r12.b0(r0)
            if (r13 != 0) goto L97
            goto Le2
        L97:
            android.graphics.Typeface r12 = r12.a0(r0)
            if (r12 != 0) goto L9e
            goto Le2
        L9e:
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r15)
            return r12
        La3:
            rj2 r12 = defpackage.bl2.x(r14, r15)
            android.content.ContentResolver r13 = r13.getContentResolver()
            android.net.Uri r14 = r12.a
            java.lang.String r15 = "r"
            android.os.ParcelFileDescriptor r13 = r13.openFileDescriptor(r14, r15, r1)
            if (r13 != 0) goto Lbb
            if (r13 == 0) goto Le2
            r13.close()
            return r1
        Lbb:
            android.graphics.Typeface$Builder r14 = new android.graphics.Typeface$Builder     // Catch: java.lang.Throwable -> Ld8
            java.io.FileDescriptor r15 = r13.getFileDescriptor()     // Catch: java.lang.Throwable -> Ld8
            r14.<init>(r15)     // Catch: java.lang.Throwable -> Ld8
            int r15 = r12.c     // Catch: java.lang.Throwable -> Ld8
            android.graphics.Typeface$Builder r14 = r14.setWeight(r15)     // Catch: java.lang.Throwable -> Ld8
            boolean r12 = r12.d     // Catch: java.lang.Throwable -> Ld8
            android.graphics.Typeface$Builder r12 = r14.setItalic(r12)     // Catch: java.lang.Throwable -> Ld8
            android.graphics.Typeface r12 = r12.build()     // Catch: java.lang.Throwable -> Ld8
            r13.close()     // Catch: java.lang.Throwable -> Le2
            return r12
        Ld8:
            r12 = move-exception
            r13.close()     // Catch: java.lang.Throwable -> Ldd
            goto Le1
        Ldd:
            r13 = move-exception
            r12.addSuppressed(r13)     // Catch: java.lang.Throwable -> Le2
        Le1:
            throw r12     // Catch: java.lang.Throwable -> Le2
        Le2:
            return r1
    }

    @Override // defpackage.bl2
    public final android.graphics.Typeface r(android.content.Context r10, android.content.res.Resources r11, int r12, java.lang.String r13, int r14) {
            r9 = this;
            java.lang.reflect.Method r0 = r9.j0
            if (r0 != 0) goto Lb
            java.lang.String r1 = "TypefaceCompatApi26Impl"
            java.lang.String r2 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r1, r2)
        Lb:
            if (r0 == 0) goto L39
            r11 = 0
            java.lang.reflect.Constructor r12 = r9.i0     // Catch: java.lang.Throwable -> L16
            java.lang.Object r12 = r12.newInstance(r11)     // Catch: java.lang.Throwable -> L16
            r2 = r12
            goto L17
        L16:
            r2 = r11
        L17:
            if (r2 != 0) goto L1a
            goto L33
        L1a:
            r6 = -1
            r7 = 0
            r4 = 0
            r5 = -1
            r0 = r9
            r1 = r10
            r3 = r13
            boolean r9 = r0.Z(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != 0) goto L2d
            java.lang.reflect.Method r9 = r0.m0     // Catch: java.lang.Throwable -> L33
            r9.invoke(r2, r11)     // Catch: java.lang.Throwable -> L33
            goto L33
        L2d:
            boolean r9 = r0.b0(r2)
            if (r9 != 0) goto L34
        L33:
            return r11
        L34:
            android.graphics.Typeface r9 = r0.a0(r2)
            return r9
        L39:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            android.graphics.Typeface r9 = super.r(r4, r5, r6, r7, r8)
            return r9
    }
}
