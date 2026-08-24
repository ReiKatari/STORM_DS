package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dv6  reason: default package */
/* loaded from: classes.dex */
public final class dv6 {
    public final jd1 A;
    public final ci B;
    public final nx2 C;
    public final lg0 a;
    public final a42 b;
    public final x92 c;
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
    public dz v;
    public final ArrayList w;
    public final dr6 x;
    public final al1 y;
    public final w24 z;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x03bf, code lost:
        if (defpackage.ge7.W() != false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dv6(Context context, lg0 lg0Var, a42 a42Var, x92 x92Var) {
        int i;
        boolean z;
        ArrayList arrayList;
        CameraCharacteristics.Key key;
        boolean z2;
        jv6 m;
        jv6 m2;
        jv6 m3;
        jv6 m4;
        jv6 m5;
        jv6 m6;
        jv6 m7;
        jv6 m8;
        jv6 m9;
        jv6 m10;
        jv6 m11;
        jv6 m12;
        jv6 m13;
        jv6 m14;
        jv6 m15;
        jv6 m16;
        jv6 m17;
        jv6 m18;
        jv6 m19;
        jv6 m20;
        jv6 m21;
        jv6 m22;
        jv6 m23;
        jv6 m24;
        jv6 m25;
        jv6 m26;
        jv6 m27;
        jv6 m28;
        jv6 m29;
        jv6 m30;
        jv6 m31;
        jv6 m32;
        context.getClass();
        lg0Var.getClass();
        a42Var.getClass();
        this.a = lg0Var;
        this.b = a42Var;
        this.c = x92Var;
        qc0 qc0Var = (qc0) lg0Var;
        String str = qc0Var.A;
        this.d = str;
        CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key2.getClass();
        Integer num = (Integer) qc0Var.c(key2);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2;
        }
        this.e = i;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.g = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.h = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        this.i = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        this.j = arrayList6;
        this.k = new ArrayList();
        this.l = new LinkedHashMap();
        ArrayList arrayList7 = new ArrayList();
        this.m = arrayList7;
        this.n = new ArrayList();
        lg0.g.getClass();
        boolean b = kg0.b(lg0Var);
        this.t = b;
        this.w = new ArrayList();
        this.x = j();
        y65 y65Var = si1.a;
        ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = (ExtraSupportedSurfaceCombinationsQuirk) si1.a().b(ExtraSupportedSurfaceCombinationsQuirk.class);
        this.y = al1.g.l(context);
        this.z = new w24(1);
        this.A = new jd1(27);
        ci ciVar = new ci(lg0Var);
        this.B = ciVar;
        this.C = new nx2(lg0Var);
        CameraCharacteristics.Key key3 = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key3.getClass();
        int[] iArr = (int[]) qc0Var.c(key3);
        if (iArr != null) {
            z = b;
            this.o = fv.m0(iArr, 3);
            this.p = fv.m0(iArr, 6);
            this.s = fv.m0(iArr, 16);
            this.u = fv.m0(iArr, 1);
        } else {
            z = b;
        }
        boolean z3 = this.o;
        boolean z4 = this.p;
        ex6 ex6Var = xu2.a;
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ev6 ev6Var = new ev6();
        tr6 tr6Var = jv6.e;
        hv6 hv6Var = hv6.PRIV;
        fv6 fv6Var = fv6.MAXIMUM;
        tr6 tr6Var2 = jv6.e;
        ev6Var.a(w31.m(hv6Var, fv6Var, tr6Var2));
        arrayList9.add(ev6Var);
        ev6 ev6Var2 = new ev6();
        hv6 hv6Var2 = hv6.JPEG;
        ev6Var2.a(w31.m(hv6Var2, fv6Var, tr6Var2));
        arrayList9.add(ev6Var2);
        ev6 ev6Var3 = new ev6();
        hv6 hv6Var3 = hv6.YUV;
        ev6Var3.a(w31.m(hv6Var3, fv6Var, tr6Var2));
        arrayList9.add(ev6Var3);
        ev6 ev6Var4 = new ev6();
        fv6 fv6Var2 = fv6.PREVIEW;
        lb1.u(ev6Var4, w31.m(hv6Var, fv6Var2, tr6Var2), hv6Var2, fv6Var, tr6Var2);
        ev6 f = lb1.f(arrayList9, ev6Var4);
        lb1.u(f, w31.m(hv6Var3, fv6Var2, tr6Var2), hv6Var2, fv6Var, tr6Var2);
        ev6 f2 = lb1.f(arrayList9, f);
        lb1.u(f2, w31.m(hv6Var, fv6Var2, tr6Var2), hv6Var, fv6Var2, tr6Var2);
        ev6 f3 = lb1.f(arrayList9, f2);
        lb1.u(f3, w31.m(hv6Var, fv6Var2, tr6Var2), hv6Var3, fv6Var2, tr6Var2);
        ev6 f4 = lb1.f(arrayList9, f3);
        lb1.u(f4, w31.m(hv6Var, fv6Var2, tr6Var2), hv6Var3, fv6Var2, tr6Var2);
        f4.a(w31.m(hv6Var2, fv6Var, tr6Var2));
        arrayList9.add(f4);
        arrayList8.addAll(arrayList9);
        if (i != 0 && i != 1 && i != 3 && i != 4) {
            arrayList = arrayList2;
        } else {
            ArrayList arrayList10 = new ArrayList();
            ev6 ev6Var5 = new ev6();
            ev6Var5.a(w31.m(hv6Var, fv6Var2, tr6Var2));
            fv6 fv6Var3 = fv6.RECORD;
            arrayList = arrayList2;
            ev6Var5.a(w31.m(hv6Var, fv6Var3, tr6Var2));
            arrayList10.add(ev6Var5);
            ev6 ev6Var6 = new ev6();
            lb1.u(ev6Var6, w31.m(hv6Var, fv6Var2, tr6Var2), hv6Var3, fv6Var3, tr6Var2);
            ev6 f5 = lb1.f(arrayList10, ev6Var6);
            lb1.u(f5, w31.m(hv6Var3, fv6Var2, tr6Var2), hv6Var3, fv6Var3, tr6Var2);
            ev6 f6 = lb1.f(arrayList10, f5);
            lb1.u(f6, w31.m(hv6Var, fv6Var2, tr6Var2), hv6Var, fv6Var3, tr6Var2);
            f6.a(w31.m(hv6Var2, fv6Var3, tr6Var2));
            arrayList10.add(f6);
            ev6 ev6Var7 = new ev6();
            lb1.u(ev6Var7, w31.m(hv6Var, fv6Var2, tr6Var2), hv6Var3, fv6Var3, tr6Var2);
            ev6Var7.a(w31.m(hv6Var2, fv6Var3, tr6Var2));
            arrayList10.add(ev6Var7);
            ev6 ev6Var8 = new ev6();
            lb1.u(ev6Var8, w31.m(hv6Var3, fv6Var2, tr6Var2), hv6Var3, fv6Var2, tr6Var2);
            ev6Var8.a(w31.m(hv6Var2, fv6Var, tr6Var2));
            arrayList10.add(ev6Var8);
            arrayList8.addAll(arrayList10);
        }
        if (i == 1 || i == 3) {
            ArrayList arrayList11 = new ArrayList();
            ev6 ev6Var9 = new ev6();
            lb1.u(ev6Var9, w31.m(hv6Var, fv6Var2, tr6Var2), hv6Var, fv6Var, tr6Var2);
            ev6 f7 = lb1.f(arrayList11, ev6Var9);
            lb1.u(f7, w31.m(hv6Var, fv6Var2, tr6Var2), hv6Var3, fv6Var, tr6Var2);
            ev6 f8 = lb1.f(arrayList11, f7);
            lb1.u(f8, w31.m(hv6Var3, fv6Var2, tr6Var2), hv6Var3, fv6Var, tr6Var2);
            ev6 f9 = lb1.f(arrayList11, f8);
            lb1.u(f9, w31.m(hv6Var, fv6Var2, tr6Var2), hv6Var, fv6Var2, tr6Var2);
            f9.a(w31.m(hv6Var2, fv6Var, tr6Var2));
            arrayList11.add(f9);
            ev6 ev6Var10 = new ev6();
            fv6 fv6Var4 = fv6.VGA;
            lb1.u(ev6Var10, w31.m(hv6Var3, fv6Var4, tr6Var2), hv6Var, fv6Var2, tr6Var2);
            ev6Var10.a(w31.m(hv6Var3, fv6Var, tr6Var2));
            arrayList11.add(ev6Var10);
            ev6 ev6Var11 = new ev6();
            lb1.u(ev6Var11, w31.m(hv6Var3, fv6Var4, tr6Var2), hv6Var3, fv6Var2, tr6Var2);
            ev6Var11.a(w31.m(hv6Var3, fv6Var, tr6Var2));
            arrayList11.add(ev6Var11);
            arrayList8.addAll(arrayList11);
        }
        if (z3) {
            ArrayList arrayList12 = new ArrayList();
            ev6 ev6Var12 = new ev6();
            hv6 hv6Var4 = hv6.RAW;
            ev6Var12.a(w31.m(hv6Var4, fv6Var, tr6Var2));
            arrayList12.add(ev6Var12);
            ev6 ev6Var13 = new ev6();
            lb1.u(ev6Var13, w31.m(hv6Var, fv6Var2, tr6Var2), hv6Var4, fv6Var, tr6Var2);
            ev6 f10 = lb1.f(arrayList12, ev6Var13);
            lb1.u(f10, w31.m(hv6Var3, fv6Var2, tr6Var2), hv6Var4, fv6Var, tr6Var2);
            ev6 f11 = lb1.f(arrayList12, f10);
            lb1.u(f11, w31.m(hv6Var, fv6Var2, tr6Var2), hv6Var, fv6Var2, tr6Var2);
            f11.a(w31.m(hv6Var4, fv6Var, tr6Var2));
            arrayList12.add(f11);
            ev6 ev6Var14 = new ev6();
            lb1.u(ev6Var14, w31.m(hv6Var, fv6Var2, tr6Var2), hv6Var3, fv6Var2, tr6Var2);
            ev6Var14.a(w31.m(hv6Var4, fv6Var, tr6Var2));
            arrayList12.add(ev6Var14);
            ev6 ev6Var15 = new ev6();
            lb1.u(ev6Var15, w31.m(hv6Var3, fv6Var2, tr6Var2), hv6Var3, fv6Var2, tr6Var2);
            ev6Var15.a(w31.m(hv6Var4, fv6Var, tr6Var2));
            arrayList12.add(ev6Var15);
            ev6 ev6Var16 = new ev6();
            lb1.u(ev6Var16, w31.m(hv6Var, fv6Var2, tr6Var2), hv6Var2, fv6Var, tr6Var2);
            ev6Var16.a(w31.m(hv6Var4, fv6Var, tr6Var2));
            arrayList12.add(ev6Var16);
            ev6 ev6Var17 = new ev6();
            lb1.u(ev6Var17, w31.m(hv6Var3, fv6Var2, tr6Var2), hv6Var2, fv6Var, tr6Var2);
            ev6Var17.a(w31.m(hv6Var4, fv6Var, tr6Var2));
            arrayList12.add(ev6Var17);
            arrayList8.addAll(arrayList12);
        }
        if (z4 && i == 0) {
            ArrayList arrayList13 = new ArrayList();
            ev6 ev6Var18 = new ev6();
            ev6Var18.a(w31.m(hv6Var, fv6Var2, tr6Var2));
            m32 = w31.m(hv6Var, fv6Var, jv6.e);
            ev6Var18.a(m32);
            ev6 f12 = lb1.f(arrayList13, ev6Var18);
            xg6.w(hv6Var, fv6Var2, f12, hv6Var3, fv6Var);
            ev6 f13 = lb1.f(arrayList13, f12);
            xg6.w(hv6Var3, fv6Var2, f13, hv6Var3, fv6Var);
            arrayList13.add(f13);
            arrayList8.addAll(arrayList13);
        }
        if (i == 3) {
            ArrayList arrayList14 = new ArrayList();
            ev6 ev6Var19 = new ev6();
            m30 = w31.m(hv6Var, fv6Var2, jv6.e);
            ev6Var19.a(m30);
            fv6 fv6Var5 = fv6.VGA;
            xg6.w(hv6Var, fv6Var5, ev6Var19, hv6Var3, fv6Var);
            hv6 hv6Var5 = hv6.RAW;
            m31 = w31.m(hv6Var5, fv6Var, jv6.e);
            ev6Var19.a(m31);
            arrayList14.add(ev6Var19);
            ev6 ev6Var20 = new ev6();
            xg6.w(hv6Var, fv6Var2, ev6Var20, hv6Var, fv6Var5);
            xg6.w(hv6Var2, fv6Var, ev6Var20, hv6Var5, fv6Var);
            arrayList14.add(ev6Var20);
            arrayList8.addAll(arrayList14);
        }
        arrayList3.addAll(arrayList8);
        yt1 yt1Var = yt1.A;
        str.getClass();
        yt1 yt1Var2 = yt1Var;
        if (extraSupportedSurfaceCombinationsQuirk != null) {
            ev6 ev6Var21 = ExtraSupportedSurfaceCombinationsQuirk.a;
            String str2 = Build.DEVICE;
            if (!"heroqltevzw".equalsIgnoreCase(str2) && !"heroqltetmo".equalsIgnoreCase(str2)) {
                if (!ge7.V()) {
                    yt1Var2 = yt1Var;
                }
                yt1Var2 = hf.b0(ExtraSupportedSurfaceCombinationsQuirk.b);
            } else {
                ?? arrayList15 = new ArrayList();
                yt1Var2 = arrayList15;
                if (nb3.k(str, "1")) {
                    arrayList15.add(ExtraSupportedSurfaceCombinationsQuirk.a);
                    yt1Var2 = arrayList15;
                }
            }
        }
        arrayList3.addAll(yt1Var2);
        if (this.s) {
            ArrayList arrayList16 = new ArrayList();
            ev6 ev6Var22 = new ev6();
            fv6 fv6Var6 = fv6.ULTRA_MAXIMUM;
            xg6.w(hv6Var3, fv6Var6, ev6Var22, hv6Var, fv6Var2);
            fv6 fv6Var7 = fv6.RECORD;
            m18 = w31.m(hv6Var, fv6Var7, jv6.e);
            ev6Var22.a(m18);
            arrayList16.add(ev6Var22);
            ev6 ev6Var23 = new ev6();
            xg6.w(hv6Var2, fv6Var6, ev6Var23, hv6Var, fv6Var2);
            m19 = w31.m(hv6Var, fv6Var7, jv6.e);
            ev6Var23.a(m19);
            arrayList16.add(ev6Var23);
            ev6 ev6Var24 = new ev6();
            hv6 hv6Var6 = hv6.RAW;
            xg6.w(hv6Var6, fv6Var6, ev6Var24, hv6Var, fv6Var2);
            m20 = w31.m(hv6Var, fv6Var7, jv6.e);
            ev6Var24.a(m20);
            arrayList16.add(ev6Var24);
            ev6 ev6Var25 = new ev6();
            xg6.w(hv6Var3, fv6Var6, ev6Var25, hv6Var, fv6Var2);
            m21 = w31.m(hv6Var2, fv6Var, jv6.e);
            ev6Var25.a(m21);
            arrayList16.add(ev6Var25);
            ev6 ev6Var26 = new ev6();
            xg6.w(hv6Var2, fv6Var6, ev6Var26, hv6Var, fv6Var2);
            m22 = w31.m(hv6Var2, fv6Var, jv6.e);
            ev6Var26.a(m22);
            arrayList16.add(ev6Var26);
            ev6 ev6Var27 = new ev6();
            xg6.w(hv6Var6, fv6Var6, ev6Var27, hv6Var, fv6Var2);
            m23 = w31.m(hv6Var2, fv6Var, jv6.e);
            ev6Var27.a(m23);
            arrayList16.add(ev6Var27);
            ev6 ev6Var28 = new ev6();
            xg6.w(hv6Var3, fv6Var6, ev6Var28, hv6Var, fv6Var2);
            m24 = w31.m(hv6Var3, fv6Var, jv6.e);
            ev6Var28.a(m24);
            arrayList16.add(ev6Var28);
            ev6 ev6Var29 = new ev6();
            xg6.w(hv6Var2, fv6Var6, ev6Var29, hv6Var, fv6Var2);
            m25 = w31.m(hv6Var3, fv6Var, jv6.e);
            ev6Var29.a(m25);
            arrayList16.add(ev6Var29);
            ev6 ev6Var30 = new ev6();
            xg6.w(hv6Var6, fv6Var6, ev6Var30, hv6Var, fv6Var2);
            m26 = w31.m(hv6Var3, fv6Var, jv6.e);
            ev6Var30.a(m26);
            arrayList16.add(ev6Var30);
            ev6 ev6Var31 = new ev6();
            xg6.w(hv6Var3, fv6Var6, ev6Var31, hv6Var, fv6Var2);
            m27 = w31.m(hv6Var6, fv6Var, jv6.e);
            ev6Var31.a(m27);
            arrayList16.add(ev6Var31);
            ev6 ev6Var32 = new ev6();
            xg6.w(hv6Var2, fv6Var6, ev6Var32, hv6Var, fv6Var2);
            m28 = w31.m(hv6Var6, fv6Var, jv6.e);
            ev6Var32.a(m28);
            arrayList16.add(ev6Var32);
            ev6 ev6Var33 = new ev6();
            xg6.w(hv6Var6, fv6Var6, ev6Var33, hv6Var, fv6Var2);
            m29 = w31.m(hv6Var6, fv6Var, jv6.e);
            ev6Var33.a(m29);
            arrayList16.add(ev6Var33);
            arrayList5.addAll(arrayList16);
        }
        boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        this.q = hasSystemFeature;
        if (hasSystemFeature) {
            ArrayList arrayList17 = new ArrayList();
            ev6 ev6Var34 = new ev6();
            fv6 fv6Var8 = fv6.S1440P_4_3;
            m15 = w31.m(hv6Var3, fv6Var8, jv6.e);
            ev6Var34.a(m15);
            arrayList17.add(ev6Var34);
            ev6 ev6Var35 = new ev6();
            m16 = w31.m(hv6Var, fv6Var8, jv6.e);
            ev6Var35.a(m16);
            arrayList17.add(ev6Var35);
            ev6 ev6Var36 = new ev6();
            m17 = w31.m(hv6Var2, fv6Var8, jv6.e);
            ev6Var36.a(m17);
            arrayList17.add(ev6Var36);
            ev6 ev6Var37 = new ev6();
            fv6 fv6Var9 = fv6.S720P_16_9;
            xg6.w(hv6Var3, fv6Var9, ev6Var37, hv6Var2, fv6Var8);
            ev6 f14 = lb1.f(arrayList17, ev6Var37);
            xg6.w(hv6Var, fv6Var9, f14, hv6Var2, fv6Var8);
            ev6 f15 = lb1.f(arrayList17, f14);
            xg6.w(hv6Var3, fv6Var9, f15, hv6Var3, fv6Var8);
            ev6 f16 = lb1.f(arrayList17, f15);
            xg6.w(hv6Var3, fv6Var9, f16, hv6Var, fv6Var8);
            ev6 f17 = lb1.f(arrayList17, f16);
            xg6.w(hv6Var, fv6Var9, f17, hv6Var3, fv6Var8);
            ev6 f18 = lb1.f(arrayList17, f17);
            xg6.w(hv6Var, fv6Var9, f18, hv6Var, fv6Var8);
            arrayList17.add(f18);
            arrayList.addAll(arrayList17);
        }
        if (ciVar.B) {
            ev6 ev6Var38 = new ev6();
            m3 = w31.m(hv6Var, fv6Var, jv6.e);
            ev6Var38.a(m3);
            ev6 ev6Var39 = new ev6();
            m4 = w31.m(hv6Var3, fv6Var, jv6.e);
            ev6Var39.a(m4);
            ev6 ev6Var40 = new ev6();
            m5 = w31.m(hv6Var, fv6Var2, jv6.e);
            ev6Var40.a(m5);
            m6 = w31.m(hv6Var2, fv6Var, jv6.e);
            ev6Var40.a(m6);
            ev6 ev6Var41 = new ev6();
            m7 = w31.m(hv6Var, fv6Var2, jv6.e);
            ev6Var41.a(m7);
            m8 = w31.m(hv6Var3, fv6Var, jv6.e);
            ev6Var41.a(m8);
            ev6 ev6Var42 = new ev6();
            m9 = w31.m(hv6Var3, fv6Var2, jv6.e);
            ev6Var42.a(m9);
            m10 = w31.m(hv6Var3, fv6Var, jv6.e);
            ev6Var42.a(m10);
            ev6 ev6Var43 = new ev6();
            m11 = w31.m(hv6Var, fv6Var2, jv6.e);
            ev6Var43.a(m11);
            fv6 fv6Var10 = fv6.RECORD;
            m12 = w31.m(hv6Var, fv6Var10, jv6.e);
            ev6Var43.a(m12);
            ev6 ev6Var44 = new ev6();
            xg6.w(hv6Var, fv6Var2, ev6Var44, hv6Var, fv6Var10);
            m13 = w31.m(hv6Var3, fv6Var10, jv6.e);
            ev6Var44.a(m13);
            ev6 ev6Var45 = new ev6();
            xg6.w(hv6Var, fv6Var2, ev6Var45, hv6Var, fv6Var10);
            m14 = w31.m(hv6Var2, fv6Var10, jv6.e);
            ev6Var45.a(m14);
            arrayList7.addAll(hf.c0(ev6Var38, ev6Var39, ev6Var40, ev6Var41, ev6Var42, ev6Var43, ev6Var44, ev6Var45));
        }
        if (z) {
            ArrayList arrayList18 = new ArrayList();
            ev6 ev6Var46 = new ev6();
            fv6 fv6Var11 = fv6.S1440P_4_3;
            m = w31.m(hv6Var, fv6Var11, jv6.e);
            ev6Var46.a(m);
            arrayList18.add(ev6Var46);
            ev6 ev6Var47 = new ev6();
            m2 = w31.m(hv6Var3, fv6Var11, jv6.e);
            ev6Var47.a(m2);
            arrayList18.add(ev6Var47);
            ev6 ev6Var48 = new ev6();
            xg6.w(hv6Var, fv6Var11, ev6Var48, hv6Var2, fv6Var);
            ev6 f19 = lb1.f(arrayList18, ev6Var48);
            xg6.w(hv6Var3, fv6Var11, f19, hv6Var2, fv6Var);
            ev6 f20 = lb1.f(arrayList18, f19);
            xg6.w(hv6Var, fv6Var11, f20, hv6Var3, fv6Var);
            ev6 f21 = lb1.f(arrayList18, f20);
            xg6.w(hv6Var3, fv6Var11, f21, hv6Var3, fv6Var);
            ev6 f22 = lb1.f(arrayList18, f21);
            xg6.w(hv6Var, fv6Var2, f22, hv6Var, fv6Var11);
            ev6 f23 = lb1.f(arrayList18, f22);
            xg6.w(hv6Var3, fv6Var2, f23, hv6Var, fv6Var11);
            ev6 f24 = lb1.f(arrayList18, f23);
            xg6.w(hv6Var, fv6Var2, f24, hv6Var3, fv6Var11);
            ev6 f25 = lb1.f(arrayList18, f24);
            xg6.w(hv6Var3, fv6Var2, f25, hv6Var3, fv6Var11);
            arrayList18.add(f25);
            arrayList6.addAll(arrayList18);
        }
        xx xxVar = vr6.a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
            key.getClass();
            long[] jArr = (long[]) qc0Var.c(key);
            if (jArr != null && jArr.length != 0) {
                z2 = true;
                this.r = z2;
                if (z2 && i2 >= 33) {
                    ev6 ev6Var49 = new ev6();
                    fv6 fv6Var12 = fv6.S1440P_4_3;
                    tr6 tr6Var3 = tr6.PREVIEW_VIDEO_STILL;
                    ev6Var49.a(w31.m(hv6Var, fv6Var12, tr6Var3));
                    ev6 ev6Var50 = new ev6();
                    ev6Var50.a(w31.m(hv6Var3, fv6Var12, tr6Var3));
                    ev6 ev6Var51 = new ev6();
                    fv6 fv6Var13 = fv6.RECORD;
                    tr6 tr6Var4 = tr6.VIDEO_RECORD;
                    ev6Var51.a(w31.m(hv6Var, fv6Var13, tr6Var4));
                    ev6 ev6Var52 = new ev6();
                    ev6Var52.a(w31.m(hv6Var3, fv6Var13, tr6Var4));
                    ev6 ev6Var53 = new ev6();
                    tr6 tr6Var5 = tr6.STILL_CAPTURE;
                    ev6Var53.a(w31.m(hv6Var2, fv6Var, tr6Var5));
                    ev6 ev6Var54 = new ev6();
                    ev6Var54.a(w31.m(hv6Var3, fv6Var, tr6Var5));
                    ev6 ev6Var55 = new ev6();
                    tr6 tr6Var6 = tr6.PREVIEW;
                    ev6Var55.a(w31.m(hv6Var, fv6Var2, tr6Var6));
                    ev6Var55.a(w31.m(hv6Var2, fv6Var, tr6Var5));
                    ev6 ev6Var56 = new ev6();
                    ev6Var56.a(w31.m(hv6Var, fv6Var2, tr6Var6));
                    ev6Var56.a(w31.m(hv6Var3, fv6Var, tr6Var5));
                    ev6 ev6Var57 = new ev6();
                    ev6Var57.a(w31.m(hv6Var, fv6Var2, tr6Var6));
                    ev6Var57.a(w31.m(hv6Var, fv6Var13, tr6Var4));
                    ev6 ev6Var58 = new ev6();
                    ev6Var58.a(w31.m(hv6Var, fv6Var2, tr6Var6));
                    ev6Var58.a(w31.m(hv6Var3, fv6Var13, tr6Var4));
                    ev6 ev6Var59 = new ev6();
                    ev6Var59.a(w31.m(hv6Var, fv6Var2, tr6Var6));
                    ev6Var59.a(w31.m(hv6Var3, fv6Var2, tr6Var6));
                    ev6 ev6Var60 = new ev6();
                    lb1.u(ev6Var60, w31.m(hv6Var, fv6Var2, tr6Var6), hv6Var, fv6Var13, tr6Var4);
                    ev6Var60.a(w31.m(hv6Var2, fv6Var13, tr6Var5));
                    ev6 ev6Var61 = new ev6();
                    lb1.u(ev6Var61, w31.m(hv6Var, fv6Var2, tr6Var6), hv6Var3, fv6Var13, tr6Var4);
                    ev6Var61.a(w31.m(hv6Var2, fv6Var13, tr6Var5));
                    ev6 ev6Var62 = new ev6();
                    lb1.u(ev6Var62, w31.m(hv6Var, fv6Var2, tr6Var6), hv6Var3, fv6Var2, tr6Var6);
                    ev6Var62.a(w31.m(hv6Var2, fv6Var, tr6Var5));
                    arrayList4.addAll(hf.c0(ev6Var49, ev6Var50, ev6Var51, ev6Var52, ev6Var53, ev6Var54, ev6Var55, ev6Var56, ev6Var57, ev6Var58, ev6Var59, ev6Var60, ev6Var61, ev6Var62));
                }
                b();
            }
        }
        z2 = false;
        this.r = z2;
        if (z2) {
            ev6 ev6Var492 = new ev6();
            fv6 fv6Var122 = fv6.S1440P_4_3;
            tr6 tr6Var32 = tr6.PREVIEW_VIDEO_STILL;
            ev6Var492.a(w31.m(hv6Var, fv6Var122, tr6Var32));
            ev6 ev6Var502 = new ev6();
            ev6Var502.a(w31.m(hv6Var3, fv6Var122, tr6Var32));
            ev6 ev6Var512 = new ev6();
            fv6 fv6Var132 = fv6.RECORD;
            tr6 tr6Var42 = tr6.VIDEO_RECORD;
            ev6Var512.a(w31.m(hv6Var, fv6Var132, tr6Var42));
            ev6 ev6Var522 = new ev6();
            ev6Var522.a(w31.m(hv6Var3, fv6Var132, tr6Var42));
            ev6 ev6Var532 = new ev6();
            tr6 tr6Var52 = tr6.STILL_CAPTURE;
            ev6Var532.a(w31.m(hv6Var2, fv6Var, tr6Var52));
            ev6 ev6Var542 = new ev6();
            ev6Var542.a(w31.m(hv6Var3, fv6Var, tr6Var52));
            ev6 ev6Var552 = new ev6();
            tr6 tr6Var62 = tr6.PREVIEW;
            ev6Var552.a(w31.m(hv6Var, fv6Var2, tr6Var62));
            ev6Var552.a(w31.m(hv6Var2, fv6Var, tr6Var52));
            ev6 ev6Var562 = new ev6();
            ev6Var562.a(w31.m(hv6Var, fv6Var2, tr6Var62));
            ev6Var562.a(w31.m(hv6Var3, fv6Var, tr6Var52));
            ev6 ev6Var572 = new ev6();
            ev6Var572.a(w31.m(hv6Var, fv6Var2, tr6Var62));
            ev6Var572.a(w31.m(hv6Var, fv6Var132, tr6Var42));
            ev6 ev6Var582 = new ev6();
            ev6Var582.a(w31.m(hv6Var, fv6Var2, tr6Var62));
            ev6Var582.a(w31.m(hv6Var3, fv6Var132, tr6Var42));
            ev6 ev6Var592 = new ev6();
            ev6Var592.a(w31.m(hv6Var, fv6Var2, tr6Var62));
            ev6Var592.a(w31.m(hv6Var3, fv6Var2, tr6Var62));
            ev6 ev6Var602 = new ev6();
            lb1.u(ev6Var602, w31.m(hv6Var, fv6Var2, tr6Var62), hv6Var, fv6Var132, tr6Var42);
            ev6Var602.a(w31.m(hv6Var2, fv6Var132, tr6Var52));
            ev6 ev6Var612 = new ev6();
            lb1.u(ev6Var612, w31.m(hv6Var, fv6Var2, tr6Var62), hv6Var3, fv6Var132, tr6Var42);
            ev6Var612.a(w31.m(hv6Var2, fv6Var132, tr6Var52));
            ev6 ev6Var622 = new ev6();
            lb1.u(ev6Var622, w31.m(hv6Var, fv6Var2, tr6Var62), hv6Var3, fv6Var2, tr6Var62);
            ev6Var622.a(w31.m(hv6Var2, fv6Var, tr6Var52));
            arrayList4.addAll(hf.c0(ev6Var492, ev6Var502, ev6Var512, ev6Var522, ev6Var532, ev6Var542, ev6Var552, ev6Var562, ev6Var572, ev6Var582, ev6Var592, ev6Var602, ev6Var612, ev6Var622));
        }
        b();
    }

    public static Range c(Range range, int i, Range[] rangeArr) {
        Range range2 = yy.h;
        if (nb3.k(range, range2)) {
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
                    if (nb3.k(range2, yy.h)) {
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
    */
    public static Size e(StreamConfigurationMap streamConfigurationMap, int i, boolean z, Rational rational) {
        Object em5Var;
        Size[] sizeArr;
        Object outputSizes;
        Size[] sizeArr2 = null;
        try {
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (i == 34) {
            if (streamConfigurationMap != null) {
                outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                em5Var = outputSizes;
                if (em5Var instanceof em5) {
                    em5Var = null;
                }
                sizeArr = (Size[]) em5Var;
                if (sizeArr == null) {
                    if (rational != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Size size : sizeArr) {
                            if (mv.a(rational, size)) {
                                arrayList.add(size);
                            }
                        }
                        sizeArr = (Size[]) arrayList.toArray(new Size[0]);
                    }
                } else {
                    sizeArr = null;
                }
                if (sizeArr != null || sizeArr.length == 0) {
                    return null;
                }
                ru0 ru0Var = new ru0(false);
                List asList = Arrays.asList(sizeArr);
                asList.getClass();
                Size size2 = (Size) Collections.max(asList, ru0Var);
                Size size3 = mj6.a;
                if (z) {
                    if (streamConfigurationMap != null) {
                        sizeArr2 = streamConfigurationMap.getHighResolutionOutputSizes(i);
                    }
                    if (sizeArr2 != null && sizeArr2.length != 0) {
                        List asList2 = Arrays.asList(sizeArr2);
                        asList2.getClass();
                        size3 = (Size) Collections.max(asList2, ru0Var);
                    }
                }
                return (Size) Collections.max(hf.c0(size2, size3), ru0Var);
            }
            outputSizes = null;
            em5Var = outputSizes;
            if (em5Var instanceof em5) {
            }
            sizeArr = (Size[]) em5Var;
            if (sizeArr == null) {
            }
            if (sizeArr != null) {
            }
            return null;
        }
        if (streamConfigurationMap != null) {
            outputSizes = streamConfigurationMap.getOutputSizes(i);
            em5Var = outputSizes;
            if (em5Var instanceof em5) {
            }
            sizeArr = (Size[]) em5Var;
            if (sizeArr == null) {
            }
            if (sizeArr != null) {
            }
            return null;
        }
        outputSizes = null;
        em5Var = outputSizes;
        if (em5Var instanceof em5) {
        }
        sizeArr = (Size[]) em5Var;
        if (sizeArr == null) {
        }
        if (sizeArr != null) {
        }
        return null;
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
        i.h("Ranges must not intersect");
        return 0;
    }

    public static int h(Range range) {
        int intValue = ((Number) range.getUpper()).intValue();
        Comparable lower = range.getLower();
        lower.getClass();
        return (intValue - ((Number) lower).intValue()) + 1;
    }

    public static Range n(Range range, Range range2, boolean z) {
        Range range3 = yy.h;
        if (nb3.k(range2, range3) && nb3.k(range, range3)) {
            range3.getClass();
            return range3;
        } else if (nb3.k(range2, range3)) {
            return range;
        } else {
            if (!nb3.k(range, range3)) {
                if (z) {
                    np2.A("All targetFrameRate should be the same if strict fps is required", nb3.k(range, range2));
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
    public final boolean a(bv6 bv6Var, ArrayList arrayList, Map map, List list, List list2) {
        Integer num;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        List<ev6> list3;
        boolean z4;
        boolean z5;
        CameraCharacteristics.Key key;
        boolean z6;
        boolean z7;
        Size size;
        Integer num2;
        String sb;
        in7 in7Var = bv6Var.d;
        boolean z8 = bv6Var.h;
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap.containsKey(bv6Var)) {
            Object obj = linkedHashMap.get(bv6Var);
            obj.getClass();
            list3 = (List) obj;
            num = 2;
            z = z8;
            str = "Required value was null.";
            z6 = 0;
            z3 = true;
        } else {
            ArrayList arrayList2 = new ArrayList();
            int i = bv6Var.a;
            if (z8) {
                ex6 ex6Var = xu2.a;
                lg0 lg0Var = this.a;
                lg0Var.getClass();
                in7Var.getClass();
                ArrayList arrayList3 = new ArrayList();
                if (Build.VERSION.SDK_INT >= 35) {
                    key = CameraCharacteristics.INFO_SESSION_CONFIGURATION_QUERY_VERSION;
                    key.getClass();
                    Object c = ((qc0) lg0Var).c(key);
                    if (c != null) {
                        int intValue = ((Number) c).intValue();
                        if (intValue >= 35 && in7Var != in7.ON) {
                            arrayList3.addAll((List) xu2.a.getValue());
                        }
                        if (intValue >= 36 && in7Var != in7.PREVIEW) {
                            arrayList3.addAll((List) xu2.b.getValue());
                        }
                    } else {
                        i.h("Required value was null.");
                        return false;
                    }
                }
                arrayList2.addAll(arrayList3);
                num = 2;
                z = z8;
                str = "Required value was null.";
                z2 = false;
            } else if (bv6Var.e) {
                ArrayList arrayList4 = this.n;
                if (arrayList4.isEmpty()) {
                    ex6 ex6Var2 = xu2.a;
                    ArrayList arrayList5 = new ArrayList();
                    ev6 ev6Var = new ev6();
                    tr6 tr6Var = jv6.e;
                    z2 = false;
                    hv6 hv6Var = hv6.JPEG_R;
                    fv6 fv6Var = fv6.MAXIMUM;
                    z = z8;
                    tr6 tr6Var2 = jv6.e;
                    str = "Required value was null.";
                    ev6Var.a(w31.m(hv6Var, fv6Var, tr6Var2));
                    arrayList5.add(ev6Var);
                    ev6 ev6Var2 = new ev6();
                    num = 2;
                    lb1.u(ev6Var2, w31.m(hv6.PRIV, fv6.PREVIEW, tr6Var2), hv6Var, fv6Var, tr6Var2);
                    arrayList5.add(ev6Var2);
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
                if (bv6Var.f) {
                    ArrayList arrayList6 = this.k;
                    if (arrayList6.isEmpty()) {
                        nx2 nx2Var = this.C;
                        if (((Boolean) nx2Var.b.getValue()).booleanValue()) {
                            arrayList6.clear();
                            Size size2 = (Size) nx2Var.c.getValue();
                            if (size2 != null) {
                                dz m = m(34);
                                ex6 ex6Var3 = xu2.a;
                                ArrayList arrayList7 = new ArrayList();
                                tr6 tr6Var3 = jv6.e;
                                jv6 u = w31.u(34, size2, m, 0, gv6.CAPTURE_SESSION_TABLES, jv6.e);
                                ev6 ev6Var3 = new ev6();
                                ev6Var3.a(u);
                                arrayList7.add(ev6Var3);
                                ev6 ev6Var4 = new ev6();
                                ev6Var4.a(u);
                                ev6Var4.a(u);
                                arrayList7.add(ev6Var4);
                                arrayList6.addAll(arrayList7);
                            }
                        }
                    }
                    arrayList2.addAll(arrayList6);
                } else {
                    int i2 = bv6Var.b;
                    if (i2 == 8) {
                        z3 = true;
                        if (i != 1) {
                            ArrayList arrayList8 = this.g;
                            if (i != 2) {
                                if (in7Var == in7.PREVIEW) {
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
                            linkedHashMap.put(bv6Var, list3);
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
                    linkedHashMap.put(bv6Var, list3);
                    z6 = z4;
                }
            }
            z3 = true;
            z5 = z2;
            list3 = arrayList2;
            z4 = z5;
            linkedHashMap.put(bv6Var, list3);
            z6 = z4;
        }
        if (list3 == null || !list3.isEmpty()) {
            for (ev6 ev6Var5 : list3) {
                if (ev6Var5.c(arrayList) != null) {
                    z7 = z3;
                    break;
                }
            }
        }
        z7 = z6;
        if (z7 && z) {
            pc6 pc6Var = new pc6();
            int size3 = arrayList.size();
            int i3 = z6;
            int i4 = i3;
            while (i4 < size3) {
                Object obj2 = arrayList.get(i4);
                int i5 = i4 + 1;
                int i6 = i3 + 1;
                if (i3 >= 0) {
                    jv6 jv6Var = (jv6) obj2;
                    dz m2 = m(jv6Var.d);
                    LinkedHashMap linkedHashMap2 = m2.f;
                    int i7 = jv6Var.d;
                    fv6 fv6Var2 = jv6Var.b;
                    switch (iv6.a[fv6Var2.ordinal()]) {
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
                        case 6:
                            size = (Size) m2.i.get(Integer.valueOf(i7));
                            break;
                        case 7:
                            i.m("Not supported config size");
                            return z6;
                        default:
                            size = fv6Var2.getRelatedFixedSize();
                            break;
                    }
                    size.getClass();
                    zi7 zi7Var = (zi7) list.get(((Number) list2.get(i3)).intValue());
                    Object obj3 = map.get(jv6Var);
                    if (obj3 != null) {
                        yq1 yq1Var = (yq1) obj3;
                        zi7Var.getClass();
                        Range range = null;
                        int i8 = size3;
                        ig1 ig1Var = new ig1(zi7Var.q(), size);
                        oj7.Companion.getClass();
                        Class<?> surfaceClass = mj7.b(zi7Var).getSurfaceClass();
                        if (surfaceClass != null) {
                            ig1Var.j = surfaceClass;
                        }
                        lc6 d = lc6.d(zi7Var, size);
                        dk0 dk0Var = d.b;
                        d.b(ig1Var, yq1Var, -1);
                        Range range2 = bv6Var.i;
                        if (!nb3.k(range2, yy.h)) {
                            range = range2;
                        }
                        if (range == null) {
                            range = nk2.d;
                        }
                        dk0Var.getClass();
                        ((da4) dk0Var.X).m(ek0.f, range);
                        if (in7Var == in7.PREVIEW) {
                            dk0Var.getClass();
                            num2 = num;
                            ((da4) dk0Var.X).m(zi7.U, num2);
                        } else {
                            num2 = num;
                            if (in7Var == in7.ON) {
                                dk0Var.getClass();
                                ((da4) dk0Var.X).m(zi7.V, num2);
                            }
                        }
                        pc6Var.a(d.c());
                        boolean c2 = pc6Var.c();
                        StringBuilder sb2 = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
                        sb2.append(zi7Var);
                        sb2.append(" with ");
                        sb2.append(jv6Var);
                        sb2.append(" due to [");
                        if (!pc6Var.m) {
                            sb = "Template is not set";
                        } else {
                            sb = pc6Var.l.toString();
                        }
                        sb2.append(sb);
                        sb2.append("]; surfaceConfigList = ");
                        sb2.append(arrayList);
                        sb2.append(", featureSettings = ");
                        sb2.append(bv6Var);
                        sb2.append(", newUseCaseConfigs = ");
                        sb2.append(list);
                        np2.A(sb2.toString(), c2);
                        i3 = i6;
                        num = num2;
                        size3 = i8;
                        i4 = i5;
                    } else {
                        i.h(str);
                        return z6;
                    }
                } else {
                    hf.q0();
                    throw null;
                }
            }
            rc6 b = pc6Var.b();
            boolean f = this.c.f(b);
            List<ig1> b2 = b.b();
            b2.getClass();
            for (ig1 ig1Var2 : b2) {
                ig1Var2.a();
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
    */
    public final void b() {
        Object em5Var;
        Object outputSizes;
        Size[] sizeArr;
        Size size;
        Size c = this.y.c();
        try {
            Integer.parseInt(this.d);
            size = i();
        } catch (NumberFormatException unused) {
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.x.c.A;
        if (streamConfigurationMap != null) {
            try {
                outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
            } catch (Throwable th) {
                em5Var = new em5(th);
                if (em5Var instanceof em5) {
                    em5Var = null;
                }
                sizeArr = (Size[]) em5Var;
                if (sizeArr != null) {
                    Arrays.sort(sizeArr, new ru0(true));
                    for (Size size2 : sizeArr) {
                        int width = size2.getWidth();
                        Size size3 = mj6.e;
                        if (width <= size3.getWidth() && size2.getHeight() <= size3.getHeight()) {
                            size = size2;
                            break;
                        }
                    }
                }
                size = null;
                if (size == null) {
                    size = mj6.c;
                    size.getClass();
                }
                this.v = new dz(mj6.b, new LinkedHashMap(), c, new LinkedHashMap(), size, new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
            }
        } else {
            outputSizes = null;
        }
        em5Var = outputSizes;
        if (em5Var instanceof em5) {
        }
        sizeArr = (Size[]) em5Var;
        if (sizeArr != null) {
        }
        size = null;
        if (size == null) {
        }
        this.v = new dz(mj6.b, new LinkedHashMap(), c, new LinkedHashMap(), size, new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
    }

    public final int d(int i, Size size, boolean z, int i2) {
        long j;
        int i3 = 0;
        if (z) {
            if (i == 34) {
                nx2 nx2Var = this.C;
                nx2Var.getClass();
                size.getClass();
                List c = nx2Var.c(size);
                if (c.isEmpty()) {
                    c = null;
                }
                if (c == null) {
                    kj2.f0("HighSpeedResolver", "No supported high speed  fps for " + size);
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
                        fa6.c();
                        return 0;
                    }
                }
            } else {
                i.m("Check failed.");
                return 0;
            }
        } else {
            dr6 j2 = j();
            size.getClass();
            try {
                j = j2.c.x(i, size);
            } catch (RuntimeException e) {
                if (kj2.L()) {
                    Log.w("CXCP", "Unable to get min frame duration for format = " + i + " and size = " + size, e);
                }
                j = 0;
            }
            if (j <= 0) {
                if (this.u) {
                    if (kj2.L()) {
                        Log.w("CXCP", "minFrameDuration: " + j + " is invalid for imageFormat = " + i + ", size = " + size);
                    }
                } else {
                    i3 = Integer.MAX_VALUE;
                }
            } else {
                i3 = (int) (1.0E9d / j);
            }
        }
        return Math.min(i2, i3);
    }

    public final List f(bv6 bv6Var, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        int i;
        List list;
        bj7 bj7Var;
        xx xxVar = vr6.a;
        if (bv6Var.a == 0 && bv6Var.b == 8 && !bv6Var.f) {
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                List c = ((ev6) obj).c(arrayList);
                if (c != null) {
                    xx xxVar2 = vr6.a;
                    int size2 = c.size();
                    int i4 = i2;
                    while (true) {
                        i = 1;
                        if (i4 >= size2) {
                            break;
                        }
                        long value = ((jv6) c.get(i4)).c.getValue();
                        if (linkedHashMap.containsKey(Integer.valueOf(i4))) {
                            px pxVar = (px) linkedHashMap.get(Integer.valueOf(i4));
                            pxVar.getClass();
                            List list2 = pxVar.e;
                            if (list2.size() == 1) {
                                bj7Var = (bj7) list2.get(i2);
                            } else {
                                bj7Var = bj7.STREAM_SHARING;
                            }
                            bj7Var.getClass();
                            if (!vr6.b(bj7Var, value, list2)) {
                                i = i2;
                                break;
                            }
                            i4++;
                            i2 = 0;
                        } else if (linkedHashMap2.containsKey(Integer.valueOf(i4))) {
                            Object obj2 = linkedHashMap2.get(Integer.valueOf(i4));
                            obj2.getClass();
                            zi7 zi7Var = (zi7) obj2;
                            bj7 x = zi7Var.x();
                            x.getClass();
                            if (zi7Var.x() == bj7.STREAM_SHARING) {
                                list = (List) ((qr6) zi7Var).e(qr6.B);
                                list.getClass();
                            } else {
                                list = yt1.A;
                            }
                            if (!vr6.b(x, value, list)) {
                                i = 0;
                                break;
                            }
                            i4++;
                            i2 = 0;
                        } else {
                            throw new AssertionError("SurfaceConfig does not map to any use case");
                        }
                    }
                    ex6 ex6Var = new ex6(new yu6(0, this, c));
                    if (i != 0 && ((Boolean) ex6Var.getValue()).booleanValue()) {
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
        ey b;
        for (Number number : hf.c0(1, 13, 10, 8, 12, 6, 5, 4)) {
            int intValue = number.intValue();
            a42 a42Var = this.b;
            if (a42Var.a(intValue) && (b = a42Var.b(intValue)) != null) {
                List list = b.d;
                list.getClass();
                if (!list.isEmpty()) {
                    Object obj = list.get(0);
                    obj.getClass();
                    fy fyVar = (fy) obj;
                    return new Size(fyVar.e, fyVar.f);
                }
            }
        }
        return null;
    }

    public final dr6 j() {
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        key.getClass();
        lg0 lg0Var = this.a;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((qc0) lg0Var).c(key);
        if (streamConfigurationMap != null) {
            return new dr6(streamConfigurationMap, new lp4(lg0Var));
        }
        i.h("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
        return null;
    }

    public final ArrayList k(int i, ArrayList arrayList, List list, List list2, ArrayList arrayList2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, boolean z) {
        gv6 gv6Var;
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            px pxVar = (px) obj;
            arrayList3.add(pxVar.a);
            linkedHashMap.put(Integer.valueOf(arrayList3.size() - 1), pxVar);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i4 = i2 + 1;
            Size size2 = (Size) it.next();
            zi7 zi7Var = (zi7) list2.get(((Number) arrayList2.get(i2)).intValue());
            int q = zi7Var.q();
            tr6 w = zi7Var.w();
            tr6 tr6Var = jv6.e;
            dz m = m(q);
            if (z) {
                gv6Var = gv6.FEATURE_COMBINATION_TABLE;
            } else {
                gv6Var = gv6.CAPTURE_SESSION_TABLES;
            }
            arrayList3.add(w31.u(q, size2, m, i, gv6Var, w));
            linkedHashMap2.put(Integer.valueOf(arrayList3.size() - 1), zi7Var);
            i2 = i4;
        }
        return arrayList3;
    }

    public final dz l() {
        dz dzVar = this.v;
        if (dzVar != null) {
            return dzVar;
        }
        nb3.a0("surfaceSizeDefinition");
        throw null;
    }

    public final dz m(int i) {
        CameraCharacteristics.Key key;
        Size e;
        Integer valueOf = Integer.valueOf(i);
        ArrayList arrayList = this.w;
        if (!arrayList.contains(valueOf)) {
            LinkedHashMap linkedHashMap = l().b;
            Size size = mj6.d;
            size.getClass();
            r(linkedHashMap, size, i);
            LinkedHashMap linkedHashMap2 = l().d;
            Size size2 = mj6.f;
            size2.getClass();
            r(linkedHashMap2, size2, i);
            q(l().f, i, null);
            q(l().g, i, mv.a);
            q(l().h, i, mv.c);
            LinkedHashMap linkedHashMap3 = l().i;
            if (Build.VERSION.SDK_INT >= 31 && this.s) {
                key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
                key.getClass();
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((qc0) this.a).c(key);
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
    */
    public final cw6 o(bv6 bv6Var, ArrayList arrayList, Map map, List list, ArrayList arrayList2, LinkedHashMap linkedHashMap) {
        String str;
        String str2;
        boolean z;
        String str3;
        lg0 lg0Var;
        LinkedHashMap linkedHashMap2;
        boolean z2;
        ArrayList arrayList3;
        int i;
        boolean z3;
        bv6 bv6Var2;
        String str4;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        List list2;
        int i2;
        bv6 bv6Var3;
        List list3;
        LinkedHashMap linkedHashMap5;
        LinkedHashMap linkedHashMap6;
        lg0 lg0Var2;
        ?? r34;
        nx2 nx2Var;
        List<zi7> list4;
        ArrayList arrayList4;
        int i3;
        List list5;
        List list6;
        zu6 zu6Var;
        LinkedHashMap linkedHashMap7;
        CameraCharacteristics.Key key;
        boolean z4;
        boolean z5;
        int size;
        boolean z6;
        int i4;
        Range[] rangeArr;
        boolean z7;
        int i5;
        yq1 yq1Var;
        ArrayList arrayList5;
        Size size2;
        Rational rational;
        LinkedHashMap linkedHashMap8;
        ArrayList arrayList6;
        Size b;
        gv6 gv6Var;
        int d;
        dv6 dv6Var = this;
        bv6 bv6Var4 = bv6Var;
        ArrayList arrayList7 = arrayList;
        Map map2 = map;
        ArrayList arrayList8 = arrayList2;
        boolean z8 = bv6Var4.f;
        if (kj2.F("CXCP")) {
            Log.d("CXCP", "resolveSpecsBySettings: featureSettings = " + bv6Var4);
        }
        boolean z9 = bv6Var4.g;
        Range range = bv6Var4.i;
        yt1 yt1Var = yt1.A;
        String str5 = ". New configs: ";
        String str6 = dv6Var.d;
        if (z9) {
            str = "No supported surface combination is found for camera device - Id : ";
            str2 = "CXCP";
            z = z9;
            str3 = str6;
        } else {
            ArrayList arrayList9 = new ArrayList();
            int size3 = arrayList7.size();
            for (int i6 = 0; i6 < size3; i6++) {
                arrayList9.add(((px) arrayList7.get(i6)).a);
            }
            ru0 ru0Var = new ru0(false);
            for (zi7 zi7Var : map2.keySet()) {
                yt1 yt1Var2 = yt1Var;
                List list7 = (List) map2.get(zi7Var);
                if (list7 != null && !list7.isEmpty()) {
                    Size size4 = (Size) Collections.min(list7, ru0Var);
                    int q = zi7Var.q();
                    tr6 w = zi7Var.w();
                    tr6 tr6Var = jv6.e;
                    size4.getClass();
                    arrayList9.add(w31.u(q, size4, dv6Var.m(q), bv6Var4.a, gv6.CAPTURE_SESSION_TABLES, w));
                    yt1Var = yt1Var2;
                } else {
                    e41.j("No available output size is found for ", 46, zi7Var);
                    return null;
                }
            }
            yt1 yt1Var3 = yt1Var;
            str2 = "CXCP";
            z = z9;
            str3 = str6;
            str = "No supported surface combination is found for camera device - Id : ";
            yt1Var = yt1Var3;
            if (!dv6Var.a(bv6Var4, arrayList9, zt1.A, yt1Var, yt1Var3)) {
                throw new IllegalArgumentException((str + str3 + ". May be attempting to bind too many use cases. Existing surfaces: " + arrayList7 + ". New configs: " + list + ". GroupableFeature settings: " + bv6Var4 + '.').toString());
            }
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            zi7 zi7Var2 = (zi7) it.next();
            ArrayList arrayList10 = new ArrayList();
            Iterator it2 = it;
            LinkedHashMap linkedHashMap10 = new LinkedHashMap();
            Object obj = map2.get(zi7Var2);
            obj.getClass();
            for (Size size5 : (List) obj) {
                yt1 yt1Var4 = yt1Var;
                int q2 = zi7Var2.q();
                String str7 = str5;
                int A = zi7Var2.A(size5);
                tr6 w2 = zi7Var2.w();
                tr6 tr6Var2 = jv6.e;
                dz m = dv6Var.m(q2);
                int i7 = bv6Var4.a;
                if (bv6Var4.h) {
                    gv6Var = gv6.FEATURE_COMBINATION_TABLE;
                } else {
                    gv6Var = gv6.CAPTURE_SESSION_TABLES;
                }
                String str8 = str;
                fv6 fv6Var = w31.u(q2, size5, m, i7, gv6Var, w2).b;
                String str9 = str3;
                Range range2 = yy.h;
                if (nb3.k(range, range2)) {
                    d = Integer.MAX_VALUE;
                } else {
                    d = dv6Var.d(q2, size5, z8, A);
                }
                if (!z || (fv6Var != fv6.NOT_SUPPORT && (nb3.k(range, range2) || d >= ((Number) range.getUpper()).intValue()))) {
                    Set set = (Set) linkedHashMap10.get(fv6Var);
                    if (set == null) {
                        set = new LinkedHashSet();
                        linkedHashMap10.put(fv6Var, set);
                    }
                    if (!set.contains(Integer.valueOf(d))) {
                        arrayList10.add(size5);
                        set.add(Integer.valueOf(d));
                    }
                }
                str5 = str7;
                str = str8;
                str3 = str9;
                yt1Var = yt1Var4;
            }
            linkedHashMap9.put(zi7Var2, arrayList10);
            map2 = map;
            it = it2;
        }
        yt1 yt1Var5 = yt1Var;
        String str10 = str;
        String str11 = str3;
        String str12 = str5;
        ArrayList arrayList11 = new ArrayList();
        int size6 = arrayList8.size();
        int i8 = 0;
        while (true) {
            lg0Var = dv6Var.a;
            if (i8 >= size6) {
                break;
            }
            Object obj2 = arrayList8.get(i8);
            i8++;
            int intValue = ((Number) obj2).intValue();
            Object obj3 = linkedHashMap9.get(list.get(intValue));
            obj3.getClass();
            List<Size> list8 = (List) obj3;
            int q3 = ((zi7) list.get(intValue)).q();
            dv6Var.A.getClass();
            lg0Var.getClass();
            dr6 dr6Var = dv6Var.x;
            dr6Var.getClass();
            jh0 jh0Var = new jh0(lg0Var, dr6Var);
            if ((((Nexus4AndroidLTargetAspectRatioQuirk) si1.a().b(Nexus4AndroidLTargetAspectRatioQuirk.class)) != null || ((AspectRatioLegacyApi21Quirk) jh0Var.a().b(AspectRatioLegacyApi21Quirk.class)) != null) && (size2 = (Size) dv6Var.m(256).f.get(256)) != null) {
                rational = new Rational(size2.getWidth(), size2.getHeight());
            } else {
                rational = null;
            }
            if (rational == null) {
                arrayList6 = new ArrayList(list8);
                linkedHashMap8 = linkedHashMap9;
            } else {
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                for (Size size7 : list8) {
                    LinkedHashMap linkedHashMap11 = linkedHashMap9;
                    if (mv.a(rational, size7)) {
                        arrayList12.add(size7);
                    } else {
                        arrayList13.add(size7);
                    }
                    linkedHashMap9 = linkedHashMap11;
                }
                linkedHashMap8 = linkedHashMap9;
                arrayList13.addAll(0, arrayList12);
                arrayList6 = arrayList13;
            }
            tr6 tr6Var3 = jv6.e;
            hv6 hv6Var = (hv6) jv6.h.get(Integer.valueOf(q3));
            if (hv6Var == null) {
                hv6Var = hv6.PRIV;
            }
            w24 w24Var = dv6Var.z;
            w24Var.getClass();
            hv6Var.getClass();
            if (w24Var.a != null && (b = ExtraCroppingQuirk.b(hv6Var)) != null) {
                ArrayList arrayList14 = new ArrayList();
                arrayList14.add(b);
                int size8 = arrayList6.size();
                int i9 = 0;
                while (i9 < size8) {
                    Object obj4 = arrayList6.get(i9);
                    i9++;
                    Size size9 = (Size) obj4;
                    if (!nb3.k(size9, b)) {
                        arrayList14.add(size9);
                    }
                }
                arrayList6 = arrayList14;
            }
            arrayList11.add(arrayList6);
            linkedHashMap9 = linkedHashMap8;
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        LinkedHashMap linkedHashMap13 = new LinkedHashMap();
        nx2 nx2Var2 = dv6Var.C;
        if (z8) {
            nx2Var2.getClass();
            if (arrayList11.isEmpty()) {
                arrayList5 = yt1Var5;
            } else {
                List a = nx2.a(arrayList11);
                ArrayList arrayList15 = new ArrayList(ht0.v0(a, 10));
                Iterator it3 = a.iterator();
                while (it3.hasNext()) {
                    Size size10 = (Size) it3.next();
                    int size11 = arrayList11.size();
                    LinkedHashMap linkedHashMap14 = linkedHashMap12;
                    ArrayList arrayList16 = new ArrayList(size11);
                    Iterator it4 = it3;
                    for (int i10 = 0; i10 < size11; i10++) {
                        arrayList16.add(size10);
                    }
                    arrayList15.add(arrayList16);
                    linkedHashMap12 = linkedHashMap14;
                    it3 = it4;
                }
                arrayList5 = arrayList15;
            }
            linkedHashMap2 = linkedHashMap12;
            z2 = true;
            arrayList3 = arrayList5;
        } else {
            linkedHashMap2 = linkedHashMap12;
            z2 = true;
            int size12 = arrayList11.size();
            int i11 = 1;
            int i12 = 0;
            while (i12 < size12) {
                Object obj5 = arrayList11.get(i12);
                i12++;
                i11 *= ((List) obj5).size();
            }
            if (i11 != 0) {
                ArrayList arrayList17 = new ArrayList();
                for (int i13 = 0; i13 < i11; i13++) {
                    arrayList17.add(new ArrayList());
                }
                int size13 = arrayList11.size();
                int i14 = i11;
                int size14 = i11 / ((List) arrayList11.get(0)).size();
                int i15 = 0;
                while (i15 < size13) {
                    LinkedHashMap linkedHashMap15 = linkedHashMap13;
                    List list9 = (List) arrayList11.get(i15);
                    int i16 = 0;
                    while (i16 < i11) {
                        ((List) arrayList17.get(i16)).add(list9.get((i16 % i14) / size14));
                        i16++;
                        arrayList17 = arrayList17;
                        i11 = i11;
                    }
                    ArrayList arrayList18 = arrayList17;
                    int i17 = i11;
                    if (i15 < arrayList11.size() - 1) {
                        i14 = size14;
                        size14 /= ((List) arrayList11.get(i15 + 1)).size();
                    }
                    i15++;
                    linkedHashMap13 = linkedHashMap15;
                    arrayList17 = arrayList18;
                    i11 = i17;
                }
                arrayList3 = arrayList17;
            } else {
                i.h("Failed to find supported resolutions.");
                return null;
            }
        }
        LinkedHashMap linkedHashMap16 = linkedHashMap13;
        xx xxVar = vr6.a;
        int size15 = arrayList7.size();
        int i18 = 0;
        while (true) {
            if (i18 < size15) {
                Object obj6 = arrayList7.get(i18);
                i18++;
                px pxVar = (px) obj6;
                i = 0;
                bj7 bj7Var = (bj7) pxVar.e.get(0);
                yy0 yy0Var = pxVar.f;
                yy0Var.getClass();
                bj7Var.getClass();
                if (vr6.c(yy0Var, bj7Var)) {
                    break;
                }
            } else {
                i = 0;
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    zi7 zi7Var3 = (zi7) it5.next();
                    bj7 x = zi7Var3.x();
                    x.getClass();
                    if (vr6.c(zi7Var3, x)) {
                    }
                }
                z3 = false;
            }
        }
        if (dv6Var.r && !z3) {
            Iterator it6 = arrayList3.iterator();
            list2 = null;
            while (true) {
                if (it6.hasNext()) {
                    List list10 = (List) it6.next();
                    bv6 bv6Var5 = bv6Var4;
                    int i19 = bv6Var5.a;
                    ArrayList arrayList19 = arrayList8;
                    LinkedHashMap linkedHashMap17 = linkedHashMap16;
                    bv6Var2 = bv6Var5;
                    ArrayList arrayList20 = arrayList7;
                    LinkedHashMap linkedHashMap18 = linkedHashMap2;
                    ArrayList k = dv6Var.k(i19, arrayList20, list10, list, arrayList19, linkedHashMap18, linkedHashMap17, false);
                    linkedHashMap3 = linkedHashMap18;
                    linkedHashMap4 = linkedHashMap17;
                    arrayList7 = arrayList20;
                    list2 = dv6Var.f(bv6Var2, k, linkedHashMap3, linkedHashMap4);
                    if (list2 != null) {
                        break;
                    }
                    linkedHashMap3.clear();
                    linkedHashMap4.clear();
                    linkedHashMap2 = linkedHashMap3;
                    linkedHashMap16 = linkedHashMap4;
                    bv6Var4 = bv6Var2;
                    arrayList8 = arrayList2;
                } else {
                    bv6Var2 = bv6Var4;
                    linkedHashMap3 = linkedHashMap2;
                    linkedHashMap4 = linkedHashMap16;
                    break;
                }
            }
            if (kj2.F(str2)) {
                str4 = str2;
                Log.d(str4, "orderedSurfaceConfigListForStreamUseCase = " + list2);
            } else {
                str4 = str2;
            }
        } else {
            bv6Var2 = bv6Var4;
            str4 = str2;
            linkedHashMap3 = linkedHashMap2;
            linkedHashMap4 = linkedHashMap16;
            list2 = null;
        }
        int i20 = i;
        int i21 = Integer.MAX_VALUE;
        for (int size16 = arrayList7.size(); i20 < size16; size16 = size16) {
            Object obj7 = arrayList7.get(i20);
            i20++;
            px pxVar2 = (px) obj7;
            i21 = Math.min(i21, dv6Var.d(pxVar2.b, pxVar2.c, z8, pxVar2.j));
        }
        Iterator it7 = arrayList3.iterator();
        List list11 = null;
        List list12 = null;
        int i22 = Integer.MAX_VALUE;
        int i23 = Integer.MAX_VALUE;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (it7.hasNext()) {
                List list13 = (List) it7.next();
                LinkedHashMap linkedHashMap19 = new LinkedHashMap();
                int i24 = i21;
                LinkedHashMap linkedHashMap20 = new LinkedHashMap();
                int i25 = i22;
                int i26 = bv6Var2.a;
                boolean z12 = bv6Var2.h;
                linkedHashMap6 = linkedHashMap4;
                i2 = i25;
                linkedHashMap5 = linkedHashMap3;
                List list14 = list;
                nx2Var = nx2Var2;
                Iterator it8 = it7;
                List list15 = list2;
                lg0Var2 = lg0Var;
                int i27 = i23;
                ArrayList k2 = dv6Var.k(i26, arrayList, list13, list14, arrayList2, linkedHashMap19, linkedHashMap20, z12);
                List<Size> list16 = list13;
                int i28 = i24;
                int i29 = 0;
                for (Size size17 : list16) {
                    int i30 = i29 + 1;
                    List list17 = list16;
                    zi7 zi7Var4 = (zi7) list14.get(((Number) arrayList2.get(i29)).intValue());
                    i28 = Math.min(i28, dv6Var.d(zi7Var4.q(), size17, z8, zi7Var4.A(size17)));
                    list14 = list;
                    i29 = i30;
                    list16 = list17;
                }
                List list18 = list16;
                if (!nb3.k(range, yy.h) && i28 < i24 && i28 < ((Number) range.getUpper()).intValue()) {
                    z7 = false;
                } else {
                    z7 = z2;
                }
                LinkedHashMap linkedHashMap21 = new LinkedHashMap();
                int size18 = k2.size();
                int i31 = 0;
                int i32 = 0;
                while (i31 < size18) {
                    Object obj8 = k2.get(i31);
                    int i33 = i31 + 1;
                    int i34 = i32 + 1;
                    if (i32 >= 0) {
                        jv6 jv6Var = (jv6) obj8;
                        ArrayList arrayList21 = k2;
                        px pxVar3 = (px) linkedHashMap19.get(Integer.valueOf(i32));
                        if (pxVar3 != null && (yq1Var = pxVar3.d) != null) {
                            i5 = i28;
                        } else {
                            i5 = i28;
                            Object obj9 = linkedHashMap.get(linkedHashMap20.get(Integer.valueOf(i32)));
                            if (obj9 != null) {
                                yq1Var = (yq1) obj9;
                            } else {
                                i.h("Required value was null.");
                                return null;
                            }
                        }
                        linkedHashMap21.put(jv6Var, yq1Var);
                        i28 = i5;
                        k2 = arrayList21;
                        i32 = i34;
                        i31 = i33;
                    } else {
                        hf.q0();
                        throw null;
                    }
                }
                ArrayList arrayList22 = k2;
                int i35 = i28;
                xr3 xr3Var = xr3.NONE;
                boolean z13 = z7;
                list3 = list15;
                boolean z14 = z8;
                cj5 cj5Var = new cj5(this, bv6Var, arrayList22, linkedHashMap21, list, arrayList2, 1);
                dv6Var = this;
                bv6Var3 = bv6Var;
                list4 = list;
                arrayList4 = arrayList2;
                go3 M = kj2.M(xr3Var, cj5Var);
                if (!z10 && ((Boolean) M.getValue()).booleanValue()) {
                    if (i2 == Integer.MAX_VALUE || i2 < i35) {
                        i2 = i35;
                        list11 = list18;
                    }
                    if (z13) {
                        if (z11) {
                            i2 = i35;
                            i3 = i27;
                            list6 = list12;
                            list5 = list18;
                            r34 = z14;
                            break;
                        }
                        z10 = z2;
                        i2 = i35;
                        list11 = list18;
                    }
                }
                if (list3 != null && !z11 && dv6Var.f(bv6Var3, arrayList22, linkedHashMap19, linkedHashMap20) != null) {
                    if (i27 == Integer.MAX_VALUE || i27 < i35) {
                        i27 = i35;
                        list12 = list18;
                    }
                    if (z13) {
                        if (z10) {
                            i3 = i35;
                            list5 = list11;
                            list6 = list18;
                            r34 = z14;
                            break;
                        }
                        int i36 = i2;
                        bv6Var2 = bv6Var3;
                        i22 = i36;
                        z11 = z2;
                        i23 = i35;
                        lg0Var = lg0Var2;
                        it7 = it8;
                        nx2Var2 = nx2Var;
                        linkedHashMap3 = linkedHashMap5;
                        linkedHashMap4 = linkedHashMap6;
                        z8 = z14 ? 1 : 0;
                        i21 = i24;
                        list12 = list18;
                        list2 = list3;
                    }
                }
                int i37 = i2;
                bv6Var2 = bv6Var3;
                i22 = i37;
                i23 = i27;
                lg0Var = lg0Var2;
                it7 = it8;
                nx2Var2 = nx2Var;
                linkedHashMap3 = linkedHashMap5;
                linkedHashMap4 = linkedHashMap6;
                z8 = z14 ? 1 : 0;
                i21 = i24;
                list2 = list3;
            } else {
                bv6 bv6Var6 = bv6Var2;
                i2 = i22;
                bv6Var3 = bv6Var6;
                list3 = list2;
                linkedHashMap5 = linkedHashMap3;
                linkedHashMap6 = linkedHashMap4;
                lg0Var2 = lg0Var;
                r34 = z8;
                nx2Var = nx2Var2;
                list4 = list;
                int i38 = i23;
                arrayList4 = arrayList2;
                i3 = i38;
                list5 = list11;
                list6 = list12;
                break;
            }
        }
        if (list5 == null || (z && !nb3.k(range, yy.h) && (i2 == Integer.MAX_VALUE || i2 < ((Number) range.getUpper()).intValue()))) {
            zu6Var = null;
        } else {
            zu6Var = new zu6(list5, list6, i2, i3, Integer.MAX_VALUE);
        }
        if (zu6Var != null) {
            int i39 = zu6Var.c;
            List list19 = zu6Var.a;
            if (kj2.F(str4)) {
                Log.d(str4, "resolveSpecsBySettings: bestSizesAndFps = " + zu6Var);
            }
            LinkedHashMap linkedHashMap22 = new LinkedHashMap();
            Range range3 = yy.h;
            if (!nb3.k(range, range3)) {
                if (r34 != 0) {
                    rangeArr = nx2Var.b(list19);
                } else {
                    CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
                    key2.getClass();
                    rangeArr = (Range[]) ((qc0) lg0Var2).c(key2);
                }
                Range c = c(range, i39, rangeArr);
                if ((!z && !bv6Var3.j) || c.equals(range)) {
                    range3 = c;
                } else {
                    StringBuilder sb = new StringBuilder("Target FPS range ");
                    sb.append(range);
                    sb.append(" is not supported. Max FPS supported by the calculated best combination: ");
                    sb.append(i39);
                    sb.append(". Calculated best FPS range for device: ");
                    sb.append(c);
                    String arrays = Arrays.toString(rangeArr);
                    arrays.getClass();
                    sb.append(". Device supported FPS ranges: ");
                    sb.append(arrays);
                    sb.append('.');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            } else {
                nx2 nx2Var3 = nx2Var;
                if (r34 != 0) {
                    range3 = c(nx2.f, i39, nx2Var3.b(list19));
                }
            }
            int i40 = 0;
            for (zi7 zi7Var5 : list4) {
                int i41 = i40 + 1;
                p87 a2 = yy.a((Size) list19.get(arrayList4.indexOf(Integer.valueOf(i40))));
                a2.d = Integer.valueOf((int) r34);
                Object obj10 = linkedHashMap.get(zi7Var5);
                if (obj10 != null) {
                    a2.c = (yq1) obj10;
                    xx xxVar2 = vr6.a;
                    zi7Var5.getClass();
                    da4 d2 = da4.d();
                    xx xxVar3 = kd0.f0;
                    if (zi7Var5.i(xxVar3)) {
                        d2.m(xxVar3, zi7Var5.e(xxVar3));
                    }
                    xx xxVar4 = zi7.Q;
                    if (zi7Var5.i(xxVar4)) {
                        d2.m(xxVar4, zi7Var5.e(xxVar4));
                    }
                    xx xxVar5 = e23.B;
                    if (zi7Var5.i(xxVar5)) {
                        d2.m(xxVar5, zi7Var5.e(xxVar5));
                    }
                    xx xxVar6 = j23.l;
                    if (zi7Var5.i(xxVar6)) {
                        d2.m(xxVar6, zi7Var5.e(xxVar6));
                    }
                    a2.f = new os0(d2);
                    a2.g = Boolean.valueOf(bv6Var3.c);
                    if (!nb3.k(range3, yy.h)) {
                        if (range3 != null) {
                            a2.e = range3;
                        } else {
                            u34.x("Null expectedFrameRateRange");
                            return null;
                        }
                    }
                    linkedHashMap22.put(zi7Var5, a2.a());
                    i40 = i41;
                } else {
                    i.m("Required value was null.");
                    return null;
                }
            }
            LinkedHashMap linkedHashMap23 = new LinkedHashMap();
            if (list3 != null) {
                List list20 = zu6Var.b;
                if (i39 == zu6Var.d) {
                    int size19 = list19.size();
                    list20.getClass();
                    if (size19 == list20.size()) {
                        ArrayList q1 = gt0.q1(list19, list20);
                        if (!q1.isEmpty()) {
                            int size20 = q1.size();
                            int i42 = 0;
                            while (i42 < size20) {
                                Object obj11 = q1.get(i42);
                                i42++;
                                vr4 vr4Var = (vr4) obj11;
                                if (!nb3.k(vr4Var.A, vr4Var.B)) {
                                    break;
                                }
                            }
                        }
                        xx xxVar7 = vr6.a;
                        lg0Var2.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            ArrayList arrayList23 = new ArrayList(linkedHashMap22.keySet());
                            int size21 = arrayList.size();
                            int i43 = 0;
                            while (i43 < size21) {
                                Object obj12 = arrayList.get(i43);
                                i43++;
                                if (((px) obj12).f == null) {
                                    i.m("Required value was null.");
                                    return null;
                                }
                            }
                            int size22 = arrayList23.size();
                            int i44 = 0;
                            while (i44 < size22) {
                                Object obj13 = arrayList23.get(i44);
                                i44++;
                                Object obj14 = linkedHashMap22.get((zi7) obj13);
                                if (obj14 != null) {
                                    if (((yy) obj14).f == null) {
                                        i.m("Required value was null.");
                                        return null;
                                    }
                                } else {
                                    i.m("Required value was null.");
                                    return null;
                                }
                            }
                            key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                            key.getClass();
                            long[] jArr = (long[]) ((qc0) lg0Var2).c(key);
                            if (jArr != null && jArr.length != 0) {
                                HashSet hashSet = new HashSet();
                                for (long j : jArr) {
                                    hashSet.add(Long.valueOf(j));
                                }
                                LinkedHashSet<Number> linkedHashSet = new LinkedHashSet();
                                Iterator it9 = arrayList.iterator();
                                long j2 = 0;
                                if (it9.hasNext()) {
                                    px pxVar4 = (px) it9.next();
                                    yy0 yy0Var2 = pxVar4.f;
                                    yy0Var2.getClass();
                                    xx xxVar8 = kd0.f0;
                                    if (yy0Var2.i(xxVar8)) {
                                        yy0 yy0Var3 = pxVar4.f;
                                        yy0Var3.getClass();
                                        Object e = yy0Var3.e(xxVar8);
                                        e.getClass();
                                        if (((Number) e).longValue() != 0) {
                                            z4 = z2;
                                        }
                                    }
                                    z5 = z2;
                                    z4 = false;
                                    size = arrayList23.size();
                                    z6 = z5;
                                    boolean z15 = z4;
                                    i4 = 0;
                                    while (i4 < size) {
                                        Object obj15 = arrayList23.get(i4);
                                        i4++;
                                        zi7 zi7Var6 = (zi7) obj15;
                                        long j3 = j2;
                                        xx xxVar9 = kd0.f0;
                                        if (!zi7Var6.i(xxVar9)) {
                                            if (z15) {
                                                i.h("Either all use cases must have non-default stream use case assigned or none should have it");
                                                return null;
                                            }
                                        } else {
                                            Object e2 = zi7Var6.e(xxVar9);
                                            e2.getClass();
                                            long longValue = ((Number) e2).longValue();
                                            if (longValue == j3) {
                                                if (z15) {
                                                    i.h("Either all use cases must have non-default stream use case assigned or none should have it");
                                                    return null;
                                                }
                                            } else if (!z6) {
                                                linkedHashSet.add(Long.valueOf(longValue));
                                                j2 = j3;
                                                z15 = z2;
                                            } else {
                                                i.h("Either all use cases must have non-default stream use case assigned or none should have it");
                                                return null;
                                            }
                                        }
                                        j2 = j3;
                                        z6 = z2;
                                    }
                                    if (!z6) {
                                        for (Number number : linkedHashSet) {
                                            if (!hashSet.contains(Long.valueOf(number.longValue()))) {
                                            }
                                        }
                                        int size23 = arrayList.size();
                                        int i45 = 0;
                                        while (i45 < size23) {
                                            Object obj16 = arrayList.get(i45);
                                            i45++;
                                            px pxVar5 = (px) obj16;
                                            yy0 yy0Var4 = pxVar5.f;
                                            yy0Var4.getClass();
                                            kd0 a3 = vr6.a(yy0Var4, (Long) yy0Var4.e(kd0.f0));
                                            if (a3 != null) {
                                                p87 a4 = yy.a(pxVar5.c);
                                                a4.d = Integer.valueOf(pxVar5.g);
                                                Range range4 = pxVar5.h;
                                                if (range4 != null) {
                                                    a4.e = range4;
                                                    yq1 yq1Var2 = pxVar5.d;
                                                    if (yq1Var2 != null) {
                                                        a4.c = yq1Var2;
                                                        a4.f = a3;
                                                        linkedHashMap23.put(pxVar5, a4.a());
                                                    } else {
                                                        u34.x("Null dynamicRange");
                                                        return null;
                                                    }
                                                } else {
                                                    u34.x("Null expectedFrameRateRange");
                                                    return null;
                                                }
                                            }
                                        }
                                        int size24 = arrayList23.size();
                                        int i46 = 0;
                                        while (i46 < size24) {
                                            Object obj17 = arrayList23.get(i46);
                                            i46++;
                                            zi7 zi7Var7 = (zi7) obj17;
                                            yy yyVar = (yy) linkedHashMap22.get(zi7Var7);
                                            yyVar.getClass();
                                            yy0 yy0Var5 = yyVar.f;
                                            yy0Var5.getClass();
                                            kd0 a5 = vr6.a(yy0Var5, (Long) yy0Var5.e(kd0.f0));
                                            if (a5 != null) {
                                                p87 b2 = yyVar.b();
                                                b2.f = a5;
                                                linkedHashMap22.put(zi7Var7, b2.a());
                                            }
                                        }
                                    }
                                } else {
                                    z4 = false;
                                }
                                z5 = false;
                                size = arrayList23.size();
                                z6 = z5;
                                boolean z152 = z4;
                                i4 = 0;
                                while (i4 < size) {
                                }
                                if (!z6) {
                                }
                            }
                        }
                        xx xxVar10 = vr6.a;
                        int size25 = list3.size();
                        int i47 = 0;
                        while (i47 < size25) {
                            List list21 = list3;
                            long value = ((jv6) list21.get(i47)).c.getValue();
                            LinkedHashMap linkedHashMap24 = linkedHashMap5;
                            if (linkedHashMap24.containsKey(Integer.valueOf(i47))) {
                                px pxVar6 = (px) linkedHashMap24.get(Integer.valueOf(i47));
                                pxVar6.getClass();
                                yy0 yy0Var6 = pxVar6.f;
                                yy0Var6.getClass();
                                kd0 a6 = vr6.a(yy0Var6, Long.valueOf(value));
                                if (a6 != null) {
                                    p87 a7 = yy.a(pxVar6.c);
                                    a7.d = Integer.valueOf(pxVar6.g);
                                    Range range5 = pxVar6.h;
                                    if (range5 != null) {
                                        a7.e = range5;
                                        yq1 yq1Var3 = pxVar6.d;
                                        if (yq1Var3 != null) {
                                            a7.c = yq1Var3;
                                            a7.f = a6;
                                            linkedHashMap23.put(pxVar6, a7.a());
                                        } else {
                                            u34.x("Null dynamicRange");
                                            return null;
                                        }
                                    } else {
                                        u34.x("Null expectedFrameRateRange");
                                        return null;
                                    }
                                }
                                linkedHashMap7 = linkedHashMap6;
                            } else {
                                linkedHashMap7 = linkedHashMap6;
                                if (linkedHashMap7.containsKey(Integer.valueOf(i47))) {
                                    Object obj18 = linkedHashMap7.get(Integer.valueOf(i47));
                                    obj18.getClass();
                                    zi7 zi7Var8 = (zi7) obj18;
                                    yy yyVar2 = (yy) linkedHashMap22.get(zi7Var8);
                                    yyVar2.getClass();
                                    yy0 yy0Var7 = yyVar2.f;
                                    yy0Var7.getClass();
                                    kd0 a8 = vr6.a(yy0Var7, Long.valueOf(value));
                                    if (a8 != null) {
                                        p87 b3 = yyVar2.b();
                                        b3.f = a8;
                                        linkedHashMap22.put(zi7Var8, b3.a());
                                    }
                                } else {
                                    throw new AssertionError("SurfaceConfig does not map to any use case");
                                }
                            }
                            i47++;
                            linkedHashMap5 = linkedHashMap24;
                            linkedHashMap6 = linkedHashMap7;
                            list3 = list21;
                        }
                    }
                }
            }
            return new cw6(linkedHashMap22, linkedHashMap23, zu6Var.e);
        }
        StringBuilder t = i61.t(str10, str11, " and Hardware level: ");
        t.append(dv6Var.e);
        t.append(". May be the specified resolution is too large and not supported. Existing surfaces: ");
        t.append(arrayList);
        t.append(str12);
        t.append(list4);
        t.append('.');
        throw new IllegalArgumentException(t.toString().toString());
    }

    public final jv6 p(int i, int i2, Size size, tr6 tr6Var) {
        size.getClass();
        tr6 tr6Var2 = jv6.e;
        return w31.u(i2, size, m(i2), i, gv6.CAPTURE_SESSION_TABLES, tr6Var);
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
            size = (Size) Collections.min(hf.c0(size, e), new ru0(false));
        }
        linkedHashMap.put(valueOf, size);
    }

    public final void s(bv6 bv6Var) {
        int i = bv6Var.a;
        boolean z = bv6Var.g;
        String str = "CONCURRENT_CAMERA";
        String str2 = this.d;
        if (i != 0 && bv6Var.e) {
            StringBuilder t = i61.t("Camera device Id is ", str2, ". Ultra HDR is not currently supported in ");
            if (i != 1) {
                if (i == 2) {
                    str = "ULTRA_HIGH_RESOLUTION_CAMERA";
                } else {
                    str = "DEFAULT";
                }
            }
            i.f(i61.n(t, str, " camera mode."));
        } else if (i != 0 && bv6Var.b == 10) {
            StringBuilder t2 = i61.t("Camera device Id is ", str2, ". 10 bit dynamic range is not currently supported in ");
            if (i != 1) {
                if (i == 2) {
                    str = "ULTRA_HIGH_RESOLUTION_CAMERA";
                } else {
                    str = "DEFAULT";
                }
            }
            i.f(i61.n(t2, str, " camera mode."));
        } else if (i != 0 && z) {
            StringBuilder t3 = i61.t("Camera device Id is ", str2, ". feature combination is not currently supported in ");
            if (i != 1) {
                if (i == 2) {
                    str = "ULTRA_HIGH_RESOLUTION_CAMERA";
                } else {
                    str = "DEFAULT";
                }
            }
            i.f(i61.n(t3, str, " camera mode."));
        } else {
            boolean z2 = bv6Var.f;
            if (z2 && z) {
                i.h("High-speed session is not supported with feature combination");
            } else if (z2 && !((Boolean) this.C.b.getValue()).booleanValue()) {
                i.h("High-speed session is not supported on this device.");
            }
        }
    }
}
