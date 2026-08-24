package defpackage;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gp2  reason: default package */
/* loaded from: classes.dex */
public final class gp2 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static final da5 a(fp2 fp2Var) {
        long j;
        yt1 yt1Var;
        r75 r75Var;
        int i;
        n75 n75Var;
        Integer h0;
        fp2Var.getClass();
        long j2 = fp2Var.a;
        String str = fp2Var.b;
        URL url = new URI(fp2Var.c).toURL();
        url.getClass();
        String str2 = fp2Var.e;
        List list = fp2Var.f;
        if (list != null) {
            int i2 = 10;
            ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
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
                            r75Var = r75.Specialty;
                            break;
                        }
                        r75Var = r75.Bonus;
                        break;
                    case 3059615:
                        if (str4.equals("core")) {
                            r75Var = r75.Core;
                            break;
                        }
                        r75Var = r75.Bonus;
                        break;
                    case 93921311:
                        if (str4.equals("bonus")) {
                            r75Var = r75.Bonus;
                            break;
                        }
                        r75Var = r75.Bonus;
                        break;
                    case 1402633315:
                        if (str4.equals("challenge")) {
                            r75Var = r75.Challenge;
                            break;
                        }
                        r75Var = r75.Bonus;
                        break;
                    case 1686617758:
                        if (str4.equals("exclusive")) {
                            r75Var = r75.Exclusive;
                            break;
                        }
                        r75Var = r75.Bonus;
                        break;
                    default:
                        r75Var = r75.Bonus;
                        break;
                }
                r75 r75Var2 = r75Var;
                URL url2 = new URI(b6Var.e).toURL();
                url2.getClass();
                List list2 = b6Var.f;
                Iterator it2 = it;
                ArrayList arrayList2 = new ArrayList(ht0.v0(list2, i2));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    i3 i3Var = (i3) it3.next();
                    i3Var.getClass();
                    String str5 = str3;
                    b6 b6Var2 = b6Var;
                    long j5 = i3Var.a;
                    Iterator it4 = it3;
                    Integer num = i3Var.b;
                    Integer num2 = i3Var.c;
                    String str6 = i3Var.d;
                    String str7 = i3Var.e;
                    int i3 = i3Var.f;
                    String str8 = i3Var.j;
                    if (str8 != null && (h0 = xs6.h0(str8)) != null) {
                        i = h0.intValue();
                    } else {
                        i = 0;
                    }
                    int i4 = i;
                    long j6 = j2;
                    URL url3 = new URI(i3Var.h).toURL();
                    url3.getClass();
                    URL url4 = new URI(i3Var.i).toURL();
                    url4.getClass();
                    String str9 = i3Var.k;
                    if (i3Var.g == 3) {
                        n75Var = n75.CORE;
                    } else {
                        n75Var = n75.UNOFFICIAL;
                    }
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(new o75(j5, j3, j4, num, num2, str6, str7, i3, i4, url3, url4, str9, n75Var));
                    str3 = str5;
                    arrayList2 = arrayList3;
                    b6Var = b6Var2;
                    it3 = it4;
                    j2 = j6;
                }
                long j7 = j2;
                String str10 = str3;
                ArrayList arrayList4 = arrayList2;
                List<os3> list3 = b6Var.g;
                ArrayList arrayList5 = new ArrayList(ht0.v0(list3, 10));
                for (os3 os3Var : list3) {
                    os3Var.getClass();
                    arrayList5.add(new ta5(os3Var.a, j3, j4, os3Var.b, os3Var.c, os3Var.d, os3Var.e, os3Var.f, os3Var.g));
                    str10 = str10;
                }
                arrayList.add(new s75(j4, j3, r75Var2, str10, url2, arrayList4, arrayList5));
                it = it2;
                j2 = j7;
                i2 = 10;
            }
            j = j2;
            yt1Var = arrayList;
        } else {
            j = j2;
            yt1Var = null;
        }
        if (yt1Var == null) {
            yt1Var = yt1.A;
        }
        return new da5(j, str, url, str2, yt1Var);
    }
}
