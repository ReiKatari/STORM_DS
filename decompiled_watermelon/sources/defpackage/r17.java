package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r17  reason: default package */
/* loaded from: classes.dex */
public final class r17 implements Comparable {
    public final int A;

    public /* synthetic */ r17(int i) {
        this.A = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b53.E(this.A ^ Integer.MIN_VALUE, ((r17) obj).A ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r17) {
            if (this.A != ((r17) obj).A) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.A);
    }

    public final String toString() {
        return String.valueOf(this.A & 4294967295L);
    }
}
