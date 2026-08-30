package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f5050a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5051b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5052c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5053d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5054e;

    /* renamed from: f  reason: collision with root package name */
    public final long f5055f;

    /* renamed from: g  reason: collision with root package name */
    public final long f5056g;

    /* renamed from: h  reason: collision with root package name */
    public final long f5057h;

    /* renamed from: i  reason: collision with root package name */
    public final long f5058i;

    /* renamed from: j  reason: collision with root package name */
    public final long f5059j;

    public b1(long j2, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.f5050a = j2;
        this.f5051b = j10;
        this.f5052c = j11;
        this.f5053d = j12;
        this.f5054e = j13;
        this.f5055f = j14;
        this.f5056g = j15;
        this.f5057h = j16;
        this.f5058i = j17;
        this.f5059j = j18;
    }

    public final n2.w0 a(boolean z10, boolean z11, n2.m mVar) {
        long j2;
        n2.r rVar = (n2.r) mVar;
        rVar.X(-1491563694);
        if (z10) {
            if (z11) {
                j2 = this.f5056g;
            } else {
                j2 = this.f5057h;
            }
        } else if (z11) {
            j2 = this.f5058i;
        } else {
            j2 = this.f5059j;
        }
        return w.d.v(j2, rVar, false);
    }

    public final n2.w0 b(boolean z10, boolean z11, n2.m mVar) {
        long j2;
        n2.r rVar = (n2.r) mVar;
        rVar.X(1575395620);
        if (z10) {
            if (z11) {
                j2 = this.f5052c;
            } else {
                j2 = this.f5053d;
            }
        } else if (z11) {
            j2 = this.f5054e;
        } else {
            j2 = this.f5055f;
        }
        return w.d.v(j2, rVar, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (i3.s.c(this.f5050a, b1Var.f5050a) && i3.s.c(this.f5051b, b1Var.f5051b) && i3.s.c(this.f5052c, b1Var.f5052c) && i3.s.c(this.f5053d, b1Var.f5053d) && i3.s.c(this.f5054e, b1Var.f5054e) && i3.s.c(this.f5055f, b1Var.f5055f) && i3.s.c(this.f5056g, b1Var.f5056g) && i3.s.c(this.f5057h, b1Var.f5057h) && i3.s.c(this.f5058i, b1Var.f5058i) && i3.s.c(this.f5059j, b1Var.f5059j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = i3.s.f6688i;
        return Long.hashCode(this.f5059j) + w.d.f(this.f5058i, w.d.f(this.f5057h, w.d.f(this.f5056g, w.d.f(this.f5055f, w.d.f(this.f5054e, w.d.f(this.f5053d, w.d.f(this.f5052c, w.d.f(this.f5051b, Long.hashCode(this.f5050a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
