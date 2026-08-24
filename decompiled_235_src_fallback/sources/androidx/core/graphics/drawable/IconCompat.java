package androidx.core.graphics.drawable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
    public static final android.graphics.PorterDuff.Mode k = null;
    public int a;
    public java.lang.Object b;
    public byte[] c;
    public android.os.Parcelable d;
    public int e;
    public int f;
    public android.content.res.ColorStateList g;
    public android.graphics.PorterDuff.Mode h;
    public java.lang.String i;
    public java.lang.String j;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.core.graphics.drawable.IconCompat.k = r0
            return
    }

    public IconCompat(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.c = r0
            r2.d = r0
            r1 = 0
            r2.e = r1
            r2.f = r1
            r2.g = r0
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.k
            r2.h = r1
            r2.i = r0
            r2.a = r3
            return
    }

    public static android.graphics.Bitmap a(android.graphics.Bitmap r9, boolean r10) {
            int r0 = r9.getWidth()
            int r1 = r9.getHeight()
            int r0 = java.lang.Math.min(r0, r1)
            float r0 = (float) r0
            r1 = 1059760811(0x3f2aaaab, float:0.6666667)
            float r0 = r0 * r1
            int r0 = (int) r0
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r0, r0, r1)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r1)
            android.graphics.Paint r3 = new android.graphics.Paint
            r4 = 3
            r3.<init>(r4)
            float r4 = (float) r0
            r5 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r4
            r6 = 1063955115(0x3f6aaaab, float:0.9166667)
            float r6 = r6 * r5
            if (r10 == 0) goto L4d
            r10 = 1009429163(0x3c2aaaab, float:0.010416667)
            float r10 = r10 * r4
            r7 = 0
            r3.setColor(r7)
            r7 = 1017817771(0x3caaaaab, float:0.020833334)
            float r4 = r4 * r7
            r7 = 1023410176(0x3d000000, float:0.03125)
            r8 = 0
            r3.setShadowLayer(r10, r8, r4, r7)
            r2.drawCircle(r5, r5, r6, r3)
            r4 = 503316480(0x1e000000, float:6.7762636E-21)
            r3.setShadowLayer(r10, r8, r8, r4)
            r2.drawCircle(r5, r5, r6, r3)
            r3.clearShadowLayer()
        L4d:
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setColor(r10)
            android.graphics.BitmapShader r10 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.CLAMP
            r10.<init>(r9, r4, r4)
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            int r7 = r9.getWidth()
            int r7 = r7 - r0
            int r7 = -r7
            float r7 = (float) r7
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r8
            int r9 = r9.getHeight()
            int r9 = r9 - r0
            int r9 = -r9
            float r9 = (float) r9
            float r9 = r9 / r8
            r4.setTranslate(r7, r9)
            r10.setLocalMatrix(r4)
            r3.setShader(r10)
            r2.drawCircle(r5, r5, r6, r3)
            r9 = 0
            r2.setBitmap(r9)
            return r1
    }

    public static androidx.core.graphics.drawable.IconCompat b(android.content.res.Resources r3, java.lang.String r4, int r5) {
            r4.getClass()
            r0 = 0
            if (r5 == 0) goto L22
            androidx.core.graphics.drawable.IconCompat r1 = new androidx.core.graphics.drawable.IconCompat
            r2 = 2
            r1.<init>(r2)
            r1.e = r5
            if (r3 == 0) goto L1d
            java.lang.String r3 = r3.getResourceName(r5)     // Catch: android.content.res.Resources.NotFoundException -> L17
            r1.b = r3     // Catch: android.content.res.Resources.NotFoundException -> L17
            goto L1f
        L17:
            java.lang.String r3 = "Icon resource cannot be found"
            defpackage.i.h(r3)
            return r0
        L1d:
            r1.b = r4
        L1f:
            r1.j = r4
            return r1
        L22:
            java.lang.String r3 = "Drawable resource ID must not be 0"
            defpackage.i.h(r3)
            return r0
    }

    public final int c() {
            r6 = this;
            int r0 = r6.a
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L3f
            java.lang.Object r6 = r6.b
            java.lang.String r0 = "Unable to get icon resource"
            java.lang.String r1 = "IconCompat"
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L17
            int r6 = defpackage.pp.j(r6)
            return r6
        L17:
            java.lang.Class r3 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            java.lang.String r4 = "getResId"
            r5 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            java.lang.Object r6 = r3.invoke(r6, r5)     // Catch: java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            int r6 = r6.intValue()     // Catch: java.lang.NoSuchMethodException -> L2d java.lang.reflect.InvocationTargetException -> L2f java.lang.IllegalAccessException -> L31
            return r6
        L2d:
            r6 = move-exception
            goto L33
        L2f:
            r6 = move-exception
            goto L37
        L31:
            r6 = move-exception
            goto L3b
        L33:
            android.util.Log.e(r1, r0, r6)
            goto L3e
        L37:
            android.util.Log.e(r1, r0, r6)
            goto L3e
        L3b:
            android.util.Log.e(r1, r0, r6)
        L3e:
            return r2
        L3f:
            r1 = 2
            if (r0 != r1) goto L45
            int r6 = r6.e
            return r6
        L45:
            java.lang.String r0 = "called getResId() on "
            defpackage.e41.y(r6, r0)
            return r2
    }

    public final java.lang.String d() {
            r5 = this;
            int r0 = r5.a
            r1 = 0
            r2 = -1
            if (r0 != r2) goto L3a
            java.lang.Object r5 = r5.b
            java.lang.String r0 = "Unable to get icon package"
            java.lang.String r2 = "IconCompat"
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L17
            java.lang.String r5 = defpackage.pp.k(r5)
            return r5
        L17:
            java.lang.Class r3 = r5.getClass()     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L2c
            java.lang.String r4 = "getResPackage"
            java.lang.reflect.Method r3 = r3.getMethod(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L2c
            java.lang.Object r5 = r3.invoke(r5, r1)     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L2c
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L2c
            return r5
        L28:
            r5 = move-exception
            goto L2e
        L2a:
            r5 = move-exception
            goto L32
        L2c:
            r5 = move-exception
            goto L36
        L2e:
            android.util.Log.e(r2, r0, r5)
            goto L39
        L32:
            android.util.Log.e(r2, r0, r5)
            goto L39
        L36:
            android.util.Log.e(r2, r0, r5)
        L39:
            return r1
        L3a:
            r3 = 2
            if (r0 != r3) goto L59
            java.lang.String r0 = r5.j
            if (r0 == 0) goto L4b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L48
            goto L4b
        L48:
            java.lang.String r5 = r5.j
            return r5
        L4b:
            java.lang.Object r5 = r5.b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = ":"
            java.lang.String[] r5 = r5.split(r0, r2)
            r0 = 0
            r5 = r5[r0]
            return r5
        L59:
            java.lang.String r0 = "called getResPackage() on "
            defpackage.e41.y(r5, r0)
            return r1
    }

    public final android.net.Uri e() {
            r5 = this;
            int r0 = r5.a
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L3a
            java.lang.Object r5 = r5.b
            java.lang.String r0 = "Unable to get icon uri"
            java.lang.String r1 = "IconCompat"
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L17
            android.net.Uri r5 = defpackage.pp.s(r5)
            return r5
        L17:
            java.lang.Class r3 = r5.getClass()     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L2c
            java.lang.String r4 = "getUri"
            java.lang.reflect.Method r3 = r3.getMethod(r4, r2)     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L2c
            java.lang.Object r5 = r3.invoke(r5, r2)     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L2c
            android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L2c
            return r5
        L28:
            r5 = move-exception
            goto L2e
        L2a:
            r5 = move-exception
            goto L32
        L2c:
            r5 = move-exception
            goto L36
        L2e:
            android.util.Log.e(r1, r0, r5)
            goto L39
        L32:
            android.util.Log.e(r1, r0, r5)
            goto L39
        L36:
            android.util.Log.e(r1, r0, r5)
        L39:
            return r2
        L3a:
            r1 = 4
            if (r0 == r1) goto L47
            r1 = 6
            if (r0 != r1) goto L41
            goto L47
        L41:
            java.lang.String r0 = "called getUri() on "
            defpackage.e41.y(r5, r0)
            return r2
        L47:
            java.lang.Object r5 = r5.b
            java.lang.String r5 = (java.lang.String) r5
            android.net.Uri r5 = android.net.Uri.parse(r5)
            return r5
    }

    public final android.graphics.drawable.Icon f(android.content.Context r8) {
            r7 = this;
            int r0 = r7.a
            r1 = 0
            r2 = 0
            r3 = 26
            switch(r0) {
                case -1: goto Lfc;
                case 0: goto L9;
                case 1: goto Le3;
                case 2: goto Ld8;
                case 3: goto Lcb;
                case 4: goto Lc2;
                case 5: goto Laa;
                case 6: goto Lf;
                default: goto L9;
            }
        L9:
            java.lang.String r7 = "Unknown type"
            defpackage.i.h(r7)
            return r1
        Lf:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            if (r0 < r4) goto L1f
            android.net.Uri r8 = r7.e()
            android.graphics.drawable.Icon r8 = defpackage.q2.b(r8)
            goto Leb
        L1f:
            if (r8 == 0) goto La0
            android.net.Uri r0 = r7.e()
            java.lang.String r4 = r0.getScheme()
            java.lang.String r5 = "content"
            boolean r5 = r5.equals(r4)
            java.lang.String r6 = "IconCompat"
            if (r5 != 0) goto L5e
            java.lang.String r5 = "file"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L3c
            goto L5e
        L3c:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L4b
            java.io.File r4 = new java.io.File     // Catch: java.io.FileNotFoundException -> L4b
            java.lang.Object r5 = r7.b     // Catch: java.io.FileNotFoundException -> L4b
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.io.FileNotFoundException -> L4b
            r4.<init>(r5)     // Catch: java.io.FileNotFoundException -> L4b
            r8.<init>(r4)     // Catch: java.io.FileNotFoundException -> L4b
            goto L7a
        L4b:
            r8 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to load image from path: "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.w(r6, r0, r8)
            goto L79
        L5e:
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch: java.lang.Exception -> L67
            java.io.InputStream r8 = r8.openInputStream(r0)     // Catch: java.lang.Exception -> L67
            goto L7a
        L67:
            r8 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to load image from URI: "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.w(r6, r0, r8)
        L79:
            r8 = r1
        L7a:
            if (r8 == 0) goto L96
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L89
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8)
            android.graphics.drawable.Icon r8 = defpackage.pt0.e(r8)
            goto Leb
        L89:
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8)
            android.graphics.Bitmap r8 = a(r8, r2)
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithBitmap(r8)
            goto Leb
        L96:
            java.lang.String r8 = "Cannot load adaptive icon from uri: "
            android.net.Uri r7 = r7.e()
            defpackage.e41.z(r7, r8)
            return r1
        La0:
            java.lang.String r8 = "Context is required to resolve the file uri of the icon: "
            android.net.Uri r7 = r7.e()
            defpackage.e41.A(r7, r8)
            return r1
        Laa:
            int r8 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r0 = r7.b
            if (r8 < r3) goto Lb7
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.drawable.Icon r8 = defpackage.pt0.e(r0)
            goto Leb
        Lb7:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.Bitmap r8 = a(r0, r2)
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithBitmap(r8)
            goto Leb
        Lc2:
            java.lang.Object r8 = r7.b
            java.lang.String r8 = (java.lang.String) r8
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithContentUri(r8)
            goto Leb
        Lcb:
            java.lang.Object r8 = r7.b
            byte[] r8 = (byte[]) r8
            int r0 = r7.e
            int r1 = r7.f
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithData(r8, r0, r1)
            goto Leb
        Ld8:
            java.lang.String r8 = r7.d()
            int r0 = r7.e
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithResource(r8, r0)
            goto Leb
        Le3:
            java.lang.Object r8 = r7.b
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithBitmap(r8)
        Leb:
            android.content.res.ColorStateList r0 = r7.g
            if (r0 == 0) goto Lf2
            r8.setTintList(r0)
        Lf2:
            android.graphics.PorterDuff$Mode r7 = r7.h
            android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.k
            if (r7 == r0) goto Lfb
            r8.setTintMode(r7)
        Lfb:
            return r8
        Lfc:
            java.lang.Object r7 = r7.b
            android.graphics.drawable.Icon r7 = (android.graphics.drawable.Icon) r7
            return r7
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.a
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r3 = r3.b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            return r3
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r3.a
            switch(r1) {
                case 1: goto L2a;
                case 2: goto L27;
                case 3: goto L24;
                case 4: goto L21;
                case 5: goto L1e;
                case 6: goto L1b;
                default: goto L18;
            }
        L18:
            java.lang.String r1 = "UNKNOWN"
            goto L2c
        L1b:
            java.lang.String r1 = "URI_MASKABLE"
            goto L2c
        L1e:
            java.lang.String r1 = "BITMAP_MASKABLE"
            goto L2c
        L21:
            java.lang.String r1 = "URI"
            goto L2c
        L24:
            java.lang.String r1 = "DATA"
            goto L2c
        L27:
            java.lang.String r1 = "RESOURCE"
            goto L2c
        L2a:
            java.lang.String r1 = "BITMAP"
        L2c:
            r0.append(r1)
            int r1 = r3.a
            switch(r1) {
                case 1: goto L7e;
                case 2: goto L59;
                case 3: goto L40;
                case 4: goto L35;
                case 5: goto L7e;
                case 6: goto L35;
                default: goto L34;
            }
        L34:
            goto L9e
        L35:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r3.b
            r0.append(r1)
            goto L9e
        L40:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r3.e
            r0.append(r1)
            int r1 = r3.f
            if (r1 == 0) goto L9e
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r3.f
            r0.append(r1)
            goto L9e
        L59:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r3.j
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            int r1 = r3.c()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L9e
        L7e:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r3.b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r3.b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            r0.append(r1)
        L9e:
            android.content.res.ColorStateList r1 = r3.g
            if (r1 == 0) goto Lac
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r3.g
            r0.append(r1)
        Lac:
            android.graphics.PorterDuff$Mode r1 = r3.h
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.k
            if (r1 == r2) goto Lbc
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r3 = r3.h
            r0.append(r3)
        Lbc:
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
