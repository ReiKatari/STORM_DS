package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cy  reason: default package */
/* loaded from: classes.dex */
public final class cy {
    public final qv6 a;
    public final qv6 b;
    public final ArrayList c;

    public cy(qv6 qv6Var, qv6 qv6Var2, ArrayList arrayList) {
        if (qv6Var != null) {
            this.a = qv6Var;
            if (qv6Var2 != null) {
                this.b = qv6Var2;
                this.c = arrayList;
                return;
            }
            u34.x("Null secondarySurfaceEdge");
            throw null;
        }
        u34.x("Null primarySurfaceEdge");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof cy) {
                cy cyVar = (cy) obj;
                if (this.a.equals(cyVar.a) && this.b.equals(cyVar.b) && this.c.equals(cyVar.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.a + ", secondarySurfaceEdge=" + this.b + ", outConfigs=" + this.c + "}";
    }
}
