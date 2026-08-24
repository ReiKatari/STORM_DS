package com.google.mlkit.vision.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ImageConvertUtils {
    private static final com.google.mlkit.vision.common.internal.ImageConvertUtils zza = null;

    static {
            com.google.mlkit.vision.common.internal.ImageConvertUtils r0 = new com.google.mlkit.vision.common.internal.ImageConvertUtils
            r0.<init>()
            com.google.mlkit.vision.common.internal.ImageConvertUtils.zza = r0
            return
    }

    private ImageConvertUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.nio.ByteBuffer bufferWithBackingArray(java.nio.ByteBuffer r1) {
            boolean r0 = r1.hasArray()
            if (r0 == 0) goto L7
            return r1
        L7:
            r1.rewind()
            int r0 = r1.limit()
            byte[] r0 = new byte[r0]
            r1.get(r0)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)
            return r1
    }

    public static com.google.mlkit.vision.common.internal.ImageConvertUtils getInstance() {
            com.google.mlkit.vision.common.internal.ImageConvertUtils r0 = com.google.mlkit.vision.common.internal.ImageConvertUtils.zza
            return r0
    }

    public static android.graphics.Bitmap yv12ToBitmap(java.nio.ByteBuffer r1, int r2, int r3, int r4) {
            r0 = 1
            java.nio.ByteBuffer r1 = yv12ToNv21Buffer(r1, r0)
            byte[] r1 = r1.array()
            byte[] r1 = zzb(r1, r2, r3)
            int r2 = r1.length
            r3 = 0
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r3, r2)
            int r2 = r1.getWidth()
            int r3 = r1.getHeight()
            android.graphics.Bitmap r1 = zza(r1, r4, r2, r3)
            return r1
    }

    public static java.nio.ByteBuffer yv12ToNv21Buffer(java.nio.ByteBuffer r6, boolean r7) {
            r6.rewind()
            int r0 = r6.limit()
            int r1 = r0 / 6
            if (r7 == 0) goto L10
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r0)
            goto L14
        L10:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocateDirect(r0)
        L14:
            r0 = 0
            r2 = r0
        L16:
            int r3 = r1 * 4
            if (r2 >= r3) goto L24
            byte r3 = r6.get(r2)
            r7.put(r2, r3)
            int r2 = r2 + 1
            goto L16
        L24:
            int r2 = r1 + r1
            if (r0 >= r2) goto L3b
            int r2 = r3 + r0
            int r4 = r0 % 2
            int r4 = r4 * r1
            int r4 = r4 + r3
            int r5 = r0 / 2
            int r5 = r5 + r4
            byte r4 = r6.get(r5)
            r7.put(r2, r4)
            int r0 = r0 + 1
            goto L24
        L3b:
            return r7
    }

    public static android.graphics.Bitmap zza(android.graphics.Bitmap r7, int r8, int r9, int r10) {
            if (r8 != 0) goto L8
            r8 = 0
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r8, r8, r9, r10)
            return r7
        L8:
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            float r8 = (float) r8
            r5.postRotate(r8)
            r6 = 1
            r1 = 0
            r2 = 0
            r0 = r7
            r3 = r9
            r4 = r10
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static byte[] zzb(byte[] r8, int r9, int r10) {
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            android.graphics.YuvImage r2 = new android.graphics.YuvImage
            r4 = 17
            r7 = 0
            r3 = r8
            r5 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L3f
            r8.<init>()     // Catch: java.io.IOException -> L3f
            android.graphics.Rect r9 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L25
            r10 = 0
            r9.<init>(r10, r10, r5, r6)     // Catch: java.lang.Throwable -> L25
            r10 = 100
            r2.compressToJpeg(r9, r10, r8)     // Catch: java.lang.Throwable -> L25
            byte[] r9 = r8.toByteArray()     // Catch: java.lang.Throwable -> L25
            r8.close()     // Catch: java.io.IOException -> L3f
            return r9
        L25:
            r0 = move-exception
            r9 = r0
            r8.close()     // Catch: java.lang.Throwable -> L2b
            goto L3e
        L2b:
            r0 = move-exception
            r8 = r0
            java.lang.String r10 = "addSuppressed"
            java.lang.Class[] r0 = new java.lang.Class[]{r1}     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.Method r10 = r1.getDeclaredMethod(r10, r0)     // Catch: java.lang.Exception -> L3e
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Exception -> L3e
            r10.invoke(r9, r8)     // Catch: java.lang.Exception -> L3e
        L3e:
            throw r9     // Catch: java.io.IOException -> L3f
        L3f:
            r0 = move-exception
            r8 = r0
            java.lang.String r9 = "ImageConvertUtils"
            java.lang.String r10 = "Error closing ByteArrayOutputStream"
            android.util.Log.w(r9, r10)
            com.google.mlkit.common.MlKitException r9 = new com.google.mlkit.common.MlKitException
            java.lang.String r10 = "Image conversion error from NV21 format"
            r0 = 13
            r9.<init>(r10, r0, r8)
            throw r9
    }

    private static final void zzc(android.media.Image.Plane r7, int r8, int r9, byte[] r10, int r11, int r12) {
            java.nio.ByteBuffer r0 = r7.getBuffer()
            r0.rewind()
            int r1 = r0.limit()
            int r2 = r7.getRowStride()
            int r2 = r2 + r1
            int r2 = r2 + (-1)
            int r1 = r7.getRowStride()
            int r2 = r2 / r1
            if (r2 != 0) goto L1a
            goto L3c
        L1a:
            int r9 = r9 / r2
            int r8 = r8 / r9
            r9 = 0
            r1 = r9
            r3 = r1
        L1f:
            if (r1 >= r2) goto L3c
            r4 = r9
            r5 = r3
        L23:
            if (r4 >= r8) goto L34
            byte r6 = r0.get(r5)
            r10[r11] = r6
            int r11 = r11 + r12
            int r6 = r7.getPixelStride()
            int r5 = r5 + r6
            int r4 = r4 + 1
            goto L23
        L34:
            int r4 = r7.getRowStride()
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto L1f
        L3c:
            return
    }

    public byte[] byteBufferToByteArray(java.nio.ByteBuffer r3) {
            r2 = this;
            boolean r2 = r3.hasArray()
            if (r2 == 0) goto L11
            int r2 = r3.arrayOffset()
            if (r2 != 0) goto L11
            byte[] r2 = r3.array()
            return r2
        L11:
            r3.rewind()
            int r2 = r3.limit()
            byte[] r0 = new byte[r2]
            r1 = 0
            r3.get(r0, r1, r2)
            return r0
    }

    public java.nio.ByteBuffer cloneByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            int r2 = r3.capacity()
            int r0 = r3.position()
            boolean r1 = r3.isDirect()
            if (r1 == 0) goto L16
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            goto L1a
        L16:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
        L1a:
            int r1 = r3.limit()
            r2.limit(r1)
            java.nio.Buffer r1 = r3.rewind()
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r2.put(r1)
            r2.position(r0)
            r3.position(r0)
            return r2
    }

    public android.graphics.Bitmap convertJpegToUpRightBitmap(android.media.Image r4, int r5) {
            r3 = this;
            int r3 = r4.getFormat()
            r0 = 256(0x100, float:3.59E-43)
            r1 = 1
            r2 = 0
            if (r3 != r0) goto Lc
            r3 = r1
            goto Ld
        Lc:
            r3 = r2
        Ld:
            java.lang.String r0 = "Only JPEG is supported now"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r3, r0)
            android.media.Image$Plane[] r3 = r4.getPlanes()
            if (r3 == 0) goto L3e
            int r4 = r3.length
            if (r4 != r1) goto L3e
            r3 = r3[r2]
            java.nio.ByteBuffer r3 = r3.getBuffer()
            r3.rewind()
            int r4 = r3.remaining()
            byte[] r0 = new byte[r4]
            r3.get(r0)
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r0, r2, r4)
            int r4 = r3.getWidth()
            int r0 = r3.getHeight()
            android.graphics.Bitmap r3 = zza(r3, r5, r4, r0)
            return r3
        L3e:
            java.lang.String r3 = "Unexpected image format, JPEG should have exactly 1 image plane"
            defpackage.i.h(r3)
            r3 = 0
            return r3
    }

    public java.nio.ByteBuffer convertToNv21Buffer(com.google.mlkit.vision.common.InputImage r17, boolean r18) {
            r16 = this;
            r0 = r18
            int r1 = r17.getFormat()
            r2 = -1
            if (r1 == r2) goto L64
            r2 = 17
            if (r1 == r2) goto L48
            r2 = 35
            if (r1 == r2) goto L2f
            r2 = 842094169(0x32315659, float:1.0322389E-8)
            if (r1 != r2) goto L25
            java.nio.ByteBuffer r1 = r17.getByteBuffer()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            java.nio.ByteBuffer r0 = yv12ToNv21Buffer(r1, r0)
            return r0
        L25:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = "Unsupported image format"
            r2 = 13
            r0.<init>(r1, r2)
            throw r0
        L2f:
            android.media.Image$Plane[] r0 = r17.getPlanes()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.media.Image$Plane[] r0 = (android.media.Image.Plane[]) r0
            int r1 = r17.getWidth()
            int r2 = r17.getHeight()
            r3 = r16
            java.nio.ByteBuffer r0 = r3.yuv420ThreePlanesToNV21(r0, r1, r2)
            return r0
        L48:
            if (r0 == 0) goto L59
            java.nio.ByteBuffer r0 = r17.getByteBuffer()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteBuffer r0 = bufferWithBackingArray(r0)
            return r0
        L59:
            java.nio.ByteBuffer r0 = r17.getByteBuffer()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            return r0
        L64:
            android.graphics.Bitmap r1 = r17.getBitmapInternal()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L88
            android.graphics.Bitmap$Config r2 = r1.getConfig()
            android.graphics.Bitmap$Config r3 = defpackage.k2.A()
            if (r2 != r3) goto L88
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            boolean r3 = r1.isMutable()
            android.graphics.Bitmap r1 = r1.copy(r2, r3)
        L88:
            r2 = r1
            int r5 = r2.getWidth()
            int r9 = r2.getHeight()
            int r1 = r5 * r9
            int[] r3 = new int[r1]
            r6 = 0
            r7 = 0
            r4 = 0
            r8 = r5
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
            double r6 = (double) r9
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = r6 / r10
            double r6 = java.lang.Math.ceil(r6)
            int r2 = (int) r6
            double r6 = (double) r5
            double r6 = r6 / r10
            double r6 = java.lang.Math.ceil(r6)
            int r4 = (int) r6
            int r2 = r2 + r2
            int r2 = r2 * r4
            int r2 = r2 + r1
            if (r0 == 0) goto Lb6
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r2)
            goto Lba
        Lb6:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r2)
        Lba:
            r4 = 0
            r6 = 0
            r7 = 0
        Lbd:
            if (r4 >= r9) goto L126
            r8 = 0
        Lc0:
            if (r8 >= r5) goto L123
            r10 = r3[r7]
            int r11 = r10 >> 16
            int r12 = r10 >> 8
            r13 = 255(0xff, float:3.57E-43)
            r10 = r10 & r13
            int r14 = r6 + 1
            r11 = r11 & r13
            r12 = r12 & r13
            int r15 = r11 * 66
            int r2 = r12 * 129
            int r2 = r2 + r15
            int r15 = r10 * 25
            int r15 = r15 + r2
            int r15 = r15 + 128
            int r2 = r15 >> 8
            int r2 = r2 + 16
            int r2 = java.lang.Math.min(r13, r2)
            byte r2 = (byte) r2
            r0.put(r6, r2)
            int r2 = r4 % 2
            if (r2 != 0) goto L11d
            int r2 = r7 % 2
            if (r2 != 0) goto L11d
            int r2 = r12 * 94
            int r6 = r11 * 112
            int r12 = r12 * 74
            int r11 = r11 * (-38)
            int r6 = r6 - r2
            int r2 = r10 * 18
            int r11 = r11 - r12
            int r10 = r10 * 112
            int r6 = r6 - r2
            int r6 = r6 + 128
            int r11 = r11 + r10
            int r11 = r11 + 128
            int r2 = r6 >> 8
            int r6 = r11 >> 8
            int r2 = r2 + 128
            int r6 = r6 + 128
            int r10 = r1 + 1
            int r2 = java.lang.Math.min(r13, r2)
            byte r2 = (byte) r2
            r0.put(r1, r2)
            int r1 = r1 + 2
            int r2 = java.lang.Math.min(r13, r6)
            byte r2 = (byte) r2
            r0.put(r10, r2)
        L11d:
            int r7 = r7 + 1
            int r8 = r8 + 1
            r6 = r14
            goto Lc0
        L123:
            int r4 = r4 + 1
            goto Lbd
        L126:
            return r0
    }

    public android.graphics.Bitmap convertToUpRightBitmap(com.google.mlkit.vision.common.InputImage r4) {
            r3 = this;
            int r0 = r4.getFormat()
            r1 = -1
            if (r0 == r1) goto L7b
            r1 = 17
            if (r0 == r1) goto L60
            r1 = 35
            if (r0 == r1) goto L39
            r3 = 842094169(0x32315659, float:1.0322389E-8)
            if (r0 != r3) goto L2f
            java.nio.ByteBuffer r3 = r4.getByteBuffer()
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r0 = r4.getWidth()
            int r1 = r4.getHeight()
            int r4 = r4.getRotationDegrees()
            android.graphics.Bitmap r3 = yv12ToBitmap(r3, r0, r1, r4)
            return r3
        L2f:
            com.google.mlkit.common.MlKitException r3 = new com.google.mlkit.common.MlKitException
            java.lang.String r4 = "Unsupported image format"
            r0 = 13
            r3.<init>(r4, r0)
            throw r3
        L39:
            android.media.Image$Plane[] r0 = r4.getPlanes()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.media.Image$Plane[] r0 = (android.media.Image.Plane[]) r0
            int r1 = r4.getWidth()
            int r2 = r4.getHeight()
            java.nio.ByteBuffer r0 = r3.yuv420ThreePlanesToNV21(r0, r1, r2)
            int r1 = r4.getWidth()
            int r2 = r4.getHeight()
            int r4 = r4.getRotationDegrees()
            android.graphics.Bitmap r3 = r3.nv21ToBitmap(r0, r1, r2, r4)
            return r3
        L60:
            java.nio.ByteBuffer r0 = r4.getByteBuffer()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r1 = r4.getWidth()
            int r2 = r4.getHeight()
            int r4 = r4.getRotationDegrees()
            android.graphics.Bitmap r3 = r3.nv21ToBitmap(r0, r1, r2, r4)
            return r3
        L7b:
            android.graphics.Bitmap r3 = r4.getBitmapInternal()
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            int r0 = r4.getRotationDegrees()
            int r1 = r4.getWidth()
            int r4 = r4.getHeight()
            android.graphics.Bitmap r3 = zza(r3, r0, r1, r4)
            return r3
    }

    public android.graphics.Bitmap getUpRightBitmap(com.google.mlkit.vision.common.InputImage r3) {
            r2 = this;
            android.graphics.Bitmap r0 = r3.getBitmapInternal()
            if (r0 == 0) goto L17
            int r2 = r3.getRotationDegrees()
            int r1 = r3.getWidth()
            int r3 = r3.getHeight()
            android.graphics.Bitmap r2 = zza(r0, r2, r1, r3)
            return r2
        L17:
            android.graphics.Bitmap r2 = r2.convertToUpRightBitmap(r3)
            return r2
    }

    public android.graphics.Bitmap nv21ToBitmap(java.nio.ByteBuffer r1, int r2, int r3, int r4) {
            r0 = this;
            byte[] r0 = r0.byteBufferToByteArray(r1)
            byte[] r0 = zzb(r0, r2, r3)
            int r1 = r0.length
            r2 = 0
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r2, r1)
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            android.graphics.Bitmap r0 = zza(r0, r4, r1, r2)
            return r0
    }

    public java.nio.ByteBuffer yuv420ThreePlanesToNV21(android.media.Image.Plane[] r12, int r13, int r14) {
            r11 = this;
            int r4 = r13 * r14
            int r11 = r4 / 4
            int r11 = r11 + r11
            int r11 = r11 + r4
            byte[] r8 = new byte[r11]
            r11 = 1
            r0 = r12[r11]
            java.nio.ByteBuffer r0 = r0.getBuffer()
            r1 = 2
            r2 = r12[r1]
            java.nio.ByteBuffer r2 = r2.getBuffer()
            int r3 = r2.position()
            int r5 = r0.limit()
            int r6 = r3 + 1
            r2.position(r6)
            int r6 = r5 + (-1)
            r0.limit(r6)
            int r6 = r2.remaining()
            int r7 = r4 + r4
            int r7 = r7 / 4
            int r9 = r7 + (-2)
            r10 = 0
            if (r6 != r9) goto L3d
            int r6 = r2.compareTo(r0)
            if (r6 != 0) goto L3d
            r6 = r11
            goto L3e
        L3d:
            r6 = r10
        L3e:
            r2.position(r3)
            r0.limit(r5)
            if (r6 == 0) goto L65
            r13 = r12[r10]
            java.nio.ByteBuffer r13 = r13.getBuffer()
            r13.get(r8, r10, r4)
            r13 = r12[r11]
            java.nio.ByteBuffer r13 = r13.getBuffer()
            r12 = r12[r1]
            java.nio.ByteBuffer r12 = r12.getBuffer()
            r12.get(r8, r4, r11)
            int r4 = r4 + r11
            int r7 = r7 + (-1)
            r13.get(r8, r4, r7)
            goto L7f
        L65:
            r5 = r12[r10]
            r9 = 0
            r10 = 1
            r6 = r13
            r7 = r14
            zzc(r5, r6, r7, r8, r9, r10)
            r5 = r12[r11]
            int r9 = r4 + 1
            r10 = 2
            zzc(r5, r6, r7, r8, r9, r10)
            r0 = r12[r1]
            r5 = 2
            r1 = r6
            r2 = r7
            r3 = r8
            zzc(r0, r1, r2, r3, r4, r5)
        L7f:
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.wrap(r8)
            return r11
    }
}
