package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: op5  reason: default package */
/* loaded from: classes.dex */
public final class op5 extends pp5 {
    public final List a;
    public final Set b;

    public op5(List list, Set set) {
        list.getClass();
        set.getClass();
        this.a = list;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op5)) {
            return false;
        }
        op5 op5Var = (op5) obj;
        if (b53.x(this.a, op5Var.a) && b53.x(this.b, op5Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Ready(sets=" + this.a + ", pendingLedgerAchievementIds=" + this.b + ")";
    }
}
