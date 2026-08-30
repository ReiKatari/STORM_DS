package mi;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import li.d;
import oi.f;
import oi.h;
import vc.o;
import zb.m;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static final f a(d dVar) {
        long j2;
        q qVar;
        oi.c cVar;
        int i2;
        oi.a aVar;
        Integer W;
        dVar.getClass();
        long j10 = dVar.f9134a;
        String str = dVar.f9135b;
        URL url = new URI(dVar.f9136c).toURL();
        url.getClass();
        String str2 = dVar.f9138e;
        List list = dVar.f9139f;
        if (list != null) {
            int i10 = 10;
            ArrayList arrayList = new ArrayList(m.G(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                li.b bVar = (li.b) it.next();
                long j11 = bVar.f9122d;
                long j12 = bVar.f9121c;
                String str3 = bVar.f9119a;
                String str4 = bVar.f9120b;
                switch (str4.hashCode()) {
                    case -1694759682:
                        if (str4.equals("specialty")) {
                            cVar = oi.c.Specialty;
                            break;
                        }
                        cVar = oi.c.Bonus;
                        break;
                    case 3059615:
                        if (str4.equals("core")) {
                            cVar = oi.c.Core;
                            break;
                        }
                        cVar = oi.c.Bonus;
                        break;
                    case 93921311:
                        if (str4.equals("bonus")) {
                            cVar = oi.c.Bonus;
                            break;
                        }
                        cVar = oi.c.Bonus;
                        break;
                    case 1402633315:
                        if (str4.equals("challenge")) {
                            cVar = oi.c.Challenge;
                            break;
                        }
                        cVar = oi.c.Bonus;
                        break;
                    case 1686617758:
                        if (str4.equals("exclusive")) {
                            cVar = oi.c.Exclusive;
                            break;
                        }
                        cVar = oi.c.Bonus;
                        break;
                    default:
                        cVar = oi.c.Bonus;
                        break;
                }
                oi.c cVar2 = cVar;
                URL url2 = new URI(bVar.f9123e).toURL();
                url2.getClass();
                List list2 = bVar.f9124f;
                Iterator it2 = it;
                ArrayList arrayList2 = new ArrayList(m.G(list2, i10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    li.a aVar2 = (li.a) it3.next();
                    aVar2.getClass();
                    String str5 = str3;
                    li.b bVar2 = bVar;
                    long j13 = aVar2.f9106a;
                    Iterator it4 = it3;
                    Integer num = aVar2.f9107b;
                    Integer num2 = aVar2.f9108c;
                    String str6 = aVar2.f9109d;
                    String str7 = aVar2.f9110e;
                    int i11 = aVar2.f9111f;
                    String str8 = aVar2.f9115j;
                    if (str8 != null && (W = o.W(str8)) != null) {
                        i2 = W.intValue();
                    } else {
                        i2 = 0;
                    }
                    int i12 = i2;
                    long j14 = j10;
                    URL url3 = new URI(aVar2.f9113h).toURL();
                    url3.getClass();
                    URL url4 = new URI(aVar2.f9114i).toURL();
                    url4.getClass();
                    String str9 = aVar2.f9116k;
                    if (aVar2.f9112g == 3) {
                        aVar = oi.a.CORE;
                    } else {
                        aVar = oi.a.UNOFFICIAL;
                    }
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(new oi.b(j13, j11, j12, num, num2, str6, str7, i11, i12, url3, url4, str9, aVar));
                    str3 = str5;
                    arrayList2 = arrayList3;
                    bVar = bVar2;
                    it3 = it4;
                    j10 = j14;
                }
                long j15 = j10;
                String str10 = str3;
                ArrayList arrayList4 = arrayList2;
                List<li.f> list3 = bVar.f9125g;
                ArrayList arrayList5 = new ArrayList(m.G(list3, 10));
                for (li.f fVar : list3) {
                    fVar.getClass();
                    arrayList5.add(new h(fVar.f9144a, j11, j12, fVar.f9145b, fVar.f9146c, fVar.f9147d, fVar.f9148e, fVar.f9149f, fVar.f9150g));
                    str10 = str10;
                }
                arrayList.add(new oi.d(j12, j11, str10, url2, arrayList4, arrayList5, cVar2));
                it = it2;
                j10 = j15;
                i10 = 10;
            }
            j2 = j10;
            qVar = arrayList;
        } else {
            j2 = j10;
            qVar = null;
        }
        if (qVar == null) {
            qVar = q.A;
        }
        return new f(j2, str, url, str2, qVar);
    }
}
