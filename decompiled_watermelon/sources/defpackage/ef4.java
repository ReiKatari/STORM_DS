package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ef4  reason: default package */
/* loaded from: classes.dex */
public class ef4 implements cw0 {
    public static final pj B;
    public static final ef4 L;
    public final TreeMap A;

    static {
        pj pjVar = new pj(7);
        B = pjVar;
        L = new ef4(new TreeMap(pjVar));
    }

    public ef4(TreeMap treeMap) {
        this.A = treeMap;
    }

    public static ef4 b(cw0 cw0Var) {
        if (ef4.class.equals(cw0Var.getClass())) {
            return (ef4) cw0Var;
        }
        TreeMap treeMap = new TreeMap(B);
        for (uw uwVar : cw0Var.e()) {
            Set<bw0> h = cw0Var.h(uwVar);
            ArrayMap arrayMap = new ArrayMap();
            for (bw0 bw0Var : h) {
                arrayMap.put(bw0Var, cw0Var.i(uwVar, bw0Var));
            }
            treeMap.put(uwVar, arrayMap);
        }
        return new ef4(treeMap);
    }

    @Override // defpackage.cw0
    public final boolean a(uw uwVar) {
        return this.A.containsKey(uwVar);
    }

    @Override // defpackage.cw0
    public final bw0 c(uw uwVar) {
        Map map = (Map) this.A.get(uwVar);
        if (map != null) {
            return (bw0) Collections.min(map.keySet());
        }
        f81.x(uwVar, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.cw0
    public final Object d(uw uwVar, Object obj) {
        Map map = (Map) this.A.get(uwVar);
        if (map == null) {
            return obj;
        }
        return map.get((bw0) Collections.min(map.keySet()));
    }

    @Override // defpackage.cw0
    public final Set e() {
        return Collections.unmodifiableSet(this.A.keySet());
    }

    @Override // defpackage.cw0
    public final Object g(uw uwVar) {
        Map map = (Map) this.A.get(uwVar);
        if (map != null) {
            return map.get((bw0) Collections.min(map.keySet()));
        }
        f81.x(uwVar, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.cw0
    public final Set h(uw uwVar) {
        Map map = (Map) this.A.get(uwVar);
        if (map == null) {
            return Collections.EMPTY_SET;
        }
        return Collections.unmodifiableSet(map.keySet());
    }

    @Override // defpackage.cw0
    public final Object i(uw uwVar, bw0 bw0Var) {
        Map map = (Map) this.A.get(uwVar);
        if (map != null) {
            if (map.containsKey(bw0Var)) {
                return map.get(bw0Var);
            }
            vd6.g("Option does not exist: ", uwVar, " with priority=", bw0Var);
            return null;
        }
        f81.x(uwVar, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.cw0
    public final void k(hi0 hi0Var) {
        for (Map.Entry entry : this.A.tailMap(new uw("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (((uw) entry.getKey()).a.startsWith("camera2.captureRequest.option.")) {
                uw uwVar = (uw) entry.getKey();
                cw0 cw0Var = (cw0) hi0Var.L;
                uwVar.getClass();
                ((bb0) hi0Var.B).B.m(uwVar, cw0Var.c(uwVar), cw0Var.g(uwVar));
            } else {
                return;
            }
        }
    }
}
