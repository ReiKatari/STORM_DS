package p6;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import fj.j;
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
import m9.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final String[] E;
    public static final int[] F;
    public static final byte[] G;
    public static final d H;
    public static final d[][] I;
    public static final d[] J;
    public static final HashMap[] K;
    public static final HashMap[] L;
    public static final Set M;
    public static final HashMap N;
    public static final Charset O;
    public static final byte[] P;
    public static final byte[] Q;

    /* renamed from: o  reason: collision with root package name */
    public static final boolean f11376o = Log.isLoggable("ExifInterface", 3);

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f11377p;

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f11378q;

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f11379r;

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f11380s;

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f11381t;

    /* renamed from: u  reason: collision with root package name */
    public static final byte[] f11382u;

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f11383v;

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f11384w;

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f11385x;

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f11386y;

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f11387z;

    /* renamed from: a  reason: collision with root package name */
    public final String f11388a;

    /* renamed from: b  reason: collision with root package name */
    public final FileDescriptor f11389b;

    /* renamed from: c  reason: collision with root package name */
    public final AssetManager.AssetInputStream f11390c;

    /* renamed from: d  reason: collision with root package name */
    public int f11391d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11392e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap[] f11393f;

    /* renamed from: g  reason: collision with root package name */
    public final HashSet f11394g;

    /* renamed from: h  reason: collision with root package name */
    public ByteOrder f11395h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11396i;

    /* renamed from: j  reason: collision with root package name */
    public int f11397j;

    /* renamed from: k  reason: collision with root package name */
    public int f11398k;

    /* renamed from: l  reason: collision with root package name */
    public int f11399l;
    public int m;

    /* renamed from: n  reason: collision with root package name */
    public c f11400n;

    static {
        d[] dVarArr;
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f11377p = new int[]{8, 8, 8};
        f11378q = new int[]{8};
        f11379r = new byte[]{-1, -40, -1};
        f11380s = new byte[]{102, 116, 121, 112};
        f11381t = new byte[]{109, 105, 102, 49};
        f11382u = new byte[]{104, 101, 105, 99};
        f11383v = new byte[]{97, 118, 105, 102};
        f11384w = new byte[]{97, 118, 105, 115};
        f11385x = new byte[]{79, 76, 89, 77, 80, 0};
        f11386y = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f11387z = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
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
        d[] dVarArr2 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr3 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] dVarArr4 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr5 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr6 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        H = new d("StripOffsets", 273, 3);
        I = new d[][]{dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr6, dVarArr2, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        J = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
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
        int i2 = 0;
        while (true) {
            d[][] dVarArr7 = I;
            if (i2 < dVarArr7.length) {
                K[i2] = new HashMap();
                L[i2] = new HashMap();
                for (d dVar : dVarArr7[i2]) {
                    K[i2].put(Integer.valueOf(dVar.f11370a), dVar);
                    L[i2].put(dVar.f11371b, dVar);
                }
                i2++;
            } else {
                HashMap hashMap = N;
                d[] dVarArr8 = J;
                hashMap.put(Integer.valueOf(dVarArr8[0].f11370a), 5);
                hashMap.put(Integer.valueOf(dVarArr8[1].f11370a), 1);
                hashMap.put(Integer.valueOf(dVarArr8[2].f11370a), 2);
                hashMap.put(Integer.valueOf(dVarArr8[3].f11370a), 3);
                hashMap.put(Integer.valueOf(dVarArr8[4].f11370a), 7);
                hashMap.put(Integer.valueOf(dVarArr8[5].f11370a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc A[Catch: all -> 0x0069, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0069, blocks: (B:15:0x0058, B:17:0x005d, B:25:0x0074, B:26:0x0082, B:32:0x0094, B:34:0x009b, B:52:0x00cc, B:39:0x00ab, B:46:0x00b9, B:49:0x00c1, B:50:0x00c5, B:51:0x00c9, B:53:0x00d6, B:55:0x00df, B:57:0x00e5, B:59:0x00eb, B:61:0x00f1, B:66:0x00fc), top: B:76:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(java.io.InputStream r9) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.g.<init>(java.io.InputStream):void");
    }

    public static ByteOrder s(b bVar) {
        short readShort = bVar.readShort();
        boolean z10 = f11376o;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z10) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            wa.b.g(Integer.toHexString(readShort), "Invalid byte order: ");
            return null;
        }
        if (z10) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        String b10 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f11393f;
        if (b10 != null && b("DateTime") == null) {
            hashMapArr[0].put("DateTime", c.a(b10));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.b(0L, this.f11395h));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.b(0L, this.f11395h));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.b(0L, this.f11395h));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.b(0L, this.f11395h));
        }
    }

    public final String b(String str) {
        if (str != null) {
            c d4 = d(str);
            if (d4 != null) {
                int i2 = d4.f11366a;
                if (str.equals("GPSTimeStamp")) {
                    if (i2 != 5 && i2 != 10) {
                        Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i2);
                        return null;
                    }
                    e[] eVarArr = (e[]) d4.h(this.f11395h);
                    if (eVarArr != null && eVarArr.length == 3) {
                        e eVar = eVarArr[0];
                        Integer valueOf = Integer.valueOf((int) (((float) eVar.f11374a) / ((float) eVar.f11375b)));
                        e eVar2 = eVarArr[1];
                        Integer valueOf2 = Integer.valueOf((int) (((float) eVar2.f11374a) / ((float) eVar2.f11375b)));
                        e eVar3 = eVarArr[2];
                        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) eVar3.f11374a) / ((float) eVar3.f11375b))));
                    }
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                boolean contains = M.contains(str);
                ByteOrder byteOrder = this.f11395h;
                if (contains) {
                    try {
                        return Double.toString(d4.e(byteOrder));
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    return d4.g(byteOrder);
                }
            }
            return null;
        }
        o.i("tag shouldn't be null");
        return null;
    }

    public final int c(int i2, String str) {
        c d4 = d(str);
        if (d4 != null) {
            try {
            } catch (NumberFormatException unused) {
                return i2;
            }
        }
        return d4.f(this.f11395h);
    }

    public final c d(String str) {
        c cVar;
        int i2;
        c cVar2;
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (f11376o) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            if ("Xmp".equals(str) && (i2 = this.f11391d) != 4 && ((i2 == 9 || i2 == 15 || i2 == 12 || i2 == 13) && (cVar2 = this.f11400n) != null)) {
                return cVar2;
            }
            for (int i10 = 0; i10 < I.length; i10++) {
                c cVar3 = (c) this.f11393f[i10].get(str);
                if (cVar3 != null) {
                    return cVar3;
                }
            }
            if ("Xmp".equals(str) && (cVar = this.f11400n) != null) {
                return cVar;
            }
            return null;
        }
        o.i("tag shouldn't be null");
        return null;
    }

    public final void e(f fVar, int i2) {
        String str;
        String str2;
        String str3;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            if (i2 == 15 && i11 < 31) {
                o.v("Reading EXIF from AVIF files is supported from SDK 31 and above");
                return;
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(new a(fVar));
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
                    HashMap[] hashMapArr = this.f11393f;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", c.d(Integer.parseInt(str), this.f11395h));
                    }
                    if (str3 != null) {
                        hashMapArr[0].put("ImageLength", c.d(Integer.parseInt(str3), this.f11395h));
                    }
                    if (str2 != null) {
                        int parseInt = Integer.parseInt(str2);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i10 = 1;
                                } else {
                                    i10 = 8;
                                }
                            } else {
                                i10 = 3;
                            }
                        } else {
                            i10 = 6;
                        }
                        hashMapArr[0].put("Orientation", c.d(i10, this.f11395h));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            fVar.i(parseInt2);
                            byte[] bArr = new byte[6];
                            fVar.readFully(bArr);
                            int i12 = parseInt2 + 6;
                            int i13 = parseInt3 - 6;
                            if (Arrays.equals(bArr, P)) {
                                byte[] bArr2 = new byte[i13];
                                fVar.readFully(bArr2);
                                this.f11397j = i12;
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
                        long j2 = parseInt4;
                        fVar.i(j2);
                        byte[] bArr3 = new byte[parseInt5];
                        fVar.readFully(bArr3);
                        this.f11400n = new c(j2, bArr3, 1, parseInt5);
                    }
                    if (f11376o) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str3 + ", rotation " + str2);
                    }
                    try {
                        mediaMetadataRetriever.release();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                } catch (Throwable th2) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (IOException unused2) {
                    }
                    throw th2;
                }
            } catch (RuntimeException e6) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e6);
            }
        }
        o.v("Reading EXIF from HEIC files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0159, code lost:
        r20.L = r19.f11395h;
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
    public final void f(p6.b r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.g.f(p6.b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r9 < 16) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ec, code lost:
        if (r8 != null) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.g.g(java.io.BufferedInputStream):int");
    }

    public final void h(f fVar) {
        int i2;
        int i10;
        k(fVar);
        HashMap[] hashMapArr = this.f11393f;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f11369d);
            fVar2.L = this.f11395h;
            byte[] bArr = f11385x;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.i(0L);
            byte[] bArr3 = f11386y;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.i(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.i(12L);
            }
            u(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.h(this.f11395h);
                if (iArr != null && iArr.length == 4) {
                    int i11 = iArr[2];
                    int i12 = iArr[0];
                    if (i11 > i12 && (i2 = iArr[3]) > (i10 = iArr[1])) {
                        int i13 = (i11 - i12) + 1;
                        int i14 = (i2 - i10) + 1;
                        if (i13 < i14) {
                            int i15 = i13 + i14;
                            i14 = i15 - i14;
                            i13 = i15 - i14;
                        }
                        c d4 = c.d(i13, this.f11395h);
                        c d10 = c.d(i14, this.f11395h);
                        hashMapArr[0].put("ImageWidth", d4);
                        hashMapArr[0].put("ImageLength", d10);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void i(b bVar) {
        if (f11376o) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.L = ByteOrder.BIG_ENDIAN;
        int i2 = bVar.B;
        bVar.d(f11387z.length);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (!z10 || !z11) {
                try {
                    int readInt = bVar.readInt();
                    int readInt2 = bVar.readInt();
                    int i10 = bVar.B;
                    int i11 = i10 + readInt + 4;
                    int i12 = i10 - i2;
                    if (i12 == 16 && readInt2 != 1229472850) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                    }
                    if (readInt2 == 1229278788) {
                        return;
                    }
                    if (readInt2 == 1700284774 && !z10) {
                        this.f11397j = i12;
                        byte[] bArr = new byte[readInt];
                        bVar.readFully(bArr);
                        int readInt3 = bVar.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(readInt2 >>> 24);
                        crc32.update(readInt2 >>> 16);
                        crc32.update(readInt2 >>> 8);
                        crc32.update(readInt2);
                        crc32.update(bArr);
                        if (((int) crc32.getValue()) == readInt3) {
                            t(0, bArr);
                            z();
                            w(new b(bArr));
                            z10 = true;
                        } else {
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                        }
                    } else if (readInt2 == 1767135348 && !z11) {
                        byte[] bArr2 = A;
                        if (readInt >= bArr2.length) {
                            int length = bArr2.length;
                            byte[] bArr3 = new byte[length];
                            bVar.readFully(bArr3);
                            if (Arrays.equals(bArr3, bArr2)) {
                                int i13 = readInt - length;
                                byte[] bArr4 = new byte[i13];
                                bVar.readFully(bArr4);
                                this.f11400n = new c(bVar.B - i2, bArr4, 1, i13);
                                z11 = true;
                            }
                        }
                    }
                    bVar.d(i11 - bVar.B);
                } catch (EOFException e6) {
                    throw new IOException("Encountered corrupt PNG file.", e6);
                }
            } else {
                return;
            }
        }
    }

    public final void j(b bVar) {
        boolean z10 = f11376o;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.d(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i10 = ByteBuffer.wrap(bArr2).getInt();
        int i11 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i10];
        bVar.d(i2 - bVar.B);
        bVar.readFully(bArr4);
        f(new b(bArr4), i2, 5);
        bVar.d(i11 - bVar.B);
        bVar.L = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == H.f11370a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c d4 = c.d(readShort, this.f11395h);
                c d10 = c.d(readShort2, this.f11395h);
                HashMap[] hashMapArr = this.f11393f;
                hashMapArr[0].put("ImageLength", d4);
                hashMapArr[0].put("ImageWidth", d10);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.d(readUnsignedShort2);
        }
    }

    public final void k(f fVar) {
        q(fVar);
        u(fVar, 0);
        y(fVar, 0);
        y(fVar, 5);
        y(fVar, 4);
        z();
        if (this.f11391d == 8) {
            HashMap[] hashMapArr = this.f11393f;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f11369d);
                fVar2.L = this.f11395h;
                fVar2.d(6);
                u(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void l(f fVar) {
        if (f11376o) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        k(fVar);
        HashMap[] hashMapArr = this.f11393f;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.f11369d), (int) cVar.f11368c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", cVar2);
        }
    }

    public final boolean m(f fVar) {
        byte[] bArr = P;
        byte[] bArr2 = new byte[bArr.length];
        fVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArr3 = new byte[1024];
        int i2 = 0;
        while (true) {
            if (i2 == bArr3.length) {
                bArr3 = Arrays.copyOf(bArr3, bArr3.length * 2);
            }
            int read = fVar.A.read(bArr3, i2, bArr3.length - i2);
            if (read != -1) {
                i2 += read;
                fVar.B += read;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr3, i2);
                this.f11397j = bArr.length;
                t(0, copyOf);
                return true;
            }
        }
    }

    public final void n(b bVar) {
        if (f11376o) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.L = ByteOrder.LITTLE_ENDIAN;
        bVar.d(B.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = C;
        bVar.d(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i2 = length + 8;
                if (Arrays.equals(D, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    byte[] bArr4 = P;
                    if (pc.a.O(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.f11397j = i2;
                    t(0, bArr3);
                    w(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i2 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length <= readInt) {
                    bVar.d(readInt2);
                } else {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
            } catch (EOFException e6) {
                throw new IOException("Encountered corrupt WebP file.", e6);
            }
        }
    }

    public final void o(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int f8 = cVar.f(this.f11395h);
            int f10 = cVar2.f(this.f11395h);
            if (this.f11391d == 7) {
                f8 += this.f11398k;
            }
            if (f8 > 0 && f10 > 0 && this.f11388a == null && this.f11390c == null && this.f11389b == null) {
                bVar.d(f8);
                bVar.readFully(new byte[f10]);
            }
            if (f11376o) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + f8 + ", length: " + f10);
            }
        }
    }

    public final boolean p(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar != null && cVar2 != null) {
            int f8 = cVar.f(this.f11395h);
            int f10 = cVar2.f(this.f11395h);
            if (f8 <= 512 && f10 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q(f fVar) {
        ByteOrder s10 = s(fVar);
        this.f11395h = s10;
        fVar.L = s10;
        int readUnsignedShort = fVar.readUnsignedShort();
        int i2 = this.f11391d;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            wa.b.g(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = fVar.readInt();
        if (readInt >= 8) {
            int i10 = readInt - 8;
            if (i10 > 0) {
                fVar.d(i10);
                return;
            }
            return;
        }
        j.h(w.d.l(readInt, "Invalid first Ifd offset: "));
    }

    public final void r() {
        int i2 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f11393f;
            if (i2 < hashMapArr.length) {
                StringBuilder i10 = kc.a.i("The size of tag group[", i2, "]: ");
                i10.append(hashMapArr[i2].size());
                Log.d("ExifInterface", i10.toString());
                for (Map.Entry entry : hashMapArr[i2].entrySet()) {
                    c cVar = (c) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.g(this.f11395h) + "'");
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void t(int i2, byte[] bArr) {
        f fVar = new f(bArr);
        q(fVar);
        u(fVar, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(p6.f r30, int r31) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.g.u(p6.f, int):void");
    }

    public final void v(String str, int i2, String str2) {
        HashMap[] hashMapArr = this.f11393f;
        if (!hashMapArr[i2].isEmpty() && hashMapArr[i2].get(str) != null) {
            HashMap hashMap = hashMapArr[i2];
            hashMap.put(str2, (c) hashMap.get(str));
            hashMapArr[i2].remove(str);
        }
    }

    public final void w(b bVar) {
        c cVar;
        int f8;
        HashMap hashMap = this.f11393f[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 != null) {
            int f10 = cVar2.f(this.f11395h);
            if (f10 != 1) {
                if (f10 != 6) {
                    if (f10 != 7) {
                        return;
                    }
                } else {
                    o(bVar, hashMap);
                    return;
                }
            }
            c cVar3 = (c) hashMap.get("BitsPerSample");
            if (cVar3 != null) {
                int[] iArr = (int[]) cVar3.h(this.f11395h);
                int[] iArr2 = f11377p;
                if (Arrays.equals(iArr2, iArr) || (this.f11391d == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((f8 = cVar.f(this.f11395h)) == 1 && Arrays.equals(iArr, f11378q)) || (f8 == 6 && Arrays.equals(iArr, iArr2))))) {
                    c cVar4 = (c) hashMap.get("StripOffsets");
                    c cVar5 = (c) hashMap.get("StripByteCounts");
                    if (cVar4 != null && cVar5 != null) {
                        long[] o5 = pc.a.o(cVar4.h(this.f11395h));
                        long[] o8 = pc.a.o(cVar5.h(this.f11395h));
                        if (o5 != null && o5.length != 0) {
                            if (o8 != null && o8.length != 0) {
                                if (o5.length != o8.length) {
                                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                    return;
                                }
                                long j2 = 0;
                                for (long j10 : o8) {
                                    j2 += j10;
                                }
                                byte[] bArr = new byte[(int) j2];
                                this.f11396i = true;
                                int i2 = 0;
                                int i10 = 0;
                                for (int i11 = 0; i11 < o5.length; i11++) {
                                    int i12 = (int) o5[i11];
                                    int i13 = (int) o8[i11];
                                    if (i11 < o5.length - 1 && i12 + i13 != o5[i11 + 1]) {
                                        this.f11396i = false;
                                    }
                                    int i14 = i12 - i2;
                                    if (i14 < 0) {
                                        Log.d("ExifInterface", "Invalid strip offset value");
                                        return;
                                    }
                                    try {
                                        bVar.d(i14);
                                        int i15 = i2 + i14;
                                        byte[] bArr2 = new byte[i13];
                                        try {
                                            bVar.readFully(bArr2);
                                            i2 = i15 + i13;
                                            System.arraycopy(bArr2, 0, bArr, i10, i13);
                                            i10 += i13;
                                        } catch (EOFException unused) {
                                            Log.d("ExifInterface", "Failed to read " + i13 + " bytes.");
                                            return;
                                        }
                                    } catch (EOFException unused2) {
                                        Log.d("ExifInterface", "Failed to skip " + i14 + " bytes.");
                                        return;
                                    }
                                }
                                if (this.f11396i) {
                                    long j11 = o5[0];
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
            if (f11376o) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        o(bVar, hashMap);
    }

    public final void x(int i2, int i10) {
        HashMap[] hashMapArr = this.f11393f;
        boolean isEmpty = hashMapArr[i2].isEmpty();
        boolean z10 = f11376o;
        if (!isEmpty && !hashMapArr[i10].isEmpty()) {
            c cVar = (c) hashMapArr[i2].get("ImageLength");
            c cVar2 = (c) hashMapArr[i2].get("ImageWidth");
            c cVar3 = (c) hashMapArr[i10].get("ImageLength");
            c cVar4 = (c) hashMapArr[i10].get("ImageWidth");
            if (cVar != null && cVar2 != null) {
                if (cVar3 != null && cVar4 != null) {
                    int f8 = cVar.f(this.f11395h);
                    int f10 = cVar2.f(this.f11395h);
                    int f11 = cVar3.f(this.f11395h);
                    int f12 = cVar4.f(this.f11395h);
                    if (f8 < f11 && f10 < f12) {
                        HashMap hashMap = hashMapArr[i2];
                        hashMapArr[i2] = hashMapArr[i10];
                        hashMapArr[i10] = hashMap;
                    }
                } else if (z10) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                }
            } else if (z10) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
        } else if (z10) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void y(f fVar, int i2) {
        c d4;
        c d10;
        HashMap[] hashMapArr = this.f11393f;
        c cVar = (c) hashMapArr[i2].get("DefaultCropSize");
        c cVar2 = (c) hashMapArr[i2].get("SensorTopBorder");
        c cVar3 = (c) hashMapArr[i2].get("SensorLeftBorder");
        c cVar4 = (c) hashMapArr[i2].get("SensorBottomBorder");
        c cVar5 = (c) hashMapArr[i2].get("SensorRightBorder");
        if (cVar != null) {
            int i10 = cVar.f11366a;
            ByteOrder byteOrder = this.f11395h;
            if (i10 == 5) {
                e[] eVarArr = (e[]) cVar.h(byteOrder);
                if (eVarArr != null && eVarArr.length == 2) {
                    d4 = c.c(new e[]{eVarArr[0]}, this.f11395h);
                    d10 = c.c(new e[]{eVarArr[1]}, this.f11395h);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) cVar.h(byteOrder);
                if (iArr != null && iArr.length == 2) {
                    d4 = c.d(iArr[0], this.f11395h);
                    d10 = c.d(iArr[1], this.f11395h);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i2].put("ImageWidth", d4);
            hashMapArr[i2].put("ImageLength", d10);
        } else if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int f8 = cVar2.f(this.f11395h);
            int f10 = cVar4.f(this.f11395h);
            int f11 = cVar5.f(this.f11395h);
            int f12 = cVar3.f(this.f11395h);
            if (f10 > f8 && f11 > f12) {
                c d11 = c.d(f10 - f8, this.f11395h);
                c d12 = c.d(f11 - f12, this.f11395h);
                hashMapArr[i2].put("ImageLength", d11);
                hashMapArr[i2].put("ImageWidth", d12);
            }
        } else {
            c cVar6 = (c) hashMapArr[i2].get("ImageLength");
            c cVar7 = (c) hashMapArr[i2].get("ImageWidth");
            if (cVar6 == null || cVar7 == null) {
                c cVar8 = (c) hashMapArr[i2].get("JPEGInterchangeFormat");
                c cVar9 = (c) hashMapArr[i2].get("JPEGInterchangeFormatLength");
                if (cVar8 != null && cVar9 != null) {
                    int f13 = cVar8.f(this.f11395h);
                    int f14 = cVar8.f(this.f11395h);
                    fVar.i(f13);
                    byte[] bArr = new byte[f14];
                    fVar.readFully(bArr);
                    f(new b(bArr), f13, i2);
                }
            }
        }
    }

    public final void z() {
        x(0, 5);
        x(0, 4);
        x(5, 4);
        HashMap[] hashMapArr = this.f11393f;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
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
