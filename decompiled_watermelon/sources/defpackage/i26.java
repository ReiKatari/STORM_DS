package defpackage;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i26  reason: default package */
/* loaded from: classes.dex */
public final class i26 {
    public final h26 a;
    public final Object b;

    public i26(h26 h26Var, final Object obj) {
        this.a = h26Var;
        this.b = obj;
        if (obj != null && !Stream.of((Object[]) ((i0) hq0.a.get(h26Var)).a).anyMatch(new Predicate() { // from class: h0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return ((Class) obj2).isInstance(obj);
            }
        })) {
            StringBuilder sb = new StringBuilder("The ");
            sb.append(h26Var);
            vd6.h(sb, " method doesn't support options of type ", obj.getClass());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i26.class == obj.getClass()) {
            i26 i26Var = (i26) obj;
            if (Objects.equals(this.a, i26Var.a) && Objects.equals(this.b, i26Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        h26 h26Var = this.a;
        if (h26Var == null) {
            return 0;
        }
        return h26Var.hashCode();
    }
}
