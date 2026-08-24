package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rr6  reason: default package */
/* loaded from: classes.dex */
public final class rr6 implements so2, dx6, zk4, q96 {
    public final /* synthetic */ int A;
    public Object B;
    public Object L;

    public rr6(int i) {
        this.A = i;
        switch (i) {
            case 6:
                return;
            case 7:
                this.B = new w31(27);
                this.L = new yz3(16);
                return;
            case 11:
                this.B = new ci6(0);
                this.L = new hz3((Object) null);
                return;
            case 13:
                this.B = new ua4(new Reference[16]);
                this.L = new ReferenceQueue();
                return;
            case 17:
                List list = Collections.EMPTY_LIST;
                this.B = list;
                this.L = list;
                return;
            default:
                this.B = (ImageCaptureFailedForSpecificCombinationQuirk) ri1.a.b(ImageCaptureFailedForSpecificCombinationQuirk.class);
                this.L = (PreviewGreenTintQuirk) ri1.a.b(PreviewGreenTintQuirk.class);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    @Override // defpackage.zk4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vu7 U(View view, vu7 vu7Var) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        g60 g60Var = (g60) this.B;
        cq7 cq7Var = (cq7) this.L;
        int i2 = cq7Var.a;
        int i3 = cq7Var.b;
        int i4 = cq7Var.c;
        ru7 ru7Var = vu7Var.a;
        e83 h = ru7Var.h(519);
        e83 h2 = ru7Var.h(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) g60Var.B;
        int i5 = h.b;
        int i6 = h.c;
        int i7 = h.a;
        bottomSheetBehavior.w = i5;
        boolean z4 = true;
        if (view.getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z5 = bottomSheetBehavior.o;
        if (z5) {
            int a = vu7Var.a();
            bottomSheetBehavior.v = a;
            paddingBottom = a + i4;
        }
        if (bottomSheetBehavior.p) {
            if (z) {
                i = i3;
            } else {
                i = i2;
            }
            paddingLeft = i + i7;
        }
        if (bottomSheetBehavior.q) {
            if (!z) {
                i2 = i3;
            }
            paddingRight = i2 + i6;
        }
        int i8 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (bottomSheetBehavior.s && marginLayoutParams.leftMargin != i7) {
            marginLayoutParams.leftMargin = i7;
            z2 = true;
        } else {
            z2 = false;
        }
        if (bottomSheetBehavior.t && marginLayoutParams.rightMargin != i6) {
            marginLayoutParams.rightMargin = i6;
            z2 = true;
        }
        if (bottomSheetBehavior.u) {
            int i9 = marginLayoutParams.topMargin;
            int i10 = h.b;
            if (i9 != i10) {
                marginLayoutParams.topMargin = i10;
                if (z4) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), i8, paddingBottom);
                z3 = g60Var.A;
                if (z3) {
                    bottomSheetBehavior.m = h2.d;
                }
                if (z5 && !z3) {
                    return vu7Var;
                }
                bottomSheetBehavior.P();
                return vu7Var;
            }
        }
        z4 = z2;
        if (z4) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), i8, paddingBottom);
        z3 = g60Var.A;
        if (z3) {
        }
        if (z5) {
        }
        bottomSheetBehavior.P();
        return vu7Var;
    }

    @Override // defpackage.q96
    public int a(int i) {
        CharSequence charSequence = (CharSequence) this.B;
        do {
            i = ((m42) this.L).i(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.q96
    public int b(int i) {
        do {
            i = ((m42) this.L).j(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.B).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.q96
    public int c(int i) {
        do {
            i = ((m42) this.L).j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.B).charAt(i)));
        return i;
    }

    @Override // defpackage.q96
    public int d(int i) {
        do {
            i = ((m42) this.L).i(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.B).charAt(i - 1)));
        return i;
    }

    public void e(wg5 wg5Var, dy7 dy7Var) {
        ci6 ci6Var = (ci6) this.B;
        lo7 lo7Var = (lo7) ci6Var.get(wg5Var);
        if (lo7Var == null) {
            lo7Var = lo7.a();
            ci6Var.put(wg5Var, lo7Var);
        }
        lo7Var.c = dy7Var;
        lo7Var.a |= 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0495, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0603, code lost:
        if (r1 == defpackage.in7.PREVIEW) goto L301;
     */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0720  */
    /* JADX WARN: Type inference failed for: r0v50, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sr6 f(int i, cg0 cg0Var, ArrayList arrayList, ArrayList arrayList2, oe0 oe0Var, Range range, boolean z) {
        Pair pair;
        int i2;
        Rect rect;
        Size size;
        dv6 dv6Var;
        boolean z2;
        boolean z3;
        LinkedHashMap linkedHashMap;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i3;
        int i4;
        av6 av6Var;
        cw6 o;
        LinkedHashMap linkedHashMap2;
        bv6 a;
        LinkedHashMap linkedHashMap3;
        dv6 dv6Var2;
        cg0Var.getClass();
        oe0Var.getClass();
        range.getClass();
        ArrayList arrayList3 = new ArrayList();
        String d = cg0Var.d();
        d.getClass();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        int size2 = arrayList2.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj = arrayList2.get(i5);
            int i6 = i5 + 1;
            di7 di7Var = (di7) obj;
            yy yyVar = di7Var.i;
            if (yyVar != null) {
                mi0 mi0Var = (mi0) this.L;
                if (mi0Var != null) {
                    int q = di7Var.h.q();
                    int i7 = size2;
                    Size c = di7Var.c();
                    if (c != null) {
                        tr6 w = di7Var.h.w();
                        np2.s("No such camera id in supported combination list: ".concat(d), mi0Var.d.containsKey(d));
                        synchronized (mi0Var.c) {
                            dv6Var2 = (dv6) mi0Var.d.get(d);
                        }
                        if (dv6Var2 != null) {
                            jv6 p = dv6Var2.p(i, q, c, w);
                            int q2 = di7Var.h.q();
                            Size c2 = di7Var.c();
                            c2.getClass();
                            yq1 yq1Var = yyVar.c;
                            ArrayList arrayList4 = new ArrayList();
                            if (di7Var instanceof pr6) {
                                Iterator it = ((pr6) di7Var).r.A.iterator();
                                while (it.hasNext()) {
                                    arrayList4.add(((di7) it.next()).h.x());
                                }
                            } else {
                                arrayList4.add(di7Var.h.x());
                            }
                            yy0 yy0Var = yyVar.f;
                            int intValue = ((Integer) di7Var.h.b(zi7.M, 0)).intValue();
                            Range range2 = (Range) di7Var.h.b(zi7.N, yy.h);
                            if (range2 != null) {
                                Boolean bool = (Boolean) di7Var.h.b(zi7.O, Boolean.FALSE);
                                Objects.requireNonNull(bool);
                                boolean booleanValue = bool.booleanValue();
                                zi7 zi7Var = di7Var.h;
                                Size c3 = di7Var.c();
                                c3.getClass();
                                px pxVar = new px(p, q2, c2, yq1Var, arrayList4, yy0Var, intValue, range2, booleanValue, zi7Var.A(c3));
                                arrayList3.add(pxVar);
                                linkedHashMap5.put(pxVar, di7Var);
                                linkedHashMap4.put(di7Var, yyVar);
                                size2 = i7;
                                i5 = i6;
                            } else {
                                i.h("Required value was null.");
                                return null;
                            }
                        } else {
                            i.h("No such camera id in supported combination list: ".concat(d));
                            return null;
                        }
                    } else {
                        i.h("Attached surface resolution cannot be null for already attached use cases.");
                        return null;
                    }
                } else {
                    i.m("Required value was null.");
                    return null;
                }
            } else {
                i.h("Attached stream spec cannot be null for already attached use cases.");
                return null;
            }
        }
        Pair pair2 = new Pair(linkedHashMap4, linkedHashMap5);
        Object obj2 = pair2.second;
        obj2.getClass();
        Map map = (Map) obj2;
        HashMap x = zi0.x(arrayList, (cj7) oe0Var.b(oe0.b, cj7.a), (aj0) this.B, range);
        String d2 = cg0Var.d();
        d2.getClass();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        if (!arrayList.isEmpty()) {
            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
            LinkedHashMap linkedHashMap8 = new LinkedHashMap();
            try {
                rect = cg0Var.j();
            } catch (NullPointerException unused) {
                rect = null;
            }
            if (rect != null) {
                size = k97.f(rect);
            } else {
                size = null;
            }
            m44 m44Var = new m44(cg0Var, size);
            int size3 = arrayList.size();
            int i8 = 0;
            while (i8 < size3) {
                Object obj3 = arrayList.get(i8);
                i8++;
                di7 di7Var2 = (di7) obj3;
                Object obj4 = x.get(di7Var2);
                if (obj4 != null) {
                    ui0 ui0Var = (ui0) obj4;
                    int i9 = size3;
                    zi7 p2 = di7Var2.p(cg0Var, ui0Var.a, ui0Var.b);
                    p2.getClass();
                    linkedHashMap7.put(p2, di7Var2);
                    linkedHashMap8.put(p2, m44Var.u(p2));
                    size3 = i9;
                } else {
                    i.h("Required value was null.");
                    return null;
                }
            }
            in7 I = ej2.I(arrayList, new qk4(20, x, cg0Var));
            mi0 mi0Var2 = (mi0) this.L;
            if (mi0Var2 != null) {
                ArrayList arrayList5 = new ArrayList(map.keySet());
                boolean t = ej2.t(arrayList);
                I.getClass();
                np2.s("No such camera id in supported combination list: ".concat(d2), mi0Var2.d.containsKey(d2));
                synchronized (mi0Var2.c) {
                    dv6Var = (dv6) mi0Var2.d.get(d2);
                }
                if (dv6Var != null) {
                    al1 al1Var = dv6Var.y;
                    synchronized (al1Var.c) {
                        al1Var.f = al1Var.a();
                    }
                    if (dv6Var.v == null) {
                        dv6Var.b();
                    } else {
                        dv6Var.v = new dz(dv6Var.l().a, dv6Var.l().b, dv6Var.y.c(), dv6Var.l().d, dv6Var.l().e, dv6Var.l().f, dv6Var.l().g, dv6Var.l().h, dv6Var.l().i);
                    }
                    Range range3 = nx2.f;
                    Set keySet = linkedHashMap8.keySet();
                    keySet.getClass();
                    ArrayList arrayList6 = new ArrayList(ht0.v0(arrayList5, 10));
                    int size4 = arrayList5.size();
                    int i10 = 0;
                    while (i10 < size4) {
                        Object obj5 = arrayList5.get(i10);
                        i10++;
                        arrayList6.add(Integer.valueOf(((px) obj5).g));
                    }
                    Set<zi7> set = keySet;
                    ArrayList arrayList7 = new ArrayList(ht0.v0(set, 10));
                    for (zi7 zi7Var2 : set) {
                        Integer num = (Integer) zi7Var2.b(zi7.M, 0);
                        num.getClass();
                        arrayList7.add(num);
                    }
                    ArrayList V0 = gt0.V0(arrayList6, arrayList7);
                    if (!V0.isEmpty()) {
                        int size5 = V0.size();
                        int i11 = 0;
                        while (i11 < size5) {
                            Object obj6 = V0.get(i11);
                            i11++;
                            if (((Number) obj6).intValue() == 1) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (z2 && !V0.isEmpty()) {
                        int size6 = V0.size();
                        int i12 = 0;
                        while (i12 < size6) {
                            Object obj7 = V0.get(i12);
                            i12++;
                            if (((Number) obj7).intValue() != 1) {
                                i.h("All sessionTypes should be high-speed when any of them is high-speed");
                                return null;
                            }
                        }
                    }
                    if (z2) {
                        nx2 nx2Var = dv6Var.C;
                        nx2Var.getClass();
                        List a2 = nx2.a(gt0.k1(linkedHashMap8.values()));
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj8 : a2) {
                            boolean z8 = t;
                            if (((List) nx2Var.e.getValue()).contains((Size) obj8)) {
                                arrayList8.add(obj8);
                            }
                            t = z8;
                        }
                        z3 = t;
                        LinkedHashMap linkedHashMap9 = new LinkedHashMap(c14.k0(linkedHashMap8.size()));
                        Iterator it2 = linkedHashMap8.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            Object key = entry.getKey();
                            ArrayList arrayList9 = new ArrayList();
                            for (Object obj9 : (List) entry.getValue()) {
                                Iterator it3 = it2;
                                if (arrayList8.contains((Size) obj9)) {
                                    arrayList9.add(obj9);
                                }
                                it2 = it3;
                            }
                            linkedHashMap9.put(key, arrayList9);
                        }
                        linkedHashMap = linkedHashMap9;
                    } else {
                        z3 = t;
                        linkedHashMap = linkedHashMap8;
                    }
                    List<zi7> k1 = gt0.k1(linkedHashMap.keySet());
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    for (zi7 zi7Var3 : k1) {
                        Integer num2 = (Integer) zi7Var3.b(zi7.K, 0);
                        num2.getClass();
                        if (!arrayList11.contains(num2)) {
                            arrayList11.add(num2);
                        }
                    }
                    jt0.w0(arrayList11);
                    Collections.reverse(arrayList11);
                    int size7 = arrayList11.size();
                    int i13 = 0;
                    while (i13 < size7) {
                        Object obj10 = arrayList11.get(i13);
                        i13++;
                        int intValue2 = ((Number) obj10).intValue();
                        for (zi7 zi7Var4 : k1) {
                            ArrayList arrayList12 = arrayList11;
                            boolean z9 = z2;
                            if (intValue2 == ((Integer) zi7Var4.b(zi7.K, 0)).intValue()) {
                                arrayList10.add(Integer.valueOf(k1.indexOf(zi7Var4)));
                            }
                            arrayList11 = arrayList12;
                            z2 = z9;
                        }
                    }
                    boolean z10 = z2;
                    LinkedHashMap o2 = dv6Var.B.o(arrayList5, k1, arrayList10);
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "resolvedDynamicRanges = " + o2);
                    }
                    int size8 = arrayList5.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size8) {
                            Object obj11 = arrayList5.get(i14);
                            i14++;
                            if (((px) obj11).b == 4101) {
                                break;
                            }
                        } else {
                            for (zi7 zi7Var5 : linkedHashMap.keySet()) {
                                if (zi7Var5.q() == 4101) {
                                }
                            }
                            z4 = false;
                        }
                    }
                    int size9 = arrayList5.size();
                    Boolean bool2 = null;
                    int i15 = 0;
                    while (i15 < size9) {
                        Object obj12 = arrayList5.get(i15);
                        i15++;
                        boolean z11 = ((px) obj12).i;
                        if (bool2 != null && !bool2.equals(Boolean.valueOf(z11))) {
                            i.m("All isStrictFpsRequired should be the same");
                            return null;
                        }
                        bool2 = Boolean.valueOf(z11);
                    }
                    for (zi7 zi7Var6 : k1) {
                        Boolean bool3 = (Boolean) zi7Var6.b(zi7.O, Boolean.FALSE);
                        Objects.requireNonNull(bool3);
                        if (bool2 != null && !bool2.equals(bool3)) {
                            i.m("All isStrictFpsRequired should be the same");
                            return null;
                        }
                        bool2 = bool3;
                    }
                    if (bool2 != null) {
                        z5 = bool2.booleanValue();
                    } else {
                        z5 = false;
                    }
                    Range range4 = yy.h;
                    range4.getClass();
                    int size10 = arrayList5.size();
                    int i16 = 0;
                    while (i16 < size10) {
                        Object obj13 = arrayList5.get(i16);
                        i16++;
                        Range range5 = ((px) obj13).h;
                        range5.getClass();
                        range4 = dv6.n(range5, range4, z5);
                    }
                    int size11 = arrayList10.size();
                    Range range6 = range4;
                    int i17 = 0;
                    while (i17 < size11) {
                        Object obj14 = arrayList10.get(i17);
                        i17++;
                        boolean z12 = z4;
                        Range range7 = (Range) ((zi7) k1.get(((Number) obj14).intValue())).b(zi7.N, yy.h);
                        range7.getClass();
                        range6 = dv6.n(range7, range6, z5);
                        z4 = z12;
                        k1 = k1;
                    }
                    boolean z13 = z4;
                    List list = k1;
                    boolean booleanValue2 = Boolean.valueOf(z5).booleanValue();
                    if (I == in7.PREVIEW) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (kj2.F("CXCP")) {
                        StringBuilder sb = new StringBuilder("getSuggestedStreamSpecifications: isPreviewStabilizationSupported = ");
                        sb.append(dv6Var.t);
                        sb.append(", isFeatureComboInvocation = ");
                        z7 = z;
                        sb.append(z7);
                        Log.d("CXCP", sb.toString());
                    } else {
                        z7 = z;
                    }
                    if (z6 && !dv6Var.t && z7) {
                        i.h("Preview stabilization is not supported by the camera.");
                        return null;
                    }
                    range6.getClass();
                    Iterator it4 = o2.values().iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (((yq1) it4.next()).b == 10) {
                                i3 = 10;
                                break;
                            }
                        } else {
                            i3 = 8;
                            break;
                        }
                    }
                    List list2 = list;
                    LinkedHashMap linkedHashMap10 = o2;
                    ArrayList arrayList13 = arrayList5;
                    ArrayList arrayList14 = arrayList10;
                    pair = pair2;
                    dv6 dv6Var3 = dv6Var;
                    bv6 bv6Var = new bv6(i, i3, z3, I, z13, z10, z7, false, range6, booleanValue2);
                    dv6Var3.s(bv6Var);
                    Collection values = linkedHashMap10.values();
                    if (!z) {
                        av6Var = av6.WITHOUT_FEATURE_COMBO;
                    } else {
                        ?? contains = values.contains(yq1.e);
                        Integer num3 = (Integer) range6.getUpper();
                        int i18 = contains;
                        if (num3 != null) {
                            i18 = contains;
                            if (num3.intValue() == 60) {
                                i18 = contains + 1;
                            }
                        }
                        if (I != in7.ON) {
                            i4 = i18;
                        }
                        i4 = i18 + 1;
                        if (z13) {
                            i4++;
                        }
                        if (i4 > 1) {
                            av6Var = av6.WITH_FEATURE_COMBO;
                        } else if (i4 == 1) {
                            av6Var = av6.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT;
                        } else {
                            av6Var = av6.WITHOUT_FEATURE_COMBO;
                        }
                    }
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "resolveSpecsByCheckingMethod: checkingMethod = " + av6Var);
                    }
                    int i19 = cv6.a[av6Var.ordinal()];
                    if (i19 != 1) {
                        if (i19 != 2) {
                            if (i19 == 3) {
                                try {
                                    a = bv6.a(bv6Var, false, null, 895);
                                    dv6Var3.s(a);
                                    linkedHashMap3 = linkedHashMap;
                                } catch (IllegalArgumentException e) {
                                    e = e;
                                    linkedHashMap2 = linkedHashMap;
                                }
                                try {
                                    o = dv6Var3.o(a, arrayList13, linkedHashMap3, list2, arrayList14, linkedHashMap10);
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    dv6Var3 = dv6Var3;
                                    arrayList13 = arrayList13;
                                    linkedHashMap2 = linkedHashMap3;
                                    list2 = list2;
                                    arrayList14 = arrayList14;
                                    linkedHashMap10 = linkedHashMap10;
                                    if (kj2.F("CXCP")) {
                                        Log.d("CXCP", "Failed to find a supported combination without feature combo, trying again with feature combo", e);
                                    }
                                    bv6 a3 = bv6.a(bv6Var, true, null, 895);
                                    dv6Var3.s(a3);
                                    o = dv6Var3.o(a3, arrayList13, linkedHashMap2, list2, arrayList14, linkedHashMap10);
                                    LinkedHashMap linkedHashMap11 = o.a;
                                    LinkedHashMap linkedHashMap12 = o.b;
                                    i2 = o.c;
                                    while (r3.hasNext()) {
                                    }
                                    while (r1.hasNext()) {
                                    }
                                    Object obj15 = pair.first;
                                    obj15.getClass();
                                    return new sr6(i2, c14.o0((Map) obj15, linkedHashMap6));
                                }
                            } else {
                                i.d();
                                return null;
                            }
                        } else {
                            LinkedHashMap linkedHashMap13 = linkedHashMap;
                            if (z) {
                                Range range8 = yy.h;
                            }
                            bv6 a4 = bv6.a(bv6Var, true, range6, 639);
                            dv6Var3.s(a4);
                            o = dv6Var3.o(a4, arrayList13, linkedHashMap13, list2, arrayList14, linkedHashMap10);
                        }
                    } else {
                        bv6 a5 = bv6.a(bv6Var, false, null, 895);
                        dv6Var3.s(a5);
                        o = dv6Var3.o(a5, arrayList13, linkedHashMap, list2, arrayList14, linkedHashMap10);
                    }
                    LinkedHashMap linkedHashMap112 = o.a;
                    LinkedHashMap linkedHashMap122 = o.b;
                    i2 = o.c;
                    for (Map.Entry entry2 : linkedHashMap7.entrySet()) {
                        Object value = entry2.getValue();
                        Object obj16 = linkedHashMap112.get(entry2.getKey());
                        if (obj16 != null) {
                            linkedHashMap6.put(value, obj16);
                        } else {
                            i.h("Required value was null.");
                            return null;
                        }
                    }
                    for (Map.Entry entry3 : linkedHashMap122.entrySet()) {
                        if (map.containsKey(entry3.getKey())) {
                            Object obj17 = map.get(entry3.getKey());
                            if (obj17 != null) {
                                linkedHashMap6.put(obj17, entry3.getValue());
                            } else {
                                i.h("Required value was null.");
                                return null;
                            }
                        }
                    }
                } else {
                    i.h("No such camera id in supported combination list: ".concat(d2));
                    return null;
                }
            } else {
                i.m("Required value was null.");
                return null;
            }
        } else {
            pair = pair2;
            i2 = Integer.MAX_VALUE;
        }
        Object obj152 = pair.first;
        obj152.getClass();
        return new sr6(i2, c14.o0((Map) obj152, linkedHashMap6));
    }

    public boolean g(gw7 gw7Var) {
        boolean containsKey;
        synchronized (this.L) {
            containsKey = ((wb1) this.B).b.containsKey(gw7Var);
        }
        return containsKey;
    }

    public View h(int i, int i2, int i3, int i4) {
        int i5;
        View u;
        mn7 mn7Var = (mn7) this.L;
        eg5 eg5Var = (eg5) this.B;
        int d = eg5Var.d();
        int c = eg5Var.c();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            switch (eg5Var.a) {
                case 0:
                    u = eg5Var.b.u(i);
                    break;
                default:
                    u = eg5Var.b.u(i);
                    break;
            }
            int b = eg5Var.b(u);
            int a = eg5Var.a(u);
            mn7Var.b = d;
            mn7Var.c = c;
            mn7Var.d = b;
            mn7Var.e = a;
            if (i3 != 0) {
                mn7Var.a = i3;
                if (mn7Var.a()) {
                    return u;
                }
            }
            if (i4 != 0) {
                mn7Var.a = i4;
                if (mn7Var.a()) {
                    view = u;
                }
            }
            i += i5;
        }
        return view;
    }

    @Override // defpackage.so2
    public void i(Throwable th) {
        switch (this.A) {
            case 2:
                int i = ((qv6) this.B).f;
                if (i == 2 && (th instanceof CancellationException)) {
                    kj2.t("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    return;
                } else {
                    kj2.g0("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: ".concat(mp2.H(i)), th);
                    return;
                }
            case 3:
                if (th instanceof aw6) {
                    np2.A(null, ((tb0) this.L).cancel(false));
                    return;
                } else {
                    np2.A(null, ((qb0) this.B).a(null));
                    return;
                }
            default:
                np2.A("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof aw6);
                ((b31) this.B).accept(new bz(1, (Surface) this.L));
                return;
        }
    }

    public boolean j(View view) {
        mn7 mn7Var = (mn7) this.L;
        eg5 eg5Var = (eg5) this.B;
        int d = eg5Var.d();
        int c = eg5Var.c();
        int b = eg5Var.b(view);
        int a = eg5Var.a(view);
        mn7Var.b = d;
        mn7Var.c = c;
        mn7Var.d = b;
        mn7Var.e = a;
        mn7Var.a = 24579;
        return mn7Var.a();
    }

    public dy7 k(wg5 wg5Var, int i) {
        lo7 lo7Var;
        dy7 dy7Var;
        ci6 ci6Var = (ci6) this.B;
        int d = ci6Var.d(wg5Var);
        if (d >= 0 && (lo7Var = (lo7) ci6Var.i(d)) != null) {
            int i2 = lo7Var.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                lo7Var.a = i3;
                if (i == 4) {
                    dy7Var = lo7Var.b;
                } else if (i == 8) {
                    dy7Var = lo7Var.c;
                } else {
                    i.h("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    ci6Var.g(d);
                    lo7Var.a = 0;
                    lo7Var.b = null;
                    lo7Var.c = null;
                    lo7.d.c(lo7Var);
                }
                return dy7Var;
            }
        }
        return null;
    }

    public jp6 l(gw7 gw7Var) {
        jp6 k;
        gw7Var.getClass();
        synchronized (this.L) {
            k = ((wb1) this.B).k(gw7Var);
        }
        return k;
    }

    public void m(wg5 wg5Var) {
        lo7 lo7Var = (lo7) ((ci6) this.B).get(wg5Var);
        if (lo7Var == null) {
            return;
        }
        lo7Var.a &= -2;
    }

    @Override // defpackage.dx6
    public Object n() {
        i36 i36Var = (i36) ((p87) this.B).c;
        i36Var.getClass();
        return (Iterable) i36Var.k(new ap3(26, i36Var, (fz) this.L));
    }

    public void o(wg5 wg5Var) {
        hz3 hz3Var = (hz3) this.L;
        int i = hz3Var.i() - 1;
        while (true) {
            if (i < 0) {
                break;
            } else if (wg5Var == hz3Var.j(i)) {
                Object[] objArr = hz3Var.L;
                Object obj = objArr[i];
                Object obj2 = hv.h;
                if (obj != obj2) {
                    objArr[i] = obj2;
                    hz3Var.A = true;
                }
            } else {
                i--;
            }
        }
        lo7 lo7Var = (lo7) ((ci6) this.B).remove(wg5Var);
        if (lo7Var != null) {
            lo7Var.a = 0;
            lo7Var.b = null;
            lo7Var.c = null;
            lo7.d.c(lo7Var);
        }
    }

    @Override // defpackage.so2, com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.A) {
            case 2:
                wv6 wv6Var = (wv6) obj;
                wv6Var.getClass();
                ((qf1) ((m44) this.L).B).b(wv6Var);
                return;
            case 3:
                Void r3 = (Void) obj;
                np2.A(null, ((qb0) this.B).a(null));
                return;
            default:
                Void r32 = (Void) obj;
                ((b31) this.B).accept(new bz(0, (Surface) this.L));
                return;
        }
    }

    public void p(jp6 jp6Var, rr6 rr6Var) {
        jp6Var.getClass();
        ((ow7) this.L).a.execute(new v(this, jp6Var, rr6Var, 20));
    }

    public void q(jp6 jp6Var, int i) {
        jp6Var.getClass();
        ((ow7) this.L).a.execute(new ar6((o35) this.B, jp6Var, false, i));
    }

    public jp6 r(gw7 gw7Var) {
        jp6 m;
        synchronized (this.L) {
            m = ((wb1) this.B).m(gw7Var);
        }
        return m;
    }

    public String toString() {
        switch (this.A) {
            case 14:
                return "Bounds{lower=" + ((e83) this.B) + " upper=" + ((e83) this.L) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ rr6(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    public rr6(o35 o35Var, ow7 ow7Var) {
        this.A = 16;
        o35Var.getClass();
        ow7Var.getClass();
        this.B = o35Var;
        this.L = ow7Var;
    }

    public rr6(wb1 wb1Var) {
        this.A = 5;
        this.B = wb1Var;
        this.L = new Object();
    }

    public rr6(aj0 aj0Var) {
        this.A = 1;
        this.B = aj0Var;
        this.L = null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [mn7, java.lang.Object] */
    public rr6(eg5 eg5Var) {
        this.A = 10;
        this.B = eg5Var;
        ?? obj = new Object();
        obj.a = 0;
        this.L = obj;
    }

    public rr6(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.A = 14;
        lowerBound = bounds.getLowerBound();
        this.B = e83.d(lowerBound);
        upperBound = bounds.getUpperBound();
        this.L = e83.d(upperBound);
    }

    public rr6(m44 m44Var, qv6 qv6Var) {
        this.A = 2;
        this.L = m44Var;
        this.B = qv6Var;
    }
}
