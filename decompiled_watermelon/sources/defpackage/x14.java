package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x14  reason: default package */
/* loaded from: classes.dex */
public final class x14 extends ef4 {
    public static final bw0 R = bw0.OPTIONAL;

    /* JADX WARN: Type inference failed for: r0v0, types: [ef4, x14] */
    public static x14 f() {
        return new ef4(new TreeMap(ef4.B));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [ef4, x14] */
    public static x14 j(cw0 cw0Var) {
        TreeMap treeMap = new TreeMap(ef4.B);
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

    public final void m(uw uwVar, bw0 bw0Var, Object obj) {
        bw0 bw0Var2;
        TreeMap treeMap = this.A;
        Map map = (Map) treeMap.get(uwVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(uwVar, arrayMap);
            arrayMap.put(bw0Var, obj);
            return;
        }
        bw0 bw0Var3 = (bw0) Collections.min(map.keySet());
        if (!Objects.equals(map.get(bw0Var3), obj) && bw0Var3 == (bw0Var2 = bw0.REQUIRED) && bw0Var == bw0Var2) {
            StringBuilder sb = new StringBuilder("Option values conflicts: ");
            sb.append(uwVar.a);
            sb.append(", existing value (");
            sb.append(bw0Var3);
            Object obj2 = map.get(bw0Var3);
            sb.append(")=");
            sb.append(obj2);
            sb.append(", conflicting (");
            sb.append(bw0Var);
            sb.append(")=");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString());
        }
        map.put(bw0Var, obj);
    }

    public final void r(uw uwVar, Object obj) {
        m(uwVar, R, obj);
    }

    public final void s(uw uwVar) {
        this.A.remove(uwVar);
    }
}
