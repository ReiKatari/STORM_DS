package kg;

import me.magnum.melonds.domain.model.Cheat;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public final Cheat f8291b;

    public a(Cheat cheat) {
        cheat.getClass();
        this.f8291b = cheat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && k.a(this.f8291b, ((a) obj).f8291b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8291b.hashCode();
    }

    public final String toString() {
        return "EditCheat(cheat=" + this.f8291b + ")";
    }
}
