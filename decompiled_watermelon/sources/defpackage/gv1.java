package defpackage;

import defpackage.hv1;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gv1  reason: default package */
/* loaded from: classes.dex */
public final class gv1 {
    public final ak2 a;
    public final hv1.a b;

    public gv1(ak2 ak2Var, hv1.a aVar) {
        ak2Var.getClass();
        aVar.getClass();
        this.a = ak2Var;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv1)) {
            return false;
        }
        gv1 gv1Var = (gv1) obj;
        if (b53.x(this.a, gv1Var.a) && this.b == gv1Var.b) {
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
