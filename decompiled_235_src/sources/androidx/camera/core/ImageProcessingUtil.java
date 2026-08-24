package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class ImageProcessingUtil {
    public static int a;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(s23 s23Var) {
        a aVar;
        if (!e(s23Var)) {
            kj2.v("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int width = s23Var.getWidth();
        int height = s23Var.getHeight();
        int m = s23Var.j()[0].m();
        int m2 = s23Var.j()[1].m();
        int m3 = s23Var.j()[2].m();
        int C = s23Var.j()[0].C();
        int C2 = s23Var.j()[1].C();
        if (nativeShiftPixel(s23Var.j()[0].a(), m, s23Var.j()[1].a(), m2, s23Var.j()[2].a(), m3, C, C2, width, height, C, C2, C2) != 0) {
            aVar = a.ERROR_CONVERSION;
        } else {
            aVar = a.SUCCESS;
        }
        if (aVar == a.ERROR_CONVERSION) {
            kj2.v("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    public static x13 b(s23 s23Var, v23 v23Var, ByteBuffer byteBuffer, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        a aVar;
        if (!e(s23Var)) {
            kj2.v("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!d(i)) {
            kj2.v("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface surface = v23Var.getSurface();
        int width = s23Var.getWidth();
        int height = s23Var.getHeight();
        int m = s23Var.j()[0].m();
        int m2 = s23Var.j()[1].m();
        int m3 = s23Var.j()[2].m();
        int C = s23Var.j()[0].C();
        int C2 = s23Var.j()[1].C();
        if (z) {
            i2 = C;
        } else {
            i2 = 0;
        }
        if (z) {
            i3 = C2;
        } else {
            i3 = 0;
        }
        if (z) {
            i4 = C2;
        } else {
            i4 = 0;
        }
        if (nativeConvertAndroid420ToABGR(s23Var.j()[0].a(), m, s23Var.j()[1].a(), m2, s23Var.j()[2].a(), m3, C, C2, surface, byteBuffer, width, height, i2, i3, i4, i) != 0) {
            aVar = a.ERROR_CONVERSION;
        } else {
            aVar = a.SUCCESS;
        }
        if (aVar == a.ERROR_CONVERSION) {
            kj2.v("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            kj2.t("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - currentTimeMillis) + "], image count: " + a);
            a = a + 1;
        }
        s23 a2 = v23Var.a();
        if (a2 == null) {
            kj2.v("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        x13 x13Var = new x13(a2);
        x13Var.e(new o23(a2, s23Var, 0));
        return x13Var;
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

    public static boolean e(s23 s23Var) {
        if (s23Var.getFormat() == 35 && s23Var.j().length == 3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x13 f(s23 s23Var, v23 v23Var, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        x13 x13Var;
        a aVar;
        if (!e(s23Var)) {
            kj2.v("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        } else if (!d(i)) {
            kj2.v("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        } else {
            a aVar2 = a.ERROR_CONVERSION;
            if (i > 0) {
                int width = s23Var.getWidth();
                int height = s23Var.getHeight();
                int m = s23Var.j()[0].m();
                int m2 = s23Var.j()[1].m();
                int m3 = s23Var.j()[2].m();
                int C = s23Var.j()[1].C();
                Image dequeueInputImage = imageWriter.dequeueInputImage();
                if (dequeueInputImage != null) {
                    x13Var = null;
                    if (nativeRotateYUV(s23Var.j()[0].a(), m, s23Var.j()[1].a(), m2, s23Var.j()[2].a(), m3, C, dequeueInputImage.getPlanes()[0].getBuffer(), dequeueInputImage.getPlanes()[0].getRowStride(), dequeueInputImage.getPlanes()[0].getPixelStride(), dequeueInputImage.getPlanes()[1].getBuffer(), dequeueInputImage.getPlanes()[1].getRowStride(), dequeueInputImage.getPlanes()[1].getPixelStride(), dequeueInputImage.getPlanes()[2].getBuffer(), dequeueInputImage.getPlanes()[2].getRowStride(), dequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) == 0) {
                        imageWriter.queueInputImage(dequeueInputImage);
                        aVar = a.SUCCESS;
                        if (aVar == aVar2) {
                            kj2.v("ImageProcessingUtil", "rotate YUV failure");
                            return x13Var;
                        }
                        s23 a2 = v23Var.a();
                        if (a2 == null) {
                            kj2.v("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
                            return x13Var;
                        }
                        x13 x13Var2 = new x13(a2);
                        x13Var2.e(new o23(a2, s23Var, 1));
                        return x13Var2;
                    }
                    aVar = aVar2;
                    if (aVar == aVar2) {
                    }
                }
            }
            x13Var = null;
            aVar = aVar2;
            if (aVar == aVar2) {
            }
        }
    }

    public static x13 g(s23 s23Var, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i) {
        int height;
        int width;
        if (!e(s23Var)) {
            kj2.v("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        } else if (!d(i)) {
            kj2.v("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        } else if (i == 0 && s23Var.j().length == 3 && s23Var.j()[1].C() == 2 && nativeGetYUVImageVUOff(s23Var.j()[2].a(), s23Var.j()[1].a()) == -1) {
            return null;
        } else {
            int i2 = i % 180;
            if (i2 == 0) {
                height = s23Var.getWidth();
            } else {
                height = s23Var.getHeight();
            }
            int i3 = height;
            if (i2 == 0) {
                width = s23Var.getHeight();
            } else {
                width = s23Var.getWidth();
            }
            int i4 = width;
            ByteBuffer nativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
            if (nativeRotateYUV(s23Var.j()[0].a(), s23Var.j()[0].m(), s23Var.j()[1].a(), s23Var.j()[1].m(), s23Var.j()[2].a(), s23Var.j()[2].m(), s23Var.j()[2].C(), byteBuffer4, i3, 1, nativeNewDirectByteBuffer, i3, 2, byteBuffer5, i3, 2, byteBuffer, byteBuffer2, byteBuffer3, s23Var.getWidth(), s23Var.getHeight(), i) != 0) {
                kj2.v("ImageProcessingUtil", "rotate YUV failure");
                return null;
            }
            return new x13(new q23(s23Var, byteBuffer4, nativeNewDirectByteBuffer, byteBuffer5, i3, i4));
        }
    }

    public static void h(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            kj2.v("ImageProcessingUtil", "Failed to enqueue JPEG image.");
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
