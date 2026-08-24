package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z95  reason: default package */
/* loaded from: classes.dex */
public final class z95 extends ca5 {
    public final ls3 a;

    public z95(ls3 ls3Var) {
        this.a = ls3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof z95) || !this.a.equals(((z95) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LeaderboardTrackerHidden(key=" + this.a + ")";
    }
}
