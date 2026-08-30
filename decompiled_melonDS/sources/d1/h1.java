package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h1 implements f {

    /* renamed from: a  reason: collision with root package name */
    public final y1 f3575a;

    /* renamed from: b  reason: collision with root package name */
    public final w1 f3576b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3577c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3578d;

    /* renamed from: e  reason: collision with root package name */
    public p f3579e;

    /* renamed from: f  reason: collision with root package name */
    public p f3580f;

    /* renamed from: g  reason: collision with root package name */
    public final p f3581g;

    /* renamed from: h  reason: collision with root package name */
    public long f3582h;

    /* renamed from: i  reason: collision with root package name */
    public p f3583i;

    public h1(j jVar, w1 w1Var, Object obj, Object obj2, p pVar) {
        p c4;
        this.f3575a = jVar.a(w1Var);
        this.f3576b = w1Var;
        this.f3577c = obj2;
        this.f3578d = obj;
        this.f3579e = (p) w1Var.f3690a.k(obj);
        mc.l lVar = w1Var.f3690a;
        this.f3580f = (p) lVar.k(obj2);
        if (pVar != null) {
            c4 = d.k(pVar);
        } else {
            c4 = ((p) lVar.k(obj)).c();
        }
        this.f3581g = c4;
        this.f3582h = -1L;
    }

    @Override // d1.f
    public final boolean a() {
        return this.f3575a.a();
    }

    @Override // d1.f
    public final Object b(long j2) {
        if (!g(j2)) {
            p F = this.f3575a.F(j2, this.f3579e, this.f3580f, this.f3581g);
            int b10 = F.b();
            for (int i2 = 0; i2 < b10; i2++) {
                if (Float.isNaN(F.a(i2))) {
                    n0.b("AnimationVector cannot contain a NaN. " + F + ". Animation: " + this + ", playTimeNanos: " + j2);
                }
            }
            return this.f3576b.f3691b.k(F);
        }
        return this.f3577c;
    }

    @Override // d1.f
    public final long c() {
        if (this.f3582h < 0) {
            this.f3582h = this.f3575a.c(this.f3579e, this.f3580f, this.f3581g);
        }
        return this.f3582h;
    }

    @Override // d1.f
    public final w1 d() {
        return this.f3576b;
    }

    @Override // d1.f
    public final Object e() {
        return this.f3577c;
    }

    @Override // d1.f
    public final p f(long j2) {
        if (!g(j2)) {
            return this.f3575a.L(j2, this.f3579e, this.f3580f, this.f3581g);
        }
        p pVar = this.f3583i;
        if (pVar == null) {
            p t5 = this.f3575a.t(this.f3579e, this.f3580f, this.f3581g);
            this.f3583i = t5;
            return t5;
        }
        return pVar;
    }

    public final void h(Object obj) {
        if (!nc.k.a(obj, this.f3578d)) {
            this.f3578d = obj;
            this.f3579e = (p) this.f3576b.f3690a.k(obj);
            this.f3583i = null;
            this.f3582h = -1L;
        }
    }

    public final void i(Object obj) {
        if (!nc.k.a(this.f3577c, obj)) {
            this.f3577c = obj;
            this.f3580f = (p) this.f3576b.f3690a.k(obj);
            this.f3583i = null;
            this.f3582h = -1L;
        }
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f3578d + " -> " + this.f3577c + ",initial velocity: " + this.f3581g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.f3575a;
    }
}
