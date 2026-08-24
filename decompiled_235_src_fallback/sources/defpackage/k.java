package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k  reason: default package */
/* loaded from: classes.dex */
public abstract class k {
    public static final android.graphics.Bitmap.Config[] a = null;
    public static final android.graphics.Bitmap.Config b = null;
    public static final defpackage.yw2 c = null;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 26
            if (r0 < r3) goto L16
            r4 = 2
            android.graphics.Bitmap$Config[] r4 = new android.graphics.Bitmap.Config[r4]
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            r4[r2] = r5
            android.graphics.Bitmap$Config r5 = defpackage.k2.b()
            r4[r1] = r5
            goto L1c
        L16:
            android.graphics.Bitmap$Config[] r4 = new android.graphics.Bitmap.Config[r1]
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            r4[r2] = r1
        L1c:
            defpackage.k.a = r4
            if (r0 < r3) goto L25
            android.graphics.Bitmap$Config r0 = defpackage.k2.A()
            goto L27
        L25:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
        L27:
            defpackage.k.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 20
            r0.<init>(r1)
            yw2 r1 = new yw2
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1.<init>(r0)
            defpackage.k.c = r1
            return
    }

    public static final void a(java.io.Closeable r0) {
            r0.close()     // Catch: java.lang.Exception -> L3 java.lang.RuntimeException -> L4
        L3:
            return
        L4:
            r0 = move-exception
            throw r0
    }

    public static final java.lang.String b(android.webkit.MimeTypeMap r2, java.lang.String r3) {
            if (r3 == 0) goto L28
            boolean r0 = defpackage.qs6.v0(r3)
            if (r0 == 0) goto L9
            goto L28
        L9:
            r0 = 35
            java.lang.String r3 = defpackage.qs6.R0(r0, r3, r3)
            r0 = 63
            java.lang.String r3 = defpackage.qs6.R0(r0, r3, r3)
            r0 = 47
            java.lang.String r3 = defpackage.qs6.O0(r0, r3, r3)
            r0 = 46
            java.lang.String r1 = ""
            java.lang.String r3 = defpackage.qs6.O0(r0, r3, r1)
            java.lang.String r2 = r2.getMimeTypeFromExtension(r3)
            return r2
        L28:
            r2 = 0
            return r2
    }

    public static final boolean c(android.net.Uri r2) {
            java.lang.String r0 = r2.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L20
            java.util.List r2 = r2.getPathSegments()
            java.lang.Object r2 = defpackage.gt0.J0(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "android_asset"
            boolean r2 = defpackage.nb3.k(r2, r0)
            if (r2 == 0) goto L20
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
    }

    public static final int d(defpackage.ge7 r1, defpackage.y56 r2) {
            boolean r0 = r1 instanceof defpackage.pj1
            if (r0 == 0) goto L9
            pj1 r1 = (defpackage.pj1) r1
            int r1 = r1.m
            return r1
        L9:
            int[] r1 = defpackage.j.a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L20
            r2 = 2
            if (r1 != r2) goto L1b
            r1 = 2147483647(0x7fffffff, float:NaN)
            return r1
        L1b:
            defpackage.i.d()
            r1 = 0
            return r1
        L20:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            return r1
    }
}
