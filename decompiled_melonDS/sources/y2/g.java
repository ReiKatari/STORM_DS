package y2;

import a1.m0;
import a1.u0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import mc.l;
import p1.c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements f {
    public final l A;
    public final m0 B;
    public m0 L;

    public g(Map map, l lVar) {
        m0 m0Var;
        this.A = lVar;
        if (map != null && !map.isEmpty()) {
            m0Var = new m0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                m0Var.m(entry.getKey(), entry.getValue());
            }
        } else {
            m0Var = null;
        }
        this.B = m0Var;
    }

    @Override // y2.f
    public final boolean b(Object obj) {
        return ((Boolean) this.A.k(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    @Override // y2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map c() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.g.c():java.util.Map");
    }

    @Override // y2.f
    public final Object d(String str) {
        List list;
        m0 m0Var = this.B;
        if (m0Var != null) {
            list = (List) m0Var.k(str);
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && m0Var != null) {
            List subList = list.subList(1, list.size());
            int f8 = m0Var.f(str);
            if (f8 < 0) {
                f8 = ~f8;
            }
            Object[] objArr = m0Var.f69c;
            Object obj = objArr[f8];
            m0Var.f68b[f8] = str;
            objArr[f8] = subList;
            List list2 = (List) obj;
        }
        return list.get(0);
    }

    @Override // y2.f
    public final c1 f(String str, mc.a aVar) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!p7.k.s(str.charAt(i2))) {
                m0 m0Var = this.L;
                if (m0Var == null) {
                    long[] jArr = u0.f103a;
                    m0Var = new m0();
                    this.L = m0Var;
                }
                Object g10 = m0Var.g(str);
                if (g10 == null) {
                    g10 = new ArrayList();
                    m0Var.m(str, g10);
                }
                ((List) g10).add(aVar);
                return new c1(m0Var, str, aVar);
            }
        }
        a0.j.h("Registered key is empty or blank");
        return null;
    }
}
