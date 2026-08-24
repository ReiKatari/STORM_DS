package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ImageConvertUtils {
    private static final ImageConvertUtils zza = new ImageConvertUtils();

    private ImageConvertUtils() {
    }

    public static ByteBuffer bufferWithBackingArray(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    public static ImageConvertUtils getInstance() {
        return zza;
    }

    public static Bitmap yv12ToBitmap(ByteBuffer byteBuffer, int i, int i2, int i3) {
        byte[] zzb = zzb(yv12ToNv21Buffer(byteBuffer, true).array(), i, i2);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(zzb, 0, zzb.length);
        return zza(decodeByteArray, i3, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    public static ByteBuffer yv12ToNv21Buffer(ByteBuffer byteBuffer, boolean z) {
        ByteBuffer allocateDirect;
        int i;
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        int i2 = limit / 6;
        if (z) {
            allocateDirect = ByteBuffer.allocate(limit);
        } else {
            allocateDirect = ByteBuffer.allocateDirect(limit);
        }
        int i3 = 0;
        while (true) {
            i = i2 * 4;
            if (i3 >= i) {
                break;
            }
            allocateDirect.put(i3, byteBuffer.get(i3));
            i3++;
        }
        for (int i4 = 0; i4 < i2 + i2; i4++) {
            allocateDirect.put(i + i4, byteBuffer.get((i4 / 2) + ((i4 % 2) * i2) + i));
        }
        return allocateDirect;
    }

    public static Bitmap zza(Bitmap bitmap, int i, int i2, int i3) {
        if (i == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrix, true);
    }

    private static byte[] zzb(byte[] bArr, int i, int i2) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e) {
            Log.w("ImageConvertUtils", "Error closing ByteArrayOutputStream");
            throw new MlKitException("Image conversion error from NV21 format", 13, e);
        }
    }

    private static final void zzc(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride != 0) {
            int i5 = i / (i2 / rowStride);
            int i6 = 0;
            for (int i7 = 0; i7 < rowStride; i7++) {
                int i8 = i6;
                for (int i9 = 0; i9 < i5; i9++) {
                    bArr[i3] = buffer.get(i8);
                    i3 += i4;
                    i8 += plane.getPixelStride();
                }
                i6 += plane.getRowStride();
            }
        }
    }

    public byte[] byteBufferToByteArray(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        byte[] bArr = new byte[limit];
        byteBuffer.get(bArr, 0, limit);
        return bArr;
    }

    public ByteBuffer cloneByteBuffer(ByteBuffer byteBuffer) {
        ByteBuffer allocate;
        Preconditions.checkNotNull(byteBuffer);
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        if (byteBuffer.isDirect()) {
            allocate = ByteBuffer.allocateDirect(capacity);
        } else {
            allocate = ByteBuffer.allocate(capacity);
        }
        allocate.limit(byteBuffer.limit());
        allocate.put((ByteBuffer) byteBuffer.rewind());
        allocate.position(position);
        byteBuffer.position(position);
        return allocate;
    }

    public Bitmap convertJpegToUpRightBitmap(Image image, int i) {
        boolean z;
        if (image.getFormat() == 256) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Only JPEG is supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes != null && planes.length == 1) {
            ByteBuffer buffer = planes[0].getBuffer();
            buffer.rewind();
            int remaining = buffer.remaining();
            byte[] bArr = new byte[remaining];
            buffer.get(bArr);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining);
            return zza(decodeByteArray, i, decodeByteArray.getWidth(), decodeByteArray.getHeight());
        }
        i.h("Unexpected image format, JPEG should have exactly 1 image plane");
        return null;
    }

    public ByteBuffer convertToNv21Buffer(InputImage inputImage, boolean z) {
        ByteBuffer allocateDirect;
        Bitmap.Config config;
        int format = inputImage.getFormat();
        if (format != -1) {
            if (format != 17) {
                if (format != 35) {
                    if (format == 842094169) {
                        return yv12ToNv21Buffer((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), z);
                    }
                    throw new MlKitException("Unsupported image format", 13);
                }
                return yuv420ThreePlanesToNV21((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()), inputImage.getWidth(), inputImage.getHeight());
            } else if (z) {
                return bufferWithBackingArray((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()));
            } else {
                return (ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer());
            }
        }
        Bitmap bitmap = (Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal());
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config2 = bitmap.getConfig();
            config = Bitmap.Config.HARDWARE;
            if (config2 == config) {
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
            }
        }
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
        int ceil = (int) Math.ceil(height / 2.0d);
        int ceil2 = ((ceil + ceil) * ((int) Math.ceil(width / 2.0d))) + i;
        if (z) {
            allocateDirect = ByteBuffer.allocate(ceil2);
        } else {
            allocateDirect = ByteBuffer.allocateDirect(ceil2);
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < height; i4++) {
            int i5 = 0;
            while (i5 < width) {
                int i6 = iArr[i3];
                int i7 = i6 >> 16;
                int i8 = i6 >> 8;
                int i9 = i6 & 255;
                int i10 = i2 + 1;
                int i11 = i7 & 255;
                int i12 = i8 & 255;
                allocateDirect.put(i2, (byte) Math.min(255, ((((i9 * 25) + ((i12 * 129) + (i11 * 66))) + 128) >> 8) + 16));
                if (i4 % 2 == 0 && i3 % 2 == 0) {
                    int i13 = i11 * 112;
                    int i14 = i + 1;
                    allocateDirect.put(i, (byte) Math.min(255, ((((i13 - (i12 * 94)) - (i9 * 18)) + 128) >> 8) + 128));
                    i += 2;
                    allocateDirect.put(i14, (byte) Math.min(255, (((((i11 * (-38)) - (i12 * 74)) + (i9 * 112)) + 128) >> 8) + 128));
                }
                i3++;
                i5++;
                i2 = i10;
            }
        }
        return allocateDirect;
    }

    public Bitmap convertToUpRightBitmap(InputImage inputImage) {
        int format = inputImage.getFormat();
        if (format != -1) {
            if (format != 17) {
                if (format != 35) {
                    if (format == 842094169) {
                        return yv12ToBitmap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
                    }
                    throw new MlKitException("Unsupported image format", 13);
                }
                return nv21ToBitmap(yuv420ThreePlanesToNV21((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()), inputImage.getWidth(), inputImage.getHeight()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
            }
            return nv21ToBitmap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
        }
        return zza((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal()), inputImage.getRotationDegrees(), inputImage.getWidth(), inputImage.getHeight());
    }

    public Bitmap getUpRightBitmap(InputImage inputImage) {
        Bitmap bitmapInternal = inputImage.getBitmapInternal();
        if (bitmapInternal != null) {
            return zza(bitmapInternal, inputImage.getRotationDegrees(), inputImage.getWidth(), inputImage.getHeight());
        }
        return convertToUpRightBitmap(inputImage);
    }

    public Bitmap nv21ToBitmap(ByteBuffer byteBuffer, int i, int i2, int i3) {
        byte[] zzb = zzb(byteBufferToByteArray(byteBuffer), i, i2);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(zzb, 0, zzb.length);
        return zza(decodeByteArray, i3, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    public ByteBuffer yuv420ThreePlanesToNV21(Image.Plane[] planeArr, int i, int i2) {
        boolean z;
        int i3 = i * i2;
        int i4 = i3 / 4;
        byte[] bArr = new byte[i4 + i4 + i3];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        int i5 = (i3 + i3) / 4;
        if (buffer2.remaining() == i5 - 2 && buffer2.compareTo(buffer) == 0) {
            z = true;
        } else {
            z = false;
        }
        buffer2.position(position);
        buffer.limit(limit);
        if (z) {
            planeArr[0].getBuffer().get(bArr, 0, i3);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i3, 1);
            buffer3.get(bArr, i3 + 1, i5 - 1);
        } else {
            zzc(planeArr[0], i, i2, bArr, 0, 1);
            zzc(planeArr[1], i, i2, bArr, i3 + 1, 2);
            zzc(planeArr[2], i, i2, bArr, i3, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
