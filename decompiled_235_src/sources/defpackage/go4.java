package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: go4  reason: default package */
/* loaded from: classes.dex */
public class go4 implements yy0 {
    public static final bk B;
    public static final go4 L;
    public final TreeMap A;

    static {
        bk bkVar = new bk(7);
        B = bkVar;
        L = new go4(new TreeMap(bkVar));
    }

    public go4(TreeMap treeMap) {
        this.A = treeMap;
    }

    public static go4 a(yy0 yy0Var) {
        if (go4.class.equals(yy0Var.getClass())) {
            return (go4) yy0Var;
        }
        TreeMap treeMap = new TreeMap(B);
        for (xx xxVar : yy0Var.c()) {
            Set<xy0> f = yy0Var.f(xxVar);
            ArrayMap arrayMap = new ArrayMap();
            for (xy0 xy0Var : f) {
                arrayMap.put(xy0Var, yy0Var.g(xxVar, xy0Var));
            }
            treeMap.put(xxVar, arrayMap);
        }
        return new go4(treeMap);
    }

    @Override // defpackage.yy0
    public final Object b(xx xxVar, Object obj) {
        Map map = (Map) this.A.get(xxVar);
        if (map == null) {
            return obj;
        }
        return map.get((xy0) Collections.min(map.keySet()));
    }

    @Override // defpackage.yy0
    public final Set c() {
        return Collections.unmodifiableSet(this.A.keySet());
    }

    @Override // defpackage.yy0
    public final Object e(xx xxVar) {
        Map map = (Map) this.A.get(xxVar);
        if (map != null) {
            return map.get((xy0) Collections.min(map.keySet()));
        }
        e41.w(xxVar, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.yy0
    public final Set f(xx xxVar) {
        Map map = (Map) this.A.get(xxVar);
        if (map == null) {
            return Collections.EMPTY_SET;
        }
        return Collections.unmodifiableSet(map.keySet());
    }

    @Override // defpackage.yy0
    public final Object g(xx xxVar, xy0 xy0Var) {
        Map map = (Map) this.A.get(xxVar);
        if (map != null) {
            if (map.containsKey(xy0Var)) {
                return map.get(xy0Var);
            }
            fa6.f("Option does not exist: ", xxVar, " with priority=", xy0Var);
            return null;
        }
        e41.w(xxVar, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.yy0
    public final void h(pk0 pk0Var) {
        for (Map.Entry entry : this.A.tailMap(new xx("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (((xx) entry.getKey()).a.startsWith("camera2.captureRequest.option.")) {
                xx xxVar = (xx) entry.getKey();
                yy0 yy0Var = (yy0) pk0Var.L;
                xxVar.getClass();
                ((jd0) pk0Var.B).B.l(xxVar, yy0Var.j(xxVar), yy0Var.e(xxVar));
            } else {
                return;
            }
        }
    }

    @Override // defpackage.yy0
    public final boolean i(xx xxVar) {
        return this.A.containsKey(xxVar);
    }

    @Override // defpackage.yy0
    public final xy0 j(xx xxVar) {
        Map map = (Map) this.A.get(xxVar);
        if (map != null) {
            return (xy0) Collections.min(map.keySet());
        }
        e41.w(xxVar, "Option does not exist: ");
        return null;
    }
}
