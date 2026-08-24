package defpackage;

import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gn0  reason: default package */
/* loaded from: classes.dex */
public final class gn0 extends jn0 {
    public final Cheat b;

    public gn0(Cheat cheat) {
        cheat.getClass();
        this.b = cheat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gn0) && nb3.k(this.b, ((gn0) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "EditCheat(cheat=" + this.b + ")";
    }
}
