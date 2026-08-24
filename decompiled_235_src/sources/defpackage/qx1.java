package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qx1  reason: default package */
/* loaded from: classes.dex */
public final class qx1 extends lb4 {
    public final ConsoleType o;

    public qx1(ConsoleType consoleType) {
        this.o = consoleType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof qx1) || this.o != ((qx1) obj).o) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        return "FirmwareSession(consoleType=" + this.o + ")";
    }
}
