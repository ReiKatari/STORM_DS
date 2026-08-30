package vg;

import me.magnum.melonds.domain.model.ConsoleType;
import p7.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends o {

    /* renamed from: c  reason: collision with root package name */
    public final ConsoleType f13829c;

    public a(ConsoleType consoleType) {
        consoleType.getClass();
        this.f13829c = consoleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f13829c == ((a) obj).f13829c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13829c.hashCode();
    }

    public final String toString() {
        return "ValidatingFirmware(consoleType=" + this.f13829c + ")";
    }
}
