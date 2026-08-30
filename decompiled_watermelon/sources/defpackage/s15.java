package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s15  reason: default package */
/* loaded from: classes.dex */
public final class s15 {
    public final int a;
    public final int b;

    public s15(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s15)) {
            return false;
        }
        s15 s15Var = (s15) obj;
        if (this.a == s15Var.a && this.b == s15Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RASubmitLeaderboardEntryResponse(rank=" + this.a + ", numEntries=" + this.b + ")";
    }
}
