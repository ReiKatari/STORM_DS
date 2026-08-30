package j0;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class i1 implements r0 {
    public static final a4.e0 B;
    public static final i1 L;
    public final TreeMap A;

    static {
        a4.e0 e0Var = new a4.e0(5);
        B = e0Var;
        L = new i1(new TreeMap(e0Var));
    }

    public i1(TreeMap treeMap) {
        this.A = treeMap;
    }

    public static i1 a(r0 r0Var) {
        if (i1.class.equals(r0Var.getClass())) {
            return (i1) r0Var;
        }
        TreeMap treeMap = new TreeMap(B);
        for (g gVar : r0Var.f()) {
            Set<q0> k10 = r0Var.k(gVar);
            ArrayMap arrayMap = new ArrayMap();
            for (q0 q0Var : k10) {
                arrayMap.put(q0Var, r0Var.l(gVar, q0Var));
            }
            treeMap.put(gVar, arrayMap);
        }
        return new i1(treeMap);
    }

    @Override // j0.r0
    public final q0 d(g gVar) {
        Map map = (Map) this.A.get(gVar);
        if (map != null) {
            return (q0) Collections.min(map.keySet());
        }
        fj.j.r(gVar, "Option does not exist: ");
        return null;
    }

    @Override // j0.r0
    public final boolean e(g gVar) {
        return this.A.containsKey(gVar);
    }

    @Override // j0.r0
    public final Set f() {
        return Collections.unmodifiableSet(this.A.keySet());
    }

    @Override // j0.r0
    public final Object g(g gVar) {
        Map map = (Map) this.A.get(gVar);
        if (map != null) {
            return map.get((q0) Collections.min(map.keySet()));
        }
        fj.j.r(gVar, "Option does not exist: ");
        return null;
    }

    @Override // j0.r0
    public final Object h(g gVar, Object obj) {
        Map map = (Map) this.A.get(gVar);
        if (map == null) {
            return obj;
        }
        return map.get((q0) Collections.min(map.keySet()));
    }

    @Override // j0.r0
    public final void i(bi.h hVar) {
        for (Map.Entry entry : this.A.tailMap(new g("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (((g) entry.getKey()).f7200a.startsWith("camera2.captureRequest.option.")) {
                g gVar = (g) entry.getKey();
                r0 r0Var = (r0) hVar.L;
                ((c0.f) hVar.B).f2374b.j(gVar, r0Var.d(gVar), r0Var.g(gVar));
            } else {
                return;
            }
        }
    }

    @Override // j0.r0
    public final Set k(g gVar) {
        Map map = (Map) this.A.get(gVar);
        if (map == null) {
            return Collections.EMPTY_SET;
        }
        return Collections.unmodifiableSet(map.keySet());
    }

    @Override // j0.r0
    public final Object l(g gVar, q0 q0Var) {
        Map map = (Map) this.A.get(gVar);
        if (map != null) {
            if (map.containsKey(q0Var)) {
                return map.get(q0Var);
            }
            fj.j.s("Option does not exist: ", gVar, " with priority=", q0Var);
            return null;
        }
        fj.j.r(gVar, "Option does not exist: ");
        return null;
    }
}
