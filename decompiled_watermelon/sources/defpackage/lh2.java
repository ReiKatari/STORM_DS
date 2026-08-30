package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lh2  reason: default package */
/* loaded from: classes.dex */
public final class lh2 implements AutoCloseable, ra5 {
    public final tf6 A;
    public final kh2 B;
    public final cg4 L = new cg4(fg4.b);
    public final LinkedHashMap R;
    public final Set X;
    public final f81 Y;

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, f81] */
    public lh2(tf6 tf6Var, kh2 kh2Var) {
        this.A = tf6Var;
        this.B = kh2Var;
        mt3 mt3Var = tf6Var.X;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zt3.j0(mt3Var.d0));
        Iterator it = mt3Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            int i = ((uf6) entry.getKey()).a;
            pw2 pw2Var = (pw2) entry.getValue();
            if (tf6Var.d(i) == null) {
                i.n("Required value was null.");
                throw null;
            } else {
                tf6Var.i(i).getClass();
                throw null;
            }
        }
        this.R = linkedHashMap;
        Set<uf6> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(uq0.y0(keySet, 10));
        for (uf6 uf6Var : keySet) {
            bg0 d = this.A.d(uf6Var.a);
            if (d != null) {
                arrayList.add(d);
            } else {
                i.n("Required value was null.");
                throw null;
            }
        }
        this.X = tq0.s1(arrayList);
        this.Y = new Object();
    }

    @Override // defpackage.ra5
    public final void F(gb5 gb5Var, long j, long j2) {
        gb5Var.getClass();
        th2 th2Var = new th2(gb5Var, j, j2, this.X);
        this.L.p(j, j2, j, th2Var.d);
        ip3 ip3Var = th2Var.e;
        int b = ip3Var.b();
        for (int i = 0; i < b; i++) {
            qh2 qh2Var = (qh2) ip3Var.get(i);
            Object obj = this.R.get(new uf6(qh2Var.c));
            if (obj != null) {
                Object obj2 = ((Map) obj).get(new dg4(qh2Var.d));
                if (obj2 != null) {
                    cg4 cg4Var = (cg4) obj2;
                    cg4Var.p(j, j2, j2, qh2Var);
                    if (!gb5Var.N().keySet().contains(new uf6(qh2Var.c))) {
                        cg4Var.d(th2Var.a);
                    }
                } else {
                    i.n("Required value was null.");
                    return;
                }
            } else {
                i.n("Required value was null.");
                return;
            }
        }
        mh2 mh2Var = new mh2(th2Var);
        this.Y.getClass();
        if (!gb5Var.f0()) {
            this.B.d(gb5Var.Q());
        }
        mh2Var.d();
    }

    @Override // defpackage.ra5
    public final void J(gb5 gb5Var, long j, eb5 eb5Var) {
        this.L.i(j, new jg4(10));
        if (!eb5Var.I()) {
            for (uf6 uf6Var : gb5Var.N().keySet()) {
                Map map = (Map) this.R.get(new uf6(uf6Var.a));
                if (map != null) {
                    for (cg4 cg4Var : map.values()) {
                        cg4Var.d(j);
                    }
                }
            }
        }
    }

    @Override // defpackage.ra5
    public final void K(gb5 gb5Var, long j, hh hhVar) {
        this.L.i(j, hhVar);
    }

    @Override // defpackage.ra5
    public final void N(sa5 sa5Var) {
        sa5Var.getClass();
        this.B.d(sa5Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.B.close();
        this.L.close();
        for (Map map : this.R.values()) {
            for (cg4 cg4Var : map.values()) {
                cg4Var.close();
            }
        }
    }

    @Override // defpackage.ra5
    public final void p(gb5 gb5Var, long j, int i, int i2) {
        Map map = (Map) this.R.get(new uf6(i));
        if (map != null) {
            if (this.A.i(i) != null) {
                if (map.containsKey(new dg4(i2))) {
                    for (cg4 cg4Var : map.values()) {
                        cg4Var.d(j);
                    }
                    return;
                }
                i.n("Check failed.");
                return;
            }
            i.n("Required value was null.");
        }
    }
}
