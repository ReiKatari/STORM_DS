package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.zip.CRC32;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yj5  reason: default package */
/* loaded from: classes.dex */
public final class yj5 {
    public static final yj5 a = new Object();

    public static String a(int i, int i2, int[] iArr) {
        if (i > 0 && i2 > 0 && iArr.length != 0) {
            int i3 = i / 2;
            int i4 = i2 - 1;
            vr4[] vr4VarArr = {new vr4("tl", new vr4(0, 0)), new vr4("tc", new vr4(Integer.valueOf(i3), 0)), new vr4("c", new vr4(Integer.valueOf(i3), Integer.valueOf(i2 / 2))), new vr4("bc", new vr4(Integer.valueOf(i3), Integer.valueOf(i4))), new vr4("br", new vr4(Integer.valueOf(i - 1), Integer.valueOf(i4)))};
            LinkedHashMap linkedHashMap = new LinkedHashMap(c14.k0(5));
            c14.q0(linkedHashMap, vr4VarArr);
            Set entrySet = linkedHashMap.entrySet();
            entrySet.getClass();
            return gt0.P0(entrySet, ",", null, null, new u84(i, i2, iArr), 30);
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
        String B0 = qs6.B0(8, hexString);
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = B0.toUpperCase(locale);
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
            Iterator it = new j93(1, 16, 1).iterator();
            while (true) {
                if (((k93) it).L) {
                    obj = ((e93) it).next();
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
        StringBuilder u = i61.u("captureId=", str, " step=", str2, " phase=");
        u.append(str3);
        Log.w("RendererDebugCapture", u.toString());
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
            StringBuilder u = i61.u("captureId=", str, " kind=", str2, " size=");
            lb1.x(u, i, "x", i2, " pixels=");
            u.append(length2);
            u.append(" crc32=");
            u.append(b);
            u.append(" nonBlack=");
            lb1.x(u, i4, " nonTransparent=", i5, " opaque=");
            lb1.x(u, i6, " magenta=", i7, " alphaRange=");
            lb1.x(u, i9, "-", i8, " samples=");
            u.append(a2);
            Log.w("RendererDebugCapture", u.toString());
            return;
        }
        Log.w("RendererDebugCapture", lb1.n("captureId=", str, " kind=", str2, " unavailable=1"));
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
                Log.w("RendererDebugCapture", lb1.n("captureId=", str, " kind=", str2, " png_save_failed=1"), e);
            }
        }
    }

    public static void m(File file, String str, String str2) {
        if (file != null && str2 != null) {
            if (qs6.v0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                File file2 = new File(file, str.concat("_softPackedFrameMeta.json"));
                try {
                    jc2.F0(file2, str2);
                    String absolutePath = file2.getAbsolutePath();
                    Log.w("RendererDebugCapture", "captureId=" + str + " kind=softPackedFrameMeta text=" + absolutePath);
                } catch (Exception e) {
                    Log.w("RendererDebugCapture", "captureId=" + str + " kind=softPackedFrameMeta text_save_failed=1", e);
                }
            }
        }
    }

    public static void n(File file, String str, String str2, int i, int i2, int[] iArr, qn2 qn2Var) {
        if (file != null && iArr != null && iArr.length != 0 && i > 0 && i2 > 0 && iArr.length == i * i2) {
            int[] iArr2 = new int[iArr.length];
            int length = iArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                iArr2[i3] = ((Number) qn2Var.g(Integer.valueOf(iArr[i3]))).intValue();
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
    /* JADX WARN: Type inference failed for: r4v30, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r56v0, types: [mi5] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0230 -> B:98:0x0238). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(VideoRenderer videoRenderer, File file, String str, int i, int i2, long j, Set set, int i3, mi5 mi5Var, s41 s41Var) {
        wj5 wj5Var;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        Set set2;
        File file2;
        VideoRenderer videoRenderer2;
        String str2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        File file3;
        int i13;
        Set set3;
        long j2;
        int i14;
        File file4;
        File file5;
        int i15;
        long j3;
        long j4;
        int i16;
        int i17;
        x61 x61Var;
        Set set4;
        int i18;
        long j5;
        int i19;
        int i20;
        File file6;
        int i21;
        int i22;
        long j6;
        int[] denseScreenBurstScheduleStats;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int denseScreenBurstCaptureFrameCount;
        int i29;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        VideoRenderer videoRenderer3;
        String str3;
        int i30;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        kw3 kw3Var;
        vj5 vj5Var;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        String str4;
        int[] iArr12;
        int[] iArr13;
        int[] iArr14;
        int[] iArr15;
        int[] iArr16;
        int[] iArr17;
        File file7;
        int[] iArr18;
        String str5;
        vj5 vj5Var2;
        int[] iArr19;
        String str6;
        File file8;
        vj5 vj5Var3;
        int[] iArr20;
        vj5 vj5Var4;
        int[] iArr21;
        vj5 vj5Var5;
        File file9;
        vj5 vj5Var6;
        String str7;
        vj5 vj5Var7;
        int[] iArr22;
        String str8;
        vj5 vj5Var8;
        int[] iArr23;
        File file10;
        String str9;
        int[] iArr24;
        int i31;
        int[] iArr25;
        int i32;
        int[] iArr26;
        int i33;
        int[] iArr27;
        int[] iArr28;
        int[] iArr29;
        int[] iArr30;
        int[] iArr31;
        int[] iArr32;
        int[] iArr33;
        int[] iArr34;
        String str10;
        int[] iArr35;
        int[] iArr36;
        String str11;
        int[] iArr37;
        vj5 vj5Var9;
        int[] iArr38;
        int[] iArr39;
        int[] iArr40;
        ?? r4;
        int i34;
        int i35;
        Integer I0;
        Integer I02;
        Integer I03;
        Integer I04;
        Integer I05;
        if (s41Var instanceof wj5) {
            wj5Var = (wj5) s41Var;
            int i36 = wj5Var.p0;
            if ((i36 & Integer.MIN_VALUE) != 0) {
                wj5Var.p0 = i36 - Integer.MIN_VALUE;
                Object obj = wj5Var.n0;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                i4 = wj5Var.p0;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            long j7 = wj5Var.m0;
                            j3 = wj5Var.l0;
                            i16 = wj5Var.j0;
                            int i37 = wj5Var.i0;
                            int i38 = wj5Var.h0;
                            int i39 = wj5Var.g0;
                            int i40 = wj5Var.f0;
                            iArr = null;
                            long j8 = wj5Var.k0;
                            i19 = wj5Var.e0;
                            i20 = wj5Var.d0;
                            file6 = wj5Var.Z;
                            Set set5 = wj5Var.Y;
                            String str12 = wj5Var.X;
                            VideoRenderer videoRenderer4 = wj5Var.R;
                            oi2.Y(obj);
                            i22 = i37;
                            j4 = j7;
                            long j9 = j8;
                            i21 = i38;
                            videoRenderer2 = videoRenderer4;
                            str2 = str12;
                            x61 x61Var3 = x61Var2;
                            i18 = i39;
                            Set set6 = set5;
                            set4 = set6;
                            i17 = i40;
                            j5 = j9;
                            x61Var = x61Var3;
                            j6 = j4;
                            if (System.nanoTime() >= j6 && !RendererDebugBridge.INSTANCE.isDenseScreenBurstCaptureComplete()) {
                                wj5Var.R = videoRenderer2;
                                wj5Var.X = str2;
                                wj5Var.Y = set4;
                                wj5Var.Z = file6;
                                wj5Var.d0 = i20;
                                wj5Var.e0 = i19;
                                wj5Var.k0 = j5;
                                wj5Var.f0 = i17;
                                wj5Var.g0 = i18;
                                wj5Var.h0 = i21;
                                wj5Var.i0 = i22;
                                wj5Var.j0 = i16;
                                wj5Var.l0 = j3;
                                int i41 = i17;
                                wj5Var.m0 = j6;
                                j4 = j6;
                                wj5Var.p0 = 2;
                                x61Var3 = x61Var;
                                if (q60.t(8L, wj5Var) == x61Var3) {
                                    return x61Var3;
                                }
                                i40 = i41;
                                j9 = j5;
                                set6 = set4;
                                set4 = set6;
                                i17 = i40;
                                j5 = j9;
                                x61Var = x61Var3;
                                j6 = j4;
                                if (System.nanoTime() >= j6) {
                                }
                                RendererDebugBridge rendererDebugBridge = RendererDebugBridge.INSTANCE;
                                denseScreenBurstScheduleStats = rendererDebugBridge.getDenseScreenBurstScheduleStats();
                                i23 = -1;
                                if (denseScreenBurstScheduleStats == null) {
                                }
                                i24 = -1;
                                if (denseScreenBurstScheduleStats == null) {
                                }
                                i25 = -1;
                                if (denseScreenBurstScheduleStats == null) {
                                }
                                i26 = -1;
                                if (denseScreenBurstScheduleStats == null) {
                                }
                                i27 = -1;
                                int i42 = 4;
                                if (denseScreenBurstScheduleStats != null) {
                                    i23 = I0.intValue();
                                }
                                if (i24 != i22) {
                                }
                                i28 = 0;
                                boolean isDenseScreenBurstCaptureComplete = rendererDebugBridge.isDenseScreenBurstCaptureComplete();
                                String str13 = "captureId=";
                                StringBuilder sb = new StringBuilder("captureId=");
                                sb.append(str2);
                                sb.append(" source=dense_burst stage=summary requestedWarmupFrames=");
                                sb.append(i24);
                                sb.append(" observedWarmupFrames=");
                                lb1.x(sb, i25, " eligibleCallbacks=", i26, " firstCaptureOrdinal=");
                                lb1.x(sb, i27, " lastCaptureOrdinal=", i23, " warmupSatisfied=");
                                sb.append(i28);
                                sb.append(" complete=");
                                sb.append(isDenseScreenBurstCaptureComplete ? 1 : 0);
                                String str14 = "RendererDebugCapture";
                                Log.w("RendererDebugCapture", sb.toString());
                                denseScreenBurstCaptureFrameCount = rendererDebugBridge.getDenseScreenBurstCaptureFrameCount();
                                if (denseScreenBurstCaptureFrameCount <= i18) {
                                }
                                kw3 I = hf.I();
                                i29 = 0;
                                while (i29 < i18) {
                                }
                                kw3 A = hf.A(I);
                                RendererDebugBridge.INSTANCE.clearDenseScreenBurstCapture();
                                return A;
                            }
                            RendererDebugBridge rendererDebugBridge2 = RendererDebugBridge.INSTANCE;
                            denseScreenBurstScheduleStats = rendererDebugBridge2.getDenseScreenBurstScheduleStats();
                            i23 = -1;
                            if (denseScreenBurstScheduleStats == null && (I05 = fv.I0(denseScreenBurstScheduleStats, 0)) != null) {
                                i24 = I05.intValue();
                            } else {
                                i24 = -1;
                            }
                            if (denseScreenBurstScheduleStats == null && (I04 = fv.I0(denseScreenBurstScheduleStats, 1)) != null) {
                                i25 = I04.intValue();
                            } else {
                                i25 = -1;
                            }
                            if (denseScreenBurstScheduleStats == null && (I03 = fv.I0(denseScreenBurstScheduleStats, 2)) != null) {
                                i26 = I03.intValue();
                            } else {
                                i26 = -1;
                            }
                            if (denseScreenBurstScheduleStats == null && (I02 = fv.I0(denseScreenBurstScheduleStats, 3)) != null) {
                                i27 = I02.intValue();
                            } else {
                                i27 = -1;
                            }
                            int i422 = 4;
                            if (denseScreenBurstScheduleStats != null && (I0 = fv.I0(denseScreenBurstScheduleStats, 4)) != null) {
                                i23 = I0.intValue();
                            }
                            if (i24 != i22 && i25 >= i22) {
                                i28 = 1;
                            } else {
                                i28 = 0;
                            }
                            boolean isDenseScreenBurstCaptureComplete2 = rendererDebugBridge2.isDenseScreenBurstCaptureComplete();
                            String str132 = "captureId=";
                            StringBuilder sb2 = new StringBuilder("captureId=");
                            sb2.append(str2);
                            sb2.append(" source=dense_burst stage=summary requestedWarmupFrames=");
                            sb2.append(i24);
                            sb2.append(" observedWarmupFrames=");
                            lb1.x(sb2, i25, " eligibleCallbacks=", i26, " firstCaptureOrdinal=");
                            lb1.x(sb2, i27, " lastCaptureOrdinal=", i23, " warmupSatisfied=");
                            sb2.append(i28);
                            sb2.append(" complete=");
                            sb2.append(isDenseScreenBurstCaptureComplete2 ? 1 : 0);
                            String str142 = "RendererDebugCapture";
                            Log.w("RendererDebugCapture", sb2.toString());
                            denseScreenBurstCaptureFrameCount = rendererDebugBridge2.getDenseScreenBurstCaptureFrameCount();
                            if (denseScreenBurstCaptureFrameCount <= i18) {
                                i18 = denseScreenBurstCaptureFrameCount;
                            }
                            kw3 I2 = hf.I();
                            i29 = 0;
                            while (i29 < i18) {
                                String m = lb1.m(str2, "_frame_", qs6.B0(i422, String.valueOf(i29)));
                                RendererDebugBridge rendererDebugBridge3 = RendererDebugBridge.INSTANCE;
                                int denseScreenBurstCaptureFrameId = rendererDebugBridge3.getDenseScreenBurstCaptureFrameId(i29);
                                boolean isCurrentFrameReadyForDebug = rendererDebugBridge3.isCurrentFrameReadyForDebug();
                                vj5 vj5Var10 = vj5.SCREEN_FRAME;
                                Set set7 = set4;
                                if (set7.contains(vj5Var10)) {
                                    iArr2 = rendererDebugBridge3.getDenseScreenBurstCaptureFrame(i29);
                                } else {
                                    iArr2 = iArr;
                                }
                                vj5 vj5Var11 = vj5.PACKED_TOP_PRIMARY;
                                if (set7.contains(vj5Var11)) {
                                    iArr3 = rendererDebugBridge3.getDenseScreenBurstPackedTopFrame(i29);
                                } else {
                                    iArr3 = iArr;
                                }
                                int i43 = i18;
                                vj5 vj5Var12 = vj5.PACKED_BOTTOM_PRIMARY;
                                if (set7.contains(vj5Var12)) {
                                    iArr4 = rendererDebugBridge3.getDenseScreenBurstPackedBottomFrame(i29);
                                } else {
                                    iArr4 = iArr;
                                }
                                File file11 = file6;
                                vj5 vj5Var13 = vj5.PACKED_TOP_PLANE1;
                                if (set7.contains(vj5Var13)) {
                                    videoRenderer3 = videoRenderer2;
                                    str3 = str2;
                                    i30 = 0;
                                    iArr5 = rendererDebugBridge3.getDenseScreenBurstPackedPlaneFrame(i29, 0, 1);
                                } else {
                                    videoRenderer3 = videoRenderer2;
                                    str3 = str2;
                                    i30 = 0;
                                    iArr5 = iArr;
                                }
                                vj5 vj5Var14 = vj5.PACKED_TOP_CONTROL;
                                if (set7.contains(vj5Var14)) {
                                    iArr6 = iArr2;
                                    iArr7 = rendererDebugBridge3.getDenseScreenBurstPackedPlaneFrame(i29, i30, 2);
                                } else {
                                    iArr6 = iArr2;
                                    iArr7 = iArr;
                                }
                                vj5 vj5Var15 = vj5.PACKED_BOTTOM_PLANE1;
                                if (set7.contains(vj5Var15)) {
                                    iArr8 = rendererDebugBridge3.getDenseScreenBurstPackedPlaneFrame(i29, 1, 1);
                                } else {
                                    iArr8 = iArr;
                                }
                                vj5 vj5Var16 = vj5.PACKED_BOTTOM_CONTROL;
                                if (set7.contains(vj5Var16)) {
                                    kw3Var = I2;
                                    vj5Var = vj5Var16;
                                    iArr9 = rendererDebugBridge3.getDenseScreenBurstPackedPlaneFrame(i29, 1, 2);
                                } else {
                                    kw3Var = I2;
                                    vj5Var = vj5Var16;
                                    iArr9 = iArr;
                                }
                                vj5 vj5Var17 = vj5.CAPTURE3D_SOURCE_DS_FRAME;
                                if (set7.contains(vj5Var17)) {
                                    iArr10 = rendererDebugBridge3.getDenseScreenBurstCapture3dSourceFrame(i29);
                                } else {
                                    iArr10 = iArr;
                                }
                                vj5 vj5Var18 = vj5.CAPTURE_LINE_USES_3D_MASK;
                                if (set7.contains(vj5Var18)) {
                                    iArr11 = rendererDebugBridge3.getDenseScreenBurstCaptureLineUses3dMaskFrame(i29);
                                } else {
                                    iArr11 = iArr;
                                }
                                vj5 vj5Var19 = vj5.SOFT_PACKED_FRAME_META_JSON;
                                if (set7.contains(vj5Var19)) {
                                    str4 = rendererDebugBridge3.getDenseScreenBurstSoftPackedFrameMetaJson(i29);
                                } else {
                                    str4 = iArr;
                                }
                                vj5 vj5Var20 = vj5.RENDERER3D_FRAME;
                                if (set7.contains(vj5Var20)) {
                                    iArr12 = rendererDebugBridge3.getDenseScreenBurstRenderer3dFrame(i29);
                                } else {
                                    iArr12 = iArr;
                                }
                                vj5 vj5Var21 = vj5.RENDERER3D_CAPTURE_FRAME;
                                if (set7.contains(vj5Var21)) {
                                    iArr13 = rendererDebugBridge3.getDenseScreenBurstRenderer3dCaptureFrame(i29);
                                } else {
                                    iArr13 = iArr;
                                }
                                int i44 = i29;
                                String name = videoRenderer3.name();
                                int[] iArr41 = iArr13;
                                Locale locale = Locale.US;
                                locale.getClass();
                                String lowerCase = name.toLowerCase(locale);
                                lowerCase.getClass();
                                String P0 = gt0.P0(set7, ",", null, null, new dv4(21), 30);
                                StringBuilder u = i61.u(str132, m, " stage=begin configuredRenderer=", lowerCase, " frameId=");
                                lb1.x(u, denseScreenBurstCaptureFrameId, " frameReady=", isCurrentFrameReadyForDebug ? 1 : 0, " freezeSnapshot=0 kinds=");
                                u.append(P0);
                                u.append(" source=dense_burst");
                                Log.w(str142, u.toString());
                                if (set7.contains(vj5Var10)) {
                                    l(file11, m, "screenFrame", 256, RendererDebugBridge.CAPTURE_HEIGHT, iArr6);
                                }
                                int[] iArr42 = iArr6;
                                if (set7.contains(vj5Var11)) {
                                    int[] iArr43 = iArr3;
                                    l(file11, m, "packedTopPrimary", 256, 192, iArr43);
                                    iArr14 = iArr43;
                                } else {
                                    iArr14 = iArr3;
                                }
                                if (set7.contains(vj5Var12)) {
                                    int[] iArr44 = iArr4;
                                    l(file11, m, "packedBottomPrimary", 256, 192, iArr44);
                                    iArr15 = iArr44;
                                } else {
                                    iArr15 = iArr4;
                                }
                                if (set7.contains(vj5Var13)) {
                                    int[] iArr45 = iArr5;
                                    l(file11, m, "packedTopPlane1", 256, 192, iArr45);
                                    iArr16 = iArr45;
                                } else {
                                    iArr16 = iArr5;
                                }
                                if (set7.contains(vj5Var14)) {
                                    int[] iArr46 = iArr7;
                                    l(file11, m, "packedTopControl", 256, 192, iArr46);
                                    iArr17 = iArr46;
                                } else {
                                    iArr17 = iArr7;
                                }
                                if (set7.contains(vj5Var15)) {
                                    file7 = file11;
                                    str5 = m;
                                    int[] iArr47 = iArr8;
                                    l(file7, str5, "packedBottomPlane1", 256, 192, iArr47);
                                    iArr18 = iArr47;
                                } else {
                                    file7 = file11;
                                    iArr18 = iArr8;
                                    str5 = m;
                                }
                                vj5 vj5Var22 = vj5Var;
                                if (set7.contains(vj5Var22)) {
                                    int[] iArr48 = iArr9;
                                    l(file7, str5, "packedBottomControl", 256, 192, iArr48);
                                    vj5Var2 = vj5Var22;
                                    iArr19 = iArr48;
                                    file8 = file7;
                                    str6 = str5;
                                } else {
                                    vj5Var2 = vj5Var22;
                                    iArr19 = iArr9;
                                    str6 = str5;
                                    file8 = file7;
                                }
                                if (set7.contains(vj5Var17)) {
                                    int[] iArr49 = iArr10;
                                    l(file8, str6, "capture3dSourceDsFrame", 256, 192, iArr49);
                                    vj5Var3 = vj5Var17;
                                    iArr20 = iArr49;
                                } else {
                                    vj5Var3 = vj5Var17;
                                    iArr20 = iArr10;
                                }
                                if (set7.contains(vj5Var18)) {
                                    int[] iArr50 = iArr11;
                                    l(file8, str6, "captureLineUses3dMask", 256, 192, iArr50);
                                    vj5Var4 = vj5Var18;
                                    iArr21 = iArr50;
                                } else {
                                    vj5Var4 = vj5Var18;
                                    iArr21 = iArr11;
                                }
                                if (set7.contains(vj5Var21)) {
                                    File file12 = file8;
                                    String str15 = str6;
                                    l(file12, str15, "renderer3dCaptureFrame", 256, 192, iArr41);
                                    vj5Var6 = vj5Var12;
                                    vj5Var7 = vj5Var11;
                                    vj5Var5 = vj5Var21;
                                    file9 = file12;
                                    str7 = str15;
                                    iArr22 = iArr41;
                                } else {
                                    vj5Var5 = vj5Var21;
                                    file9 = file8;
                                    vj5Var6 = vj5Var12;
                                    str7 = str6;
                                    vj5Var7 = vj5Var11;
                                    iArr22 = iArr41;
                                }
                                if (set7.contains(vj5Var19)) {
                                    vj5Var8 = vj5Var19;
                                    ?? r8 = str4;
                                    m(file9, str7, r8);
                                    if (r8 != 0 && !qs6.v0(r8)) {
                                        i34 = 0;
                                    } else {
                                        i34 = 1;
                                    }
                                    String str16 = r8;
                                    int i45 = i34 ^ 1;
                                    if (str16 != null) {
                                        file10 = file9;
                                        i35 = str16.length();
                                    } else {
                                        file10 = file9;
                                        i35 = 0;
                                    }
                                    iArr23 = iArr22;
                                    StringBuilder sb3 = new StringBuilder(str132);
                                    sb3.append(str7);
                                    str8 = str7;
                                    sb3.append(" kind=softPackedFrameMetaJson available=");
                                    sb3.append(i45);
                                    sb3.append(" length=");
                                    sb3.append(i35);
                                    Log.w(str142, sb3.toString());
                                    str9 = str16;
                                } else {
                                    str8 = str7;
                                    vj5Var8 = vj5Var19;
                                    iArr23 = iArr22;
                                    file10 = file9;
                                    str9 = str4;
                                }
                                if (set7.contains(vj5Var20)) {
                                    int i46 = i(iArr12);
                                    iArr24 = iArr12;
                                    l(file10, str8, "renderer3dFrame", i46, h(iArr24, i46), iArr24);
                                } else {
                                    iArr24 = iArr12;
                                }
                                String str17 = str8;
                                String c = c(256, RendererDebugBridge.CAPTURE_HEIGHT, iArr42);
                                String c2 = c(256, 192, iArr14);
                                int[] iArr51 = iArr14;
                                String c3 = c(256, 192, iArr15);
                                int[] iArr52 = iArr15;
                                String c4 = c(256, 192, iArr16);
                                int[] iArr53 = iArr16;
                                String c5 = c(256, 192, iArr17);
                                int[] iArr54 = iArr17;
                                String c6 = c(256, 192, iArr18);
                                int[] iArr55 = iArr18;
                                String c7 = c(256, 192, iArr19);
                                int[] iArr56 = iArr19;
                                String c8 = c(256, 192, iArr20);
                                int[] iArr57 = iArr20;
                                String c9 = c(256, 192, iArr21);
                                if (str9 != 0 && !qs6.v0(str9)) {
                                    i31 = 0;
                                } else {
                                    i31 = 1;
                                }
                                int i47 = i31 ^ 1;
                                int[] iArr58 = iArr21;
                                String c10 = c(i(iArr24), h(iArr24, i(iArr24)), iArr24);
                                int[] iArr59 = iArr24;
                                int[] iArr60 = iArr23;
                                String str18 = str142;
                                String c11 = c(256, 192, iArr60);
                                StringBuilder u2 = i61.u(str132, str17, " kind=meta screen=", c, " packedTop=");
                                i61.B(u2, c2, " packedBottom=", c3, " packedTopPlane1=");
                                i61.B(u2, c4, " packedTopControl=", c5, " packedBottomPlane1=");
                                i61.B(u2, c6, " packedBottomControl=", c7, " capture3dSource=");
                                i61.B(u2, c8, " captureLineMask=", c9, " softPackedMeta=");
                                u2.append(i47);
                                u2.append(" renderer3d=");
                                u2.append(c10);
                                u2.append(" renderer3dCapture=");
                                u2.append(c11);
                                u2.append(" depth=0x0:empty attr=0x0:empty coverage=0x0:empty");
                                Log.w(str18, u2.toString());
                                if (set7.contains(vj5Var10)) {
                                    iArr25 = iArr42;
                                    i32 = 256;
                                    k(str17, "screenFrame", 256, RendererDebugBridge.CAPTURE_HEIGHT, iArr25);
                                } else {
                                    iArr25 = iArr42;
                                    i32 = 256;
                                }
                                vj5 vj5Var23 = vj5Var7;
                                if (set7.contains(vj5Var23)) {
                                    iArr26 = iArr51;
                                    i33 = 192;
                                    k(str17, "packedTopPrimary", i32, 192, iArr26);
                                } else {
                                    iArr26 = iArr51;
                                    i33 = 192;
                                }
                                vj5 vj5Var24 = vj5Var6;
                                if (set7.contains(vj5Var24)) {
                                    iArr27 = iArr52;
                                    k(str17, "packedBottomPrimary", i32, i33, iArr27);
                                } else {
                                    iArr27 = iArr52;
                                }
                                if (set7.contains(vj5Var13)) {
                                    iArr28 = iArr53;
                                    k(str17, "packedTopPlane1", i32, i33, iArr28);
                                } else {
                                    iArr28 = iArr53;
                                }
                                int[] iArr61 = iArr25;
                                if (set7.contains(vj5Var14)) {
                                    iArr29 = iArr26;
                                    iArr30 = iArr54;
                                    k(str17, "packedTopControl", i32, i33, iArr30);
                                } else {
                                    iArr29 = iArr26;
                                    iArr30 = iArr54;
                                }
                                int[] iArr62 = iArr30;
                                if (set7.contains(vj5Var15)) {
                                    iArr31 = iArr27;
                                    iArr32 = iArr55;
                                    k(str17, "packedBottomPlane1", i32, i33, iArr32);
                                } else {
                                    iArr31 = iArr27;
                                    iArr32 = iArr55;
                                }
                                vj5 vj5Var25 = vj5Var2;
                                int[] iArr63 = iArr32;
                                if (set7.contains(vj5Var25)) {
                                    iArr33 = iArr28;
                                    iArr34 = iArr56;
                                    k(str17, "packedBottomControl", i32, i33, iArr34);
                                } else {
                                    iArr33 = iArr28;
                                    iArr34 = iArr56;
                                }
                                vj5 vj5Var26 = vj5Var3;
                                if (set7.contains(vj5Var26)) {
                                    iArr35 = iArr34;
                                    str10 = str18;
                                    iArr36 = iArr57;
                                    k(str17, "capture3dSourceDsFrame", i32, i33, iArr36);
                                } else {
                                    str10 = str18;
                                    iArr35 = iArr34;
                                    iArr36 = iArr57;
                                }
                                vj5 vj5Var27 = vj5Var4;
                                int[] iArr64 = iArr36;
                                if (set7.contains(vj5Var27)) {
                                    str11 = str132;
                                    iArr37 = iArr58;
                                    k(str17, "captureLineUses3dMask", i32, i33, iArr37);
                                } else {
                                    str11 = str132;
                                    iArr37 = iArr58;
                                }
                                if (set7.contains(vj5Var20)) {
                                    int i48 = i(iArr59);
                                    vj5Var9 = vj5Var20;
                                    iArr38 = iArr37;
                                    iArr39 = iArr59;
                                    k(str17, "renderer3dFrame", i48, h(iArr39, i48), iArr39);
                                } else {
                                    vj5Var9 = vj5Var20;
                                    iArr38 = iArr37;
                                    iArr39 = iArr59;
                                }
                                vj5 vj5Var28 = vj5Var5;
                                if (set7.contains(vj5Var28)) {
                                    iArr40 = iArr39;
                                    k(str17, "renderer3dCaptureFrame", 256, 192, iArr60);
                                } else {
                                    iArr40 = iArr39;
                                }
                                if ((set7.contains(vj5Var10) && !f(iArr61)) || ((set7.contains(vj5Var23) && !f(iArr29)) || ((set7.contains(vj5Var24) && !f(iArr31)) || ((set7.contains(vj5Var13) && !f(iArr33)) || ((set7.contains(vj5Var14) && !f(iArr62)) || ((set7.contains(vj5Var15) && !f(iArr63)) || ((set7.contains(vj5Var25) && !f(iArr35)) || ((set7.contains(vj5Var26) && !f(iArr64)) || ((set7.contains(vj5Var27) && !f(iArr38)) || ((set7.contains(vj5Var8) && (str9 == 0 || qs6.v0(str9))) || ((set7.contains(vj5Var9) && !f(iArr40)) || (set7.contains(vj5Var28) && !f(iArr60))))))))))))) {
                                    r4 = 0;
                                } else {
                                    r4 = 1;
                                }
                                String str19 = str11;
                                str142 = str10;
                                Log.w(str142, str19 + str17 + " stage=end success=" + r4);
                                file6 = file10;
                                kw3 kw3Var2 = kw3Var;
                                kw3Var2.add(new ak5(file6, str17, r4));
                                i29 = i44 + 1;
                                I2 = kw3Var2;
                                str132 = str19;
                                set4 = set7;
                                i18 = i43;
                                videoRenderer2 = videoRenderer3;
                                str2 = str3;
                                i422 = 4;
                            }
                            kw3 A2 = hf.A(I2);
                            RendererDebugBridge.INSTANCE.clearDenseScreenBurstCapture();
                            return A2;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iArr = null;
                    i9 = wj5Var.j0;
                    i12 = wj5Var.i0;
                    i14 = wj5Var.h0;
                    i8 = wj5Var.g0;
                    i11 = wj5Var.f0;
                    j2 = wj5Var.k0;
                    i10 = wj5Var.e0;
                    i13 = wj5Var.d0;
                    File file13 = wj5Var.Z;
                    String str20 = wj5Var.X;
                    VideoRenderer videoRenderer5 = wj5Var.R;
                    oi2.Y(obj);
                    set3 = wj5Var.Y;
                    str2 = str20;
                    file4 = file13;
                    videoRenderer2 = videoRenderer5;
                } else {
                    iArr = null;
                    oi2.Y(obj);
                    if (i < 1) {
                        i5 = 1;
                    } else {
                        i5 = i;
                    }
                    if (i2 < 1) {
                        i6 = 1;
                    } else {
                        i6 = i2;
                    }
                    if (i3 < 0) {
                        i7 = 0;
                    } else {
                        i7 = i3;
                    }
                    if (set.isEmpty()) {
                        set2 = ii2.R(vj5.SCREEN_FRAME);
                    } else {
                        set2 = set;
                    }
                    boolean contains = set2.contains(vj5.SCREEN_FRAME);
                    if (set2.contains(vj5.PACKED_TOP_PRIMARY)) {
                        contains |= true;
                    }
                    boolean z = contains;
                    if (set2.contains(vj5.PACKED_BOTTOM_PRIMARY)) {
                        z = (contains ? 1 : 0) | true;
                    }
                    boolean z2 = z;
                    if (set2.contains(vj5.RENDERER3D_CAPTURE_FRAME)) {
                        z2 = (z ? 1 : 0) | true;
                    }
                    boolean z3 = z2;
                    if (set2.contains(vj5.PACKED_TOP_PLANE1)) {
                        z3 = (z2 ? 1 : 0) | true;
                    }
                    boolean z4 = z3;
                    if (set2.contains(vj5.PACKED_TOP_CONTROL)) {
                        z4 = (z3 ? 1 : 0) | true;
                    }
                    boolean z5 = z4;
                    if (set2.contains(vj5.PACKED_BOTTOM_PLANE1)) {
                        z5 = (z4 ? 1 : 0) | true;
                    }
                    boolean z6 = z5;
                    if (set2.contains(vj5.PACKED_BOTTOM_CONTROL)) {
                        z6 = (z5 ? 1 : 0) | true;
                    }
                    boolean z7 = z6;
                    if (set2.contains(vj5.CAPTURE3D_SOURCE_DS_FRAME)) {
                        z7 = (z6 ? 1 : 0) | true;
                    }
                    boolean z8 = z7;
                    if (set2.contains(vj5.CAPTURE_LINE_USES_3D_MASK)) {
                        z8 = (z7 ? 1 : 0) | true;
                    }
                    boolean z9 = z8;
                    if (set2.contains(vj5.SOFT_PACKED_FRAME_META_JSON)) {
                        z9 = (z8 ? 1 : 0) | true;
                    }
                    ?? r10 = z9;
                    if (set2.contains(vj5.RENDERER3D_FRAME)) {
                        r10 = (z9 ? 1 : 0) | true;
                    }
                    if (r10 == 0) {
                        r10 = 1;
                    }
                    if (file == null || (!file.exists() && !file.mkdirs())) {
                        file2 = null;
                    } else {
                        file2 = file;
                    }
                    ?? r12 = RendererDebugBridge.INSTANCE;
                    r12.clearPreparedRendererSnapshot();
                    r12.clearDenseScreenBurstCapture();
                    r12.startDenseScreenBurstCapture(i5, i6, i7, r10);
                    videoRenderer2 = videoRenderer;
                    if (mi5Var != 0) {
                        wj5Var.R = videoRenderer2;
                        str2 = str;
                        wj5Var.X = str2;
                        wj5Var.Y = set2;
                        wj5Var.Z = file2;
                        wj5Var.d0 = i;
                        wj5Var.e0 = i2;
                        wj5Var.k0 = j;
                        wj5Var.f0 = i3;
                        wj5Var.g0 = i5;
                        wj5Var.h0 = i6;
                        wj5Var.i0 = i7;
                        wj5Var.j0 = r10;
                        wj5Var.p0 = 1;
                        mi5Var.g(wj5Var);
                        if (jg7.a == x61Var2) {
                            return x61Var2;
                        }
                        i8 = i5;
                        i9 = r10;
                        i10 = i2;
                        i11 = i3;
                        i14 = i6;
                        i12 = i7;
                        file4 = file2;
                        i13 = i;
                        set3 = set2;
                        j2 = j;
                    } else {
                        str2 = str;
                        i8 = i5;
                        i9 = r10;
                        i10 = i2;
                        i11 = i3;
                        i12 = i7;
                        file3 = file2;
                        i13 = i;
                        set3 = set2;
                        j2 = j;
                        if (i12 > 0) {
                            file5 = file3;
                            i15 = i8;
                            j3 = ((i12 * 1000) / 24) + 5000;
                        } else {
                            file5 = file3;
                            i15 = i8;
                            j3 = 0;
                        }
                        long nanoTime = System.nanoTime();
                        long j10 = 1;
                        if (j2 >= 1) {
                            j10 = j2;
                        }
                        j4 = ((j10 + j3) * 1000000) + nanoTime;
                        int i49 = i11;
                        i16 = i9;
                        i17 = i49;
                        x61Var = x61Var2;
                        set4 = set3;
                        i18 = i15;
                        j5 = j2;
                        i19 = i10;
                        i20 = i13;
                        file6 = file5;
                        i21 = i6;
                        i22 = i12;
                        j6 = j4;
                        if (System.nanoTime() >= j6) {
                        }
                        RendererDebugBridge rendererDebugBridge22 = RendererDebugBridge.INSTANCE;
                        denseScreenBurstScheduleStats = rendererDebugBridge22.getDenseScreenBurstScheduleStats();
                        i23 = -1;
                        if (denseScreenBurstScheduleStats == null) {
                        }
                        i24 = -1;
                        if (denseScreenBurstScheduleStats == null) {
                        }
                        i25 = -1;
                        if (denseScreenBurstScheduleStats == null) {
                        }
                        i26 = -1;
                        if (denseScreenBurstScheduleStats == null) {
                        }
                        i27 = -1;
                        int i4222 = 4;
                        if (denseScreenBurstScheduleStats != null) {
                        }
                        if (i24 != i22) {
                        }
                        i28 = 0;
                        boolean isDenseScreenBurstCaptureComplete22 = rendererDebugBridge22.isDenseScreenBurstCaptureComplete();
                        String str1322 = "captureId=";
                        StringBuilder sb22 = new StringBuilder("captureId=");
                        sb22.append(str2);
                        sb22.append(" source=dense_burst stage=summary requestedWarmupFrames=");
                        sb22.append(i24);
                        sb22.append(" observedWarmupFrames=");
                        lb1.x(sb22, i25, " eligibleCallbacks=", i26, " firstCaptureOrdinal=");
                        lb1.x(sb22, i27, " lastCaptureOrdinal=", i23, " warmupSatisfied=");
                        sb22.append(i28);
                        sb22.append(" complete=");
                        sb22.append(isDenseScreenBurstCaptureComplete22 ? 1 : 0);
                        String str1422 = "RendererDebugCapture";
                        Log.w("RendererDebugCapture", sb22.toString());
                        denseScreenBurstCaptureFrameCount = rendererDebugBridge22.getDenseScreenBurstCaptureFrameCount();
                        if (denseScreenBurstCaptureFrameCount <= i18) {
                        }
                        kw3 I22 = hf.I();
                        i29 = 0;
                        while (i29 < i18) {
                        }
                        kw3 A22 = hf.A(I22);
                        RendererDebugBridge.INSTANCE.clearDenseScreenBurstCapture();
                        return A22;
                    }
                }
                File file14 = file4;
                i6 = i14;
                file3 = file14;
                if (i12 > 0) {
                }
                long nanoTime2 = System.nanoTime();
                long j102 = 1;
                if (j2 >= 1) {
                }
                j4 = ((j102 + j3) * 1000000) + nanoTime2;
                int i492 = i11;
                i16 = i9;
                i17 = i492;
                x61Var = x61Var2;
                set4 = set3;
                i18 = i15;
                j5 = j2;
                i19 = i10;
                i20 = i13;
                file6 = file5;
                i21 = i6;
                i22 = i12;
                j6 = j4;
                if (System.nanoTime() >= j6) {
                }
                RendererDebugBridge rendererDebugBridge222 = RendererDebugBridge.INSTANCE;
                denseScreenBurstScheduleStats = rendererDebugBridge222.getDenseScreenBurstScheduleStats();
                i23 = -1;
                if (denseScreenBurstScheduleStats == null) {
                }
                i24 = -1;
                if (denseScreenBurstScheduleStats == null) {
                }
                i25 = -1;
                if (denseScreenBurstScheduleStats == null) {
                }
                i26 = -1;
                if (denseScreenBurstScheduleStats == null) {
                }
                i27 = -1;
                int i42222 = 4;
                if (denseScreenBurstScheduleStats != null) {
                }
                if (i24 != i22) {
                }
                i28 = 0;
                boolean isDenseScreenBurstCaptureComplete222 = rendererDebugBridge222.isDenseScreenBurstCaptureComplete();
                String str13222 = "captureId=";
                StringBuilder sb222 = new StringBuilder("captureId=");
                sb222.append(str2);
                sb222.append(" source=dense_burst stage=summary requestedWarmupFrames=");
                sb222.append(i24);
                sb222.append(" observedWarmupFrames=");
                lb1.x(sb222, i25, " eligibleCallbacks=", i26, " firstCaptureOrdinal=");
                lb1.x(sb222, i27, " lastCaptureOrdinal=", i23, " warmupSatisfied=");
                sb222.append(i28);
                sb222.append(" complete=");
                sb222.append(isDenseScreenBurstCaptureComplete222 ? 1 : 0);
                String str14222 = "RendererDebugCapture";
                Log.w("RendererDebugCapture", sb222.toString());
                denseScreenBurstCaptureFrameCount = rendererDebugBridge222.getDenseScreenBurstCaptureFrameCount();
                if (denseScreenBurstCaptureFrameCount <= i18) {
                }
                kw3 I222 = hf.I();
                i29 = 0;
                while (i29 < i18) {
                }
                kw3 A222 = hf.A(I222);
                RendererDebugBridge.INSTANCE.clearDenseScreenBurstCapture();
                return A222;
            }
        }
        wj5Var = new wj5(this, s41Var);
        Object obj2 = wj5Var.n0;
        x61 x61Var22 = x61.COROUTINE_SUSPENDED;
        i4 = wj5Var.p0;
        if (i4 == 0) {
        }
        File file142 = file4;
        i6 = i14;
        file3 = file142;
        if (i12 > 0) {
        }
        long nanoTime22 = System.nanoTime();
        long j1022 = 1;
        if (j2 >= 1) {
        }
        j4 = ((j1022 + j3) * 1000000) + nanoTime22;
        int i4922 = i11;
        i16 = i9;
        i17 = i4922;
        x61Var = x61Var22;
        set4 = set3;
        i18 = i15;
        j5 = j2;
        i19 = i10;
        i20 = i13;
        file6 = file5;
        i21 = i6;
        i22 = i12;
        j6 = j4;
        if (System.nanoTime() >= j6) {
        }
        RendererDebugBridge rendererDebugBridge2222 = RendererDebugBridge.INSTANCE;
        denseScreenBurstScheduleStats = rendererDebugBridge2222.getDenseScreenBurstScheduleStats();
        i23 = -1;
        if (denseScreenBurstScheduleStats == null) {
        }
        i24 = -1;
        if (denseScreenBurstScheduleStats == null) {
        }
        i25 = -1;
        if (denseScreenBurstScheduleStats == null) {
        }
        i26 = -1;
        if (denseScreenBurstScheduleStats == null) {
        }
        i27 = -1;
        int i422222 = 4;
        if (denseScreenBurstScheduleStats != null) {
        }
        if (i24 != i22) {
        }
        i28 = 0;
        boolean isDenseScreenBurstCaptureComplete2222 = rendererDebugBridge2222.isDenseScreenBurstCaptureComplete();
        String str132222 = "captureId=";
        StringBuilder sb2222 = new StringBuilder("captureId=");
        sb2222.append(str2);
        sb2222.append(" source=dense_burst stage=summary requestedWarmupFrames=");
        sb2222.append(i24);
        sb2222.append(" observedWarmupFrames=");
        lb1.x(sb2222, i25, " eligibleCallbacks=", i26, " firstCaptureOrdinal=");
        lb1.x(sb2222, i27, " lastCaptureOrdinal=", i23, " warmupSatisfied=");
        sb2222.append(i28);
        sb2222.append(" complete=");
        sb2222.append(isDenseScreenBurstCaptureComplete2222 ? 1 : 0);
        String str142222 = "RendererDebugCapture";
        Log.w("RendererDebugCapture", sb2222.toString());
        denseScreenBurstCaptureFrameCount = rendererDebugBridge2222.getDenseScreenBurstCaptureFrameCount();
        if (denseScreenBurstCaptureFrameCount <= i18) {
        }
        kw3 I2222 = hf.I();
        i29 = 0;
        while (i29 < i18) {
        }
        kw3 A2222 = hf.A(I2222);
        RendererDebugBridge.INSTANCE.clearDenseScreenBurstCapture();
        return A2222;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0244  */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ak5 e(VideoRenderer videoRenderer, File file, String str, Set set) {
        Set set2;
        String str2;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        int[] iArr12;
        String str3;
        int[] iArr13;
        int i;
        int i2;
        int[] iArr14;
        Object[] objArr;
        int[] iArr15;
        int i3;
        int i4;
        int[] iArr16;
        int[] iArr17;
        int[] iArr18;
        int[] iArr19;
        int[] iArr20;
        File file2;
        String str4;
        int i5;
        vj5 vj5Var;
        int[] iArr21;
        int[] iArr22;
        int[] iArr23;
        vj5 vj5Var2;
        int[] iArr24;
        int[] iArr25;
        int[] iArr26;
        vj5 vj5Var3;
        vj5 vj5Var4;
        int[] iArr27;
        int[] iArr28;
        vj5 vj5Var5;
        vj5 vj5Var6;
        int[] iArr29;
        vj5 vj5Var7;
        vj5 vj5Var8;
        int[] iArr30;
        int[] iArr31;
        vj5 vj5Var9;
        vj5 vj5Var10;
        int[] iArr32;
        int[] iArr33;
        vj5 vj5Var11;
        String str5;
        int[] iArr34;
        int[] iArr35;
        vj5 vj5Var12;
        String str6;
        int[] iArr36;
        int[] iArr37;
        vj5 vj5Var13;
        int[] iArr38;
        int[] iArr39;
        vj5 vj5Var14;
        int[] iArr40;
        int[] iArr41;
        vj5 vj5Var15;
        int[] iArr42;
        int[] iArr43;
        vj5 vj5Var16;
        vj5 vj5Var17;
        String str7;
        int i6;
        int i7;
        int[] iArr44;
        int[] iArr45;
        vj5 vj5Var18;
        int i8;
        int i9;
        int[] iArr46;
        int i10;
        int i11;
        int[] iArr47;
        vj5 vj5Var19;
        int[] iArr48;
        int[] iArr49;
        vj5 vj5Var20;
        int[] iArr50;
        int[] iArr51;
        int i12;
        int i13;
        int[] iArr52;
        int[] iArr53;
        int[] iArr54;
        int[] iArr55;
        Set set3;
        int[] iArr56;
        int[] iArr57;
        int i14;
        int[] iArr58;
        int i15;
        int[] iArr59;
        int i16;
        int[] iArr60;
        int[] iArr61;
        int[] iArr62;
        int[] iArr63;
        int[] iArr64;
        int[] iArr65;
        int[] iArr66;
        int[] iArr67;
        int[] iArr68;
        int[] iArr69;
        int[] iArr70;
        int[] iArr71;
        int[] iArr72;
        int[] iArr73;
        int[] iArr74;
        int[] iArr75;
        int[] iArr76;
        int i17;
        int[] iArr77;
        int[] iArr78;
        int[] iArr79;
        int[] iArr80;
        Set set4;
        int[] iArr81;
        int[] iArr82;
        int[] iArr83;
        int[] iArr84;
        int[] iArr85;
        String str8;
        Set set5;
        String str9;
        String str10;
        String str11;
        vj5 vj5Var21;
        String str12;
        Set set6;
        ?? r11;
        double length;
        int i18;
        String P0;
        int i19;
        int i20;
        int i21;
        int i22;
        Integer I0;
        Integer I02;
        Integer I03;
        Integer I04;
        videoRenderer.getClass();
        set.getClass();
        if (set.isEmpty()) {
            vj5.Companion.getClass();
            set2 = vj5.allKinds;
        } else {
            set2 = set;
        }
        if (str == null) {
            str2 = Long.toHexString(System.currentTimeMillis());
        } else {
            str2 = str;
        }
        RendererDebugBridge rendererDebugBridge = RendererDebugBridge.INSTANCE;
        int currentFrameIndexForDebug = rendererDebugBridge.getCurrentFrameIndexForDebug();
        boolean isCurrentFrameReadyForDebug = rendererDebugBridge.isCurrentFrameReadyForDebug();
        String name = videoRenderer.name();
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = name.toLowerCase(locale);
        lowerCase.getClass();
        String P02 = gt0.P0(set2, ",", null, null, new dv4(20), 30);
        StringBuilder u = i61.u("captureId=", str2, " stage=begin configuredRenderer=", lowerCase, " frameId=");
        lb1.x(u, currentFrameIndexForDebug, " frameReady=", isCurrentFrameReadyForDebug ? 1 : 0, " freezeSnapshot=1 kinds=");
        u.append(P02);
        Log.w("RendererDebugCapture", u.toString());
        rendererDebugBridge.dumpCurrentRendererSnapshot();
        if (set2.contains(vj5.SCREEN_FRAME)) {
            str2.getClass();
            j(str2, "captureCurrentFrame", true);
            int[] captureCurrentFrame = rendererDebugBridge.captureCurrentFrame();
            j(str2, "captureCurrentFrame", false);
            iArr = captureCurrentFrame;
        } else {
            iArr = null;
        }
        if (set2.contains(vj5.PACKED_TOP_PRIMARY)) {
            str2.getClass();
            j(str2, "captureCurrentPackedTopPrimary", true);
            int[] captureCurrentPackedTopPrimary = rendererDebugBridge.captureCurrentPackedTopPrimary();
            j(str2, "captureCurrentPackedTopPrimary", false);
            iArr2 = captureCurrentPackedTopPrimary;
        } else {
            iArr2 = null;
        }
        if (set2.contains(vj5.PACKED_BOTTOM_PRIMARY)) {
            str2.getClass();
            j(str2, "captureCurrentPackedBottomPrimary", true);
            int[] captureCurrentPackedBottomPrimary = rendererDebugBridge.captureCurrentPackedBottomPrimary();
            j(str2, "captureCurrentPackedBottomPrimary", false);
            iArr3 = captureCurrentPackedBottomPrimary;
        } else {
            iArr3 = null;
        }
        if (set2.contains(vj5.PACKED_TOP_PLANE1)) {
            str2.getClass();
            j(str2, "captureCurrentPackedPlane(top,1)", true);
            int[] captureCurrentPackedPlane = rendererDebugBridge.captureCurrentPackedPlane(0, 1);
            j(str2, "captureCurrentPackedPlane(top,1)", false);
            iArr4 = captureCurrentPackedPlane;
        } else {
            iArr4 = null;
        }
        if (set2.contains(vj5.PACKED_TOP_CONTROL)) {
            str2.getClass();
            j(str2, "captureCurrentPackedPlane(top,2)", true);
            int[] captureCurrentPackedPlane2 = rendererDebugBridge.captureCurrentPackedPlane(0, 2);
            j(str2, "captureCurrentPackedPlane(top,2)", false);
            iArr5 = captureCurrentPackedPlane2;
        } else {
            iArr5 = null;
        }
        if (set2.contains(vj5.PACKED_BOTTOM_PLANE1)) {
            str2.getClass();
            j(str2, "captureCurrentPackedPlane(bottom,1)", true);
            int[] captureCurrentPackedPlane3 = rendererDebugBridge.captureCurrentPackedPlane(1, 1);
            j(str2, "captureCurrentPackedPlane(bottom,1)", false);
            iArr6 = captureCurrentPackedPlane3;
        } else {
            iArr6 = null;
        }
        if (set2.contains(vj5.PACKED_BOTTOM_CONTROL)) {
            str2.getClass();
            j(str2, "captureCurrentPackedPlane(bottom,2)", true);
            int[] captureCurrentPackedPlane4 = rendererDebugBridge.captureCurrentPackedPlane(1, 2);
            j(str2, "captureCurrentPackedPlane(bottom,2)", false);
            iArr7 = captureCurrentPackedPlane4;
        } else {
            iArr7 = null;
        }
        if (set2.contains(vj5.CAPTURE3D_SOURCE_DS_FRAME)) {
            str2.getClass();
            j(str2, "captureCurrentCapture3dSource", true);
            int[] captureCurrentCapture3dSource = rendererDebugBridge.captureCurrentCapture3dSource();
            j(str2, "captureCurrentCapture3dSource", false);
            iArr8 = captureCurrentCapture3dSource;
        } else {
            iArr8 = null;
        }
        if (set2.contains(vj5.CAPTURE_LINE_USES_3D_MASK)) {
            str2.getClass();
            j(str2, "captureCurrentCaptureLineUses3dMask", true);
            int[] captureCurrentCaptureLineUses3dMask = rendererDebugBridge.captureCurrentCaptureLineUses3dMask();
            j(str2, "captureCurrentCaptureLineUses3dMask", false);
            iArr9 = captureCurrentCaptureLineUses3dMask;
        } else {
            iArr9 = null;
        }
        if (set2.contains(vj5.COMP4_TOP_PLACEHOLDER)) {
            str2.getClass();
            j(str2, "captureCurrentComp4TopPlaceholder", true);
            int[] captureCurrentComp4TopPlaceholder = rendererDebugBridge.captureCurrentComp4TopPlaceholder();
            j(str2, "captureCurrentComp4TopPlaceholder", false);
            iArr10 = captureCurrentComp4TopPlaceholder;
        } else {
            iArr10 = null;
        }
        if (set2.contains(vj5.COMP4_BOTTOM_PLACEHOLDER)) {
            str2.getClass();
            j(str2, "captureCurrentComp4BottomPlaceholder", true);
            int[] captureCurrentComp4BottomPlaceholder = rendererDebugBridge.captureCurrentComp4BottomPlaceholder();
            j(str2, "captureCurrentComp4BottomPlaceholder", false);
            iArr11 = captureCurrentComp4BottomPlaceholder;
        } else {
            iArr11 = null;
        }
        if (set2.contains(vj5.CAPTURE_FALLBACK_MASK)) {
            str2.getClass();
            j(str2, "captureCurrentCaptureFallbackMask", true);
            int[] captureCurrentCaptureFallbackMask = rendererDebugBridge.captureCurrentCaptureFallbackMask();
            j(str2, "captureCurrentCaptureFallbackMask", false);
            iArr12 = captureCurrentCaptureFallbackMask;
        } else {
            iArr12 = null;
        }
        if (set2.contains(vj5.SOFT_PACKED_FRAME_META_JSON)) {
            str2.getClass();
            j(str2, "captureCurrentSoftPackedFrameMetaJson", true);
            str3 = rendererDebugBridge.captureCurrentSoftPackedFrameMetaJson();
            j(str2, "captureCurrentSoftPackedFrameMetaJson", false);
        } else {
            str3 = null;
        }
        vj5 vj5Var22 = vj5.COMPOSITED_FRAME;
        if (set2.contains(vj5Var22)) {
            str2.getClass();
            j(str2, "captureCurrentCompositedDimensions", true);
            int[] captureCurrentCompositedDimensions = rendererDebugBridge.captureCurrentCompositedDimensions();
            j(str2, "captureCurrentCompositedDimensions", false);
            iArr13 = captureCurrentCompositedDimensions;
        } else {
            iArr13 = null;
        }
        if (iArr13 != null && (I04 = fv.I0(iArr13, 0)) != null) {
            i = I04.intValue();
        } else {
            i = 0;
        }
        if (iArr13 != null && (I03 = fv.I0(iArr13, 1)) != null) {
            i2 = I03.intValue();
        } else {
            i2 = 0;
        }
        if (set2.contains(vj5Var22)) {
            str2.getClass();
            j(str2, "captureCurrentCompositedFrame", true);
            iArr14 = rendererDebugBridge.captureCurrentCompositedFrame();
            j(str2, "captureCurrentCompositedFrame", false);
        } else {
            iArr14 = null;
        }
        Set<vj5> set7 = set2;
        if (!(set7 instanceof Collection) || !set7.isEmpty()) {
            for (vj5 vj5Var23 : set7) {
                if (vj5Var23 == vj5.RENDERER3D_FRAME || vj5Var23 == vj5.RENDERER3D_CAPTURE_FRAME || vj5Var23 == vj5.RENDERER3D_DEPTH || vj5Var23 == vj5.RENDERER3D_ATTR || vj5Var23 == vj5.RENDERER3D_COVERAGE) {
                    objArr = 1;
                    break;
                }
                while (r2.hasNext()) {
                }
            }
        }
        objArr = null;
        if (objArr != null) {
            str2.getClass();
            j(str2, "captureCurrent3dDimensions", true);
            iArr15 = RendererDebugBridge.INSTANCE.captureCurrent3dDimensions();
            j(str2, "captureCurrent3dDimensions", false);
        } else {
            iArr15 = null;
        }
        if (iArr15 != null && (I02 = fv.I0(iArr15, 0)) != null) {
            i3 = I02.intValue();
        } else {
            i3 = 0;
        }
        if (iArr15 != null && (I0 = fv.I0(iArr15, 1)) != null) {
            i4 = I0.intValue();
        } else {
            i4 = 0;
        }
        if (objArr != null && set2.contains(vj5.RENDERER3D_FRAME)) {
            str2.getClass();
            j(str2, "captureCurrent3dFrame", true);
            int[] captureCurrent3dFrame = RendererDebugBridge.INSTANCE.captureCurrent3dFrame();
            j(str2, "captureCurrent3dFrame", false);
            iArr16 = captureCurrent3dFrame;
        } else {
            iArr16 = null;
        }
        if (objArr != null && set2.contains(vj5.RENDERER3D_CAPTURE_FRAME)) {
            str2.getClass();
            j(str2, "captureCurrent3dCaptureFrame", true);
            int[] captureCurrent3dCaptureFrame = RendererDebugBridge.INSTANCE.captureCurrent3dCaptureFrame();
            j(str2, "captureCurrent3dCaptureFrame", false);
            iArr17 = captureCurrent3dCaptureFrame;
        } else {
            iArr17 = null;
        }
        if (objArr != null && set2.contains(vj5.RENDERER3D_DEPTH)) {
            str2.getClass();
            j(str2, "captureCurrent3dDepth", true);
            int[] captureCurrent3dDepth = RendererDebugBridge.INSTANCE.captureCurrent3dDepth();
            j(str2, "captureCurrent3dDepth", false);
            iArr18 = captureCurrent3dDepth;
        } else {
            iArr18 = null;
        }
        if (objArr != null && set2.contains(vj5.RENDERER3D_ATTR)) {
            str2.getClass();
            j(str2, "captureCurrent3dAttributes", true);
            int[] captureCurrent3dAttributes = RendererDebugBridge.INSTANCE.captureCurrent3dAttributes();
            j(str2, "captureCurrent3dAttributes", false);
            iArr19 = captureCurrent3dAttributes;
        } else {
            iArr19 = null;
        }
        if (objArr != null && set2.contains(vj5.RENDERER3D_COVERAGE)) {
            str2.getClass();
            j(str2, "captureCurrent3dCoverage", true);
            int[] captureCurrent3dCoverage = RendererDebugBridge.INSTANCE.captureCurrent3dCoverage();
            j(str2, "captureCurrent3dCoverage", false);
            iArr20 = captureCurrent3dCoverage;
        } else {
            iArr20 = null;
        }
        if (file == null || (!file.exists() && !file.mkdirs())) {
            file2 = null;
        } else {
            file2 = file;
        }
        vj5 vj5Var24 = vj5.SCREEN_FRAME;
        if (set2.contains(vj5Var24)) {
            str2.getClass();
            i5 = 1;
            str4 = str3;
            vj5Var = vj5Var24;
            l(file2, str2, "screenFrame", 256, RendererDebugBridge.CAPTURE_HEIGHT, iArr);
        } else {
            str4 = str3;
            i5 = 1;
            vj5Var = vj5Var24;
        }
        vj5 vj5Var25 = vj5.PACKED_TOP_PRIMARY;
        if (set2.contains(vj5Var25)) {
            str2.getClass();
            int[] iArr86 = iArr2;
            iArr21 = iArr;
            iArr22 = iArr86;
            iArr23 = iArr14;
            vj5Var2 = vj5Var25;
            l(file2, str2, "packedTopPrimary", 256, 192, iArr22);
        } else {
            int[] iArr87 = iArr2;
            iArr21 = iArr;
            iArr22 = iArr87;
            iArr23 = iArr14;
            vj5Var2 = vj5Var25;
        }
        vj5 vj5Var26 = vj5.PACKED_BOTTOM_PRIMARY;
        if (set2.contains(vj5Var26)) {
            str2.getClass();
            int[] iArr88 = iArr3;
            iArr24 = iArr22;
            iArr25 = iArr88;
            iArr26 = iArr4;
            vj5Var3 = vj5Var26;
            l(file2, str2, "packedBottomPrimary", 256, 192, iArr25);
        } else {
            int[] iArr89 = iArr3;
            iArr24 = iArr22;
            iArr25 = iArr89;
            iArr26 = iArr4;
            vj5Var3 = vj5Var26;
        }
        vj5 vj5Var27 = vj5.PACKED_TOP_PLANE1;
        if (set2.contains(vj5Var27)) {
            str2.getClass();
            iArr27 = iArr5;
            vj5Var4 = vj5Var27;
            iArr28 = iArr25;
            l(file2, str2, "packedTopPlane1", 256, 192, iArr26);
        } else {
            vj5Var4 = vj5Var27;
            iArr27 = iArr5;
            iArr28 = iArr25;
        }
        vj5 vj5Var28 = vj5.PACKED_TOP_CONTROL;
        if (set2.contains(vj5Var28)) {
            str2.getClass();
            vj5Var5 = vj5Var28;
            vj5Var6 = vj5Var3;
            iArr29 = iArr26;
            l(file2, str2, "packedTopControl", 256, 192, iArr27);
        } else {
            vj5Var5 = vj5Var28;
            vj5Var6 = vj5Var3;
            iArr29 = iArr26;
        }
        vj5 vj5Var29 = vj5.PACKED_BOTTOM_PLANE1;
        if (set2.contains(vj5Var29)) {
            str2.getClass();
            vj5Var7 = vj5Var2;
            vj5Var8 = vj5Var29;
            iArr30 = iArr6;
            iArr31 = iArr27;
            l(file2, str2, "packedBottomPlane1", 256, 192, iArr30);
        } else {
            vj5Var7 = vj5Var2;
            vj5Var8 = vj5Var29;
            iArr30 = iArr6;
            iArr31 = iArr27;
        }
        vj5 vj5Var30 = vj5.PACKED_BOTTOM_CONTROL;
        if (set2.contains(vj5Var30)) {
            str2.getClass();
            vj5Var10 = vj5Var;
            vj5Var9 = vj5Var30;
            iArr32 = iArr30;
            iArr33 = iArr7;
            l(file2, str2, "packedBottomControl", 256, 192, iArr33);
        } else {
            vj5Var9 = vj5Var30;
            vj5Var10 = vj5Var;
            iArr32 = iArr30;
            iArr33 = iArr7;
        }
        vj5 vj5Var31 = vj5.CAPTURE3D_SOURCE_DS_FRAME;
        if (set2.contains(vj5Var31)) {
            str2.getClass();
            str5 = "RendererDebugCapture";
            vj5Var11 = vj5Var31;
            iArr34 = iArr33;
            iArr35 = iArr8;
            l(file2, str2, "capture3dSourceDsFrame", 256, 192, iArr35);
        } else {
            vj5Var11 = vj5Var31;
            str5 = "RendererDebugCapture";
            iArr34 = iArr33;
            iArr35 = iArr8;
        }
        vj5 vj5Var32 = vj5.CAPTURE_LINE_USES_3D_MASK;
        if (set2.contains(vj5Var32)) {
            str2.getClass();
            str6 = "captureId=";
            vj5Var12 = vj5Var32;
            iArr36 = iArr35;
            iArr37 = iArr9;
            l(file2, str2, "captureLineUses3dMask", 256, 192, iArr37);
        } else {
            vj5Var12 = vj5Var32;
            str6 = "captureId=";
            iArr36 = iArr35;
            iArr37 = iArr9;
        }
        vj5 vj5Var33 = vj5.COMP4_TOP_PLACEHOLDER;
        if (set2.contains(vj5Var33)) {
            str2.getClass();
            iArr38 = iArr37;
            vj5Var13 = vj5Var33;
            iArr39 = iArr10;
            l(file2, str2, "comp4TopPlaceholder", 256, 192, iArr39);
        } else {
            vj5Var13 = vj5Var33;
            iArr38 = iArr37;
            iArr39 = iArr10;
        }
        vj5 vj5Var34 = vj5.COMP4_BOTTOM_PLACEHOLDER;
        if (set2.contains(vj5Var34)) {
            str2.getClass();
            iArr40 = iArr39;
            vj5Var14 = vj5Var34;
            iArr41 = iArr11;
            l(file2, str2, "comp4BottomPlaceholder", 256, 192, iArr41);
        } else {
            vj5Var14 = vj5Var34;
            iArr40 = iArr39;
            iArr41 = iArr11;
        }
        vj5 vj5Var35 = vj5.CAPTURE_FALLBACK_MASK;
        if (set2.contains(vj5Var35)) {
            str2.getClass();
            iArr42 = iArr41;
            vj5Var15 = vj5Var35;
            iArr43 = iArr12;
            l(file2, str2, "captureFallbackMask", 256, 192, iArr43);
        } else {
            vj5Var15 = vj5Var35;
            iArr42 = iArr41;
            iArr43 = iArr12;
        }
        vj5 vj5Var36 = vj5.SOFT_PACKED_FRAME_META_JSON;
        if (set2.contains(vj5Var36)) {
            str2.getClass();
            m(file2, str2, str4);
        }
        vj5 vj5Var37 = vj5.COMPOSITED_FRAME;
        if (set2.contains(vj5Var37)) {
            str2.getClass();
            vj5Var17 = vj5Var37;
            vj5Var16 = vj5Var36;
            str7 = str4;
            i6 = i;
            i7 = i2;
            iArr44 = iArr43;
            iArr45 = iArr23;
            l(file2, str2, "compositedFrame", i6, i7, iArr45);
        } else {
            vj5Var16 = vj5Var36;
            vj5Var17 = vj5Var37;
            str7 = str4;
            i6 = i;
            i7 = i2;
            iArr44 = iArr43;
            iArr45 = iArr23;
        }
        vj5 vj5Var38 = vj5.RENDERER3D_FRAME;
        if (set2.contains(vj5Var38)) {
            str2.getClass();
            i8 = i6;
            i9 = i7;
            iArr46 = iArr45;
            vj5Var18 = vj5Var38;
            int i23 = i3;
            int i24 = i4;
            iArr47 = iArr16;
            l(file2, str2, "renderer3dFrame", i23, i24, iArr47);
            i10 = i23;
            i11 = i24;
        } else {
            vj5Var18 = vj5Var38;
            i8 = i6;
            i9 = i7;
            iArr46 = iArr45;
            i10 = i3;
            i11 = i4;
            iArr47 = iArr16;
        }
        vj5 vj5Var39 = vj5.RENDERER3D_CAPTURE_FRAME;
        if (set2.contains(vj5Var39)) {
            str2.getClass();
            iArr48 = iArr47;
            vj5Var19 = vj5Var39;
            iArr49 = iArr17;
            l(file2, str2, "renderer3dCaptureFrame", 256, 192, iArr49);
        } else {
            vj5Var19 = vj5Var39;
            iArr48 = iArr47;
            iArr49 = iArr17;
        }
        vj5 vj5Var40 = vj5.RENDERER3D_DEPTH;
        if (set2.contains(vj5Var40)) {
            str2.getClass();
            vj5Var20 = vj5Var40;
            iArr50 = iArr49;
            iArr51 = iArr44;
            i12 = i10;
            i13 = i11;
            iArr52 = iArr18;
            iArr53 = iArr21;
            n(file2, str2, "renderer3dDepth", i12, i13, iArr52, new xj5(1, this, yj5.class, "encodeDepthDebugPixel", "encodeDepthDebugPixel(I)I", 0, 0, 0));
        } else {
            vj5Var20 = vj5Var40;
            iArr50 = iArr49;
            iArr51 = iArr44;
            i12 = i10;
            i13 = i11;
            iArr52 = iArr18;
            iArr53 = iArr21;
        }
        if (set2.contains(vj5.RENDERER3D_ATTR)) {
            str2.getClass();
            iArr54 = iArr52;
            iArr55 = iArr19;
            n(file2, str2, "renderer3dAttr", i12, i13, iArr55, new xj5(1, this, yj5.class, "encodeAttrDebugPixel", "encodeAttrDebugPixel(I)I", 0, 0, 1));
        } else {
            iArr54 = iArr52;
            iArr55 = iArr19;
        }
        if (set2.contains(vj5.RENDERER3D_COVERAGE)) {
            str2.getClass();
            set3 = set2;
            iArr56 = iArr55;
            iArr57 = iArr20;
            n(file2, str2, "renderer3dCoverage", i12, i13, iArr57, new xj5(1, this, yj5.class, "encodeCoverageDebugPixel", "encodeCoverageDebugPixel(I)I", 0, 0, 2));
        } else {
            set3 = set2;
            iArr56 = iArr55;
            iArr57 = iArr20;
        }
        File file3 = file2;
        String c = c(256, RendererDebugBridge.CAPTURE_HEIGHT, iArr53);
        int[] iArr90 = iArr53;
        String c2 = c(256, 192, iArr24);
        int[] iArr91 = iArr24;
        String c3 = c(256, 192, iArr28);
        int[] iArr92 = iArr28;
        String c4 = c(256, 192, iArr29);
        int[] iArr93 = iArr29;
        String c5 = c(256, 192, iArr31);
        int[] iArr94 = iArr31;
        String c6 = c(256, 192, iArr32);
        int[] iArr95 = iArr32;
        String c7 = c(256, 192, iArr34);
        int[] iArr96 = iArr34;
        String c8 = c(256, 192, iArr36);
        int[] iArr97 = iArr36;
        String c9 = c(256, 192, iArr38);
        String c10 = c(256, 192, iArr40);
        String c11 = c(256, 192, iArr42);
        int[] iArr98 = iArr51;
        String c12 = c(256, 192, iArr98);
        if (str7 != null && !qs6.v0(str7)) {
            i14 = 0;
        } else {
            i14 = i5;
        }
        int i25 = i8;
        int i26 = i9;
        int[] iArr99 = iArr46;
        String c13 = c(i25, i26, iArr99);
        int[] iArr100 = iArr48;
        String c14 = c(i12, i13, iArr100);
        String c15 = c(256, 192, iArr50);
        String c16 = c(i12, i13, iArr54);
        String c17 = c(i12, i13, iArr56);
        int[] iArr101 = iArr56;
        String c18 = c(i12, i13, iArr57);
        int[] iArr102 = iArr57;
        int i27 = i12;
        String str13 = str6;
        StringBuilder u2 = i61.u(str13, str2, " kind=meta screen=", c, " packedTop=");
        i61.B(u2, c2, " packedBottom=", c3, " packedTopPlane1=");
        i61.B(u2, c4, " packedTopControl=", c5, " packedBottomPlane1=");
        i61.B(u2, c6, " packedBottomControl=", c7, " capture3dSource=");
        i61.B(u2, c8, " captureLineMask=", c9, " comp4Top=");
        i61.B(u2, c10, " comp4Bottom=", c11, " fallbackMask=");
        u2.append(c12);
        u2.append(" softPackedMeta=");
        u2.append(i14 ^ 1);
        u2.append(" composited=");
        i61.B(u2, c13, " renderer3d=", c14, " renderer3dCapture=");
        i61.B(u2, c15, " depth=", c16, " attr=");
        u2.append(c17);
        u2.append(" coverage=");
        u2.append(c18);
        String str14 = str5;
        Log.w(str14, u2.toString());
        Set set8 = set3;
        if (set8.contains(vj5Var10)) {
            str2.getClass();
            iArr58 = iArr90;
            i15 = 256;
            k(str2, "screenFrame", 256, RendererDebugBridge.CAPTURE_HEIGHT, iArr58);
        } else {
            iArr58 = iArr90;
            i15 = 256;
        }
        if (set8.contains(vj5Var7)) {
            str2.getClass();
            iArr59 = iArr91;
            i16 = 192;
            k(str2, "packedTopPrimary", i15, 192, iArr59);
        } else {
            iArr59 = iArr91;
            i16 = 192;
        }
        if (set8.contains(vj5Var6)) {
            str2.getClass();
            iArr60 = iArr92;
            k(str2, "packedBottomPrimary", i15, i16, iArr60);
        } else {
            iArr60 = iArr92;
        }
        if (set8.contains(vj5Var4)) {
            str2.getClass();
            iArr61 = iArr93;
            k(str2, "packedTopPlane1", i15, i16, iArr61);
        } else {
            iArr61 = iArr93;
        }
        if (set8.contains(vj5Var5)) {
            str2.getClass();
            iArr62 = iArr94;
            k(str2, "packedTopControl", i15, i16, iArr62);
        } else {
            iArr62 = iArr94;
        }
        if (set8.contains(vj5Var8)) {
            str2.getClass();
            iArr63 = iArr95;
            k(str2, "packedBottomPlane1", i15, i16, iArr63);
        } else {
            iArr63 = iArr95;
        }
        if (set8.contains(vj5Var9)) {
            str2.getClass();
            iArr64 = iArr96;
            k(str2, "packedBottomControl", i15, i16, iArr64);
        } else {
            iArr64 = iArr96;
        }
        if (set8.contains(vj5Var11)) {
            str2.getClass();
            iArr65 = iArr97;
            k(str2, "capture3dSourceDsFrame", i15, i16, iArr65);
        } else {
            iArr65 = iArr97;
        }
        if (set8.contains(vj5Var12)) {
            str2.getClass();
            iArr66 = iArr62;
            iArr67 = iArr38;
            k(str2, "captureLineUses3dMask", i15, i16, iArr67);
        } else {
            iArr66 = iArr62;
            iArr67 = iArr38;
        }
        if (set8.contains(vj5Var13)) {
            str2.getClass();
            iArr68 = iArr67;
            iArr69 = iArr40;
            k(str2, "comp4TopPlaceholder", i15, i16, iArr69);
        } else {
            iArr68 = iArr67;
            iArr69 = iArr40;
        }
        if (set8.contains(vj5Var14)) {
            str2.getClass();
            iArr70 = iArr69;
            iArr71 = iArr42;
            k(str2, "comp4BottomPlaceholder", i15, i16, iArr71);
        } else {
            iArr70 = iArr69;
            iArr71 = iArr42;
        }
        if (set8.contains(vj5Var15)) {
            str2.getClass();
            iArr72 = iArr71;
            iArr73 = iArr98;
            k(str2, "captureFallbackMask", i15, i16, iArr73);
        } else {
            iArr72 = iArr71;
            iArr73 = iArr98;
        }
        if (set8.contains(vj5Var16)) {
            if (str7 != null && !qs6.v0(str7)) {
                i21 = 0;
            } else {
                i21 = i5;
            }
            int i28 = i21 ^ 1;
            if (str7 != null) {
                i22 = str7.length();
            } else {
                i22 = 0;
            }
            StringBuilder sb = new StringBuilder(str13);
            sb.append(str2);
            iArr74 = iArr73;
            sb.append(" kind=softPackedFrameMetaJson available=");
            sb.append(i28);
            sb.append(" length=");
            sb.append(i22);
            Log.w(str14, sb.toString());
        } else {
            iArr74 = iArr73;
        }
        if (set8.contains(vj5Var17)) {
            str2.getClass();
            iArr75 = iArr99;
            k(str2, "compositedFrame", i25, i26, iArr75);
        } else {
            iArr75 = iArr99;
        }
        if (set8.contains(vj5Var18)) {
            str2.getClass();
            iArr76 = iArr100;
            i17 = i27;
            k(str2, "renderer3dFrame", i17, i13, iArr76);
        } else {
            iArr76 = iArr100;
            i17 = i27;
        }
        if (set8.contains(vj5Var19)) {
            str2.getClass();
            iArr77 = iArr75;
            iArr78 = iArr58;
            iArr79 = iArr76;
            iArr80 = iArr50;
            k(str2, "renderer3dCaptureFrame", 256, 192, iArr80);
        } else {
            iArr77 = iArr75;
            iArr78 = iArr58;
            iArr79 = iArr76;
            iArr80 = iArr50;
        }
        int[] iArr103 = iArr80;
        int[] iArr104 = iArr64;
        if (set8.contains(vj5Var20)) {
            str2.getClass();
            iArr81 = iArr63;
            iArr82 = iArr65;
            if (iArr54 != null) {
                int[] iArr105 = iArr54;
                if (iArr105.length == 0) {
                    iArr54 = iArr105;
                } else {
                    int length2 = iArr105.length;
                    long j = Long.MAX_VALUE;
                    long j2 = Long.MIN_VALUE;
                    iArr83 = iArr59;
                    iArr84 = iArr61;
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < length2) {
                        int i31 = length2;
                        int i32 = i29;
                        long j3 = iArr105[i29] & 4294967295L;
                        if (j3 < j) {
                            j = j3;
                        }
                        if (j3 > j2) {
                            j2 = j3;
                        }
                        if (j3 == 0) {
                            i30++;
                        }
                        i29 = i32 + 1;
                        length2 = i31;
                    }
                    int length3 = iArr105.length;
                    String b = b(iArr105);
                    iArr85 = iArr60;
                    String g = g(j);
                    set4 = set8;
                    String g2 = g(j2);
                    String a2 = a(i17, i13, iArr105);
                    iArr54 = iArr105;
                    StringBuilder sb2 = new StringBuilder(str13);
                    sb2.append(str2);
                    sb2.append(" kind=renderer3dDepth size=");
                    sb2.append(i17);
                    sb2.append("x");
                    lb1.x(sb2, i13, " pixels=", length3, " crc32=");
                    i61.B(sb2, b, " min=", g, " max=");
                    sb2.append(g2);
                    sb2.append(" zero=");
                    sb2.append(i30);
                    sb2.append(" samples=");
                    sb2.append(a2);
                    str14 = str14;
                    Log.w(str14, sb2.toString());
                    str2 = str2;
                }
            }
            set4 = set8;
            String str15 = str2;
            iArr83 = iArr59;
            iArr84 = iArr61;
            iArr85 = iArr60;
            StringBuilder sb3 = new StringBuilder(str13);
            str2 = str15;
            sb3.append(str2);
            sb3.append(" kind=renderer3dDepth unavailable=1");
            Log.w(str14, sb3.toString());
        } else {
            set4 = set8;
            iArr81 = iArr63;
            iArr82 = iArr65;
            iArr83 = iArr59;
            iArr84 = iArr61;
            iArr85 = iArr60;
        }
        Set set9 = set4;
        if (!set9.contains(vj5.RENDERER3D_ATTR)) {
            str8 = " max=";
            set5 = set9;
            str9 = str2;
            str10 = str14;
            str11 = " samples=";
        } else {
            str2.getClass();
            if (iArr101 != null) {
                if (iArr101.length == 0) {
                    iArr101 = iArr101;
                } else {
                    int[] iArr106 = new int[64];
                    String str16 = str14;
                    str8 = " max=";
                    set5 = set9;
                    int i33 = 0;
                    int i34 = 0;
                    int i35 = 0;
                    int i36 = 0;
                    for (int i37 : iArr101) {
                        if (i37 != 0) {
                            i36++;
                        }
                        if ((i37 & 15) != 0) {
                            i34++;
                        }
                        if ((i37 & 32768) != 0) {
                            i35++;
                        }
                        if ((i37 & 16) != 0) {
                            i33++;
                        }
                        int i38 = (i37 >>> 24) & 63;
                        iArr106[i38] = iArr106[i38] + 1;
                    }
                    int i39 = 0;
                    for (int i40 = 0; i40 < 64; i40++) {
                        if (iArr106[i40] > 0) {
                            i39++;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    int i41 = i33;
                    int i42 = 0;
                    while (i42 < 64) {
                        int i43 = iArr106[i42];
                        if (i43 > 0) {
                            Integer valueOf = Integer.valueOf(i42);
                            i19 = i42;
                            Integer valueOf2 = Integer.valueOf(i43);
                            i20 = i39;
                            arrayList.add(new vr4(valueOf, valueOf2));
                        } else {
                            i19 = i42;
                            i20 = i39;
                        }
                        i42 = i19 + 1;
                        i39 = i20;
                    }
                    int i44 = i39;
                    if (arrayList.size() > i5) {
                        jt0.x0(arrayList, new zh2(27));
                    }
                    if (arrayList.isEmpty()) {
                        P0 = "none";
                    } else {
                        P0 = gt0.P0(gt0.e1(arrayList, 6), ",", null, null, new dv4(22), 30);
                    }
                    int length4 = iArr101.length;
                    String b2 = b(iArr101);
                    String a3 = a(i17, i13, iArr101);
                    iArr101 = iArr101;
                    StringBuilder sb4 = new StringBuilder(str13);
                    sb4.append(str2);
                    String str17 = str2;
                    sb4.append(" kind=renderer3dAttr size=");
                    sb4.append(i17);
                    sb4.append("x");
                    lb1.x(sb4, i13, " pixels=", length4, " crc32=");
                    sb4.append(b2);
                    sb4.append(" nonZero=");
                    sb4.append(i36);
                    sb4.append(" edge=");
                    lb1.x(sb4, i34, " fog=", i35, " backFacing=");
                    lb1.x(sb4, i41, " uniquePolyIds=", i44, " topPolyIds=");
                    sb4.append(P0);
                    str11 = " samples=";
                    sb4.append(str11);
                    sb4.append(a3);
                    str10 = str16;
                    Log.w(str10, sb4.toString());
                    str9 = str17;
                }
            }
            String str18 = str2;
            str8 = " max=";
            set5 = set9;
            str10 = str14;
            str11 = " samples=";
            StringBuilder sb5 = new StringBuilder(str13);
            str9 = str18;
            sb5.append(str9);
            sb5.append(" kind=renderer3dAttr unavailable=1");
            Log.w(str10, sb5.toString());
        }
        vj5 vj5Var41 = vj5.RENDERER3D_COVERAGE;
        Set set10 = set5;
        if (set10.contains(vj5Var41)) {
            str9.getClass();
            if (iArr102 != null) {
                if (iArr102.length == 0) {
                    iArr102 = iArr102;
                } else {
                    int length5 = iArr102.length;
                    vj5Var21 = vj5Var41;
                    String str19 = str11;
                    set6 = set10;
                    long j4 = 0;
                    int i45 = 0;
                    int i46 = 0;
                    int i47 = 0;
                    String str20 = str10;
                    int i48 = 0;
                    while (i45 < length5) {
                        int i49 = i45;
                        int i50 = iArr102[i45] & 31;
                        if (i50 != 0) {
                            i47++;
                        }
                        int i51 = i47;
                        if (i50 == 31) {
                            i48++;
                        }
                        if (i50 > i46) {
                            i18 = i50;
                        } else {
                            i18 = i46;
                        }
                        j4 += i50;
                        i45 = i49 + 1;
                        i46 = i18;
                        i47 = i51;
                    }
                    if (iArr102.length == 0) {
                        length = 0.0d;
                    } else {
                        length = j4 / iArr102.length;
                    }
                    int length6 = iArr102.length;
                    String b3 = b(iArr102);
                    int i52 = i46;
                    String format = String.format(Locale.US, "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(length)}, 1));
                    String a4 = a(i17, i13, iArr102);
                    StringBuilder sb6 = new StringBuilder(str13);
                    sb6.append(str9);
                    iArr102 = iArr102;
                    sb6.append(" kind=renderer3dCoverage size=");
                    sb6.append(i17);
                    sb6.append("x");
                    lb1.x(sb6, i13, " pixels=", length6, " crc32=");
                    sb6.append(b3);
                    sb6.append(" nonZero=");
                    sb6.append(i47);
                    sb6.append(" full31=");
                    lb1.x(sb6, i48, str8, i52, " mean=");
                    sb6.append(format);
                    sb6.append(str19);
                    sb6.append(a4);
                    str12 = str20;
                    Log.w(str12, sb6.toString());
                }
            }
            vj5Var21 = vj5Var41;
            str12 = str10;
            set6 = set10;
            Log.w(str12, str13 + str9 + " kind=renderer3dCoverage unavailable=1");
        } else {
            vj5Var21 = vj5Var41;
            str12 = str10;
            set6 = set10;
        }
        Set set11 = set6;
        if ((set11.contains(vj5.SCREEN_FRAME) && f(iArr78)) || ((set11.contains(vj5.PACKED_TOP_PRIMARY) && f(iArr83)) || ((set11.contains(vj5.PACKED_BOTTOM_PRIMARY) && f(iArr85)) || ((set11.contains(vj5.PACKED_TOP_PLANE1) && f(iArr84)) || ((set11.contains(vj5.PACKED_TOP_CONTROL) && f(iArr66)) || ((set11.contains(vj5.PACKED_BOTTOM_PLANE1) && f(iArr81)) || ((set11.contains(vj5.PACKED_BOTTOM_CONTROL) && f(iArr104)) || ((set11.contains(vj5.CAPTURE3D_SOURCE_DS_FRAME) && f(iArr82)) || ((set11.contains(vj5.CAPTURE_LINE_USES_3D_MASK) && f(iArr68)) || ((set11.contains(vj5.COMP4_TOP_PLACEHOLDER) && f(iArr70)) || ((set11.contains(vj5.COMP4_BOTTOM_PLACEHOLDER) && f(iArr72)) || ((set11.contains(vj5.CAPTURE_FALLBACK_MASK) && f(iArr74)) || ((set11.contains(vj5.SOFT_PACKED_FRAME_META_JSON) && str7 != null && !qs6.v0(str7)) || ((set11.contains(vj5.COMPOSITED_FRAME) && f(iArr77)) || ((set11.contains(vj5.RENDERER3D_FRAME) && f(iArr79)) || ((set11.contains(vj5.RENDERER3D_CAPTURE_FRAME) && f(iArr103)) || ((set11.contains(vj5.RENDERER3D_DEPTH) && f(iArr54)) || ((set11.contains(vj5.RENDERER3D_ATTR) && f(iArr101)) || (set11.contains(vj5Var21) && f(iArr102)))))))))))))))))))) {
            r11 = 1;
        } else {
            r11 = 0;
        }
        Log.w(str12, str13 + str9 + " stage=end success=" + ((int) r11));
        str9.getClass();
        return new ak5(file3, str9, r11);
    }
}
