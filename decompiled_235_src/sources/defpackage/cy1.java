package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cy1  reason: default package */
/* loaded from: classes.dex */
public final class cy1 extends hy1 {
    public final ConsoleType a;

    public cy1(ConsoleType consoleType) {
        this.a = consoleType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof cy1) || this.a != ((cy1) obj).a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RunningFirmware(console=" + this.a + ")";
    }
}
