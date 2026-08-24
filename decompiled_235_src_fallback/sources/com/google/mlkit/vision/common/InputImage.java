package com.google.mlkit.vision.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class InputImage implements com.google.mlkit.common.sdkinternal.MLTaskInput {
    public static final int IMAGE_FORMAT_BITMAP = -1;
    public static final int IMAGE_FORMAT_NV21 = 17;
    public static final int IMAGE_FORMAT_YUV_420_888 = 35;
    public static final int IMAGE_FORMAT_YV12 = 842094169;
    private volatile android.graphics.Bitmap zza;
    private volatile java.nio.ByteBuffer zzb;
    private volatile com.google.mlkit.vision.common.zzb zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final android.graphics.Matrix zzh;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface ImageFormat {
    }

    private InputImage(android.graphics.Bitmap r2, int r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r1.zza = r0
            int r0 = r2.getWidth()
            r1.zzd = r0
            int r2 = r2.getHeight()
            r1.zze = r2
            zza(r3)
            r1.zzf = r3
            r2 = -1
            r1.zzg = r2
            r2 = 0
            r1.zzh = r2
            return
    }

    private InputImage(android.media.Image r2, int r3, int r4, int r5, android.graphics.Matrix r6) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.mlkit.vision.common.zzb r0 = new com.google.mlkit.vision.common.zzb
            r0.<init>(r2)
            r1.zzc = r0
            r1.zzd = r3
            r1.zze = r4
            zza(r5)
            r1.zzf = r5
            r2 = 35
            r1.zzg = r2
            r1.zzh = r6
            return
    }

    private InputImage(java.nio.ByteBuffer r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            r4.<init>()
            r0 = 842094169(0x32315659, float:1.0322389E-8)
            r1 = 0
            r2 = 1
            if (r9 == r0) goto Lf
            r0 = 17
            if (r9 != r0) goto L11
            r9 = r0
        Lf:
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r4.zzb = r0
            int r0 = r5.limit()
            int r3 = r6 * r7
            if (r0 <= r3) goto L26
            r1 = r2
        L26:
            java.lang.String r0 = "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
            r5.rewind()
            r4.zzd = r6
            r4.zze = r7
            zza(r8)
            r4.zzf = r8
            r4.zzg = r9
            r5 = 0
            r4.zzh = r5
            return
    }

    public static com.google.mlkit.vision.common.InputImage fromBitmap(android.graphics.Bitmap r9, int r10) {
            long r2 = android.os.SystemClock.elapsedRealtime()
            com.google.mlkit.vision.common.InputImage r8 = new com.google.mlkit.vision.common.InputImage
            r8.<init>(r9, r10)
            int r4 = r9.getHeight()
            int r5 = r9.getWidth()
            int r6 = r9.getAllocationByteCount()
            r0 = -1
            r1 = 1
            r7 = r10
            zzc(r0, r1, r2, r4, r5, r6, r7)
            return r8
    }

    public static com.google.mlkit.vision.common.InputImage fromByteArray(byte[] r10, int r11, int r12, int r13, int r14) {
            long r2 = android.os.SystemClock.elapsedRealtime()
            com.google.mlkit.vision.common.InputImage r4 = new com.google.mlkit.vision.common.InputImage
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)
            byte[] r0 = (byte[]) r0
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r0)
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = r4
            r5 = r6
            r4 = r7
            r7 = r8
            r0 = r9
            int r6 = r10.length
            r1 = 2
            zzc(r0, r1, r2, r4, r5, r6, r7)
            return r11
    }

    public static com.google.mlkit.vision.common.InputImage fromByteBuffer(java.nio.ByteBuffer r10, int r11, int r12, int r13, int r14) {
            long r2 = android.os.SystemClock.elapsedRealtime()
            com.google.mlkit.vision.common.InputImage r4 = new com.google.mlkit.vision.common.InputImage
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r10 = r4
            r4 = r7
            r7 = r8
            r0 = r9
            int r11 = r5.limit()
            r1 = 3
            r5 = r6
            r6 = r11
            zzc(r0, r1, r2, r4, r5, r6, r7)
            return r10
    }

    public static com.google.mlkit.vision.common.InputImage fromFilePath(android.content.Context r9, android.net.Uri r10) {
            java.lang.String r0 = "Please provide a valid Context"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9, r0)
            java.lang.String r0 = "Please provide a valid imageUri"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r10, r0)
            long r3 = android.os.SystemClock.elapsedRealtime()
            com.google.mlkit.vision.common.internal.ImageUtils r0 = com.google.mlkit.vision.common.internal.ImageUtils.getInstance()
            android.content.ContentResolver r9 = r9.getContentResolver()
            android.graphics.Bitmap r9 = r0.zza(r9, r10)
            com.google.mlkit.vision.common.InputImage r10 = new com.google.mlkit.vision.common.InputImage
            r0 = 0
            r10.<init>(r9, r0)
            int r5 = r9.getHeight()
            int r6 = r9.getWidth()
            int r7 = r9.getAllocationByteCount()
            r8 = 0
            r1 = -1
            r2 = 4
            zzc(r1, r2, r3, r5, r6, r7, r8)
            return r10
    }

    public static com.google.mlkit.vision.common.InputImage fromMediaImage(android.media.Image r1, int r2) {
            r0 = 0
            com.google.mlkit.vision.common.InputImage r1 = zzb(r1, r2, r0)
            return r1
    }

    public static com.google.mlkit.vision.common.InputImage fromMediaImage(android.media.Image r2, int r3, android.graphics.Matrix r4) {
            int r0 = r2.getFormat()
            r1 = 35
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r1 = "Only YUV_420_888 is supported now"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            com.google.mlkit.vision.common.InputImage r2 = zzb(r2, r3, r4)
            return r2
    }

    private static int zza(int r2) {
            r0 = 1
            if (r2 == 0) goto L12
            r1 = 90
            if (r2 == r1) goto L12
            r1 = 180(0xb4, float:2.52E-43)
            if (r2 == r1) goto L12
            r1 = 270(0x10e, float:3.78E-43)
            if (r2 != r1) goto L11
            r2 = r1
            goto L12
        L11:
            r0 = 0
        L12:
            java.lang.String r1 = "Invalid rotation. Only 0, 90, 180, 270 are supported currently."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            return r2
    }

    private static com.google.mlkit.vision.common.InputImage zzb(android.media.Image r12, int r13, android.graphics.Matrix r14) {
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r0 = "Please provide a valid image"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12, r0)
            zza(r13)
            int r0 = r12.getFormat()
            r1 = 1
            r4 = 0
            r5 = 256(0x100, float:3.59E-43)
            if (r0 == r5) goto L20
            int r0 = r12.getFormat()
            r6 = 35
            if (r0 != r6) goto L1f
            goto L20
        L1f:
            r1 = r4
        L20:
            java.lang.String r0 = "Only JPEG and YUV_420_888 are supported now"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
            android.media.Image$Plane[] r0 = r12.getPlanes()
            int r1 = r12.getFormat()
            if (r1 != r5) goto L4f
            android.media.Image$Plane[] r14 = r12.getPlanes()
            r14 = r14[r4]
            java.nio.ByteBuffer r14 = r14.getBuffer()
            int r14 = r14.limit()
            com.google.mlkit.vision.common.InputImage r0 = new com.google.mlkit.vision.common.InputImage
            com.google.mlkit.vision.common.internal.ImageConvertUtils r1 = com.google.mlkit.vision.common.internal.ImageConvertUtils.getInstance()
            android.graphics.Bitmap r1 = r1.convertJpegToUpRightBitmap(r12, r13)
            r0.<init>(r1, r4)
            r7 = r12
            r10 = r13
            r12 = r0
        L4d:
            r6 = r14
            goto L89
        L4f:
            int r1 = r0.length
            r5 = r4
        L51:
            if (r5 >= r1) goto L65
            r6 = r0[r5]
            java.nio.ByteBuffer r7 = r6.getBuffer()
            if (r7 == 0) goto L62
            java.nio.ByteBuffer r6 = r6.getBuffer()
            r6.rewind()
        L62:
            int r5 = r5 + 1
            goto L51
        L65:
            com.google.mlkit.vision.common.InputImage r6 = new com.google.mlkit.vision.common.InputImage
            int r8 = r12.getWidth()
            int r9 = r12.getHeight()
            r7 = r12
            r10 = r13
            r11 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            android.media.Image$Plane[] r12 = r7.getPlanes()
            r12 = r12[r4]
            java.nio.ByteBuffer r12 = r12.getBuffer()
            int r12 = r12.limit()
            int r12 = r12 * 3
            int r14 = r12 / 2
            r12 = r6
            goto L4d
        L89:
            int r0 = r7.getFormat()
            int r4 = r7.getHeight()
            int r5 = r7.getWidth()
            r1 = 5
            r7 = r10
            zzc(r0, r1, r2, r4, r5, r6, r7)
            return r12
    }

    private static void zzc(int r10, int r11, long r12, int r14, int r15, int r16, int r17) {
            java.lang.String r0 = "vision-common"
            com.google.android.gms.internal.mlkit_vision_common.zzmj r1 = com.google.android.gms.internal.mlkit_vision_common.zzms.zzb(r0)
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            com.google.android.gms.internal.mlkit_vision_common.zzmu.zza(r1, r2, r3, r4, r6, r7, r8, r9)
            return
    }

    public android.graphics.Bitmap getBitmapInternal() {
            r0 = this;
            android.graphics.Bitmap r0 = r0.zza
            return r0
    }

    public java.nio.ByteBuffer getByteBuffer() {
            r0 = this;
            java.nio.ByteBuffer r0 = r0.zzb
            return r0
    }

    public android.graphics.Matrix getCoordinatesMatrix() {
            r0 = this;
            android.graphics.Matrix r0 = r0.zzh
            return r0
    }

    public int getFormat() {
            r0 = this;
            int r0 = r0.zzg
            return r0
    }

    public int getHeight() {
            r0 = this;
            int r0 = r0.zze
            return r0
    }

    public android.media.Image getMediaImage() {
            r1 = this;
            com.google.mlkit.vision.common.zzb r0 = r1.zzc
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            com.google.mlkit.vision.common.zzb r1 = r1.zzc
            android.media.Image r1 = r1.zza()
            return r1
    }

    public android.media.Image.Plane[] getPlanes() {
            r1 = this;
            com.google.mlkit.vision.common.zzb r0 = r1.zzc
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            com.google.mlkit.vision.common.zzb r1 = r1.zzc
            android.media.Image$Plane[] r1 = r1.zzb()
            return r1
    }

    public int getRotationDegrees() {
            r0 = this;
            int r0 = r0.zzf
            return r0
    }

    public int getWidth() {
            r0 = this;
            int r0 = r0.zzd
            return r0
    }
}
