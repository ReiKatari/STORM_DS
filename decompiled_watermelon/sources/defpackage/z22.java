package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z22  reason: default package */
/* loaded from: classes.dex */
public final class z22 {
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final String[] E;
    public static final int[] F;
    public static final byte[] G;
    public static final u22 H;
    public static final u22[][] I;
    public static final u22[] J;
    public static final HashMap[] K;
    public static final HashMap[] L;
    public static final Set M;
    public static final HashMap N;
    public static final Charset O;
    public static final byte[] P;
    public static final byte[] Q;
    public static final boolean o = Log.isLoggable("ExifInterface", 3);
    public static final int[] p;
    public static final int[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
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
    public s22 n;

    static {
        u22[] u22VarArr;
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        p = new int[]{8, 8, 8};
        q = new int[]{8};
        r = new byte[]{-1, -40, -1};
        s = new byte[]{102, 116, 121, 112};
        t = new byte[]{109, 105, 102, 49};
        u = new byte[]{104, 101, 105, 99};
        v = new byte[]{97, 118, 105, 102};
        w = new byte[]{97, 118, 105, 115};
        x = new byte[]{79, 76, 89, 77, 80, 0};
        y = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        z = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        A = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        B = new byte[]{82, 73, 70, 70};
        C = new byte[]{87, 69, 66, 80};
        D = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        E = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        u22[] u22VarArr2 = {new u22("NewSubfileType", 254, 4), new u22("SubfileType", 255, 4), new u22("ImageWidth", 256, 3, 4), new u22("ImageLength", 257, 3, 4), new u22("BitsPerSample", 258, 3), new u22("Compression", 259, 3), new u22("PhotometricInterpretation", 262, 3), new u22("ImageDescription", 270, 2), new u22("Make", 271, 2), new u22("Model", 272, 2), new u22("StripOffsets", 273, 3, 4), new u22("Orientation", 274, 3), new u22("SamplesPerPixel", 277, 3), new u22("RowsPerStrip", 278, 3, 4), new u22("StripByteCounts", 279, 3, 4), new u22("XResolution", 282, 5), new u22("YResolution", 283, 5), new u22("PlanarConfiguration", 284, 3), new u22("ResolutionUnit", 296, 3), new u22("TransferFunction", 301, 3), new u22("Software", 305, 2), new u22("DateTime", 306, 2), new u22("Artist", 315, 2), new u22("WhitePoint", 318, 5), new u22("PrimaryChromaticities", 319, 5), new u22("SubIFDPointer", 330, 4), new u22("JPEGInterchangeFormat", 513, 4), new u22("JPEGInterchangeFormatLength", 514, 4), new u22("YCbCrCoefficients", 529, 5), new u22("YCbCrSubSampling", 530, 3), new u22("YCbCrPositioning", 531, 3), new u22("ReferenceBlackWhite", 532, 5), new u22("Copyright", 33432, 2), new u22("ExifIFDPointer", 34665, 4), new u22("GPSInfoIFDPointer", 34853, 4), new u22("SensorTopBorder", 4, 4), new u22("SensorLeftBorder", 5, 4), new u22("SensorBottomBorder", 6, 4), new u22("SensorRightBorder", 7, 4), new u22("ISO", 23, 3), new u22("JpgFromRaw", 46, 7), new u22("Xmp", 700, 1)};
        u22[] u22VarArr3 = {new u22("ExposureTime", 33434, 5), new u22("FNumber", 33437, 5), new u22("ExposureProgram", 34850, 3), new u22("SpectralSensitivity", 34852, 2), new u22("PhotographicSensitivity", 34855, 3), new u22("OECF", 34856, 7), new u22("SensitivityType", 34864, 3), new u22("StandardOutputSensitivity", 34865, 4), new u22("RecommendedExposureIndex", 34866, 4), new u22("ISOSpeed", 34867, 4), new u22("ISOSpeedLatitudeyyy", 34868, 4), new u22("ISOSpeedLatitudezzz", 34869, 4), new u22("ExifVersion", 36864, 2), new u22("DateTimeOriginal", 36867, 2), new u22("DateTimeDigitized", 36868, 2), new u22("OffsetTime", 36880, 2), new u22("OffsetTimeOriginal", 36881, 2), new u22("OffsetTimeDigitized", 36882, 2), new u22("ComponentsConfiguration", 37121, 7), new u22("CompressedBitsPerPixel", 37122, 5), new u22("ShutterSpeedValue", 37377, 10), new u22("ApertureValue", 37378, 5), new u22("BrightnessValue", 37379, 10), new u22("ExposureBiasValue", 37380, 10), new u22("MaxApertureValue", 37381, 5), new u22("SubjectDistance", 37382, 5), new u22("MeteringMode", 37383, 3), new u22("LightSource", 37384, 3), new u22("Flash", 37385, 3), new u22("FocalLength", 37386, 5), new u22("SubjectArea", 37396, 3), new u22("MakerNote", 37500, 7), new u22("UserComment", 37510, 7), new u22("SubSecTime", 37520, 2), new u22("SubSecTimeOriginal", 37521, 2), new u22("SubSecTimeDigitized", 37522, 2), new u22("FlashpixVersion", 40960, 7), new u22("ColorSpace", 40961, 3), new u22("PixelXDimension", 40962, 3, 4), new u22("PixelYDimension", 40963, 3, 4), new u22("RelatedSoundFile", 40964, 2), new u22("InteroperabilityIFDPointer", 40965, 4), new u22("FlashEnergy", 41483, 5), new u22("SpatialFrequencyResponse", 41484, 7), new u22("FocalPlaneXResolution", 41486, 5), new u22("FocalPlaneYResolution", 41487, 5), new u22("FocalPlaneResolutionUnit", 41488, 3), new u22("SubjectLocation", 41492, 3), new u22("ExposureIndex", 41493, 5), new u22("SensingMethod", 41495, 3), new u22("FileSource", 41728, 7), new u22("SceneType", 41729, 7), new u22("CFAPattern", 41730, 7), new u22("CustomRendered", 41985, 3), new u22("ExposureMode", 41986, 3), new u22("WhiteBalance", 41987, 3), new u22("DigitalZoomRatio", 41988, 5), new u22("FocalLengthIn35mmFilm", 41989, 3), new u22("SceneCaptureType", 41990, 3), new u22("GainControl", 41991, 3), new u22("Contrast", 41992, 3), new u22("Saturation", 41993, 3), new u22("Sharpness", 41994, 3), new u22("DeviceSettingDescription", 41995, 7), new u22("SubjectDistanceRange", 41996, 3), new u22("ImageUniqueID", 42016, 2), new u22("CameraOwnerName", 42032, 2), new u22("BodySerialNumber", 42033, 2), new u22("LensSpecification", 42034, 5), new u22("LensMake", 42035, 2), new u22("LensModel", 42036, 2), new u22("Gamma", 42240, 5), new u22("DNGVersion", 50706, 1), new u22("DefaultCropSize", 50720, 3, 4)};
        u22[] u22VarArr4 = {new u22("GPSVersionID", 0, 1), new u22("GPSLatitudeRef", 1, 2), new u22("GPSLatitude", 2, 5, 10), new u22("GPSLongitudeRef", 3, 2), new u22("GPSLongitude", 4, 5, 10), new u22("GPSAltitudeRef", 5, 1), new u22("GPSAltitude", 6, 5), new u22("GPSTimeStamp", 7, 5), new u22("GPSSatellites", 8, 2), new u22("GPSStatus", 9, 2), new u22("GPSMeasureMode", 10, 2), new u22("GPSDOP", 11, 5), new u22("GPSSpeedRef", 12, 2), new u22("GPSSpeed", 13, 5), new u22("GPSTrackRef", 14, 2), new u22("GPSTrack", 15, 5), new u22("GPSImgDirectionRef", 16, 2), new u22("GPSImgDirection", 17, 5), new u22("GPSMapDatum", 18, 2), new u22("GPSDestLatitudeRef", 19, 2), new u22("GPSDestLatitude", 20, 5), new u22("GPSDestLongitudeRef", 21, 2), new u22("GPSDestLongitude", 22, 5), new u22("GPSDestBearingRef", 23, 2), new u22("GPSDestBearing", 24, 5), new u22("GPSDestDistanceRef", 25, 2), new u22("GPSDestDistance", 26, 5), new u22("GPSProcessingMethod", 27, 7), new u22("GPSAreaInformation", 28, 7), new u22("GPSDateStamp", 29, 2), new u22("GPSDifferential", 30, 3), new u22("GPSHPositioningError", 31, 5)};
        u22[] u22VarArr5 = {new u22("InteroperabilityIndex", 1, 2)};
        u22[] u22VarArr6 = {new u22("NewSubfileType", 254, 4), new u22("SubfileType", 255, 4), new u22("ThumbnailImageWidth", 256, 3, 4), new u22("ThumbnailImageLength", 257, 3, 4), new u22("BitsPerSample", 258, 3), new u22("Compression", 259, 3), new u22("PhotometricInterpretation", 262, 3), new u22("ImageDescription", 270, 2), new u22("Make", 271, 2), new u22("Model", 272, 2), new u22("StripOffsets", 273, 3, 4), new u22("ThumbnailOrientation", 274, 3), new u22("SamplesPerPixel", 277, 3), new u22("RowsPerStrip", 278, 3, 4), new u22("StripByteCounts", 279, 3, 4), new u22("XResolution", 282, 5), new u22("YResolution", 283, 5), new u22("PlanarConfiguration", 284, 3), new u22("ResolutionUnit", 296, 3), new u22("TransferFunction", 301, 3), new u22("Software", 305, 2), new u22("DateTime", 306, 2), new u22("Artist", 315, 2), new u22("WhitePoint", 318, 5), new u22("PrimaryChromaticities", 319, 5), new u22("SubIFDPointer", 330, 4), new u22("JPEGInterchangeFormat", 513, 4), new u22("JPEGInterchangeFormatLength", 514, 4), new u22("YCbCrCoefficients", 529, 5), new u22("YCbCrSubSampling", 530, 3), new u22("YCbCrPositioning", 531, 3), new u22("ReferenceBlackWhite", 532, 5), new u22("Copyright", 33432, 2), new u22("ExifIFDPointer", 34665, 4), new u22("GPSInfoIFDPointer", 34853, 4), new u22("DNGVersion", 50706, 1), new u22("DefaultCropSize", 50720, 3, 4)};
        H = new u22("StripOffsets", 273, 3);
        I = new u22[][]{u22VarArr2, u22VarArr3, u22VarArr4, u22VarArr5, u22VarArr6, u22VarArr2, new u22[]{new u22("ThumbnailImage", 256, 7), new u22("CameraSettingsIFDPointer", 8224, 4), new u22("ImageProcessingIFDPointer", 8256, 4)}, new u22[]{new u22("PreviewImageStart", 257, 4), new u22("PreviewImageLength", 258, 4)}, new u22[]{new u22("AspectFrame", 4371, 3)}, new u22[]{new u22("ColorSpace", 55, 3)}};
        J = new u22[]{new u22("SubIFDPointer", 330, 4), new u22("ExifIFDPointer", 34665, 4), new u22("GPSInfoIFDPointer", 34853, 4), new u22("InteroperabilityIFDPointer", 40965, 4), new u22("CameraSettingsIFDPointer", 8224, 1), new u22("ImageProcessingIFDPointer", 8256, 1)};
        K = new HashMap[10];
        L = new HashMap[10];
        M = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        N = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        O = forName;
        P = "Exif\u0000\u0000".getBytes(forName);
        Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            u22[][] u22VarArr7 = I;
            if (i < u22VarArr7.length) {
                K[i] = new HashMap();
                L[i] = new HashMap();
                for (u22 u22Var : u22VarArr7[i]) {
                    K[i].put(Integer.valueOf(u22Var.a), u22Var);
                    L[i].put(u22Var.b, u22Var);
                }
                i++;
            } else {
                HashMap hashMap = N;
                u22[] u22VarArr8 = J;
                hashMap.put(Integer.valueOf(u22VarArr8[0].a), 5);
                hashMap.put(Integer.valueOf(u22VarArr8[1].a), 1);
                hashMap.put(Integer.valueOf(u22VarArr8[2].a), 2);
                hashMap.put(Integer.valueOf(u22VarArr8[3].a), 3);
                hashMap.put(Integer.valueOf(u22VarArr8[4].a), 7);
                hashMap.put(Integer.valueOf(u22VarArr8[5].a), 8);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public z22(java.io.InputStream r11) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z22.<init>(java.io.InputStream):void");
    }

    public static ByteOrder s(q22 q22Var) {
        short readShort = q22Var.readShort();
        boolean z2 = o;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z2) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            f81.y(Integer.toHexString(readShort), "Invalid byte order: ");
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
            hashMapArr[0].put("DateTime", s22.a(b));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", s22.b(0L, this.h));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", s22.b(0L, this.h));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", s22.b(0L, this.h));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", s22.b(0L, this.h));
        }
    }

    public final String b(String str) {
        if (str != null) {
            s22 d = d(str);
            if (d != null) {
                int i = d.a;
                if (str.equals("GPSTimeStamp")) {
                    if (i != 5 && i != 10) {
                        Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                        return null;
                    }
                    w22[] w22VarArr = (w22[]) d.h(this.h);
                    if (w22VarArr != null && w22VarArr.length == 3) {
                        w22 w22Var = w22VarArr[0];
                        Integer valueOf = Integer.valueOf((int) (((float) w22Var.a) / ((float) w22Var.b)));
                        w22 w22Var2 = w22VarArr[1];
                        Integer valueOf2 = Integer.valueOf((int) (((float) w22Var2.a) / ((float) w22Var2.b)));
                        w22 w22Var3 = w22VarArr[2];
                        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) w22Var3.a) / ((float) w22Var3.b))));
                    }
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(w22VarArr));
                    return null;
                }
                boolean contains = M.contains(str);
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
        c44.i("tag shouldn't be null");
        return null;
    }

    public final int c(int i, String str) {
        s22 d = d(str);
        if (d != null) {
            try {
                return d.f(this.h);
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return i;
    }

    public final s22 d(String str) {
        s22 s22Var;
        int i;
        s22 s22Var2;
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (o) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            if ("Xmp".equals(str) && (i = this.d) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (s22Var2 = this.n) != null)) {
                return s22Var2;
            }
            for (int i2 = 0; i2 < I.length; i2++) {
                s22 s22Var3 = (s22) this.f[i2].get(str);
                if (s22Var3 != null) {
                    return s22Var3;
                }
            }
            if (!"Xmp".equals(str) || (s22Var = this.n) == null) {
                return null;
            }
            return s22Var;
        }
        c44.i("tag shouldn't be null");
        return null;
    }

    public final void e(y22 y22Var, int i) {
        String str;
        String str2;
        String str3;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            if (i == 15 && i3 < 31) {
                vd6.i("Reading EXIF from AVIF files is supported from SDK 31 and above");
                return;
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(new p22(y22Var));
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
                        hashMapArr[0].put("ImageWidth", s22.d(Integer.parseInt(str), this.h));
                    }
                    if (str3 != null) {
                        hashMapArr[0].put("ImageLength", s22.d(Integer.parseInt(str3), this.h));
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
                        hashMapArr[0].put("Orientation", s22.d(i2, this.h));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            y22Var.i(parseInt2);
                            byte[] bArr = new byte[6];
                            y22Var.readFully(bArr);
                            int i4 = parseInt2 + 6;
                            int i5 = parseInt3 - 6;
                            if (Arrays.equals(bArr, P)) {
                                byte[] bArr2 = new byte[i5];
                                y22Var.readFully(bArr2);
                                this.j = i4;
                                t(0, bArr2);
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
                        y22Var.i(j);
                        byte[] bArr3 = new byte[parseInt5];
                        y22Var.readFully(bArr3);
                        this.n = new s22(j, bArr3, 1, parseInt5);
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
        vd6.i("Reading EXIF from HEIC files is supported from SDK 28 and above");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.q22 r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z22.f(q22, int, int):void");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(java.io.BufferedInputStream r20) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z22.g(java.io.BufferedInputStream):int");
    }

    public final void h(y22 y22Var) {
        int i;
        int i2;
        k(y22Var);
        HashMap[] hashMapArr = this.f;
        s22 s22Var = (s22) hashMapArr[1].get("MakerNote");
        if (s22Var != null) {
            y22 y22Var2 = new y22(s22Var.d);
            y22Var2.L = this.h;
            byte[] bArr = x;
            byte[] bArr2 = new byte[bArr.length];
            y22Var2.readFully(bArr2);
            y22Var2.i(0L);
            byte[] bArr3 = y;
            byte[] bArr4 = new byte[bArr3.length];
            y22Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                y22Var2.i(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                y22Var2.i(12L);
            }
            u(y22Var2, 6);
            s22 s22Var2 = (s22) hashMapArr[7].get("PreviewImageStart");
            s22 s22Var3 = (s22) hashMapArr[7].get("PreviewImageLength");
            if (s22Var2 != null && s22Var3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", s22Var2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", s22Var3);
            }
            s22 s22Var4 = (s22) hashMapArr[8].get("AspectFrame");
            if (s22Var4 != null) {
                int[] iArr = (int[]) s22Var4.h(this.h);
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
                        s22 d = s22.d(i5, this.h);
                        s22 d2 = s22.d(i6, this.h);
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

    public final void i(q22 q22Var) {
        if (o) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + q22Var);
        }
        q22Var.L = ByteOrder.BIG_ENDIAN;
        int i = q22Var.B;
        q22Var.d(z.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (!z2 || !z3) {
                try {
                    int readInt = q22Var.readInt();
                    int readInt2 = q22Var.readInt();
                    int i2 = q22Var.B;
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
                        q22Var.readFully(bArr);
                        int readInt3 = q22Var.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(readInt2 >>> 24);
                        crc32.update(readInt2 >>> 16);
                        crc32.update(readInt2 >>> 8);
                        crc32.update(readInt2);
                        crc32.update(bArr);
                        if (((int) crc32.getValue()) == readInt3) {
                            t(0, bArr);
                            z();
                            w(new q22(bArr));
                            z2 = true;
                        } else {
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                        }
                    } else if (readInt2 == 1767135348 && !z3) {
                        byte[] bArr2 = A;
                        if (readInt >= bArr2.length) {
                            int length = bArr2.length;
                            byte[] bArr3 = new byte[length];
                            q22Var.readFully(bArr3);
                            if (Arrays.equals(bArr3, bArr2)) {
                                int i5 = readInt - length;
                                byte[] bArr4 = new byte[i5];
                                q22Var.readFully(bArr4);
                                this.n = new s22(q22Var.B - i, bArr4, 1, i5);
                                z3 = true;
                            }
                        }
                    }
                    q22Var.d(i3 - q22Var.B);
                } catch (EOFException e) {
                    throw new IOException("Encountered corrupt PNG file.", e);
                }
            } else {
                return;
            }
        }
    }

    public final void j(q22 q22Var) {
        boolean z2 = o;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + q22Var);
        }
        q22Var.d(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        q22Var.readFully(bArr);
        q22Var.readFully(bArr2);
        q22Var.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        q22Var.d(i - q22Var.B);
        q22Var.readFully(bArr4);
        f(new q22(bArr4), i, 5);
        q22Var.d(i3 - q22Var.B);
        q22Var.L = ByteOrder.BIG_ENDIAN;
        int readInt = q22Var.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = q22Var.readUnsignedShort();
            int readUnsignedShort2 = q22Var.readUnsignedShort();
            if (readUnsignedShort == H.a) {
                short readShort = q22Var.readShort();
                short readShort2 = q22Var.readShort();
                s22 d = s22.d(readShort, this.h);
                s22 d2 = s22.d(readShort2, this.h);
                HashMap[] hashMapArr = this.f;
                hashMapArr[0].put("ImageLength", d);
                hashMapArr[0].put("ImageWidth", d2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            q22Var.d(readUnsignedShort2);
        }
    }

    public final void k(y22 y22Var) {
        q(y22Var);
        u(y22Var, 0);
        y(y22Var, 0);
        y(y22Var, 5);
        y(y22Var, 4);
        z();
        if (this.d == 8) {
            HashMap[] hashMapArr = this.f;
            s22 s22Var = (s22) hashMapArr[1].get("MakerNote");
            if (s22Var != null) {
                y22 y22Var2 = new y22(s22Var.d);
                y22Var2.L = this.h;
                y22Var2.d(6);
                u(y22Var2, 9);
                s22 s22Var2 = (s22) hashMapArr[9].get("ColorSpace");
                if (s22Var2 != null) {
                    hashMapArr[1].put("ColorSpace", s22Var2);
                }
            }
        }
    }

    public final void l(y22 y22Var) {
        if (o) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + y22Var);
        }
        k(y22Var);
        HashMap[] hashMapArr = this.f;
        s22 s22Var = (s22) hashMapArr[0].get("JpgFromRaw");
        if (s22Var != null) {
            f(new q22(s22Var.d), (int) s22Var.c, 5);
        }
        s22 s22Var2 = (s22) hashMapArr[0].get("ISO");
        s22 s22Var3 = (s22) hashMapArr[1].get("PhotographicSensitivity");
        if (s22Var2 != null && s22Var3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", s22Var2);
        }
    }

    public final boolean m(y22 y22Var) {
        byte[] bArr = P;
        byte[] bArr2 = new byte[bArr.length];
        y22Var.readFully(bArr2);
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
            int read = y22Var.A.read(bArr3, i, bArr3.length - i);
            if (read != -1) {
                i += read;
                y22Var.B += read;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr3, i);
                this.j = bArr.length;
                t(0, copyOf);
                return true;
            }
        }
    }

    public final void n(q22 q22Var) {
        if (o) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + q22Var);
        }
        q22Var.L = ByteOrder.LITTLE_ENDIAN;
        q22Var.d(B.length);
        int readInt = q22Var.readInt() + 8;
        byte[] bArr = C;
        q22Var.d(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                q22Var.readFully(bArr2);
                int readInt2 = q22Var.readInt();
                int i = length + 8;
                if (Arrays.equals(D, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    q22Var.readFully(bArr3);
                    byte[] bArr4 = P;
                    if (iq2.B(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.j = i;
                    t(0, bArr3);
                    w(new q22(bArr3));
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
                    q22Var.d(readInt2);
                } else {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void o(q22 q22Var, HashMap hashMap) {
        s22 s22Var = (s22) hashMap.get("JPEGInterchangeFormat");
        s22 s22Var2 = (s22) hashMap.get("JPEGInterchangeFormatLength");
        if (s22Var != null && s22Var2 != null) {
            int f = s22Var.f(this.h);
            int f2 = s22Var2.f(this.h);
            if (this.d == 7) {
                f += this.k;
            }
            if (f > 0 && f2 > 0 && this.a == null && this.c == null && this.b == null) {
                q22Var.d(f);
                q22Var.readFully(new byte[f2]);
            }
            if (o) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + f + ", length: " + f2);
            }
        }
    }

    public final boolean p(HashMap hashMap) {
        s22 s22Var = (s22) hashMap.get("ImageLength");
        s22 s22Var2 = (s22) hashMap.get("ImageWidth");
        if (s22Var != null && s22Var2 != null) {
            int f = s22Var.f(this.h);
            int f2 = s22Var2.f(this.h);
            if (f <= 512 && f2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q(y22 y22Var) {
        ByteOrder s2 = s(y22Var);
        this.h = s2;
        y22Var.L = s2;
        int readUnsignedShort = y22Var.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            f81.y(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = y22Var.readInt();
        if (readInt >= 8) {
            int i2 = readInt - 8;
            if (i2 > 0) {
                y22Var.d(i2);
                return;
            }
            return;
        }
        f81.j(wh1.g(readInt, "Invalid first Ifd offset: "));
    }

    public final void r() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.f;
            if (i < hashMapArr.length) {
                StringBuilder s2 = wh1.s("The size of tag group[", i, "]: ");
                s2.append(hashMapArr[i].size());
                Log.d("ExifInterface", s2.toString());
                for (Map.Entry entry : hashMapArr[i].entrySet()) {
                    s22 s22Var = (s22) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + s22Var.toString() + ", tagValue: '" + s22Var.g(this.h) + "'");
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void t(int i, byte[] bArr) {
        y22 y22Var = new y22(bArr);
        q(y22Var);
        u(y22Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(defpackage.y22 r30, int r31) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z22.u(y22, int):void");
    }

    public final void v(String str, int i, String str2) {
        HashMap[] hashMapArr = this.f;
        if (!hashMapArr[i].isEmpty() && hashMapArr[i].get(str) != null) {
            HashMap hashMap = hashMapArr[i];
            hashMap.put(str2, (s22) hashMap.get(str));
            hashMapArr[i].remove(str);
        }
    }

    public final void w(q22 q22Var) {
        s22 s22Var;
        int f;
        HashMap hashMap = this.f[4];
        s22 s22Var2 = (s22) hashMap.get("Compression");
        if (s22Var2 != null) {
            int f2 = s22Var2.f(this.h);
            if (f2 != 1) {
                if (f2 != 6) {
                    if (f2 != 7) {
                        return;
                    }
                } else {
                    o(q22Var, hashMap);
                    return;
                }
            }
            s22 s22Var3 = (s22) hashMap.get("BitsPerSample");
            if (s22Var3 != null) {
                int[] iArr = (int[]) s22Var3.h(this.h);
                int[] iArr2 = p;
                if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (s22Var = (s22) hashMap.get("PhotometricInterpretation")) != null && (((f = s22Var.f(this.h)) == 1 && Arrays.equals(iArr, q)) || (f == 6 && Arrays.equals(iArr, iArr2))))) {
                    s22 s22Var4 = (s22) hashMap.get("StripOffsets");
                    s22 s22Var5 = (s22) hashMap.get("StripByteCounts");
                    if (s22Var4 != null && s22Var5 != null) {
                        long[] j = iq2.j(s22Var4.h(this.h));
                        long[] j2 = iq2.j(s22Var5.h(this.h));
                        if (j != null && j.length != 0) {
                            if (j2 != null && j2.length != 0) {
                                if (j.length != j2.length) {
                                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                    return;
                                }
                                long j3 = 0;
                                for (long j4 : j2) {
                                    j3 += j4;
                                }
                                byte[] bArr = new byte[(int) j3];
                                this.i = true;
                                int i = 0;
                                int i2 = 0;
                                for (int i3 = 0; i3 < j.length; i3++) {
                                    int i4 = (int) j[i3];
                                    int i5 = (int) j2[i3];
                                    if (i3 < j.length - 1 && i4 + i5 != j[i3 + 1]) {
                                        this.i = false;
                                    }
                                    int i6 = i4 - i;
                                    if (i6 < 0) {
                                        Log.d("ExifInterface", "Invalid strip offset value");
                                        return;
                                    }
                                    try {
                                        q22Var.d(i6);
                                        int i7 = i + i6;
                                        byte[] bArr2 = new byte[i5];
                                        try {
                                            q22Var.readFully(bArr2);
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
                                    long j5 = j[0];
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
        o(q22Var, hashMap);
    }

    public final void x(int i, int i2) {
        HashMap[] hashMapArr = this.f;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z2 = o;
        if (!isEmpty && !hashMapArr[i2].isEmpty()) {
            s22 s22Var = (s22) hashMapArr[i].get("ImageLength");
            s22 s22Var2 = (s22) hashMapArr[i].get("ImageWidth");
            s22 s22Var3 = (s22) hashMapArr[i2].get("ImageLength");
            s22 s22Var4 = (s22) hashMapArr[i2].get("ImageWidth");
            if (s22Var != null && s22Var2 != null) {
                if (s22Var3 != null && s22Var4 != null) {
                    int f = s22Var.f(this.h);
                    int f2 = s22Var2.f(this.h);
                    int f3 = s22Var3.f(this.h);
                    int f4 = s22Var4.f(this.h);
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

    public final void y(y22 y22Var, int i) {
        s22 d;
        s22 d2;
        HashMap[] hashMapArr = this.f;
        s22 s22Var = (s22) hashMapArr[i].get("DefaultCropSize");
        s22 s22Var2 = (s22) hashMapArr[i].get("SensorTopBorder");
        s22 s22Var3 = (s22) hashMapArr[i].get("SensorLeftBorder");
        s22 s22Var4 = (s22) hashMapArr[i].get("SensorBottomBorder");
        s22 s22Var5 = (s22) hashMapArr[i].get("SensorRightBorder");
        if (s22Var != null) {
            int i2 = s22Var.a;
            ByteOrder byteOrder = this.h;
            if (i2 == 5) {
                w22[] w22VarArr = (w22[]) s22Var.h(byteOrder);
                if (w22VarArr != null && w22VarArr.length == 2) {
                    d = s22.c(new w22[]{w22VarArr[0]}, this.h);
                    d2 = s22.c(new w22[]{w22VarArr[1]}, this.h);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(w22VarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) s22Var.h(byteOrder);
                if (iArr != null && iArr.length == 2) {
                    d = s22.d(iArr[0], this.h);
                    d2 = s22.d(iArr[1], this.h);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i].put("ImageWidth", d);
            hashMapArr[i].put("ImageLength", d2);
        } else if (s22Var2 != null && s22Var3 != null && s22Var4 != null && s22Var5 != null) {
            int f = s22Var2.f(this.h);
            int f2 = s22Var4.f(this.h);
            int f3 = s22Var5.f(this.h);
            int f4 = s22Var3.f(this.h);
            if (f2 > f && f3 > f4) {
                s22 d3 = s22.d(f2 - f, this.h);
                s22 d4 = s22.d(f3 - f4, this.h);
                hashMapArr[i].put("ImageLength", d3);
                hashMapArr[i].put("ImageWidth", d4);
            }
        } else {
            s22 s22Var6 = (s22) hashMapArr[i].get("ImageLength");
            s22 s22Var7 = (s22) hashMapArr[i].get("ImageWidth");
            if (s22Var6 == null || s22Var7 == null) {
                s22 s22Var8 = (s22) hashMapArr[i].get("JPEGInterchangeFormat");
                s22 s22Var9 = (s22) hashMapArr[i].get("JPEGInterchangeFormatLength");
                if (s22Var8 != null && s22Var9 != null) {
                    int f5 = s22Var8.f(this.h);
                    int f6 = s22Var8.f(this.h);
                    y22Var.i(f5);
                    byte[] bArr = new byte[f6];
                    y22Var.readFully(bArr);
                    f(new q22(bArr), f5, i);
                }
            }
        }
    }

    public final void z() {
        x(0, 5);
        x(0, 4);
        x(5, 4);
        HashMap[] hashMapArr = this.f;
        s22 s22Var = (s22) hashMapArr[1].get("PixelXDimension");
        s22 s22Var2 = (s22) hashMapArr[1].get("PixelYDimension");
        if (s22Var != null && s22Var2 != null) {
            hashMapArr[0].put("ImageWidth", s22Var);
            hashMapArr[0].put("ImageLength", s22Var2);
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
