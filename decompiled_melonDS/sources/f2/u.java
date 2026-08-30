package f2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final w4.j f4793a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4794b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4795c;

    public u(w4.j jVar, int i2, long j2) {
        this.f4793a = jVar;
        this.f4794b = i2;
        this.f4795c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f4793a == uVar.f4793a && this.f4794b == uVar.f4794b && this.f4795c == uVar.f4795c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4795c) + w.d.c(this.f4794b, this.f4793a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f4793a + ", offset=" + this.f4794b + ", selectableId=" + this.f4795c + ')';
    }
}
