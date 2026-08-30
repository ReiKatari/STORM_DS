package defpackage;

import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hd1  reason: default package */
/* loaded from: classes.dex */
public final class hd1 {
    public final Cheat a;
    public final sk0 b;

    public hd1(Cheat cheat, sk0 sk0Var) {
        cheat.getClass();
        this.a = cheat;
        this.b = sk0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hd1) {
                hd1 hd1Var = (hd1) obj;
                if (!b53.x(this.a, hd1Var.a) || !this.b.equals(hd1Var.b)) {
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
        return "DeletedCheat(cheat=" + this.a + ", folder=" + this.b + ")";
    }
}
