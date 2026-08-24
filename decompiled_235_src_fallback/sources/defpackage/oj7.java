package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oj7  reason: default package */
/* loaded from: classes.dex */
public enum oj7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.oj7[] $VALUES = null;
    public static final defpackage.mj7 Companion = null;
    public static final defpackage.oj7 IMAGE_ANALYSIS = null;
    public static final defpackage.oj7 IMAGE_CAPTURE = null;
    public static final defpackage.oj7 PREVIEW = null;
    public static final defpackage.oj7 STREAM_SHARING = null;
    public static final defpackage.oj7 UNDEFINED = null;
    public static final defpackage.oj7 VIDEO_CAPTURE = null;
    private final java.lang.Class<?> surfaceClass;

    private static final /* synthetic */ defpackage.oj7[] $values() {
            oj7 r0 = defpackage.oj7.PREVIEW
            oj7 r1 = defpackage.oj7.IMAGE_CAPTURE
            oj7 r2 = defpackage.oj7.IMAGE_ANALYSIS
            oj7 r3 = defpackage.oj7.VIDEO_CAPTURE
            oj7 r4 = defpackage.oj7.STREAM_SHARING
            oj7 r5 = defpackage.oj7.UNDEFINED
            oj7[] r0 = new defpackage.oj7[]{r0, r1, r2, r3, r4, r5}
            return r0
    }

    static {
            oj7 r0 = new oj7
            r1 = 0
            java.lang.Class<android.view.SurfaceHolder> r2 = android.view.SurfaceHolder.class
            java.lang.String r3 = "PREVIEW"
            r0.<init>(r3, r1, r2)
            defpackage.oj7.PREVIEW = r0
            oj7 r0 = new oj7
            java.lang.String r1 = "IMAGE_CAPTURE"
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)
            defpackage.oj7.IMAGE_CAPTURE = r0
            oj7 r0 = new oj7
            java.lang.String r1 = "IMAGE_ANALYSIS"
            r2 = 2
            r0.<init>(r1, r2, r3)
            defpackage.oj7.IMAGE_ANALYSIS = r0
            oj7 r0 = new oj7
            r1 = 3
            java.lang.Class<android.media.MediaCodec> r2 = android.media.MediaCodec.class
            java.lang.String r4 = "VIDEO_CAPTURE"
            r0.<init>(r4, r1, r2)
            defpackage.oj7.VIDEO_CAPTURE = r0
            oj7 r0 = new oj7
            r1 = 4
            java.lang.Class<android.graphics.SurfaceTexture> r2 = android.graphics.SurfaceTexture.class
            java.lang.String r4 = "STREAM_SHARING"
            r0.<init>(r4, r1, r2)
            defpackage.oj7.STREAM_SHARING = r0
            oj7 r0 = new oj7
            java.lang.String r1 = "UNDEFINED"
            r2 = 5
            r0.<init>(r1, r2, r3)
            defpackage.oj7.UNDEFINED = r0
            oj7[] r0 = $values()
            defpackage.oj7.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.oj7.$ENTRIES = r0
            mj7 r0 = new mj7
            r0.<init>()
            defpackage.oj7.Companion = r0
            return
    }

    oj7(java.lang.String r1, int r2, java.lang.Class r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.surfaceClass = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.oj7.$ENTRIES
            return r0
    }

    public static final defpackage.oj7 getFeatureGroupUseCaseType(defpackage.di7 r1) {
            mj7 r0 = defpackage.oj7.Companion
            r0.getClass()
            oj7 r1 = defpackage.mj7.a(r1)
            return r1
    }

    public static final defpackage.oj7 getFeatureGroupUseCaseType(defpackage.zi7 r1) {
            mj7 r0 = defpackage.oj7.Companion
            r0.getClass()
            oj7 r1 = defpackage.mj7.b(r1)
            return r1
    }

    public static defpackage.oj7 valueOf(java.lang.String r1) {
            java.lang.Class<oj7> r0 = defpackage.oj7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            oj7 r1 = (defpackage.oj7) r1
            return r1
    }

    public static defpackage.oj7[] values() {
            oj7[] r0 = defpackage.oj7.$VALUES
            java.lang.Object r0 = r0.clone()
            oj7[] r0 = (defpackage.oj7[]) r0
            return r0
    }

    public final java.lang.Class<?> getSurfaceClass() {
            r0 = this;
            java.lang.Class<?> r0 = r0.surfaceClass
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            int[] r0 = defpackage.nj7.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L1f;
                case 2: goto L1c;
                case 3: goto L19;
                case 4: goto L16;
                case 5: goto L13;
                case 6: goto L10;
                default: goto Lb;
            }
        Lb:
            defpackage.i.d()
            r1 = 0
            return r1
        L10:
            java.lang.String r1 = "Undefined"
            return r1
        L13:
            java.lang.String r1 = "StreamSharing"
            return r1
        L16:
            java.lang.String r1 = "VideoCapture"
            return r1
        L19:
            java.lang.String r1 = "ImageAnalysis"
            return r1
        L1c:
            java.lang.String r1 = "ImageCapture"
            return r1
        L1f:
            java.lang.String r1 = "Preview"
            return r1
    }
}
