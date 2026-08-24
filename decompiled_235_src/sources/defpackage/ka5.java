package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ka5  reason: default package */
/* loaded from: classes.dex */
public final class ka5 {
    public final ea5 a;
    public final List b;

    public ka5(ea5 ea5Var, List list) {
        this.a = ea5Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ka5) {
                ka5 ka5Var = (ka5) obj;
                if (!this.a.equals(ka5Var.a) || !this.b.equals(ka5Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RAGameWithSetsEntity(game=" + this.a + ", sets=" + this.b + ")";
    }
}
