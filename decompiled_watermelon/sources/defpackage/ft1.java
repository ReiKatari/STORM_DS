package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ft1  reason: default package */
/* loaded from: classes.dex */
public final class ft1 extends a53 {
    public final ConsoleType r;

    public ft1(ConsoleType consoleType) {
        this.r = consoleType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ft1) || this.r != ((ft1) obj).r) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String toString() {
        return "FirmwareSession(consoleType=" + this.r + ")";
    }
}
