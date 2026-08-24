package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.github.junrar.unpack.decode.Compress;
import com.google.mlkit.common.MlKitException;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r72  reason: default package */
/* loaded from: classes.dex */
public final class r72 {
    public static final String[] G;
    public static final int[] H;
    public static final byte[] I;
    public static final m72 J;
    public static final m72[][] K;
    public static final m72[] L;
    public static final HashMap[] M;
    public static final HashMap[] N;
    public static final Set O;
    public static final HashMap P;
    public static final Charset Q;
    public static final byte[] R;
    public static final byte[] S;
    public final String a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final boolean e;
    public final HashMap[] f;
    public final HashSet g;
    public ByteOrder h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public k72 n;
    public static final boolean o = Log.isLoggable("ExifInterface", 3);
    public static final List p = Arrays.asList(1, 6, 3, 8);
    public static final List q = Arrays.asList(2, 7, 4, 5);
    public static final int[] r = {8, 8, 8};
    public static final int[] s = {8};
    public static final byte[] t = {-1, -40, -1};
    public static final byte[] u = {102, 116, 121, 112};
    public static final byte[] v = {109, 105, 102, 49};
    public static final byte[] w = {104, 101, 105, 99};
    public static final byte[] x = {97, 118, 105, 102};
    public static final byte[] y = {97, 118, 105, 115};
    public static final byte[] z = {79, 76, 89, 77, 80, 0};
    public static final byte[] A = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] B = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] C = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    public static final byte[] D = {82, 73, 70, 70};
    public static final byte[] E = {87, 69, 66, 80};
    public static final byte[] F = {69, 88, 73, 70};

    static {
        m72[] m72VarArr;
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        G = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        H = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        I = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        m72[] m72VarArr2 = {new m72("NewSubfileType", 254, 4), new m72("SubfileType", 255, 4), new m72("ImageWidth", 256, 3, 4), new m72("ImageLength", Compress.MC20, 3, 4), new m72("BitsPerSample", 258, 3), new m72("Compression", 259, 3), new m72("PhotometricInterpretation", 262, 3), new m72("ImageDescription", 270, 2), new m72("Make", 271, 2), new m72("Model", 272, 2), new m72("StripOffsets", 273, 3, 4), new m72("Orientation", 274, 3), new m72("SamplesPerPixel", 277, 3), new m72("RowsPerStrip", 278, 3, 4), new m72("StripByteCounts", 279, 3, 4), new m72("XResolution", 282, 5), new m72("YResolution", 283, 5), new m72("PlanarConfiguration", 284, 3), new m72("ResolutionUnit", 296, 3), new m72("TransferFunction", MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 3), new m72("Software", 305, 2), new m72("DateTime", 306, 2), new m72("Artist", 315, 2), new m72("WhitePoint", 318, 5), new m72("PrimaryChromaticities", 319, 5), new m72("SubIFDPointer", 330, 4), new m72("JPEGInterchangeFormat", 513, 4), new m72("JPEGInterchangeFormatLength", 514, 4), new m72("YCbCrCoefficients", 529, 5), new m72("YCbCrSubSampling", 530, 3), new m72("YCbCrPositioning", 531, 3), new m72("ReferenceBlackWhite", 532, 5), new m72("Copyright", 33432, 2), new m72("ExifIFDPointer", 34665, 4), new m72("GPSInfoIFDPointer", 34853, 4), new m72("SensorTopBorder", 4, 4), new m72("SensorLeftBorder", 5, 4), new m72("SensorBottomBorder", 6, 4), new m72("SensorRightBorder", 7, 4), new m72("ISO", 23, 3), new m72("JpgFromRaw", 46, 7), new m72("Xmp", 700, 1)};
        m72[] m72VarArr3 = {new m72("ExposureTime", 33434, 5), new m72("FNumber", 33437, 5), new m72("ExposureProgram", 34850, 3), new m72("SpectralSensitivity", 34852, 2), new m72("PhotographicSensitivity", 34855, 3), new m72("OECF", 34856, 7), new m72("SensitivityType", 34864, 3), new m72("StandardOutputSensitivity", 34865, 4), new m72("RecommendedExposureIndex", 34866, 4), new m72("ISOSpeed", 34867, 4), new m72("ISOSpeedLatitudeyyy", 34868, 4), new m72("ISOSpeedLatitudezzz", 34869, 4), new m72("ExifVersion", 36864, 2), new m72("DateTimeOriginal", 36867, 2), new m72("DateTimeDigitized", 36868, 2), new m72("OffsetTime", 36880, 2), new m72("OffsetTimeOriginal", 36881, 2), new m72("OffsetTimeDigitized", 36882, 2), new m72("ComponentsConfiguration", 37121, 7), new m72("CompressedBitsPerPixel", 37122, 5), new m72("ShutterSpeedValue", 37377, 10), new m72("ApertureValue", 37378, 5), new m72("BrightnessValue", 37379, 10), new m72("ExposureBiasValue", 37380, 10), new m72("MaxApertureValue", 37381, 5), new m72("SubjectDistance", 37382, 5), new m72("MeteringMode", 37383, 3), new m72("LightSource", 37384, 3), new m72("Flash", 37385, 3), new m72("FocalLength", 37386, 5), new m72("SubjectArea", 37396, 3), new m72("MakerNote", 37500, 7), new m72("UserComment", 37510, 7), new m72("SubSecTime", 37520, 2), new m72("SubSecTimeOriginal", 37521, 2), new m72("SubSecTimeDigitized", 37522, 2), new m72("FlashpixVersion", 40960, 7), new m72("ColorSpace", 40961, 3), new m72("PixelXDimension", 40962, 3, 4), new m72("PixelYDimension", 40963, 3, 4), new m72("RelatedSoundFile", 40964, 2), new m72("InteroperabilityIFDPointer", 40965, 4), new m72("FlashEnergy", 41483, 5), new m72("SpatialFrequencyResponse", 41484, 7), new m72("FocalPlaneXResolution", 41486, 5), new m72("FocalPlaneYResolution", 41487, 5), new m72("FocalPlaneResolutionUnit", 41488, 3), new m72("SubjectLocation", 41492, 3), new m72("ExposureIndex", 41493, 5), new m72("SensingMethod", 41495, 3), new m72("FileSource", 41728, 7), new m72("SceneType", 41729, 7), new m72("CFAPattern", 41730, 7), new m72("CustomRendered", 41985, 3), new m72("ExposureMode", 41986, 3), new m72("WhiteBalance", 41987, 3), new m72("DigitalZoomRatio", 41988, 5), new m72("FocalLengthIn35mmFilm", 41989, 3), new m72("SceneCaptureType", 41990, 3), new m72("GainControl", 41991, 3), new m72("Contrast", 41992, 3), new m72("Saturation", 41993, 3), new m72("Sharpness", 41994, 3), new m72("DeviceSettingDescription", 41995, 7), new m72("SubjectDistanceRange", 41996, 3), new m72("ImageUniqueID", 42016, 2), new m72("CameraOwnerName", 42032, 2), new m72("BodySerialNumber", 42033, 2), new m72("LensSpecification", 42034, 5), new m72("LensMake", 42035, 2), new m72("LensModel", 42036, 2), new m72("Gamma", 42240, 5), new m72("DNGVersion", 50706, 1), new m72("DefaultCropSize", 50720, 3, 4)};
        m72[] m72VarArr4 = {new m72("GPSVersionID", 0, 1), new m72("GPSLatitudeRef", 1, 2), new m72("GPSLatitude", 2, 5, 10), new m72("GPSLongitudeRef", 3, 2), new m72("GPSLongitude", 4, 5, 10), new m72("GPSAltitudeRef", 5, 1), new m72("GPSAltitude", 6, 5), new m72("GPSTimeStamp", 7, 5), new m72("GPSSatellites", 8, 2), new m72("GPSStatus", 9, 2), new m72("GPSMeasureMode", 10, 2), new m72("GPSDOP", 11, 5), new m72("GPSSpeedRef", 12, 2), new m72("GPSSpeed", 13, 5), new m72("GPSTrackRef", 14, 2), new m72("GPSTrack", 15, 5), new m72("GPSImgDirectionRef", 16, 2), new m72("GPSImgDirection", 17, 5), new m72("GPSMapDatum", 18, 2), new m72("GPSDestLatitudeRef", 19, 2), new m72("GPSDestLatitude", 20, 5), new m72("GPSDestLongitudeRef", 21, 2), new m72("GPSDestLongitude", 22, 5), new m72("GPSDestBearingRef", 23, 2), new m72("GPSDestBearing", 24, 5), new m72("GPSDestDistanceRef", 25, 2), new m72("GPSDestDistance", 26, 5), new m72("GPSProcessingMethod", 27, 7), new m72("GPSAreaInformation", 28, 7), new m72("GPSDateStamp", 29, 2), new m72("GPSDifferential", 30, 3), new m72("GPSHPositioningError", 31, 5)};
        m72[] m72VarArr5 = {new m72("InteroperabilityIndex", 1, 2)};
        m72[] m72VarArr6 = {new m72("NewSubfileType", 254, 4), new m72("SubfileType", 255, 4), new m72("ThumbnailImageWidth", 256, 3, 4), new m72("ThumbnailImageLength", Compress.MC20, 3, 4), new m72("BitsPerSample", 258, 3), new m72("Compression", 259, 3), new m72("PhotometricInterpretation", 262, 3), new m72("ImageDescription", 270, 2), new m72("Make", 271, 2), new m72("Model", 272, 2), new m72("StripOffsets", 273, 3, 4), new m72("ThumbnailOrientation", 274, 3), new m72("SamplesPerPixel", 277, 3), new m72("RowsPerStrip", 278, 3, 4), new m72("StripByteCounts", 279, 3, 4), new m72("XResolution", 282, 5), new m72("YResolution", 283, 5), new m72("PlanarConfiguration", 284, 3), new m72("ResolutionUnit", 296, 3), new m72("TransferFunction", MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 3), new m72("Software", 305, 2), new m72("DateTime", 306, 2), new m72("Artist", 315, 2), new m72("WhitePoint", 318, 5), new m72("PrimaryChromaticities", 319, 5), new m72("SubIFDPointer", 330, 4), new m72("JPEGInterchangeFormat", 513, 4), new m72("JPEGInterchangeFormatLength", 514, 4), new m72("YCbCrCoefficients", 529, 5), new m72("YCbCrSubSampling", 530, 3), new m72("YCbCrPositioning", 531, 3), new m72("ReferenceBlackWhite", 532, 5), new m72("Copyright", 33432, 2), new m72("ExifIFDPointer", 34665, 4), new m72("GPSInfoIFDPointer", 34853, 4), new m72("DNGVersion", 50706, 1), new m72("DefaultCropSize", 50720, 3, 4)};
        J = new m72("StripOffsets", 273, 3);
        K = new m72[][]{m72VarArr2, m72VarArr3, m72VarArr4, m72VarArr5, m72VarArr6, m72VarArr2, new m72[]{new m72("ThumbnailImage", 256, 7), new m72("CameraSettingsIFDPointer", 8224, 4), new m72("ImageProcessingIFDPointer", 8256, 4)}, new m72[]{new m72("PreviewImageStart", Compress.MC20, 4), new m72("PreviewImageLength", 258, 4)}, new m72[]{new m72("AspectFrame", 4371, 3)}, new m72[]{new m72("ColorSpace", 55, 3)}};
        L = new m72[]{new m72("SubIFDPointer", 330, 4), new m72("ExifIFDPointer", 34665, 4), new m72("GPSInfoIFDPointer", 34853, 4), new m72("InteroperabilityIFDPointer", 40965, 4), new m72("CameraSettingsIFDPointer", 8224, 1), new m72("ImageProcessingIFDPointer", 8256, 1)};
        M = new HashMap[10];
        N = new HashMap[10];
        O = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        P = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        Q = forName;
        R = "Exif\u0000\u0000".getBytes(forName);
        S = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            m72[][] m72VarArr7 = K;
            if (i < m72VarArr7.length) {
                M[i] = new HashMap();
                N[i] = new HashMap();
                for (m72 m72Var : m72VarArr7[i]) {
                    M[i].put(Integer.valueOf(m72Var.a), m72Var);
                    N[i].put(m72Var.b, m72Var);
                }
                i++;
            } else {
                HashMap hashMap = P;
                m72[] m72VarArr8 = L;
                hashMap.put(Integer.valueOf(m72VarArr8[0].a), 5);
                hashMap.put(Integer.valueOf(m72VarArr8[1].a), 1);
                hashMap.put(Integer.valueOf(m72VarArr8[2].a), 2);
                hashMap.put(Integer.valueOf(m72VarArr8[3].a), 3);
                hashMap.put(Integer.valueOf(m72VarArr8[4].a), 7);
                hashMap.put(Integer.valueOf(m72VarArr8[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7 A[Catch: all -> 0x0064, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:14:0x0055, B:16:0x0058, B:24:0x006f, B:25:0x007d, B:31:0x008f, B:33:0x0096, B:51:0x00c7, B:38:0x00a6, B:45:0x00b4, B:48:0x00bc, B:49:0x00c0, B:50:0x00c4, B:52:0x00d1, B:54:0x00da, B:56:0x00e0, B:58:0x00e6, B:60:0x00ec, B:65:0x00f7), top: B:75:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r72(InputStream inputStream) {
        m72[][] m72VarArr = K;
        this.f = new HashMap[m72VarArr.length];
        this.g = new HashSet(m72VarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        this.a = null;
        this.e = false;
        boolean z2 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z3 = o;
        if (z2) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.c = null;
                    this.b = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (z3) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.c = null;
            this.b = null;
        }
        boolean z4 = this.e;
        for (int i = 0; i < m72VarArr.length; i++) {
            try {
                try {
                    this.f[i] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z3) {
                        r();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z3) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z3) {
                    return;
                }
                r();
            } catch (UnsupportedOperationException e2) {
                e = e2;
                if (z3) {
                }
                a();
                if (!z3) {
                }
                r();
            }
        }
        if (!z4) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.d = g(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i2 = this.d;
        if (i2 != 4 && i2 != 9 && i2 != 13 && i2 != 14) {
            q72 q72Var = new q72(inputStream);
            if (z4) {
                if (!m(q72Var)) {
                    a();
                    if (!z3) {
                        return;
                    }
                    r();
                }
            } else {
                int i3 = this.d;
                if (i3 != 12 && i3 != 15) {
                    if (i3 == 7) {
                        h(q72Var);
                    } else if (i3 == 10) {
                        l(q72Var);
                    } else {
                        k(q72Var);
                    }
                }
                e(q72Var, i3);
            }
            q72Var.h(this.j);
            w(q72Var);
            a();
            if (!z3) {
                return;
            }
            r();
        }
        i72 i72Var = new i72(inputStream);
        int i4 = this.d;
        if (i4 == 4) {
            f(i72Var, 0, 0);
        } else if (i4 == 13) {
            i(i72Var);
        } else if (i4 == 9) {
            j(i72Var);
        } else if (i4 == 14) {
            n(i72Var);
        }
        a();
        if (!z3) {
        }
        r();
    }

    public static ByteOrder s(i72 i72Var) {
        short readShort = i72Var.readShort();
        boolean z2 = o;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z2) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            e41.x(Integer.toHexString(readShort), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        String b = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f;
        if (b != null && b("DateTime") == null) {
            hashMapArr[0].put("DateTime", k72.a(b));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", k72.b(0L, this.h));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", k72.b(0L, this.h));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", k72.b(0L, this.h));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", k72.b(0L, this.h));
        }
    }

    public final String b(String str) {
        if (str != null) {
            k72 d = d(str);
            if (d != null) {
                int i = d.a;
                if (str.equals("GPSTimeStamp")) {
                    if (i != 5 && i != 10) {
                        Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                        return null;
                    }
                    o72[] o72VarArr = (o72[]) d.h(this.h);
                    if (o72VarArr != null && o72VarArr.length == 3) {
                        o72 o72Var = o72VarArr[0];
                        Integer valueOf = Integer.valueOf((int) (((float) o72Var.a) / ((float) o72Var.b)));
                        o72 o72Var2 = o72VarArr[1];
                        Integer valueOf2 = Integer.valueOf((int) (((float) o72Var2.a) / ((float) o72Var2.b)));
                        o72 o72Var3 = o72VarArr[2];
                        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) o72Var3.a) / ((float) o72Var3.b))));
                    }
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(o72VarArr));
                    return null;
                }
                boolean contains = O.contains(str);
                ByteOrder byteOrder = this.h;
                if (contains) {
                    try {
                        return Double.toString(d.e(byteOrder));
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    return d.g(byteOrder);
                }
            }
            return null;
        }
        u34.x("tag shouldn't be null");
        return null;
    }

    public final int c(int i, String str) {
        k72 d = d(str);
        if (d != null) {
            try {
                return d.f(this.h);
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return i;
    }

    public final k72 d(String str) {
        k72 k72Var;
        int i;
        k72 k72Var2;
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (o) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            if ("Xmp".equals(str) && (i = this.d) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (k72Var2 = this.n) != null)) {
                return k72Var2;
            }
            for (int i2 = 0; i2 < K.length; i2++) {
                k72 k72Var3 = (k72) this.f[i2].get(str);
                if (k72Var3 != null) {
                    return k72Var3;
                }
            }
            if (!"Xmp".equals(str) || (k72Var = this.n) == null) {
                return null;
            }
            return k72Var;
        }
        u34.x("tag shouldn't be null");
        return null;
    }

    public final void e(q72 q72Var, int i) {
        String str;
        String str2;
        String str3;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            if (i == 15 && i3 < 31) {
                fa6.h("Reading EXIF from AVIF files is supported from SDK 31 and above");
                return;
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(new h72(q72Var));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str3 = mediaMetadataRetriever.extractMetadata(30);
                        str2 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str3 = mediaMetadataRetriever.extractMetadata(19);
                        str2 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    HashMap[] hashMapArr = this.f;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", k72.d(Integer.parseInt(str), this.h));
                    }
                    if (str3 != null) {
                        hashMapArr[0].put("ImageLength", k72.d(Integer.parseInt(str3), this.h));
                    }
                    if (str2 != null) {
                        int parseInt = Integer.parseInt(str2);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i2 = 1;
                                } else {
                                    i2 = 8;
                                }
                            } else {
                                i2 = 3;
                            }
                        } else {
                            i2 = 6;
                        }
                        hashMapArr[0].put("Orientation", k72.d(i2, this.h));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            q72Var.h(parseInt2);
                            byte[] bArr = new byte[6];
                            q72Var.readFully(bArr);
                            int i4 = parseInt2 + 6;
                            int i5 = parseInt3 - 6;
                            if (Arrays.equals(bArr, R)) {
                                byte[] bArr2 = new byte[i5];
                                q72Var.readFully(bArr2);
                                this.j = i4;
                                t(bArr2, 0);
                            } else {
                                throw new IOException("Invalid identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                    String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                    if (extractMetadata5 != null && extractMetadata6 != null) {
                        int parseInt4 = Integer.parseInt(extractMetadata5);
                        int parseInt5 = Integer.parseInt(extractMetadata6);
                        long j = parseInt4;
                        q72Var.h(j);
                        byte[] bArr3 = new byte[parseInt5];
                        q72Var.readFully(bArr3);
                        this.n = new k72(j, bArr3, 1, parseInt5);
                    }
                    if (o) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str3 + ", rotation " + str2);
                    }
                    try {
                        mediaMetadataRetriever.release();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        }
        fa6.h("Reading EXIF from HEIC files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0159, code lost:
        r20.L = r19.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015d, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014b A[LOOP:0: B:10:0x0033->B:56:0x014b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(i72 i72Var, int i, int i2) {
        String str;
        String str2;
        boolean z2 = o;
        if (z2) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + i72Var);
        }
        i72Var.L = ByteOrder.BIG_ENDIAN;
        byte readByte = i72Var.readByte();
        if (readByte == -1) {
            if (i72Var.readByte() == -40) {
                int i3 = 2;
                while (true) {
                    byte readByte2 = i72Var.readByte();
                    if (readByte2 != -1) {
                        e41.x(Integer.toHexString(readByte2 & 255), "Invalid marker:");
                        return;
                    }
                    while (true) {
                        int i4 = i3 + 1;
                        byte readByte3 = i72Var.readByte();
                        if (readByte3 != -1) {
                            if (z2) {
                                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
                            }
                            if (readByte3 != -39 && readByte3 != -38) {
                                int readUnsignedShort = i72Var.readUnsignedShort();
                                int i5 = readUnsignedShort - 2;
                                int i6 = i3 + 4;
                                if (z2) {
                                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                                }
                                if (i5 >= 0) {
                                    if (readByte3 != -31) {
                                        HashMap[] hashMapArr = this.f;
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
                                                                    i72Var.e(1);
                                                                    HashMap hashMap = hashMapArr[i2];
                                                                    if (i2 != 4) {
                                                                        str = "ImageLength";
                                                                    } else {
                                                                        str = "ThumbnailImageLength";
                                                                    }
                                                                    hashMap.put(str, k72.b(i72Var.readUnsignedShort(), this.h));
                                                                    HashMap hashMap2 = hashMapArr[i2];
                                                                    if (i2 != 4) {
                                                                        str2 = "ImageWidth";
                                                                    } else {
                                                                        str2 = "ThumbnailImageWidth";
                                                                    }
                                                                    hashMap2.put(str2, k72.b(i72Var.readUnsignedShort(), this.h));
                                                                    i5 = readUnsignedShort - 7;
                                                                    break;
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
                                            if (i5 < 0) {
                                                i72Var.e(i5);
                                                i3 = i6 + i5;
                                            } else {
                                                e41.i("Invalid length");
                                                return;
                                            }
                                        } else {
                                            byte[] bArr = new byte[i5];
                                            i72Var.readFully(bArr);
                                            if (b("UserComment") == null) {
                                                hashMapArr[1].put("UserComment", k72.a(new String(bArr, Q)));
                                            }
                                        }
                                    } else {
                                        byte[] bArr2 = new byte[i5];
                                        i72Var.readFully(bArr2);
                                        int i7 = i6 + i5;
                                        byte[] bArr3 = R;
                                        if (g04.R(bArr2, bArr3)) {
                                            byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i5);
                                            this.j = i + i6 + bArr3.length;
                                            t(copyOfRange, i2);
                                            w(new i72(copyOfRange));
                                        } else {
                                            byte[] bArr4 = S;
                                            if (g04.R(bArr2, bArr4)) {
                                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i5);
                                                this.n = new k72(i6 + bArr4.length, copyOfRange2, 1, copyOfRange2.length);
                                            }
                                        }
                                        i6 = i7;
                                    }
                                    i5 = 0;
                                    if (i5 < 0) {
                                    }
                                } else {
                                    e41.i("Invalid length");
                                    return;
                                }
                            }
                        } else {
                            i3 = i4;
                        }
                    }
                }
            } else {
                e41.x(Integer.toHexString(readByte & 255), "Invalid marker: ");
            }
        } else {
            e41.x(Integer.toHexString(readByte & 255), "Invalid marker: ");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f4, code lost:
        if (r7 != null) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0165 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0132 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(BufferedInputStream bufferedInputStream) {
        int i;
        i72 i72Var;
        int i2;
        i72 i72Var2;
        int i3;
        long readInt;
        byte[] bArr;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i4 = 0;
        while (true) {
            byte[] bArr3 = t;
            if (i4 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i4] != bArr3[i4]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i5 = 0; i5 < bytes.length; i5++) {
                    if (bArr2[i5] != bytes[i5]) {
                        i72 i72Var3 = null;
                        int i6 = 1;
                        try {
                            i72Var = new i72(bArr2);
                            try {
                                try {
                                    readInt = i72Var.readInt();
                                    bArr = new byte[4];
                                    i72Var.readFully(bArr);
                                } catch (Exception e) {
                                    e = e;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                i72Var3 = i72Var;
                                if (i72Var3 != null) {
                                    i72Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = 0;
                            i72Var = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (i72Var3 != null) {
                            }
                            throw th;
                        }
                        if (Arrays.equals(bArr, u)) {
                            if (readInt == 1) {
                                readInt = i72Var.readLong();
                                j = 16;
                                if (readInt < 16) {
                                }
                            } else {
                                j = 8;
                            }
                            if (readInt > 5000) {
                                readInt = 5000;
                            }
                            long j2 = readInt - j;
                            if (j2 >= 8) {
                                byte[] bArr4 = new byte[4];
                                boolean z2 = false;
                                boolean z3 = false;
                                boolean z4 = false;
                                for (long j3 = 0; j3 < j2 / 4; j3++) {
                                    try {
                                        i72Var.readFully(bArr4);
                                        if (j3 != 1) {
                                            i = 0;
                                            try {
                                                if (Arrays.equals(bArr4, v)) {
                                                    z2 = true;
                                                } else if (Arrays.equals(bArr4, w)) {
                                                    z3 = true;
                                                } else if (Arrays.equals(bArr4, x) || Arrays.equals(bArr4, y)) {
                                                    z4 = true;
                                                }
                                                if (!z2) {
                                                    continue;
                                                } else if (z3) {
                                                    i72Var.close();
                                                    i2 = 12;
                                                    break;
                                                } else if (z4) {
                                                    i72Var.close();
                                                    i2 = 15;
                                                    break;
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                if (o) {
                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                }
                                            }
                                        }
                                    } catch (EOFException unused) {
                                        i = 0;
                                    }
                                }
                                i = 0;
                                i72Var.close();
                                i2 = i;
                                if (i2 == 0) {
                                    return i2;
                                }
                                try {
                                    i72Var2 = new i72(bArr2);
                                    try {
                                        ByteOrder s2 = s(i72Var2);
                                        this.h = s2;
                                        i72Var2.L = s2;
                                        short readShort = i72Var2.readShort();
                                        if (readShort != 20306 && readShort != 21330) {
                                            i3 = i;
                                        } else {
                                            i3 = 1;
                                        }
                                        i72Var2.close();
                                    } catch (Exception unused2) {
                                        if (i72Var2 != null) {
                                            i72Var2.close();
                                        }
                                        i3 = i;
                                        if (i3 == 0) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        i72Var3 = i72Var2;
                                        if (i72Var3 != null) {
                                            i72Var3.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused3) {
                                    i72Var2 = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                if (i3 == 0) {
                                    return 7;
                                }
                                try {
                                    i72 i72Var4 = new i72(bArr2);
                                    try {
                                        ByteOrder s3 = s(i72Var4);
                                        this.h = s3;
                                        i72Var4.L = s3;
                                        if (i72Var4.readShort() != 85) {
                                            i6 = i;
                                        }
                                        i72Var4.close();
                                    } catch (Exception unused4) {
                                        i72Var3 = i72Var4;
                                        if (i72Var3 != null) {
                                            i72Var3.close();
                                        }
                                        i6 = i;
                                        if (i6 == 0) {
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        i72Var3 = i72Var4;
                                        if (i72Var3 != null) {
                                            i72Var3.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused5) {
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                                if (i6 == 0) {
                                    return 10;
                                }
                                int i7 = i;
                                while (true) {
                                    byte[] bArr5 = B;
                                    if (i7 < bArr5.length) {
                                        if (bArr2[i7] != bArr5[i7]) {
                                            int i8 = i;
                                            while (true) {
                                                byte[] bArr6 = D;
                                                if (i8 < bArr6.length) {
                                                    if (bArr2[i8] != bArr6[i8]) {
                                                        break;
                                                    }
                                                    i8++;
                                                } else {
                                                    int i9 = i;
                                                    while (true) {
                                                        byte[] bArr7 = E;
                                                        if (i9 < bArr7.length) {
                                                            if (bArr2[bArr6.length + i9 + 4] != bArr7[i9]) {
                                                                break;
                                                            }
                                                            i9++;
                                                        } else {
                                                            return 14;
                                                        }
                                                    }
                                                }
                                            }
                                            return i;
                                        }
                                        i7++;
                                    } else {
                                        return 13;
                                    }
                                }
                            }
                        }
                        i72Var.close();
                        i = 0;
                        i2 = 0;
                        if (i2 == 0) {
                        }
                    }
                }
                return 9;
            }
            i4++;
        }
    }

    public final void h(q72 q72Var) {
        int i;
        int i2;
        k(q72Var);
        HashMap[] hashMapArr = this.f;
        k72 k72Var = (k72) hashMapArr[1].get("MakerNote");
        if (k72Var != null) {
            q72 q72Var2 = new q72(k72Var.d);
            q72Var2.L = this.h;
            byte[] bArr = z;
            byte[] bArr2 = new byte[bArr.length];
            q72Var2.readFully(bArr2);
            q72Var2.h(0L);
            byte[] bArr3 = A;
            byte[] bArr4 = new byte[bArr3.length];
            q72Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                q72Var2.h(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                q72Var2.h(12L);
            }
            u(q72Var2, 6);
            k72 k72Var2 = (k72) hashMapArr[7].get("PreviewImageStart");
            k72 k72Var3 = (k72) hashMapArr[7].get("PreviewImageLength");
            if (k72Var2 != null && k72Var3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", k72Var2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", k72Var3);
            }
            k72 k72Var4 = (k72) hashMapArr[8].get("AspectFrame");
            if (k72Var4 != null) {
                int[] iArr = (int[]) k72Var4.h(this.h);
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
                        k72 d = k72.d(i5, this.h);
                        k72 d2 = k72.d(i6, this.h);
                        hashMapArr[0].put("ImageWidth", d);
                        hashMapArr[0].put("ImageLength", d2);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void i(i72 i72Var) {
        if (o) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + i72Var);
        }
        i72Var.L = ByteOrder.BIG_ENDIAN;
        int i = i72Var.B;
        i72Var.e(B.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (!z2 || !z3) {
                try {
                    int readInt = i72Var.readInt();
                    int readInt2 = i72Var.readInt();
                    int i2 = i72Var.B;
                    int i3 = i2 + readInt + 4;
                    int i4 = i2 - i;
                    if (i4 == 16 && readInt2 != 1229472850) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                    }
                    if (readInt2 == 1229278788) {
                        return;
                    }
                    if (readInt2 == 1700284774 && !z2) {
                        this.j = i4;
                        byte[] bArr = new byte[readInt];
                        i72Var.readFully(bArr);
                        int readInt3 = i72Var.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(readInt2 >>> 24);
                        crc32.update(readInt2 >>> 16);
                        crc32.update(readInt2 >>> 8);
                        crc32.update(readInt2);
                        crc32.update(bArr);
                        if (((int) crc32.getValue()) == readInt3) {
                            t(bArr, 0);
                            z();
                            w(new i72(bArr));
                            z2 = true;
                        } else {
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                        }
                    } else if (readInt2 == 1767135348 && !z3) {
                        byte[] bArr2 = C;
                        if (readInt >= bArr2.length) {
                            int length = bArr2.length;
                            byte[] bArr3 = new byte[length];
                            i72Var.readFully(bArr3);
                            if (Arrays.equals(bArr3, bArr2)) {
                                int i5 = readInt - length;
                                byte[] bArr4 = new byte[i5];
                                i72Var.readFully(bArr4);
                                this.n = new k72(i72Var.B - i, bArr4, 1, i5);
                                z3 = true;
                            }
                        }
                    }
                    i72Var.e(i3 - i72Var.B);
                } catch (EOFException e) {
                    throw new IOException("Encountered corrupt PNG file.", e);
                }
            } else {
                return;
            }
        }
    }

    public final void j(i72 i72Var) {
        boolean z2 = o;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + i72Var);
        }
        i72Var.e(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        i72Var.readFully(bArr);
        i72Var.readFully(bArr2);
        i72Var.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        i72Var.e(i - i72Var.B);
        i72Var.readFully(bArr4);
        f(new i72(bArr4), i, 5);
        i72Var.e(i3 - i72Var.B);
        i72Var.L = ByteOrder.BIG_ENDIAN;
        int readInt = i72Var.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = i72Var.readUnsignedShort();
            int readUnsignedShort2 = i72Var.readUnsignedShort();
            if (readUnsignedShort == J.a) {
                short readShort = i72Var.readShort();
                short readShort2 = i72Var.readShort();
                k72 d = k72.d(readShort, this.h);
                k72 d2 = k72.d(readShort2, this.h);
                HashMap[] hashMapArr = this.f;
                hashMapArr[0].put("ImageLength", d);
                hashMapArr[0].put("ImageWidth", d2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            i72Var.e(readUnsignedShort2);
        }
    }

    public final void k(q72 q72Var) {
        q(q72Var);
        u(q72Var, 0);
        y(q72Var, 0);
        y(q72Var, 5);
        y(q72Var, 4);
        z();
        if (this.d == 8) {
            HashMap[] hashMapArr = this.f;
            k72 k72Var = (k72) hashMapArr[1].get("MakerNote");
            if (k72Var != null) {
                q72 q72Var2 = new q72(k72Var.d);
                q72Var2.L = this.h;
                q72Var2.e(6);
                u(q72Var2, 9);
                k72 k72Var2 = (k72) hashMapArr[9].get("ColorSpace");
                if (k72Var2 != null) {
                    hashMapArr[1].put("ColorSpace", k72Var2);
                }
            }
        }
    }

    public final void l(q72 q72Var) {
        if (o) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + q72Var);
        }
        k(q72Var);
        HashMap[] hashMapArr = this.f;
        k72 k72Var = (k72) hashMapArr[0].get("JpgFromRaw");
        if (k72Var != null) {
            f(new i72(k72Var.d), (int) k72Var.c, 5);
        }
        k72 k72Var2 = (k72) hashMapArr[0].get("ISO");
        k72 k72Var3 = (k72) hashMapArr[1].get("PhotographicSensitivity");
        if (k72Var2 != null && k72Var3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", k72Var2);
        }
    }

    public final boolean m(q72 q72Var) {
        byte[] bArr = R;
        byte[] bArr2 = new byte[bArr.length];
        q72Var.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArr3 = new byte[1024];
        int i = 0;
        while (true) {
            if (i == bArr3.length) {
                bArr3 = Arrays.copyOf(bArr3, bArr3.length * 2);
            }
            int read = q72Var.A.read(bArr3, i, bArr3.length - i);
            if (read != -1) {
                i += read;
                q72Var.B += read;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr3, i);
                this.j = bArr.length;
                t(copyOf, 0);
                return true;
            }
        }
    }

    public final void n(i72 i72Var) {
        if (o) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + i72Var);
        }
        i72Var.L = ByteOrder.LITTLE_ENDIAN;
        i72Var.e(D.length);
        int readInt = i72Var.readInt() + 8;
        byte[] bArr = E;
        i72Var.e(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                i72Var.readFully(bArr2);
                int readInt2 = i72Var.readInt();
                int i = length + 8;
                if (Arrays.equals(F, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    i72Var.readFully(bArr3);
                    byte[] bArr4 = R;
                    if (g04.R(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.j = i;
                    t(bArr3, 0);
                    w(new i72(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length <= readInt) {
                    i72Var.e(readInt2);
                } else {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void o(i72 i72Var, HashMap hashMap) {
        k72 k72Var = (k72) hashMap.get("JPEGInterchangeFormat");
        k72 k72Var2 = (k72) hashMap.get("JPEGInterchangeFormatLength");
        if (k72Var != null && k72Var2 != null) {
            int f = k72Var.f(this.h);
            int f2 = k72Var2.f(this.h);
            if (this.d == 7) {
                f += this.k;
            }
            if (f > 0 && f2 > 0 && this.a == null && this.c == null && this.b == null) {
                i72Var.e(f);
                i72Var.readFully(new byte[f2]);
            }
            if (o) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + f + ", length: " + f2);
            }
        }
    }

    public final boolean p(HashMap hashMap) {
        k72 k72Var = (k72) hashMap.get("ImageLength");
        k72 k72Var2 = (k72) hashMap.get("ImageWidth");
        if (k72Var != null && k72Var2 != null) {
            int f = k72Var.f(this.h);
            int f2 = k72Var2.f(this.h);
            if (f <= 512 && f2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q(q72 q72Var) {
        ByteOrder s2 = s(q72Var);
        this.h = s2;
        q72Var.L = s2;
        int readUnsignedShort = q72Var.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            e41.x(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = q72Var.readInt();
        if (readInt >= 8) {
            int i2 = readInt - 8;
            if (i2 > 0) {
                q72Var.e(i2);
                return;
            }
            return;
        }
        e41.i(lb1.g(readInt, "Invalid first Ifd offset: "));
    }

    public final void r() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.f;
            if (i < hashMapArr.length) {
                StringBuilder t2 = xg6.t("The size of tag group[", i, "]: ");
                t2.append(hashMapArr[i].size());
                Log.d("ExifInterface", t2.toString());
                for (Map.Entry entry : hashMapArr[i].entrySet()) {
                    k72 k72Var = (k72) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + k72Var.toString() + ", tagValue: '" + k72Var.g(this.h) + "'");
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void t(byte[] bArr, int i) {
        q72 q72Var = new q72(bArr);
        q(q72Var);
        u(q72Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(q72 q72Var, int i) {
        HashMap[] hashMapArr;
        HashSet hashSet;
        boolean z2;
        short s2;
        HashMap[] hashMapArr2;
        long j;
        int[] iArr;
        long j2;
        boolean z3;
        int i2;
        long j3;
        int i3;
        m72 m72Var;
        HashSet hashSet2;
        int readUnsignedShort;
        long j4;
        String str;
        int i4 = i;
        int i5 = q72Var.B;
        int i6 = q72Var.X;
        Integer valueOf = Integer.valueOf(i5);
        HashSet hashSet3 = this.g;
        hashSet3.add(valueOf);
        short readShort = q72Var.readShort();
        boolean z4 = o;
        if (z4) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort > 0) {
            short s3 = 0;
            while (true) {
                hashMapArr = this.f;
                if (s3 >= readShort) {
                    break;
                }
                int readUnsignedShort2 = q72Var.readUnsignedShort();
                int readUnsignedShort3 = q72Var.readUnsignedShort();
                int readInt = q72Var.readInt();
                long j5 = q72Var.B + 4;
                short s4 = readShort;
                m72 m72Var2 = (m72) M[i4].get(Integer.valueOf(readUnsignedShort2));
                if (z4) {
                    Integer valueOf2 = Integer.valueOf(i4);
                    z2 = z4;
                    Integer valueOf3 = Integer.valueOf(readUnsignedShort2);
                    s2 = s3;
                    if (m72Var2 != null) {
                        str = m72Var2.b;
                    } else {
                        str = null;
                    }
                    hashMapArr2 = hashMapArr;
                    hashSet = hashSet3;
                    Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", valueOf2, valueOf3, str, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
                } else {
                    hashSet = hashSet3;
                    z2 = z4;
                    s2 = s3;
                    hashMapArr2 = hashMapArr;
                }
                if (m72Var2 == null) {
                    if (z2) {
                        Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
                    }
                } else {
                    if (readUnsignedShort3 > 0) {
                        if (readUnsignedShort3 < H.length) {
                            int i7 = m72Var2.c;
                            if (i7 != 7 && readUnsignedShort3 != 7 && i7 != readUnsignedShort3 && (i2 = m72Var2.d) != readUnsignedShort3 && (((i7 != 4 && i2 != 4) || readUnsignedShort3 != 3) && (((i7 != 9 && i2 != 9) || readUnsignedShort3 != 8) && ((i7 != 12 && i2 != 12) || readUnsignedShort3 != 11)))) {
                                if (z2) {
                                    Log.d("ExifInterface", "Skip the tag entry since data format (" + G[readUnsignedShort3] + ") is unexpected for tag: " + m72Var2.b);
                                }
                            } else {
                                if (readUnsignedShort3 == 7) {
                                    readUnsignedShort3 = i7;
                                }
                                j = j5;
                                j2 = readInt * iArr[readUnsignedShort3];
                                if (j2 >= 0 && j2 <= 2147483647L) {
                                    z3 = true;
                                    if (z3) {
                                    }
                                    s3 = (short) (s2 + 1);
                                    i4 = i;
                                    hashSet3 = hashSet2;
                                    readShort = s4;
                                    z4 = z2;
                                } else {
                                    if (z2) {
                                        Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                    }
                                    z3 = false;
                                    if (z3) {
                                        q72Var.h(j);
                                        hashSet2 = hashSet;
                                    } else {
                                        long j6 = j;
                                        if (j2 > 4) {
                                            int readInt2 = q72Var.readInt();
                                            if (z2) {
                                                i3 = readUnsignedShort2;
                                                Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                            } else {
                                                i3 = readUnsignedShort2;
                                            }
                                            if (this.d == 7) {
                                                if ("MakerNote".equals(m72Var2.b)) {
                                                    this.k = readInt2;
                                                } else if (i4 == 6 && "ThumbnailImage".equals(m72Var2.b)) {
                                                    this.l = readInt2;
                                                    this.m = readInt;
                                                    k72 d = k72.d(6, this.h);
                                                    j3 = j6;
                                                    k72 b = k72.b(this.l, this.h);
                                                    m72Var = m72Var2;
                                                    k72 b2 = k72.b(this.m, this.h);
                                                    hashMapArr2[4].put("Compression", d);
                                                    hashMapArr2[4].put("JPEGInterchangeFormat", b);
                                                    hashMapArr2[4].put("JPEGInterchangeFormatLength", b2);
                                                    q72Var.h(readInt2);
                                                }
                                            }
                                            m72Var = m72Var2;
                                            j3 = j6;
                                            q72Var.h(readInt2);
                                        } else {
                                            j3 = j6;
                                            i3 = readUnsignedShort2;
                                            m72Var = m72Var2;
                                        }
                                        Integer num = (Integer) P.get(Integer.valueOf(i3));
                                        if (z2) {
                                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                                        }
                                        if (num != null) {
                                            if (readUnsignedShort3 != 3) {
                                                if (readUnsignedShort3 != 4) {
                                                    if (readUnsignedShort3 != 8) {
                                                        if (readUnsignedShort3 != 9 && readUnsignedShort3 != 13) {
                                                            j4 = -1;
                                                        } else {
                                                            readUnsignedShort = q72Var.readInt();
                                                        }
                                                    } else {
                                                        readUnsignedShort = q72Var.readShort();
                                                    }
                                                } else {
                                                    j4 = q72Var.readInt() & 4294967295L;
                                                }
                                                if (z2) {
                                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j4), m72Var.b));
                                                }
                                                if (j4 > 0 || (i6 != -1 && j4 >= i6)) {
                                                    hashSet2 = hashSet;
                                                    if (z2) {
                                                        String h = lb1.h(j4, "Skip jump into the IFD since its offset is invalid: ");
                                                        if (i6 != -1) {
                                                            h = h + " (total length: " + i6 + ")";
                                                        }
                                                        Log.d("ExifInterface", h);
                                                    }
                                                } else {
                                                    hashSet2 = hashSet;
                                                    if (!hashSet2.contains(Integer.valueOf((int) j4))) {
                                                        q72Var.h(j4);
                                                        u(q72Var, num.intValue());
                                                    } else if (z2) {
                                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j4 + ")");
                                                    }
                                                }
                                                q72Var.h(j3);
                                            } else {
                                                readUnsignedShort = q72Var.readUnsignedShort();
                                            }
                                            j4 = readUnsignedShort;
                                            if (z2) {
                                            }
                                            if (j4 > 0) {
                                            }
                                            hashSet2 = hashSet;
                                            if (z2) {
                                            }
                                            q72Var.h(j3);
                                        } else {
                                            hashSet2 = hashSet;
                                            long j7 = j3;
                                            int i8 = q72Var.B + this.j;
                                            byte[] bArr = new byte[(int) j2];
                                            q72Var.readFully(bArr);
                                            k72 k72Var = new k72(i8, bArr, readUnsignedShort3, readInt);
                                            HashMap hashMap = hashMapArr2[i];
                                            String str2 = m72Var.b;
                                            hashMap.put(str2, k72Var);
                                            if ("DNGVersion".equals(str2)) {
                                                this.d = 3;
                                            }
                                            if ((("Make".equals(str2) || "Model".equals(str2)) && k72Var.g(this.h).contains("PENTAX")) || ("Compression".equals(str2) && k72Var.f(this.h) == 65535)) {
                                                this.d = 8;
                                            }
                                            if (q72Var.B != j7) {
                                                q72Var.h(j7);
                                            }
                                        }
                                    }
                                    s3 = (short) (s2 + 1);
                                    i4 = i;
                                    hashSet3 = hashSet2;
                                    readShort = s4;
                                    z4 = z2;
                                }
                            }
                        }
                    }
                    j = j5;
                    if (z2) {
                        Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                    }
                    j2 = 0;
                    z3 = false;
                    if (z3) {
                    }
                    s3 = (short) (s2 + 1);
                    i4 = i;
                    hashSet3 = hashSet2;
                    readShort = s4;
                    z4 = z2;
                }
                j = j5;
                j2 = 0;
                z3 = false;
                if (z3) {
                }
                s3 = (short) (s2 + 1);
                i4 = i;
                hashSet3 = hashSet2;
                readShort = s4;
                z4 = z2;
            }
            HashSet hashSet4 = hashSet3;
            boolean z5 = z4;
            int readInt3 = q72Var.readInt();
            if (z5) {
                Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
            }
            long j8 = readInt3;
            if (j8 > 0) {
                if (!hashSet4.contains(Integer.valueOf(readInt3))) {
                    q72Var.h(j8);
                    if (hashMapArr[4].isEmpty()) {
                        u(q72Var, 4);
                    } else if (hashMapArr[5].isEmpty()) {
                        u(q72Var, 5);
                    }
                } else if (z5) {
                    Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                }
            } else if (z5) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
            }
        }
    }

    public final void v(String str, int i, String str2) {
        HashMap[] hashMapArr = this.f;
        if (!hashMapArr[i].isEmpty() && hashMapArr[i].get(str) != null) {
            HashMap hashMap = hashMapArr[i];
            hashMap.put(str2, (k72) hashMap.get(str));
            hashMapArr[i].remove(str);
        }
    }

    public final void w(i72 i72Var) {
        k72 k72Var;
        int f;
        HashMap hashMap = this.f[4];
        k72 k72Var2 = (k72) hashMap.get("Compression");
        if (k72Var2 != null) {
            int f2 = k72Var2.f(this.h);
            if (f2 != 1) {
                if (f2 != 6) {
                    if (f2 != 7) {
                        return;
                    }
                } else {
                    o(i72Var, hashMap);
                    return;
                }
            }
            k72 k72Var3 = (k72) hashMap.get("BitsPerSample");
            if (k72Var3 != null) {
                int[] iArr = (int[]) k72Var3.h(this.h);
                int[] iArr2 = r;
                if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (k72Var = (k72) hashMap.get("PhotometricInterpretation")) != null && (((f = k72Var.f(this.h)) == 1 && Arrays.equals(iArr, s)) || (f == 6 && Arrays.equals(iArr, iArr2))))) {
                    k72 k72Var4 = (k72) hashMap.get("StripOffsets");
                    k72 k72Var5 = (k72) hashMap.get("StripByteCounts");
                    if (k72Var4 != null && k72Var5 != null) {
                        long[] B2 = g04.B(k72Var4.h(this.h));
                        long[] B3 = g04.B(k72Var5.h(this.h));
                        if (B2 != null && B2.length != 0) {
                            if (B3 != null && B3.length != 0) {
                                if (B2.length != B3.length) {
                                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                    return;
                                }
                                long j = 0;
                                for (long j2 : B3) {
                                    j += j2;
                                }
                                byte[] bArr = new byte[(int) j];
                                this.i = true;
                                int i = 0;
                                int i2 = 0;
                                for (int i3 = 0; i3 < B2.length; i3++) {
                                    int i4 = (int) B2[i3];
                                    int i5 = (int) B3[i3];
                                    if (i3 < B2.length - 1 && i4 + i5 != B2[i3 + 1]) {
                                        this.i = false;
                                    }
                                    int i6 = i4 - i;
                                    if (i6 < 0) {
                                        Log.d("ExifInterface", "Invalid strip offset value");
                                        return;
                                    }
                                    try {
                                        i72Var.e(i6);
                                        int i7 = i + i6;
                                        byte[] bArr2 = new byte[i5];
                                        try {
                                            i72Var.readFully(bArr2);
                                            i = i7 + i5;
                                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                                            i2 += i5;
                                        } catch (EOFException unused) {
                                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                                            return;
                                        }
                                    } catch (EOFException unused2) {
                                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                                        return;
                                    }
                                }
                                if (this.i) {
                                    long j3 = B2[0];
                                    return;
                                }
                                return;
                            }
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        }
                        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                        return;
                    }
                    return;
                }
            }
            if (o) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        o(i72Var, hashMap);
    }

    public final void x(int i, int i2) {
        HashMap[] hashMapArr = this.f;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z2 = o;
        if (!isEmpty && !hashMapArr[i2].isEmpty()) {
            k72 k72Var = (k72) hashMapArr[i].get("ImageLength");
            k72 k72Var2 = (k72) hashMapArr[i].get("ImageWidth");
            k72 k72Var3 = (k72) hashMapArr[i2].get("ImageLength");
            k72 k72Var4 = (k72) hashMapArr[i2].get("ImageWidth");
            if (k72Var != null && k72Var2 != null) {
                if (k72Var3 != null && k72Var4 != null) {
                    int f = k72Var.f(this.h);
                    int f2 = k72Var2.f(this.h);
                    int f3 = k72Var3.f(this.h);
                    int f4 = k72Var4.f(this.h);
                    if (f < f3 && f2 < f4) {
                        HashMap hashMap = hashMapArr[i];
                        hashMapArr[i] = hashMapArr[i2];
                        hashMapArr[i2] = hashMap;
                    }
                } else if (z2) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                }
            } else if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
        } else if (z2) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void y(q72 q72Var, int i) {
        k72 d;
        k72 d2;
        HashMap[] hashMapArr = this.f;
        k72 k72Var = (k72) hashMapArr[i].get("DefaultCropSize");
        k72 k72Var2 = (k72) hashMapArr[i].get("SensorTopBorder");
        k72 k72Var3 = (k72) hashMapArr[i].get("SensorLeftBorder");
        k72 k72Var4 = (k72) hashMapArr[i].get("SensorBottomBorder");
        k72 k72Var5 = (k72) hashMapArr[i].get("SensorRightBorder");
        if (k72Var != null) {
            int i2 = k72Var.a;
            ByteOrder byteOrder = this.h;
            if (i2 == 5) {
                o72[] o72VarArr = (o72[]) k72Var.h(byteOrder);
                if (o72VarArr != null && o72VarArr.length == 2) {
                    d = k72.c(new o72[]{o72VarArr[0]}, this.h);
                    d2 = k72.c(new o72[]{o72VarArr[1]}, this.h);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(o72VarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) k72Var.h(byteOrder);
                if (iArr != null && iArr.length == 2) {
                    d = k72.d(iArr[0], this.h);
                    d2 = k72.d(iArr[1], this.h);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i].put("ImageWidth", d);
            hashMapArr[i].put("ImageLength", d2);
        } else if (k72Var2 != null && k72Var3 != null && k72Var4 != null && k72Var5 != null) {
            int f = k72Var2.f(this.h);
            int f2 = k72Var4.f(this.h);
            int f3 = k72Var5.f(this.h);
            int f4 = k72Var3.f(this.h);
            if (f2 > f && f3 > f4) {
                k72 d3 = k72.d(f2 - f, this.h);
                k72 d4 = k72.d(f3 - f4, this.h);
                hashMapArr[i].put("ImageLength", d3);
                hashMapArr[i].put("ImageWidth", d4);
            }
        } else {
            k72 k72Var6 = (k72) hashMapArr[i].get("ImageLength");
            k72 k72Var7 = (k72) hashMapArr[i].get("ImageWidth");
            if (k72Var6 == null || k72Var7 == null) {
                k72 k72Var8 = (k72) hashMapArr[i].get("JPEGInterchangeFormat");
                k72 k72Var9 = (k72) hashMapArr[i].get("JPEGInterchangeFormatLength");
                if (k72Var8 != null && k72Var9 != null) {
                    int f5 = k72Var8.f(this.h);
                    int f6 = k72Var8.f(this.h);
                    q72Var.h(f5);
                    byte[] bArr = new byte[f6];
                    q72Var.readFully(bArr);
                    f(new i72(bArr), f5, i);
                }
            }
        }
    }

    public final void z() {
        x(0, 5);
        x(0, 4);
        x(5, 4);
        HashMap[] hashMapArr = this.f;
        k72 k72Var = (k72) hashMapArr[1].get("PixelXDimension");
        k72 k72Var2 = (k72) hashMapArr[1].get("PixelYDimension");
        if (k72Var != null && k72Var2 != null) {
            hashMapArr[0].put("ImageWidth", k72Var);
            hashMapArr[0].put("ImageLength", k72Var2);
        }
        if (hashMapArr[4].isEmpty() && p(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!p(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        v("ThumbnailOrientation", 0, "Orientation");
        v("ThumbnailImageLength", 0, "ImageLength");
        v("ThumbnailImageWidth", 0, "ImageWidth");
        v("ThumbnailOrientation", 5, "Orientation");
        v("ThumbnailImageLength", 5, "ImageLength");
        v("ThumbnailImageWidth", 5, "ImageWidth");
        v("Orientation", 4, "ThumbnailOrientation");
        v("ImageLength", 4, "ThumbnailImageLength");
        v("ImageWidth", 4, "ThumbnailImageWidth");
    }
}
