package androidx.camera.core;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public abstract class ImageProcessingUtil {
    public static int a;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(ow2 ow2Var) {
        a aVar;
        if (!e(ow2Var)) {
            ve2.w("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int c = ow2Var.c();
        int a2 = ow2Var.a();
        int r = ow2Var.m()[0].r();
        int r2 = ow2Var.m()[1].r();
        int r3 = ow2Var.m()[2].r();
        int u = ow2Var.m()[0].u();
        int u2 = ow2Var.m()[1].u();
        if (nativeShiftPixel(ow2Var.m()[0].b(), r, ow2Var.m()[1].b(), r2, ow2Var.m()[2].b(), r3, u, u2, c, a2, u, u2, u2) != 0) {
            aVar = a.ERROR_CONVERSION;
        } else {
            aVar = a.SUCCESS;
        }
        if (aVar == a.ERROR_CONVERSION) {
            ve2.w("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    public static tv2 b(ow2 ow2Var, rw2 rw2Var, ByteBuffer byteBuffer, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        a aVar;
        if (!e(ow2Var)) {
            ve2.w("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!d(i)) {
            ve2.w("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface surface = rw2Var.getSurface();
        int c = ow2Var.c();
        int a2 = ow2Var.a();
        int r = ow2Var.m()[0].r();
        int r2 = ow2Var.m()[1].r();
        int r3 = ow2Var.m()[2].r();
        int u = ow2Var.m()[0].u();
        int u2 = ow2Var.m()[1].u();
        if (z) {
            i2 = u;
        } else {
            i2 = 0;
        }
        if (z) {
            i3 = u2;
        } else {
            i3 = 0;
        }
        if (z) {
            i4 = u2;
        } else {
            i4 = 0;
        }
        if (nativeConvertAndroid420ToABGR(ow2Var.m()[0].b(), r, ow2Var.m()[1].b(), r2, ow2Var.m()[2].b(), r3, u, u2, surface, byteBuffer, c, a2, i2, i3, i4, i) != 0) {
            aVar = a.ERROR_CONVERSION;
        } else {
            aVar = a.SUCCESS;
        }
        if (aVar == a.ERROR_CONVERSION) {
            ve2.w("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            ve2.v("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - currentTimeMillis) + "], image count: " + a);
            a = a + 1;
        }
        ow2 b = rw2Var.b();
        if (b == null) {
            ve2.w("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        tv2 tv2Var = new tv2(b);
        tv2Var.d(new kw2(b, ow2Var, 0));
        return tv2Var;
    }

    public static void c(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean d(int i) {
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            return false;
        }
        return true;
    }

    public static boolean e(ow2 ow2Var) {
        if (ow2Var.getFormat() == 35 && ow2Var.m().length == 3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.tv2 f(defpackage.ow2 r27, defpackage.rw2 r28, android.media.ImageWriter r29, java.nio.ByteBuffer r30, java.nio.ByteBuffer r31, java.nio.ByteBuffer r32, int r33) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageProcessingUtil.f(ow2, rw2, android.media.ImageWriter, java.nio.ByteBuffer, java.nio.ByteBuffer, java.nio.ByteBuffer, int):tv2");
    }

    public static tv2 g(ow2 ow2Var, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i) {
        int a2;
        int c;
        if (!e(ow2Var)) {
            ve2.w("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        } else if (!d(i)) {
            ve2.w("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        } else if (i == 0 && ow2Var.m().length == 3 && ow2Var.m()[1].u() == 2 && nativeGetYUVImageVUOff(ow2Var.m()[2].b(), ow2Var.m()[1].b()) == -1) {
            return null;
        } else {
            int i2 = i % 180;
            if (i2 == 0) {
                a2 = ow2Var.c();
            } else {
                a2 = ow2Var.a();
            }
            int i3 = a2;
            if (i2 == 0) {
                c = ow2Var.a();
            } else {
                c = ow2Var.c();
            }
            int i4 = c;
            ByteBuffer nativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
            if (nativeRotateYUV(ow2Var.m()[0].b(), ow2Var.m()[0].r(), ow2Var.m()[1].b(), ow2Var.m()[1].r(), ow2Var.m()[2].b(), ow2Var.m()[2].r(), ow2Var.m()[2].u(), byteBuffer4, i3, 1, nativeNewDirectByteBuffer, i3, 2, byteBuffer5, i3, 2, byteBuffer, byteBuffer2, byteBuffer3, ow2Var.c(), ow2Var.a(), i) != 0) {
                ve2.w("ImageProcessingUtil", "rotate YUV failure");
                return null;
            }
            return new tv2(new mw2(ow2Var, byteBuffer4, nativeNewDirectByteBuffer, byteBuffer5, i3, i4));
        }
    }

    public static void h(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            ve2.w("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i, int i2);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
