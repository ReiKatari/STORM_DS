package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.zip.CRC32;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ga5  reason: default package */
/* loaded from: classes.dex */
public final class ga5 {
    public static final ga5 a = new Object();

    public static String a(int i, int i2, int[] iArr) {
        if (i > 0 && i2 > 0 && iArr.length != 0) {
            int i3 = i / 2;
            int i4 = i2 - 1;
            ti4[] ti4VarArr = {new ti4("tl", new ti4(0, 0)), new ti4("tc", new ti4(Integer.valueOf(i3), 0)), new ti4("c", new ti4(Integer.valueOf(i3), Integer.valueOf(i2 / 2))), new ti4("bc", new ti4(Integer.valueOf(i3), Integer.valueOf(i4))), new ti4("br", new ti4(Integer.valueOf(i - 1), Integer.valueOf(i4)))};
            LinkedHashMap linkedHashMap = new LinkedHashMap(zt3.j0(5));
            zt3.p0(linkedHashMap, ti4VarArr);
            Set entrySet = linkedHashMap.entrySet();
            entrySet.getClass();
            return tq0.S0(entrySet, ",", null, null, new p04(i, i2, iArr), 30);
        }
        return "none";
    }

    public static String b(int[] iArr) {
        CRC32 crc32 = new CRC32();
        for (int i : iArr) {
            crc32.update(i & 255);
            crc32.update((i >>> 8) & 255);
            crc32.update((i >>> 16) & 255);
            crc32.update((i >>> 24) & 255);
        }
        return g(crc32.getValue());
    }

    public static String c(int i, int i2, int[] iArr) {
        int i3;
        if (iArr != null && iArr.length != 0) {
            if (i > 0 && i2 > 0) {
                i3 = i * i2;
            } else {
                i3 = -1;
            }
            if (i3 > 0 && i3 == iArr.length) {
                int length = iArr.length;
                return i + "x" + i2 + ":" + length;
            }
            int length2 = iArr.length;
            return i + "x" + i2 + ":" + length2 + ":expected=" + i3;
        }
        return i + "x" + i2 + ":empty";
    }

    public static boolean f(int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            return true;
        }
        return false;
    }

    public static String g(long j) {
        String hexString = Long.toHexString(j & 4294967295L);
        hexString.getClass();
        String H0 = zg6.H0(8, hexString);
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = H0.toUpperCase(locale);
        upperCase.getClass();
        return upperCase;
    }

    public static int h(int[] iArr, int i) {
        int length;
        if (iArr != null && (length = iArr.length) > 0 && i > 0 && length % i == 0) {
            return length / i;
        }
        return 0;
    }

    public static int i(int[] iArr) {
        int length;
        Object obj;
        if (iArr != null && (length = iArr.length) > 0 && length % 49152 == 0) {
            int i = length / 49152;
            Iterator it = new b33(1, 16, 1).iterator();
            while (true) {
                if (((c33) it).L) {
                    obj = ((w23) it).next();
                    int intValue = ((Number) obj).intValue();
                    if (intValue * intValue == i) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Integer num = (Integer) obj;
            if (num != null) {
                return num.intValue() * 256;
            }
            return 0;
        }
        return 0;
    }

    public static void j(String str, String str2, boolean z) {
        String str3;
        if (z) {
            str3 = "begin";
        } else {
            str3 = "end";
        }
        StringBuilder v = b31.v("captureId=", str, " step=", str2, " phase=");
        v.append(str3);
        Log.w("RendererDebugCapture", v.toString());
    }

    public static void k(String str, String str2, int i, int i2, int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 255;
            while (i3 < length) {
                int i10 = iArr[i3];
                int i11 = i10 & 16777215;
                int i12 = length;
                int i13 = (i10 >>> 24) & 255;
                if (i11 != 0) {
                    i4++;
                }
                if (i13 != 0) {
                    i5++;
                }
                if (i13 == 255) {
                    i6++;
                }
                if (i11 == 16711935) {
                    i7++;
                }
                if (i13 < i9) {
                    i9 = i13;
                }
                if (i13 > i8) {
                    i8 = i13;
                }
                i3++;
                length = i12;
            }
            int length2 = iArr.length;
            String b = b(iArr);
            String a2 = a(i, i2, iArr);
            StringBuilder v = b31.v("captureId=", str, " kind=", str2, " size=");
            b31.A(v, i, "x", i2, " pixels=");
            v.append(length2);
            v.append(" crc32=");
            v.append(b);
            v.append(" nonBlack=");
            b31.A(v, i4, " nonTransparent=", i5, " opaque=");
            b31.A(v, i6, " magenta=", i7, " alphaRange=");
            b31.A(v, i9, "-", i8, " samples=");
            v.append(a2);
            Log.w("RendererDebugCapture", v.toString());
            return;
        }
        Log.w("RendererDebugCapture", "captureId=" + str + " kind=" + str2 + " unavailable=1");
    }

    public static void l(File file, String str, String str2, int i, int i2, int[] iArr) {
        if (file != null && iArr != null && i > 0 && i2 > 0 && iArr.length == i * i2) {
            File file2 = new File(file, str + "_" + str2 + ".png");
            try {
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                createBitmap.getClass();
                createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                createBitmap.recycle();
                String absolutePath = file2.getAbsolutePath();
                Log.w("RendererDebugCapture", "captureId=" + str + " kind=" + str2 + " png=" + absolutePath);
            } catch (Exception e) {
                Log.w("RendererDebugCapture", "captureId=" + str + " kind=" + str2 + " png_save_failed=1", e);
            }
        }
    }

    public static void m(File file, String str, String str2) {
        if (file != null && str2 != null) {
            if (zg6.B0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                File file2 = new File(file, str.concat("_softPackedFrameMeta.json"));
                try {
                    q72.O(file2, str2);
                    String absolutePath = file2.getAbsolutePath();
                    Log.w("RendererDebugCapture", "captureId=" + str + " kind=softPackedFrameMeta text=" + absolutePath);
                } catch (Exception e) {
                    Log.w("RendererDebugCapture", "captureId=" + str + " kind=softPackedFrameMeta text_save_failed=1", e);
                }
            }
        }
    }

    public static void n(File file, String str, String str2, int i, int i2, int[] iArr, mi2 mi2Var) {
        if (file != null && iArr != null && iArr.length != 0 && i > 0 && i2 > 0 && iArr.length == i * i2) {
            int[] iArr2 = new int[iArr.length];
            int length = iArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                iArr2[i3] = ((Number) mi2Var.n(Integer.valueOf(iArr[i3]))).intValue();
            }
            l(file, str, str2, i, i2, iArr2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0292 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f3  */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [int] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v87 */
    /* JADX WARN: Type inference failed for: r10v88 */
    /* JADX WARN: Type inference failed for: r12v0, types: [me.magnum.melonds.impl.emulator.debug.RendererDebugBridge] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r56v0, types: [x85] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0230 -> B:98:0x0238). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(me.magnum.melonds.domain.model.VideoRenderer r47, java.io.File r48, java.lang.String r49, int r50, int r51, long r52, java.util.Set r54, int r55, defpackage.x85 r56, defpackage.k11 r57) {
        /*
            Method dump skipped, instructions count: 2266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga5.d(me.magnum.melonds.domain.model.VideoRenderer, java.io.File, java.lang.String, int, int, long, java.util.Set, int, x85, k11):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0244  */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ia5 e(me.magnum.melonds.domain.model.VideoRenderer r78, java.io.File r79, java.lang.String r80, java.util.Set r81) {
        /*
            Method dump skipped, instructions count: 3406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga5.e(me.magnum.melonds.domain.model.VideoRenderer, java.io.File, java.lang.String, java.util.Set):ia5");
    }
}
