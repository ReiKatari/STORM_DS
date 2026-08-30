package w4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: a  reason: collision with root package name */
    public final long f14128a;

    public c(long j2) {
        this.f14128a = j2;
        if (j2 != 16) {
            return;
        }
        r4.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // w4.o
    public final float a() {
        return i3.s.d(this.f14128a);
    }

    @Override // w4.o
    public final long b() {
        return this.f14128a;
    }

    @Override // w4.o
    public final i3.o c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && i3.s.c(this.f14128a, ((c) obj).f14128a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = i3.s.f6688i;
        return Long.hashCode(this.f14128a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) i3.s.i(this.f14128a)) + ')';
    }
}
