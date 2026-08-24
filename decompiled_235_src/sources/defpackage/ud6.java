package defpackage;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ud6  reason: default package */
/* loaded from: classes.dex */
public final class ud6 {
    public final td6 a;
    public final Object b;

    public ud6(td6 td6Var, final Object obj) {
        this.a = td6Var;
        this.b = obj;
        if (obj != null && !Stream.of((Object[]) ((j0) us0.a.get(td6Var)).a).anyMatch(new Predicate() { // from class: i0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return ((Class) obj2).isInstance(obj);
            }
        })) {
            StringBuilder sb = new StringBuilder("The ");
            sb.append(td6Var);
            fa6.g(sb, " method doesn't support options of type ", obj.getClass());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ud6.class == obj.getClass()) {
            ud6 ud6Var = (ud6) obj;
            if (Objects.equals(this.a, ud6Var.a) && Objects.equals(this.b, ud6Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        td6 td6Var = this.a;
        if (td6Var == null) {
            return 0;
        }
        return td6Var.hashCode();
    }
}
