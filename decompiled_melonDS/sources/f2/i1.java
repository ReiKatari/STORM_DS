package f2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f4746a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4747b;

    public i1(long j2, long j10) {
        this.f4746a = j2;
        this.f4747b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (i3.s.c(this.f4746a, i1Var.f4746a) && i3.s.c(this.f4747b, i1Var.f4747b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = i3.s.f6688i;
        return Long.hashCode(this.f4747b) + (Long.hashCode(this.f4746a) * 31);
    }

    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) i3.s.i(this.f4746a)) + ", selectionBackgroundColor=" + ((Object) i3.s.i(this.f4747b)) + ')';
    }
}
