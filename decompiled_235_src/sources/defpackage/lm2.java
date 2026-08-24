package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lm2  reason: default package */
/* loaded from: classes.dex */
public final class lm2 implements AutoCloseable, jk5 {
    public final jr6 A;
    public final km2 B;
    public final fp4 L = new fp4(ip4.b);
    public final LinkedHashMap R;
    public final Set X;
    public final e41 Y;

    /* JADX WARN: Type inference failed for: r5v5, types: [e41, java.lang.Object] */
    public lm2(jr6 jr6Var, km2 km2Var) {
        this.A = jr6Var;
        this.B = km2Var;
        p04 p04Var = jr6Var.X;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c14.k0(p04Var.e0));
        Iterator it = p04Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            int i = ((kr6) entry.getKey()).a;
            t23 t23Var = (t23) entry.getValue();
            if (jr6Var.e(i) == null) {
                i.m("Required value was null.");
                throw null;
            } else {
                jr6Var.h(i).getClass();
                throw null;
            }
        }
        this.R = linkedHashMap;
        Set<kr6> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(ht0.v0(keySet, 10));
        for (kr6 kr6Var : keySet) {
            ki0 e = this.A.e(kr6Var.a);
            if (e != null) {
                arrayList.add(e);
            } else {
                i.m("Required value was null.");
                throw null;
            }
        }
        this.X = gt0.p1(arrayList);
        this.Y = new Object();
    }

    @Override // defpackage.jk5
    public final void F(yk5 yk5Var, long j, wk5 wk5Var) {
        this.L.h(j, new mp4(10));
        if (!wk5Var.r()) {
            for (kr6 kr6Var : yk5Var.x().keySet()) {
                Map map = (Map) this.R.get(new kr6(kr6Var.a));
                if (map != null) {
                    for (fp4 fp4Var : map.values()) {
                        fp4Var.e(j);
                    }
                }
            }
        }
    }

    @Override // defpackage.jk5
    public final void J(yk5 yk5Var, long j, th thVar) {
        this.L.h(j, thVar);
    }

    @Override // defpackage.jk5
    public final void N(kk5 kk5Var) {
        kk5Var.getClass();
        this.B.e(kk5Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.B.close();
        this.L.close();
        for (Map map : this.R.values()) {
            for (fp4 fp4Var : map.values()) {
                fp4Var.close();
            }
        }
    }

    @Override // defpackage.jk5
    public final void e(yk5 yk5Var, long j, int i, int i2) {
        Map map = (Map) this.R.get(new kr6(i));
        if (map != null) {
            if (this.A.h(i) != null) {
                if (map.containsKey(new gp4(i2))) {
                    for (fp4 fp4Var : map.values()) {
                        fp4Var.e(j);
                    }
                    return;
                }
                i.m("Check failed.");
                return;
            }
            i.m("Required value was null.");
        }
    }

    @Override // defpackage.jk5
    public final void u(yk5 yk5Var, long j, long j2) {
        yk5Var.getClass();
        tm2 tm2Var = new tm2(yk5Var, j, j2, this.X);
        this.L.k(j, j2, j, tm2Var.d);
        kw3 kw3Var = tm2Var.e;
        int a = kw3Var.a();
        for (int i = 0; i < a; i++) {
            qm2 qm2Var = (qm2) kw3Var.get(i);
            Object obj = this.R.get(new kr6(qm2Var.c));
            if (obj != null) {
                Object obj2 = ((Map) obj).get(new gp4(qm2Var.d));
                if (obj2 != null) {
                    fp4 fp4Var = (fp4) obj2;
                    fp4Var.k(j, j2, j2, qm2Var);
                    if (!yk5Var.x().keySet().contains(new kr6(qm2Var.c))) {
                        fp4Var.e(tm2Var.a);
                    }
                } else {
                    i.m("Required value was null.");
                    return;
                }
            } else {
                i.m("Required value was null.");
                return;
            }
        }
        mm2 mm2Var = new mm2(tm2Var);
        this.Y.getClass();
        if (!yk5Var.J()) {
            this.B.e(yk5Var.c0());
        }
        mm2Var.e();
    }
}
