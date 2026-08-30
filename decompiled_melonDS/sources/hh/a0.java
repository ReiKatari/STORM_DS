package hh;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 extends pc.a {

    /* renamed from: d  reason: collision with root package name */
    public final ConsoleType f6508d;

    public a0(ConsoleType consoleType) {
        consoleType.getClass();
        this.f6508d = consoleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a0) && this.f6508d == ((a0) obj).f6508d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6508d.hashCode();
    }

    public final String toString() {
        return "Firmware(consoleType=" + this.f6508d + ")";
    }
}
