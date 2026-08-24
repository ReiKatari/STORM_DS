package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qk0  reason: default package */
/* loaded from: classes.dex */
public final class qk0 implements rk0 {
    public final Map A;
    public final Map B;

    public qk0(Map map, Map map2) {
        this.A = map;
        this.B = map2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qk0) {
                qk0 qk0Var = (qk0) obj;
                if (!this.A.equals(qk0Var.A) || !this.B.equals(qk0Var.B)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.B.hashCode() + (this.A.hashCode() * 31);
    }

    public final String toString() {
        return "Success(deferred=" + this.A + ", outputSurfaceMap=" + this.B + ')';
    }
}
