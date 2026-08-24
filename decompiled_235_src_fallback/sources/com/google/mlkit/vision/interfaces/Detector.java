package com.google.mlkit.vision.interfaces;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface Detector<DetectionResultT> extends java.io.Closeable, defpackage.gu3 {
    public static final int TYPE_BARCODE_SCANNING = 1;
    public static final int TYPE_DOCUMENT_DETECTION = 10;
    public static final int TYPE_FACE_DETECTION = 2;
    public static final int TYPE_IMAGE_CAPTIONING = 9;
    public static final int TYPE_IMAGE_LABELING = 3;
    public static final int TYPE_OBJECT_DETECTION = 5;
    public static final int TYPE_POSE_DETECTION = 6;
    public static final int TYPE_SEGMENTATION = 7;
    public static final int TYPE_SELFIE_FACE_DETECTION = 8;
    public static final int TYPE_SUBJECT_SEGMENTATION = 11;
    public static final int TYPE_TEXT_RECOGNITION = 4;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface DetectorType {
    }

    int getDetectorType();

    com.google.android.gms.tasks.Task<DetectionResultT> process(android.graphics.Bitmap r1, int r2);

    com.google.android.gms.tasks.Task<DetectionResultT> process(android.media.Image r1, int r2);

    com.google.android.gms.tasks.Task<DetectionResultT> process(android.media.Image r1, int r2, android.graphics.Matrix r3);

    com.google.android.gms.tasks.Task<DetectionResultT> process(java.nio.ByteBuffer r1, int r2, int r3, int r4, int r5);
}
