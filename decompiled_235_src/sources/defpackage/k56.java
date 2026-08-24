package defpackage;

import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k56  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class k56 implements qn2 {
    public final /* synthetic */ int A;

    public /* synthetic */ k56(int i) {
        this.A = i;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        Integer num;
        kt0 kt0Var;
        jk4 jk4Var;
        String str;
        ep epVar;
        Float f;
        Float f2;
        fy3 fy3Var;
        String str2;
        uu3 uu3Var;
        wu3 wu3Var;
        kp kpVar;
        Integer num2;
        Integer num3;
        String str3;
        ep epVar2;
        wz6 wz6Var;
        e17 e17Var;
        x47 x47Var;
        g37 g37Var;
        ux4 ux4Var;
        xu3 xu3Var;
        su3 su3Var;
        q03 q03Var;
        kt0 kt0Var2;
        x47 x47Var2;
        oj2 oj2Var;
        ij2 ij2Var;
        jj2 jj2Var;
        String str4;
        x47 x47Var3;
        x20 x20Var;
        f37 f37Var;
        gy3 gy3Var;
        kt0 kt0Var3;
        b17 b17Var;
        Boolean bool;
        h47 h47Var;
        int i = 0;
        Integer num4 = null;
        Boolean bool2 = null;
        r10 = null;
        jt1 jt1Var = null;
        r10 = null;
        ge6 ge6Var = null;
        r10 = null;
        i47 i47Var = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        r10 = null;
        nv3 nv3Var = null;
        r10 = null;
        ov3 ov3Var = null;
        r10 = null;
        zh7 zh7Var = null;
        r10 = null;
        ul7 ul7Var = null;
        r10 = null;
        nn6 nn6Var = null;
        r10 = null;
        ds4 ds4Var = null;
        vu3 vu3Var = null;
        r10 = null;
        g47 g47Var = null;
        Float f3 = null;
        y47 y47Var = null;
        r10 = null;
        g47 g47Var2 = null;
        Float f4 = null;
        switch (this.A) {
            case 0:
                obj.getClass();
                return new x20(((Float) obj).floatValue());
            case 1:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                if (obj2 != null) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                num.getClass();
                int intValue = num.intValue();
                Object obj3 = list.get(1);
                if (obj3 != null) {
                    num4 = (Integer) obj3;
                }
                num4.getClass();
                return new k47(jx2.f(intValue, num4.intValue()));
            case 2:
                obj.getClass();
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                int i2 = kt0.i;
                Boolean bool3 = Boolean.FALSE;
                nb3.k(obj4, bool3);
                if (obj4 != null) {
                    if (nb3.k(obj4, Boolean.FALSE)) {
                        kt0Var = new kt0(kt0.h);
                    } else {
                        kt0Var = new kt0(hv.b(((Integer) obj4).intValue()));
                    }
                } else {
                    kt0Var = null;
                }
                kt0Var.getClass();
                long j = kt0Var.a;
                Object obj5 = list2.get(1);
                n56 n56Var = p56.z;
                nb3.k(obj5, bool3);
                if (obj5 != null) {
                    jk4Var = (jk4) n56Var.B.g(obj5);
                } else {
                    jk4Var = null;
                }
                jk4Var.getClass();
                long j2 = jk4Var.a;
                Object obj6 = list2.get(2);
                if (obj6 != null) {
                    f4 = (Float) obj6;
                }
                f4.getClass();
                return new ge6(f4.floatValue(), j, j2);
            case 3:
                obj.getClass();
                return new wz6(((Integer) obj).intValue());
            case 4:
                obj.getClass();
                List list3 = (List) obj;
                Object obj7 = list3.get(0);
                if (obj7 != null) {
                    str = (String) obj7;
                } else {
                    str = null;
                }
                str.getClass();
                Object obj8 = list3.get(1);
                ap3 ap3Var = p56.j;
                if (!nb3.k(obj8, Boolean.FALSE) && obj8 != null) {
                    g47Var2 = (g47) ((qn2) ap3Var.L).g(obj8);
                }
                return new ov3(str, g47Var2);
            case 5:
                obj.getClass();
                return new e17(((Integer) obj).intValue());
            case 6:
                obj.getClass();
                return new q03(((Integer) obj).intValue());
            case 7:
                obj.getClass();
                List list4 = (List) obj;
                ArrayList arrayList = new ArrayList(list4.size());
                int size = list4.size();
                while (i < size) {
                    Object obj9 = list4.get(i);
                    ap3 ap3Var2 = p56.c;
                    if (nb3.k(obj9, Boolean.FALSE) || obj9 == null) {
                        epVar = null;
                    } else {
                        epVar = (ep) ((qn2) ap3Var2.L).g(obj9);
                    }
                    epVar.getClass();
                    arrayList.add(epVar);
                    i++;
                }
                return arrayList;
            case 8:
                obj.getClass();
                return new ij2(((Integer) obj).intValue());
            case 9:
                obj.getClass();
                return new jj2(((Integer) obj).intValue());
            case 10:
                Boolean bool4 = Boolean.FALSE;
                if (nb3.k(obj, bool4)) {
                    return new x47(x47.c);
                }
                obj.getClass();
                List list5 = (List) obj;
                Object obj10 = list5.get(0);
                if (obj10 != null) {
                    f = (Float) obj10;
                } else {
                    f = null;
                }
                f.getClass();
                float floatValue = f.floatValue();
                Object obj11 = list5.get(1);
                n56 n56Var2 = p56.y;
                nb3.k(obj11, bool4);
                if (obj11 != null) {
                    y47Var = (y47) n56Var2.B.g(obj11);
                }
                y47Var.getClass();
                return new x47(hi2.J(floatValue, y47Var.a));
            case 11:
                if (nb3.k(obj, 0)) {
                    return new y47(8589934592L);
                }
                if (nb3.k(obj, 1)) {
                    return new y47(4294967296L);
                }
                return new y47(0L);
            case 12:
                if (nb3.k(obj, Boolean.FALSE)) {
                    return new jk4(9205357640488583168L);
                }
                obj.getClass();
                List list6 = (List) obj;
                Object obj12 = list6.get(0);
                if (obj12 != null) {
                    f2 = (Float) obj12;
                } else {
                    f2 = null;
                }
                f2.getClass();
                float floatValue2 = f2.floatValue();
                Object obj13 = list6.get(1);
                if (obj13 != null) {
                    f3 = (Float) obj13;
                }
                f3.getClass();
                return new jk4((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(f3.floatValue()) & 4294967295L));
            case 13:
                obj.getClass();
                List list7 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list7.size());
                int size2 = list7.size();
                while (i < size2) {
                    Object obj14 = list7.get(i);
                    ap3 ap3Var3 = p56.B;
                    if (nb3.k(obj14, Boolean.FALSE) || obj14 == null) {
                        fy3Var = null;
                    } else {
                        fy3Var = (fy3) ((qn2) ap3Var3.L).g(obj14);
                    }
                    fy3Var.getClass();
                    arrayList2.add(fy3Var);
                    i++;
                }
                return new gy3(arrayList2);
            case 14:
                obj.getClass();
                String str8 = (String) obj;
                Locale forLanguageTag = Locale.forLanguageTag(str8);
                if (nb3.k(forLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str8 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new fy3(forLanguageTag);
            case 15:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                if (obj15 != null) {
                    str2 = (String) obj15;
                } else {
                    str2 = null;
                }
                str2.getClass();
                Object obj16 = list8.get(1);
                ap3 ap3Var4 = p56.j;
                if (!nb3.k(obj16, Boolean.FALSE) && obj16 != null) {
                    g47Var = (g47) ((qn2) ap3Var4.L).g(obj16);
                }
                return new nv3(str2, g47Var);
            case 16:
                obj.getClass();
                List list9 = (List) obj;
                Object obj17 = list9.get(0);
                float f5 = uu3.b;
                n56 n56Var3 = p56.D;
                Boolean bool5 = Boolean.FALSE;
                nb3.k(obj17, bool5);
                if (obj17 != null) {
                    uu3Var = (uu3) n56Var3.B.g(obj17);
                } else {
                    uu3Var = null;
                }
                uu3Var.getClass();
                float f6 = uu3Var.a;
                Object obj18 = list9.get(1);
                n56 n56Var4 = p56.E;
                nb3.k(obj18, bool5);
                if (obj18 != null) {
                    wu3Var = (wu3) n56Var4.B.g(obj18);
                } else {
                    wu3Var = null;
                }
                wu3Var.getClass();
                int i3 = wu3Var.a;
                Object obj19 = list9.get(2);
                n56 n56Var5 = p56.F;
                nb3.k(obj19, bool5);
                if (obj19 != null) {
                    vu3Var = (vu3) n56Var5.B.g(obj19);
                }
                vu3Var.getClass();
                return new xu3(f6, i3, vu3Var.a);
            case 17:
                obj.getClass();
                float floatValue3 = ((Float) obj).floatValue();
                uu3.a(floatValue3);
                return new uu3(floatValue3);
            case 18:
                obj.getClass();
                return new wu3(((Integer) obj).intValue());
            case 19:
                obj.getClass();
                List list10 = (List) obj;
                Object obj20 = list10.get(0);
                if (obj20 != null) {
                    kpVar = (kp) obj20;
                } else {
                    kpVar = null;
                }
                kpVar.getClass();
                Object obj21 = list10.get(2);
                if (obj21 != null) {
                    num2 = (Integer) obj21;
                } else {
                    num2 = null;
                }
                num2.getClass();
                int intValue2 = num2.intValue();
                Object obj22 = list10.get(3);
                if (obj22 != null) {
                    num3 = (Integer) obj22;
                } else {
                    num3 = null;
                }
                num3.getClass();
                int intValue3 = num3.intValue();
                Object obj23 = list10.get(4);
                if (obj23 != null) {
                    str3 = (String) obj23;
                } else {
                    str3 = null;
                }
                str3.getClass();
                switch (o56.a[kpVar.ordinal()]) {
                    case 1:
                        Object obj24 = list10.get(1);
                        ap3 ap3Var5 = p56.h;
                        if (!nb3.k(obj24, Boolean.FALSE) && obj24 != null) {
                            ds4Var = (ds4) ((qn2) ap3Var5.L).g(obj24);
                        }
                        ds4Var.getClass();
                        epVar2 = new ep(ds4Var, intValue2, intValue3, str3);
                        break;
                    case 2:
                        Object obj25 = list10.get(1);
                        ap3 ap3Var6 = p56.i;
                        if (!nb3.k(obj25, Boolean.FALSE) && obj25 != null) {
                            nn6Var = (nn6) ((qn2) ap3Var6.L).g(obj25);
                        }
                        nn6Var.getClass();
                        epVar2 = new ep(nn6Var, intValue2, intValue3, str3);
                        break;
                    case 3:
                        Object obj26 = list10.get(1);
                        ap3 ap3Var7 = p56.d;
                        if (!nb3.k(obj26, Boolean.FALSE) && obj26 != null) {
                            ul7Var = (ul7) ((qn2) ap3Var7.L).g(obj26);
                        }
                        ul7Var.getClass();
                        epVar2 = new ep(ul7Var, intValue2, intValue3, str3);
                        break;
                    case 4:
                        Object obj27 = list10.get(1);
                        ap3 ap3Var8 = p56.e;
                        if (!nb3.k(obj27, Boolean.FALSE) && obj27 != null) {
                            zh7Var = (zh7) ((qn2) ap3Var8.L).g(obj27);
                        }
                        zh7Var.getClass();
                        epVar2 = new ep(zh7Var, intValue2, intValue3, str3);
                        break;
                    case 5:
                        Object obj28 = list10.get(1);
                        ap3 ap3Var9 = p56.f;
                        if (!nb3.k(obj28, Boolean.FALSE) && obj28 != null) {
                            ov3Var = (ov3) ((qn2) ap3Var9.L).g(obj28);
                        }
                        ov3Var.getClass();
                        epVar2 = new ep(ov3Var, intValue2, intValue3, str3);
                        break;
                    case 6:
                        Object obj29 = list10.get(1);
                        ap3 ap3Var10 = p56.g;
                        if (!nb3.k(obj29, Boolean.FALSE) && obj29 != null) {
                            nv3Var = (nv3) ((qn2) ap3Var10.L).g(obj29);
                        }
                        nv3Var.getClass();
                        epVar2 = new ep(nv3Var, intValue2, intValue3, str3);
                        break;
                    case 7:
                        Object obj30 = list10.get(1);
                        if (obj30 != null) {
                            str7 = (String) obj30;
                        }
                        str7.getClass();
                        epVar2 = new ep(new ms6(str7), intValue2, intValue3, str3);
                        break;
                    default:
                        i.d();
                        return null;
                }
                return epVar2;
            case 20:
                obj.getClass();
                return new vu3(((Integer) obj).intValue());
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                if (obj != null) {
                    str6 = (String) obj;
                }
                str6.getClass();
                return new ul7(str6);
            case 22:
                if (obj != null) {
                    str5 = (String) obj;
                }
                str5.getClass();
                return new zh7(str5);
            case ConnectionResult.API_DISABLED /* 23 */:
                obj.getClass();
                List list11 = (List) obj;
                Object obj31 = list11.get(0);
                n56 n56Var6 = p56.s;
                Boolean bool6 = Boolean.FALSE;
                nb3.k(obj31, bool6);
                if (obj31 != null) {
                    wz6Var = (wz6) n56Var6.B.g(obj31);
                } else {
                    wz6Var = null;
                }
                wz6Var.getClass();
                int i4 = wz6Var.a;
                Object obj32 = list11.get(1);
                n56 n56Var7 = p56.t;
                nb3.k(obj32, bool6);
                if (obj32 != null) {
                    e17Var = (e17) n56Var7.B.g(obj32);
                } else {
                    e17Var = null;
                }
                e17Var.getClass();
                int i5 = e17Var.a;
                Object obj33 = list11.get(2);
                y47[] y47VarArr = x47.b;
                n56 n56Var8 = p56.x;
                nb3.k(obj33, bool6);
                if (obj33 != null) {
                    x47Var = (x47) n56Var8.B.g(obj33);
                } else {
                    x47Var = null;
                }
                x47Var.getClass();
                long j3 = x47Var.a;
                Object obj34 = list11.get(3);
                g37 g37Var2 = g37.c;
                ap3 ap3Var11 = p56.m;
                if (nb3.k(obj34, bool6) || obj34 == null) {
                    g37Var = null;
                } else {
                    g37Var = (g37) ((qn2) ap3Var11.L).g(obj34);
                }
                Object obj35 = list11.get(4);
                ap3 ap3Var12 = mb3.x;
                if (nb3.k(obj35, bool6) || obj35 == null) {
                    ux4Var = null;
                } else {
                    ux4Var = (ux4) ((qn2) ap3Var12.L).g(obj35);
                }
                Object obj36 = list11.get(5);
                xu3 xu3Var2 = xu3.d;
                ap3 ap3Var13 = p56.C;
                if (nb3.k(obj36, bool6) || obj36 == null) {
                    xu3Var = null;
                } else {
                    xu3Var = (xu3) ((qn2) ap3Var13.L).g(obj36);
                }
                Object obj37 = list11.get(6);
                ap3 ap3Var14 = mb3.z;
                if (nb3.k(obj37, bool6) || obj37 == null) {
                    su3Var = null;
                } else {
                    su3Var = (su3) ((qn2) ap3Var14.L).g(obj37);
                }
                su3Var.getClass();
                int i6 = su3Var.a;
                Object obj38 = list11.get(7);
                n56 n56Var9 = p56.u;
                nb3.k(obj38, bool6);
                if (obj38 != null) {
                    q03Var = (q03) n56Var9.B.g(obj38);
                } else {
                    q03Var = null;
                }
                q03Var.getClass();
                int i7 = q03Var.a;
                Object obj39 = list11.get(8);
                ap3 ap3Var15 = mb3.A;
                if (!nb3.k(obj39, bool6) && obj39 != null) {
                    i47Var = (i47) ((qn2) ap3Var15.L).g(obj39);
                }
                return new ds4(i4, i5, j3, g37Var, ux4Var, xu3Var, i6, i7, i47Var);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                obj.getClass();
                List list12 = (List) obj;
                Object obj40 = list12.get(0);
                int i8 = kt0.i;
                Boolean bool7 = Boolean.FALSE;
                nb3.k(obj40, bool7);
                if (obj40 != null) {
                    if (obj40.equals(bool7)) {
                        kt0Var2 = new kt0(kt0.h);
                    } else {
                        kt0Var2 = new kt0(hv.b(((Integer) obj40).intValue()));
                    }
                } else {
                    kt0Var2 = null;
                }
                kt0Var2.getClass();
                long j4 = kt0Var2.a;
                Object obj41 = list12.get(1);
                y47[] y47VarArr2 = x47.b;
                qn2 qn2Var = p56.x.B;
                nb3.k(obj41, bool7);
                if (obj41 != null) {
                    x47Var2 = (x47) qn2Var.g(obj41);
                } else {
                    x47Var2 = null;
                }
                x47Var2.getClass();
                long j5 = x47Var2.a;
                Object obj42 = list12.get(2);
                oj2 oj2Var2 = oj2.B;
                ap3 ap3Var16 = p56.n;
                if (nb3.k(obj42, bool7) || obj42 == null) {
                    oj2Var = null;
                } else {
                    oj2Var = (oj2) ((qn2) ap3Var16.L).g(obj42);
                }
                Object obj43 = list12.get(3);
                ap3 ap3Var17 = p56.v;
                if (nb3.k(obj43, bool7) || obj43 == null) {
                    ij2Var = null;
                } else {
                    ij2Var = (ij2) ((qn2) ap3Var17.L).g(obj43);
                }
                Object obj44 = list12.get(4);
                ap3 ap3Var18 = p56.w;
                if (nb3.k(obj44, bool7) || obj44 == null) {
                    jj2Var = null;
                } else {
                    jj2Var = (jj2) ((qn2) ap3Var18.L).g(obj44);
                }
                Object obj45 = list12.get(6);
                if (obj45 != null) {
                    str4 = (String) obj45;
                } else {
                    str4 = null;
                }
                Object obj46 = list12.get(7);
                nb3.k(obj46, bool7);
                if (obj46 != null) {
                    x47Var3 = (x47) qn2Var.g(obj46);
                } else {
                    x47Var3 = null;
                }
                x47Var3.getClass();
                long j6 = x47Var3.a;
                Object obj47 = list12.get(8);
                ap3 ap3Var19 = p56.o;
                if (nb3.k(obj47, bool7) || obj47 == null) {
                    x20Var = null;
                } else {
                    x20Var = (x20) ((qn2) ap3Var19.L).g(obj47);
                }
                Object obj48 = list12.get(9);
                ap3 ap3Var20 = p56.l;
                if (nb3.k(obj48, bool7) || obj48 == null) {
                    f37Var = null;
                } else {
                    f37Var = (f37) ((qn2) ap3Var20.L).g(obj48);
                }
                Object obj49 = list12.get(10);
                gy3 gy3Var2 = gy3.L;
                ap3 ap3Var21 = p56.A;
                if (nb3.k(obj49, bool7) || obj49 == null) {
                    gy3Var = null;
                } else {
                    gy3Var = (gy3) ((qn2) ap3Var21.L).g(obj49);
                }
                Object obj50 = list12.get(11);
                nb3.k(obj50, bool7);
                if (obj50 != null) {
                    if (obj50.equals(bool7)) {
                        kt0Var3 = new kt0(kt0.h);
                    } else {
                        kt0Var3 = new kt0(hv.b(((Integer) obj50).intValue()));
                    }
                } else {
                    kt0Var3 = null;
                }
                kt0Var3.getClass();
                long j7 = kt0Var3.a;
                Object obj51 = list12.get(12);
                ap3 ap3Var22 = p56.k;
                if (nb3.k(obj51, bool7) || obj51 == null) {
                    b17Var = null;
                } else {
                    b17Var = (b17) ((qn2) ap3Var22.L).g(obj51);
                }
                Object obj52 = list12.get(13);
                ge6 ge6Var2 = ge6.d;
                ap3 ap3Var23 = p56.q;
                if (!nb3.k(obj52, bool7) && obj52 != null) {
                    ge6Var = (ge6) ((qn2) ap3Var23.L).g(obj52);
                }
                return new nn6(j4, j5, oj2Var, ij2Var, jj2Var, (li2) null, str4, j6, x20Var, f37Var, gy3Var, j7, b17Var, ge6Var, 49184);
            case 25:
                obj.getClass();
                List list13 = (List) obj;
                Object obj53 = list13.get(0);
                if (obj53 != null) {
                    bool = (Boolean) obj53;
                } else {
                    bool = null;
                }
                bool.getClass();
                boolean booleanValue = bool.booleanValue();
                Object obj54 = list13.get(1);
                ap3 ap3Var24 = mb3.y;
                if (!nb3.k(obj54, Boolean.FALSE) && obj54 != null) {
                    jt1Var = (jt1) ((qn2) ap3Var24.L).g(obj54);
                }
                jt1Var.getClass();
                return new ux4(jt1Var.a, booleanValue);
            case SubAllocator.N4 /* 26 */:
                obj.getClass();
                return new jt1(((Integer) obj).intValue());
            case 27:
                obj.getClass();
                return new su3(((Integer) obj).intValue());
            case 28:
                obj.getClass();
                List list14 = (List) obj;
                Object obj55 = list14.get(0);
                ap3 ap3Var25 = mb3.B;
                if (nb3.k(obj55, Boolean.FALSE) || obj55 == null) {
                    h47Var = null;
                } else {
                    h47Var = (h47) ((qn2) ap3Var25.L).g(obj55);
                }
                h47Var.getClass();
                int i9 = h47Var.a;
                Object obj56 = list14.get(1);
                if (obj56 != null) {
                    bool2 = (Boolean) obj56;
                }
                bool2.getClass();
                return new i47(i9, bool2.booleanValue());
            default:
                obj.getClass();
                return new h47(((Integer) obj).intValue());
        }
    }
}
