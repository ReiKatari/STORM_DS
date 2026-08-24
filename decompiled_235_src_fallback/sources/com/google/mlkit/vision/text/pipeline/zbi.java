package com.google.mlkit.vision.text.pipeline;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbi {
    com.google.mlkit.vision.text.pipeline.zbh zba;
    boolean zbb;
    private final android.content.Context zbc;
    private final com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions zbd;
    private boolean zbe;

    private zbi(android.content.Context r2, com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zbe = r0
            r1.zbc = r2
            r1.zbd = r3
            return
    }

    public static com.google.mlkit.vision.text.pipeline.zbi zba(android.content.Context r1, com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions r2) {
            com.google.mlkit.vision.text.pipeline.zbi r0 = new com.google.mlkit.vision.text.pipeline.zbi
            r0.<init>(r1, r2)
            return r0
    }

    public final com.google.mlkit.vision.text.pipeline.zbn zbb(defpackage.d13 r27, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx r28, boolean r29) {
            r26 = this;
            r0 = r26
            r1 = r28
            java.lang.String r2 = "Unsupported image format: "
            java.lang.String r3 = "Input bitmap is not ARGB_8888 config. Converting it to ARGB_8888 from "
            com.google.mlkit.vision.text.pipeline.zbo r4 = r0.zbc()
            boolean r5 = r4.zbd()
            if (r5 != 0) goto L17
            com.google.mlkit.vision.text.pipeline.zbn r0 = com.google.mlkit.vision.text.pipeline.zbn.zbe(r4)
            return r0
        L17:
            r4 = 2
            int r5 = r1.zbb()     // Catch: com.google.mlkit.common.MlKitException -> L57
            r6 = -1
            r7 = 1000(0x3e8, double:4.94E-321)
            r9 = 3
            java.lang.String r10 = "PipelineManager"
            r11 = 0
            r12 = 1
            if (r5 != r6) goto L75
            java.lang.String r2 = "Start process bitmap"
            android.util.Log.d(r10, r2)     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r2 = defpackage.zh4.d(r27)     // Catch: com.google.mlkit.common.MlKitException -> L57
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: com.google.mlkit.common.MlKitException -> L57
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch: com.google.mlkit.common.MlKitException -> L57
            android.graphics.Bitmap$Config r5 = r2.getConfig()     // Catch: com.google.mlkit.common.MlKitException -> L57
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: com.google.mlkit.common.MlKitException -> L57
            if (r5 == r6) goto L5a
            android.graphics.Bitmap$Config r5 = r2.getConfig()     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.String r3 = r3.concat(r5)     // Catch: com.google.mlkit.common.MlKitException -> L57
            android.util.Log.d(r10, r3)     // Catch: com.google.mlkit.common.MlKitException -> L57
            boolean r3 = r2.isMutable()     // Catch: com.google.mlkit.common.MlKitException -> L57
            android.graphics.Bitmap r2 = r2.copy(r6, r3)     // Catch: com.google.mlkit.common.MlKitException -> L57
            goto L5a
        L57:
            r0 = move-exception
            goto L455
        L5a:
            com.google.mlkit.vision.text.pipeline.zbh r3 = r0.zba     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: com.google.mlkit.common.MlKitException -> L57
            com.google.mlkit.vision.text.pipeline.zbh r3 = (com.google.mlkit.vision.text.pipeline.zbh) r3     // Catch: com.google.mlkit.common.MlKitException -> L57
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: com.google.mlkit.common.MlKitException -> L57
            long r5 = r5 * r7
            int r7 = r1.zbc()     // Catch: com.google.mlkit.common.MlKitException -> L57
            int r7 = com.google.mlkit.vision.text.pipeline.zbj.zbb(r7)     // Catch: com.google.mlkit.common.MlKitException -> L57
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r2 = r3.zbi(r5, r2, r7)     // Catch: com.google.mlkit.common.MlKitException -> L57
            goto L156
        L75:
            int r3 = r1.zbb()     // Catch: com.google.mlkit.common.MlKitException -> L57
            r5 = 35
            if (r3 != r5) goto Lfc
            java.lang.String r2 = "Start process YUV"
            android.util.Log.d(r10, r2)     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r2 = defpackage.zh4.d(r27)     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: com.google.mlkit.common.MlKitException -> L57
            android.media.Image r2 = (android.media.Image) r2     // Catch: com.google.mlkit.common.MlKitException -> L57
            android.media.Image$Plane[] r2 = r2.getPlanes()     // Catch: com.google.mlkit.common.MlKitException -> L57
            com.google.mlkit.vision.text.pipeline.zbh r3 = r0.zba     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: com.google.mlkit.common.MlKitException -> L57
            r13 = r3
            com.google.mlkit.vision.text.pipeline.zbh r13 = (com.google.mlkit.vision.text.pipeline.zbh) r13     // Catch: com.google.mlkit.common.MlKitException -> L57
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: com.google.mlkit.common.MlKitException -> L57
            long r14 = r5 * r7
            r3 = r2[r11]     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: com.google.mlkit.common.MlKitException -> L57
            android.media.Image$Plane r3 = (android.media.Image.Plane) r3     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.nio.ByteBuffer r16 = r3.getBuffer()     // Catch: com.google.mlkit.common.MlKitException -> L57
            r3 = r2[r12]     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: com.google.mlkit.common.MlKitException -> L57
            android.media.Image$Plane r3 = (android.media.Image.Plane) r3     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.nio.ByteBuffer r17 = r3.getBuffer()     // Catch: com.google.mlkit.common.MlKitException -> L57
            r3 = r2[r4]     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: com.google.mlkit.common.MlKitException -> L57
            android.media.Image$Plane r3 = (android.media.Image.Plane) r3     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.nio.ByteBuffer r18 = r3.getBuffer()     // Catch: com.google.mlkit.common.MlKitException -> L57
            int r19 = r1.zbd()     // Catch: com.google.mlkit.common.MlKitException -> L57
            int r20 = r1.zba()     // Catch: com.google.mlkit.common.MlKitException -> L57
            r3 = r2[r11]     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: com.google.mlkit.common.MlKitException -> L57
            android.media.Image$Plane r3 = (android.media.Image.Plane) r3     // Catch: com.google.mlkit.common.MlKitException -> L57
            int r21 = r3.getRowStride()     // Catch: com.google.mlkit.common.MlKitException -> L57
            r3 = r2[r12]     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: com.google.mlkit.common.MlKitException -> L57
            android.media.Image$Plane r3 = (android.media.Image.Plane) r3     // Catch: com.google.mlkit.common.MlKitException -> L57
            int r22 = r3.getRowStride()     // Catch: com.google.mlkit.common.MlKitException -> L57
            r2 = r2[r12]     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: com.google.mlkit.common.MlKitException -> L57
            android.media.Image$Plane r2 = (android.media.Image.Plane) r2     // Catch: com.google.mlkit.common.MlKitException -> L57
            int r23 = r2.getPixelStride()     // Catch: com.google.mlkit.common.MlKitException -> L57
            int r2 = r1.zbc()     // Catch: com.google.mlkit.common.MlKitException -> L57
            int r24 = com.google.mlkit.vision.text.pipeline.zbj.zbb(r2)     // Catch: com.google.mlkit.common.MlKitException -> L57
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r2 = r13.zbj(r14, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch: com.google.mlkit.common.MlKitException -> L57
            goto L156
        Lfc:
            int r3 = r1.zbb()     // Catch: com.google.mlkit.common.MlKitException -> L57
            r5 = 17
            if (r3 != r5) goto L12a
            java.lang.String r2 = "Start process NV21"
            android.util.Log.d(r10, r2)     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r2 = defpackage.zh4.d(r27)     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.nio.ByteBuffer r2 = com.google.mlkit.vision.common.internal.ImageConvertUtils.bufferWithBackingArray(r2)     // Catch: com.google.mlkit.common.MlKitException -> L57
            com.google.mlkit.vision.text.pipeline.zbh r3 = r0.zba     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: com.google.mlkit.common.MlKitException -> L57
            com.google.mlkit.vision.text.pipeline.zbh r3 = (com.google.mlkit.vision.text.pipeline.zbh) r3     // Catch: com.google.mlkit.common.MlKitException -> L57
            r08 r2 = com.google.mlkit.vision.text.pipeline.zbj.zba(r2, r1)     // Catch: com.google.mlkit.common.MlKitException -> L57
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r2 = r3.zbe(r2)     // Catch: com.google.mlkit.common.MlKitException -> L57
            goto L156
        L12a:
            int r3 = r1.zbb()     // Catch: com.google.mlkit.common.MlKitException -> L57
            r5 = 842094169(0x32315659, float:1.0322389E-8)
            if (r3 != r5) goto L43f
            java.lang.String r2 = "Start process YV12"
            android.util.Log.d(r10, r2)     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r2 = defpackage.zh4.d(r27)     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.nio.ByteBuffer r2 = com.google.mlkit.vision.common.internal.ImageConvertUtils.yv12ToNv21Buffer(r2, r12)     // Catch: com.google.mlkit.common.MlKitException -> L57
            com.google.mlkit.vision.text.pipeline.zbh r3 = r0.zba     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: com.google.mlkit.common.MlKitException -> L57
            com.google.mlkit.vision.text.pipeline.zbh r3 = (com.google.mlkit.vision.text.pipeline.zbh) r3     // Catch: com.google.mlkit.common.MlKitException -> L57
            r08 r2 = com.google.mlkit.vision.text.pipeline.zbj.zba(r2, r1)     // Catch: com.google.mlkit.common.MlKitException -> L57
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r2 = r3.zbe(r2)     // Catch: com.google.mlkit.common.MlKitException -> L57
        L156:
            boolean r3 = r2.zbc()
            if (r3 != 0) goto L16c
            android.os.RemoteException r0 = new android.os.RemoteException
            java.lang.String r1 = "VisionKit pipeline returns empty result."
            r0.<init>(r1)
            com.google.mlkit.vision.text.pipeline.zbo r0 = com.google.mlkit.vision.text.pipeline.zbo.zbc(r9, r0)
            com.google.mlkit.vision.text.pipeline.zbn r0 = com.google.mlkit.vision.text.pipeline.zbn.zbe(r0)
            return r0
        L16c:
            java.lang.String r3 = "OCR process succeeded via visionkit pipeline."
            android.util.Log.d(r10, r3)
            java.lang.Object r2 = r2.zba()
            j18 r2 = (defpackage.j18) r2
            com.google.mlkit.vision.common.internal.ImageUtils r3 = com.google.mlkit.vision.common.internal.ImageUtils.getInstance()
            int r4 = r1.zbd()
            int r5 = r1.zba()
            int r1 = r1.zbc()
            android.graphics.Matrix r1 = r3.getUprightRotationMatrix(r4, r5, r1)
            boolean r3 = r0.zbe
            com.google.mlkit.vision.text.pipeline.zba r4 = new com.google.mlkit.vision.text.pipeline.zba
            com.google.mlkit.vision.text.pipeline.zbb r5 = new com.google.mlkit.vision.text.pipeline.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki.zbd()
            r5.<init>(r11, r6)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbabl r2 = r2.zbe()
            java.util.List r2 = r2.zbf()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Iterator r10 = r2.iterator()
        L1b3:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L219
            java.lang.Object r13 = r10.next()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbabj r13 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbabj) r13
            int r14 = r13.zbI()
            r15 = 6
            if (r14 != r15) goto L1b3
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaaj r14 = r13.zbf()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb r14 = com.google.mlkit.vision.text.pipeline.zbf.zbb(r14)
            java.util.List r15 = com.google.mlkit.vision.text.pipeline.zbf.zbc(r14)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboo r16 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboo
            r17 = r16
            java.lang.String r16 = r13.zbH()
            r18 = r17
            android.graphics.Rect r17 = com.google.mlkit.vision.text.pipeline.zbf.zba(r15, r1)
            float r19 = r13.zbc()
            float r20 = r14.zba()
            r25 = r18
            r18 = r15
            r15 = r25
            r15.<init>(r16, r17, r18, r19, r20)
            int r13 = r13.zbe()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            boolean r14 = r7.containsKey(r13)
            if (r14 == 0) goto L206
            java.lang.Object r13 = r7.get(r13)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku r13 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku) r13
            goto L20f
        L206:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku r14 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku
            r14.<init>()
            r7.put(r13, r14)
            r13 = r14
        L20f:
            java.lang.Object r13 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku r13 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku) r13
            r13.zba(r15)
            goto L1b3
        L219:
            r10 = r11
        L21a:
            int r13 = r2.size()
            if (r10 >= r13) goto L2b8
            java.lang.Object r13 = r2.get(r10)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbabj r13 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbabj) r13
            int r14 = r13.zbI()
            if (r14 == r12) goto L22e
            goto L2b3
        L22e:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaaj r14 = r13.zbf()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb r14 = com.google.mlkit.vision.text.pipeline.zbf.zbb(r14)
            java.util.List r15 = com.google.mlkit.vision.text.pipeline.zbf.zbc(r14)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            boolean r16 = r7.containsKey(r12)
            if (r16 == 0) goto L255
            java.lang.Object r12 = r7.get(r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku) r12
            java.lang.Object r12 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku) r12
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r12 = r12.zbb()
            goto L259
        L255:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r12 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx.zbh()
        L259:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbog r16 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbog
            r17 = r16
            java.lang.String r16 = r13.zbH()
            r18 = r17
            android.graphics.Rect r17 = com.google.mlkit.vision.text.pipeline.zbf.zba(r15, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaax r19 = r13.zbh()
            java.util.List r19 = r19.zbf()
            java.lang.String r19 = com.google.mlkit.vision.text.pipeline.zbg.zba(r19)
            float r20 = r13.zbc()
            float r21 = r14.zba()
            java.lang.Object r12 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            r22 = r12
            java.util.List r22 = (java.util.List) r22
            r25 = r18
            r18 = r15
            r15 = r25
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            int r12 = r13.zbe()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            boolean r13 = r6.containsKey(r12)
            if (r13 == 0) goto L2a1
            java.lang.Object r12 = r6.get(r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku) r12
            goto L2aa
        L2a1:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku r13 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku
            r13.<init>()
            r6.put(r12, r13)
            r12 = r13
        L2aa:
            java.lang.Object r12 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku) r12
            r12.zba(r15)
        L2b3:
            int r10 = r10 + 1
            r12 = 1
            goto L21a
        L2b8:
            r7 = r11
        L2b9:
            int r10 = r2.size()
            if (r7 >= r10) goto L360
            java.lang.Object r10 = r2.get(r7)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbabj r10 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbabj) r10
            int r12 = r10.zbI()
            if (r12 == r9) goto L2cd
            goto L35c
        L2cd:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaaj r12 = r10.zbf()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb r12 = com.google.mlkit.vision.text.pipeline.zbf.zbb(r12)
            java.util.List r13 = com.google.mlkit.vision.text.pipeline.zbf.zbc(r12)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            boolean r15 = r6.containsKey(r14)
            if (r15 == 0) goto L2f4
            java.lang.Object r14 = r6.get(r14)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku r14 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku) r14
            java.lang.Object r14 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku r14 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku) r14
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r14 = r14.zbb()
            goto L2f8
        L2f4:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r14 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx.zbh()
        L2f8:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboi r15 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboi
            r16 = r14
            java.lang.String r14 = r10.zbH()
            r17 = r15
            android.graphics.Rect r15 = com.google.mlkit.vision.text.pipeline.zbf.zba(r13, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaax r18 = r10.zbh()
            java.util.List r18 = r18.zbf()
            java.lang.String r18 = com.google.mlkit.vision.text.pipeline.zbg.zba(r18)
            java.lang.Object r16 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r16)
            java.util.List r16 = (java.util.List) r16
            float r19 = r10.zbc()
            float r20 = r12.zba()
            r25 = r16
            r16 = r13
            r13 = r17
            r17 = r18
            r18 = r25
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            int r12 = r10.zbe()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            boolean r14 = r8.containsKey(r12)
            if (r14 == 0) goto L342
            java.lang.Object r10 = r8.get(r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku r10 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku) r10
            goto L353
        L342:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku r12 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku
            r12.<init>()
            int r10 = r10.zbe()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8.put(r10, r12)
            r10 = r12
        L353:
            java.lang.Object r10 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku r10 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku) r10
            r10.zba(r13)
        L35c:
            int r7 = r7 + 1
            goto L2b9
        L360:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku r6 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku
            r6.<init>()
            r7 = r11
        L366:
            int r9 = r2.size()
            if (r7 >= r9) goto L3d9
            java.lang.Object r9 = r2.get(r7)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbabj r9 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbabj) r9
            int r10 = r9.zbI()
            r12 = 4
            if (r10 == r12) goto L37a
            goto L3d6
        L37a:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaaj r10 = r9.zbf()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb r10 = com.google.mlkit.vision.text.pipeline.zbf.zbb(r10)
            java.util.List r15 = com.google.mlkit.vision.text.pipeline.zbf.zbc(r10)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r10 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx.zbh()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            boolean r13 = r8.containsKey(r12)
            if (r13 == 0) goto L3a7
            java.lang.Object r10 = r8.get(r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku r10 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku) r10
            java.lang.Object r10 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku r10 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku) r10
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r10 = r10.zbb()
            r8.remove(r12)
        L3a7:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboe r12 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboe
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkg r13 = com.google.mlkit.vision.text.pipeline.zbm.zba
            com.google.mlkit.vision.text.pipeline.zbk r14 = new com.google.mlkit.vision.text.pipeline.zbk
            r14.<init>()
            java.util.List r14 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zblc.zba(r10, r14)
            java.lang.String r13 = r13.zbb(r14)
            android.graphics.Rect r14 = com.google.mlkit.vision.text.pipeline.zbf.zba(r15, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaax r9 = r9.zbh()
            java.util.List r9 = r9.zbf()
            java.lang.String r16 = com.google.mlkit.vision.text.pipeline.zbg.zba(r9)
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)
            r17 = r9
            java.util.List r17 = (java.util.List) r17
            r12.<init>(r13, r14, r15, r16, r17)
            r6.zba(r12)
        L3d6:
            int r7 = r7 + 1
            goto L366
        L3d9:
            java.util.Collection r1 = r8.values()
            java.util.Iterator r1 = r1.iterator()
        L3e1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L41d
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku) r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r2 = r2.zbb()
            int r7 = r2.size()
            r8 = r11
        L3f6:
            if (r8 >= r7) goto L3e1
            java.lang.Object r9 = r2.get(r8)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboi r9 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboi) r9
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboe r12 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboe
            java.lang.String r13 = r9.zbc()
            android.graphics.Rect r14 = r9.zba()
            java.util.List r15 = r9.zbd()
            java.lang.String r16 = r9.zbb()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r17 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx.zbi(r9)
            r12.<init>(r13, r14, r15, r16, r17)
            r6.zba(r12)
            int r8 = r8 + 1
            goto L3f6
        L41d:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r1 = r6.zbb()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok r2 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkg r6 = com.google.mlkit.vision.text.pipeline.zbm.zba
            com.google.mlkit.vision.text.pipeline.zbl r7 = new com.google.mlkit.vision.text.pipeline.zbl
            r7.<init>()
            java.util.List r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zblc.zba(r1, r7)
            java.lang.String r6 = r6.zbb(r7)
            r2.<init>(r6, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx.zbh()
            r4.<init>(r5, r2, r1, r3)
            r0.zbe = r11
            return r4
        L43f:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException     // Catch: com.google.mlkit.common.MlKitException -> L57
            int r1 = r1.zbb()     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: com.google.mlkit.common.MlKitException -> L57
            r3.<init>(r2)     // Catch: com.google.mlkit.common.MlKitException -> L57
            r3.append(r1)     // Catch: com.google.mlkit.common.MlKitException -> L57
            java.lang.String r1 = r3.toString()     // Catch: com.google.mlkit.common.MlKitException -> L57
            r0.<init>(r1, r9)     // Catch: com.google.mlkit.common.MlKitException -> L57
            throw r0     // Catch: com.google.mlkit.common.MlKitException -> L57
        L455:
            android.os.RemoteException r1 = new android.os.RemoteException
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Failed to process input image."
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            com.google.mlkit.vision.text.pipeline.zbo r0 = com.google.mlkit.vision.text.pipeline.zbo.zbc(r4, r1)
            com.google.mlkit.vision.text.pipeline.zbn r0 = com.google.mlkit.vision.text.pipeline.zbn.zbe(r0)
            return r0
    }

    public final com.google.mlkit.vision.text.pipeline.zbo zbc() {
            r11 = this;
            boolean r0 = r11.zbb
            r1 = 0
            if (r0 == 0) goto Lf
            com.google.mlkit.vision.text.pipeline.zbb r11 = new com.google.mlkit.vision.text.pipeline.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki.zbd()
            r11.<init>(r1, r0)
            return r11
        Lf:
            com.google.mlkit.vision.text.pipeline.zbh r0 = r11.zba
            r2 = 1
            if (r0 != 0) goto Lba
            android.content.Context r0 = r11.zbc
            boolean r0 = com.google.android.libraries.vision.visionkit.pipeline.AndroidAssetUtil.a(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "PipelineManager"
            java.lang.String r3 = "Failed to initiate native asset manager."
            android.util.Log.d(r0, r3)
        L23:
            com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions r0 = r11.zbd
            com.google.mlkit.vision.text.pipeline.zbh r3 = new com.google.mlkit.vision.text.pipeline.zbh
            java.lang.String r4 = r0.zba()
            java.lang.String r5 = r0.zbc()
            java.lang.String r6 = r0.zbb()
            boolean r0 = r0.zbd()
            y08 r7 = defpackage.z08.b()
            r8 = 4
            if (r0 == 0) goto L40
            r0 = r8
            goto L41
        L40:
            r0 = r1
        L41:
            p18 r9 = defpackage.q18.a()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbbb r10 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbbe.zba()
            r10.zbd(r5)
            r10.zba(r4)
            r10.zbe(r2)
            r10.zbb(r2)
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L6c
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpf r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpg.zba()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpi r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpk.zba()
            r5.zba(r6)
            r4.zba(r5)
            r10.zbc(r4)
        L6c:
            r9.b(r10)
            if (r0 == 0) goto L83
            r4 = 2
            if (r0 == r2) goto L81
            r5 = 3
            if (r0 == r4) goto L7f
            if (r0 == r5) goto L84
            if (r0 == r8) goto L7d
            r8 = r1
            goto L84
        L7d:
            r8 = 5
            goto L84
        L7f:
            r8 = r5
            goto L84
        L81:
            r8 = r4
            goto L84
        L83:
            r8 = r2
        L84:
            g18 r0 = defpackage.h18.a()
            r0.a(r8)
            r9.c(r0)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbiu r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbix.zba()
            java.lang.String r4 = "PassThroughCoarseClassifier"
            r0.zba(r4)
            r9.a(r0)
            r7.a(r9)
            f28 r0 = defpackage.g28.a()
            r0.a()
            r7.b(r0)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = r7.zbi()
            z08 r0 = (defpackage.z08) r0
            com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions r4 = r11.zbd
            java.lang.String r4 = r4.zba()
            java.lang.String r5 = "mlkit_google_ocr_pipeline"
            r3.<init>(r0, r4, r5)
            r11.zba = r3
        Lba:
            com.google.mlkit.vision.text.pipeline.zbh r0 = r11.zba     // Catch: com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException -> Ld1
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException -> Ld1
            com.google.mlkit.vision.text.pipeline.zbh r0 = (com.google.mlkit.vision.text.pipeline.zbh) r0     // Catch: com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException -> Ld1
            r0.zbg()     // Catch: com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException -> Ld1
            r11.zbb = r2
            com.google.mlkit.vision.text.pipeline.zbb r11 = new com.google.mlkit.vision.text.pipeline.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki.zbd()
            r11.<init>(r1, r0)
            return r11
        Ld1:
            r11 = move-exception
            android.os.RemoteException r0 = new android.os.RemoteException
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r11 = r11.getRootCauseMessage()
            java.lang.String r1 = ""
            java.lang.Object r11 = r11.zbb(r1)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r1 = "Failed to initialize detector. "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            com.google.mlkit.vision.text.pipeline.zbo r11 = com.google.mlkit.vision.text.pipeline.zbo.zbc(r2, r0)
            return r11
    }

    public final void zbd() {
            r2 = this;
            com.google.mlkit.vision.text.pipeline.zbh r0 = r2.zba
            if (r0 == 0) goto L13
            boolean r1 = r2.zbb
            if (r1 == 0) goto Lb
            r0.zbh()
        Lb:
            com.google.mlkit.vision.text.pipeline.zbh r0 = r2.zba
            r0.zbf()
            r0 = 0
            r2.zba = r0
        L13:
            r0 = 0
            r2.zbb = r0
            r0 = 1
            r2.zbe = r0
            return
    }
}
