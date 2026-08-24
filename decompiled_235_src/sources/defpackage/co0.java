package defpackage;

import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: co0  reason: default package */
/* loaded from: classes.dex */
public final class co0 {
    public final Cheat a;
    public final String b;

    public co0(Cheat cheat, String str) {
        cheat.getClass();
        str.getClass();
        this.a = cheat;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co0)) {
            return false;
        }
        co0 co0Var = (co0) obj;
        if (nb3.k(this.a, co0Var.a) && nb3.k(this.b, co0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CheatInFolder(cheat=" + this.a + ", folderName=" + this.b + ")";
    }
}
