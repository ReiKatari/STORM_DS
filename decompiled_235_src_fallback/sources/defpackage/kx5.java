package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kx5  reason: default package */
/* loaded from: classes.dex */
public final class kx5 {
    public final android.content.Context a;
    public final defpackage.mp b;
    public final defpackage.nr1 c;
    public final java.util.Map d;

    public kx5(android.content.Context r2, defpackage.mp r3) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r3
            nr1 r2 = new nr1
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = 2
            r2.<init>(r3, r0)
            r1.c = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Map r2 = java.util.Collections.synchronizedMap(r2)
            r1.d = r2
            return
    }

    public static final android.graphics.Bitmap a(defpackage.kx5 r8, java.lang.String r9, defpackage.pq5 r10) {
            android.content.Context r0 = r8.a
            nr1 r1 = r8.c
            java.lang.Object r2 = r1.get(r9)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto Ld
            return r2
        Ld:
            mp r8 = r8.b
            byte[] r2 = r10.m
            android.net.Uri r3 = r10.d
            if (r2 == 0) goto L26
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
            r10 = 32
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r10, r10, r8)
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r2)
            r8.copyPixelsFromBuffer(r10)
            goto Lab
        L26:
            java.io.File r2 = r0.getExternalCacheDir()
            java.lang.String r4 = "rom_icons"
            r5 = 0
            if (r2 == 0) goto L35
            java.io.File r6 = new java.io.File
            r6.<init>(r2, r4)
            goto L36
        L35:
            r6 = r5
        L36:
            if (r6 == 0) goto L53
            boolean r2 = r6.isDirectory()
            r7 = 1
            if (r2 != r7) goto L53
            java.io.File r2 = new java.io.File
            r2.<init>(r6, r9)
            boolean r7 = r2.isFile()
            if (r7 == 0) goto L53
            java.lang.String r8 = r2.getAbsolutePath()
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeFile(r8)
            goto Lab
        L53:
            java.lang.String r2 = r10.c
            pw5 r2 = r8.c(r2)
            if (r2 != 0) goto L6d
            qi6 r2 = defpackage.zl1.g(r0, r3)
            pw5 r2 = r8.a(r2)
            if (r2 != 0) goto L6d
            pw5 r2 = r8.b(r3)
            if (r2 != 0) goto L6d
            r8 = r5
            goto Lab
        L6d:
            android.graphics.Bitmap r8 = r2.c(r10)
            if (r8 == 0) goto Lab
            if (r6 == 0) goto Lab
            java.io.File r10 = r0.getExternalCacheDir()
            if (r10 == 0) goto L80
            java.io.File r5 = new java.io.File
            r5.<init>(r10, r4)
        L80:
            if (r5 != 0) goto L83
            goto Lab
        L83:
            boolean r10 = r5.isDirectory()
            if (r10 != 0) goto L8f
            boolean r10 = r5.mkdirs()
            if (r10 == 0) goto Lab
        L8f:
            java.io.File r10 = new java.io.File
            r10.<init>(r5, r9)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> Lab
            r0.<init>(r10)     // Catch: java.lang.Exception -> Lab
            android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> La4
            r2 = 100
            r8.compress(r10, r2, r0)     // Catch: java.lang.Throwable -> La4
            r0.close()     // Catch: java.lang.Exception -> Lab
            goto Lab
        La4:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> La6
        La6:
            r2 = move-exception
            defpackage.ge7.t(r0, r10)     // Catch: java.lang.Exception -> Lab
            throw r2     // Catch: java.lang.Exception -> Lab
        Lab:
            if (r8 == 0) goto Lb0
            r1.put(r9, r8)
        Lb0:
            return r8
    }
}
