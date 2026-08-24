package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: da4  reason: default package */
/* loaded from: classes.dex */
public final class da4 extends go4 {
    public static final xy0 R = xy0.OPTIONAL;

    /* JADX WARN: Type inference failed for: r0v0, types: [da4, go4] */
    public static da4 d() {
        return new go4(new TreeMap(go4.B));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [da4, go4] */
    public static da4 k(yy0 yy0Var) {
        TreeMap treeMap = new TreeMap(go4.B);
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

    public final void l(xx xxVar, xy0 xy0Var, Object obj) {
        xy0 xy0Var2;
        TreeMap treeMap = this.A;
        Map map = (Map) treeMap.get(xxVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(xxVar, arrayMap);
            arrayMap.put(xy0Var, obj);
            return;
        }
        xy0 xy0Var3 = (xy0) Collections.min(map.keySet());
        if (!Objects.equals(map.get(xy0Var3), obj) && xy0Var3 == (xy0Var2 = xy0.REQUIRED) && xy0Var == xy0Var2) {
            StringBuilder sb = new StringBuilder("Option values conflicts: ");
            sb.append(xxVar.a);
            sb.append(", existing value (");
            sb.append(xy0Var3);
            Object obj2 = map.get(xy0Var3);
            sb.append(")=");
            sb.append(obj2);
            sb.append(", conflicting (");
            sb.append(xy0Var);
            sb.append(")=");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString());
        }
        map.put(xy0Var, obj);
    }

    public final void m(xx xxVar, Object obj) {
        l(xxVar, R, obj);
    }

    public final void n(xx xxVar) {
        this.A.remove(xxVar);
    }
}
