package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Insets;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g64  reason: default package */
/* loaded from: classes.dex */
public final class g64 implements y54 {
    public final /* synthetic */ int a;
    public final Context b;

    public g64(yc1 yc1Var, Context context) {
        this.a = 1;
        this.b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7 A[Catch: Exception -> 0x0687, TRY_LEAVE, TryCatch #14 {Exception -> 0x0687, blocks: (B:23:0x00a6, B:24:0x00c1, B:26:0x00c7), top: B:199:0x00a6 }] */
    /* JADX WARN: Type inference failed for: r7v55 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void d() {
        d83 d83Var;
        File file;
        Iterator it;
        File file2;
        String str;
        String str2;
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        String str3;
        ye3 ye3Var;
        ArrayList arrayList2;
        nd3 f;
        ArrayList arrayList3;
        LinkedHashMap linkedHashMap;
        String str4;
        vr4 vr4Var;
        String str5;
        Map map;
        ArrayList arrayList4;
        de3 de3Var;
        nd3 f2;
        ye3 ye3Var2;
        ye3 ye3Var3;
        LinkedHashMap linkedHashMap2;
        de3 de3Var2;
        de3 de3Var3;
        ArrayList arrayList5;
        de3 de3Var4;
        de3 de3Var5;
        String str6;
        WindowManager windowManager;
        DisplayCutout cutout;
        int safeInsetLeft;
        int safeInsetTop;
        int safeInsetRight;
        int safeInsetBottom;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int displayCutout;
        Insets insets;
        int i5;
        int i6;
        int i7;
        int i8;
        String str7 = "mainScreenLayoutDto";
        String str8 = "displays";
        String str9 = "layoutVariants";
        String str10 = "variant";
        Context context = this.b;
        File file3 = new File(context.getFilesDir(), "layouts.json");
        if (file3.isFile()) {
            int i9 = Build.VERSION.SDK_INT;
            try {
                try {
                    if (i9 >= 29 && (windowManager = (WindowManager) context.getSystemService(WindowManager.class)) != null) {
                        if (i9 >= 30) {
                            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                            windowInsets = currentWindowMetrics.getWindowInsets();
                            displayCutout = WindowInsets.Type.displayCutout();
                            insets = windowInsets.getInsets(displayCutout);
                            insets.getClass();
                            i5 = insets.left;
                            i6 = insets.top;
                            i7 = insets.right;
                            i8 = insets.bottom;
                            d83Var = new d83(i5, i6, i7, i8);
                        } else {
                            cutout = windowManager.getDefaultDisplay().getCutout();
                            if (cutout != null) {
                                safeInsetLeft = cutout.getSafeInsetLeft();
                                safeInsetTop = cutout.getSafeInsetTop();
                                safeInsetRight = cutout.getSafeInsetRight();
                                safeInsetBottom = cutout.getSafeInsetBottom();
                                d83Var = new d83(safeInsetLeft, safeInsetTop, safeInsetRight, safeInsetBottom);
                            }
                        }
                        int i10 = d83Var.d;
                        int i11 = d83Var.c;
                        int i12 = d83Var.b;
                        int i13 = d83Var.a;
                        boolean z2 = true;
                        if (context.getResources().getConfiguration().orientation != 1) {
                            z2 = false;
                        }
                        nd3 f3 = fe3.f((de3) ii2.g(new v83(29)).a(he3.a, jc2.B0(file3)));
                        ArrayList arrayList6 = new ArrayList();
                        it = f3.A.iterator();
                        while (it.hasNext()) {
                            de3 de3Var6 = (de3) it.next();
                            Iterator it2 = it;
                            try {
                                Object obj = fe3.g(de3Var6).get(str9);
                                obj.getClass();
                                f = fe3.f((de3) obj);
                                z = z2;
                            } catch (Exception unused) {
                                str = str8;
                                str2 = str9;
                                file2 = file3;
                                i = i10;
                                arrayList = arrayList6;
                                i2 = i13;
                                i3 = i11;
                                i4 = i12;
                                z = z2;
                            }
                            try {
                                file2 = file3;
                                try {
                                    arrayList3 = new ArrayList(ht0.v0(f, 10));
                                    Iterator it3 = f.A.iterator();
                                    while (it3.hasNext()) {
                                        try {
                                            de3 de3Var7 = (de3) it3.next();
                                            Object obj2 = fe3.g(de3Var7).get(str10);
                                            obj2.getClass();
                                            ye3 g = fe3.g((de3) obj2);
                                            Iterator it4 = it3;
                                            arrayList = arrayList6;
                                            String str11 = str9;
                                            ArrayList arrayList7 = arrayList3;
                                            String str12 = str10;
                                            if (z) {
                                                try {
                                                    de3 de3Var8 = (de3) g.get("orientation");
                                                    if (de3Var8 != null) {
                                                        str4 = fe3.h(de3Var8).a();
                                                    } else {
                                                        str4 = null;
                                                    }
                                                    if (nb3.k(str4, "PORTRAIT")) {
                                                        vr4Var = new vr4(new my4(i13, i12), c14.m0(new vr4("left", fe3.a(Integer.valueOf(i13))), new vr4("top", fe3.a(Integer.valueOf(i12))), new vr4("right", fe3.a(Integer.valueOf(i11))), new vr4("bottom", fe3.a(Integer.valueOf(i10)))));
                                                    } else {
                                                        vr4Var = new vr4(new my4(i12, i11), c14.m0(new vr4("left", fe3.a(Integer.valueOf(i12))), new vr4("top", fe3.a(Integer.valueOf(i11))), new vr4("right", fe3.a(Integer.valueOf(i10))), new vr4("bottom", fe3.a(Integer.valueOf(i13)))));
                                                    }
                                                } catch (Exception unused2) {
                                                    str3 = str7;
                                                    str = str8;
                                                    i = i10;
                                                    i2 = i13;
                                                    i3 = i11;
                                                    i4 = i12;
                                                    str2 = str11;
                                                    str7 = str12;
                                                    ye3Var = null;
                                                    if (ye3Var == null) {
                                                    }
                                                    it = it2;
                                                    str9 = str2;
                                                    arrayList6 = arrayList2;
                                                    z2 = z;
                                                    str8 = str;
                                                    i10 = i;
                                                    i12 = i4;
                                                    i13 = i2;
                                                    i11 = i3;
                                                    str10 = str7;
                                                    str7 = str3;
                                                    file3 = file2;
                                                }
                                            } else {
                                                try {
                                                    de3 de3Var9 = (de3) g.get("orientation");
                                                    if (de3Var9 != null) {
                                                        str6 = fe3.h(de3Var9).a();
                                                    } else {
                                                        str6 = null;
                                                    }
                                                    if (nb3.k(str6, "PORTRAIT")) {
                                                        vr4Var = new vr4(new my4(i10, i13), c14.m0(new vr4("left", fe3.a(Integer.valueOf(i10))), new vr4("top", fe3.a(Integer.valueOf(i13))), new vr4("right", fe3.a(Integer.valueOf(i12))), new vr4("bottom", fe3.a(Integer.valueOf(i11)))));
                                                    } else {
                                                        vr4Var = new vr4(new my4(i13, i12), c14.m0(new vr4("left", fe3.a(Integer.valueOf(i13))), new vr4("top", fe3.a(Integer.valueOf(i12))), new vr4("right", fe3.a(Integer.valueOf(i11))), new vr4("bottom", fe3.a(Integer.valueOf(i10)))));
                                                    }
                                                } catch (Exception unused3) {
                                                    str3 = str7;
                                                    str = str8;
                                                    i = i10;
                                                    i2 = i13;
                                                    i3 = i11;
                                                    i4 = i12;
                                                    str7 = str12;
                                                    str2 = str11;
                                                    ye3Var = null;
                                                    if (ye3Var == null) {
                                                    }
                                                    it = it2;
                                                    str9 = str2;
                                                    arrayList6 = arrayList2;
                                                    z2 = z;
                                                    str8 = str;
                                                    i10 = i;
                                                    i12 = i4;
                                                    i13 = i2;
                                                    i11 = i3;
                                                    str10 = str7;
                                                    str7 = str3;
                                                    file3 = file2;
                                                }
                                            }
                                            my4 my4Var = (my4) vr4Var.A;
                                            Map map2 = (Map) vr4Var.B;
                                            Object obj3 = g.get(str8);
                                            obj3.getClass();
                                            Object obj4 = fe3.g((de3) obj3).get("mainScreenDisplay");
                                            obj4.getClass();
                                            ye3 g2 = fe3.g((de3) obj4);
                                            Object obj5 = fe3.g(de3Var7).get("layout");
                                            obj5.getClass();
                                            Object obj6 = fe3.g((de3) obj5).get(str7);
                                            obj6.getClass();
                                            ye3 g3 = fe3.g((de3) obj6);
                                            Object obj7 = g2.get("id");
                                            obj7.getClass();
                                            i = i10;
                                            i2 = i13;
                                            if (fe3.e(fe3.h((de3) obj7)) == 0) {
                                                try {
                                                    de3 de3Var10 = (de3) g3.get("components");
                                                    if (de3Var10 != null) {
                                                        i3 = i11;
                                                        try {
                                                            f2 = fe3.f(de3Var10);
                                                            i4 = i12;
                                                        } catch (Exception unused4) {
                                                            i4 = i12;
                                                            str3 = str7;
                                                            str = str8;
                                                            str2 = str11;
                                                            str7 = str12;
                                                            ye3Var = null;
                                                            if (ye3Var == null) {
                                                            }
                                                            it = it2;
                                                            str9 = str2;
                                                            arrayList6 = arrayList2;
                                                            z2 = z;
                                                            str8 = str;
                                                            i10 = i;
                                                            i12 = i4;
                                                            i13 = i2;
                                                            i11 = i3;
                                                            str10 = str7;
                                                            str7 = str3;
                                                            file3 = file2;
                                                        }
                                                        try {
                                                            str5 = str7;
                                                            map = map2;
                                                            try {
                                                                arrayList4 = new ArrayList(ht0.v0(f2, 10));
                                                                Iterator it5 = f2.A.iterator();
                                                                while (it5.hasNext()) {
                                                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(fe3.g((de3) it5.next()));
                                                                    Object obj8 = linkedHashMap3.get("rect");
                                                                    obj8.getClass();
                                                                    Iterator it6 = it5;
                                                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(fe3.g((de3) obj8));
                                                                    Object obj9 = linkedHashMap4.get("x");
                                                                    obj9.getClass();
                                                                    linkedHashMap4.put("x", fe3.a(Integer.valueOf(fe3.e(fe3.h((de3) obj9)) + my4Var.a)));
                                                                    Object obj10 = linkedHashMap4.get("y");
                                                                    obj10.getClass();
                                                                    linkedHashMap4.put("y", fe3.a(Integer.valueOf(fe3.e(fe3.h((de3) obj10)) + my4Var.b)));
                                                                    linkedHashMap3.put("rect", new ye3(linkedHashMap4));
                                                                    arrayList4.add(new ye3(linkedHashMap3));
                                                                    it5 = it6;
                                                                }
                                                            } catch (Exception unused5) {
                                                                str = str8;
                                                                str2 = str11;
                                                                str7 = str12;
                                                                str3 = str5;
                                                                ye3Var = null;
                                                                if (ye3Var == null) {
                                                                }
                                                                it = it2;
                                                                str9 = str2;
                                                                arrayList6 = arrayList2;
                                                                z2 = z;
                                                                str8 = str;
                                                                i10 = i;
                                                                i12 = i4;
                                                                i13 = i2;
                                                                i11 = i3;
                                                                str10 = str7;
                                                                str7 = str3;
                                                                file3 = file2;
                                                            }
                                                        } catch (Exception unused6) {
                                                            str3 = str7;
                                                            str = str8;
                                                            str2 = str11;
                                                            str7 = str12;
                                                            ye3Var = null;
                                                            if (ye3Var == null) {
                                                            }
                                                            it = it2;
                                                            str9 = str2;
                                                            arrayList6 = arrayList2;
                                                            z2 = z;
                                                            str8 = str;
                                                            i10 = i;
                                                            i12 = i4;
                                                            i13 = i2;
                                                            i11 = i3;
                                                            str10 = str7;
                                                            str7 = str3;
                                                            file3 = file2;
                                                        }
                                                    } else {
                                                        str5 = str7;
                                                        map = map2;
                                                        i3 = i11;
                                                        i4 = i12;
                                                        arrayList4 = null;
                                                    }
                                                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(g3);
                                                    if (arrayList4 != null) {
                                                        de3Var = new nd3(arrayList4);
                                                    } else {
                                                        de3Var = ue3.INSTANCE;
                                                    }
                                                    linkedHashMap5.put("components", de3Var);
                                                    g3 = new ye3(linkedHashMap5);
                                                } catch (Exception unused7) {
                                                    i3 = i11;
                                                }
                                            } else {
                                                str5 = str7;
                                                map = map2;
                                                i3 = i11;
                                                i4 = i12;
                                            }
                                            try {
                                                de3 de3Var11 = (de3) g.get(str8);
                                                if (de3Var11 != null && (de3Var5 = (de3) fe3.g(de3Var11).get("secondaryScreenDisplay")) != null) {
                                                    ye3Var2 = fe3.g(de3Var5);
                                                } else {
                                                    ye3Var2 = null;
                                                }
                                                Object obj11 = fe3.g(de3Var7).get("layout");
                                                obj11.getClass();
                                                Object obj12 = fe3.g((de3) obj11).get("secondaryScreenLayoutDto");
                                                obj12.getClass();
                                                ye3 g4 = fe3.g((de3) obj12);
                                                if (ye3Var2 != null && (de3Var3 = (de3) ye3Var2.get("id")) != null && fe3.e(fe3.h(de3Var3)) == 0) {
                                                    de3 de3Var12 = (de3) g4.get("components");
                                                    if (de3Var12 != null) {
                                                        nd3 f4 = fe3.f(de3Var12);
                                                        str = str8;
                                                        try {
                                                            arrayList5 = new ArrayList(ht0.v0(f4, 10));
                                                            Iterator it7 = f4.A.iterator();
                                                            while (it7.hasNext()) {
                                                                LinkedHashMap linkedHashMap6 = new LinkedHashMap(fe3.g((de3) it7.next()));
                                                                Object obj13 = linkedHashMap6.get("rect");
                                                                obj13.getClass();
                                                                Iterator it8 = it7;
                                                                LinkedHashMap linkedHashMap7 = new LinkedHashMap(fe3.g((de3) obj13));
                                                                Object obj14 = linkedHashMap7.get("x");
                                                                obj14.getClass();
                                                                linkedHashMap7.put("x", fe3.a(Integer.valueOf(fe3.e(fe3.h((de3) obj14)) + my4Var.a)));
                                                                Object obj15 = linkedHashMap7.get("y");
                                                                obj15.getClass();
                                                                linkedHashMap7.put("y", fe3.a(Integer.valueOf(fe3.e(fe3.h((de3) obj15)) + my4Var.b)));
                                                                linkedHashMap6.put("rect", new ye3(linkedHashMap7));
                                                                arrayList5.add(new ye3(linkedHashMap6));
                                                                it7 = it8;
                                                            }
                                                        } catch (Exception unused8) {
                                                            str2 = str11;
                                                            str7 = str12;
                                                            str3 = str5;
                                                            ye3Var = null;
                                                            if (ye3Var == null) {
                                                            }
                                                            it = it2;
                                                            str9 = str2;
                                                            arrayList6 = arrayList2;
                                                            z2 = z;
                                                            str8 = str;
                                                            i10 = i;
                                                            i12 = i4;
                                                            i13 = i2;
                                                            i11 = i3;
                                                            str10 = str7;
                                                            str7 = str3;
                                                            file3 = file2;
                                                        }
                                                    } else {
                                                        str = str8;
                                                        arrayList5 = null;
                                                    }
                                                    LinkedHashMap linkedHashMap8 = new LinkedHashMap(g4);
                                                    if (arrayList5 != null) {
                                                        de3Var4 = new nd3(arrayList5);
                                                    } else {
                                                        de3Var4 = ue3.INSTANCE;
                                                    }
                                                    linkedHashMap8.put("components", de3Var4);
                                                    g4 = new ye3(linkedHashMap8);
                                                } else {
                                                    str = str8;
                                                }
                                                if (ye3Var2 != null && (de3Var2 = (de3) ye3Var2.get("id")) != null && fe3.e(fe3.h(de3Var2)) == 0) {
                                                    Object obj16 = ye3Var2.get("width");
                                                    obj16.getClass();
                                                    vr4 vr4Var2 = new vr4("x", fe3.h((de3) obj16));
                                                    Object obj17 = ye3Var2.get("height");
                                                    obj17.getClass();
                                                    ye3Var3 = new ye3(c14.m0(vr4Var2, new vr4("y", fe3.h((de3) obj17))));
                                                } else {
                                                    try {
                                                        Object obj18 = g2.get("width");
                                                        obj18.getClass();
                                                        vr4 vr4Var3 = new vr4("x", fe3.h((de3) obj18));
                                                        Object obj19 = g2.get("height");
                                                        obj19.getClass();
                                                        ye3Var3 = new ye3(c14.m0(vr4Var3, new vr4("y", fe3.h((de3) obj19))));
                                                    } catch (Exception unused9) {
                                                        str7 = str12;
                                                        str3 = str5;
                                                        str2 = str11;
                                                        ye3Var = null;
                                                        if (ye3Var == null) {
                                                        }
                                                        it = it2;
                                                        str9 = str2;
                                                        arrayList6 = arrayList2;
                                                        z2 = z;
                                                        str8 = str;
                                                        i10 = i;
                                                        i12 = i4;
                                                        i13 = i2;
                                                        i11 = i3;
                                                        str10 = str7;
                                                        str7 = str3;
                                                        file3 = file2;
                                                    }
                                                }
                                                try {
                                                    linkedHashMap2 = new LinkedHashMap(fe3.g(de3Var7));
                                                    str7 = str12;
                                                } catch (Exception unused10) {
                                                    str7 = str12;
                                                }
                                                try {
                                                    Object obj20 = linkedHashMap2.get(str7);
                                                    obj20.getClass();
                                                    LinkedHashMap linkedHashMap9 = new LinkedHashMap(fe3.g((de3) obj20));
                                                    linkedHashMap9.put("uiSize", ye3Var3);
                                                    linkedHashMap9.put("insets", new ye3(map));
                                                    str3 = str5;
                                                    try {
                                                        Map m0 = c14.m0(new vr4(str3, g3), new vr4("secondaryScreenLayoutDto", g4));
                                                        linkedHashMap2.put(str7, new ye3(linkedHashMap9));
                                                        linkedHashMap2.put("layout", new ye3(m0));
                                                        arrayList7.add(new ye3(linkedHashMap2));
                                                        str10 = str7;
                                                        arrayList3 = arrayList7;
                                                        str7 = str3;
                                                        str8 = str;
                                                        str3 = it4;
                                                        arrayList6 = arrayList;
                                                        str9 = str11;
                                                        i10 = i;
                                                        i12 = i4;
                                                        i13 = i2;
                                                        i11 = i3;
                                                        it3 = str3;
                                                    } catch (Exception unused11) {
                                                        str2 = str11;
                                                        ye3Var = null;
                                                        if (ye3Var == null) {
                                                        }
                                                        it = it2;
                                                        str9 = str2;
                                                        arrayList6 = arrayList2;
                                                        z2 = z;
                                                        str8 = str;
                                                        i10 = i;
                                                        i12 = i4;
                                                        i13 = i2;
                                                        i11 = i3;
                                                        str10 = str7;
                                                        str7 = str3;
                                                        file3 = file2;
                                                    }
                                                } catch (Exception unused12) {
                                                    str3 = str5;
                                                    str2 = str11;
                                                    ye3Var = null;
                                                    if (ye3Var == null) {
                                                    }
                                                    it = it2;
                                                    str9 = str2;
                                                    arrayList6 = arrayList2;
                                                    z2 = z;
                                                    str8 = str;
                                                    i10 = i;
                                                    i12 = i4;
                                                    i13 = i2;
                                                    i11 = i3;
                                                    str10 = str7;
                                                    str7 = str3;
                                                    file3 = file2;
                                                }
                                            } catch (Exception unused13) {
                                                str = str8;
                                            }
                                        } catch (Exception unused14) {
                                            str3 = str7;
                                            str = str8;
                                            str7 = str10;
                                            i = i10;
                                            arrayList = arrayList6;
                                            i2 = i13;
                                            i3 = i11;
                                            i4 = i12;
                                            str2 = str9;
                                        }
                                    }
                                    str3 = str7;
                                    str = str8;
                                    String str13 = str9;
                                    str7 = str10;
                                    i = i10;
                                    arrayList = arrayList6;
                                    i2 = i13;
                                    i3 = i11;
                                    i4 = i12;
                                    linkedHashMap = new LinkedHashMap(fe3.g(de3Var6));
                                    str2 = str13;
                                } catch (Exception unused15) {
                                    str3 = str7;
                                    str = str8;
                                    str2 = str9;
                                    str7 = str10;
                                    i = i10;
                                    arrayList = arrayList6;
                                    i2 = i13;
                                    i3 = i11;
                                    i4 = i12;
                                }
                            } catch (Exception unused16) {
                                str = str8;
                                str2 = str9;
                                file2 = file3;
                                i = i10;
                                arrayList = arrayList6;
                                i2 = i13;
                                i3 = i11;
                                i4 = i12;
                                str3 = str7;
                                str7 = str10;
                                ye3Var = null;
                                if (ye3Var == null) {
                                }
                                it = it2;
                                str9 = str2;
                                arrayList6 = arrayList2;
                                z2 = z;
                                str8 = str;
                                i10 = i;
                                i12 = i4;
                                i13 = i2;
                                i11 = i3;
                                str10 = str7;
                                str7 = str3;
                                file3 = file2;
                            }
                            try {
                                linkedHashMap.put(str2, new nd3(arrayList3));
                                ye3Var = new ye3(linkedHashMap);
                            } catch (Exception unused17) {
                                ye3Var = null;
                                if (ye3Var == null) {
                                }
                                it = it2;
                                str9 = str2;
                                arrayList6 = arrayList2;
                                z2 = z;
                                str8 = str;
                                i10 = i;
                                i12 = i4;
                                i13 = i2;
                                i11 = i3;
                                str10 = str7;
                                str7 = str3;
                                file3 = file2;
                            }
                            if (ye3Var == null) {
                                arrayList2 = arrayList;
                                try {
                                    arrayList2.add(ye3Var);
                                } catch (Exception unused18) {
                                    file = file2;
                                    file.delete();
                                    return;
                                }
                            } else {
                                arrayList2 = arrayList;
                            }
                            it = it2;
                            str9 = str2;
                            arrayList6 = arrayList2;
                            z2 = z;
                            str8 = str;
                            i10 = i;
                            i12 = i4;
                            i13 = i2;
                            i11 = i3;
                            str10 = str7;
                            str7 = str3;
                            file3 = file2;
                        }
                        file2 = file3;
                        file = file2;
                        jc2.F0(file, new nd3(arrayList6).toString());
                        return;
                    }
                    jc2.F0(file, new nd3(arrayList6).toString());
                    return;
                } catch (Exception unused19) {
                    file.delete();
                    return;
                }
                nd3 f32 = fe3.f((de3) ii2.g(new v83(29)).a(he3.a, jc2.B0(file3)));
                ArrayList arrayList62 = new ArrayList();
                it = f32.A.iterator();
                while (it.hasNext()) {
                }
                file2 = file3;
                file = file2;
            } catch (Exception unused20) {
                file = file3;
            }
            d83Var = d83.e;
            int i102 = d83Var.d;
            int i112 = d83Var.c;
            int i122 = d83Var.b;
            int i132 = d83Var.a;
            boolean z22 = true;
            if (context.getResources().getConfiguration().orientation != 1) {
            }
        }
    }

    @Override // defpackage.y54
    public final int a() {
        switch (this.a) {
            case 0:
                return 34;
            case 1:
                return 35;
            case 2:
                return 39;
            default:
                return 7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0529 A[Catch: Exception -> 0x0561, TryCatch #21 {Exception -> 0x0561, blocks: (B:23:0x0114, B:24:0x012f, B:26:0x0135, B:28:0x014a, B:31:0x0160, B:141:0x0529, B:139:0x0522, B:144:0x0552), top: B:197:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x052f  */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r5v20, types: [ye3] */
    @Override // defpackage.y54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        String str;
        DisplayManager displayManager;
        Display display;
        Iterator it;
        String str2;
        ye3 ye3Var;
        ArrayList arrayList;
        String str3;
        String str4;
        String str5;
        String str6;
        de3 de3Var;
        String str7;
        ye3 ye3Var2;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        ye3 ye3Var3;
        String str14;
        ArrayList arrayList3;
        String str15;
        String str16;
        String str17;
        String str18;
        Iterator it2;
        ye3 g;
        Object obj;
        ye3 ye3Var4;
        ArrayList arrayList4;
        vr4 vr4Var;
        File[] listFiles;
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                SharedPreferences sharedPreferences = context.getSharedPreferences(v15.b(context), 0);
                sharedPreferences.getClass();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                boolean z = sharedPreferences.getBoolean("input_show_soft", true);
                edit.remove("input_show_soft");
                if (z) {
                    str = "hide_system_buttons_when_controller_connected";
                } else {
                    str = "always_invisible";
                }
                edit.putString("soft_input_behaviour", str);
                edit.apply();
                return;
            case 1:
                String str19 = "folds";
                String str20 = "orientation";
                String str21 = "uiSize";
                String str22 = "layoutVariants";
                File file = new File(context.getFilesDir(), "layouts.json");
                if (file.isFile() && (displayManager = (DisplayManager) context.getSystemService(DisplayManager.class)) != null && (display = displayManager.getDisplay(0)) != null) {
                    Point point = new Point();
                    display.getRealSize(point);
                    String str23 = "type";
                    String str24 = "component";
                    String str25 = "y";
                    String str26 = "width";
                    vr4 vr4Var2 = new vr4("mainScreenDisplay", new ye3(c14.m0(new vr4("id", fe3.a(Integer.valueOf(display.getDisplayId()))), new vr4("type", fe3.b("BUILT_IN")), new vr4("width", fe3.a(Integer.valueOf(point.x))), new vr4("height", fe3.a(Integer.valueOf(point.y))))));
                    ue3 ue3Var = ue3.INSTANCE;
                    ye3 ye3Var5 = new ye3(c14.m0(vr4Var2, new vr4("secondaryScreenDisplay", ue3Var)));
                    String str27 = "backgroundId";
                    String str28 = "height";
                    String str29 = "x";
                    String str30 = "backgroundMode";
                    String str31 = "rect";
                    ye3 ye3Var6 = new ye3(c14.m0(new vr4("backgroundId", ue3Var), new vr4("backgroundMode", fe3.b("FIT_CENTER")), new vr4("components", ue3Var)));
                    try {
                        nd3 f = fe3.f((de3) ii2.g(new v83(27)).a(he3.a, jc2.B0(file)));
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it3 = f.A.iterator();
                        while (it3.hasNext()) {
                            de3 de3Var2 = (de3) it3.next();
                            ye3 g2 = fe3.g(de3Var2);
                            de3 de3Var3 = (de3) g2.get(str23);
                            if (de3Var3 != null) {
                                String a = fe3.h(de3Var3).a();
                                it = it3;
                                str2 = a;
                            } else {
                                it = it3;
                                str2 = null;
                            }
                            String str32 = str23;
                            if (nb3.k(str2, "EXTERNAL")) {
                                String str33 = str29;
                                str29 = str21;
                                str21 = str28;
                                str28 = str26;
                                str26 = str25;
                                str25 = str33;
                                ye3Var = ye3Var5;
                                arrayList = arrayList5;
                                str3 = str30;
                                str4 = str20;
                                str5 = str22;
                                str6 = str27;
                                str7 = str31;
                                ye3Var2 = null;
                                str31 = str19;
                                str19 = str24;
                            } else {
                                try {
                                    Object obj2 = g2.get(str22);
                                    obj2.getClass();
                                    nd3 f2 = fe3.f((de3) obj2);
                                    de3Var = de3Var2;
                                    arrayList = arrayList5;
                                    try {
                                        arrayList2 = new ArrayList(ht0.v0(f2, 10));
                                        Iterator it4 = f2.A.iterator();
                                        while (it4.hasNext()) {
                                            try {
                                                ye3 g3 = fe3.g((de3) it4.next());
                                                Object obj3 = g3.get("variant");
                                                obj3.getClass();
                                                ye3 g4 = fe3.g((de3) obj3);
                                                Object obj4 = g3.get("layout");
                                                obj4.getClass();
                                                ye3 g5 = fe3.g((de3) obj4);
                                                Iterator it5 = it4;
                                                try {
                                                    p04 p04Var = new p04();
                                                    str8 = str22;
                                                    try {
                                                        Object obj5 = g4.get(str21);
                                                        obj5.getClass();
                                                        p04Var.put(str21, obj5);
                                                        Object obj6 = g4.get(str20);
                                                        obj6.getClass();
                                                        p04Var.put(str20, obj6);
                                                        Object obj7 = g4.get(str19);
                                                        obj7.getClass();
                                                        p04Var.put(str19, obj7);
                                                        p04Var.put("displays", ye3Var5);
                                                        ye3 ye3Var7 = new ye3(p04Var.b());
                                                        try {
                                                            p04 p04Var2 = new p04();
                                                            Object obj8 = (de3) g5.get(str27);
                                                            if (obj8 == null) {
                                                                try {
                                                                    obj8 = ue3.INSTANCE;
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                    String str34 = str29;
                                                                    str29 = str21;
                                                                    str21 = str28;
                                                                    str28 = str26;
                                                                    str26 = str25;
                                                                    str25 = str34;
                                                                    ye3Var = ye3Var5;
                                                                    str3 = str30;
                                                                    str4 = str20;
                                                                    str6 = str27;
                                                                    str7 = str31;
                                                                    str5 = str8;
                                                                    str31 = str19;
                                                                    str19 = str24;
                                                                    e.printStackTrace();
                                                                    ye3Var2 = de3Var;
                                                                    if (ye3Var2 == null) {
                                                                    }
                                                                    String str35 = str28;
                                                                    str28 = str21;
                                                                    str21 = str29;
                                                                    str29 = str25;
                                                                    str25 = str26;
                                                                    str26 = str35;
                                                                    str22 = str5;
                                                                    str24 = str19;
                                                                    str19 = str31;
                                                                    it3 = it;
                                                                    str23 = str32;
                                                                    str30 = str3;
                                                                    str20 = str4;
                                                                    str27 = str6;
                                                                    str31 = str7;
                                                                    ye3Var5 = ye3Var;
                                                                }
                                                            }
                                                            p04Var2.put(str27, obj8);
                                                            Object obj9 = g5.get(str30);
                                                            obj9.getClass();
                                                            p04Var2.put(str30, obj9);
                                                            de3 de3Var4 = (de3) g5.get("components");
                                                            if (de3Var4 != null && !(de3Var4 instanceof ue3)) {
                                                                nd3 f3 = fe3.f(de3Var4);
                                                                ye3Var = ye3Var5;
                                                                str3 = str30;
                                                                try {
                                                                    ArrayList arrayList6 = new ArrayList(ht0.v0(f3, 10));
                                                                    try {
                                                                        Iterator it6 = f3.A.iterator();
                                                                        while (it6.hasNext()) {
                                                                            ?? g6 = fe3.g((de3) it6.next());
                                                                            str7 = str31;
                                                                            try {
                                                                                Object obj10 = g6.get(str7);
                                                                                obj10.getClass();
                                                                                it2 = it6;
                                                                                g = fe3.g((de3) obj10);
                                                                                str31 = str19;
                                                                            } catch (Exception e2) {
                                                                                e = e2;
                                                                                String str36 = str29;
                                                                                str29 = str21;
                                                                                str21 = str28;
                                                                                str28 = str26;
                                                                                str26 = str25;
                                                                                str25 = str36;
                                                                                str31 = str19;
                                                                            }
                                                                            try {
                                                                                str4 = str20;
                                                                                String str37 = str29;
                                                                                str29 = str21;
                                                                                try {
                                                                                    obj = g.get(str37);
                                                                                    obj.getClass();
                                                                                    str6 = str27;
                                                                                } catch (Exception e3) {
                                                                                    e = e3;
                                                                                    str6 = str27;
                                                                                }
                                                                                try {
                                                                                    vr4 vr4Var3 = new vr4(str37, obj);
                                                                                    String str38 = str25;
                                                                                    str25 = str37;
                                                                                    try {
                                                                                        Object obj11 = g.get(str38);
                                                                                        obj11.getClass();
                                                                                        ye3Var4 = g2;
                                                                                        try {
                                                                                            vr4 vr4Var4 = new vr4(str38, obj11);
                                                                                            String str39 = str26;
                                                                                            str26 = str38;
                                                                                            try {
                                                                                                Object obj12 = g.get(str39);
                                                                                                obj12.getClass();
                                                                                                arrayList4 = arrayList2;
                                                                                                vr4 vr4Var5 = new vr4(str39, obj12);
                                                                                                str21 = str28;
                                                                                                try {
                                                                                                    Object obj13 = g.get(str21);
                                                                                                    obj13.getClass();
                                                                                                    str28 = str39;
                                                                                                    try {
                                                                                                        try {
                                                                                                            vr4Var = new vr4(str7, new ye3(c14.m0(vr4Var3, vr4Var4, vr4Var5, new vr4(str21, obj13))));
                                                                                                            str19 = str24;
                                                                                                        } catch (Exception e4) {
                                                                                                            e = e4;
                                                                                                            str19 = str24;
                                                                                                            str5 = str8;
                                                                                                            e.printStackTrace();
                                                                                                            ye3Var2 = de3Var;
                                                                                                            if (ye3Var2 == null) {
                                                                                                            }
                                                                                                            String str352 = str28;
                                                                                                            str28 = str21;
                                                                                                            str21 = str29;
                                                                                                            str29 = str25;
                                                                                                            str25 = str26;
                                                                                                            str26 = str352;
                                                                                                            str22 = str5;
                                                                                                            str24 = str19;
                                                                                                            str19 = str31;
                                                                                                            it3 = it;
                                                                                                            str23 = str32;
                                                                                                            str30 = str3;
                                                                                                            str20 = str4;
                                                                                                            str27 = str6;
                                                                                                            str31 = str7;
                                                                                                            ye3Var5 = ye3Var;
                                                                                                        }
                                                                                                    } catch (Exception e5) {
                                                                                                        e = e5;
                                                                                                    }
                                                                                                } catch (Exception e6) {
                                                                                                    e = e6;
                                                                                                    str28 = str39;
                                                                                                }
                                                                                            } catch (Exception e7) {
                                                                                                e = e7;
                                                                                                str19 = str24;
                                                                                                str21 = str28;
                                                                                                str28 = str39;
                                                                                            }
                                                                                        } catch (Exception e8) {
                                                                                            e = e8;
                                                                                            String str40 = str26;
                                                                                            str26 = str38;
                                                                                            str21 = str28;
                                                                                            str28 = str40;
                                                                                        }
                                                                                    } catch (Exception e9) {
                                                                                        e = e9;
                                                                                        String str41 = str26;
                                                                                        str26 = str38;
                                                                                        str21 = str28;
                                                                                        str28 = str41;
                                                                                    }
                                                                                } catch (Exception e10) {
                                                                                    e = e10;
                                                                                    str19 = str24;
                                                                                    str21 = str28;
                                                                                    str28 = str26;
                                                                                    str26 = str25;
                                                                                    str25 = str37;
                                                                                    str5 = str8;
                                                                                    e.printStackTrace();
                                                                                    ye3Var2 = de3Var;
                                                                                    if (ye3Var2 == null) {
                                                                                    }
                                                                                    String str3522 = str28;
                                                                                    str28 = str21;
                                                                                    str21 = str29;
                                                                                    str29 = str25;
                                                                                    str25 = str26;
                                                                                    str26 = str3522;
                                                                                    str22 = str5;
                                                                                    str24 = str19;
                                                                                    str19 = str31;
                                                                                    it3 = it;
                                                                                    str23 = str32;
                                                                                    str30 = str3;
                                                                                    str20 = str4;
                                                                                    str27 = str6;
                                                                                    str31 = str7;
                                                                                    ye3Var5 = ye3Var;
                                                                                }
                                                                                try {
                                                                                    Object obj14 = g6.get(str19);
                                                                                    obj14.getClass();
                                                                                    arrayList6.add(new ye3(c14.m0(vr4Var, new vr4(str19, obj14))));
                                                                                    str28 = str21;
                                                                                    str21 = str29;
                                                                                    str29 = str25;
                                                                                    str25 = str26;
                                                                                    str26 = str28;
                                                                                    str24 = str19;
                                                                                    str19 = str31;
                                                                                    it6 = it2;
                                                                                    str20 = str4;
                                                                                    str27 = str6;
                                                                                    g2 = ye3Var4;
                                                                                    arrayList2 = arrayList4;
                                                                                    str31 = str7;
                                                                                    str7 = 10;
                                                                                } catch (Exception e11) {
                                                                                    e = e11;
                                                                                    str5 = str8;
                                                                                    e.printStackTrace();
                                                                                    ye3Var2 = de3Var;
                                                                                    if (ye3Var2 == null) {
                                                                                    }
                                                                                    String str35222 = str28;
                                                                                    str28 = str21;
                                                                                    str21 = str29;
                                                                                    str29 = str25;
                                                                                    str25 = str26;
                                                                                    str26 = str35222;
                                                                                    str22 = str5;
                                                                                    str24 = str19;
                                                                                    str19 = str31;
                                                                                    it3 = it;
                                                                                    str23 = str32;
                                                                                    str30 = str3;
                                                                                    str20 = str4;
                                                                                    str27 = str6;
                                                                                    str31 = str7;
                                                                                    ye3Var5 = ye3Var;
                                                                                }
                                                                            } catch (Exception e12) {
                                                                                e = e12;
                                                                                String str42 = str29;
                                                                                str29 = str21;
                                                                                str21 = str28;
                                                                                str28 = str26;
                                                                                str26 = str25;
                                                                                str25 = str42;
                                                                                str4 = str20;
                                                                                str6 = str27;
                                                                                str19 = str24;
                                                                                str5 = str8;
                                                                                e.printStackTrace();
                                                                                ye3Var2 = de3Var;
                                                                                if (ye3Var2 == null) {
                                                                                }
                                                                                String str352222 = str28;
                                                                                str28 = str21;
                                                                                str21 = str29;
                                                                                str29 = str25;
                                                                                str25 = str26;
                                                                                str26 = str352222;
                                                                                str22 = str5;
                                                                                str24 = str19;
                                                                                str19 = str31;
                                                                                it3 = it;
                                                                                str23 = str32;
                                                                                str30 = str3;
                                                                                str20 = str4;
                                                                                str27 = str6;
                                                                                str31 = str7;
                                                                                ye3Var5 = ye3Var;
                                                                            }
                                                                        }
                                                                        String str43 = str29;
                                                                        str9 = str21;
                                                                        str10 = str28;
                                                                        str11 = str26;
                                                                        str12 = str25;
                                                                        str13 = str43;
                                                                        ye3Var3 = g2;
                                                                        str14 = str20;
                                                                        arrayList3 = arrayList2;
                                                                        str15 = str27;
                                                                        str16 = str31;
                                                                        str17 = str19;
                                                                        str18 = str24;
                                                                        de3 de3Var5 = (de3) p04Var2.put("components", new nd3(arrayList6));
                                                                    } catch (Exception e13) {
                                                                        e = e13;
                                                                        String str44 = str29;
                                                                        str29 = str21;
                                                                        str21 = str28;
                                                                        str28 = str26;
                                                                        str26 = str25;
                                                                        str25 = str44;
                                                                        str4 = str20;
                                                                        str6 = str27;
                                                                        str7 = str31;
                                                                        str31 = str19;
                                                                        str19 = str24;
                                                                        str5 = str8;
                                                                        e.printStackTrace();
                                                                        ye3Var2 = de3Var;
                                                                        if (ye3Var2 == null) {
                                                                        }
                                                                        String str3522222 = str28;
                                                                        str28 = str21;
                                                                        str21 = str29;
                                                                        str29 = str25;
                                                                        str25 = str26;
                                                                        str26 = str3522222;
                                                                        str22 = str5;
                                                                        str24 = str19;
                                                                        str19 = str31;
                                                                        it3 = it;
                                                                        str23 = str32;
                                                                        str30 = str3;
                                                                        str20 = str4;
                                                                        str27 = str6;
                                                                        str31 = str7;
                                                                        ye3Var5 = ye3Var;
                                                                    }
                                                                } catch (Exception e14) {
                                                                    e = e14;
                                                                    String str45 = str29;
                                                                    str29 = str21;
                                                                    str21 = str28;
                                                                    str28 = str26;
                                                                    str26 = str25;
                                                                    str25 = str45;
                                                                    str4 = str20;
                                                                    str6 = str27;
                                                                    str7 = str31;
                                                                    str31 = str19;
                                                                    str19 = str24;
                                                                    str5 = str8;
                                                                    e.printStackTrace();
                                                                    ye3Var2 = de3Var;
                                                                    if (ye3Var2 == null) {
                                                                    }
                                                                    String str35222222 = str28;
                                                                    str28 = str21;
                                                                    str21 = str29;
                                                                    str29 = str25;
                                                                    str25 = str26;
                                                                    str26 = str35222222;
                                                                    str22 = str5;
                                                                    str24 = str19;
                                                                    str19 = str31;
                                                                    it3 = it;
                                                                    str23 = str32;
                                                                    str30 = str3;
                                                                    str20 = str4;
                                                                    str27 = str6;
                                                                    str31 = str7;
                                                                    ye3Var5 = ye3Var;
                                                                }
                                                            } else {
                                                                String str46 = str29;
                                                                str9 = str21;
                                                                str10 = str28;
                                                                str11 = str26;
                                                                str12 = str25;
                                                                str13 = str46;
                                                                ye3Var3 = g2;
                                                                ye3Var = ye3Var5;
                                                                str3 = str30;
                                                                str14 = str20;
                                                                arrayList3 = arrayList2;
                                                                str15 = str27;
                                                                str16 = str31;
                                                                str17 = str19;
                                                                str18 = str24;
                                                                de3 de3Var6 = (de3) p04Var2.put("components", ue3.INSTANCE);
                                                            }
                                                            ArrayList arrayList7 = arrayList3;
                                                            arrayList7.add(new ye3(c14.m0(new vr4("variant", ye3Var7), new vr4("layout", new ye3(c14.m0(new vr4("mainScreenLayoutDto", new ye3(p04Var2.b())), new vr4("secondaryScreenLayoutDto", ye3Var6)))))));
                                                            String str47 = str11;
                                                            str28 = str10;
                                                            str21 = str9;
                                                            str29 = str13;
                                                            str25 = str12;
                                                            str26 = str47;
                                                            arrayList2 = arrayList7;
                                                            str24 = str18;
                                                            str19 = str17;
                                                            it4 = it5;
                                                            str30 = str3;
                                                            str22 = str8;
                                                            str20 = str14;
                                                            str27 = str15;
                                                            g2 = ye3Var3;
                                                            str31 = str16;
                                                            ye3Var5 = ye3Var;
                                                        } catch (Exception e15) {
                                                            e = e15;
                                                            String str48 = str29;
                                                            str29 = str21;
                                                            str21 = str28;
                                                            str28 = str26;
                                                            str26 = str25;
                                                            str25 = str48;
                                                            ye3Var = ye3Var5;
                                                            str3 = str30;
                                                        }
                                                    } catch (Exception e16) {
                                                        e = e16;
                                                        String str49 = str29;
                                                        str29 = str21;
                                                        str21 = str28;
                                                        str28 = str26;
                                                        str26 = str25;
                                                        str25 = str49;
                                                        ye3Var = ye3Var5;
                                                        str3 = str30;
                                                    }
                                                } catch (Exception e17) {
                                                    e = e17;
                                                    String str50 = str29;
                                                    str29 = str21;
                                                    str21 = str28;
                                                    str28 = str26;
                                                    str26 = str25;
                                                    str25 = str50;
                                                    ye3Var = ye3Var5;
                                                    str3 = str30;
                                                    str4 = str20;
                                                    str8 = str22;
                                                }
                                            } catch (Exception e18) {
                                                e = e18;
                                                String str51 = str29;
                                                str29 = str21;
                                                str21 = str28;
                                                str28 = str26;
                                                str26 = str25;
                                                str25 = str51;
                                                ye3Var = ye3Var5;
                                                str3 = str30;
                                                str4 = str20;
                                                str8 = str22;
                                            }
                                        }
                                        String str52 = str29;
                                        str29 = str21;
                                        str21 = str28;
                                        str28 = str26;
                                        str26 = str25;
                                        str25 = str52;
                                        ye3Var = ye3Var5;
                                        str3 = str30;
                                        str4 = str20;
                                        String str53 = str22;
                                        str6 = str27;
                                        str7 = str31;
                                        str31 = str19;
                                        str19 = str24;
                                        linkedHashMap = new LinkedHashMap(g2);
                                        str5 = str53;
                                    } catch (Exception e19) {
                                        e = e19;
                                        String str54 = str29;
                                        str29 = str21;
                                        str21 = str28;
                                        str28 = str26;
                                        str26 = str25;
                                        str25 = str54;
                                        ye3Var = ye3Var5;
                                        str3 = str30;
                                        str4 = str20;
                                        str5 = str22;
                                        str6 = str27;
                                        str7 = str31;
                                        str31 = str19;
                                        str19 = str24;
                                        e.printStackTrace();
                                        ye3Var2 = de3Var;
                                        if (ye3Var2 == null) {
                                        }
                                        String str352222222 = str28;
                                        str28 = str21;
                                        str21 = str29;
                                        str29 = str25;
                                        str25 = str26;
                                        str26 = str352222222;
                                        str22 = str5;
                                        str24 = str19;
                                        str19 = str31;
                                        it3 = it;
                                        str23 = str32;
                                        str30 = str3;
                                        str20 = str4;
                                        str27 = str6;
                                        str31 = str7;
                                        ye3Var5 = ye3Var;
                                    }
                                    try {
                                        linkedHashMap.put(str5, new nd3(arrayList2));
                                        ye3Var2 = new ye3(linkedHashMap);
                                    } catch (Exception e20) {
                                        e = e20;
                                        e.printStackTrace();
                                        ye3Var2 = de3Var;
                                        if (ye3Var2 == null) {
                                        }
                                        String str3522222222 = str28;
                                        str28 = str21;
                                        str21 = str29;
                                        str29 = str25;
                                        str25 = str26;
                                        str26 = str3522222222;
                                        str22 = str5;
                                        str24 = str19;
                                        str19 = str31;
                                        it3 = it;
                                        str23 = str32;
                                        str30 = str3;
                                        str20 = str4;
                                        str27 = str6;
                                        str31 = str7;
                                        ye3Var5 = ye3Var;
                                    }
                                } catch (Exception e21) {
                                    e = e21;
                                    String str55 = str29;
                                    str29 = str21;
                                    str21 = str28;
                                    str28 = str26;
                                    str26 = str25;
                                    str25 = str55;
                                    ye3Var = ye3Var5;
                                    arrayList = arrayList5;
                                    str3 = str30;
                                    str4 = str20;
                                    str5 = str22;
                                    str6 = str27;
                                    de3Var = de3Var2;
                                }
                            }
                            if (ye3Var2 == null) {
                                arrayList5 = arrayList;
                                arrayList5.add(ye3Var2);
                            } else {
                                arrayList5 = arrayList;
                            }
                            String str35222222222 = str28;
                            str28 = str21;
                            str21 = str29;
                            str29 = str25;
                            str25 = str26;
                            str26 = str35222222222;
                            str22 = str5;
                            str24 = str19;
                            str19 = str31;
                            it3 = it;
                            str23 = str32;
                            str30 = str3;
                            str20 = str4;
                            str27 = str6;
                            str31 = str7;
                            ye3Var5 = ye3Var;
                        }
                        jc2.F0(file, new nd3(arrayList5).toString());
                        return;
                    } catch (Exception e22) {
                        e22.printStackTrace();
                        return;
                    }
                }
                return;
            case 2:
                d();
                return;
            default:
                File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir != null && (listFiles = externalCacheDir.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        file2.delete();
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.y54
    public final int c() {
        switch (this.a) {
            case 0:
                return 35;
            case 1:
                return 36;
            case 2:
                return 40;
            default:
                return 8;
        }
    }

    public /* synthetic */ g64(Context context, int i) {
        this.a = i;
        this.b = context;
    }
}
