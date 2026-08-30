package m4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f9202a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9203b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9204c;

    public e(int i2, boolean z10, int i10) {
        this.f9202a = i2;
        this.f9203b = i10;
        this.f9204c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f9202a == eVar.f9202a && this.f9203b == eVar.f9203b && this.f9204c == eVar.f9204c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9204c) + w.d.c(this.f9203b, Integer.hashCode(this.f9202a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f9202a + ", end=" + this.f9203b + ", isRtl=" + this.f9204c + ')';
    }
}
