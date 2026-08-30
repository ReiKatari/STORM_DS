package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lc3  reason: default package */
/* loaded from: classes.dex */
public final class lc3 extends ln2 {
    public final String L;

    public lc3(String str) {
        this.L = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof lc3) || !this.L.equals(((lc3) obj).L)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.L.hashCode();
    }

    public final String toString() {
        return wh1.A("RomPath(path=", this.L, ")");
    }
}
