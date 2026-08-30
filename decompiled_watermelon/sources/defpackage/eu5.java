package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eu5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eu5 implements aj2 {
    public final /* synthetic */ int A;

    public /* synthetic */ eu5(int i) {
        this.A = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        yo yoVar;
        Object a;
        boolean z = false;
        boolean z2 = false;
        it5 it5Var = (it5) obj;
        switch (this.A) {
            case 0:
                return obj2;
            case 1:
                to toVar = (to) obj2;
                return l07.n(toVar.B, ku5.a(toVar.A, ku5.b, it5Var));
            case 2:
                return Integer.valueOf(((qo6) obj2).a);
            case 3:
                rq6 rq6Var = (rq6) obj2;
                return l07.n(Float.valueOf(rq6Var.a), Float.valueOf(rq6Var.b));
            case 4:
                sq6 sq6Var = (sq6) obj2;
                is6 is6Var = new is6(sq6Var.a);
                iu5 iu5Var = ku5.x;
                return l07.n(ku5.a(is6Var, iu5Var, it5Var), ku5.a(new is6(sq6Var.b), iu5Var, it5Var));
            case 5:
                return Integer.valueOf(((pe2) obj2).A);
            case ig7.b /* 6 */:
                mo3 mo3Var = (mo3) obj2;
                return l07.n(mo3Var.a, ku5.a(mo3Var.b, ku5.j, it5Var));
            case 7:
                return Float.valueOf(((d10) obj2).a);
            case 8:
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(ku5.a((so) list.get(i), ku5.c, it5Var));
                }
                return arrayList;
            case 9:
                vr6 vr6Var = (vr6) obj2;
                return l07.n(Integer.valueOf((int) (vr6Var.a >> 32)), Integer.valueOf((int) (vr6Var.a & 4294967295L)));
            case 10:
                u26 u26Var = (u26) obj2;
                return l07.n(ku5.a(new xq0(u26Var.a), ku5.r, it5Var), ku5.a(new mb4(u26Var.b), ku5.z, it5Var), Float.valueOf(u26Var.c));
            case 11:
                return Integer.valueOf(((kn6) obj2).a);
            case mj2.L /* 12 */:
                return Integer.valueOf(((to6) obj2).a);
            case 13:
                return Integer.valueOf(((pu2) obj2).a);
            case 14:
                return Integer.valueOf(((ke2) obj2).a);
            case ig7.e /* 15 */:
                return Integer.valueOf(((le2) obj2).a);
            case 16:
                is6 is6Var2 = (is6) obj2;
                long j = is6.c;
                if (is6Var2 != null) {
                    z2 = is6.a(is6Var2.a, j);
                }
                if (z2) {
                    return Boolean.FALSE;
                }
                return l07.n(Float.valueOf(is6.c(is6Var2.a)), ku5.a(new js6(is6.b(is6Var2.a)), ku5.y, it5Var));
            case 17:
                lo3 lo3Var = (lo3) obj2;
                return l07.n(lo3Var.a, ku5.a(lo3Var.b, ku5.j, it5Var));
            case 18:
                long j2 = ((js6) obj2).a;
                if (js6.a(j2, 8589934592L)) {
                    return 0;
                }
                if (js6.a(j2, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 19:
                mb4 mb4Var = (mb4) obj2;
                if (mb4Var != null) {
                    z = mb4.b(mb4Var.a, 9205357640488583168L);
                }
                if (z) {
                    return Boolean.FALSE;
                }
                return l07.n(Float.valueOf(Float.intBitsToFloat((int) (mb4Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (mb4Var.a & 4294967295L))));
            case 20:
                so soVar = (so) obj2;
                Object obj3 = soVar.a;
                if (obj3 instanceof bj4) {
                    yoVar = yo.Paragraph;
                } else if (obj3 instanceof xb6) {
                    yoVar = yo.Span;
                } else if (obj3 instanceof v77) {
                    yoVar = yo.VerbatimTts;
                } else if (obj3 instanceof b47) {
                    yoVar = yo.Url;
                } else if (obj3 instanceof mo3) {
                    yoVar = yo.Link;
                } else if (obj3 instanceof lo3) {
                    yoVar = yo.Clickable;
                } else if (obj3 instanceof vg6) {
                    yoVar = yo.String;
                } else {
                    throw new UnsupportedOperationException();
                }
                switch (ju5.a[yoVar.ordinal()]) {
                    case 1:
                        obj3.getClass();
                        a = ku5.a((bj4) obj3, ku5.h, it5Var);
                        break;
                    case 2:
                        obj3.getClass();
                        a = ku5.a((xb6) obj3, ku5.i, it5Var);
                        break;
                    case 3:
                        obj3.getClass();
                        a = ku5.a((v77) obj3, ku5.d, it5Var);
                        break;
                    case 4:
                        obj3.getClass();
                        a = ku5.a((b47) obj3, ku5.e, it5Var);
                        break;
                    case 5:
                        obj3.getClass();
                        a = ku5.a((mo3) obj3, ku5.f, it5Var);
                        break;
                    case ig7.b /* 6 */:
                        obj3.getClass();
                        a = ku5.a((lo3) obj3, ku5.g, it5Var);
                        break;
                    case 7:
                        obj3.getClass();
                        a = ((vg6) obj3).a;
                        break;
                    default:
                        i.c();
                        return null;
                }
                return l07.n(yoVar, a, Integer.valueOf(soVar.b), Integer.valueOf(soVar.c), soVar.d);
            case 21:
                List list2 = ((fr3) obj2).A;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(ku5.a((er3) list2.get(i2), ku5.B, it5Var));
                }
                return arrayList2;
            case 22:
                return ((er3) obj2).a.toLanguageTag();
            case 23:
                vn3 vn3Var = (vn3) obj2;
                return l07.n(ku5.a(new sn3(vn3Var.a), ku5.D, it5Var), ku5.a(new un3(vn3Var.b), ku5.E, it5Var), ku5.a(new tn3(vn3Var.c), ku5.F, it5Var));
            case 24:
                return Float.valueOf(((sn3) obj2).a);
            case 25:
                return Integer.valueOf(((un3) obj2).a);
            case 26:
                return Integer.valueOf(((tn3) obj2).a);
            case 27:
                return ((v77) obj2).a;
            case 28:
                bj4 bj4Var = (bj4) obj2;
                Object a2 = ku5.a(new kn6(bj4Var.a), ku5.s, it5Var);
                Object a3 = ku5.a(new to6(bj4Var.b), ku5.t, it5Var);
                Object a4 = ku5.a(new is6(bj4Var.c), ku5.x, it5Var);
                sq6 sq6Var2 = bj4Var.d;
                sq6 sq6Var3 = sq6.c;
                Object a5 = ku5.a(sq6Var2, ku5.m, it5Var);
                Object a6 = ku5.a(bj4Var.e, l.o, it5Var);
                vn3 vn3Var2 = bj4Var.f;
                vn3 vn3Var3 = vn3.d;
                return l07.n(a2, a3, a4, a5, a6, ku5.a(vn3Var2, ku5.C, it5Var), ku5.a(new qn3(bj4Var.g), l.q, it5Var), ku5.a(new pu2(bj4Var.h), ku5.u, it5Var), ku5.a(bj4Var.i, l.r, it5Var));
            default:
                return ((b47) obj2).a;
        }
    }
}
