package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: of0  reason: default package */
/* loaded from: classes.dex */
public final class of0 {
    public final kf0 a;
    public final Map b;

    public of0(kf0 kf0Var, Map map) {
        this.a = kf0Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof of0) {
                of0 of0Var = (of0) obj;
                if (!this.a.equals(of0Var.a) || !this.b.equals(of0Var.b)) {
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
        return "CameraGraphCreationResult(config=" + this.a + ", streamConfigMap=" + this.b + ')';
    }
}
