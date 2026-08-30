package defpackage;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ck2  reason: default package */
/* loaded from: classes.dex */
public final class ck2 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static final t05 a(bk2 bk2Var) {
        long j;
        pp1 pp1Var;
        gy4 gy4Var;
        int i;
        cy4 cy4Var;
        Integer o0;
        bk2Var.getClass();
        long j2 = bk2Var.a;
        String str = bk2Var.b;
        URL url = new URI(bk2Var.c).toURL();
        url.getClass();
        String str2 = bk2Var.e;
        List list = bk2Var.f;
        if (list != null) {
            int i2 = 10;
            ArrayList arrayList = new ArrayList(uq0.y0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b6 b6Var = (b6) it.next();
                long j3 = b6Var.d;
                long j4 = b6Var.c;
                String str3 = b6Var.a;
                String str4 = b6Var.b;
                switch (str4.hashCode()) {
                    case -1694759682:
                        if (str4.equals("specialty")) {
                            gy4Var = gy4.Specialty;
                            break;
                        }
                        gy4Var = gy4.Bonus;
                        break;
                    case 3059615:
                        if (str4.equals("core")) {
                            gy4Var = gy4.Core;
                            break;
                        }
                        gy4Var = gy4.Bonus;
                        break;
                    case 93921311:
                        if (str4.equals("bonus")) {
                            gy4Var = gy4.Bonus;
                            break;
                        }
                        gy4Var = gy4.Bonus;
                        break;
                    case 1402633315:
                        if (str4.equals("challenge")) {
                            gy4Var = gy4.Challenge;
                            break;
                        }
                        gy4Var = gy4.Bonus;
                        break;
                    case 1686617758:
                        if (str4.equals("exclusive")) {
                            gy4Var = gy4.Exclusive;
                            break;
                        }
                        gy4Var = gy4.Bonus;
                        break;
                    default:
                        gy4Var = gy4.Bonus;
                        break;
                }
                gy4 gy4Var2 = gy4Var;
                URL url2 = new URI(b6Var.e).toURL();
                url2.getClass();
                List list2 = b6Var.f;
                Iterator it2 = it;
                ArrayList arrayList2 = new ArrayList(uq0.y0(list2, i2));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    g3 g3Var = (g3) it3.next();
                    g3Var.getClass();
                    String str5 = str3;
                    b6 b6Var2 = b6Var;
                    long j5 = g3Var.a;
                    Iterator it4 = it3;
                    Integer num = g3Var.b;
                    Integer num2 = g3Var.c;
                    String str6 = g3Var.d;
                    String str7 = g3Var.e;
                    int i3 = g3Var.f;
                    String str8 = g3Var.j;
                    if (str8 != null && (o0 = gh6.o0(str8)) != null) {
                        i = o0.intValue();
                    } else {
                        i = 0;
                    }
                    int i4 = i;
                    long j6 = j2;
                    URL url3 = new URI(g3Var.h).toURL();
                    url3.getClass();
                    URL url4 = new URI(g3Var.i).toURL();
                    url4.getClass();
                    String str9 = g3Var.k;
                    if (g3Var.g == 3) {
                        cy4Var = cy4.CORE;
                    } else {
                        cy4Var = cy4.UNOFFICIAL;
                    }
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(new dy4(j5, j3, j4, num, num2, str6, str7, i3, i4, url3, url4, str9, cy4Var));
                    str3 = str5;
                    arrayList2 = arrayList3;
                    b6Var = b6Var2;
                    it3 = it4;
                    j2 = j6;
                }
                long j7 = j2;
                String str10 = str3;
                ArrayList arrayList4 = arrayList2;
                List<ml3> list3 = b6Var.g;
                ArrayList arrayList5 = new ArrayList(uq0.y0(list3, 10));
                for (ml3 ml3Var : list3) {
                    ml3Var.getClass();
                    arrayList5.add(new j15(ml3Var.a, j3, j4, ml3Var.b, ml3Var.c, ml3Var.d, ml3Var.e, ml3Var.f, ml3Var.g));
                    str10 = str10;
                }
                arrayList.add(new hy4(j4, j3, gy4Var2, str10, url2, arrayList4, arrayList5));
                it = it2;
                j2 = j7;
                i2 = 10;
            }
            j = j2;
            pp1Var = arrayList;
        } else {
            j = j2;
            pp1Var = null;
        }
        if (pp1Var == null) {
            pp1Var = pp1.A;
        }
        return new t05(j, str, url, str2, pp1Var);
    }
}
