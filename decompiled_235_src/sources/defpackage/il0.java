package defpackage;

import java.util.ArrayList;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: il0  reason: default package */
/* loaded from: classes.dex */
public final class il0 {
    public static final il0 c = new il0(gt0.p1(new ArrayList()), null);
    public final Set a;
    public final q60 b;

    public il0(Set set, q60 q60Var) {
        this.a = set;
        this.b = q60Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof il0) {
            il0 il0Var = (il0) obj;
            if (il0Var.a.equals(this.a) && nb3.k(il0Var.b, this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() + 1517) * 41;
        q60 q60Var = this.b;
        if (q60Var != null) {
            i = q60Var.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
