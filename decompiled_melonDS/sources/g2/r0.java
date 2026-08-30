package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f5377a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5378b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5379c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5380d;

    public r0(long j2, long j10, long j11, long j12) {
        this.f5377a = j2;
        this.f5378b = j10;
        this.f5379c = j11;
        this.f5380d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r0.class != obj.getClass()) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (i3.s.c(this.f5377a, r0Var.f5377a) && i3.s.c(this.f5378b, r0Var.f5378b) && i3.s.c(this.f5379c, r0Var.f5379c) && i3.s.c(this.f5380d, r0Var.f5380d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = i3.s.f6688i;
        return Long.hashCode(this.f5380d) + w.d.f(this.f5379c, w.d.f(this.f5378b, Long.hashCode(this.f5377a) * 31, 31), 31);
    }
}
