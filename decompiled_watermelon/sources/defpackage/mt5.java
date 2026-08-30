package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mt5  reason: default package */
/* loaded from: classes.dex */
public final class mt5 implements lt5 {
    public final mi2 A;
    public final d24 B;
    public d24 L;

    public mt5(Map map, mi2 mi2Var) {
        d24 d24Var;
        this.A = mi2Var;
        if (map != null && !map.isEmpty()) {
            d24Var = new d24(map.size());
            for (Map.Entry entry : map.entrySet()) {
                d24Var.m(entry.getKey(), entry.getValue());
            }
        } else {
            d24Var = null;
        }
        this.B = d24Var;
    }

    @Override // defpackage.lt5
    public final n85 a(String str, ki2 ki2Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!iq2.v(str.charAt(i))) {
                d24 d24Var = this.L;
                if (d24Var == null) {
                    long[] jArr = wu5.a;
                    d24Var = new d24();
                    this.L = d24Var;
                }
                Object g = d24Var.g(str);
                if (g == null) {
                    g = new ArrayList();
                    d24Var.m(str, g);
                }
                ((List) g).add(ki2Var);
                return new n85(d24Var, str, ki2Var, 2);
            }
        }
        i.i("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.lt5
    public final boolean c(Object obj) {
        return ((Boolean) this.A.n(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    @Override // defpackage.lt5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map d() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt5.d():java.util.Map");
    }

    @Override // defpackage.lt5
    public final Object e(String str) {
        List list;
        d24 d24Var = this.B;
        if (d24Var != null) {
            list = (List) d24Var.k(str);
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && d24Var != null) {
            List subList = list.subList(1, list.size());
            int f = d24Var.f(str);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = d24Var.c;
            Object obj = objArr[f];
            d24Var.b[f] = str;
            objArr[f] = subList;
            List list2 = (List) obj;
        }
        return list.get(0);
    }
}
