package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ut1  reason: default package */
/* loaded from: classes.dex */
public final class ut1 extends wt1 {
    public final ConsoleType a;

    public ut1(ConsoleType consoleType) {
        consoleType.getClass();
        this.a = consoleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ut1) && this.a == ((ut1) obj).a) {
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
