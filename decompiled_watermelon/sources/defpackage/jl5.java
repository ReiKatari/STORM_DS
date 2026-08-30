package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jl5  reason: default package */
/* loaded from: classes.dex */
public final class jl5 extends kl5 {
    public final int a;

    public jl5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jl5) && this.a == ((jl5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wh1.j("OfflineAchievementsNotSyncedSummary(skippedCount=", this.a, ")");
    }
}
