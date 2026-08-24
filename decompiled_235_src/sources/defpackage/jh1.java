package defpackage;

import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jh1  reason: default package */
/* loaded from: classes.dex */
public final class jh1 {
    public final Cheat a;
    public final an0 b;

    public jh1(Cheat cheat, an0 an0Var) {
        cheat.getClass();
        this.a = cheat;
        this.b = an0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jh1) {
                jh1 jh1Var = (jh1) obj;
                if (!nb3.k(this.a, jh1Var.a) || !this.b.equals(jh1Var.b)) {
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
