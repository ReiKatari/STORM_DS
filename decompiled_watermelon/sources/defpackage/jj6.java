package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jj6  reason: default package */
/* loaded from: classes.dex */
public final class jj6 {
    public final vn1 A;
    public final qh B;
    public final mr2 C;
    public final ce0 a;
    public final nz1 b;
    public final e52 c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final LinkedHashMap l;
    public final ArrayList m;
    public final ArrayList n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public ox v;
    public final ArrayList w;
    public final nf6 x;
    public final wg1 y;
    public final lv3 z;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x03bf, code lost:
        if (defpackage.ct3.S0() != false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jj6(android.content.Context r35, defpackage.ce0 r36, defpackage.nz1 r37, defpackage.e52 r38) {
        /*
            Method dump skipped, instructions count: 1933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj6.<init>(android.content.Context, ce0, nz1, e52):void");
    }

    public static Range c(Range range, int i, Range[] rangeArr) {
        Range range2 = jx.h;
        if (b53.x(range, range2)) {
            range2.getClass();
            return range2;
        } else if (rangeArr == null) {
            range2.getClass();
            return range2;
        } else {
            Comparable lower = range.getLower();
            lower.getClass();
            Integer valueOf = Integer.valueOf(Math.min(((Number) lower).intValue(), i));
            Comparable upper = range.getUpper();
            upper.getClass();
            Range range3 = new Range(valueOf, Integer.valueOf(Math.min(((Number) upper).intValue(), i)));
            int length = rangeArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Range range4 = rangeArr[i2];
                if (i >= ((Number) range4.getLower()).intValue()) {
                    if (b53.x(range2, jx.h)) {
                        range2 = range4;
                    }
                    if (range4.equals(range3)) {
                        range2 = range4;
                        break;
                    }
                    try {
                        Range intersect = range4.intersect(range3);
                        intersect.getClass();
                        int h = h(intersect);
                        if (i3 == 0) {
                            range2 = range4;
                            i3 = h;
                        } else if (h >= i3) {
                            range2.getClass();
                            Range intersect2 = range2.intersect(range3);
                            intersect2.getClass();
                            double h2 = h(intersect2);
                            Range intersect3 = range4.intersect(range3);
                            intersect3.getClass();
                            double h3 = h(intersect3);
                            double h4 = h3 / h(range4);
                            double h5 = h2 / h(range2);
                            if (h3 <= h2) {
                            }
                            Range intersect4 = range3.intersect(range2);
                            intersect4.getClass();
                            i3 = h(intersect4);
                        }
                    } catch (IllegalArgumentException unused) {
                        if (i3 == 0) {
                            int g = g(range4, range3);
                            range2.getClass();
                            if (g < g(range2, range3) || (g(range4, range3) == g(range2, range3) && (((Number) range4.getLower()).intValue() > ((Number) range2.getUpper()).intValue() || h(range4) < h(range2)))) {
                                range2 = range4;
                            }
                        }
                    }
                }
                i2++;
            }
            range2.getClass();
            return range2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Size e(android.hardware.camera2.params.StreamConfigurationMap r8, int r9, boolean r10, android.util.Rational r11) {
        /*
            r0 = 34
            r1 = 0
            if (r9 != r0) goto L12
            if (r8 == 0) goto L10
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            android.util.Size[] r0 = r8.getOutputSizes(r0)     // Catch: java.lang.Throwable -> Le
            goto L1f
        Le:
            r0 = move-exception
            goto L19
        L10:
            r0 = r1
            goto L1f
        L12:
            if (r8 == 0) goto L10
            android.util.Size[] r0 = r8.getOutputSizes(r9)     // Catch: java.lang.Throwable -> Le
            goto L1f
        L19:
            kc5 r2 = new kc5
            r2.<init>(r0)
            goto L20
        L1f:
            r2 = r0
        L20:
            boolean r0 = r2 instanceof defpackage.kc5
            if (r0 == 0) goto L26
            r2 = r1
        L26:
            android.util.Size[] r2 = (android.util.Size[]) r2
            r0 = 0
            if (r2 == 0) goto L4e
            if (r11 == 0) goto L4f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.length
            r5 = r0
        L34:
            if (r5 >= r4) goto L44
            r6 = r2[r5]
            boolean r7 = defpackage.uu.a(r11, r6)
            if (r7 == 0) goto L41
            r3.add(r6)
        L41:
            int r5 = r5 + 1
            goto L34
        L44:
            android.util.Size[] r11 = new android.util.Size[r0]
            java.lang.Object[] r11 = r3.toArray(r11)
            r2 = r11
            android.util.Size[] r2 = (android.util.Size[]) r2
            goto L4f
        L4e:
            r2 = r1
        L4f:
            if (r2 == 0) goto L94
            int r11 = r2.length
            if (r11 != 0) goto L55
            goto L94
        L55:
            es0 r11 = new es0
            r11.<init>(r0)
            java.util.List r0 = java.util.Arrays.asList(r2)
            r0.getClass()
            java.lang.Object r0 = java.util.Collections.max(r0, r11)
            android.util.Size r0 = (android.util.Size) r0
            android.util.Size r2 = defpackage.x76.a
            if (r10 == 0) goto L85
            if (r8 == 0) goto L71
            android.util.Size[] r1 = r8.getHighResolutionOutputSizes(r9)
        L71:
            if (r1 == 0) goto L85
            int r8 = r1.length
            if (r8 != 0) goto L77
            goto L85
        L77:
            java.util.List r8 = java.util.Arrays.asList(r1)
            r8.getClass()
            java.lang.Object r8 = java.util.Collections.max(r8, r11)
            r2 = r8
            android.util.Size r2 = (android.util.Size) r2
        L85:
            android.util.Size[] r8 = new android.util.Size[]{r0, r2}
            java.util.List r8 = defpackage.l07.c0(r8)
            java.lang.Object r8 = java.util.Collections.max(r8, r11)
            android.util.Size r8 = (android.util.Size) r8
            return r8
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj6.e(android.hardware.camera2.params.StreamConfigurationMap, int, boolean, android.util.Rational):android.util.Size");
    }

    public static int g(Range range, Range range2) {
        if (!range.contains((Range) range2.getUpper()) && !range.contains((Range) range2.getLower())) {
            if (((Number) range.getLower()).intValue() > ((Number) range2.getUpper()).intValue()) {
                int intValue = ((Number) range.getLower()).intValue();
                Comparable upper = range2.getUpper();
                upper.getClass();
                return intValue - ((Number) upper).intValue();
            }
            int intValue2 = ((Number) range2.getLower()).intValue();
            Comparable upper2 = range.getUpper();
            upper2.getClass();
            return intValue2 - ((Number) upper2).intValue();
        }
        i.i("Ranges must not intersect");
        return 0;
    }

    public static int h(Range range) {
        int intValue = ((Number) range.getUpper()).intValue();
        Comparable lower = range.getLower();
        lower.getClass();
        return (intValue - ((Number) lower).intValue()) + 1;
    }

    public static Range n(Range range, Range range2, boolean z) {
        Range range3 = jx.h;
        if (b53.x(range2, range3) && b53.x(range, range3)) {
            range3.getClass();
            return range3;
        } else if (b53.x(range2, range3)) {
            return range;
        } else {
            if (!b53.x(range, range3)) {
                if (z) {
                    nl2.D("All targetFrameRate should be the same if strict fps is required", b53.x(range, range2));
                    return range;
                }
                try {
                    Range intersect = range2.intersect(range);
                    intersect.getClass();
                    return intersect;
                } catch (IllegalArgumentException unused) {
                }
            }
            return range2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(hj6 hj6Var, ArrayList arrayList, Map map, List list, List list2) {
        Integer num;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        List<kj6> list3;
        boolean z4;
        boolean z5;
        CameraCharacteristics.Key key;
        boolean z6;
        boolean z7;
        Size size;
        Integer num2;
        String sb;
        i97 i97Var = hj6Var.d;
        boolean z8 = hj6Var.h;
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap.containsKey(hj6Var)) {
            Object obj = linkedHashMap.get(hj6Var);
            obj.getClass();
            list3 = (List) obj;
            num = 2;
            z = z8;
            str = "Required value was null.";
            z6 = 0;
            z3 = true;
        } else {
            ArrayList arrayList2 = new ArrayList();
            int i = hj6Var.a;
            if (z8) {
                il6 il6Var = vo2.a;
                ce0 ce0Var = this.a;
                ce0Var.getClass();
                i97Var.getClass();
                ArrayList arrayList3 = new ArrayList();
                if (Build.VERSION.SDK_INT >= 35) {
                    key = CameraCharacteristics.INFO_SESSION_CONFIGURATION_QUERY_VERSION;
                    key.getClass();
                    Object c = ((ia0) ce0Var).c(key);
                    if (c != null) {
                        int intValue = ((Number) c).intValue();
                        if (intValue >= 35 && i97Var != i97.ON) {
                            arrayList3.addAll((List) vo2.a.getValue());
                        }
                        if (intValue >= 36 && i97Var != i97.PREVIEW) {
                            arrayList3.addAll((List) vo2.b.getValue());
                        }
                    } else {
                        i.i("Required value was null.");
                        return false;
                    }
                }
                arrayList2.addAll(arrayList3);
                num = 2;
                z = z8;
                str = "Required value was null.";
                z2 = false;
            } else if (hj6Var.e) {
                ArrayList arrayList4 = this.n;
                if (arrayList4.isEmpty()) {
                    il6 il6Var2 = vo2.a;
                    ArrayList arrayList5 = new ArrayList();
                    kj6 kj6Var = new kj6();
                    cg6 cg6Var = pj6.e;
                    z2 = false;
                    nj6 nj6Var = nj6.JPEG_R;
                    lj6 lj6Var = lj6.MAXIMUM;
                    z = z8;
                    cg6 cg6Var2 = pj6.e;
                    str = "Required value was null.";
                    kj6Var.a(jo1.r(nj6Var, lj6Var, cg6Var2));
                    arrayList5.add(kj6Var);
                    kj6 kj6Var2 = new kj6();
                    num = 2;
                    wh1.v(kj6Var2, jo1.r(nj6.PRIV, lj6.PREVIEW, cg6Var2), nj6Var, lj6Var, cg6Var2);
                    arrayList5.add(kj6Var2);
                    arrayList4.addAll(arrayList5);
                } else {
                    num = 2;
                    z = z8;
                    str = "Required value was null.";
                    z2 = false;
                }
                if (i == 0) {
                    arrayList2.addAll(arrayList4);
                }
            } else {
                num = 2;
                z = z8;
                str = "Required value was null.";
                z2 = false;
                if (hj6Var.f) {
                    ArrayList arrayList6 = this.k;
                    if (arrayList6.isEmpty()) {
                        mr2 mr2Var = this.C;
                        if (((Boolean) mr2Var.b.getValue()).booleanValue()) {
                            arrayList6.clear();
                            Size size2 = (Size) mr2Var.c.getValue();
                            if (size2 != null) {
                                ox m = m(34);
                                il6 il6Var3 = vo2.a;
                                ArrayList arrayList7 = new ArrayList();
                                cg6 cg6Var3 = pj6.e;
                                pj6 w = jo1.w(34, size2, m, 0, mj6.CAPTURE_SESSION_TABLES, pj6.e);
                                kj6 kj6Var3 = new kj6();
                                kj6Var3.a(w);
                                arrayList7.add(kj6Var3);
                                kj6 kj6Var4 = new kj6();
                                kj6Var4.a(w);
                                kj6Var4.a(w);
                                arrayList7.add(kj6Var4);
                                arrayList6.addAll(arrayList7);
                            }
                        }
                    }
                    arrayList2.addAll(arrayList6);
                } else {
                    int i2 = hj6Var.b;
                    if (i2 == 8) {
                        z3 = true;
                        if (i != 1) {
                            ArrayList arrayList8 = this.g;
                            if (i != 2) {
                                if (i97Var == i97.PREVIEW) {
                                    arrayList8 = this.j;
                                }
                                arrayList2.addAll(arrayList8);
                                z5 = false;
                            } else {
                                arrayList2.addAll(this.i);
                                arrayList2.addAll(arrayList8);
                                z5 = false;
                            }
                        } else {
                            list3 = this.f;
                            z4 = false;
                            linkedHashMap.put(hj6Var, list3);
                            z6 = z4;
                        }
                    } else {
                        z3 = true;
                        z5 = false;
                        z5 = false;
                        if (i2 == 10 && i == 0) {
                            arrayList2.addAll(this.m);
                            z5 = false;
                        }
                    }
                    list3 = arrayList2;
                    z4 = z5;
                    linkedHashMap.put(hj6Var, list3);
                    z6 = z4;
                }
            }
            z3 = true;
            z5 = z2;
            list3 = arrayList2;
            z4 = z5;
            linkedHashMap.put(hj6Var, list3);
            z6 = z4;
        }
        if (list3 == null || !list3.isEmpty()) {
            for (kj6 kj6Var5 : list3) {
                if (kj6Var5.c(arrayList) != null) {
                    z7 = z3;
                    break;
                }
            }
        }
        z7 = z6;
        if (z7 && z) {
            b16 b16Var = new b16();
            int size3 = arrayList.size();
            int i3 = z6;
            int i4 = i3;
            while (i4 < size3) {
                Object obj2 = arrayList.get(i4);
                int i5 = i4 + 1;
                int i6 = i3 + 1;
                if (i3 >= 0) {
                    pj6 pj6Var = (pj6) obj2;
                    ox m2 = m(pj6Var.d);
                    LinkedHashMap linkedHashMap2 = m2.f;
                    int i7 = pj6Var.d;
                    lj6 lj6Var2 = pj6Var.b;
                    switch (oj6.a[lj6Var2.ordinal()]) {
                        case 1:
                            size = m2.c;
                            break;
                        case 2:
                            size = m2.e;
                            break;
                        case 3:
                            size = (Size) linkedHashMap2.get(Integer.valueOf(i7));
                            break;
                        case 4:
                            size = (Size) linkedHashMap2.get(Integer.valueOf(i7));
                            break;
                        case 5:
                            size = (Size) linkedHashMap2.get(Integer.valueOf(i7));
                            break;
                        case ig7.b /* 6 */:
                            size = (Size) m2.i.get(Integer.valueOf(i7));
                            break;
                        case 7:
                            i.n("Not supported config size");
                            return z6;
                        default:
                            size = lj6Var2.getRelatedFixedSize();
                            break;
                    }
                    size.getClass();
                    b57 b57Var = (b57) list.get(((Number) list2.get(i3)).intValue());
                    Object obj3 = map.get(pj6Var);
                    if (obj3 != null) {
                        sm1 sm1Var = (sm1) obj3;
                        b57Var.getClass();
                        Range range = null;
                        int i8 = size3;
                        hc1 hc1Var = new hc1(b57Var.x(), size);
                        r57.Companion.getClass();
                        Class<?> surfaceClass = p57.b(b57Var).getSurfaceClass();
                        if (surfaceClass != null) {
                            hc1Var.j = surfaceClass;
                        }
                        x06 d = x06.d(b57Var, size);
                        vh0 vh0Var = d.b;
                        d.b(hc1Var, sm1Var, -1);
                        Range range2 = hj6Var.i;
                        if (!b53.x(range2, jx.h)) {
                            range = range2;
                        }
                        if (range == null) {
                            range = of2.d;
                        }
                        vh0Var.getClass();
                        ((x14) vh0Var.e).r(wh0.f, range);
                        if (i97Var == i97.PREVIEW) {
                            vh0Var.getClass();
                            num2 = num;
                            ((x14) vh0Var.e).r(b57.T, num2);
                        } else {
                            num2 = num;
                            if (i97Var == i97.ON) {
                                vh0Var.getClass();
                                ((x14) vh0Var.e).r(b57.U, num2);
                            }
                        }
                        b16Var.a(d.c());
                        boolean c2 = b16Var.c();
                        StringBuilder sb2 = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
                        sb2.append(b57Var);
                        sb2.append(" with ");
                        sb2.append(pj6Var);
                        sb2.append(" due to [");
                        if (!b16Var.m) {
                            sb = "Template is not set";
                        } else {
                            sb = b16Var.l.toString();
                        }
                        sb2.append(sb);
                        sb2.append("]; surfaceConfigList = ");
                        sb2.append(arrayList);
                        sb2.append(", featureSettings = ");
                        sb2.append(hj6Var);
                        sb2.append(", newUseCaseConfigs = ");
                        sb2.append(list);
                        nl2.D(sb2.toString(), c2);
                        i3 = i6;
                        num = num2;
                        size3 = i8;
                        i4 = i5;
                    } else {
                        i.i(str);
                        return z6;
                    }
                } else {
                    l07.v0();
                    throw null;
                }
            }
            d16 b = b16Var.b();
            boolean f = this.c.f(b);
            List<hc1> b2 = b.b();
            b2.getClass();
            for (hc1 hc1Var2 : b2) {
                hc1Var2.a();
            }
            return f;
        }
        return z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r0 != null) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r11 = this;
            wg1 r0 = r11.y
            android.util.Size r4 = r0.c()
            java.lang.String r0 = r11.d     // Catch: java.lang.NumberFormatException -> L13
            java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L13
            android.util.Size r0 = r11.i()     // Catch: java.lang.NumberFormatException -> L13
            if (r0 == 0) goto L13
        L11:
            r6 = r0
            goto L6d
        L13:
            nf6 r0 = r11.x
            dz4 r0 = r0.c
            java.lang.Object r0 = r0.A
            android.hardware.camera2.params.StreamConfigurationMap r0 = (android.hardware.camera2.params.StreamConfigurationMap) r0
            r1 = 0
            if (r0 == 0) goto L2c
            java.lang.Class<android.media.MediaRecorder> r2 = android.media.MediaRecorder.class
            android.util.Size[] r0 = r0.getOutputSizes(r2)     // Catch: java.lang.Throwable -> L25
            goto L2d
        L25:
            r0 = move-exception
            kc5 r2 = new kc5
            r2.<init>(r0)
            goto L2e
        L2c:
            r0 = r1
        L2d:
            r2 = r0
        L2e:
            boolean r0 = r2 instanceof defpackage.kc5
            if (r0 == 0) goto L34
            r2 = r1
        L34:
            android.util.Size[] r2 = (android.util.Size[]) r2
            if (r2 != 0) goto L3a
        L38:
            r0 = r1
            goto L64
        L3a:
            es0 r0 = new es0
            r3 = 1
            r0.<init>(r3)
            java.util.Arrays.sort(r2, r0)
            int r0 = r2.length
            r3 = 0
        L45:
            if (r3 >= r0) goto L38
            r5 = r2[r3]
            int r6 = r5.getWidth()
            android.util.Size r7 = defpackage.x76.e
            int r8 = r7.getWidth()
            if (r6 > r8) goto L61
            int r6 = r5.getHeight()
            int r7 = r7.getHeight()
            if (r6 > r7) goto L61
            r0 = r5
            goto L64
        L61:
            int r3 = r3 + 1
            goto L45
        L64:
            if (r0 == 0) goto L67
            goto L11
        L67:
            android.util.Size r0 = defpackage.x76.c
            r0.getClass()
            goto L11
        L6d:
            android.util.Size r2 = defpackage.x76.b
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            ox r1 = new ox
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj6.b():void");
    }

    public final int d(int i, Size size, boolean z, int i2) {
        long j;
        int i3 = 0;
        if (z) {
            if (i == 34) {
                mr2 mr2Var = this.C;
                mr2Var.getClass();
                size.getClass();
                List c = mr2Var.c(size);
                if (c.isEmpty()) {
                    c = null;
                }
                if (c == null) {
                    ve2.c0("HighSpeedResolver", "No supported high speed  fps for " + size);
                } else {
                    Iterator it = c.iterator();
                    if (it.hasNext()) {
                        Integer num = (Integer) ((Range) it.next()).getUpper();
                        while (it.hasNext()) {
                            Integer num2 = (Integer) ((Range) it.next()).getUpper();
                            if (num.compareTo(num2) < 0) {
                                num = num2;
                            }
                        }
                        num.getClass();
                        i3 = num.intValue();
                    } else {
                        vd6.b();
                        return 0;
                    }
                }
            } else {
                i.n("Check failed.");
                return 0;
            }
        } else {
            nf6 j2 = j();
            size.getClass();
            try {
                j = j2.c.t(i, size);
            } catch (RuntimeException e) {
                if (ve2.I()) {
                    Log.w("CXCP", "Unable to get min frame duration for format = " + i + " and size = " + size, e);
                }
                j = 0;
            }
            if (j <= 0) {
                if (this.u) {
                    if (ve2.I()) {
                        Log.w("CXCP", "minFrameDuration: " + j + " is invalid for imageFormat = " + i + ", size = " + size);
                    }
                } else {
                    i3 = Preference.DEFAULT_ORDER;
                }
            } else {
                i3 = (int) (1.0E9d / j);
            }
        }
        return Math.min(i2, i3);
    }

    public final List f(hj6 hj6Var, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        int i;
        List list;
        d57 d57Var;
        uw uwVar = eg6.a;
        if (hj6Var.a == 0 && hj6Var.b == 8 && !hj6Var.f) {
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                List c = ((kj6) obj).c(arrayList);
                if (c != null) {
                    uw uwVar2 = eg6.a;
                    int size2 = c.size();
                    int i4 = i2;
                    while (true) {
                        i = 1;
                        if (i4 >= size2) {
                            break;
                        }
                        long value = ((pj6) c.get(i4)).c.getValue();
                        if (linkedHashMap.containsKey(Integer.valueOf(i4))) {
                            pw pwVar = (pw) linkedHashMap.get(Integer.valueOf(i4));
                            pwVar.getClass();
                            List list2 = pwVar.e;
                            if (list2.size() == 1) {
                                d57Var = (d57) list2.get(i2);
                            } else {
                                d57Var = d57.STREAM_SHARING;
                            }
                            d57Var.getClass();
                            if (!eg6.b(d57Var, value, list2)) {
                                i = i2;
                                break;
                            }
                            i4++;
                            i2 = 0;
                        } else if (linkedHashMap2.containsKey(Integer.valueOf(i4))) {
                            Object obj2 = linkedHashMap2.get(Integer.valueOf(i4));
                            obj2.getClass();
                            b57 b57Var = (b57) obj2;
                            d57 n = b57Var.n();
                            n.getClass();
                            if (b57Var.n() == d57.STREAM_SHARING) {
                                list = (List) ((ag6) b57Var).g(ag6.B);
                                list.getClass();
                            } else {
                                list = pp1.A;
                            }
                            if (!eg6.b(n, value, list)) {
                                i = 0;
                                break;
                            }
                            i4++;
                            i2 = 0;
                        } else {
                            throw new AssertionError("SurfaceConfig does not map to any use case");
                        }
                    }
                    il6 il6Var = new il6(new jd2(27, this, c));
                    if (i != 0 && ((Boolean) il6Var.getValue()).booleanValue()) {
                        return c;
                    }
                    i2 = 0;
                }
            }
            return null;
        }
        return null;
    }

    public final Size i() {
        zw a;
        for (Number number : l07.c0(1, 13, 10, 8, 12, 6, 5, 4)) {
            int intValue = number.intValue();
            nz1 nz1Var = this.b;
            if (nz1Var.b(intValue) && (a = nz1Var.a(intValue)) != null) {
                List list = a.d;
                list.getClass();
                if (!list.isEmpty()) {
                    Object obj = list.get(0);
                    obj.getClass();
                    ax axVar = (ax) obj;
                    return new Size(axVar.e, axVar.f);
                }
            }
        }
        return null;
    }

    public final nf6 j() {
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        key.getClass();
        ce0 ce0Var = this.a;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ia0) ce0Var).c(key);
        if (streamConfigurationMap != null) {
            return new nf6(streamConfigurationMap, new ig4(ce0Var));
        }
        i.i("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
        return null;
    }

    public final ArrayList k(int i, ArrayList arrayList, List list, List list2, ArrayList arrayList2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, boolean z) {
        mj6 mj6Var;
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            pw pwVar = (pw) obj;
            arrayList3.add(pwVar.a);
            linkedHashMap.put(Integer.valueOf(arrayList3.size() - 1), pwVar);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i4 = i2 + 1;
            Size size2 = (Size) it.next();
            b57 b57Var = (b57) list2.get(((Number) arrayList2.get(i2)).intValue());
            int x = b57Var.x();
            cg6 l = b57Var.l();
            cg6 cg6Var = pj6.e;
            ox m = m(x);
            if (z) {
                mj6Var = mj6.FEATURE_COMBINATION_TABLE;
            } else {
                mj6Var = mj6.CAPTURE_SESSION_TABLES;
            }
            arrayList3.add(jo1.w(x, size2, m, i, mj6Var, l));
            linkedHashMap2.put(Integer.valueOf(arrayList3.size() - 1), b57Var);
            i2 = i4;
        }
        return arrayList3;
    }

    public final ox l() {
        ox oxVar = this.v;
        if (oxVar != null) {
            return oxVar;
        }
        b53.g0("surfaceSizeDefinition");
        throw null;
    }

    public final ox m(int i) {
        CameraCharacteristics.Key key;
        Size e;
        Integer valueOf = Integer.valueOf(i);
        ArrayList arrayList = this.w;
        if (!arrayList.contains(valueOf)) {
            LinkedHashMap linkedHashMap = l().b;
            Size size = x76.d;
            size.getClass();
            r(linkedHashMap, size, i);
            LinkedHashMap linkedHashMap2 = l().d;
            Size size2 = x76.f;
            size2.getClass();
            r(linkedHashMap2, size2, i);
            q(l().f, i, null);
            q(l().g, i, uu.a);
            q(l().h, i, uu.c);
            LinkedHashMap linkedHashMap3 = l().i;
            if (Build.VERSION.SDK_INT >= 31 && this.s) {
                key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
                key.getClass();
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ia0) this.a).c(key);
                if (streamConfigurationMap != null && (e = e(streamConfigurationMap, i, true, null)) != null) {
                    linkedHashMap3.put(Integer.valueOf(i), e);
                }
            }
            arrayList.add(Integer.valueOf(i));
        }
        return l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x043a, code lost:
        r5 = r48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x099c  */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [int] */
    /* JADX WARN: Type inference failed for: r34v13 */
    /* JADX WARN: Type inference failed for: r34v14 */
    /* JADX WARN: Type inference failed for: r51v0, types: [java.util.LinkedHashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ik6 o(defpackage.hj6 r46, java.util.ArrayList r47, java.util.Map r48, java.util.List r49, java.util.ArrayList r50, java.util.LinkedHashMap r51) {
        /*
            Method dump skipped, instructions count: 2882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj6.o(hj6, java.util.ArrayList, java.util.Map, java.util.List, java.util.ArrayList, java.util.LinkedHashMap):ik6");
    }

    public final pj6 p(int i, int i2, Size size, cg6 cg6Var) {
        size.getClass();
        cg6 cg6Var2 = pj6.e;
        return jo1.w(i2, size, m(i2), i, mj6.CAPTURE_SESSION_TABLES, cg6Var);
    }

    public final void q(LinkedHashMap linkedHashMap, int i, Rational rational) {
        Size e = e((StreamConfigurationMap) this.x.c.A, i, true, rational);
        if (e != null) {
            linkedHashMap.put(Integer.valueOf(i), e);
        }
    }

    public final void r(LinkedHashMap linkedHashMap, Size size, int i) {
        if (!this.q) {
            return;
        }
        Size e = e((StreamConfigurationMap) this.x.c.A, i, false, null);
        Integer valueOf = Integer.valueOf(i);
        if (e != null) {
            size = (Size) Collections.min(l07.c0(size, e), new es0(false));
        }
        linkedHashMap.put(valueOf, size);
    }

    public final void s(hj6 hj6Var) {
        int i = hj6Var.a;
        boolean z = hj6Var.g;
        String str = "CONCURRENT_CAMERA";
        String str2 = this.d;
        if (i != 0 && hj6Var.e) {
            StringBuilder u = b31.u("Camera device Id is ", str2, ". Ultra HDR is not currently supported in ");
            if (i != 1) {
                if (i == 2) {
                    str = "ULTRA_HIGH_RESOLUTION_CAMERA";
                } else {
                    str = "DEFAULT";
                }
            }
            i.g(b31.q(u, str, " camera mode."));
        } else if (i != 0 && hj6Var.b == 10) {
            StringBuilder u2 = b31.u("Camera device Id is ", str2, ". 10 bit dynamic range is not currently supported in ");
            if (i != 1) {
                if (i == 2) {
                    str = "ULTRA_HIGH_RESOLUTION_CAMERA";
                } else {
                    str = "DEFAULT";
                }
            }
            i.g(b31.q(u2, str, " camera mode."));
        } else if (i != 0 && z) {
            StringBuilder u3 = b31.u("Camera device Id is ", str2, ". feature combination is not currently supported in ");
            if (i != 1) {
                if (i == 2) {
                    str = "ULTRA_HIGH_RESOLUTION_CAMERA";
                } else {
                    str = "DEFAULT";
                }
            }
            i.g(b31.q(u3, str, " camera mode."));
        } else {
            boolean z2 = hj6Var.f;
            if (z2 && z) {
                i.i("High-speed session is not supported with feature combination");
            } else if (z2 && !((Boolean) this.C.b.getValue()).booleanValue()) {
                i.i("High-speed session is not supported on this device.");
            }
        }
    }
}
