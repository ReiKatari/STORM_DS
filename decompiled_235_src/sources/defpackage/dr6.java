package defpackage;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dr6  reason: default package */
/* loaded from: classes.dex */
public final class dr6 {
    public final lp4 a;
    public final LinkedHashMap b;
    public final s35 c;

    public dr6(StreamConfigurationMap streamConfigurationMap, lp4 lp4Var) {
        s35 s35Var;
        lp4Var.getClass();
        this.a = lp4Var;
        this.b = new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        if (Build.VERSION.SDK_INT >= 34) {
            s35Var = new s35(streamConfigurationMap);
        } else {
            s35Var = new s35(streamConfigurationMap);
        }
        this.c = s35Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (r3.equalsIgnoreCase("Motorola") != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Size[] a(int i) {
        Size[] sizeArr;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.b;
        Size[] sizeArr2 = null;
        if (linkedHashMap.containsKey(valueOf)) {
            Size[] sizeArr3 = (Size[]) linkedHashMap.get(Integer.valueOf(i));
            if (sizeArr3 == null) {
                return null;
            }
            return (Size[]) sizeArr3.clone();
        }
        try {
            sizeArr2 = this.c.y(i);
        } catch (Throwable th) {
            kj2.g0("StreamConfigurationMapCompat", "Failed to get output sizes for " + i, th);
        }
        if (sizeArr2 != null && sizeArr2.length != 0) {
            lp4 lp4Var = this.a;
            lp4Var.getClass();
            sizeArr2.getClass();
            ArrayList arrayList = new ArrayList(new ku(sizeArr2, false));
            if (lp4Var.c != null) {
                if (i == 34) {
                    String str = Build.MANUFACTURER;
                    str.getClass();
                    if (!str.equalsIgnoreCase("Motorola")) {
                        String str2 = Build.BRAND;
                        str2.getClass();
                    }
                    if ("moto e5 play".equalsIgnoreCase(Build.MODEL)) {
                        sizeArr = new Size[]{new Size(1440, 1080), new Size(960, 720)};
                        if (sizeArr.length != 0) {
                            List asList = Arrays.asList(sizeArr);
                            asList.getClass();
                            arrayList.addAll(asList);
                        }
                    }
                }
                sizeArr = new Size[0];
                if (sizeArr.length != 0) {
                }
            }
            lg0 lg0Var = lp4Var.a;
            if (lg0Var != null && lp4Var.b != null) {
                String str3 = ((qc0) lg0Var).A;
                str3.getClass();
                boolean E = nb3.E();
                Collection<?> collection = yt1.A;
                if (E) {
                    if (str3.equals("0") && i == 256) {
                        collection = hf.c0(new Size(4160, 3120), new Size(4000, 3000));
                    }
                } else if (nb3.F()) {
                    if (str3.equals("0") && i == 256) {
                        collection = hf.c0(new Size(4160, 3120), new Size(4000, 3000));
                    }
                } else if (nb3.C()) {
                    if (str3.equals("0") && (i == 34 || i == 35)) {
                        collection = hf.c0(new Size(720, 720), new Size(400, 400));
                    }
                } else if (nb3.J()) {
                    if (str3.equals("0")) {
                        if (i != 34) {
                            if (i == 35) {
                                collection = hf.c0(new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                            }
                        } else {
                            collection = hf.c0(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                        }
                    } else if (str3.equals("1") && (i == 34 || i == 35)) {
                        collection = hf.c0(new Size(3264, 2448), new Size(3264, 1836), new Size(2448, 2448), new Size(1920, 1920), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    }
                } else if (nb3.I()) {
                    if (str3.equals("0")) {
                        if (i != 34) {
                            if (i == 35) {
                                collection = hf.c0(new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                            }
                        } else {
                            collection = hf.c0(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                        }
                    } else if (str3.equals("1") && (i == 34 || i == 35)) {
                        collection = hf.c0(new Size(2576, 1932), new Size(2560, 1440), new Size(1920, 1920), new Size(2048, 1536), new Size(2048, 1152), new Size(1920, 1080));
                    }
                } else if (nb3.G()) {
                    if (str3.equals("0") && i == 256) {
                        collection = hf.b0(new Size(9280, 6944));
                    }
                } else if (nb3.H()) {
                    if (i == 35) {
                        collection = hf.c0(new Size(3840, 2160), new Size(3264, 2448), new Size(3200, 2400), new Size(2688, 1512), new Size(2592, 1944), new Size(2592, 1940), new Size(1920, 1440));
                    }
                } else if (nb3.D()) {
                    if (i == 35) {
                        collection = hf.c0(new Size(4032, 3024), new Size(4000, 3000), new Size(3264, 2448), new Size(3200, 2400), new Size(3024, 3024), new Size(2976, 2976), new Size(2448, 2448));
                    }
                } else if (nb3.K()) {
                    if (str3.equals("1") && i == 35) {
                        collection = hf.c0(new Size(1280, 720), new Size(1920, 1080), new Size(2304, 1296), new Size(640, 360), new Size(177, 144), new Size(2336, 1080), new Size(2400, 1080), new Size(1920, 824), new Size(1088, 1088), new Size(1728, 1728), new Size(2736, 2736), new Size(1824, 712));
                    }
                } else {
                    kj2.f0("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                }
                Collection<?> collection2 = collection;
                if (!collection2.isEmpty()) {
                    arrayList.removeAll(collection2);
                }
            }
            if (arrayList.isEmpty()) {
                kj2.f0("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
            }
            Size[] sizeArr4 = (Size[]) arrayList.toArray(new Size[0]);
            linkedHashMap.put(Integer.valueOf(i), sizeArr4);
            return (Size[]) sizeArr4.clone();
        }
        kj2.f0("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
        return sizeArr2;
    }
}
