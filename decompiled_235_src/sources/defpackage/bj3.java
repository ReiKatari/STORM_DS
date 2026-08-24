package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bj3  reason: default package */
/* loaded from: classes.dex */
public final class bj3 extends yh2 {
    public final ConsoleType d;

    public bj3(ConsoleType consoleType) {
        consoleType.getClass();
        this.d = consoleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bj3) && this.d == ((bj3) obj).d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Firmware(consoleType=" + this.d + ")";
    }
}
