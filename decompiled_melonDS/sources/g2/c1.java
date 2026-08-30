package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f5065a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5066b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5067c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5068d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5069e;

    /* renamed from: f  reason: collision with root package name */
    public final long f5070f;

    /* renamed from: g  reason: collision with root package name */
    public final long f5071g;

    /* renamed from: h  reason: collision with root package name */
    public final long f5072h;

    public c1(long j2, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f5065a = j2;
        this.f5066b = j10;
        this.f5067c = j11;
        this.f5068d = j12;
        this.f5069e = j13;
        this.f5070f = j14;
        this.f5071g = j15;
        this.f5072h = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (i3.s.c(this.f5065a, c1Var.f5065a) && i3.s.c(this.f5066b, c1Var.f5066b) && i3.s.c(this.f5067c, c1Var.f5067c) && i3.s.c(this.f5068d, c1Var.f5068d) && i3.s.c(this.f5069e, c1Var.f5069e) && i3.s.c(this.f5070f, c1Var.f5070f) && i3.s.c(this.f5071g, c1Var.f5071g) && i3.s.c(this.f5072h, c1Var.f5072h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = i3.s.f6688i;
        return Long.hashCode(this.f5072h) + w.d.f(this.f5071g, w.d.f(this.f5070f, w.d.f(this.f5069e, w.d.f(this.f5068d, w.d.f(this.f5067c, w.d.f(this.f5066b, Long.hashCode(this.f5065a) * 31, 31), 31), 31), 31), 31), 31);
    }
}
