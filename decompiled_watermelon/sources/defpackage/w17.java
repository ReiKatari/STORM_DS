package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w17  reason: default package */
/* loaded from: classes.dex */
public final class w17 implements Comparable {
    public final long A;

    public /* synthetic */ w17(long j) {
        this.A = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b53.F(this.A ^ Long.MIN_VALUE, ((w17) obj).A ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w17) {
            if (this.A != ((w17) obj).A) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.A);
    }

    public final String toString() {
        return io2.r0(10, this.A);
    }
}
