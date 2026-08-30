package defpackage;

import java.util.ArrayList;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zi0  reason: default package */
/* loaded from: classes.dex */
public final class zi0 {
    public static final zi0 c = new zi0(tq0.s1(new ArrayList()), null);
    public final Set a;
    public final dk7 b;

    public zi0(Set set, dk7 dk7Var) {
        this.a = set;
        this.b = dk7Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zi0) {
            zi0 zi0Var = (zi0) obj;
            if (zi0Var.a.equals(this.a) && b53.x(zi0Var.b, this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() + 1517) * 41;
        dk7 dk7Var = this.b;
        if (dk7Var != null) {
            i = dk7Var.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
