package w;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.preference.Preference;
import j0.a2;
import j0.b2;
import j0.c2;
import j0.d2;
import j0.e2;
import j0.f2;
import j0.l2;
import j0.n2;
import j0.r1;
import j0.v1;
import j0.w1;
import j0.z1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 {
    public final d0.c B;
    public final t0 C;
    public final f0.b D;

    /* renamed from: k  reason: collision with root package name */
    public final String f13887k;

    /* renamed from: l  reason: collision with root package name */
    public final l7.a f13888l;
    public final x.j m;

    /* renamed from: n  reason: collision with root package name */
    public final a0.b f13889n;

    /* renamed from: o  reason: collision with root package name */
    public final int f13890o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f13891p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f13892q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f13893r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f13894s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f13895t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f13896u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f13897v;

    /* renamed from: w  reason: collision with root package name */
    public j0.l f13898w;

    /* renamed from: y  reason: collision with root package name */
    public final q0 f13900y;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f13877a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f13878b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f13879c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f13880d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f13881e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f13882f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f13883g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f13884h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f13885i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f13886j = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f13899x = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    public final x8.e f13901z = new x8.e(1);
    public final a0.f A = new a0.f(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x054d  */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b1(android.content.Context r17, java.lang.String r18, x.p r19, l7.a r20, f0.b r21) {
        /*
            Method dump skipped, instructions count: 1483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.b1.<init>(android.content.Context, java.lang.String, x.p, l7.a, f0.b):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    public static Range d(Range range, int i2, Range[] rangeArr) {
        Range range2 = j0.k.f7234h;
        if (range2.equals(range) || rangeArr == null) {
            return range2;
        }
        Range range3 = new Range(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i2)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i2)));
        int length = rangeArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            Range range4 = rangeArr[i11];
            Objects.requireNonNull(range4);
            if (i2 >= ((Integer) range4.getLower()).intValue()) {
                if (range2.equals(j0.k.f7234h)) {
                    range2 = range4;
                }
                if (range4.equals(range3)) {
                    return range4;
                }
                try {
                    int i12 = i(range4.intersect(range3));
                    if (i10 == 0) {
                        i10 = i12;
                    } else {
                        if (i12 >= i10) {
                            double i13 = i(range2.intersect(range3));
                            double i14 = i(range4.intersect(range3));
                            double i15 = i14 / i(range4);
                            double i16 = i13 / i(range2);
                            int i17 = (i14 > i13 ? 1 : (i14 == i13 ? 0 : -1));
                            i10 = i17 <= 0 ? i(range3.intersect(range2)) : i(range3.intersect(range2));
                        }
                        range4 = range2;
                    }
                } catch (IllegalArgumentException unused) {
                    if (i10 == 0) {
                        if (h(range4, range3) >= h(range2, range3)) {
                            if (h(range4, range3) == h(range2, range3)) {
                                if (((Integer) range4.getLower()).intValue() <= ((Integer) range2.getUpper()).intValue() && i(range4) >= i(range2)) {
                                }
                            }
                        }
                    }
                }
                range2 = range4;
            }
        }
        return range2;
    }

    public static Size f(StreamConfigurationMap streamConfigurationMap, int i2, boolean z10, Rational rational) {
        Size[] sizeArr;
        Size[] highResolutionOutputSizes;
        try {
            if (i2 == 34) {
                sizeArr = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            } else {
                sizeArr = streamConfigurationMap.getOutputSizes(i2);
            }
        } catch (Throwable unused) {
            sizeArr = null;
        }
        if (sizeArr != null && sizeArr.length != 0) {
            if (rational != null) {
                ArrayList arrayList = new ArrayList();
                for (Size size : sizeArr) {
                    if (k0.b.a(rational, size)) {
                        arrayList.add(size);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sizeArr = (Size[]) arrayList.toArray(new Size[0]);
                }
            }
            if (sizeArr != null || sizeArr.length == 0) {
                return null;
            }
            k0.c cVar = new k0.c(false);
            Size size2 = (Size) Collections.max(Arrays.asList(sizeArr), cVar);
            Size size3 = q0.a.f12087a;
            if (z10 && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i2)) != null && highResolutionOutputSizes.length > 0) {
                size3 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), cVar);
            }
            return (Size) Collections.max(Arrays.asList(size2, size3), cVar);
        }
        sizeArr = null;
        if (sizeArr != null) {
        }
        return null;
    }

    public static int h(Range range, Range range2) {
        boolean z10;
        if (!range.contains((Range) ((Integer) range2.getUpper())) && !range.contains((Range) ((Integer) range2.getLower()))) {
            z10 = true;
        } else {
            z10 = false;
        }
        p7.m.o("Ranges must not intersect", z10);
        if (((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue()) {
            return ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue();
        }
        return ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int i(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public static Range m(Range range, Range range2, boolean z10) {
        boolean z11;
        Range range3 = j0.k.f7234h;
        if (range3.equals(range2) && range3.equals(range)) {
            return range3;
        }
        if (range3.equals(range2)) {
            return range;
        }
        if (range3.equals(range)) {
            return range2;
        }
        if (z10) {
            if (range == range2) {
                z11 = true;
            } else {
                z11 = false;
            }
            p7.m.o("All targetFrameRate should be the same if strict fps is required", z11);
            return range;
        }
        try {
            return range2.intersect(range);
        } catch (IllegalArgumentException unused) {
            return range2;
        }
    }

    public final boolean a(c cVar, List list, Map map, List list2, List list3) {
        boolean z10;
        List<a2> list4;
        Size size;
        Range range;
        String sb2;
        boolean z11 = cVar.f13905d;
        boolean z12 = cVar.f13909h;
        HashMap hashMap = this.f13883g;
        if (hashMap.containsKey(cVar)) {
            list4 = (List) hashMap.get(cVar);
            z10 = true;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = cVar.f13902a;
            if (z12) {
                ArrayList arrayList2 = this.f13882f;
                if (arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    d2 d2Var = d2.PRIV;
                    b2 b2Var = b2.S1080P_16_9;
                    arrayList3.add(new a2(f2.a(d2Var, b2Var)));
                    b2 b2Var2 = b2.S720P_16_9;
                    arrayList3.add(new a2(f2.a(d2Var, b2Var2)));
                    b2 b2Var3 = b2.MAXIMUM_16_9;
                    arrayList3.addAll(p7.n.e(b2Var, b2Var3));
                    b2 b2Var4 = b2.UHD;
                    arrayList3.addAll(p7.n.e(b2Var, b2Var4));
                    arrayList3.addAll(p7.n.e(b2Var, b2.S1440P_16_9));
                    arrayList3.addAll(p7.n.e(b2Var, b2Var));
                    arrayList3.addAll(p7.n.e(b2Var2, b2Var3));
                    arrayList3.addAll(p7.n.e(b2Var2, b2Var4));
                    arrayList3.addAll(p7.n.e(b2Var2, b2Var));
                    b2 b2Var5 = b2.X_VGA;
                    b2 b2Var6 = b2.MAXIMUM_4_3;
                    arrayList3.addAll(p7.n.e(b2Var5, b2Var6));
                    arrayList3.addAll(p7.n.e(b2.S1080P_4_3, b2Var6));
                    arrayList2.addAll(arrayList3);
                }
                arrayList.addAll(arrayList2);
            } else if (cVar.f13906e) {
                ArrayList arrayList4 = this.f13885i;
                if (arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    a2 a2Var = new a2();
                    d2 d2Var2 = d2.JPEG_R;
                    b2 b2Var7 = b2.MAXIMUM;
                    a2 a10 = kc.a.a(d2Var2, b2Var7, a2Var, arrayList5, a2Var);
                    kc.a.n(d2.PRIV, b2.PREVIEW, a10, d2Var2, b2Var7);
                    arrayList5.add(a10);
                    arrayList4.addAll(arrayList5);
                }
                if (i2 == 0) {
                    arrayList.addAll(arrayList4);
                }
            } else if (cVar.f13907f) {
                ArrayList arrayList6 = this.f13881e;
                if (arrayList6.isEmpty()) {
                    t0 t0Var = this.C;
                    if (((Boolean) t0Var.f14051b.getValue()).booleanValue()) {
                        arrayList6.clear();
                        Size size2 = (Size) t0Var.f14052c.getValue();
                        if (size2 != null) {
                            j0.l l10 = l(34);
                            ArrayList arrayList7 = new ArrayList();
                            z1 z1Var = f2.f7192e;
                            l10.getClass();
                            f2 P = pc.a.P(34, size2, l10, 0, c2.CAPTURE_SESSION_TABLES, f2.f7192e);
                            a2 a2Var2 = new a2();
                            a2Var2.a(P);
                            arrayList7.add(a2Var2);
                            a2 a2Var3 = new a2();
                            a2Var3.a(P);
                            a2Var3.a(P);
                            arrayList7.add(a2Var3);
                            arrayList6.addAll(arrayList7);
                        }
                    }
                }
                arrayList.addAll(arrayList6);
            } else {
                int i10 = cVar.f13904c;
                if (i10 == 8) {
                    z10 = true;
                    if (i2 != 1) {
                        ArrayList arrayList8 = this.f13877a;
                        if (i2 != 2) {
                            if (z11) {
                                arrayList8 = this.f13880d;
                            }
                            arrayList.addAll(arrayList8);
                        } else {
                            arrayList.addAll(this.f13878b);
                            arrayList.addAll(arrayList8);
                        }
                    } else {
                        arrayList = this.f13879c;
                    }
                } else {
                    z10 = true;
                    if (i10 == 10 && i2 == 0) {
                        arrayList.addAll(this.f13884h);
                    }
                }
                hashMap.put(cVar, arrayList);
                list4 = arrayList;
            }
            z10 = true;
            hashMap.put(cVar, arrayList);
            list4 = arrayList;
        }
        boolean z13 = false;
        boolean z14 = false;
        for (a2 a2Var4 : list4) {
            if (a2Var4.c(list) != null) {
                z14 = z10;
                continue;
            } else {
                z14 = false;
                continue;
            }
            if (z14) {
                break;
            }
        }
        if (z14 && z12) {
            Range range2 = cVar.f13910i;
            v1 v1Var = new v1();
            int i11 = 0;
            while (i11 < list.size()) {
                f2 f2Var = (f2) list.get(i11);
                j0.l l11 = l(f2Var.f7199d);
                int i12 = f2Var.f7199d;
                l11.getClass();
                HashMap hashMap2 = l11.f7251f;
                b2 b2Var8 = f2Var.f7197b;
                switch (e2.f7177a[b2Var8.ordinal()]) {
                    case DSiCameraSource.FrontCamera /* 1 */:
                        size = l11.f7248c;
                        break;
                    case 2:
                        size = l11.f7250e;
                        break;
                    case 3:
                        size = (Size) hashMap2.get(Integer.valueOf(i12));
                        break;
                    case 4:
                        size = (Size) hashMap2.get(Integer.valueOf(i12));
                        break;
                    case l1.c.f8511g /* 5 */:
                        size = (Size) hashMap2.get(Integer.valueOf(i12));
                        break;
                    case l1.c.f8509e /* 6 */:
                        size = (Size) l11.f7254i.get(Integer.valueOf(i12));
                        break;
                    case 7:
                        a0.j.p("Not supported config size");
                        return z13;
                    default:
                        size = b2Var8.getRelatedFixedSize();
                        break;
                }
                size.getClass();
                l2 l2Var = (l2) list2.get(((Integer) list3.get(i11)).intValue());
                d0.a0 a0Var = (d0.a0) map.get(f2Var);
                Objects.requireNonNull(a0Var);
                l2Var.getClass();
                j0.u0 u0Var = new j0.u0(size, l2Var.y());
                f0.g.Companion.getClass();
                Class<?> surfaceClass = f0.e.b(l2Var).getSurfaceClass();
                if (surfaceClass != null) {
                    u0Var.f7304j = surfaceClass;
                }
                r1 d4 = r1.d(l2Var, size);
                d0.i1 i1Var = d4.f7282b;
                boolean z15 = z11;
                d4.b(u0Var, a0Var, -1);
                if (j0.k.f7234h.equals(range2)) {
                    range = g0.c.f5003d;
                } else {
                    range = range2;
                }
                i1Var.getClass();
                ((j0.g1) i1Var.R).o(j0.p0.f7273j, range);
                if (z15) {
                    i1Var.getClass();
                    ((j0.g1) i1Var.R).o(l2.O, 2);
                }
                v1Var.a(d4.c());
                boolean c4 = v1Var.c();
                StringBuilder sb3 = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
                sb3.append(l2Var);
                sb3.append(" with ");
                sb3.append(f2Var);
                sb3.append(" due to [");
                if (!v1Var.m) {
                    sb2 = "Template is not set";
                } else {
                    sb2 = v1Var.f7311l.toString();
                }
                sb3.append(sb2);
                sb3.append("]; surfaceConfigList = ");
                sb3.append(list);
                sb3.append(", featureSettings = ");
                sb3.append(cVar);
                sb3.append(", newUseCaseConfigs = ");
                sb3.append(list2);
                p7.m.o(sb3.toString(), c4);
                i11++;
                z11 = z15;
                z13 = false;
            }
            w1 b10 = v1Var.b();
            boolean a11 = this.D.a(b10);
            for (j0.u0 u0Var2 : b10.b()) {
                u0Var2.a();
            }
            return a11;
        }
        return z14;
    }

    public final c b(int i2, boolean z10, HashMap hashMap, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range range, boolean z16) {
        int i10;
        Range range2;
        Range range3;
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((d0.a0) it.next()).f3327b == 10) {
                    i10 = 10;
                    break;
                }
            } else {
                i10 = 8;
                break;
            }
        }
        String str = "CONCURRENT_CAMERA";
        String str2 = this.f13887k;
        if (i2 != 0 && z12) {
            if (i2 != 1) {
                if (i2 == 2) {
                    str = "ULTRA_HIGH_RESOLUTION_CAMERA";
                } else {
                    str = "DEFAULT";
                }
            }
            throw new IllegalArgumentException("Camera device id is " + str2 + ". Ultra HDR is not currently supported in " + str + " camera mode.");
        } else if (i2 != 0 && i10 == 10) {
            if (i2 != 1) {
                if (i2 == 2) {
                    str = "ULTRA_HIGH_RESOLUTION_CAMERA";
                } else {
                    str = "DEFAULT";
                }
            }
            throw new IllegalArgumentException("Camera device id is " + str2 + ". 10 bit dynamic range is not currently supported in " + str + " camera mode.");
        } else if (i2 != 0 && z14) {
            if (i2 != 1) {
                if (i2 == 2) {
                    str = "ULTRA_HIGH_RESOLUTION_CAMERA";
                } else {
                    str = "DEFAULT";
                }
            }
            throw new IllegalArgumentException("Camera device id is " + str2 + ". Feature combination query is not currently supported in " + str + " camera mode.");
        } else if (z13 && z14) {
            a0.j.h("High-speed session is not supported with feature combination");
            return null;
        } else if (z13 && !((Boolean) this.C.f14051b.getValue()).booleanValue()) {
            a0.j.h("High-speed session is not supported on this device.");
            return null;
        } else {
            if (z14) {
                range2 = range;
                if (range2 == j0.k.f7234h && z15) {
                    range3 = g0.c.f5003d;
                    return new c(i2, z10, i10, z11, z12, z13, z14, z15, range3, z16);
                }
            } else {
                range2 = range;
            }
            range3 = range2;
            return new c(i2, z10, i10, z11, z12, z13, z14, z15, range3, z16);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r11 = this;
            w.q0 r0 = r11.f13900y
            android.util.Size r4 = r0.e()
            r0 = 0
            r1 = 0
            java.lang.String r2 = r11.f13887k     // Catch: java.lang.NumberFormatException -> L4e
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L4e
            l7.a r3 = r11.f13888l     // Catch: java.lang.NumberFormatException -> L4e
            r5 = 8
            int[] r6 = new int[r5]     // Catch: java.lang.NumberFormatException -> L4e
            r6 = {x00cc: FILL_ARRAY_DATA  , data: [1, 13, 10, 8, 12, 6, 5, 4} // fill-array     // Catch: java.lang.NumberFormatException -> L4e
            r7 = r1
        L18:
            if (r7 >= r5) goto L49
            r8 = r6[r7]     // Catch: java.lang.NumberFormatException -> L4e
            int r9 = r3.A     // Catch: java.lang.NumberFormatException -> L4e
            switch(r9) {
                case 18: goto L26;
                default: goto L21;
            }     // Catch: java.lang.NumberFormatException -> L4e
        L21:
            boolean r9 = android.media.CamcorderProfile.hasProfile(r2, r8)     // Catch: java.lang.NumberFormatException -> L4e
            goto L2a
        L26:
            boolean r9 = android.media.CamcorderProfile.hasProfile(r2, r8)     // Catch: java.lang.NumberFormatException -> L4e
        L2a:
            if (r9 == 0) goto L46
            int r9 = r3.A     // Catch: java.lang.NumberFormatException -> L4e
            switch(r9) {
                case 18: goto L36;
                default: goto L31;
            }     // Catch: java.lang.NumberFormatException -> L4e
        L31:
            android.media.CamcorderProfile r8 = android.media.CamcorderProfile.get(r2, r8)     // Catch: java.lang.NumberFormatException -> L4e
            goto L3a
        L36:
            android.media.CamcorderProfile r8 = android.media.CamcorderProfile.get(r2, r8)     // Catch: java.lang.NumberFormatException -> L4e
        L3a:
            if (r8 == 0) goto L46
            android.util.Size r2 = new android.util.Size     // Catch: java.lang.NumberFormatException -> L4e
            int r3 = r8.videoFrameWidth     // Catch: java.lang.NumberFormatException -> L4e
            int r5 = r8.videoFrameHeight     // Catch: java.lang.NumberFormatException -> L4e
            r2.<init>(r3, r5)     // Catch: java.lang.NumberFormatException -> L4e
            goto L4a
        L46:
            int r7 = r7 + 1
            goto L18
        L49:
            r2 = r0
        L4a:
            if (r2 == 0) goto L4e
        L4c:
            r6 = r2
            goto L97
        L4e:
            x.j r2 = r11.m
            p1.c1 r2 = r2.c()
            java.lang.Object r2 = r2.A     // Catch: java.lang.Throwable -> L63
            rd.k r2 = (rd.k) r2     // Catch: java.lang.Throwable -> L63
            java.lang.Object r2 = r2.B     // Catch: java.lang.Throwable -> L63
            android.hardware.camera2.params.StreamConfigurationMap r2 = (android.hardware.camera2.params.StreamConfigurationMap) r2     // Catch: java.lang.Throwable -> L63
            java.lang.Class<android.media.MediaRecorder> r3 = android.media.MediaRecorder.class
            android.util.Size[] r2 = r2.getOutputSizes(r3)     // Catch: java.lang.Throwable -> L63
            goto L64
        L63:
            r2 = r0
        L64:
            if (r2 != 0) goto L67
            goto L90
        L67:
            k0.c r3 = new k0.c
            r5 = 1
            r3.<init>(r5)
            java.util.Arrays.sort(r2, r3)
            int r3 = r2.length
        L71:
            if (r1 >= r3) goto L90
            r5 = r2[r1]
            int r6 = r5.getWidth()
            android.util.Size r7 = q0.a.f12091e
            int r8 = r7.getWidth()
            if (r6 > r8) goto L8d
            int r6 = r5.getHeight()
            int r7 = r7.getHeight()
            if (r6 > r7) goto L8d
            r0 = r5
            goto L90
        L8d:
            int r1 = r1 + 1
            goto L71
        L90:
            if (r0 == 0) goto L94
            r6 = r0
            goto L97
        L94:
            android.util.Size r2 = q0.a.f12089c
            goto L4c
        L97:
            android.util.Size r2 = q0.a.f12088b
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            j0.l r1 = new j0.l
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f13898w = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.b1.c():void");
    }

    public final int e(int i2, Size size, boolean z10) {
        boolean z11;
        long j2;
        if (z10 && i2 != 34) {
            z11 = false;
        } else {
            z11 = true;
        }
        List list = null;
        p7.m.o(null, z11);
        if (z10) {
            t0 t0Var = this.C;
            t0Var.getClass();
            size.getClass();
            List c4 = t0Var.c(size);
            if (!c4.isEmpty()) {
                list = c4;
            }
            if (list == null) {
                aj.g.y0("HighSpeedResolver", "No supported high speed  fps for " + size);
                return 0;
            }
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Integer num = (Integer) ((Range) it.next()).getUpper();
                while (it.hasNext()) {
                    Integer num2 = (Integer) ((Range) it.next()).getUpper();
                    if (num.compareTo(num2) < 0) {
                        num = num2;
                    }
                }
                num.getClass();
                return num.intValue();
            }
            fj.j.l();
            return 0;
        }
        p1.c1 c10 = this.m.c();
        Objects.requireNonNull(c10);
        try {
            j2 = ((StreamConfigurationMap) ((rd.k) c10.A).B).getOutputMinFrameDuration(i2, size);
        } catch (RuntimeException e6) {
            aj.g.z0("StreamConfigurationMapCompat", "Failed to get min frame duration for format = " + i2 + " and size = " + size, e6);
            j2 = 0L;
        }
        if (j2 <= 0) {
            if (this.f13896u) {
                aj.g.y0("SupportedSurfaceCombination", "minFrameDuration: " + j2 + " is invalid for imageFormat = " + i2 + ", size = " + size);
                return 0;
            }
            return Preference.DEFAULT_ORDER;
        }
        return (int) (1.0E9d / j2);
    }

    public final List g(c cVar, List list, HashMap hashMap, HashMap hashMap2) {
        int i2;
        List list2;
        n2 n2Var;
        j0.g gVar = z0.f14105a;
        if (cVar.f13902a == 0 && cVar.f13904c == 8 && !cVar.f13907f) {
            ArrayList arrayList = this.f13886j;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                List c4 = ((a2) obj).c(list);
                if (c4 != null) {
                    j0.g gVar2 = z0.f14105a;
                    int size2 = c4.size();
                    int i12 = i10;
                    while (true) {
                        i2 = 1;
                        if (i12 >= size2) {
                            break;
                        }
                        long value = ((f2) c4.get(i12)).f7198c.getValue();
                        if (hashMap.containsKey(Integer.valueOf(i12))) {
                            j0.e eVar = (j0.e) hashMap.get(Integer.valueOf(i12));
                            eVar.getClass();
                            List list3 = eVar.f7170e;
                            if (list3.size() == 1) {
                                n2Var = (n2) list3.get(i10);
                            } else {
                                n2Var = n2.STREAM_SHARING;
                            }
                            n2Var.getClass();
                            if (!z0.b(n2Var, value, list3)) {
                                i2 = i10;
                                break;
                            }
                            i12++;
                            i10 = 0;
                        } else if (hashMap2.containsKey(Integer.valueOf(i12))) {
                            Object obj2 = hashMap2.get(Integer.valueOf(i12));
                            obj2.getClass();
                            l2 l2Var = (l2) obj2;
                            n2 r5 = l2Var.r();
                            r5.getClass();
                            if (l2Var.r() == n2.STREAM_SHARING) {
                                list2 = (List) ((v0.e) l2Var).g(v0.e.B);
                                list2.getClass();
                            } else {
                                list2 = zb.q.A;
                            }
                            if (!z0.b(r5, value, list2)) {
                                i2 = 0;
                                break;
                            }
                            i12++;
                            i10 = 0;
                        } else {
                            throw new AssertionError("SurfaceConfig does not map to any use case");
                        }
                    }
                    q1.e eVar2 = new q1.e(10, this, c4);
                    if (i2 != 0 && ((Boolean) eVar2.b()).booleanValue()) {
                        return c4;
                    }
                }
                i10 = 0;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x04cd, code lost:
        r6 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j0.g2 j(int r32, java.util.ArrayList r33, java.util.HashMap r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.b1.j(int, java.util.ArrayList, java.util.HashMap, boolean, boolean, boolean):j0.g2");
    }

    public final Pair k(c cVar, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i2, HashMap hashMap, HashMap hashMap2) {
        c2 c2Var;
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j0.e eVar = (j0.e) obj;
            arrayList4.add(eVar.f7166a);
            hashMap.put(Integer.valueOf(arrayList4.size() - 1), eVar);
        }
        int i11 = i2;
        for (int i12 = 0; i12 < list.size(); i12++) {
            Size size2 = (Size) list.get(i12);
            l2 l2Var = (l2) arrayList2.get(((Integer) arrayList3.get(i12)).intValue());
            int y10 = l2Var.y();
            z1 n10 = l2Var.n();
            if (cVar.f13909h) {
                c2Var = c2.FEATURE_COMBINATION_TABLE;
            } else {
                c2Var = c2.CAPTURE_SESSION_TABLES;
            }
            c2 c2Var2 = c2Var;
            j0.l l10 = l(y10);
            int i13 = cVar.f13902a;
            z1 z1Var = f2.f7192e;
            arrayList4.add(pc.a.P(y10, size2, l10, i13, c2Var2, n10));
            hashMap2.put(Integer.valueOf(arrayList4.size() - 1), l2Var);
            i11 = Math.min(i11, e(l2Var.y(), size2, cVar.f13907f));
        }
        return new Pair(arrayList4, Integer.valueOf(i11));
    }

    public final j0.l l(int i2) {
        CameraCharacteristics.Key key;
        Integer valueOf = Integer.valueOf(i2);
        ArrayList arrayList = this.f13899x;
        if (!arrayList.contains(valueOf)) {
            p(this.f13898w.f7247b, q0.a.f12090d, i2);
            p(this.f13898w.f7249d, q0.a.f12092f, i2);
            o(this.f13898w.f7251f, i2, null);
            o(this.f13898w.f7252g, i2, k0.b.f7938a);
            o(this.f13898w.f7253h, i2, k0.b.f7940c);
            HashMap hashMap = this.f13898w.f7254i;
            if (Build.VERSION.SDK_INT >= 31 && this.f13895t) {
                x.j jVar = this.m;
                key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) jVar.a(key);
                if (streamConfigurationMap != null) {
                    hashMap.put(Integer.valueOf(i2), f(streamConfigurationMap, i2, true, null));
                }
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return this.f13898w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0278  */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [zb.q] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [j0.g2] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j0.g2 n(w.c r45, java.util.ArrayList r46, java.util.Map r47, java.util.ArrayList r48, java.util.ArrayList r49, java.util.HashMap r50) {
        /*
            Method dump skipped, instructions count: 2582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.b1.n(w.c, java.util.ArrayList, java.util.Map, java.util.ArrayList, java.util.ArrayList, java.util.HashMap):j0.g2");
    }

    public final void o(HashMap hashMap, int i2, Rational rational) {
        Size f8 = f((StreamConfigurationMap) ((rd.k) this.m.c().A).B, i2, true, rational);
        if (f8 != null) {
            hashMap.put(Integer.valueOf(i2), f8);
        }
    }

    public final void p(HashMap hashMap, Size size, int i2) {
        if (!this.f13893r) {
            return;
        }
        Size f8 = f((StreamConfigurationMap) ((rd.k) this.m.c().A).B, i2, false, null);
        Integer valueOf = Integer.valueOf(i2);
        if (f8 != null) {
            size = (Size) Collections.min(Arrays.asList(size, f8), new k0.c(false));
        }
        hashMap.put(valueOf, size);
    }
}
