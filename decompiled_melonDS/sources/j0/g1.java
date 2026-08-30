package j0;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g1 extends i1 {
    public static final q0 R = q0.OPTIONAL;

    /* JADX WARN: Type inference failed for: r0v0, types: [j0.i1, j0.g1] */
    public static g1 b() {
        return new i1(new TreeMap(i1.B));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [j0.i1, j0.g1] */
    public static g1 c(r0 r0Var) {
        TreeMap treeMap = new TreeMap(i1.B);
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

    public final void j(g gVar, q0 q0Var, Object obj) {
        q0 q0Var2;
        TreeMap treeMap = this.A;
        Map map = (Map) treeMap.get(gVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(gVar, arrayMap);
            arrayMap.put(q0Var, obj);
            return;
        }
        q0 q0Var3 = (q0) Collections.min(map.keySet());
        if (!Objects.equals(map.get(q0Var3), obj) && q0Var3 == (q0Var2 = q0.REQUIRED) && q0Var == q0Var2) {
            StringBuilder sb2 = new StringBuilder("Option values conflicts: ");
            sb2.append(gVar.f7200a);
            sb2.append(", existing value (");
            sb2.append(q0Var3);
            Object obj2 = map.get(q0Var3);
            sb2.append(")=");
            sb2.append(obj2);
            sb2.append(", conflicting (");
            sb2.append(q0Var);
            sb2.append(")=");
            sb2.append(obj);
            throw new IllegalArgumentException(sb2.toString());
        }
        map.put(q0Var, obj);
    }

    public final void o(g gVar, Object obj) {
        j(gVar, R, obj);
    }
}
