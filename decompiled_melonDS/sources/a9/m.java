package a9;

import g2.z1;
import java.util.Iterator;
import java.util.List;
import p8.v;
import q8.r;
import x8.p;
import x8.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final String f676a = v.g("DiagnosticsWrkr");

    public static final String a(x8.k kVar, w wVar, x8.h hVar, List list) {
        Integer num;
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            x8.i k10 = p7.l.k(pVar);
            String str = pVar.f14420a;
            hVar.getClass();
            String str2 = k10.f14391a;
            int i2 = k10.f14392b;
            str2.getClass();
            x8.f fVar = (x8.f) r.K(hVar.f14389a, true, false, new x8.g(str2, i2, 0));
            if (fVar != null) {
                num = Integer.valueOf(fVar.f14388c);
            } else {
                num = null;
            }
            kVar.getClass();
            str.getClass();
            String Y = zb.l.Y((List) r.K(kVar.f14395a, true, false, new z1(str, 10)), ",", null, null, null, 62);
            wVar.getClass();
            String Y2 = zb.l.Y((List) r.K(wVar.f14448a, true, false, new z1(str, 22)), ",", null, null, null, 62);
            StringBuilder u4 = w.d.u("\n", str, "\t ");
            u4.append(pVar.f14422c);
            u4.append("\t ");
            u4.append(num);
            u4.append("\t ");
            u4.append(pVar.f14421b.name());
            u4.append("\t ");
            u4.append(Y);
            u4.append("\t ");
            u4.append(Y2);
            u4.append('\t');
            sb2.append(u4.toString());
        }
        return sb2.toString();
    }
}
