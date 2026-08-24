package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rf7  reason: default package */
/* loaded from: classes.dex */
public final class rf7 implements Comparable {
    public final long A;

    public /* synthetic */ rf7(long j) {
        this.A = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return nb3.q(this.A ^ Long.MIN_VALUE, ((rf7) obj).A ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rf7) {
            if (this.A != ((rf7) obj).A) {
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
        return jx2.R(10, this.A);
    }
}
