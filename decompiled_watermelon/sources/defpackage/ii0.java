package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ii0  reason: default package */
/* loaded from: classes.dex */
public final class ii0 implements ji0 {
    public final Map A;
    public final Map B;

    public ii0(Map map, Map map2) {
        this.A = map;
        this.B = map2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ii0) {
                ii0 ii0Var = (ii0) obj;
                if (!this.A.equals(ii0Var.A) || !this.B.equals(ii0Var.B)) {
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
