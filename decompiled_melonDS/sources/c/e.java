package c;

import a0.j;
import android.util.Log;
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
import java.util.TimeZone;
import java.util.regex.Pattern;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f2340j;

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f2341k;

    /* renamed from: l  reason: collision with root package name */
    public static final byte[] f2342l;
    public static final byte[] m;

    /* renamed from: n  reason: collision with root package name */
    public static final byte[] f2343n;

    /* renamed from: o  reason: collision with root package name */
    public static final String[] f2344o;

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f2345p;

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f2346q;

    /* renamed from: r  reason: collision with root package name */
    public static final c f2347r;

    /* renamed from: s  reason: collision with root package name */
    public static final c[][] f2348s;

    /* renamed from: t  reason: collision with root package name */
    public static final c[] f2349t;

    /* renamed from: u  reason: collision with root package name */
    public static final HashMap[] f2350u;

    /* renamed from: v  reason: collision with root package name */
    public static final HashMap[] f2351v;

    /* renamed from: w  reason: collision with root package name */
    public static final HashSet f2352w;

    /* renamed from: x  reason: collision with root package name */
    public static final HashMap f2353x;

    /* renamed from: y  reason: collision with root package name */
    public static final Charset f2354y;

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f2355z;

    /* renamed from: a  reason: collision with root package name */
    public final String f2356a;

    /* renamed from: b  reason: collision with root package name */
    public int f2357b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap[] f2358c = new HashMap[f2348s.length];

    /* renamed from: d  reason: collision with root package name */
    public ByteOrder f2359d = ByteOrder.BIG_ENDIAN;

    /* renamed from: e  reason: collision with root package name */
    public int f2360e;

    /* renamed from: f  reason: collision with root package name */
    public int f2361f;

    /* renamed from: g  reason: collision with root package name */
    public int f2362g;

    /* renamed from: h  reason: collision with root package name */
    public int f2363h;

    /* renamed from: i  reason: collision with root package name */
    public int f2364i;

    static {
        c[] cVarArr;
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f2340j = new int[]{8, 8, 8};
        f2341k = new int[]{8};
        f2342l = new byte[]{-1, -40, -1};
        m = new byte[]{79, 76, 89, 77, 80, 0};
        f2343n = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f2344o = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
        f2345p = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f2346q = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        c[] cVarArr2 = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", 256), new c("ImageLength", 257), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278), new c("StripByteCounts", 279), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
        c[] cVarArr3 = {new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962), new c("PixelYDimension", 40963), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720)};
        c[] cVarArr4 = {new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)};
        c[] cVarArr5 = {new c("InteroperabilityIndex", 1, 2)};
        c[] cVarArr6 = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", 256), new c("ThumbnailImageLength", 257), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278), new c("StripByteCounts", 279), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720)};
        f2347r = new c("StripOffsets", 273, 3);
        f2348s = new c[][]{cVarArr2, cVarArr3, cVarArr4, cVarArr5, cVarArr6, cVarArr2, new c[]{new c("ThumbnailImage", 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)}, new c[]{new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)}, new c[]{new c("AspectFrame", 4371, 3)}, new c[]{new c("ColorSpace", 55, 3)}};
        f2349t = new c[]{new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
        f2350u = new HashMap[10];
        f2351v = new HashMap[10];
        f2352w = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f2353x = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f2354y = forName;
        f2355z = "Exif\u0000\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            c[][] cVarArr7 = f2348s;
            if (i2 < cVarArr7.length) {
                f2350u[i2] = new HashMap();
                f2351v[i2] = new HashMap();
                for (c cVar : cVarArr7[i2]) {
                    f2350u[i2].put(Integer.valueOf(cVar.f2334a), cVar);
                    f2351v[i2].put(cVar.f2335b, cVar);
                }
                i2++;
            } else {
                HashMap hashMap = f2353x;
                c[] cVarArr8 = f2349t;
                hashMap.put(Integer.valueOf(cVarArr8[0].f2334a), 5);
                hashMap.put(Integer.valueOf(cVarArr8[1].f2334a), 1);
                hashMap.put(Integer.valueOf(cVarArr8[2].f2334a), 2);
                hashMap.put(Integer.valueOf(cVarArr8[3].f2334a), 3);
                hashMap.put(Integer.valueOf(cVarArr8[4].f2334a), 7);
                hashMap.put(Integer.valueOf(cVarArr8[5].f2334a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public e(String str) {
        if (str != null) {
            this.f2356a = str;
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    m(fileInputStream2);
                    try {
                        fileInputStream2.close();
                    } catch (RuntimeException e6) {
                        throw e6;
                    } catch (Exception unused) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (RuntimeException e10) {
                            throw e10;
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            j.h("filename cannot be null");
            throw null;
        }
    }

    public static long[] b(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = iArr[i2];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static ByteOrder o(a aVar) {
        short readShort = aVar.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            wa.b.g(Integer.toHexString(readShort), "Invalid byte order: ");
            return null;
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        String c4 = c("DateTimeOriginal");
        HashMap[] hashMapArr = this.f2358c;
        if (c4 != null && c("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = c4.concat("\u0000").getBytes(f2354y);
            hashMap.put("DateTime", new b(bytes, 2, bytes.length));
        }
        if (c("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", b.a(0L, this.f2359d));
        }
        if (c("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", b.a(0L, this.f2359d));
        }
        if (c("Orientation") == null) {
            hashMapArr[0].put("Orientation", b.a(0L, this.f2359d));
        }
        if (c("LightSource") == null) {
            hashMapArr[1].put("LightSource", b.a(0L, this.f2359d));
        }
    }

    public final String c(String str) {
        b d4 = d(str);
        if (d4 != null) {
            int i2 = d4.f2331a;
            if (!f2352w.contains(str)) {
                return d4.f(this.f2359d);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i2 != 5 && i2 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i2);
                    return null;
                }
                d[] dVarArr = (d[]) d4.g(this.f2359d);
                if (dVarArr != null && dVarArr.length == 3) {
                    d dVar = dVarArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) dVar.f2338a) / ((float) dVar.f2339b)));
                    d dVar2 = dVarArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) dVar2.f2338a) / ((float) dVar2.f2339b)));
                    d dVar3 = dVarArr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) dVar3.f2338a) / ((float) dVar3.f2339b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr));
                return null;
            }
            try {
                return Double.toString(d4.d(this.f2359d));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final b d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < f2348s.length; i2++) {
            b bVar = (b) this.f2358c[i2].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0115, code lost:
        r12.B = r11.f2359d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0119, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(c.a r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.e(c.a, int, int):void");
    }

    public final int f(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f2342l;
            if (i2 < bArr2.length) {
                if (bArr[i2] != bArr2[i2]) {
                    byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                    for (int i10 = 0; i10 < bytes.length; i10++) {
                        if (bArr[i10] != bytes[i10]) {
                            a aVar = new a(bArr);
                            ByteOrder o5 = o(aVar);
                            this.f2359d = o5;
                            aVar.B = o5;
                            short readShort = aVar.readShort();
                            aVar.close();
                            if (readShort != 20306 && readShort != 21330) {
                                a aVar2 = new a(bArr);
                                ByteOrder o8 = o(aVar2);
                                this.f2359d = o8;
                                aVar2.B = o8;
                                short readShort2 = aVar2.readShort();
                                aVar2.close();
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
                i2++;
            } else {
                return 4;
            }
        }
    }

    public final void g(a aVar) {
        int i2;
        int i10;
        i(aVar);
        HashMap[] hashMapArr = this.f2358c;
        b bVar = (b) hashMapArr[1].get("MakerNote");
        if (bVar != null) {
            a aVar2 = new a(bVar.f2333c);
            aVar2.B = this.f2359d;
            byte[] bArr = m;
            byte[] bArr2 = new byte[bArr.length];
            aVar2.readFully(bArr2);
            aVar2.d(0L);
            byte[] bArr3 = f2343n;
            byte[] bArr4 = new byte[bArr3.length];
            aVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                aVar2.d(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                aVar2.d(12L);
            }
            p(aVar2, 6);
            b bVar2 = (b) hashMapArr[7].get("PreviewImageStart");
            b bVar3 = (b) hashMapArr[7].get("PreviewImageLength");
            if (bVar2 != null && bVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", bVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", bVar3);
            }
            b bVar4 = (b) hashMapArr[8].get("AspectFrame");
            if (bVar4 != null) {
                int[] iArr = (int[]) bVar4.g(this.f2359d);
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
                        b c4 = b.c(i13, this.f2359d);
                        b c10 = b.c(i14, this.f2359d);
                        hashMapArr[0].put("ImageWidth", c4);
                        hashMapArr[0].put("ImageLength", c10);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void h(a aVar) {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i10 = ByteBuffer.wrap(bArr2).getInt();
        e(aVar, i2, 5);
        aVar.d(i10);
        aVar.B = ByteOrder.BIG_ENDIAN;
        int readInt = aVar.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == f2347r.f2334a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                b c4 = b.c(readShort, this.f2359d);
                b c10 = b.c(readShort2, this.f2359d);
                HashMap[] hashMapArr = this.f2358c;
                hashMapArr[0].put("ImageLength", c4);
                hashMapArr[0].put("ImageWidth", c10);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    public final void i(a aVar) {
        b bVar;
        n(aVar, aVar.A.available());
        p(aVar, 0);
        s(aVar, 0);
        s(aVar, 5);
        s(aVar, 4);
        r(0, 5);
        r(0, 4);
        r(5, 4);
        HashMap[] hashMapArr = this.f2358c;
        b bVar2 = (b) hashMapArr[1].get("PixelXDimension");
        b bVar3 = (b) hashMapArr[1].get("PixelYDimension");
        if (bVar2 != null && bVar3 != null) {
            hashMapArr[0].put("ImageWidth", bVar2);
            hashMapArr[0].put("ImageLength", bVar3);
        }
        if (hashMapArr[4].isEmpty() && l(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!l(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        if (this.f2357b == 8 && (bVar = (b) hashMapArr[1].get("MakerNote")) != null) {
            a aVar2 = new a(bVar.f2333c);
            aVar2.B = this.f2359d;
            aVar2.d(6L);
            p(aVar2, 9);
            b bVar4 = (b) hashMapArr[9].get("ColorSpace");
            if (bVar4 != null) {
                hashMapArr[1].put("ColorSpace", bVar4);
            }
        }
    }

    public final void j(a aVar) {
        i(aVar);
        HashMap[] hashMapArr = this.f2358c;
        if (((b) hashMapArr[0].get("JpgFromRaw")) != null) {
            e(aVar, this.f2364i, 5);
        }
        b bVar = (b) hashMapArr[0].get("ISO");
        b bVar2 = (b) hashMapArr[1].get("PhotographicSensitivity");
        if (bVar != null && bVar2 == null) {
            hashMapArr[1].put("PhotographicSensitivity", bVar);
        }
    }

    public final void k(a aVar, HashMap hashMap) {
        int i2;
        b bVar = (b) hashMap.get("JPEGInterchangeFormat");
        b bVar2 = (b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int e6 = bVar.e(this.f2359d);
            int min = Math.min(bVar2.e(this.f2359d), aVar.A.available() - e6);
            int i10 = this.f2357b;
            if (i10 != 4 && i10 != 9 && i10 != 10) {
                if (i10 == 7) {
                    i2 = this.f2361f;
                }
                if (e6 <= 0 && min > 0 && this.f2356a == null) {
                    aVar.d(e6);
                    aVar.readFully(new byte[min]);
                    return;
                }
                return;
            }
            i2 = this.f2360e;
            e6 += i2;
            if (e6 <= 0) {
            }
        }
    }

    public final boolean l(HashMap hashMap) {
        b bVar = (b) hashMap.get("ImageLength");
        b bVar2 = (b) hashMap.get("ImageWidth");
        if (bVar != null && bVar2 != null) {
            int e6 = bVar.e(this.f2359d);
            int e10 = bVar2.e(this.f2359d);
            if (e6 <= 512 && e10 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void m(FileInputStream fileInputStream) {
        for (int i2 = 0; i2 < f2348s.length; i2++) {
            try {
                this.f2358c[i2] = new HashMap();
            } catch (IOException unused) {
                a();
                return;
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 5000);
        this.f2357b = f(bufferedInputStream);
        a aVar = new a(bufferedInputStream);
        switch (this.f2357b) {
            case 0:
            case DSiCameraSource.FrontCamera /* 1 */:
            case 2:
            case 3:
            case l1.c.f8511g /* 5 */:
            case l1.c.f8509e /* 6 */:
            case 8:
            case 11:
                i(aVar);
                break;
            case 4:
                e(aVar, 0, 0);
                break;
            case 7:
                g(aVar);
                break;
            case l1.c.f8508d /* 9 */:
                h(aVar);
                break;
            case l1.c.f8510f /* 10 */:
                j(aVar);
                break;
        }
        q(aVar);
        a();
    }

    public final void n(a aVar, int i2) {
        ByteOrder o5 = o(aVar);
        this.f2359d = o5;
        aVar.B = o5;
        int readUnsignedShort = aVar.readUnsignedShort();
        int i10 = this.f2357b;
        if (i10 != 7 && i10 != 10 && readUnsignedShort != 42) {
            wa.b.g(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = aVar.readInt();
        if (readInt >= 8 && readInt < i2) {
            int i11 = readInt - 8;
            if (i11 > 0 && aVar.skipBytes(i11) != i11) {
                fj.j.h(w.d.l(i11, "Couldn't jump to first Ifd: "));
                return;
            }
            return;
        }
        fj.j.h(w.d.l(readInt, "Invalid first Ifd offset: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(c.a r30, int r31) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.p(c.a, int):void");
    }

    public final void q(a aVar) {
        b bVar;
        HashMap hashMap = this.f2358c[4];
        b bVar2 = (b) hashMap.get("Compression");
        if (bVar2 != null) {
            int e6 = bVar2.e(this.f2359d);
            if (e6 != 1) {
                if (e6 != 6) {
                    if (e6 != 7) {
                        return;
                    }
                } else {
                    k(aVar, hashMap);
                    return;
                }
            }
            b bVar3 = (b) hashMap.get("BitsPerSample");
            if (bVar3 != null) {
                int[] iArr = (int[]) bVar3.g(this.f2359d);
                int[] iArr2 = f2340j;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.f2357b == 3 && (bVar = (b) hashMap.get("PhotometricInterpretation")) != null) {
                        int e10 = bVar.e(this.f2359d);
                        if ((e10 != 1 || !Arrays.equals(iArr, f2341k)) && (e10 != 6 || !Arrays.equals(iArr, iArr2))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                b bVar4 = (b) hashMap.get("StripOffsets");
                b bVar5 = (b) hashMap.get("StripByteCounts");
                if (bVar4 != null && bVar5 != null) {
                    long[] b10 = b(bVar4.g(this.f2359d));
                    long[] b11 = b(bVar5.g(this.f2359d));
                    if (b10 == null) {
                        Log.w("ExifInterface", "stripOffsets should not be null.");
                        return;
                    } else if (b11 == null) {
                        Log.w("ExifInterface", "stripByteCounts should not be null.");
                        return;
                    } else {
                        long j2 = 0;
                        for (long j10 : b11) {
                            j2 += j10;
                        }
                        byte[] bArr = new byte[(int) j2];
                        int i2 = 0;
                        int i10 = 0;
                        for (int i11 = 0; i11 < b10.length; i11++) {
                            int i12 = (int) b11[i11];
                            int i13 = ((int) b10[i11]) - i2;
                            if (i13 < 0) {
                                Log.d("ExifInterface", "Invalid strip offset value");
                            }
                            aVar.d(i13);
                            int i14 = i2 + i13;
                            byte[] bArr2 = new byte[i12];
                            aVar.read(bArr2);
                            i2 = i14 + i12;
                            System.arraycopy(bArr2, 0, bArr, i10, i12);
                            i10 += i12;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        k(aVar, hashMap);
    }

    public final void r(int i2, int i10) {
        HashMap[] hashMapArr = this.f2358c;
        if (!hashMapArr[i2].isEmpty() && !hashMapArr[i10].isEmpty()) {
            b bVar = (b) hashMapArr[i2].get("ImageLength");
            b bVar2 = (b) hashMapArr[i2].get("ImageWidth");
            b bVar3 = (b) hashMapArr[i10].get("ImageLength");
            b bVar4 = (b) hashMapArr[i10].get("ImageWidth");
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int e6 = bVar.e(this.f2359d);
                int e10 = bVar2.e(this.f2359d);
                int e11 = bVar3.e(this.f2359d);
                int e12 = bVar4.e(this.f2359d);
                if (e6 < e11 && e10 < e12) {
                    HashMap hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i10];
                    hashMapArr[i10] = hashMap;
                }
            }
        }
    }

    public final void s(a aVar, int i2) {
        b bVar;
        b c4;
        b c10;
        HashMap[] hashMapArr = this.f2358c;
        b bVar2 = (b) hashMapArr[i2].get("DefaultCropSize");
        b bVar3 = (b) hashMapArr[i2].get("SensorTopBorder");
        b bVar4 = (b) hashMapArr[i2].get("SensorLeftBorder");
        b bVar5 = (b) hashMapArr[i2].get("SensorBottomBorder");
        b bVar6 = (b) hashMapArr[i2].get("SensorRightBorder");
        if (bVar2 != null) {
            int i10 = bVar2.f2331a;
            ByteOrder byteOrder = this.f2359d;
            if (i10 == 5) {
                d[] dVarArr = (d[]) bVar2.g(byteOrder);
                if (dVarArr != null && dVarArr.length == 2) {
                    c4 = b.b(dVarArr[0], this.f2359d);
                    c10 = b.b(dVarArr[1], this.f2359d);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(dVarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) bVar2.g(byteOrder);
                if (iArr != null && iArr.length == 2) {
                    c4 = b.c(iArr[0], this.f2359d);
                    c10 = b.c(iArr[1], this.f2359d);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i2].put("ImageWidth", c4);
            hashMapArr[i2].put("ImageLength", c10);
        } else if (bVar3 != null && bVar4 != null && bVar5 != null && bVar6 != null) {
            int e6 = bVar3.e(this.f2359d);
            int e10 = bVar5.e(this.f2359d);
            int e11 = bVar6.e(this.f2359d);
            int e12 = bVar4.e(this.f2359d);
            if (e10 > e6 && e11 > e12) {
                b c11 = b.c(e10 - e6, this.f2359d);
                b c12 = b.c(e11 - e12, this.f2359d);
                hashMapArr[i2].put("ImageLength", c11);
                hashMapArr[i2].put("ImageWidth", c12);
            }
        } else {
            b bVar7 = (b) hashMapArr[i2].get("ImageLength");
            b bVar8 = (b) hashMapArr[i2].get("ImageWidth");
            if ((bVar7 == null || bVar8 == null) && (bVar = (b) hashMapArr[i2].get("JPEGInterchangeFormat")) != null) {
                e(aVar, bVar.e(this.f2359d), i2);
            }
        }
    }
}
