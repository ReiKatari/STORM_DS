package defpackage;

import defpackage.sz1;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rz1  reason: default package */
/* loaded from: classes.dex */
public final class rz1 {
    public final ep2 a;
    public final sz1.a b;

    public rz1(ep2 ep2Var, sz1.a aVar) {
        ep2Var.getClass();
        aVar.getClass();
        this.a = ep2Var;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz1)) {
            return false;
        }
        rz1 rz1Var = (rz1) obj;
        if (nb3.k(this.a, rz1Var.a) && this.b == rz1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnlineRetroAchievementsBootstrap(achievementData=" + this.a + ", source=" + this.b + ")";
    }
}
