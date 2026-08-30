package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f82  reason: default package */
/* loaded from: classes.dex */
public final class f82 extends g82 {
    public final ConsoleType a;

    public f82(ConsoleType consoleType) {
        this.a = consoleType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof f82) || this.a != ((f82) obj).a) {
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
        return "Success(consoleType=" + this.a + ")";
    }
}
