package defpackage;

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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a32  reason: default package */
/* loaded from: classes.dex */
public final class a32 {
    public static final int[] j;
    public static final int[] k;
    public static final byte[] l;
    public static final byte[] m;
    public static final byte[] n;
    public static final String[] o;
    public static final int[] p;
    public static final byte[] q;
    public static final v22 r;
    public static final v22[][] s;
    public static final v22[] t;
    public static final HashMap[] u;
    public static final HashMap[] v;
    public static final HashSet w;
    public static final HashMap x;
    public static final Charset y;
    public static final byte[] z;
    public final String a;
    public int b;
    public final HashMap[] c = new HashMap[s.length];
    public ByteOrder d = ByteOrder.BIG_ENDIAN;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    static {
        v22[] v22VarArr;
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        j = new int[]{8, 8, 8};
        k = new int[]{8};
        l = new byte[]{-1, -40, -1};
        m = new byte[]{79, 76, 89, 77, 80, 0};
        n = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        o = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
        p = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        q = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        v22[] v22VarArr2 = {new v22("NewSubfileType", 254, 4), new v22("SubfileType", 255, 4), new v22("ImageWidth", 256), new v22("ImageLength", 257), new v22("BitsPerSample", 258, 3), new v22("Compression", 259, 3), new v22("PhotometricInterpretation", 262, 3), new v22("ImageDescription", 270, 2), new v22("Make", 271, 2), new v22("Model", 272, 2), new v22("StripOffsets", 273), new v22("Orientation", 274, 3), new v22("SamplesPerPixel", 277, 3), new v22("RowsPerStrip", 278), new v22("StripByteCounts", 279), new v22("XResolution", 282, 5), new v22("YResolution", 283, 5), new v22("PlanarConfiguration", 284, 3), new v22("ResolutionUnit", 296, 3), new v22("TransferFunction", 301, 3), new v22("Software", 305, 2), new v22("DateTime", 306, 2), new v22("Artist", 315, 2), new v22("WhitePoint", 318, 5), new v22("PrimaryChromaticities", 319, 5), new v22("SubIFDPointer", 330, 4), new v22("JPEGInterchangeFormat", 513, 4), new v22("JPEGInterchangeFormatLength", 514, 4), new v22("YCbCrCoefficients", 529, 5), new v22("YCbCrSubSampling", 530, 3), new v22("YCbCrPositioning", 531, 3), new v22("ReferenceBlackWhite", 532, 5), new v22("Copyright", 33432, 2), new v22("ExifIFDPointer", 34665, 4), new v22("GPSInfoIFDPointer", 34853, 4), new v22("SensorTopBorder", 4, 4), new v22("SensorLeftBorder", 5, 4), new v22("SensorBottomBorder", 6, 4), new v22("SensorRightBorder", 7, 4), new v22("ISO", 23, 3), new v22("JpgFromRaw", 46, 7)};
        v22[] v22VarArr3 = {new v22("ExposureTime", 33434, 5), new v22("FNumber", 33437, 5), new v22("ExposureProgram", 34850, 3), new v22("SpectralSensitivity", 34852, 2), new v22("PhotographicSensitivity", 34855, 3), new v22("OECF", 34856, 7), new v22("ExifVersion", 36864, 2), new v22("DateTimeOriginal", 36867, 2), new v22("DateTimeDigitized", 36868, 2), new v22("ComponentsConfiguration", 37121, 7), new v22("CompressedBitsPerPixel", 37122, 5), new v22("ShutterSpeedValue", 37377, 10), new v22("ApertureValue", 37378, 5), new v22("BrightnessValue", 37379, 10), new v22("ExposureBiasValue", 37380, 10), new v22("MaxApertureValue", 37381, 5), new v22("SubjectDistance", 37382, 5), new v22("MeteringMode", 37383, 3), new v22("LightSource", 37384, 3), new v22("Flash", 37385, 3), new v22("FocalLength", 37386, 5), new v22("SubjectArea", 37396, 3), new v22("MakerNote", 37500, 7), new v22("UserComment", 37510, 7), new v22("SubSecTime", 37520, 2), new v22("SubSecTimeOriginal", 37521, 2), new v22("SubSecTimeDigitized", 37522, 2), new v22("FlashpixVersion", 40960, 7), new v22("ColorSpace", 40961, 3), new v22("PixelXDimension", 40962), new v22("PixelYDimension", 40963), new v22("RelatedSoundFile", 40964, 2), new v22("InteroperabilityIFDPointer", 40965, 4), new v22("FlashEnergy", 41483, 5), new v22("SpatialFrequencyResponse", 41484, 7), new v22("FocalPlaneXResolution", 41486, 5), new v22("FocalPlaneYResolution", 41487, 5), new v22("FocalPlaneResolutionUnit", 41488, 3), new v22("SubjectLocation", 41492, 3), new v22("ExposureIndex", 41493, 5), new v22("SensingMethod", 41495, 3), new v22("FileSource", 41728, 7), new v22("SceneType", 41729, 7), new v22("CFAPattern", 41730, 7), new v22("CustomRendered", 41985, 3), new v22("ExposureMode", 41986, 3), new v22("WhiteBalance", 41987, 3), new v22("DigitalZoomRatio", 41988, 5), new v22("FocalLengthIn35mmFilm", 41989, 3), new v22("SceneCaptureType", 41990, 3), new v22("GainControl", 41991, 3), new v22("Contrast", 41992, 3), new v22("Saturation", 41993, 3), new v22("Sharpness", 41994, 3), new v22("DeviceSettingDescription", 41995, 7), new v22("SubjectDistanceRange", 41996, 3), new v22("ImageUniqueID", 42016, 2), new v22("DNGVersion", 50706, 1), new v22("DefaultCropSize", 50720)};
        v22[] v22VarArr4 = {new v22("GPSVersionID", 0, 1), new v22("GPSLatitudeRef", 1, 2), new v22("GPSLatitude", 2, 5), new v22("GPSLongitudeRef", 3, 2), new v22("GPSLongitude", 4, 5), new v22("GPSAltitudeRef", 5, 1), new v22("GPSAltitude", 6, 5), new v22("GPSTimeStamp", 7, 5), new v22("GPSSatellites", 8, 2), new v22("GPSStatus", 9, 2), new v22("GPSMeasureMode", 10, 2), new v22("GPSDOP", 11, 5), new v22("GPSSpeedRef", 12, 2), new v22("GPSSpeed", 13, 5), new v22("GPSTrackRef", 14, 2), new v22("GPSTrack", 15, 5), new v22("GPSImgDirectionRef", 16, 2), new v22("GPSImgDirection", 17, 5), new v22("GPSMapDatum", 18, 2), new v22("GPSDestLatitudeRef", 19, 2), new v22("GPSDestLatitude", 20, 5), new v22("GPSDestLongitudeRef", 21, 2), new v22("GPSDestLongitude", 22, 5), new v22("GPSDestBearingRef", 23, 2), new v22("GPSDestBearing", 24, 5), new v22("GPSDestDistanceRef", 25, 2), new v22("GPSDestDistance", 26, 5), new v22("GPSProcessingMethod", 27, 7), new v22("GPSAreaInformation", 28, 7), new v22("GPSDateStamp", 29, 2), new v22("GPSDifferential", 30, 3)};
        v22[] v22VarArr5 = {new v22("InteroperabilityIndex", 1, 2)};
        v22[] v22VarArr6 = {new v22("NewSubfileType", 254, 4), new v22("SubfileType", 255, 4), new v22("ThumbnailImageWidth", 256), new v22("ThumbnailImageLength", 257), new v22("BitsPerSample", 258, 3), new v22("Compression", 259, 3), new v22("PhotometricInterpretation", 262, 3), new v22("ImageDescription", 270, 2), new v22("Make", 271, 2), new v22("Model", 272, 2), new v22("StripOffsets", 273), new v22("Orientation", 274, 3), new v22("SamplesPerPixel", 277, 3), new v22("RowsPerStrip", 278), new v22("StripByteCounts", 279), new v22("XResolution", 282, 5), new v22("YResolution", 283, 5), new v22("PlanarConfiguration", 284, 3), new v22("ResolutionUnit", 296, 3), new v22("TransferFunction", 301, 3), new v22("Software", 305, 2), new v22("DateTime", 306, 2), new v22("Artist", 315, 2), new v22("WhitePoint", 318, 5), new v22("PrimaryChromaticities", 319, 5), new v22("SubIFDPointer", 330, 4), new v22("JPEGInterchangeFormat", 513, 4), new v22("JPEGInterchangeFormatLength", 514, 4), new v22("YCbCrCoefficients", 529, 5), new v22("YCbCrSubSampling", 530, 3), new v22("YCbCrPositioning", 531, 3), new v22("ReferenceBlackWhite", 532, 5), new v22("Copyright", 33432, 2), new v22("ExifIFDPointer", 34665, 4), new v22("GPSInfoIFDPointer", 34853, 4), new v22("DNGVersion", 50706, 1), new v22("DefaultCropSize", 50720)};
        r = new v22("StripOffsets", 273, 3);
        s = new v22[][]{v22VarArr2, v22VarArr3, v22VarArr4, v22VarArr5, v22VarArr6, v22VarArr2, new v22[]{new v22("ThumbnailImage", 256, 7), new v22("CameraSettingsIFDPointer", 8224, 4), new v22("ImageProcessingIFDPointer", 8256, 4)}, new v22[]{new v22("PreviewImageStart", 257, 4), new v22("PreviewImageLength", 258, 4)}, new v22[]{new v22("AspectFrame", 4371, 3)}, new v22[]{new v22("ColorSpace", 55, 3)}};
        t = new v22[]{new v22("SubIFDPointer", 330, 4), new v22("ExifIFDPointer", 34665, 4), new v22("GPSInfoIFDPointer", 34853, 4), new v22("InteroperabilityIFDPointer", 40965, 4), new v22("CameraSettingsIFDPointer", 8224, 1), new v22("ImageProcessingIFDPointer", 8256, 1)};
        u = new HashMap[10];
        v = new HashMap[10];
        w = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        x = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        y = forName;
        z = "Exif\u0000\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            v22[][] v22VarArr7 = s;
            if (i < v22VarArr7.length) {
                u[i] = new HashMap();
                v[i] = new HashMap();
                for (v22 v22Var : v22VarArr7[i]) {
                    u[i].put(Integer.valueOf(v22Var.a), v22Var);
                    v[i].put(v22Var.b, v22Var);
                }
                i++;
            } else {
                HashMap hashMap = x;
                v22[] v22VarArr8 = t;
                hashMap.put(Integer.valueOf(v22VarArr8[0].a), 5);
                hashMap.put(Integer.valueOf(v22VarArr8[1].a), 1);
                hashMap.put(Integer.valueOf(v22VarArr8[2].a), 2);
                hashMap.put(Integer.valueOf(v22VarArr8[3].a), 3);
                hashMap.put(Integer.valueOf(v22VarArr8[4].a), 7);
                hashMap.put(Integer.valueOf(v22VarArr8[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public a32(String str) {
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
            i.i("filename cannot be null");
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

    public static ByteOrder o(r22 r22Var) {
        short readShort = r22Var.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            f81.y(Integer.toHexString(readShort), "Invalid byte order: ");
            return null;
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        String c = c("DateTimeOriginal");
        HashMap[] hashMapArr = this.c;
        if (c != null && c("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = c.concat("\u0000").getBytes(y);
            hashMap.put("DateTime", new t22(bytes, 2, bytes.length));
        }
        if (c("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", t22.a(0L, this.d));
        }
        if (c("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", t22.a(0L, this.d));
        }
        if (c("Orientation") == null) {
            hashMapArr[0].put("Orientation", t22.a(0L, this.d));
        }
        if (c("LightSource") == null) {
            hashMapArr[1].put("LightSource", t22.a(0L, this.d));
        }
    }

    public final String c(String str) {
        t22 d = d(str);
        if (d != null) {
            int i = d.a;
            if (!w.contains(str)) {
                return d.f(this.d);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                x22[] x22VarArr = (x22[]) d.g(this.d);
                if (x22VarArr != null && x22VarArr.length == 3) {
                    x22 x22Var = x22VarArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) x22Var.a) / ((float) x22Var.b)));
                    x22 x22Var2 = x22VarArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) x22Var2.a) / ((float) x22Var2.b)));
                    x22 x22Var3 = x22VarArr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) x22Var3.a) / ((float) x22Var3.b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(x22VarArr));
                return null;
            }
            try {
                return Double.toString(d.d(this.d));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final t22 d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < s.length; i++) {
            t22 t22Var = (t22) this.c[i].get(str);
            if (t22Var != null) {
                return t22Var;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.r22 r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a32.e(r22, int, int):void");
    }

    public final int f(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr2 = l;
            if (i < bArr2.length) {
                if (bArr[i] != bArr2[i]) {
                    byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                    for (int i2 = 0; i2 < bytes.length; i2++) {
                        if (bArr[i2] != bytes[i2]) {
                            r22 r22Var = new r22(bArr);
                            ByteOrder o2 = o(r22Var);
                            this.d = o2;
                            r22Var.B = o2;
                            short readShort = r22Var.readShort();
                            r22Var.close();
                            if (readShort != 20306 && readShort != 21330) {
                                r22 r22Var2 = new r22(bArr);
                                ByteOrder o3 = o(r22Var2);
                                this.d = o3;
                                r22Var2.B = o3;
                                short readShort2 = r22Var2.readShort();
                                r22Var2.close();
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

    public final void g(r22 r22Var) {
        int i;
        int i2;
        i(r22Var);
        HashMap[] hashMapArr = this.c;
        t22 t22Var = (t22) hashMapArr[1].get("MakerNote");
        if (t22Var != null) {
            r22 r22Var2 = new r22(t22Var.c);
            r22Var2.B = this.d;
            byte[] bArr = m;
            byte[] bArr2 = new byte[bArr.length];
            r22Var2.readFully(bArr2);
            r22Var2.d(0L);
            byte[] bArr3 = n;
            byte[] bArr4 = new byte[bArr3.length];
            r22Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                r22Var2.d(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                r22Var2.d(12L);
            }
            p(r22Var2, 6);
            t22 t22Var2 = (t22) hashMapArr[7].get("PreviewImageStart");
            t22 t22Var3 = (t22) hashMapArr[7].get("PreviewImageLength");
            if (t22Var2 != null && t22Var3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", t22Var2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", t22Var3);
            }
            t22 t22Var4 = (t22) hashMapArr[8].get("AspectFrame");
            if (t22Var4 != null) {
                int[] iArr = (int[]) t22Var4.g(this.d);
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
                        t22 c = t22.c(i5, this.d);
                        t22 c2 = t22.c(i6, this.d);
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

    public final void h(r22 r22Var) {
        r22Var.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        r22Var.read(bArr);
        r22Var.skipBytes(4);
        r22Var.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        e(r22Var, i, 5);
        r22Var.d(i2);
        r22Var.B = ByteOrder.BIG_ENDIAN;
        int readInt = r22Var.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = r22Var.readUnsignedShort();
            int readUnsignedShort2 = r22Var.readUnsignedShort();
            if (readUnsignedShort == r.a) {
                short readShort = r22Var.readShort();
                short readShort2 = r22Var.readShort();
                t22 c = t22.c(readShort, this.d);
                t22 c2 = t22.c(readShort2, this.d);
                HashMap[] hashMapArr = this.c;
                hashMapArr[0].put("ImageLength", c);
                hashMapArr[0].put("ImageWidth", c2);
                return;
            }
            r22Var.skipBytes(readUnsignedShort2);
        }
    }

    public final void i(r22 r22Var) {
        t22 t22Var;
        n(r22Var, r22Var.A.available());
        p(r22Var, 0);
        s(r22Var, 0);
        s(r22Var, 5);
        s(r22Var, 4);
        r(0, 5);
        r(0, 4);
        r(5, 4);
        HashMap[] hashMapArr = this.c;
        t22 t22Var2 = (t22) hashMapArr[1].get("PixelXDimension");
        t22 t22Var3 = (t22) hashMapArr[1].get("PixelYDimension");
        if (t22Var2 != null && t22Var3 != null) {
            hashMapArr[0].put("ImageWidth", t22Var2);
            hashMapArr[0].put("ImageLength", t22Var3);
        }
        if (hashMapArr[4].isEmpty() && l(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!l(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        if (this.b == 8 && (t22Var = (t22) hashMapArr[1].get("MakerNote")) != null) {
            r22 r22Var2 = new r22(t22Var.c);
            r22Var2.B = this.d;
            r22Var2.d(6L);
            p(r22Var2, 9);
            t22 t22Var4 = (t22) hashMapArr[9].get("ColorSpace");
            if (t22Var4 != null) {
                hashMapArr[1].put("ColorSpace", t22Var4);
            }
        }
    }

    public final void j(r22 r22Var) {
        i(r22Var);
        HashMap[] hashMapArr = this.c;
        if (((t22) hashMapArr[0].get("JpgFromRaw")) != null) {
            e(r22Var, this.i, 5);
        }
        t22 t22Var = (t22) hashMapArr[0].get("ISO");
        t22 t22Var2 = (t22) hashMapArr[1].get("PhotographicSensitivity");
        if (t22Var != null && t22Var2 == null) {
            hashMapArr[1].put("PhotographicSensitivity", t22Var);
        }
    }

    public final void k(r22 r22Var, HashMap hashMap) {
        int i;
        t22 t22Var = (t22) hashMap.get("JPEGInterchangeFormat");
        t22 t22Var2 = (t22) hashMap.get("JPEGInterchangeFormatLength");
        if (t22Var != null && t22Var2 != null) {
            int e = t22Var.e(this.d);
            int min = Math.min(t22Var2.e(this.d), r22Var.A.available() - e);
            int i2 = this.b;
            if (i2 != 4 && i2 != 9 && i2 != 10) {
                if (i2 == 7) {
                    i = this.f;
                }
                if (e <= 0 && min > 0 && this.a == null) {
                    r22Var.d(e);
                    r22Var.readFully(new byte[min]);
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
        t22 t22Var = (t22) hashMap.get("ImageLength");
        t22 t22Var2 = (t22) hashMap.get("ImageWidth");
        if (t22Var != null && t22Var2 != null) {
            int e = t22Var.e(this.d);
            int e2 = t22Var2.e(this.d);
            if (e <= 512 && e2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void m(FileInputStream fileInputStream) {
        for (int i = 0; i < s.length; i++) {
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
        r22 r22Var = new r22(bufferedInputStream);
        switch (this.b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case ig7.b /* 6 */:
            case 8:
            case 11:
                i(r22Var);
                break;
            case 4:
                e(r22Var, 0, 0);
                break;
            case 7:
                g(r22Var);
                break;
            case 9:
                h(r22Var);
                break;
            case 10:
                j(r22Var);
                break;
        }
        q(r22Var);
        a();
    }

    public final void n(r22 r22Var, int i) {
        ByteOrder o2 = o(r22Var);
        this.d = o2;
        r22Var.B = o2;
        int readUnsignedShort = r22Var.readUnsignedShort();
        int i2 = this.b;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            f81.y(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = r22Var.readInt();
        if (readInt >= 8 && readInt < i) {
            int i3 = readInt - 8;
            if (i3 > 0 && r22Var.skipBytes(i3) != i3) {
                f81.j(wh1.g(i3, "Couldn't jump to first Ifd: "));
                return;
            }
            return;
        }
        f81.j(wh1.g(readInt, "Invalid first Ifd offset: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.r22 r30, int r31) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a32.p(r22, int):void");
    }

    public final void q(r22 r22Var) {
        t22 t22Var;
        HashMap hashMap = this.c[4];
        t22 t22Var2 = (t22) hashMap.get("Compression");
        if (t22Var2 != null) {
            int e = t22Var2.e(this.d);
            if (e != 1) {
                if (e != 6) {
                    if (e != 7) {
                        return;
                    }
                } else {
                    k(r22Var, hashMap);
                    return;
                }
            }
            t22 t22Var3 = (t22) hashMap.get("BitsPerSample");
            if (t22Var3 != null) {
                int[] iArr = (int[]) t22Var3.g(this.d);
                int[] iArr2 = j;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.b == 3 && (t22Var = (t22) hashMap.get("PhotometricInterpretation")) != null) {
                        int e2 = t22Var.e(this.d);
                        if ((e2 != 1 || !Arrays.equals(iArr, k)) && (e2 != 6 || !Arrays.equals(iArr, iArr2))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                t22 t22Var4 = (t22) hashMap.get("StripOffsets");
                t22 t22Var5 = (t22) hashMap.get("StripByteCounts");
                if (t22Var4 != null && t22Var5 != null) {
                    long[] b = b(t22Var4.g(this.d));
                    long[] b2 = b(t22Var5.g(this.d));
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
                            r22Var.d(i5);
                            int i6 = i + i5;
                            byte[] bArr2 = new byte[i4];
                            r22Var.read(bArr2);
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
        k(r22Var, hashMap);
    }

    public final void r(int i, int i2) {
        HashMap[] hashMapArr = this.c;
        if (!hashMapArr[i].isEmpty() && !hashMapArr[i2].isEmpty()) {
            t22 t22Var = (t22) hashMapArr[i].get("ImageLength");
            t22 t22Var2 = (t22) hashMapArr[i].get("ImageWidth");
            t22 t22Var3 = (t22) hashMapArr[i2].get("ImageLength");
            t22 t22Var4 = (t22) hashMapArr[i2].get("ImageWidth");
            if (t22Var != null && t22Var2 != null && t22Var3 != null && t22Var4 != null) {
                int e = t22Var.e(this.d);
                int e2 = t22Var2.e(this.d);
                int e3 = t22Var3.e(this.d);
                int e4 = t22Var4.e(this.d);
                if (e < e3 && e2 < e4) {
                    HashMap hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    public final void s(r22 r22Var, int i) {
        t22 t22Var;
        t22 c;
        t22 c2;
        HashMap[] hashMapArr = this.c;
        t22 t22Var2 = (t22) hashMapArr[i].get("DefaultCropSize");
        t22 t22Var3 = (t22) hashMapArr[i].get("SensorTopBorder");
        t22 t22Var4 = (t22) hashMapArr[i].get("SensorLeftBorder");
        t22 t22Var5 = (t22) hashMapArr[i].get("SensorBottomBorder");
        t22 t22Var6 = (t22) hashMapArr[i].get("SensorRightBorder");
        if (t22Var2 != null) {
            int i2 = t22Var2.a;
            ByteOrder byteOrder = this.d;
            if (i2 == 5) {
                x22[] x22VarArr = (x22[]) t22Var2.g(byteOrder);
                if (x22VarArr != null && x22VarArr.length == 2) {
                    c = t22.b(x22VarArr[0], this.d);
                    c2 = t22.b(x22VarArr[1], this.d);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(x22VarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) t22Var2.g(byteOrder);
                if (iArr != null && iArr.length == 2) {
                    c = t22.c(iArr[0], this.d);
                    c2 = t22.c(iArr[1], this.d);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i].put("ImageWidth", c);
            hashMapArr[i].put("ImageLength", c2);
        } else if (t22Var3 != null && t22Var4 != null && t22Var5 != null && t22Var6 != null) {
            int e = t22Var3.e(this.d);
            int e2 = t22Var5.e(this.d);
            int e3 = t22Var6.e(this.d);
            int e4 = t22Var4.e(this.d);
            if (e2 > e && e3 > e4) {
                t22 c3 = t22.c(e2 - e, this.d);
                t22 c4 = t22.c(e3 - e4, this.d);
                hashMapArr[i].put("ImageLength", c3);
                hashMapArr[i].put("ImageWidth", c4);
            }
        } else {
            t22 t22Var7 = (t22) hashMapArr[i].get("ImageLength");
            t22 t22Var8 = (t22) hashMapArr[i].get("ImageWidth");
            if ((t22Var7 == null || t22Var8 == null) && (t22Var = (t22) hashMapArr[i].get("JPEGInterchangeFormat")) != null) {
                e(r22Var, t22Var.e(this.d), i);
            }
        }
    }
}
