package me.magnum.melonds.impl.emulator.debug;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RendererDebugBridge {
    public static final int $stable = 0;
    public static final int CAPTURE_HEIGHT = 384;
    public static final int CAPTURE_WIDTH = 256;
    public static final int DENSE_CAPTURE_CAPTURE3D_SOURCE = 256;
    public static final int DENSE_CAPTURE_CAPTURE_LINE_MASK = 512;
    public static final int DENSE_CAPTURE_PACKED_BOTTOM_CONTROL = 128;
    public static final int DENSE_CAPTURE_PACKED_BOTTOM_PLANE1 = 64;
    public static final int DENSE_CAPTURE_PACKED_BOTTOM_PRIMARY = 4;
    public static final int DENSE_CAPTURE_PACKED_TOP_CONTROL = 32;
    public static final int DENSE_CAPTURE_PACKED_TOP_PLANE1 = 16;
    public static final int DENSE_CAPTURE_PACKED_TOP_PRIMARY = 2;
    public static final int DENSE_CAPTURE_RENDERER3D_CAPTURE_FRAME = 8;
    public static final int DENSE_CAPTURE_RENDERER3D_FRAME = 2048;
    public static final int DENSE_CAPTURE_SCREEN_FRAME = 1;
    public static final int DENSE_CAPTURE_SOFT_PACKED_META = 1024;
    public static final me.magnum.melonds.impl.emulator.debug.RendererDebugBridge INSTANCE = null;
    public static final int RENDERER_2D_DEBUG_FEATURE_3D_BACKGROUND = 64;
    public static final int RENDERER_2D_DEBUG_FEATURE_AFFINE_BACKGROUND = 2;
    public static final int RENDERER_2D_DEBUG_FEATURE_AFFINE_EXTENDED_BITMAP_256_BACKGROUND = 8;
    public static final int RENDERER_2D_DEBUG_FEATURE_AFFINE_EXTENDED_DIRECT_COLOR_BACKGROUND = 16;
    public static final int RENDERER_2D_DEBUG_FEATURE_AFFINE_EXTENDED_TILED_BACKGROUND = 4;
    public static final int RENDERER_2D_DEBUG_FEATURE_AFFINE_OBJECT = 512;
    public static final int RENDERER_2D_DEBUG_FEATURE_ALL = 524287;
    public static final int RENDERER_2D_DEBUG_FEATURE_BITMAP_OBJECT = 4096;
    public static final int RENDERER_2D_DEBUG_FEATURE_BLENDED_OBJECT = 8192;
    public static final int RENDERER_2D_DEBUG_FEATURE_LARGE_SCREEN_BACKGROUND = 32;
    public static final int RENDERER_2D_DEBUG_FEATURE_MOSAIC_OBJECT = 32768;
    public static final int RENDERER_2D_DEBUG_FEATURE_OBJECTS = 128;
    public static final int RENDERER_2D_DEBUG_FEATURE_OBJECT_LOWER_BAND = 262144;
    public static final int RENDERER_2D_DEBUG_FEATURE_OBJECT_MIDDLE_BAND = 131072;
    public static final int RENDERER_2D_DEBUG_FEATURE_OBJECT_UPPER_BAND = 65536;
    public static final int RENDERER_2D_DEBUG_FEATURE_REGULAR_OBJECT = 256;
    public static final int RENDERER_2D_DEBUG_FEATURE_STATIC_BACKGROUND = 1;
    public static final int RENDERER_2D_DEBUG_FEATURE_TILED_4BPP_OBJECT = 1024;
    public static final int RENDERER_2D_DEBUG_FEATURE_TILED_8BPP_OBJECT = 2048;
    public static final int RENDERER_2D_DEBUG_FEATURE_WINDOW_OBJECT = 16384;
    public static final int RENDERER_3D_DEBUG_FEATURE_ALL = 524287;
    public static final int RENDERER_3D_DEBUG_FEATURE_DECAL_POLYGONS = 1024;
    public static final int RENDERER_3D_DEBUG_FEATURE_DEPTH_WRITE_POLYGONS = 16384;
    public static final int RENDERER_3D_DEBUG_FEATURE_FOG_WRITE_POLYGONS = 32768;
    public static final int RENDERER_3D_DEBUG_FEATURE_LINE_POLYGONS = 4;
    public static final int RENDERER_3D_DEBUG_FEATURE_LOWER_BAND = 262144;
    public static final int RENDERER_3D_DEBUG_FEATURE_MIDDLE_BAND = 131072;
    public static final int RENDERER_3D_DEBUG_FEATURE_MODULATE_POLYGONS = 512;
    public static final int RENDERER_3D_DEBUG_FEATURE_OPAQUE_POLYGONS = 8;
    public static final int RENDERER_3D_DEBUG_FEATURE_RENDERER_OUTPUT = 1;
    public static final int RENDERER_3D_DEBUG_FEATURE_SHADOW_MASK_POLYGONS = 32;
    public static final int RENDERER_3D_DEBUG_FEATURE_SHADOW_POLYGONS = 64;
    public static final int RENDERER_3D_DEBUG_FEATURE_TEXTURED_POLYGONS = 128;
    public static final int RENDERER_3D_DEBUG_FEATURE_TOON_HIGHLIGHT_POLYGONS = 2048;
    public static final int RENDERER_3D_DEBUG_FEATURE_TRANSLUCENT_POLYGONS = 16;
    public static final int RENDERER_3D_DEBUG_FEATURE_TRIANGLE_POLYGONS = 2;
    public static final int RENDERER_3D_DEBUG_FEATURE_UNTEXTURED_POLYGONS = 256;
    public static final int RENDERER_3D_DEBUG_FEATURE_UPPER_BAND = 65536;
    public static final int RENDERER_3D_DEBUG_FEATURE_W_BUFFER_POLYGONS = 4096;
    public static final int RENDERER_3D_DEBUG_FEATURE_Z_BUFFER_POLYGONS = 8192;

    static {
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r0 = new me.magnum.melonds.impl.emulator.debug.RendererDebugBridge
            r0.<init>()
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE = r0
            return
    }

    private RendererDebugBridge() {
            r0 = this;
            r0.<init>()
            return
    }

    public final native int[] captureCurrent3dAttributes();

    public final native int[] captureCurrent3dCaptureFrame();

    public final native int[] captureCurrent3dCoverage();

    public final native int[] captureCurrent3dDepth();

    public final native int[] captureCurrent3dDimensions();

    public final native int[] captureCurrent3dFrame();

    public final native int[] captureCurrentCapture3dSource();

    public final native int[] captureCurrentCaptureFallbackMask();

    public final native int[] captureCurrentCaptureLineUses3dMask();

    public final native int[] captureCurrentComp4BottomPlaceholder();

    public final native int[] captureCurrentComp4TopPlaceholder();

    public final native int[] captureCurrentCompositedDimensions();

    public final native int[] captureCurrentCompositedFrame();

    public final native int[] captureCurrentFrame();

    public final native int[] captureCurrentPackedBottomPrimary();

    public final native int[] captureCurrentPackedPlane(int r1, int r2);

    public final native int[] captureCurrentPackedTopPrimary();

    public final native java.lang.String captureCurrentSoftPackedFrameMetaJson();

    public final native void clearDenseScreenBurstCapture();

    public final native void clearPreparedRendererSnapshot();

    public final native void dumpCurrentRendererSnapshot();

    public final native int getCurrentFrameIndexForDebug();

    public final native int[] getDenseScreenBurstCapture3dSourceFrame(int r1);

    public final native int[] getDenseScreenBurstCaptureFrame(int r1);

    public final native int getDenseScreenBurstCaptureFrameCount();

    public final native int getDenseScreenBurstCaptureFrameId(int r1);

    public final native int[] getDenseScreenBurstCaptureLineUses3dMaskFrame(int r1);

    public final native int[] getDenseScreenBurstPackedBottomFrame(int r1);

    public final native int[] getDenseScreenBurstPackedPlaneFrame(int r1, int r2, int r3);

    public final native int[] getDenseScreenBurstPackedTopFrame(int r1);

    public final native int[] getDenseScreenBurstRenderer3dCaptureFrame(int r1);

    public final native int[] getDenseScreenBurstRenderer3dFrame(int r1);

    public final native int[] getDenseScreenBurstScheduleStats();

    public final native java.lang.String getDenseScreenBurstSoftPackedFrameMetaJson(int r1);

    public final native int[] getRenderer2DDebugControls();

    public final native int[] getRenderer3DDebugControls();

    public final native boolean isCurrentFrameReadyForDebug();

    public final native boolean isDenseScreenBurstCaptureComplete();

    public final native void requestPreparedRendererSnapshot();

    public final native void setRenderer2DDebugControls(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13);

    public final native void setRenderer3DDebugControls(int r1);

    public final native void startDenseScreenBurstCapture(int r1, int r2, int r3, int r4);
}
