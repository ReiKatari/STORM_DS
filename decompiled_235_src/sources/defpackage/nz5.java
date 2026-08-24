package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nz5  reason: default package */
/* loaded from: classes.dex */
public final class nz5 extends hw6 implements eo2 {
    public final /* synthetic */ List X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ n06 d0;
    public final /* synthetic */ qw5 e0;
    public final /* synthetic */ gn6 f0;
    public final /* synthetic */ hn6 g0;
    public final /* synthetic */ tz5 h0;
    public final /* synthetic */ List i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz5(List list, List list2, String str, n06 n06Var, qw5 qw5Var, gn6 gn6Var, hn6 hn6Var, tz5 tz5Var, List list3, r41 r41Var) {
        super(2, r41Var);
        this.X = list;
        this.Y = list2;
        this.Z = str;
        this.d0 = n06Var;
        this.e0 = qw5Var;
        this.f0 = gn6Var;
        this.g0 = hn6Var;
        this.h0 = tz5Var;
        this.i0 = list3;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((nz5) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new nz5(this.X, this.Y, this.Z, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, r41Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, yt1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        hz5 hz5Var;
        boolean z;
        boolean z2;
        boolean z3;
        List list;
        List list2;
        boolean z4;
        boolean z5;
        ArrayList V0;
        ArrayList arrayList;
        String str;
        String str2;
        List list3;
        boolean z6;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List list4;
        boolean z7;
        boolean z8;
        boolean z9;
        List list5;
        String str3;
        hz5 hz5Var2;
        String str4;
        lz5 lz5Var;
        boolean z10;
        pq5 pq5Var;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        ArrayList arrayList4 = new ArrayList();
        List<kz5> list6 = this.X;
        for (kz5 kz5Var : list6) {
            pq5 pq5Var2 = kz5Var.a;
            if (pq5Var2.g != null) {
                pq5Var = pq5Var2;
            } else {
                pq5Var = null;
            }
            if (pq5Var != null) {
                arrayList4.add(pq5Var);
            }
        }
        List e1 = gt0.e1(gt0.d1(arrayList4, new tp5(4)), 10);
        List<lz5> list7 = this.Y;
        boolean isEmpty = list7.isEmpty();
        n06 n06Var = this.d0;
        String str5 = this.Z;
        ?? r7 = yt1.A;
        qw5 qw5Var = this.e0;
        int i = 0;
        if (isEmpty) {
            if (str5.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            return new ss5(r7, r7, false, z10, true, n06Var, qw5Var, this.f0, this.g0, e1, zt1.A);
        }
        int length = str5.length();
        tz5 tz5Var = this.h0;
        if (length > 0) {
            xh5 xh5Var = tz5.L;
            String M = ej2.M(str5);
            if (M.length() != 0) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : list6) {
                    if (qs6.j0(((kz5) obj2).c, M, false)) {
                        arrayList5.add(obj2);
                    }
                }
                list6 = arrayList5;
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : list6) {
                if (tz5.g(tz5Var, ((kz5) obj3).a, qw5Var)) {
                    arrayList6.add(obj3);
                }
            }
            ArrayList arrayList7 = new ArrayList(ht0.v0(arrayList6, 10));
            int size = arrayList6.size();
            while (i < size) {
                Object obj4 = arrayList6.get(i);
                i++;
                arrayList7.add(new mr5(((kz5) obj4).a));
            }
            hn6 hn6Var = this.g0;
            gn6 gn6Var = this.f0;
            return new ss5(arrayList7, r7, false, true, false, n06Var, qw5Var, gn6Var, hn6Var, e1, tz5.f(tz5Var, arrayList7, gn6Var));
        }
        xh5 xh5Var2 = tz5.L;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (lz5 lz5Var2 : list7) {
            String str6 = lz5Var2.b;
            linkedHashMap.put(str6, new jz5(lz5Var2, str6, null, lz5Var2.c, lz5Var2.d, new LinkedHashSet()));
        }
        for (kz5 kz5Var2 : list6) {
            String str7 = kz5Var2.b;
            if (str7 == null) {
                lz5 lz5Var3 = (lz5) gt0.J0(list7);
                if (lz5Var3 != null) {
                    str7 = lz5Var3.b;
                } else {
                    str7 = null;
                }
                if (str7 == null) {
                }
            }
            lz5 l = tz5.l(str7, list7);
            if (l != null || (l = (lz5) gt0.J0(list7)) != null) {
                String str8 = l.b;
                while (str7 != null) {
                    String m = tz5.m(str7, str8);
                    if (linkedHashMap.get(str7) == null) {
                        str4 = m;
                        linkedHashMap.put(str7, new jz5(l, str7, m, tz5.k(str7), tz5.i(l, str7), new LinkedHashSet()));
                    } else {
                        str4 = m;
                    }
                    if (str4 != null) {
                        Object obj5 = linkedHashMap.get(str4);
                        if (obj5 == null) {
                            lz5Var = l;
                            obj5 = new jz5(lz5Var, str4, tz5.m(str4, str8), tz5.k(str4), tz5.i(l, str4), new LinkedHashSet());
                            linkedHashMap.put(str4, obj5);
                        } else {
                            lz5Var = l;
                        }
                        ((jz5) obj5).f.add(str7);
                    } else {
                        lz5Var = l;
                    }
                    str7 = str4;
                    l = lz5Var;
                }
            }
        }
        if (list7.size() == 1) {
            hz5Var = new fz5(((lz5) gt0.H0(list7)).b);
        } else {
            hz5Var = gz5.a;
        }
        List list8 = this.i0;
        if (list8.isEmpty()) {
            list8 = hf.b0(hz5Var);
        }
        hz5 hz5Var3 = (hz5) gt0.R0(list8);
        if (hz5Var3 != null) {
            hz5Var = hz5Var3;
        }
        boolean z11 = hz5Var instanceof gz5;
        ArrayList arrayList8 = new ArrayList();
        for (Object obj6 : list7) {
            lz5 lz5Var4 = (lz5) obj6;
            if (!list6.isEmpty()) {
                for (kz5 kz5Var3 : list6) {
                    list5 = list6;
                    String str9 = kz5Var3.b;
                    if (str9 == null) {
                        hz5Var2 = hz5Var;
                    } else {
                        lz5 l2 = tz5.l(str9, list7);
                        if (l2 != null) {
                            str3 = l2.b;
                        } else {
                            str3 = null;
                        }
                        hz5Var2 = hz5Var;
                        if (nb3.k(str3, lz5Var4.b) && tz5.g(tz5Var, kz5Var3.a, qw5Var)) {
                            arrayList8.add(obj6);
                            break;
                        }
                    }
                    list6 = list5;
                    hz5Var = hz5Var2;
                }
            }
            list5 = list6;
            hz5Var2 = hz5Var;
            list6 = list5;
            hz5Var = hz5Var2;
        }
        List<kz5> list9 = list6;
        hz5 hz5Var4 = hz5Var;
        if (arrayList8.size() <= 1) {
            z = true;
        } else {
            z = false;
        }
        if (qw5Var == qw5.ALL && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            ArrayList arrayList9 = new ArrayList();
            for (Object obj7 : list9) {
                if (tz5.g(tz5Var, ((kz5) obj7).a, qw5Var)) {
                    arrayList9.add(obj7);
                }
            }
            V0 = new ArrayList(ht0.v0(arrayList9, 10));
            int size2 = arrayList9.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj8 = arrayList9.get(i2);
                i2++;
                V0.add(new mr5(((kz5) obj8).a));
            }
        } else if (z11) {
            if (z2) {
                List d1 = gt0.d1(arrayList8, new tp5(2));
                arrayList3 = new ArrayList(ht0.v0(d1, 10));
                for (Iterator it = d1.iterator(); it.hasNext(); it = it) {
                    lz5 lz5Var5 = (lz5) it.next();
                    arrayList3.add(new lr5(lz5Var5.b, lz5Var5.c, lz5Var5.d, true));
                }
            } else {
                arrayList3 = r7;
            }
            if (qw5Var != qw5.ALL) {
                ArrayList arrayList10 = new ArrayList();
                for (Object obj9 : list9) {
                    if (tz5.g(tz5Var, ((kz5) obj9).a, qw5Var)) {
                        arrayList10.add(obj9);
                    }
                }
                V0 = new ArrayList(ht0.v0(arrayList10, 10));
                int size3 = arrayList10.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj10 = arrayList10.get(i3);
                    i3++;
                    V0.add(new mr5(((kz5) obj10).a));
                }
            } else {
                ArrayList arrayList11 = new ArrayList();
                for (Object obj11 : list9) {
                    kz5 kz5Var4 = (kz5) obj11;
                    if (kz5Var4.a.c() && tz5.g(tz5Var, kz5Var4.a, qw5Var)) {
                        arrayList11.add(obj11);
                    }
                }
                ArrayList arrayList12 = new ArrayList(ht0.v0(arrayList11, 10));
                int size4 = arrayList11.size();
                int i4 = 0;
                while (i4 < size4) {
                    Object obj12 = arrayList11.get(i4);
                    i4++;
                    arrayList12.add(new mr5(((kz5) obj12).a));
                    arrayList11 = arrayList11;
                }
                V0 = gt0.V0(arrayList3, arrayList12);
            }
        } else {
            String str10 = ((fz5) hz5Var4).a;
            jz5 jz5Var = (jz5) linkedHashMap.get(str10);
            if (jz5Var == null) {
                lz5 l3 = tz5.l(str10, list7);
                if (l3 == null) {
                    l3 = (lz5) gt0.H0(list7);
                }
                jz5Var = new jz5(l3, str10, tz5.m(str10, l3.b), tz5.k(str10), tz5.i(l3, str10), new LinkedHashSet());
            }
            if (z2) {
                LinkedHashSet<String> linkedHashSet = jz5Var.f;
                ArrayList arrayList13 = new ArrayList();
                for (String str11 : linkedHashSet) {
                    jz5 jz5Var2 = (jz5) linkedHashMap.get(str11);
                    if (jz5Var2 != null) {
                        arrayList13.add(jz5Var2);
                    }
                }
                ArrayList arrayList14 = new ArrayList();
                int size5 = arrayList13.size();
                int i5 = 0;
                List list10 = r7;
                while (i5 < size5) {
                    boolean z12 = z;
                    Object obj13 = arrayList13.get(i5);
                    i5++;
                    List list11 = list8;
                    jz5 jz5Var3 = (jz5) obj13;
                    if (!list9.isEmpty()) {
                        list10 = list10;
                        for (kz5 kz5Var5 : list9) {
                            list3 = list10;
                            z6 = z11;
                            arrayList2 = arrayList13;
                            if (nb3.k(kz5Var5.b, jz5Var3.b) && tz5.g(tz5Var, kz5Var5.a, qw5Var)) {
                                arrayList14.add(obj13);
                                break;
                            }
                            z11 = z6;
                            list10 = list3;
                            arrayList13 = arrayList2;
                        }
                    }
                    list3 = list10;
                    z6 = z11;
                    arrayList2 = arrayList13;
                    z = z12;
                    list8 = list11;
                    z11 = z6;
                    list10 = list3;
                    arrayList13 = arrayList2;
                }
                z3 = z;
                list = list8;
                list2 = list10;
                z4 = z11;
                List<jz5> d12 = gt0.d1(arrayList14, new tp5(3));
                r7 = new ArrayList(ht0.v0(d12, 10));
                for (jz5 jz5Var4 : d12) {
                    String str12 = jz5Var4.b;
                    r7.add(new lr5(str12, jz5Var4.d, jz5Var4.e, nb3.k(str12, jz5Var4.a.b)));
                }
            } else {
                z3 = z;
                list = list8;
                list2 = r7;
                z4 = z11;
            }
            ArrayList arrayList15 = new ArrayList();
            for (Object obj14 : list9) {
                if (tz5.g(tz5Var, ((kz5) obj14).a, qw5Var)) {
                    arrayList15.add(obj14);
                }
            }
            ArrayList arrayList16 = new ArrayList();
            int size6 = arrayList15.size();
            int i6 = 0;
            while (i6 < size6) {
                Object obj15 = arrayList15.get(i6);
                i6++;
                kz5 kz5Var6 = (kz5) obj15;
                if (qw5Var == qw5.ALL) {
                    pq5 pq5Var3 = kz5Var6.a;
                    String str13 = kz5Var6.b;
                    if (!pq5Var3.c() && !nb3.k(str13, str10)) {
                        if (str13 == null) {
                            str2 = "";
                        } else {
                            str2 = str13;
                        }
                        if (!tz5.o(str2, str10)) {
                            arrayList = arrayList15;
                            if (list7.size() != 1 || (str13 != null && !tz5.o(str13, ((lz5) gt0.H0(list7)).b))) {
                                arrayList15 = arrayList;
                            }
                        }
                    }
                    arrayList = arrayList15;
                } else {
                    arrayList = arrayList15;
                    if (!kz5Var6.a.c() && (str = kz5Var6.b) != null) {
                        if (!xs6.g0(str, jz5Var.a.b, false) && list7.size() != 1) {
                            arrayList15 = arrayList;
                        }
                    }
                }
                arrayList16.add(obj15);
                arrayList15 = arrayList;
            }
            z5 = false;
            ArrayList arrayList17 = new ArrayList(ht0.v0(arrayList16, 10));
            int size7 = arrayList16.size();
            int i7 = 0;
            while (i7 < size7) {
                Object obj16 = arrayList16.get(i7);
                i7++;
                arrayList17.add(new mr5(((kz5) obj16).a));
            }
            V0 = gt0.V0(r7, arrayList17);
            ArrayList arrayList18 = V0;
            if (z3 && !z4) {
                String str14 = ((fz5) hz5Var4).a;
                ArrayList arrayList19 = new ArrayList();
                lz5 l4 = tz5.l(str14, list7);
                while (str14 != null) {
                    jz5 jz5Var5 = (jz5) linkedHashMap.get(str14);
                    if (jz5Var5 != null) {
                        arrayList19.add(jz5Var5.d);
                        str14 = jz5Var5.c;
                    } else {
                        arrayList19.add(tz5.k(str14));
                        if (l4 != null) {
                            str14 = tz5.m(str14, l4.b);
                        } else {
                            str14 = null;
                        }
                    }
                }
                list4 = gt0.a1(arrayList19);
            } else {
                list4 = list2;
            }
            if (z3) {
                z7 = true;
                if (list.size() > 1) {
                    z8 = true;
                    if (z3 && !z4) {
                        z9 = z5;
                    } else {
                        z9 = z7;
                    }
                    hn6 hn6Var2 = this.g0;
                    gn6 gn6Var2 = this.f0;
                    return new ss5(arrayList18, list4, z8, false, z9, n06Var, qw5Var, gn6Var2, hn6Var2, e1, tz5.f(tz5Var, arrayList18, gn6Var2));
                }
            } else {
                z7 = true;
            }
            z8 = z5;
            if (z3) {
            }
            z9 = z7;
            hn6 hn6Var22 = this.g0;
            gn6 gn6Var22 = this.f0;
            return new ss5(arrayList18, list4, z8, false, z9, n06Var, qw5Var, gn6Var22, hn6Var22, e1, tz5.f(tz5Var, arrayList18, gn6Var22));
        }
        z3 = z;
        list = list8;
        list2 = r7;
        z4 = z11;
        z5 = false;
        ArrayList arrayList182 = V0;
        if (z3) {
        }
        list4 = list2;
        if (z3) {
        }
        z8 = z5;
        if (z3) {
        }
        z9 = z7;
        hn6 hn6Var222 = this.g0;
        gn6 gn6Var222 = this.f0;
        return new ss5(arrayList182, list4, z8, false, z9, n06Var, qw5Var, gn6Var222, hn6Var222, e1, tz5.f(tz5Var, arrayList182, gn6Var222));
    }
}
