package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fu6  reason: default package */
/* loaded from: classes.dex */
public final class fu6 extends gv6 {
    public final int a;

    public fu6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fu6) && this.a == ((fu6) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wh1.j("HardcoreOfflineUnsyncedWarning(pendingHardcoreCount=", this.a, ")");
    }
}
