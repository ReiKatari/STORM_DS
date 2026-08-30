package pf;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends p7.o {

    /* renamed from: c  reason: collision with root package name */
    public final ConsoleType f11640c;

    public n(ConsoleType consoleType) {
        consoleType.getClass();
        this.f11640c = consoleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && this.f11640c == ((n) obj).f11640c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11640c.hashCode();
    }

    public final String toString() {
        return "FirmwareSession(consoleType=" + this.f11640c + ")";
    }
}
