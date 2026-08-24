package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bw2  reason: default package */
/* loaded from: classes.dex */
public final class bw2 {
    public final o75 a;
    public final hb5 b;

    public bw2(o75 o75Var, hb5 hb5Var) {
        hb5Var.getClass();
        this.a = o75Var;
        this.b = hb5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bw2) {
                bw2 bw2Var = (bw2) obj;
                if (!this.a.equals(bw2Var.a) || !nb3.k(this.b, bw2Var.b)) {
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
        return "QueuedAchievement(achievement=" + this.a + ", authentication=" + this.b + ")";
    }
}
