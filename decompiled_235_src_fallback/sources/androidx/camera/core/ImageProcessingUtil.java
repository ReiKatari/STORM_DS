package androidx.camera.core;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class ImageProcessingUtil {
    public static int a;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public enum a extends java.lang.Enum {
        private static final /* synthetic */ androidx.camera.core.ImageProcessingUtil.a[] $VALUES = null;
        public static final androidx.camera.core.ImageProcessingUtil.a ERROR_CONVERSION = null;
        public static final androidx.camera.core.ImageProcessingUtil.a SUCCESS = null;
        public static final androidx.camera.core.ImageProcessingUtil.a UNKNOWN = null;

        private static /* synthetic */ androidx.camera.core.ImageProcessingUtil.a[] $values() {
                androidx.camera.core.ImageProcessingUtil$a r0 = androidx.camera.core.ImageProcessingUtil.a.UNKNOWN
                androidx.camera.core.ImageProcessingUtil$a r1 = androidx.camera.core.ImageProcessingUtil.a.SUCCESS
                androidx.camera.core.ImageProcessingUtil$a r2 = androidx.camera.core.ImageProcessingUtil.a.ERROR_CONVERSION
                androidx.camera.core.ImageProcessingUtil$a[] r0 = new androidx.camera.core.ImageProcessingUtil.a[]{r0, r1, r2}
                return r0
        }

        static {
                androidx.camera.core.ImageProcessingUtil$a r0 = new androidx.camera.core.ImageProcessingUtil$a
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.ImageProcessingUtil.a.UNKNOWN = r0
                androidx.camera.core.ImageProcessingUtil$a r0 = new androidx.camera.core.ImageProcessingUtil$a
                java.lang.String r1 = "SUCCESS"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.ImageProcessingUtil.a.SUCCESS = r0
                androidx.camera.core.ImageProcessingUtil$a r0 = new androidx.camera.core.ImageProcessingUtil$a
                java.lang.String r1 = "ERROR_CONVERSION"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.core.ImageProcessingUtil.a.ERROR_CONVERSION = r0
                androidx.camera.core.ImageProcessingUtil$a[] r0 = $values()
                androidx.camera.core.ImageProcessingUtil.a.$VALUES = r0
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.ImageProcessingUtil.a valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.ImageProcessingUtil$a> r0 = androidx.camera.core.ImageProcessingUtil.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.ImageProcessingUtil$a r1 = (androidx.camera.core.ImageProcessingUtil.a) r1
                return r1
        }

        public static androidx.camera.core.ImageProcessingUtil.a[] values() {
                androidx.camera.core.ImageProcessingUtil$a[] r0 = androidx.camera.core.ImageProcessingUtil.a.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.ImageProcessingUtil$a[] r0 = (androidx.camera.core.ImageProcessingUtil.a[]) r0
                return r0
        }
    }

    static {
            java.lang.String r0 = "image_processing_util_jni"
            java.lang.System.loadLibrary(r0)
            return
    }

    public static void a(defpackage.s23 r15) {
            boolean r0 = e(r15)
            java.lang.String r1 = "ImageProcessingUtil"
            if (r0 != 0) goto Le
            java.lang.String r15 = "Unsupported format for YUV to RGB"
            defpackage.kj2.v(r1, r15)
            return
        Le:
            int r10 = r15.getWidth()
            int r11 = r15.getHeight()
            r23[] r0 = r15.j()
            r2 = 0
            r0 = r0[r2]
            int r3 = r0.m()
            r23[] r0 = r15.j()
            r4 = 1
            r0 = r0[r4]
            int r5 = r0.m()
            r23[] r0 = r15.j()
            r6 = 2
            r0 = r0[r6]
            int r7 = r0.m()
            r23[] r0 = r15.j()
            r0 = r0[r2]
            int r8 = r0.C()
            r23[] r0 = r15.j()
            r0 = r0[r4]
            int r9 = r0.C()
            r23[] r0 = r15.j()
            r0 = r0[r2]
            java.nio.ByteBuffer r2 = r0.a()
            r23[] r0 = r15.j()
            r0 = r0[r4]
            java.nio.ByteBuffer r4 = r0.a()
            r23[] r15 = r15.j()
            r15 = r15[r6]
            java.nio.ByteBuffer r6 = r15.a()
            r12 = r8
            r13 = r9
            r14 = r9
            int r15 = nativeShiftPixel(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r15 == 0) goto L75
            androidx.camera.core.ImageProcessingUtil$a r15 = androidx.camera.core.ImageProcessingUtil.a.ERROR_CONVERSION
            goto L77
        L75:
            androidx.camera.core.ImageProcessingUtil$a r15 = androidx.camera.core.ImageProcessingUtil.a.SUCCESS
        L77:
            androidx.camera.core.ImageProcessingUtil$a r0 = androidx.camera.core.ImageProcessingUtil.a.ERROR_CONVERSION
            if (r15 != r0) goto L80
            java.lang.String r15 = "One pixel shift for YUV failure"
            defpackage.kj2.v(r1, r15)
        L80:
            return
    }

    public static defpackage.x13 b(defpackage.s23 r22, defpackage.v23 r23, java.nio.ByteBuffer r24, int r25, boolean r26) {
            boolean r0 = e(r22)
            r1 = 0
            java.lang.String r2 = "ImageProcessingUtil"
            if (r0 != 0) goto Lf
            java.lang.String r0 = "Unsupported format for YUV to RGB"
            defpackage.kj2.v(r2, r0)
            return r1
        Lf:
            long r3 = java.lang.System.currentTimeMillis()
            boolean r0 = d(r25)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "Unsupported rotation degrees for rotate RGB"
            defpackage.kj2.v(r2, r0)
            return r1
        L1f:
            android.view.Surface r13 = r23.getSurface()
            int r15 = r22.getWidth()
            int r16 = r22.getHeight()
            r23[] r0 = r22.j()
            r5 = 0
            r0 = r0[r5]
            int r6 = r0.m()
            r23[] r0 = r22.j()
            r21 = 1
            r0 = r0[r21]
            int r8 = r0.m()
            r23[] r0 = r22.j()
            r7 = 2
            r0 = r0[r7]
            int r10 = r0.m()
            r23[] r0 = r22.j()
            r0 = r0[r5]
            int r11 = r0.C()
            r23[] r0 = r22.j()
            r0 = r0[r21]
            int r12 = r0.C()
            if (r26 == 0) goto L66
            r17 = r11
            goto L68
        L66:
            r17 = r5
        L68:
            if (r26 == 0) goto L6d
            r18 = r12
            goto L6f
        L6d:
            r18 = r5
        L6f:
            if (r26 == 0) goto L74
            r19 = r12
            goto L76
        L74:
            r19 = r5
        L76:
            r23[] r0 = r22.j()
            r0 = r0[r5]
            java.nio.ByteBuffer r0 = r0.a()
            r23[] r9 = r22.j()
            r9 = r9[r21]
            java.nio.ByteBuffer r9 = r9.a()
            r23[] r14 = r22.j()
            r7 = r14[r7]
            java.nio.ByteBuffer r7 = r7.a()
            r14 = r5
            r5 = r0
            r0 = r14
            r14 = r9
            r9 = r7
            r7 = r14
            r14 = r24
            r20 = r25
            int r5 = nativeConvertAndroid420ToABGR(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r5 == 0) goto La7
            androidx.camera.core.ImageProcessingUtil$a r5 = androidx.camera.core.ImageProcessingUtil.a.ERROR_CONVERSION
            goto La9
        La7:
            androidx.camera.core.ImageProcessingUtil$a r5 = androidx.camera.core.ImageProcessingUtil.a.SUCCESS
        La9:
            androidx.camera.core.ImageProcessingUtil$a r6 = androidx.camera.core.ImageProcessingUtil.a.ERROR_CONVERSION
            if (r5 != r6) goto Lb3
            java.lang.String r0 = "YUV to RGB conversion failure"
            defpackage.kj2.v(r2, r0)
            return r1
        Lb3:
            java.lang.String r5 = "MH"
            r6 = 3
            boolean r5 = android.util.Log.isLoggable(r5, r6)
            if (r5 == 0) goto Le4
            java.util.Locale r5 = java.util.Locale.US
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            int r3 = androidx.camera.core.ImageProcessingUtil.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "Image processing performance profiling, duration: ["
            r4.<init>(r7)
            r4.append(r5)
            java.lang.String r5 = "], image count: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            defpackage.kj2.t(r2, r3)
            int r3 = androidx.camera.core.ImageProcessingUtil.a
            int r3 = r3 + 1
            androidx.camera.core.ImageProcessingUtil.a = r3
        Le4:
            s23 r3 = r23.a()
            if (r3 != 0) goto Lf0
            java.lang.String r0 = "YUV to RGB acquireLatestImage failure"
            defpackage.kj2.v(r2, r0)
            return r1
        Lf0:
            x13 r1 = new x13
            r1.<init>(r3)
            o23 r2 = new o23
            r4 = r22
            r2.<init>(r3, r4, r0)
            r1.e(r2)
            return r1
    }

    public static void c(android.graphics.Bitmap r7, java.nio.ByteBuffer r8, int r9) {
            int r3 = r7.getRowBytes()
            int r4 = r7.getWidth()
            int r5 = r7.getHeight()
            r6 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            nativeCopyBetweenByteBufferAndBitmap(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static boolean d(int r1) {
            if (r1 == 0) goto L11
            r0 = 90
            if (r1 == r0) goto L11
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 == r0) goto L11
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }

    public static boolean e(defpackage.s23 r2) {
            int r0 = r2.getFormat()
            r1 = 35
            if (r0 != r1) goto L12
            r23[] r2 = r2.j()
            int r2 = r2.length
            r0 = 3
            if (r2 != r0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public static defpackage.x13 f(defpackage.s23 r27, defpackage.v23 r28, android.media.ImageWriter r29, java.nio.ByteBuffer r30, java.nio.ByteBuffer r31, java.nio.ByteBuffer r32, int r33) {
            boolean r0 = e(r27)
            r1 = 0
            java.lang.String r2 = "ImageProcessingUtil"
            if (r0 != 0) goto Lf
            java.lang.String r0 = "Unsupported format for rotate YUV"
            defpackage.kj2.v(r2, r0)
            return r1
        Lf:
            boolean r0 = d(r33)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "Unsupported rotation degrees for rotate YUV"
            defpackage.kj2.v(r2, r0)
            return r1
        L1b:
            androidx.camera.core.ImageProcessingUtil$a r0 = androidx.camera.core.ImageProcessingUtil.a.ERROR_CONVERSION
            r3 = 1
            if (r33 <= 0) goto Lff
            int r23 = r27.getWidth()
            int r24 = r27.getHeight()
            r23[] r4 = r27.j()
            r5 = 0
            r4 = r4[r5]
            int r4 = r4.m()
            r23[] r6 = r27.j()
            r6 = r6[r3]
            int r7 = r6.m()
            r23[] r6 = r27.j()
            r8 = 2
            r6 = r6[r8]
            int r9 = r6.m()
            r23[] r6 = r27.j()
            r6 = r6[r3]
            int r10 = r6.C()
            android.media.Image r6 = r29.dequeueInputImage()
            if (r6 != 0) goto L5a
            goto Lff
        L5a:
            r23[] r11 = r27.j()
            r11 = r11[r5]
            java.nio.ByteBuffer r11 = r11.a()
            r23[] r12 = r27.j()
            r12 = r12[r3]
            java.nio.ByteBuffer r12 = r12.a()
            r23[] r13 = r27.j()
            r13 = r13[r8]
            java.nio.ByteBuffer r13 = r13.a()
            android.media.Image$Plane[] r14 = r6.getPlanes()
            r14 = r14[r5]
            java.nio.ByteBuffer r14 = r14.getBuffer()
            android.media.Image$Plane[] r15 = r6.getPlanes()
            r15 = r15[r5]
            int r15 = r15.getRowStride()
            android.media.Image$Plane[] r16 = r6.getPlanes()
            r5 = r16[r5]
            int r5 = r5.getPixelStride()
            android.media.Image$Plane[] r16 = r6.getPlanes()
            r16 = r16[r3]
            java.nio.ByteBuffer r16 = r16.getBuffer()
            android.media.Image$Plane[] r17 = r6.getPlanes()
            r17 = r17[r3]
            int r17 = r17.getRowStride()
            android.media.Image$Plane[] r18 = r6.getPlanes()
            r18 = r18[r3]
            int r18 = r18.getPixelStride()
            android.media.Image$Plane[] r19 = r6.getPlanes()
            r19 = r19[r8]
            java.nio.ByteBuffer r19 = r19.getBuffer()
            android.media.Image$Plane[] r20 = r6.getPlanes()
            r20 = r20[r8]
            int r20 = r20.getRowStride()
            android.media.Image$Plane[] r21 = r6.getPlanes()
            r8 = r21[r8]
            int r8 = r8.getPixelStride()
            r21 = r31
            r22 = r32
            r25 = r33
            r26 = r1
            r1 = r6
            r6 = r12
            r12 = r15
            r15 = r17
            r17 = r19
            r19 = r8
            r8 = r13
            r13 = r5
            r5 = r4
            r4 = r11
            r11 = r14
            r14 = r16
            r16 = r18
            r18 = r20
            r20 = r30
            int r4 = nativeRotateYUV(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r4 == 0) goto Lf7
            goto L101
        Lf7:
            r4 = r29
            r4.queueInputImage(r1)
            androidx.camera.core.ImageProcessingUtil$a r1 = androidx.camera.core.ImageProcessingUtil.a.SUCCESS
            goto L102
        Lff:
            r26 = r1
        L101:
            r1 = r0
        L102:
            if (r1 != r0) goto L10a
            java.lang.String r0 = "rotate YUV failure"
            defpackage.kj2.v(r2, r0)
            return r26
        L10a:
            s23 r0 = r28.a()
            if (r0 != 0) goto L116
            java.lang.String r0 = "YUV rotation acquireLatestImage failure"
            defpackage.kj2.v(r2, r0)
            return r26
        L116:
            x13 r1 = new x13
            r1.<init>(r0)
            o23 r2 = new o23
            r4 = r27
            r2.<init>(r0, r4, r3)
            r1.e(r2)
            return r1
    }

    public static defpackage.x13 g(defpackage.s23 r25, java.nio.ByteBuffer r26, java.nio.ByteBuffer r27, java.nio.ByteBuffer r28, java.nio.ByteBuffer r29, java.nio.ByteBuffer r30, int r31) {
            r0 = r31
            boolean r1 = e(r25)
            java.lang.String r2 = "ImageProcessingUtil"
            r23 = 0
            if (r1 != 0) goto L12
            java.lang.String r0 = "Unsupported format for rotate YUV"
            defpackage.kj2.v(r2, r0)
            return r23
        L12:
            boolean r1 = d(r0)
            if (r1 != 0) goto L1e
            java.lang.String r0 = "Unsupported rotation degrees for rotate YUV"
            defpackage.kj2.v(r2, r0)
            return r23
        L1e:
            r1 = 1
            r3 = 2
            if (r0 != 0) goto L54
            r23[] r4 = r25.j()
            int r4 = r4.length
            r5 = 3
            if (r4 == r5) goto L2b
            goto L54
        L2b:
            r23[] r4 = r25.j()
            r4 = r4[r1]
            int r4 = r4.C()
            if (r4 == r3) goto L38
            goto L54
        L38:
            r23[] r4 = r25.j()
            r4 = r4[r3]
            java.nio.ByteBuffer r4 = r4.a()
            r23[] r5 = r25.j()
            r5 = r5[r1]
            java.nio.ByteBuffer r5 = r5.a()
            int r4 = nativeGetYUVImageVUOff(r4, r5)
            r5 = -1
            if (r4 != r5) goto L54
            return r23
        L54:
            int r4 = r0 % 180
            if (r4 != 0) goto L5e
            int r5 = r25.getWidth()
        L5c:
            r9 = r5
            goto L63
        L5e:
            int r5 = r25.getHeight()
            goto L5c
        L63:
            if (r4 != 0) goto L6c
            int r4 = r25.getHeight()
        L69:
            r24 = r4
            goto L71
        L6c:
            int r4 = r25.getWidth()
            goto L69
        L71:
            int r4 = r30.capacity()
            r10 = r30
            java.nio.ByteBuffer r11 = nativeNewDirectByteBuffer(r10, r1, r4)
            r23[] r4 = r25.j()
            r5 = 0
            r4 = r4[r5]
            java.nio.ByteBuffer r4 = r4.a()
            r23[] r6 = r25.j()
            r5 = r6[r5]
            int r5 = r5.m()
            r23[] r6 = r25.j()
            r6 = r6[r1]
            java.nio.ByteBuffer r6 = r6.a()
            r23[] r7 = r25.j()
            r1 = r7[r1]
            int r1 = r1.m()
            r23[] r7 = r25.j()
            r7 = r7[r3]
            java.nio.ByteBuffer r7 = r7.a()
            r23[] r8 = r25.j()
            r8 = r8[r3]
            int r8 = r8.m()
            r23[] r12 = r25.j()
            r3 = r12[r3]
            int r3 = r3.C()
            int r20 = r25.getWidth()
            int r21 = r25.getHeight()
            r10 = 1
            r13 = 2
            r16 = 2
            r12 = r9
            r15 = r9
            r14 = r4
            r4 = r1
            r1 = r14
            r17 = r26
            r18 = r27
            r19 = r28
            r14 = r30
            r22 = r0
            r0 = r2
            r2 = r5
            r5 = r7
            r7 = r3
            r3 = r6
            r6 = r8
            r8 = r29
            int r1 = nativeRotateYUV(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            if (r1 == 0) goto Lf1
            java.lang.String r1 = "rotate YUV failure"
            defpackage.kj2.v(r0, r1)
            return r23
        Lf1:
            x13 r0 = new x13
            q23 r6 = new q23
            r7 = r11
            r11 = r9
            r9 = r7
            r7 = r25
            r8 = r29
            r10 = r30
            r12 = r24
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.<init>(r6)
            return r0
    }

    public static void h(byte[] r0, android.view.Surface r1) {
            r1.getClass()
            int r0 = nativeWriteJpegToSurface(r0, r1)
            if (r0 == 0) goto L10
            java.lang.String r0 = "ImageProcessingUtil"
            java.lang.String r1 = "Failed to enqueue JPEG image."
            defpackage.kj2.v(r0, r1)
        L10:
            return
    }

    private static native int nativeConvertAndroid420ToABGR(java.nio.ByteBuffer r0, int r1, java.nio.ByteBuffer r2, int r3, java.nio.ByteBuffer r4, int r5, int r6, int r7, android.view.Surface r8, java.nio.ByteBuffer r9, int r10, int r11, int r12, int r13, int r14, int r15);

    private static native int nativeCopyBetweenByteBufferAndBitmap(android.graphics.Bitmap r0, java.nio.ByteBuffer r1, int r2, int r3, int r4, int r5, boolean r6);

    public static native int nativeGetYUVImageVUOff(java.nio.ByteBuffer r0, java.nio.ByteBuffer r1);

    public static native java.nio.ByteBuffer nativeNewDirectByteBuffer(java.nio.ByteBuffer r0, int r1, int r2);

    private static native int nativeRotateYUV(java.nio.ByteBuffer r0, int r1, java.nio.ByteBuffer r2, int r3, java.nio.ByteBuffer r4, int r5, int r6, java.nio.ByteBuffer r7, int r8, int r9, java.nio.ByteBuffer r10, int r11, int r12, java.nio.ByteBuffer r13, int r14, int r15, java.nio.ByteBuffer r16, java.nio.ByteBuffer r17, java.nio.ByteBuffer r18, int r19, int r20, int r21);

    private static native int nativeShiftPixel(java.nio.ByteBuffer r0, int r1, java.nio.ByteBuffer r2, int r3, java.nio.ByteBuffer r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12);

    private static native int nativeWriteJpegToSurface(byte[] r0, android.view.Surface r1);
}
