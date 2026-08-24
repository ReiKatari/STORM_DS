package defpackage;

import android.util.Log;
import com.github.junrar.unpack.decode.Compress;
import com.google.mlkit.common.MlKitException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s72  reason: default package */
/* loaded from: classes.dex */
public final class s72 {
    public static final Charset A;
    public static final byte[] B;
    public static final List j = Arrays.asList(1, 6, 3, 8);
    public static final List k = Arrays.asList(2, 7, 4, 5);
    public static final int[] l = {8, 8, 8};
    public static final int[] m = {8};
    public static final byte[] n = {-1, -40, -1};
    public static final byte[] o = {79, 76, 89, 77, 80, 0};
    public static final byte[] p = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final String[] q = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    public static final int[] r = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] s = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final n72 t;
    public static final n72[][] u;
    public static final n72[] v;
    public static final HashMap[] w;
    public static final HashMap[] x;
    public static final HashSet y;
    public static final HashMap z;
    public final String a;
    public int b;
    public final HashMap[] c = new HashMap[u.length];
    public ByteOrder d = ByteOrder.BIG_ENDIAN;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    static {
        n72[] n72VarArr;
        n72[] n72VarArr2 = {new n72("NewSubfileType", 254, 4), new n72("SubfileType", 255, 4), new n72("ImageWidth", 256), new n72("ImageLength", Compress.MC20), new n72("BitsPerSample", 258, 3), new n72("Compression", 259, 3), new n72("PhotometricInterpretation", 262, 3), new n72("ImageDescription", 270, 2), new n72("Make", 271, 2), new n72("Model", 272, 2), new n72("StripOffsets", 273), new n72("Orientation", 274, 3), new n72("SamplesPerPixel", 277, 3), new n72("RowsPerStrip", 278), new n72("StripByteCounts", 279), new n72("XResolution", 282, 5), new n72("YResolution", 283, 5), new n72("PlanarConfiguration", 284, 3), new n72("ResolutionUnit", 296, 3), new n72("TransferFunction", MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 3), new n72("Software", 305, 2), new n72("DateTime", 306, 2), new n72("Artist", 315, 2), new n72("WhitePoint", 318, 5), new n72("PrimaryChromaticities", 319, 5), new n72("SubIFDPointer", 330, 4), new n72("JPEGInterchangeFormat", 513, 4), new n72("JPEGInterchangeFormatLength", 514, 4), new n72("YCbCrCoefficients", 529, 5), new n72("YCbCrSubSampling", 530, 3), new n72("YCbCrPositioning", 531, 3), new n72("ReferenceBlackWhite", 532, 5), new n72("Copyright", 33432, 2), new n72("ExifIFDPointer", 34665, 4), new n72("GPSInfoIFDPointer", 34853, 4), new n72("SensorTopBorder", 4, 4), new n72("SensorLeftBorder", 5, 4), new n72("SensorBottomBorder", 6, 4), new n72("SensorRightBorder", 7, 4), new n72("ISO", 23, 3), new n72("JpgFromRaw", 46, 7)};
        n72[] n72VarArr3 = {new n72("ExposureTime", 33434, 5), new n72("FNumber", 33437, 5), new n72("ExposureProgram", 34850, 3), new n72("SpectralSensitivity", 34852, 2), new n72("PhotographicSensitivity", 34855, 3), new n72("OECF", 34856, 7), new n72("ExifVersion", 36864, 2), new n72("DateTimeOriginal", 36867, 2), new n72("DateTimeDigitized", 36868, 2), new n72("ComponentsConfiguration", 37121, 7), new n72("CompressedBitsPerPixel", 37122, 5), new n72("ShutterSpeedValue", 37377, 10), new n72("ApertureValue", 37378, 5), new n72("BrightnessValue", 37379, 10), new n72("ExposureBiasValue", 37380, 10), new n72("MaxApertureValue", 37381, 5), new n72("SubjectDistance", 37382, 5), new n72("MeteringMode", 37383, 3), new n72("LightSource", 37384, 3), new n72("Flash", 37385, 3), new n72("FocalLength", 37386, 5), new n72("SubjectArea", 37396, 3), new n72("MakerNote", 37500, 7), new n72("UserComment", 37510, 7), new n72("SubSecTime", 37520, 2), new n72("SubSecTimeOriginal", 37521, 2), new n72("SubSecTimeDigitized", 37522, 2), new n72("FlashpixVersion", 40960, 7), new n72("ColorSpace", 40961, 3), new n72("PixelXDimension", 40962), new n72("PixelYDimension", 40963), new n72("RelatedSoundFile", 40964, 2), new n72("InteroperabilityIFDPointer", 40965, 4), new n72("FlashEnergy", 41483, 5), new n72("SpatialFrequencyResponse", 41484, 7), new n72("FocalPlaneXResolution", 41486, 5), new n72("FocalPlaneYResolution", 41487, 5), new n72("FocalPlaneResolutionUnit", 41488, 3), new n72("SubjectLocation", 41492, 3), new n72("ExposureIndex", 41493, 5), new n72("SensingMethod", 41495, 3), new n72("FileSource", 41728, 7), new n72("SceneType", 41729, 7), new n72("CFAPattern", 41730, 7), new n72("CustomRendered", 41985, 3), new n72("ExposureMode", 41986, 3), new n72("WhiteBalance", 41987, 3), new n72("DigitalZoomRatio", 41988, 5), new n72("FocalLengthIn35mmFilm", 41989, 3), new n72("SceneCaptureType", 41990, 3), new n72("GainControl", 41991, 3), new n72("Contrast", 41992, 3), new n72("Saturation", 41993, 3), new n72("Sharpness", 41994, 3), new n72("DeviceSettingDescription", 41995, 7), new n72("SubjectDistanceRange", 41996, 3), new n72("ImageUniqueID", 42016, 2), new n72("DNGVersion", 50706, 1), new n72("DefaultCropSize", 50720)};
        n72[] n72VarArr4 = {new n72("GPSVersionID", 0, 1), new n72("GPSLatitudeRef", 1, 2), new n72("GPSLatitude", 2, 5), new n72("GPSLongitudeRef", 3, 2), new n72("GPSLongitude", 4, 5), new n72("GPSAltitudeRef", 5, 1), new n72("GPSAltitude", 6, 5), new n72("GPSTimeStamp", 7, 5), new n72("GPSSatellites", 8, 2), new n72("GPSStatus", 9, 2), new n72("GPSMeasureMode", 10, 2), new n72("GPSDOP", 11, 5), new n72("GPSSpeedRef", 12, 2), new n72("GPSSpeed", 13, 5), new n72("GPSTrackRef", 14, 2), new n72("GPSTrack", 15, 5), new n72("GPSImgDirectionRef", 16, 2), new n72("GPSImgDirection", 17, 5), new n72("GPSMapDatum", 18, 2), new n72("GPSDestLatitudeRef", 19, 2), new n72("GPSDestLatitude", 20, 5), new n72("GPSDestLongitudeRef", 21, 2), new n72("GPSDestLongitude", 22, 5), new n72("GPSDestBearingRef", 23, 2), new n72("GPSDestBearing", 24, 5), new n72("GPSDestDistanceRef", 25, 2), new n72("GPSDestDistance", 26, 5), new n72("GPSProcessingMethod", 27, 7), new n72("GPSAreaInformation", 28, 7), new n72("GPSDateStamp", 29, 2), new n72("GPSDifferential", 30, 3)};
        n72[] n72VarArr5 = {new n72("InteroperabilityIndex", 1, 2)};
        n72[] n72VarArr6 = {new n72("NewSubfileType", 254, 4), new n72("SubfileType", 255, 4), new n72("ThumbnailImageWidth", 256), new n72("ThumbnailImageLength", Compress.MC20), new n72("BitsPerSample", 258, 3), new n72("Compression", 259, 3), new n72("PhotometricInterpretation", 262, 3), new n72("ImageDescription", 270, 2), new n72("Make", 271, 2), new n72("Model", 272, 2), new n72("StripOffsets", 273), new n72("Orientation", 274, 3), new n72("SamplesPerPixel", 277, 3), new n72("RowsPerStrip", 278), new n72("StripByteCounts", 279), new n72("XResolution", 282, 5), new n72("YResolution", 283, 5), new n72("PlanarConfiguration", 284, 3), new n72("ResolutionUnit", 296, 3), new n72("TransferFunction", MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 3), new n72("Software", 305, 2), new n72("DateTime", 306, 2), new n72("Artist", 315, 2), new n72("WhitePoint", 318, 5), new n72("PrimaryChromaticities", 319, 5), new n72("SubIFDPointer", 330, 4), new n72("JPEGInterchangeFormat", 513, 4), new n72("JPEGInterchangeFormatLength", 514, 4), new n72("YCbCrCoefficients", 529, 5), new n72("YCbCrSubSampling", 530, 3), new n72("YCbCrPositioning", 531, 3), new n72("ReferenceBlackWhite", 532, 5), new n72("Copyright", 33432, 2), new n72("ExifIFDPointer", 34665, 4), new n72("GPSInfoIFDPointer", 34853, 4), new n72("DNGVersion", 50706, 1), new n72("DefaultCropSize", 50720)};
        t = new n72("StripOffsets", 273, 3);
        u = new n72[][]{n72VarArr2, n72VarArr3, n72VarArr4, n72VarArr5, n72VarArr6, n72VarArr2, new n72[]{new n72("ThumbnailImage", 256, 7), new n72("CameraSettingsIFDPointer", 8224, 4), new n72("ImageProcessingIFDPointer", 8256, 4)}, new n72[]{new n72("PreviewImageStart", Compress.MC20, 4), new n72("PreviewImageLength", 258, 4)}, new n72[]{new n72("AspectFrame", 4371, 3)}, new n72[]{new n72("ColorSpace", 55, 3)}};
        v = new n72[]{new n72("SubIFDPointer", 330, 4), new n72("ExifIFDPointer", 34665, 4), new n72("GPSInfoIFDPointer", 34853, 4), new n72("InteroperabilityIFDPointer", 40965, 4), new n72("CameraSettingsIFDPointer", 8224, 1), new n72("ImageProcessingIFDPointer", 8256, 1)};
        w = new HashMap[10];
        x = new HashMap[10];
        y = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        z = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        A = forName;
        B = "Exif\u0000\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            n72[][] n72VarArr7 = u;
            if (i < n72VarArr7.length) {
                w[i] = new HashMap();
                x[i] = new HashMap();
                for (n72 n72Var : n72VarArr7[i]) {
                    w[i].put(Integer.valueOf(n72Var.a), n72Var);
                    x[i].put(n72Var.b, n72Var);
                }
                i++;
            } else {
                HashMap hashMap = z;
                n72[] n72VarArr8 = v;
                hashMap.put(Integer.valueOf(n72VarArr8[0].a), 5);
                hashMap.put(Integer.valueOf(n72VarArr8[1].a), 1);
                hashMap.put(Integer.valueOf(n72VarArr8[2].a), 2);
                hashMap.put(Integer.valueOf(n72VarArr8[3].a), 3);
                hashMap.put(Integer.valueOf(n72VarArr8[4].a), 7);
                hashMap.put(Integer.valueOf(n72VarArr8[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public s72(String str) {
        FileInputStream fileInputStream = null;
        if (str != null) {
            this.a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    m(fileInputStream2);
                    try {
                        fileInputStream2.close();
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (RuntimeException e2) {
                            throw e2;
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            i.h("filename cannot be null");
            throw null;
        }
    }

    public static long[] b(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static ByteOrder o(j72 j72Var) {
        short readShort = j72Var.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            e41.x(Integer.toHexString(readShort), "Invalid byte order: ");
            return null;
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        String c = c("DateTimeOriginal");
        HashMap[] hashMapArr = this.c;
        if (c != null && c("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = c.concat("\u0000").getBytes(A);
            hashMap.put("DateTime", new l72(bytes, 2, bytes.length));
        }
        if (c("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", l72.a(0L, this.d));
        }
        if (c("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", l72.a(0L, this.d));
        }
        if (c("Orientation") == null) {
            hashMapArr[0].put("Orientation", l72.a(0L, this.d));
        }
        if (c("LightSource") == null) {
            hashMapArr[1].put("LightSource", l72.a(0L, this.d));
        }
    }

    public final String c(String str) {
        l72 d = d(str);
        if (d != null) {
            int i = d.a;
            if (!y.contains(str)) {
                return d.f(this.d);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                p72[] p72VarArr = (p72[]) d.g(this.d);
                if (p72VarArr != null && p72VarArr.length == 3) {
                    p72 p72Var = p72VarArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) p72Var.a) / ((float) p72Var.b)));
                    p72 p72Var2 = p72VarArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) p72Var2.a) / ((float) p72Var2.b)));
                    p72 p72Var3 = p72VarArr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) p72Var3.a) / ((float) p72Var3.b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(p72VarArr));
                return null;
            }
            try {
                return Double.toString(d.d(this.d));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final l72 d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < u.length; i++) {
            l72 l72Var = (l72) this.c[i].get(str);
            if (l72Var != null) {
                return l72Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0115, code lost:
        r12.B = r11.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0119, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(j72 j72Var, int i, int i2) {
        j72Var.B = ByteOrder.BIG_ENDIAN;
        j72Var.e(i);
        byte readByte = j72Var.readByte();
        if (readByte == -1) {
            if (j72Var.readByte() == -40) {
                int i3 = i + 2;
                while (true) {
                    byte readByte2 = j72Var.readByte();
                    if (readByte2 == -1) {
                        byte readByte3 = j72Var.readByte();
                        if (readByte3 != -39 && readByte3 != -38) {
                            int readUnsignedShort = j72Var.readUnsignedShort();
                            int i4 = readUnsignedShort - 2;
                            int i5 = i3 + 4;
                            if (i4 >= 0) {
                                if (readByte3 != -31) {
                                    HashMap[] hashMapArr = this.c;
                                    if (readByte3 != -2) {
                                        switch (readByte3) {
                                            default:
                                                switch (readByte3) {
                                                    default:
                                                        switch (readByte3) {
                                                            default:
                                                                switch (readByte3) {
                                                                }
                                                            case -55:
                                                            case -54:
                                                            case -53:
                                                                if (j72Var.skipBytes(1) == 1) {
                                                                    hashMapArr[i2].put("ImageLength", l72.a(j72Var.readUnsignedShort(), this.d));
                                                                    hashMapArr[i2].put("ImageWidth", l72.a(j72Var.readUnsignedShort(), this.d));
                                                                    i4 = readUnsignedShort - 7;
                                                                    break;
                                                                } else {
                                                                    e41.i("Invalid SOFx");
                                                                    return;
                                                                }
                                                        }
                                                    case -59:
                                                    case -58:
                                                    case -57:
                                                        break;
                                                }
                                            case -64:
                                            case -63:
                                            case -62:
                                            case -61:
                                                break;
                                        }
                                    } else {
                                        byte[] bArr = new byte[i4];
                                        if (j72Var.read(bArr) == i4) {
                                            if (c("UserComment") == null) {
                                                HashMap hashMap = hashMapArr[1];
                                                Charset charset = A;
                                                byte[] bytes = new String(bArr, charset).concat("\u0000").getBytes(charset);
                                                hashMap.put("UserComment", new l72(bytes, 2, bytes.length));
                                            }
                                            i4 = 0;
                                        } else {
                                            e41.i("Invalid exif");
                                            return;
                                        }
                                    }
                                } else if (i4 >= 6) {
                                    byte[] bArr2 = new byte[6];
                                    if (j72Var.read(bArr2) == 6) {
                                        i5 = i3 + 10;
                                        int i6 = readUnsignedShort - 8;
                                        if (!Arrays.equals(bArr2, B)) {
                                            i4 = i6;
                                        } else if (i6 > 0) {
                                            this.e = i5;
                                            byte[] bArr3 = new byte[i6];
                                            if (j72Var.read(bArr3) == i6) {
                                                i5 += i6;
                                                j72 j72Var2 = new j72(bArr3);
                                                n(j72Var2, i6);
                                                p(j72Var2, i2);
                                                i4 = 0;
                                            } else {
                                                e41.i("Invalid exif");
                                                return;
                                            }
                                        } else {
                                            e41.i("Invalid exif");
                                            return;
                                        }
                                    } else {
                                        e41.i("Invalid exif");
                                        return;
                                    }
                                }
                                if (i4 >= 0) {
                                    if (j72Var.skipBytes(i4) == i4) {
                                        i3 = i5 + i4;
                                    } else {
                                        e41.i("Invalid JPEG segment");
                                        return;
                                    }
                                } else {
                                    e41.i("Invalid length");
                                    return;
                                }
                            } else {
                                e41.i("Invalid length");
                                return;
                            }
                        }
                    } else {
                        e41.x(Integer.toHexString(readByte2 & 255), "Invalid marker:");
                        return;
                    }
                }
            } else {
                e41.x(Integer.toHexString(readByte & 255), "Invalid marker: ");
            }
        } else {
            e41.x(Integer.toHexString(readByte & 255), "Invalid marker: ");
        }
    }

    public final int f(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr2 = n;
            if (i < bArr2.length) {
                if (bArr[i] != bArr2[i]) {
                    byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                    for (int i2 = 0; i2 < bytes.length; i2++) {
                        if (bArr[i2] != bytes[i2]) {
                            j72 j72Var = new j72(bArr);
                            ByteOrder o2 = o(j72Var);
                            this.d = o2;
                            j72Var.B = o2;
                            short readShort = j72Var.readShort();
                            j72Var.close();
                            if (readShort != 20306 && readShort != 21330) {
                                j72 j72Var2 = new j72(bArr);
                                ByteOrder o3 = o(j72Var2);
                                this.d = o3;
                                j72Var2.B = o3;
                                short readShort2 = j72Var2.readShort();
                                j72Var2.close();
                                if (readShort2 != 85) {
                                    return 0;
                                }
                                return 10;
                            }
                            return 7;
                        }
                    }
                    return 9;
                }
                i++;
            } else {
                return 4;
            }
        }
    }

    public final void g(j72 j72Var) {
        int i;
        int i2;
        i(j72Var);
        HashMap[] hashMapArr = this.c;
        l72 l72Var = (l72) hashMapArr[1].get("MakerNote");
        if (l72Var != null) {
            j72 j72Var2 = new j72(l72Var.c);
            j72Var2.B = this.d;
            byte[] bArr = o;
            byte[] bArr2 = new byte[bArr.length];
            j72Var2.readFully(bArr2);
            j72Var2.e(0L);
            byte[] bArr3 = p;
            byte[] bArr4 = new byte[bArr3.length];
            j72Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                j72Var2.e(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                j72Var2.e(12L);
            }
            p(j72Var2, 6);
            l72 l72Var2 = (l72) hashMapArr[7].get("PreviewImageStart");
            l72 l72Var3 = (l72) hashMapArr[7].get("PreviewImageLength");
            if (l72Var2 != null && l72Var3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", l72Var2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", l72Var3);
            }
            l72 l72Var4 = (l72) hashMapArr[8].get("AspectFrame");
            if (l72Var4 != null) {
                int[] iArr = (int[]) l72Var4.g(this.d);
                if (iArr != null && iArr.length == 4) {
                    int i3 = iArr[2];
                    int i4 = iArr[0];
                    if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                        int i5 = (i3 - i4) + 1;
                        int i6 = (i - i2) + 1;
                        if (i5 < i6) {
                            int i7 = i5 + i6;
                            i6 = i7 - i6;
                            i5 = i7 - i6;
                        }
                        l72 c = l72.c(i5, this.d);
                        l72 c2 = l72.c(i6, this.d);
                        hashMapArr[0].put("ImageWidth", c);
                        hashMapArr[0].put("ImageLength", c2);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void h(j72 j72Var) {
        j72Var.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        j72Var.read(bArr);
        j72Var.skipBytes(4);
        j72Var.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        e(j72Var, i, 5);
        j72Var.e(i2);
        j72Var.B = ByteOrder.BIG_ENDIAN;
        int readInt = j72Var.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = j72Var.readUnsignedShort();
            int readUnsignedShort2 = j72Var.readUnsignedShort();
            if (readUnsignedShort == t.a) {
                short readShort = j72Var.readShort();
                short readShort2 = j72Var.readShort();
                l72 c = l72.c(readShort, this.d);
                l72 c2 = l72.c(readShort2, this.d);
                HashMap[] hashMapArr = this.c;
                hashMapArr[0].put("ImageLength", c);
                hashMapArr[0].put("ImageWidth", c2);
                return;
            }
            j72Var.skipBytes(readUnsignedShort2);
        }
    }

    public final void i(j72 j72Var) {
        l72 l72Var;
        n(j72Var, j72Var.A.available());
        p(j72Var, 0);
        s(j72Var, 0);
        s(j72Var, 5);
        s(j72Var, 4);
        r(0, 5);
        r(0, 4);
        r(5, 4);
        HashMap[] hashMapArr = this.c;
        l72 l72Var2 = (l72) hashMapArr[1].get("PixelXDimension");
        l72 l72Var3 = (l72) hashMapArr[1].get("PixelYDimension");
        if (l72Var2 != null && l72Var3 != null) {
            hashMapArr[0].put("ImageWidth", l72Var2);
            hashMapArr[0].put("ImageLength", l72Var3);
        }
        if (hashMapArr[4].isEmpty() && l(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!l(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        if (this.b == 8 && (l72Var = (l72) hashMapArr[1].get("MakerNote")) != null) {
            j72 j72Var2 = new j72(l72Var.c);
            j72Var2.B = this.d;
            j72Var2.e(6L);
            p(j72Var2, 9);
            l72 l72Var4 = (l72) hashMapArr[9].get("ColorSpace");
            if (l72Var4 != null) {
                hashMapArr[1].put("ColorSpace", l72Var4);
            }
        }
    }

    public final void j(j72 j72Var) {
        i(j72Var);
        HashMap[] hashMapArr = this.c;
        if (((l72) hashMapArr[0].get("JpgFromRaw")) != null) {
            e(j72Var, this.i, 5);
        }
        l72 l72Var = (l72) hashMapArr[0].get("ISO");
        l72 l72Var2 = (l72) hashMapArr[1].get("PhotographicSensitivity");
        if (l72Var != null && l72Var2 == null) {
            hashMapArr[1].put("PhotographicSensitivity", l72Var);
        }
    }

    public final void k(j72 j72Var, HashMap hashMap) {
        int i;
        l72 l72Var = (l72) hashMap.get("JPEGInterchangeFormat");
        l72 l72Var2 = (l72) hashMap.get("JPEGInterchangeFormatLength");
        if (l72Var != null && l72Var2 != null) {
            int e = l72Var.e(this.d);
            int min = Math.min(l72Var2.e(this.d), j72Var.A.available() - e);
            int i2 = this.b;
            if (i2 != 4 && i2 != 9 && i2 != 10) {
                if (i2 == 7) {
                    i = this.f;
                }
                if (e <= 0 && min > 0 && this.a == null) {
                    j72Var.e(e);
                    j72Var.readFully(new byte[min]);
                    return;
                }
                return;
            }
            i = this.e;
            e += i;
            if (e <= 0) {
            }
        }
    }

    public final boolean l(HashMap hashMap) {
        l72 l72Var = (l72) hashMap.get("ImageLength");
        l72 l72Var2 = (l72) hashMap.get("ImageWidth");
        if (l72Var != null && l72Var2 != null) {
            int e = l72Var.e(this.d);
            int e2 = l72Var2.e(this.d);
            if (e <= 512 && e2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void m(FileInputStream fileInputStream) {
        for (int i = 0; i < u.length; i++) {
            try {
                this.c[i] = new HashMap();
            } catch (IOException unused) {
                a();
                return;
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 5000);
        this.b = f(bufferedInputStream);
        j72 j72Var = new j72(bufferedInputStream);
        switch (this.b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                i(j72Var);
                break;
            case 4:
                e(j72Var, 0, 0);
                break;
            case 7:
                g(j72Var);
                break;
            case 9:
                h(j72Var);
                break;
            case 10:
                j(j72Var);
                break;
        }
        q(j72Var);
        a();
    }

    public final void n(j72 j72Var, int i) {
        ByteOrder o2 = o(j72Var);
        this.d = o2;
        j72Var.B = o2;
        int readUnsignedShort = j72Var.readUnsignedShort();
        int i2 = this.b;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            e41.x(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = j72Var.readInt();
        if (readInt >= 8 && readInt < i) {
            int i3 = readInt - 8;
            if (i3 > 0 && j72Var.skipBytes(i3) != i3) {
                e41.i(lb1.g(i3, "Couldn't jump to first Ifd: "));
                return;
            }
            return;
        }
        e41.i(lb1.g(readInt, "Invalid first Ifd offset: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(j72 j72Var, int i) {
        HashMap[] hashMapArr;
        int readInt;
        short s2;
        short s3;
        HashMap[] hashMapArr2;
        int[] iArr;
        long j2;
        boolean z2;
        int i2;
        HashMap[] hashMapArr3;
        long j3;
        int i3;
        int readUnsignedShort;
        long j4;
        int i4 = i;
        int i5 = j72Var.R + 2;
        int i6 = j72Var.L;
        if (i5 <= i6) {
            short readShort = j72Var.readShort();
            if ((readShort * 12) + j72Var.R <= i6) {
                short s4 = 0;
                while (true) {
                    hashMapArr = this.c;
                    if (s4 >= readShort) {
                        break;
                    }
                    int readUnsignedShort2 = j72Var.readUnsignedShort();
                    int readUnsignedShort3 = j72Var.readUnsignedShort();
                    int readInt2 = j72Var.readInt();
                    long j5 = j72Var.R + 4;
                    n72 n72Var = (n72) w[i4].get(Integer.valueOf(readUnsignedShort2));
                    if (n72Var == null) {
                        Log.w("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
                        s2 = readShort;
                        s3 = s4;
                    } else {
                        if (readUnsignedShort3 > 0) {
                            if (readUnsignedShort3 < r.length) {
                                int i7 = n72Var.c;
                                s2 = readShort;
                                int i8 = 7;
                                if (i7 == 7 || readUnsignedShort3 == 7) {
                                    s3 = s4;
                                } else {
                                    if (i7 == readUnsignedShort3 || (i2 = n72Var.d) == readUnsignedShort3) {
                                        s3 = s4;
                                    } else {
                                        s3 = s4;
                                        if (((i7 != 4 && i2 != 4) || readUnsignedShort3 != 3) && (((i7 != 9 && i2 != 9) || readUnsignedShort3 != 8) && ((i7 != 12 && i2 != 12) || readUnsignedShort3 != 11))) {
                                            Log.w("ExifInterface", "Skip the tag entry since data format (" + q[readUnsignedShort3] + ") is unexpected for tag: " + n72Var.b);
                                        }
                                    }
                                    i8 = 7;
                                }
                                if (readUnsignedShort3 == i8) {
                                    readUnsignedShort3 = i7;
                                }
                                hashMapArr2 = hashMapArr;
                                j2 = iArr[readUnsignedShort3] * readInt2;
                                if (j2 >= 0 && j2 <= 2147483647L) {
                                    z2 = true;
                                    if (z2) {
                                    }
                                    s4 = (short) (s3 + 1);
                                    i4 = i;
                                    readShort = s2;
                                } else {
                                    Log.w("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt2);
                                    z2 = false;
                                    if (z2) {
                                        j72Var.e(j5);
                                    } else {
                                        if (j2 > 4) {
                                            int readInt3 = j72Var.readInt();
                                            hashMapArr3 = hashMapArr2;
                                            int i9 = this.b;
                                            i3 = readUnsignedShort2;
                                            if (i9 == 7) {
                                                if ("MakerNote".equals(n72Var.b)) {
                                                    this.f = readInt3;
                                                } else if (i4 == 6 && "ThumbnailImage".equals(n72Var.b)) {
                                                    this.g = readInt3;
                                                    this.h = readInt2;
                                                    l72 c = l72.c(6, this.d);
                                                    j3 = j2;
                                                    l72 a = l72.a(this.g, this.d);
                                                    l72 a2 = l72.a(this.h, this.d);
                                                    hashMapArr3[4].put("Compression", c);
                                                    hashMapArr3[4].put("JPEGInterchangeFormat", a);
                                                    hashMapArr3[4].put("JPEGInterchangeFormatLength", a2);
                                                }
                                                j3 = j2;
                                            } else {
                                                j3 = j2;
                                                if (i9 == 10 && "JpgFromRaw".equals(n72Var.b)) {
                                                    this.i = readInt3;
                                                }
                                            }
                                            long j6 = readInt3;
                                            if (j6 + j3 <= i6) {
                                                j72Var.e(j6);
                                            } else {
                                                Log.w("ExifInterface", "Skip the tag entry since data offset is invalid: " + readInt3);
                                                j72Var.e(j5);
                                            }
                                        } else {
                                            hashMapArr3 = hashMapArr2;
                                            j3 = j2;
                                            i3 = readUnsignedShort2;
                                        }
                                        Integer num = (Integer) z.get(Integer.valueOf(i3));
                                        if (num != null) {
                                            if (readUnsignedShort3 != 3) {
                                                if (readUnsignedShort3 != 4) {
                                                    if (readUnsignedShort3 != 8) {
                                                        if (readUnsignedShort3 != 9 && readUnsignedShort3 != 13) {
                                                            j4 = -1;
                                                        } else {
                                                            readUnsignedShort = j72Var.readInt();
                                                        }
                                                    } else {
                                                        readUnsignedShort = j72Var.readShort();
                                                    }
                                                } else {
                                                    j4 = j72Var.readInt() & 4294967295L;
                                                }
                                                if (j4 <= 0 && j4 < i6) {
                                                    j72Var.e(j4);
                                                    p(j72Var, num.intValue());
                                                } else {
                                                    Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                                                }
                                                j72Var.e(j5);
                                            } else {
                                                readUnsignedShort = j72Var.readUnsignedShort();
                                            }
                                            j4 = readUnsignedShort;
                                            if (j4 <= 0) {
                                            }
                                            Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                                            j72Var.e(j5);
                                        } else {
                                            byte[] bArr = new byte[(int) j3];
                                            j72Var.readFully(bArr);
                                            l72 l72Var = new l72(bArr, readUnsignedShort3, readInt2);
                                            HashMap hashMap = hashMapArr3[i];
                                            String str = n72Var.b;
                                            hashMap.put(str, l72Var);
                                            if ("DNGVersion".equals(str)) {
                                                this.b = 3;
                                            }
                                            if ((("Make".equals(str) || "Model".equals(str)) && l72Var.f(this.d).contains("PENTAX")) || ("Compression".equals(str) && l72Var.e(this.d) == 65535)) {
                                                this.b = 8;
                                            }
                                            if (j72Var.R != j5) {
                                                j72Var.e(j5);
                                            }
                                        }
                                    }
                                    s4 = (short) (s3 + 1);
                                    i4 = i;
                                    readShort = s2;
                                }
                            }
                        }
                        s2 = readShort;
                        s3 = s4;
                        hashMapArr2 = hashMapArr;
                        Log.w("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                        j2 = 0;
                        z2 = false;
                        if (z2) {
                        }
                        s4 = (short) (s3 + 1);
                        i4 = i;
                        readShort = s2;
                    }
                    hashMapArr2 = hashMapArr;
                    j2 = 0;
                    z2 = false;
                    if (z2) {
                    }
                    s4 = (short) (s3 + 1);
                    i4 = i;
                    readShort = s2;
                }
                if (j72Var.R + 4 <= i6 && (readInt = j72Var.readInt()) > 8 && readInt < i6) {
                    j72Var.e(readInt);
                    if (hashMapArr[4].isEmpty()) {
                        p(j72Var, 4);
                    } else if (hashMapArr[5].isEmpty()) {
                        p(j72Var, 5);
                    }
                }
            }
        }
    }

    public final void q(j72 j72Var) {
        l72 l72Var;
        HashMap hashMap = this.c[4];
        l72 l72Var2 = (l72) hashMap.get("Compression");
        if (l72Var2 != null) {
            int e = l72Var2.e(this.d);
            if (e != 1) {
                if (e != 6) {
                    if (e != 7) {
                        return;
                    }
                } else {
                    k(j72Var, hashMap);
                    return;
                }
            }
            l72 l72Var3 = (l72) hashMap.get("BitsPerSample");
            if (l72Var3 != null) {
                int[] iArr = (int[]) l72Var3.g(this.d);
                int[] iArr2 = l;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.b == 3 && (l72Var = (l72) hashMap.get("PhotometricInterpretation")) != null) {
                        int e2 = l72Var.e(this.d);
                        if ((e2 != 1 || !Arrays.equals(iArr, m)) && (e2 != 6 || !Arrays.equals(iArr, iArr2))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                l72 l72Var4 = (l72) hashMap.get("StripOffsets");
                l72 l72Var5 = (l72) hashMap.get("StripByteCounts");
                if (l72Var4 != null && l72Var5 != null) {
                    long[] b = b(l72Var4.g(this.d));
                    long[] b2 = b(l72Var5.g(this.d));
                    if (b == null) {
                        Log.w("ExifInterface", "stripOffsets should not be null.");
                        return;
                    } else if (b2 == null) {
                        Log.w("ExifInterface", "stripByteCounts should not be null.");
                        return;
                    } else {
                        long j2 = 0;
                        for (long j3 : b2) {
                            j2 += j3;
                        }
                        byte[] bArr = new byte[(int) j2];
                        int i = 0;
                        int i2 = 0;
                        for (int i3 = 0; i3 < b.length; i3++) {
                            int i4 = (int) b2[i3];
                            int i5 = ((int) b[i3]) - i;
                            if (i5 < 0) {
                                Log.d("ExifInterface", "Invalid strip offset value");
                            }
                            j72Var.e(i5);
                            int i6 = i + i5;
                            byte[] bArr2 = new byte[i4];
                            j72Var.read(bArr2);
                            i = i6 + i4;
                            System.arraycopy(bArr2, 0, bArr, i2, i4);
                            i2 += i4;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        k(j72Var, hashMap);
    }

    public final void r(int i, int i2) {
        HashMap[] hashMapArr = this.c;
        if (!hashMapArr[i].isEmpty() && !hashMapArr[i2].isEmpty()) {
            l72 l72Var = (l72) hashMapArr[i].get("ImageLength");
            l72 l72Var2 = (l72) hashMapArr[i].get("ImageWidth");
            l72 l72Var3 = (l72) hashMapArr[i2].get("ImageLength");
            l72 l72Var4 = (l72) hashMapArr[i2].get("ImageWidth");
            if (l72Var != null && l72Var2 != null && l72Var3 != null && l72Var4 != null) {
                int e = l72Var.e(this.d);
                int e2 = l72Var2.e(this.d);
                int e3 = l72Var3.e(this.d);
                int e4 = l72Var4.e(this.d);
                if (e < e3 && e2 < e4) {
                    HashMap hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    public final void s(j72 j72Var, int i) {
        l72 l72Var;
        l72 c;
        l72 c2;
        HashMap[] hashMapArr = this.c;
        l72 l72Var2 = (l72) hashMapArr[i].get("DefaultCropSize");
        l72 l72Var3 = (l72) hashMapArr[i].get("SensorTopBorder");
        l72 l72Var4 = (l72) hashMapArr[i].get("SensorLeftBorder");
        l72 l72Var5 = (l72) hashMapArr[i].get("SensorBottomBorder");
        l72 l72Var6 = (l72) hashMapArr[i].get("SensorRightBorder");
        if (l72Var2 != null) {
            int i2 = l72Var2.a;
            ByteOrder byteOrder = this.d;
            if (i2 == 5) {
                p72[] p72VarArr = (p72[]) l72Var2.g(byteOrder);
                if (p72VarArr != null && p72VarArr.length == 2) {
                    c = l72.b(p72VarArr[0], this.d);
                    c2 = l72.b(p72VarArr[1], this.d);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(p72VarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) l72Var2.g(byteOrder);
                if (iArr != null && iArr.length == 2) {
                    c = l72.c(iArr[0], this.d);
                    c2 = l72.c(iArr[1], this.d);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i].put("ImageWidth", c);
            hashMapArr[i].put("ImageLength", c2);
        } else if (l72Var3 != null && l72Var4 != null && l72Var5 != null && l72Var6 != null) {
            int e = l72Var3.e(this.d);
            int e2 = l72Var5.e(this.d);
            int e3 = l72Var6.e(this.d);
            int e4 = l72Var4.e(this.d);
            if (e2 > e && e3 > e4) {
                l72 c3 = l72.c(e2 - e, this.d);
                l72 c4 = l72.c(e3 - e4, this.d);
                hashMapArr[i].put("ImageLength", c3);
                hashMapArr[i].put("ImageWidth", c4);
            }
        } else {
            l72 l72Var7 = (l72) hashMapArr[i].get("ImageLength");
            l72 l72Var8 = (l72) hashMapArr[i].get("ImageWidth");
            if ((l72Var7 == null || l72Var8 == null) && (l72Var = (l72) hashMapArr[i].get("JPEGInterchangeFormat")) != null) {
                e(j72Var, l72Var.e(this.d), i);
            }
        }
    }
}
