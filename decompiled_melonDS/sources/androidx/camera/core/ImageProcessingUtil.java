package androidx.camera.core;

import aj.g;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.Surface;
import d0.n0;
import d0.u0;
import d0.w0;
import d0.y0;
import j0.d1;
import java.nio.ByteBuffer;
import java.util.Locale;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class ImageProcessingUtil {

    /* renamed from: a  reason: collision with root package name */
    public static int f1062a;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(y0 y0Var) {
        a aVar;
        if (!e(y0Var)) {
            g.s("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int c4 = y0Var.c();
        int a10 = y0Var.a();
        int u4 = y0Var.l()[0].u();
        int u10 = y0Var.l()[1].u();
        int u11 = y0Var.l()[2].u();
        int v10 = y0Var.l()[0].v();
        int v11 = y0Var.l()[1].v();
        if (nativeShiftPixel(y0Var.l()[0].b(), u4, y0Var.l()[1].b(), u10, y0Var.l()[2].b(), u11, v10, v11, c4, a10, v10, v11, v11) != 0) {
            aVar = a.ERROR_CONVERSION;
        } else {
            aVar = a.SUCCESS;
        }
        if (aVar == a.ERROR_CONVERSION) {
            g.s("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    public static n0 b(y0 y0Var, d1 d1Var, ByteBuffer byteBuffer, int i2, boolean z10) {
        int i10;
        int i11;
        int i12;
        a aVar;
        if (!e(y0Var)) {
            g.s("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!d(i2)) {
            g.s("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface surface = d1Var.getSurface();
        int c4 = y0Var.c();
        int a10 = y0Var.a();
        int u4 = y0Var.l()[0].u();
        int u10 = y0Var.l()[1].u();
        int u11 = y0Var.l()[2].u();
        int v10 = y0Var.l()[0].v();
        int v11 = y0Var.l()[1].v();
        if (z10) {
            i10 = v10;
        } else {
            i10 = 0;
        }
        if (z10) {
            i11 = v11;
        } else {
            i11 = 0;
        }
        if (z10) {
            i12 = v11;
        } else {
            i12 = 0;
        }
        if (nativeConvertAndroid420ToABGR(y0Var.l()[0].b(), u4, y0Var.l()[1].b(), u10, y0Var.l()[2].b(), u11, v10, v11, surface, byteBuffer, c4, a10, i10, i11, i12, i2) != 0) {
            aVar = a.ERROR_CONVERSION;
        } else {
            aVar = a.SUCCESS;
        }
        if (aVar == a.ERROR_CONVERSION) {
            g.s("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            g.o("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - currentTimeMillis) + "], image count: " + f1062a);
            f1062a = f1062a + 1;
        }
        y0 e6 = d1Var.e();
        if (e6 == null) {
            g.s("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        n0 n0Var = new n0(e6);
        n0Var.d(new u0(e6, y0Var, 0));
        return n0Var;
    }

    public static void c(Bitmap bitmap, ByteBuffer byteBuffer, int i2) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i2, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean d(int i2) {
        if (i2 != 0 && i2 != 90 && i2 != 180 && i2 != 270) {
            return false;
        }
        return true;
    }

    public static boolean e(y0 y0Var) {
        if (y0Var.getFormat() == 35 && y0Var.l().length == 3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static d0.n0 f(d0.y0 r26, j0.d1 r27, android.media.ImageWriter r28, java.nio.ByteBuffer r29, java.nio.ByteBuffer r30, java.nio.ByteBuffer r31, int r32) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageProcessingUtil.f(d0.y0, j0.d1, android.media.ImageWriter, java.nio.ByteBuffer, java.nio.ByteBuffer, java.nio.ByteBuffer, int):d0.n0");
    }

    public static n0 g(y0 y0Var, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i2) {
        int a10;
        int c4;
        if (!e(y0Var)) {
            g.s("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        } else if (!d(i2)) {
            g.s("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        } else if (i2 == 0 && y0Var.l().length == 3 && y0Var.l()[1].v() == 2 && nativeGetYUVImageVUOff(y0Var.l()[2].b(), y0Var.l()[1].b()) == -1) {
            return null;
        } else {
            int i10 = i2 % 180;
            if (i10 == 0) {
                a10 = y0Var.c();
            } else {
                a10 = y0Var.a();
            }
            int i11 = a10;
            if (i10 == 0) {
                c4 = y0Var.a();
            } else {
                c4 = y0Var.c();
            }
            int i12 = c4;
            ByteBuffer nativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
            if (nativeRotateYUV(y0Var.l()[0].b(), y0Var.l()[0].u(), y0Var.l()[1].b(), y0Var.l()[1].u(), y0Var.l()[2].b(), y0Var.l()[2].u(), y0Var.l()[2].v(), byteBuffer4, i11, 1, nativeNewDirectByteBuffer, i11, 2, byteBuffer5, i11, 2, byteBuffer, byteBuffer2, byteBuffer3, y0Var.c(), y0Var.a(), i2) != 0) {
                g.s("ImageProcessingUtil", "rotate YUV failure");
                return null;
            }
            return new n0(new w0(y0Var, byteBuffer4, nativeNewDirectByteBuffer, byteBuffer5, i11, i12));
        }
    }

    public static void h(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            g.s("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, int i12, int i13, Surface surface, ByteBuffer byteBuffer4, int i14, int i15, int i16, int i17, int i18, int i19);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i2, int i10, int i11, int i12, boolean z10);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i2, int i10);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, int i12, ByteBuffer byteBuffer4, int i13, int i14, ByteBuffer byteBuffer5, int i15, int i16, ByteBuffer byteBuffer6, int i17, int i18, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i19, int i20, int i21);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
