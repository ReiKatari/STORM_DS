package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tw1  reason: default package */
/* loaded from: classes.dex */
public final class tw1 extends mb3 {
    public final ConsoleType F;

    public tw1(ConsoleType consoleType) {
        consoleType.getClass();
        this.F = consoleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tw1) && this.F == ((tw1) obj).F) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.F.hashCode();
    }

    public final String toString() {
        return "ValidatingFirmware(consoleType=" + this.F + ")";
    }
}
