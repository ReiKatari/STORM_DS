package com.google.mlkit.vision.common.internal;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ImageUtils {
    private static final GmsLogger zza = new GmsLogger("MLKitImageUtils", "");
    private static final ImageUtils zzb = new ImageUtils();

    private ImageUtils() {
    }

    public static ImageUtils getInstance() {
        return zzb;
    }

    public d13 getImageDataWrapper(InputImage inputImage) {
        int format = inputImage.getFormat();
        if (format != -1) {
            if (format != 17) {
                if (format != 35) {
                    if (format != 842094169) {
                        throw new MlKitException(lb1.g(inputImage.getFormat(), "Unsupported image format: "), 3);
                    }
                } else {
                    return new zh4(inputImage.getMediaImage());
                }
            }
            return new zh4((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()));
        }
        return new zh4((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal()));
    }

    public int getMobileVisionImageFormat(InputImage inputImage) {
        return inputImage.getFormat();
    }

    public int getMobileVisionImageSize(InputImage inputImage) {
        if (inputImage.getFormat() == -1) {
            return ((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal())).getAllocationByteCount();
        }
        if (inputImage.getFormat() != 17 && inputImage.getFormat() != 842094169) {
            if (inputImage.getFormat() != 35) {
                return 0;
            }
            return (((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()))[0].getBuffer().limit() * 3) / 2;
        }
        return ((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer())).limit();
    }

    public Matrix getUprightRotationMatrix(int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i) / 2.0f, (-i2) / 2.0f);
        matrix.postRotate(i3 * 90);
        int i5 = i3 % 2;
        if (i5 != 0) {
            i4 = i2;
        } else {
            i4 = i;
        }
        if (i5 == 0) {
            i = i2;
        }
        matrix.postTranslate(i4 / 2.0f, i / 2.0f);
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:60:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[PHI: r4 
      PHI: (r4v3 android.graphics.Matrix) = (r4v0 android.graphics.Matrix), (r4v1 android.graphics.Matrix) binds: [B:38:0x008c, B:47:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:60:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:60:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:60:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:60:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:60:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:60:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:60:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap zza(ContentResolver contentResolver, Uri uri) {
        IOException iOException;
        r72 r72Var;
        Matrix matrix;
        Bitmap createBitmap;
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
            if (bitmap != null) {
                int i = 0;
                Matrix matrix2 = null;
                if ("content".equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
                    try {
                        InputStream openInputStream = contentResolver.openInputStream(uri);
                        if (openInputStream != null) {
                            r72Var = new r72(openInputStream);
                        } else {
                            r72Var = null;
                        }
                        if (openInputStream != null) {
                            try {
                                openInputStream.close();
                            } catch (IOException e) {
                                iOException = e;
                                zza.e("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)), iOException);
                                if (r72Var == null) {
                                }
                                Matrix matrix3 = new Matrix();
                                int width = bitmap.getWidth();
                                int height = bitmap.getHeight();
                                switch (i) {
                                }
                                return matrix == null ? bitmap : bitmap;
                            }
                        }
                    } catch (IOException e2) {
                        iOException = e2;
                        r72Var = null;
                    }
                    if (r72Var == null) {
                        i = r72Var.c(1, "Orientation");
                    }
                }
                Matrix matrix32 = new Matrix();
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                switch (i) {
                    case 2:
                        matrix2 = new Matrix();
                        matrix2.postScale(-1.0f, 1.0f);
                        matrix = matrix2;
                        break;
                    case 3:
                        matrix32.postRotate(180.0f);
                        matrix = matrix32;
                        break;
                    case 4:
                        matrix32.postScale(1.0f, -1.0f);
                        matrix = matrix32;
                        break;
                    case 5:
                        matrix32.postRotate(90.0f);
                        matrix32.postScale(-1.0f, 1.0f);
                        matrix = matrix32;
                        break;
                    case 6:
                        matrix32.postRotate(90.0f);
                        matrix = matrix32;
                        break;
                    case 7:
                        matrix32.postRotate(-90.0f);
                        matrix32.postScale(-1.0f, 1.0f);
                        matrix = matrix32;
                        break;
                    case 8:
                        matrix32.postRotate(-90.0f);
                        matrix = matrix32;
                        break;
                    default:
                        matrix = matrix2;
                        break;
                }
                if (matrix == null && bitmap != (createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width2, height2, matrix, true))) {
                    bitmap.recycle();
                    return createBitmap;
                }
            }
            throw new IOException("The image Uri could not be resolved.");
        } catch (FileNotFoundException e3) {
            zza.e("MLKitImageUtils", "Could not open file: ".concat(String.valueOf(uri)), e3);
            throw e3;
        }
    }
}
