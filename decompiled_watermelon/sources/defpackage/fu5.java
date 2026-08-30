package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fu5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fu5 implements mi2 {
    public final /* synthetic */ int A;

    public /* synthetic */ fu5(int i) {
        this.A = i;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        Float f;
        er3 er3Var;
        String str;
        sn3 sn3Var;
        un3 un3Var;
        yo yoVar;
        Integer num;
        Integer num2;
        String str2;
        so soVar;
        kn6 kn6Var;
        to6 to6Var;
        is6 is6Var;
        sq6 sq6Var;
        qo4 qo4Var;
        vn3 vn3Var;
        qn3 qn3Var;
        pu2 pu2Var;
        xq0 xq0Var;
        is6 is6Var2;
        pe2 pe2Var;
        ke2 ke2Var;
        le2 le2Var;
        String str3;
        is6 is6Var3;
        d10 d10Var;
        rq6 rq6Var;
        fr3 fr3Var;
        xq0 xq0Var2;
        qo6 qo6Var;
        Boolean bool;
        sr6 sr6Var;
        boolean z = false;
        r13 = false;
        boolean z2 = false;
        Float f2 = null;
        Boolean bool2 = null;
        r15 = null;
        ap1 ap1Var = null;
        r15 = null;
        u26 u26Var = null;
        r15 = null;
        tr6 tr6Var = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        r15 = null;
        lo3 lo3Var = null;
        r15 = null;
        mo3 mo3Var = null;
        r15 = null;
        b47 b47Var = null;
        r15 = null;
        v77 v77Var = null;
        r15 = null;
        xb6 xb6Var = null;
        r15 = null;
        bj4 bj4Var = null;
        tn3 tn3Var = null;
        r15 = null;
        rr6 rr6Var = null;
        switch (this.A) {
            case 0:
                if (b53.x(obj, 0)) {
                    return new js6(8589934592L);
                }
                if (b53.x(obj, 1)) {
                    return new js6(4294967296L);
                }
                return new js6(0L);
            case 1:
                if (b53.x(obj, Boolean.FALSE)) {
                    return new mb4(9205357640488583168L);
                }
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                if (obj2 != null) {
                    f = (Float) obj2;
                } else {
                    f = null;
                }
                f.getClass();
                float floatValue = f.floatValue();
                Object obj3 = list.get(1);
                if (obj3 != null) {
                    f2 = (Float) obj3;
                }
                f2.getClass();
                return new mb4((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(f2.floatValue()) & 4294967295L));
            case 2:
                obj.getClass();
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    Object obj4 = list2.get(i);
                    ci3 ci3Var = ku5.B;
                    if (b53.x(obj4, Boolean.FALSE) || obj4 == null) {
                        er3Var = null;
                    } else {
                        er3Var = (er3) ((mi2) ci3Var.L).n(obj4);
                    }
                    er3Var.getClass();
                    arrayList.add(er3Var);
                }
                return new fr3(arrayList);
            case 3:
                obj.getClass();
                String str7 = (String) obj;
                Locale forLanguageTag = Locale.forLanguageTag(str7);
                if (b53.x(forLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str7 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new er3(forLanguageTag);
            case 4:
                obj.getClass();
                List list3 = (List) obj;
                Object obj5 = list3.get(0);
                if (obj5 != null) {
                    str = (String) obj5;
                } else {
                    str = null;
                }
                str.getClass();
                Object obj6 = list3.get(1);
                ci3 ci3Var2 = ku5.j;
                if (!b53.x(obj6, Boolean.FALSE) && obj6 != null) {
                    rr6Var = (rr6) ((mi2) ci3Var2.L).n(obj6);
                }
                return new lo3(str, rr6Var);
            case 5:
                obj.getClass();
                List list4 = (List) obj;
                Object obj7 = list4.get(0);
                float f3 = sn3.b;
                iu5 iu5Var = ku5.D;
                Boolean bool3 = Boolean.FALSE;
                b53.x(obj7, bool3);
                if (obj7 != null) {
                    sn3Var = (sn3) iu5Var.B.n(obj7);
                } else {
                    sn3Var = null;
                }
                sn3Var.getClass();
                float f4 = sn3Var.a;
                Object obj8 = list4.get(1);
                iu5 iu5Var2 = ku5.E;
                b53.x(obj8, bool3);
                if (obj8 != null) {
                    un3Var = (un3) iu5Var2.B.n(obj8);
                } else {
                    un3Var = null;
                }
                un3Var.getClass();
                int i2 = un3Var.a;
                Object obj9 = list4.get(2);
                iu5 iu5Var3 = ku5.F;
                b53.x(obj9, bool3);
                if (obj9 != null) {
                    tn3Var = (tn3) iu5Var3.B.n(obj9);
                }
                tn3Var.getClass();
                return new vn3(f4, i2, tn3Var.a);
            case ig7.b /* 6 */:
                obj.getClass();
                float floatValue2 = ((Float) obj).floatValue();
                sn3.a(floatValue2);
                return new sn3(floatValue2);
            case 7:
                obj.getClass();
                return new un3(((Integer) obj).intValue());
            case 8:
                obj.getClass();
                List list5 = (List) obj;
                Object obj10 = list5.get(0);
                if (obj10 != null) {
                    yoVar = (yo) obj10;
                } else {
                    yoVar = null;
                }
                yoVar.getClass();
                Object obj11 = list5.get(2);
                if (obj11 != null) {
                    num = (Integer) obj11;
                } else {
                    num = null;
                }
                num.getClass();
                int intValue = num.intValue();
                Object obj12 = list5.get(3);
                if (obj12 != null) {
                    num2 = (Integer) obj12;
                } else {
                    num2 = null;
                }
                num2.getClass();
                int intValue2 = num2.intValue();
                Object obj13 = list5.get(4);
                if (obj13 != null) {
                    str2 = (String) obj13;
                } else {
                    str2 = null;
                }
                str2.getClass();
                switch (ju5.a[yoVar.ordinal()]) {
                    case 1:
                        Object obj14 = list5.get(1);
                        ci3 ci3Var3 = ku5.h;
                        if (!b53.x(obj14, Boolean.FALSE) && obj14 != null) {
                            bj4Var = (bj4) ((mi2) ci3Var3.L).n(obj14);
                        }
                        bj4Var.getClass();
                        soVar = new so(intValue, intValue2, bj4Var, str2);
                        break;
                    case 2:
                        Object obj15 = list5.get(1);
                        ci3 ci3Var4 = ku5.i;
                        if (!b53.x(obj15, Boolean.FALSE) && obj15 != null) {
                            xb6Var = (xb6) ((mi2) ci3Var4.L).n(obj15);
                        }
                        xb6Var.getClass();
                        soVar = new so(intValue, intValue2, xb6Var, str2);
                        break;
                    case 3:
                        Object obj16 = list5.get(1);
                        ci3 ci3Var5 = ku5.d;
                        if (!b53.x(obj16, Boolean.FALSE) && obj16 != null) {
                            v77Var = (v77) ((mi2) ci3Var5.L).n(obj16);
                        }
                        v77Var.getClass();
                        soVar = new so(intValue, intValue2, v77Var, str2);
                        break;
                    case 4:
                        Object obj17 = list5.get(1);
                        ci3 ci3Var6 = ku5.e;
                        if (!b53.x(obj17, Boolean.FALSE) && obj17 != null) {
                            b47Var = (b47) ((mi2) ci3Var6.L).n(obj17);
                        }
                        b47Var.getClass();
                        soVar = new so(intValue, intValue2, b47Var, str2);
                        break;
                    case 5:
                        Object obj18 = list5.get(1);
                        ci3 ci3Var7 = ku5.f;
                        if (!b53.x(obj18, Boolean.FALSE) && obj18 != null) {
                            mo3Var = (mo3) ((mi2) ci3Var7.L).n(obj18);
                        }
                        mo3Var.getClass();
                        soVar = new so(intValue, intValue2, mo3Var, str2);
                        break;
                    case ig7.b /* 6 */:
                        Object obj19 = list5.get(1);
                        ci3 ci3Var8 = ku5.g;
                        if (!b53.x(obj19, Boolean.FALSE) && obj19 != null) {
                            lo3Var = (lo3) ((mi2) ci3Var8.L).n(obj19);
                        }
                        lo3Var.getClass();
                        soVar = new so(intValue, intValue2, lo3Var, str2);
                        break;
                    case 7:
                        Object obj20 = list5.get(1);
                        if (obj20 != null) {
                            str6 = (String) obj20;
                        }
                        str6.getClass();
                        soVar = new so(intValue, intValue2, new vg6(str6), str2);
                        break;
                    default:
                        i.c();
                        return null;
                }
                return soVar;
            case 9:
                obj.getClass();
                return new tn3(((Integer) obj).intValue());
            case 10:
                if (obj != null) {
                    str5 = (String) obj;
                }
                str5.getClass();
                return new v77(str5);
            case 11:
                if (obj != null) {
                    str4 = (String) obj;
                }
                str4.getClass();
                return new b47(str4);
            case mj2.L /* 12 */:
                obj.getClass();
                List list6 = (List) obj;
                Object obj21 = list6.get(0);
                iu5 iu5Var4 = ku5.s;
                Boolean bool4 = Boolean.FALSE;
                b53.x(obj21, bool4);
                if (obj21 != null) {
                    kn6Var = (kn6) iu5Var4.B.n(obj21);
                } else {
                    kn6Var = null;
                }
                kn6Var.getClass();
                int i3 = kn6Var.a;
                Object obj22 = list6.get(1);
                iu5 iu5Var5 = ku5.t;
                b53.x(obj22, bool4);
                if (obj22 != null) {
                    to6Var = (to6) iu5Var5.B.n(obj22);
                } else {
                    to6Var = null;
                }
                to6Var.getClass();
                int i4 = to6Var.a;
                Object obj23 = list6.get(2);
                js6[] js6VarArr = is6.b;
                iu5 iu5Var6 = ku5.x;
                b53.x(obj23, bool4);
                if (obj23 != null) {
                    is6Var = (is6) iu5Var6.B.n(obj23);
                } else {
                    is6Var = null;
                }
                is6Var.getClass();
                long j = is6Var.a;
                Object obj24 = list6.get(3);
                sq6 sq6Var2 = sq6.c;
                ci3 ci3Var9 = ku5.m;
                if (b53.x(obj24, bool4) || obj24 == null) {
                    sq6Var = null;
                } else {
                    sq6Var = (sq6) ((mi2) ci3Var9.L).n(obj24);
                }
                Object obj25 = list6.get(4);
                ci3 ci3Var10 = l.o;
                if (b53.x(obj25, bool4) || obj25 == null) {
                    qo4Var = null;
                } else {
                    qo4Var = (qo4) ((mi2) ci3Var10.L).n(obj25);
                }
                Object obj26 = list6.get(5);
                vn3 vn3Var2 = vn3.d;
                ci3 ci3Var11 = ku5.C;
                if (b53.x(obj26, bool4) || obj26 == null) {
                    vn3Var = null;
                } else {
                    vn3Var = (vn3) ((mi2) ci3Var11.L).n(obj26);
                }
                Object obj27 = list6.get(6);
                ci3 ci3Var12 = l.q;
                if (b53.x(obj27, bool4) || obj27 == null) {
                    qn3Var = null;
                } else {
                    qn3Var = (qn3) ((mi2) ci3Var12.L).n(obj27);
                }
                qn3Var.getClass();
                int i5 = qn3Var.a;
                Object obj28 = list6.get(7);
                iu5 iu5Var7 = ku5.u;
                b53.x(obj28, bool4);
                if (obj28 != null) {
                    pu2Var = (pu2) iu5Var7.B.n(obj28);
                } else {
                    pu2Var = null;
                }
                pu2Var.getClass();
                int i6 = pu2Var.a;
                Object obj29 = list6.get(8);
                ci3 ci3Var13 = l.r;
                if (!b53.x(obj29, bool4) && obj29 != null) {
                    tr6Var = (tr6) ((mi2) ci3Var13.L).n(obj29);
                }
                return new bj4(i3, i4, j, sq6Var, qo4Var, vn3Var, i5, i6, tr6Var);
            case 13:
                obj.getClass();
                List list7 = (List) obj;
                Object obj30 = list7.get(0);
                int i7 = xq0.i;
                Boolean bool5 = Boolean.FALSE;
                b53.x(obj30, bool5);
                if (obj30 != null) {
                    if (obj30.equals(bool5)) {
                        xq0Var = new xq0(xq0.h);
                    } else {
                        xq0Var = new xq0(mh7.c(((Integer) obj30).intValue()));
                    }
                } else {
                    xq0Var = null;
                }
                xq0Var.getClass();
                long j2 = xq0Var.a;
                Object obj31 = list7.get(1);
                js6[] js6VarArr2 = is6.b;
                mi2 mi2Var = ku5.x.B;
                b53.x(obj31, bool5);
                if (obj31 != null) {
                    is6Var2 = (is6) mi2Var.n(obj31);
                } else {
                    is6Var2 = null;
                }
                is6Var2.getClass();
                long j3 = is6Var2.a;
                Object obj32 = list7.get(2);
                pe2 pe2Var2 = pe2.B;
                ci3 ci3Var14 = ku5.n;
                if (b53.x(obj32, bool5) || obj32 == null) {
                    pe2Var = null;
                } else {
                    pe2Var = (pe2) ((mi2) ci3Var14.L).n(obj32);
                }
                Object obj33 = list7.get(3);
                ci3 ci3Var15 = ku5.v;
                if (b53.x(obj33, bool5) || obj33 == null) {
                    ke2Var = null;
                } else {
                    ke2Var = (ke2) ((mi2) ci3Var15.L).n(obj33);
                }
                Object obj34 = list7.get(4);
                ci3 ci3Var16 = ku5.w;
                if (b53.x(obj34, bool5) || obj34 == null) {
                    le2Var = null;
                } else {
                    le2Var = (le2) ((mi2) ci3Var16.L).n(obj34);
                }
                Object obj35 = list7.get(6);
                if (obj35 != null) {
                    str3 = (String) obj35;
                } else {
                    str3 = null;
                }
                Object obj36 = list7.get(7);
                b53.x(obj36, bool5);
                if (obj36 != null) {
                    is6Var3 = (is6) mi2Var.n(obj36);
                } else {
                    is6Var3 = null;
                }
                is6Var3.getClass();
                long j4 = is6Var3.a;
                Object obj37 = list7.get(8);
                ci3 ci3Var17 = ku5.o;
                if (b53.x(obj37, bool5) || obj37 == null) {
                    d10Var = null;
                } else {
                    d10Var = (d10) ((mi2) ci3Var17.L).n(obj37);
                }
                Object obj38 = list7.get(9);
                ci3 ci3Var18 = ku5.l;
                if (b53.x(obj38, bool5) || obj38 == null) {
                    rq6Var = null;
                } else {
                    rq6Var = (rq6) ((mi2) ci3Var18.L).n(obj38);
                }
                Object obj39 = list7.get(10);
                fr3 fr3Var2 = fr3.L;
                ci3 ci3Var19 = ku5.A;
                if (b53.x(obj39, bool5) || obj39 == null) {
                    fr3Var = null;
                } else {
                    fr3Var = (fr3) ((mi2) ci3Var19.L).n(obj39);
                }
                Object obj40 = list7.get(11);
                b53.x(obj40, bool5);
                if (obj40 != null) {
                    if (obj40.equals(bool5)) {
                        xq0Var2 = new xq0(xq0.h);
                    } else {
                        xq0Var2 = new xq0(mh7.c(((Integer) obj40).intValue()));
                    }
                } else {
                    xq0Var2 = null;
                }
                xq0Var2.getClass();
                long j5 = xq0Var2.a;
                Object obj41 = list7.get(12);
                ci3 ci3Var20 = ku5.k;
                if (b53.x(obj41, bool5) || obj41 == null) {
                    qo6Var = null;
                } else {
                    qo6Var = (qo6) ((mi2) ci3Var20.L).n(obj41);
                }
                Object obj42 = list7.get(13);
                u26 u26Var2 = u26.d;
                ci3 ci3Var21 = ku5.q;
                if (!b53.x(obj42, bool5) && obj42 != null) {
                    u26Var = (u26) ((mi2) ci3Var21.L).n(obj42);
                }
                return new xb6(j2, j3, pe2Var, ke2Var, le2Var, (pd2) null, str3, j4, d10Var, rq6Var, fr3Var, j5, qo6Var, u26Var, 49184);
            case 14:
                obj.getClass();
                List list8 = (List) obj;
                Object obj43 = list8.get(0);
                if (obj43 != null) {
                    bool = (Boolean) obj43;
                } else {
                    bool = null;
                }
                bool.getClass();
                boolean booleanValue = bool.booleanValue();
                Object obj44 = list8.get(1);
                ci3 ci3Var22 = l.p;
                if (!b53.x(obj44, Boolean.FALSE) && obj44 != null) {
                    ap1Var = (ap1) ((mi2) ci3Var22.L).n(obj44);
                }
                ap1Var.getClass();
                return new qo4(ap1Var.a, booleanValue);
            case ig7.e /* 15 */:
                obj.getClass();
                return new ap1(((Integer) obj).intValue());
            case 16:
                obj.getClass();
                return new qn3(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                List list9 = (List) obj;
                Object obj45 = list9.get(0);
                ci3 ci3Var23 = l.s;
                if (b53.x(obj45, Boolean.FALSE) || obj45 == null) {
                    sr6Var = null;
                } else {
                    sr6Var = (sr6) ((mi2) ci3Var23.L).n(obj45);
                }
                sr6Var.getClass();
                int i8 = sr6Var.a;
                Object obj46 = list9.get(1);
                if (obj46 != null) {
                    bool2 = (Boolean) obj46;
                }
                bool2.getClass();
                return new tr6(i8, bool2.booleanValue());
            case 18:
                obj.getClass();
                return new sr6(((Integer) obj).intValue());
            case 19:
                return new fw5(((Integer) obj).intValue());
            case 20:
                xp4 xp4Var = (xp4) obj;
                if (xp4Var != null && xp4Var.a == 2) {
                    z2 = true;
                }
                return Boolean.valueOf(!z2);
            case 21:
                l93[] l93VarArr = pz5.a;
                qz5 qz5Var = mz5.e;
                o27 o27Var = o27.a;
                ((rz5) obj).b(qz5Var, o27Var);
                return o27Var;
            case 22:
                mb4 mb4Var = (mb4) obj;
                long j6 = mb4Var.a;
                if ((9223372034707292159L & j6) != 9205357640488583168L) {
                    return new lo(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (mb4Var.a & 4294967295L)));
                }
                return bz5.a;
            case 23:
                lo loVar = (lo) obj;
                return new mb4((Float.floatToRawIntBits(loVar.a) << 32) | (Float.floatToRawIntBits(loVar.b) & 4294967295L));
            case 24:
                if (obj == null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 25:
                qo0 qo0Var = (qo0) obj;
                qo0Var.getClass();
                m93 Q = me2.Q(qo0Var);
                if (Q == null) {
                    if (!ln2.H(qo0Var)) {
                        return null;
                    }
                    return new bq4(qo0Var);
                }
                return Q;
            case 26:
                qo0 qo0Var2 = (qo0) obj;
                qo0Var2.getClass();
                m93 Q2 = me2.Q(qo0Var2);
                if (Q2 == null) {
                    if (ln2.H(qo0Var2)) {
                        Q2 = new bq4(qo0Var2);
                    } else {
                        Q2 = null;
                    }
                }
                if (Q2 == null) {
                    return null;
                }
                return l07.R(Q2);
            case 27:
                String str8 = (String) obj;
                str8.getClass();
                return new mu(1, zg6.P0(str8, new char[]{',', ';'}, 6));
            case 28:
                String str9 = (String) obj;
                str9.getClass();
                List P0 = zg6.P0(str9, new char[]{'='}, 2);
                if (P0.size() != 2) {
                    return null;
                }
                String obj47 = zg6.Z0((String) P0.get(0)).toString();
                Float b0 = fh6.b0(zg6.Z0((String) P0.get(1)).toString());
                if (zg6.B0(obj47) || b0 == null) {
                    return null;
                }
                return new ti4(obj47, b0);
            default:
                return ((jb4) obj).name();
        }
    }
}
