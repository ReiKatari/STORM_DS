package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i06  reason: default package */
/* loaded from: classes.dex */
public final class i06 extends j06 {
    public final List a;
    public final Set b;

    public i06(List list, Set set) {
        list.getClass();
        set.getClass();
        this.a = list;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i06)) {
            return false;
        }
        i06 i06Var = (i06) obj;
        if (nb3.k(this.a, i06Var.a) && nb3.k(this.b, i06Var.b)) {
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
