package com.google.mlkit.vision.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ImageUtils {
    private static final com.google.android.gms.common.internal.GmsLogger zza = null;
    private static final com.google.mlkit.vision.common.internal.ImageUtils zzb = null;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "MLKitImageUtils"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.mlkit.vision.common.internal.ImageUtils.zza = r0
            com.google.mlkit.vision.common.internal.ImageUtils r0 = new com.google.mlkit.vision.common.internal.ImageUtils
            r0.<init>()
            com.google.mlkit.vision.common.internal.ImageUtils.zzb = r0
            return
    }

    private ImageUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.mlkit.vision.common.internal.ImageUtils getInstance() {
            com.google.mlkit.vision.common.internal.ImageUtils r0 = com.google.mlkit.vision.common.internal.ImageUtils.zzb
            return r0
    }

    public defpackage.d13 getImageDataWrapper(com.google.mlkit.vision.common.InputImage r2) {
            r1 = this;
            int r1 = r2.getFormat()
            r0 = -1
            if (r1 == r0) goto L40
            r0 = 17
            if (r1 == r0) goto L30
            r0 = 35
            if (r1 == r0) goto L26
            r0 = 842094169(0x32315659, float:1.0322389E-8)
            if (r1 != r0) goto L15
            goto L30
        L15:
            com.google.mlkit.common.MlKitException r1 = new com.google.mlkit.common.MlKitException
            int r2 = r2.getFormat()
            java.lang.String r0 = "Unsupported image format: "
            java.lang.String r2 = defpackage.lb1.g(r2, r0)
            r0 = 3
            r1.<init>(r2, r0)
            throw r1
        L26:
            android.media.Image r1 = r2.getMediaImage()
            zh4 r2 = new zh4
            r2.<init>(r1)
            return r2
        L30:
            java.nio.ByteBuffer r1 = r2.getByteBuffer()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            zh4 r2 = new zh4
            r2.<init>(r1)
            return r2
        L40:
            android.graphics.Bitmap r1 = r2.getBitmapInternal()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            zh4 r2 = new zh4
            r2.<init>(r1)
            return r2
    }

    public int getMobileVisionImageFormat(com.google.mlkit.vision.common.InputImage r1) {
            r0 = this;
            int r0 = r1.getFormat()
            return r0
    }

    public int getMobileVisionImageSize(com.google.mlkit.vision.common.InputImage r3) {
            r2 = this;
            int r2 = r3.getFormat()
            r0 = -1
            if (r2 != r0) goto L16
            android.graphics.Bitmap r2 = r3.getBitmapInternal()
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            int r2 = r2.getAllocationByteCount()
            return r2
        L16:
            int r2 = r3.getFormat()
            r0 = 17
            if (r2 == r0) goto L4b
            int r2 = r3.getFormat()
            r0 = 842094169(0x32315659, float:1.0322389E-8)
            if (r2 != r0) goto L28
            goto L4b
        L28:
            int r2 = r3.getFormat()
            r0 = 35
            r1 = 0
            if (r2 == r0) goto L32
            return r1
        L32:
            android.media.Image$Plane[] r2 = r3.getPlanes()
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.media.Image$Plane[] r2 = (android.media.Image.Plane[]) r2
            r2 = r2[r1]
            java.nio.ByteBuffer r2 = r2.getBuffer()
            int r2 = r2.limit()
            int r2 = r2 * 3
            int r2 = r2 / 2
            return r2
        L4b:
            java.nio.ByteBuffer r2 = r3.getByteBuffer()
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.limit()
            return r2
    }

    public android.graphics.Matrix getUprightRotationMatrix(int r4, int r5, int r6) {
            r3 = this;
            if (r6 != 0) goto L4
            r3 = 0
            return r3
        L4:
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            int r0 = -r4
            int r1 = -r5
            float r1 = (float) r1
            float r0 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r1 = r1 / r2
            r3.postTranslate(r0, r1)
            int r0 = r6 * 90
            float r0 = (float) r0
            r3.postRotate(r0)
            int r6 = r6 % 2
            if (r6 == 0) goto L20
            r0 = r5
            goto L21
        L20:
            r0 = r4
        L21:
            if (r6 != 0) goto L24
            r4 = r5
        L24:
            float r5 = (float) r0
            float r5 = r5 / r2
            float r4 = (float) r4
            float r4 = r4 / r2
            r3.postTranslate(r5, r4)
            return r3
    }

    public final android.graphics.Bitmap zza(android.content.ContentResolver r10, android.net.Uri r11) {
            r9 = this;
            java.lang.String r9 = "MLKitImageUtils"
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            android.graphics.Bitmap r2 = android.provider.MediaStore.Images.Media.getBitmap(r10, r11)     // Catch: java.io.FileNotFoundException -> L25
            if (r2 == 0) goto Lcb
            java.lang.String r0 = "content"
            java.lang.String r3 = r11.getScheme()     // Catch: java.io.FileNotFoundException -> L25
            boolean r0 = r0.equals(r3)     // Catch: java.io.FileNotFoundException -> L25
            r3 = 0
            r4 = 0
            if (r0 != 0) goto L29
            java.lang.String r0 = "file"
            java.lang.String r5 = r11.getScheme()     // Catch: java.io.FileNotFoundException -> L25
            boolean r0 = r0.equals(r5)     // Catch: java.io.FileNotFoundException -> L25
            if (r0 != 0) goto L29
            goto L77
        L25:
            r0 = move-exception
            r10 = r0
            goto Ld3
        L29:
            java.io.InputStream r10 = r10.openInputStream(r11)     // Catch: java.io.IOException -> L50
            if (r10 == 0) goto L53
            r72 r0 = new r72     // Catch: java.lang.Throwable -> L36
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L36
            r1 = r0
            goto L54
        L36:
            r0 = move-exception
            r5 = r0
            r10.close()     // Catch: java.lang.Throwable -> L3c
            goto L4f
        L3c:
            r0 = move-exception
            r10 = r0
            java.lang.String r0 = "addSuppressed"
            java.lang.Class[] r6 = new java.lang.Class[]{r1}     // Catch: java.lang.Exception -> L4f
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r0, r6)     // Catch: java.lang.Exception -> L4f
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch: java.lang.Exception -> L4f
            r0.invoke(r5, r10)     // Catch: java.lang.Exception -> L4f
        L4f:
            throw r5     // Catch: java.io.IOException -> L50
        L50:
            r0 = move-exception
            r10 = r0
            goto L5d
        L53:
            r1 = r4
        L54:
            if (r10 == 0) goto L6d
            r10.close()     // Catch: java.io.IOException -> L5a
            goto L6d
        L5a:
            r0 = move-exception
            r10 = r0
            goto L5e
        L5d:
            r1 = r4
        L5e:
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.vision.common.internal.ImageUtils.zza     // Catch: java.io.FileNotFoundException -> L25
            java.lang.String r5 = java.lang.String.valueOf(r11)     // Catch: java.io.FileNotFoundException -> L25
            java.lang.String r6 = "failed to open file to read rotation meta data: "
            java.lang.String r5 = r6.concat(r5)     // Catch: java.io.FileNotFoundException -> L25
            r0.e(r9, r5, r10)     // Catch: java.io.FileNotFoundException -> L25
        L6d:
            if (r1 != 0) goto L70
            goto L77
        L70:
            java.lang.String r10 = "Orientation"
            r0 = 1
            int r3 = r1.c(r0, r10)     // Catch: java.io.FileNotFoundException -> L25
        L77:
            android.graphics.Matrix r10 = new android.graphics.Matrix     // Catch: java.io.FileNotFoundException -> L25
            r10.<init>()     // Catch: java.io.FileNotFoundException -> L25
            int r5 = r2.getWidth()     // Catch: java.io.FileNotFoundException -> L25
            int r6 = r2.getHeight()     // Catch: java.io.FileNotFoundException -> L25
            r0 = 1119092736(0x42b40000, float:90.0)
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r3) {
                case 2: goto Lb2;
                case 3: goto Lab;
                case 4: goto La7;
                case 5: goto La0;
                case 6: goto L9c;
                case 7: goto L95;
                case 8: goto L91;
                default: goto L8f;
            }     // Catch: java.io.FileNotFoundException -> L25
        L8f:
            r7 = r4
            goto Lbb
        L91:
            r10.postRotate(r1)     // Catch: java.io.FileNotFoundException -> L25
            goto Lb0
        L95:
            r10.postRotate(r1)     // Catch: java.io.FileNotFoundException -> L25
            r10.postScale(r8, r7)     // Catch: java.io.FileNotFoundException -> L25
            goto Lb0
        L9c:
            r10.postRotate(r0)     // Catch: java.io.FileNotFoundException -> L25
            goto Lb0
        La0:
            r10.postRotate(r0)     // Catch: java.io.FileNotFoundException -> L25
            r10.postScale(r8, r7)     // Catch: java.io.FileNotFoundException -> L25
            goto Lb0
        La7:
            r10.postScale(r7, r8)     // Catch: java.io.FileNotFoundException -> L25
            goto Lb0
        Lab:
            r0 = 1127481344(0x43340000, float:180.0)
            r10.postRotate(r0)     // Catch: java.io.FileNotFoundException -> L25
        Lb0:
            r7 = r10
            goto Lbb
        Lb2:
            android.graphics.Matrix r4 = new android.graphics.Matrix     // Catch: java.io.FileNotFoundException -> L25
            r4.<init>()     // Catch: java.io.FileNotFoundException -> L25
            r4.postScale(r8, r7)     // Catch: java.io.FileNotFoundException -> L25
            goto L8f
        Lbb:
            if (r7 == 0) goto Lca
            r4 = 0
            r8 = 1
            r3 = 0
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.FileNotFoundException -> L25
            if (r2 == r10) goto Lca
            r2.recycle()     // Catch: java.io.FileNotFoundException -> L25
            r2 = r10
        Lca:
            return r2
        Lcb:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.io.FileNotFoundException -> L25
            java.lang.String r0 = "The image Uri could not be resolved."
            r10.<init>(r0)     // Catch: java.io.FileNotFoundException -> L25
            throw r10     // Catch: java.io.FileNotFoundException -> L25
        Ld3:
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.vision.common.internal.ImageUtils.zza
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r1 = "Could not open file: "
            java.lang.String r11 = r1.concat(r11)
            r0.e(r9, r11, r10)
            throw r10
    }
}
