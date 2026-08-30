package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jc3  reason: default package */
/* loaded from: classes.dex */
public final class jc3 extends ln2 {
    public final ConsoleType L;

    public jc3(ConsoleType consoleType) {
        consoleType.getClass();
        this.L = consoleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jc3) && this.L == ((jc3) obj).L) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.L.hashCode();
    }

    public final String toString() {
        return "Firmware(consoleType=" + this.L + ")";
    }
}
