package hh;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: a  reason: collision with root package name */
    public final ConsoleType f6546a;

    public m(ConsoleType consoleType) {
        consoleType.getClass();
        this.f6546a = consoleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && this.f6546a == ((m) obj).f6546a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6546a.hashCode();
    }

    public final String toString() {
        return "ValidatingFirmware(consoleType=" + this.f6546a + ")";
    }
}
