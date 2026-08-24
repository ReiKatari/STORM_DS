package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fy1  reason: default package */
/* loaded from: classes.dex */
public final class fy1 extends hy1 {
    public final ConsoleType a;

    public fy1(ConsoleType consoleType) {
        consoleType.getClass();
        this.a = consoleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fy1) && this.a == ((fy1) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ValidatingFirmware(consoleType=" + this.a + ")";
    }
}
