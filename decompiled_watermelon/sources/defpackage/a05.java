package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a05  reason: default package */
/* loaded from: classes.dex */
public final class a05 extends b05 {
    public final long a;

    public a05(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a05) && this.a == ((a05) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "OnSubsetCompleted(subsetId=" + this.a + ")";
    }
}
