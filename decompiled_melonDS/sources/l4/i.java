package l4;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements mc.l {
    public final /* synthetic */ int A;

    public /* synthetic */ i(int i2) {
        this.A = i2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        j0 j0Var;
        j0 j0Var2;
        j0 j0Var3;
        List list;
        x4.o oVar;
        Integer num;
        i3.s sVar;
        h3.b bVar;
        String str;
        f fVar;
        Float f8;
        Float f10;
        s4.a aVar;
        String str2;
        w4.f fVar2;
        w4.h hVar;
        k kVar;
        Integer num2;
        Integer num3;
        String str3;
        f fVar3;
        int i2 = 0;
        j0 j0Var4 = null;
        String str4 = null;
        String str5 = null;
        r4 = null;
        n nVar = null;
        r4 = null;
        o oVar2 = null;
        r4 = null;
        t0 t0Var = null;
        r4 = null;
        u0 u0Var = null;
        r4 = null;
        j0 j0Var5 = null;
        r4 = null;
        v vVar = null;
        w4.g gVar = null;
        r4 = null;
        p0 p0Var = null;
        Float f11 = null;
        x4.p pVar = null;
        r4 = null;
        p0 p0Var2 = null;
        Float f12 = null;
        Integer num4 = null;
        x4.o oVar3 = null;
        String str6 = null;
        j0Var4 = null;
        switch (this.A) {
            case 0:
                return Boolean.valueOf(!(((c) obj) instanceof v));
            case DSiCameraSource.FrontCamera /* 1 */:
                s sVar2 = (s) obj;
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(sVar2.f8891b);
                sb2.append(", ");
                return w.d.p(sb2, sVar2.f8892c, ')');
            case 2:
                obj.getClass();
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                mc.l lVar = (mc.l) h0.f8804i.L;
                Boolean bool = Boolean.FALSE;
                if (nc.k.a(obj2, bool) || obj2 == null) {
                    j0Var = null;
                } else {
                    j0Var = (j0) lVar.k(obj2);
                }
                Object obj3 = list2.get(1);
                if (nc.k.a(obj3, bool) || obj3 == null) {
                    j0Var2 = null;
                } else {
                    j0Var2 = (j0) lVar.k(obj3);
                }
                Object obj4 = list2.get(2);
                if (nc.k.a(obj4, bool) || obj4 == null) {
                    j0Var3 = null;
                } else {
                    j0Var3 = (j0) lVar.k(obj4);
                }
                Object obj5 = list2.get(3);
                if (!nc.k.a(obj5, bool) && obj5 != null) {
                    j0Var4 = (j0) lVar.k(obj5);
                }
                return new p0(j0Var, j0Var2, j0Var3, j0Var4);
            case 3:
                obj.getClass();
                List list3 = (List) obj;
                Object obj6 = list3.get(1);
                p1.a0 a0Var = h0.f8797b;
                if (nc.k.a(obj6, Boolean.FALSE) || obj6 == null) {
                    list = null;
                } else {
                    list = (List) ((mc.l) a0Var.L).k(obj6);
                }
                Object obj7 = list3.get(0);
                if (obj7 != null) {
                    str6 = (String) obj7;
                }
                str6.getClass();
                return new h(list, str6);
            case 4:
                obj.getClass();
                return new w4.l(((Integer) obj).intValue());
            case l1.c.f8511g /* 5 */:
                obj.getClass();
                List list4 = (List) obj;
                return new w4.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case l1.c.f8509e /* 6 */:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                x4.p[] pVarArr = x4.o.f14348b;
                mc.l lVar2 = h0.f8818x.B;
                Boolean bool2 = Boolean.FALSE;
                nc.k.a(obj8, bool2);
                if (obj8 != null) {
                    oVar = (x4.o) lVar2.k(obj8);
                } else {
                    oVar = null;
                }
                oVar.getClass();
                long j2 = oVar.f14350a;
                Object obj9 = list5.get(1);
                nc.k.a(obj9, bool2);
                if (obj9 != null) {
                    oVar3 = (x4.o) lVar2.k(obj9);
                }
                oVar3.getClass();
                return new w4.q(j2, oVar3.f14350a);
            case 7:
                obj.getClass();
                return new p4.j(((Integer) obj).intValue());
            case 8:
                obj.getClass();
                return new w4.a(((Float) obj).floatValue());
            case l1.c.f8508d /* 9 */:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                if (obj10 != null) {
                    num = (Integer) obj10;
                } else {
                    num = null;
                }
                num.getClass();
                int intValue = num.intValue();
                Object obj11 = list6.get(1);
                if (obj11 != null) {
                    num4 = (Integer) obj11;
                }
                num4.getClass();
                return new q0(i0.b(intValue, num4.intValue()));
            case l1.c.f8510f /* 10 */:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i10 = i3.s.f6688i;
                Boolean bool3 = Boolean.FALSE;
                nc.k.a(obj12, bool3);
                if (obj12 != null) {
                    if (nc.k.a(obj12, Boolean.FALSE)) {
                        sVar = new i3.s(i3.s.f6687h);
                    } else {
                        sVar = new i3.s(i3.z.c(((Integer) obj12).intValue()));
                    }
                } else {
                    sVar = null;
                }
                sVar.getClass();
                long j10 = sVar.f6689a;
                Object obj13 = list7.get(1);
                f0 f0Var = h0.f8820z;
                nc.k.a(obj13, bool3);
                if (obj13 != null) {
                    bVar = (h3.b) f0Var.B.k(obj13);
                } else {
                    bVar = null;
                }
                bVar.getClass();
                long j11 = bVar.f6050a;
                Object obj14 = list7.get(2);
                if (obj14 != null) {
                    f12 = (Float) obj14;
                }
                f12.getClass();
                return new i3.m0(f12.floatValue(), j10, j11);
            case 11:
                obj.getClass();
                return new w4.k(((Integer) obj).intValue());
            case 12:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                if (obj15 != null) {
                    str = (String) obj15;
                } else {
                    str = null;
                }
                str.getClass();
                Object obj16 = list8.get(1);
                p1.a0 a0Var2 = h0.f8805j;
                if (!nc.k.a(obj16, Boolean.FALSE) && obj16 != null) {
                    p0Var2 = (p0) ((mc.l) a0Var2.L).k(obj16);
                }
                return new o(str, p0Var2);
            case 13:
                obj.getClass();
                return new w4.m(((Integer) obj).intValue());
            case 14:
                obj.getClass();
                return new w4.d(((Integer) obj).intValue());
            case l1.c.f8512h /* 15 */:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList = new ArrayList(list9.size());
                int size = list9.size();
                while (i2 < size) {
                    Object obj17 = list9.get(i2);
                    p1.a0 a0Var3 = h0.f8798c;
                    if (nc.k.a(obj17, Boolean.FALSE) || obj17 == null) {
                        fVar = null;
                    } else {
                        fVar = (f) ((mc.l) a0Var3.L).k(obj17);
                    }
                    fVar.getClass();
                    arrayList.add(fVar);
                    i2++;
                }
                return arrayList;
            case 16:
                obj.getClass();
                return new p4.h(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                return new p4.i(((Integer) obj).intValue());
            case 18:
                Boolean bool4 = Boolean.FALSE;
                if (nc.k.a(obj, bool4)) {
                    return new x4.o(x4.o.f14349c);
                }
                obj.getClass();
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                if (obj18 != null) {
                    f8 = (Float) obj18;
                } else {
                    f8 = null;
                }
                f8.getClass();
                float floatValue = f8.floatValue();
                Object obj19 = list10.get(1);
                f0 f0Var2 = h0.f8819y;
                nc.k.a(obj19, bool4);
                if (obj19 != null) {
                    pVar = (x4.p) f0Var2.B.k(obj19);
                }
                pVar.getClass();
                return new x4.o(p7.t.C(pVar.f14351a, floatValue));
            case 19:
                if (nc.k.a(obj, 0)) {
                    return new x4.p(8589934592L);
                }
                if (nc.k.a(obj, 1)) {
                    return new x4.p(4294967296L);
                }
                return new x4.p(0L);
            case 20:
                if (nc.k.a(obj, Boolean.FALSE)) {
                    return new h3.b(9205357640488583168L);
                }
                obj.getClass();
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                if (obj20 != null) {
                    f10 = (Float) obj20;
                } else {
                    f10 = null;
                }
                f10.getClass();
                float floatValue2 = f10.floatValue();
                Object obj21 = list11.get(1);
                if (obj21 != null) {
                    f11 = (Float) obj21;
                }
                f11.getClass();
                return new h3.b((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(f11.floatValue()) & 4294967295L));
            case 21:
                obj.getClass();
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i2 < size2) {
                    Object obj22 = list12.get(i2);
                    p1.a0 a0Var4 = h0.B;
                    if (nc.k.a(obj22, Boolean.FALSE) || obj22 == null) {
                        aVar = null;
                    } else {
                        aVar = (s4.a) ((mc.l) a0Var4.L).k(obj22);
                    }
                    aVar.getClass();
                    arrayList2.add(aVar);
                    i2++;
                }
                return new s4.b(arrayList2);
            case 22:
                obj.getClass();
                String str7 = (String) obj;
                s4.c.f12833a.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str7);
                if (nc.k.a(forLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str7 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new s4.a(forLanguageTag);
            case 23:
                obj.getClass();
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                if (obj23 != null) {
                    str2 = (String) obj23;
                } else {
                    str2 = null;
                }
                str2.getClass();
                Object obj24 = list13.get(1);
                p1.a0 a0Var5 = h0.f8805j;
                if (!nc.k.a(obj24, Boolean.FALSE) && obj24 != null) {
                    p0Var = (p0) ((mc.l) a0Var5.L).k(obj24);
                }
                return new n(str2, p0Var);
            case 24:
                obj.getClass();
                List list14 = (List) obj;
                Object obj25 = list14.get(0);
                float f13 = w4.f.f14132b;
                f0 f0Var3 = h0.D;
                Boolean bool5 = Boolean.FALSE;
                nc.k.a(obj25, bool5);
                if (obj25 != null) {
                    fVar2 = (w4.f) f0Var3.B.k(obj25);
                } else {
                    fVar2 = null;
                }
                fVar2.getClass();
                float f14 = fVar2.f14135a;
                Object obj26 = list14.get(1);
                f0 f0Var4 = h0.E;
                nc.k.a(obj26, bool5);
                if (obj26 != null) {
                    hVar = (w4.h) f0Var4.B.k(obj26);
                } else {
                    hVar = null;
                }
                hVar.getClass();
                int i11 = hVar.f14137a;
                Object obj27 = list14.get(2);
                f0 f0Var5 = h0.F;
                nc.k.a(obj27, bool5);
                if (obj27 != null) {
                    gVar = (w4.g) f0Var5.B.k(obj27);
                }
                gVar.getClass();
                return new w4.i(f14, i11, gVar.f14136a);
            case 25:
                obj.getClass();
                float floatValue3 = ((Float) obj).floatValue();
                w4.f.a(floatValue3);
                return new w4.f(floatValue3);
            case 26:
                obj.getClass();
                return new w4.h(((Integer) obj).intValue());
            case 27:
                obj.getClass();
                List list15 = (List) obj;
                Object obj28 = list15.get(0);
                if (obj28 != null) {
                    kVar = (k) obj28;
                } else {
                    kVar = null;
                }
                kVar.getClass();
                Object obj29 = list15.get(2);
                if (obj29 != null) {
                    num2 = (Integer) obj29;
                } else {
                    num2 = null;
                }
                num2.getClass();
                int intValue2 = num2.intValue();
                Object obj30 = list15.get(3);
                if (obj30 != null) {
                    num3 = (Integer) obj30;
                } else {
                    num3 = null;
                }
                num3.getClass();
                int intValue3 = num3.intValue();
                Object obj31 = list15.get(4);
                if (obj31 != null) {
                    str3 = (String) obj31;
                } else {
                    str3 = null;
                }
                str3.getClass();
                switch (g0.f8795a[kVar.ordinal()]) {
                    case DSiCameraSource.FrontCamera /* 1 */:
                        Object obj32 = list15.get(1);
                        p1.a0 a0Var6 = h0.f8803h;
                        if (!nc.k.a(obj32, Boolean.FALSE) && obj32 != null) {
                            vVar = (v) ((mc.l) a0Var6.L).k(obj32);
                        }
                        vVar.getClass();
                        fVar3 = new f(intValue2, intValue3, vVar, str3);
                        break;
                    case 2:
                        Object obj33 = list15.get(1);
                        p1.a0 a0Var7 = h0.f8804i;
                        if (!nc.k.a(obj33, Boolean.FALSE) && obj33 != null) {
                            j0Var5 = (j0) ((mc.l) a0Var7.L).k(obj33);
                        }
                        j0Var5.getClass();
                        fVar3 = new f(intValue2, intValue3, j0Var5, str3);
                        break;
                    case 3:
                        Object obj34 = list15.get(1);
                        p1.a0 a0Var8 = h0.f8799d;
                        if (!nc.k.a(obj34, Boolean.FALSE) && obj34 != null) {
                            u0Var = (u0) ((mc.l) a0Var8.L).k(obj34);
                        }
                        u0Var.getClass();
                        fVar3 = new f(intValue2, intValue3, u0Var, str3);
                        break;
                    case 4:
                        Object obj35 = list15.get(1);
                        p1.a0 a0Var9 = h0.f8800e;
                        if (!nc.k.a(obj35, Boolean.FALSE) && obj35 != null) {
                            t0Var = (t0) ((mc.l) a0Var9.L).k(obj35);
                        }
                        t0Var.getClass();
                        fVar3 = new f(intValue2, intValue3, t0Var, str3);
                        break;
                    case l1.c.f8511g /* 5 */:
                        Object obj36 = list15.get(1);
                        p1.a0 a0Var10 = h0.f8801f;
                        if (!nc.k.a(obj36, Boolean.FALSE) && obj36 != null) {
                            oVar2 = (o) ((mc.l) a0Var10.L).k(obj36);
                        }
                        oVar2.getClass();
                        fVar3 = new f(intValue2, intValue3, oVar2, str3);
                        break;
                    case l1.c.f8509e /* 6 */:
                        Object obj37 = list15.get(1);
                        p1.a0 a0Var11 = h0.f8802g;
                        if (!nc.k.a(obj37, Boolean.FALSE) && obj37 != null) {
                            nVar = (n) ((mc.l) a0Var11.L).k(obj37);
                        }
                        nVar.getClass();
                        fVar3 = new f(intValue2, intValue3, nVar, str3);
                        break;
                    case 7:
                        Object obj38 = list15.get(1);
                        if (obj38 != null) {
                            str5 = (String) obj38;
                        }
                        str5.getClass();
                        fVar3 = new f(intValue2, intValue3, new l0(str5), str3);
                        break;
                    default:
                        m9.o.o();
                        return null;
                }
                return fVar3;
            case 28:
                obj.getClass();
                return new w4.g(((Integer) obj).intValue());
            default:
                if (obj != null) {
                    str4 = (String) obj;
                }
                str4.getClass();
                return new u0(str4);
        }
    }
}
