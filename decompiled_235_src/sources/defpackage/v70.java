package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v70  reason: default package */
/* loaded from: classes.dex */
public final class v70 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(List list, List list2, tz5 tz5Var, gn6 gn6Var, hn6 hn6Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 2;
        this.Y = list;
        this.Z = list2;
        this.d0 = tz5Var;
        this.e0 = gn6Var;
        this.f0 = hn6Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((v70) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                ((v70) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            default:
                return ((v70) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.f0;
        Object obj3 = this.e0;
        Object obj4 = this.d0;
        Object obj5 = this.Z;
        switch (i) {
            case 0:
                v70 v70Var = new v70((w70) obj5, (eg4) obj4, (le) obj3, (u6) obj2, r41Var, 0);
                v70Var.Y = obj;
                return v70Var;
            case 1:
                v70 v70Var2 = new v70((nv4) obj5, (sz1) obj4, (pq5) obj3, (v80) obj2, r41Var, 1);
                v70Var2.Y = obj;
                return v70Var2;
            default:
                return new v70((List) this.Y, (List) obj5, (tz5) obj4, (gn6) obj3, (hn6) obj2, r41Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ab  */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r2v4, types: [em5] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Collection em5Var;
        Object su0Var;
        String str;
        String str2;
        ArrayList arrayList;
        String str3;
        int i = this.X;
        Object obj2 = this.f0;
        Object obj3 = this.Z;
        Object obj4 = this.d0;
        Object obj5 = this.e0;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                w61 w61Var = (w61) this.Y;
                w70 w70Var = (w70) obj3;
                hv.L(w61Var, null, null, new b0(w70Var, (eg4) obj4, (le) obj5, (r41) null, 8), 3);
                return hv.L(w61Var, null, null, new z(w70Var, (u6) obj2, null, 9), 3);
            case 1:
                w61 w61Var2 = (w61) this.Y;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                sz1 sz1Var = (sz1) obj4;
                hv.L(w61Var2, null, null, new b0((nv4) obj3, sz1Var, (pq5) obj5, (r41) null, 29), 3);
                hv.L(w61Var2, null, null, new hz1(13, null, sz1Var), 3);
                hv.L(w61Var2, null, null, new u12((v80) obj2, sz1Var, (r41) null, 0), 3);
                return jg7.a;
            default:
                gn6 gn6Var = (gn6) obj5;
                tz5 tz5Var = (tz5) obj4;
                List<kz5> list = (List) obj3;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                List<kz5> list2 = (List) this.Y;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : list2) {
                    if (((kz5) obj6).a.i.length() > 0) {
                        arrayList2.add(obj6);
                    }
                }
                int k0 = c14.k0(ht0.v0(arrayList2, 10));
                int i2 = 16;
                if (k0 < 16) {
                    k0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(k0);
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj7 = arrayList2.get(i3);
                    i3++;
                    kz5 kz5Var = (kz5) obj7;
                    String lowerCase = kz5Var.a.a.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    linkedHashMap.put(qs6.T0(lowerCase).toString(), kz5Var.a.i);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj8 : list2) {
                    if (((kz5) obj8).a.i.length() > 0) {
                        arrayList3.add(obj8);
                    }
                }
                int k02 = c14.k0(ht0.v0(arrayList3, 10));
                if (k02 < 16) {
                    k02 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(k02);
                int size2 = arrayList3.size();
                int i4 = 0;
                while (true) {
                    char c = '.';
                    if (i4 < size2) {
                        Object obj9 = arrayList3.get(i4);
                        i4++;
                        kz5 kz5Var2 = (kz5) obj9;
                        String str4 = kz5Var2.a.c;
                        String lowerCase2 = qs6.R0('.', str4, str4).toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        linkedHashMap2.put(qs6.T0(lowerCase2).toString(), kz5Var2.a.i);
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        for (kz5 kz5Var3 : list) {
                            Long l = kz5Var3.a.l;
                            if (l != null) {
                                long longValue = l.longValue();
                                g04.y(16);
                                String l2 = Long.toString(longValue, 16);
                                l2.getClass();
                                String B0 = qs6.B0(8, l2);
                                if (B0 != null) {
                                    str3 = B0.toLowerCase(Locale.ROOT);
                                    str3.getClass();
                                    if (str3 == null) {
                                        arrayList4.add(str3);
                                    }
                                }
                            }
                            str3 = null;
                            if (str3 == null) {
                            }
                        }
                        Set p1 = gt0.p1(arrayList4);
                        Pattern compile = Pattern.compile("^[0-9a-fA-F]{8}$");
                        compile.getClass();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj10 : list2) {
                            pq5 pq5Var = ((kz5) obj10).a;
                            int i5 = i2;
                            String str5 = pq5Var.c;
                            String R0 = qs6.R0(c, str5, str5);
                            Locale locale = Locale.ROOT;
                            String lowerCase3 = R0.toLowerCase(locale);
                            lowerCase3.getClass();
                            String obj11 = qs6.T0(lowerCase3).toString();
                            String lowerCase4 = pq5Var.a.toLowerCase(locale);
                            lowerCase4.getClass();
                            String obj12 = qs6.T0(lowerCase4).toString();
                            obj11.getClass();
                            if (!compile.matcher(obj11).matches()) {
                                obj12.getClass();
                                if (!compile.matcher(obj12).matches() && !p1.contains(obj11) && !p1.contains(obj12)) {
                                    arrayList5.add(obj10);
                                }
                            }
                            i2 = i5;
                            c = '.';
                        }
                        int i6 = i2;
                        xh5 xh5Var = tz5.L;
                        ArrayList arrayList6 = new ArrayList(ht0.v0(list2, 10));
                        for (kz5 kz5Var4 : list2) {
                            arrayList6.add(kz5Var4.a);
                        }
                        ArrayList arrayList7 = new ArrayList();
                        int size3 = arrayList6.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            Object obj13 = arrayList6.get(i7);
                            i7++;
                            pq5 pq5Var2 = (pq5) obj13;
                            boolean z = pq5Var2.h;
                            Uri uri = pq5Var2.d;
                            if (!z) {
                                arrayList = arrayList6;
                                if (!xs6.Y(pq5Var2.c, ".dsi", true)) {
                                    String path = uri.getPath();
                                    if (path != null) {
                                        if (!xs6.Y(path, ".dsi", true)) {
                                        }
                                    }
                                    arrayList6 = arrayList;
                                }
                            } else {
                                arrayList = arrayList6;
                            }
                            if (!pq5Var2.c() && !tz5Var.K.contains(uri.toString())) {
                                arrayList7.add(obj13);
                            }
                            arrayList6 = arrayList;
                        }
                        if (!arrayList7.isEmpty()) {
                            as0 a = to7.a(tz5Var);
                            xe1 xe1Var = xk1.a;
                            hv.L(a, de1.L, null, new m7(tz5Var, arrayList7, (r41) null, 3), 2);
                        }
                        ArrayList arrayList8 = new ArrayList();
                        int size4 = arrayList5.size();
                        int i8 = 0;
                        while (i8 < size4) {
                            Object obj14 = arrayList5.get(i8);
                            i8++;
                            Long l3 = ((kz5) obj14).a.l;
                            if (l3 != null) {
                                arrayList8.add(l3);
                            }
                        }
                        Set p12 = gt0.p1(arrayList8);
                        ArrayList arrayList9 = new ArrayList(ht0.v0(list, 10));
                        for (kz5 kz5Var5 : list) {
                            pq5 pq5Var3 = kz5Var5.a;
                            Long l4 = pq5Var3.l;
                            String str6 = pq5Var3.i;
                            if (l4 != null) {
                                long longValue2 = l4.longValue();
                                g04.y(i6);
                                String l5 = Long.toString(longValue2, i6);
                                l5.getClass();
                                String B02 = qs6.B0(8, l5);
                                if (B02 != null) {
                                    str = B02.toLowerCase(Locale.ROOT);
                                    str.getClass();
                                    if (str6.length() <= 0) {
                                        str2 = str6;
                                    } else {
                                        str2 = 0;
                                    }
                                    if (str2 == null && (str2 = (String) linkedHashMap2.get(str)) == null) {
                                        String lowerCase5 = pq5Var3.a.toLowerCase(Locale.ROOT);
                                        lowerCase5.getClass();
                                        str2 = (String) linkedHashMap.get(qs6.T0(lowerCase5).toString());
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                    }
                                    if (str2.length() > 0 && !str2.equals(str6)) {
                                        pq5 a2 = pq5.a(pq5Var3, null, null, null, null, false, str2, 0L, false, null, 7935);
                                        xh5 xh5Var2 = tz5.L;
                                        String M = ej2.M(hf.k0(a2));
                                        String M2 = ej2.M(a2.a);
                                        String M3 = ej2.M(a2.c);
                                        String M4 = ej2.M(a2.b);
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(M);
                                        sb.append("\u0000");
                                        sb.append(M2);
                                        sb.append("\u0000");
                                        sb.append(M3);
                                        kz5Var5 = new kz5(a2, kz5Var5.b, i61.n(sb, "\u0000", M4));
                                    }
                                    arrayList9.add(kz5Var5);
                                    i6 = 16;
                                }
                            }
                            str = null;
                            if (str6.length() <= 0) {
                            }
                            if (str2 == null) {
                                String lowerCase52 = pq5Var3.a.toLowerCase(Locale.ROOT);
                                lowerCase52.getClass();
                                str2 = (String) linkedHashMap.get(qs6.T0(lowerCase52).toString());
                                if (str2 == null) {
                                }
                            }
                            if (str2.length() > 0) {
                                pq5 a22 = pq5.a(pq5Var3, null, null, null, null, false, str2, 0L, false, null, 7935);
                                xh5 xh5Var22 = tz5.L;
                                String M5 = ej2.M(hf.k0(a22));
                                String M22 = ej2.M(a22.a);
                                String M32 = ej2.M(a22.c);
                                String M42 = ej2.M(a22.b);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(M5);
                                sb2.append("\u0000");
                                sb2.append(M22);
                                sb2.append("\u0000");
                                sb2.append(M32);
                                kz5Var5 = new kz5(a22, kz5Var5.b, i61.n(sb2, "\u0000", M42));
                            }
                            arrayList9.add(kz5Var5);
                            i6 = 16;
                        }
                        ArrayList arrayList10 = new ArrayList();
                        int size5 = arrayList9.size();
                        int i9 = 0;
                        while (i9 < size5) {
                            Object obj15 = arrayList9.get(i9);
                            i9++;
                            if (!gt0.C0(p12, ((kz5) obj15).a.l)) {
                                arrayList10.add(obj15);
                            }
                        }
                        Collection V0 = gt0.V0(arrayList5, arrayList10);
                        final hn6 hn6Var = (hn6) obj2;
                        try {
                            int i10 = mz5.c[gn6Var.ordinal()];
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        final su0 su0Var2 = new su0(hn6.ASCENDING, 3);
                                        su0Var = new Comparator() { // from class: az5
                                            @Override // java.util.Comparator
                                            public final int compare(Object obj16, Object obj17) {
                                                int compareTo;
                                                int c2;
                                                int i11 = r3;
                                                su0 su0Var3 = su0Var2;
                                                hn6 hn6Var2 = hn6Var;
                                                pq5 pq5Var4 = (pq5) obj16;
                                                pq5 pq5Var5 = (pq5) obj17;
                                                switch (i11) {
                                                    case 0:
                                                        xh5 xh5Var3 = tz5.L;
                                                        pq5Var4.getClass();
                                                        pq5Var5.getClass();
                                                        Date date = pq5Var4.g;
                                                        Date date2 = pq5Var5.g;
                                                        if (date == null && date2 == null) {
                                                            compareTo = 0;
                                                        } else if (date == null) {
                                                            compareTo = 1;
                                                        } else if (date2 == null) {
                                                            compareTo = -1;
                                                        } else if (hn6Var2 == hn6.ASCENDING) {
                                                            compareTo = date.compareTo(date2);
                                                        } else {
                                                            compareTo = date2.compareTo(date);
                                                        }
                                                        if (compareTo == 0) {
                                                            return su0Var3.compare(pq5Var4, pq5Var5);
                                                        }
                                                        return compareTo;
                                                    default:
                                                        xh5 xh5Var4 = tz5.L;
                                                        if (hn6Var2 == hn6.ASCENDING) {
                                                            c2 = oq1.c(pq5Var4.j, pq5Var5.j);
                                                        } else {
                                                            c2 = oq1.c(pq5Var5.j, pq5Var4.j);
                                                        }
                                                        if (c2 == 0) {
                                                            return su0Var3.compare(pq5Var4, pq5Var5);
                                                        }
                                                        return c2;
                                                }
                                            }
                                        };
                                    } else {
                                        throw new RuntimeException();
                                    }
                                } else {
                                    final su0 su0Var3 = new su0(hn6.ASCENDING, 3);
                                    su0Var = new Comparator() { // from class: az5
                                        @Override // java.util.Comparator
                                        public final int compare(Object obj16, Object obj17) {
                                            int compareTo;
                                            int c2;
                                            int i11 = r3;
                                            su0 su0Var32 = su0Var3;
                                            hn6 hn6Var2 = hn6Var;
                                            pq5 pq5Var4 = (pq5) obj16;
                                            pq5 pq5Var5 = (pq5) obj17;
                                            switch (i11) {
                                                case 0:
                                                    xh5 xh5Var3 = tz5.L;
                                                    pq5Var4.getClass();
                                                    pq5Var5.getClass();
                                                    Date date = pq5Var4.g;
                                                    Date date2 = pq5Var5.g;
                                                    if (date == null && date2 == null) {
                                                        compareTo = 0;
                                                    } else if (date == null) {
                                                        compareTo = 1;
                                                    } else if (date2 == null) {
                                                        compareTo = -1;
                                                    } else if (hn6Var2 == hn6.ASCENDING) {
                                                        compareTo = date.compareTo(date2);
                                                    } else {
                                                        compareTo = date2.compareTo(date);
                                                    }
                                                    if (compareTo == 0) {
                                                        return su0Var32.compare(pq5Var4, pq5Var5);
                                                    }
                                                    return compareTo;
                                                default:
                                                    xh5 xh5Var4 = tz5.L;
                                                    if (hn6Var2 == hn6.ASCENDING) {
                                                        c2 = oq1.c(pq5Var4.j, pq5Var5.j);
                                                    } else {
                                                        c2 = oq1.c(pq5Var5.j, pq5Var4.j);
                                                    }
                                                    if (c2 == 0) {
                                                        return su0Var32.compare(pq5Var4, pq5Var5);
                                                    }
                                                    return c2;
                                            }
                                        }
                                    };
                                }
                            } else {
                                su0Var = new su0(hn6Var, 3);
                            }
                            em5Var = gt0.d1(V0, new su0(new z5(su0Var, 27), 2));
                        } catch (Throwable th) {
                            em5Var = new em5(th);
                        }
                        if (hm5.a(em5Var) == null) {
                            V0 = em5Var;
                        }
                        return new vr4((List) V0, gn6Var);
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v70(Object obj, Object obj2, Object obj3, Object obj4, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
        this.e0 = obj3;
        this.f0 = obj4;
    }
}
