package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zm6  reason: default package */
/* loaded from: classes.dex */
public final class zm6 implements yn {
    public final j77 A;
    public final bz6 B;
    public Object L;
    public Object R;
    public oo X;
    public oo Y;
    public final oo Z;
    public long c0;
    public oo d0;

    public zm6(ho hoVar, bz6 bz6Var, Object obj, Object obj2, oo ooVar) {
        oo c;
        this.A = hoVar.a(bz6Var);
        this.B = bz6Var;
        this.L = obj2;
        this.R = obj;
        this.X = (oo) bz6Var.a.n(obj);
        mi2 mi2Var = bz6Var.a;
        this.Y = (oo) mi2Var.n(obj2);
        if (ooVar != null) {
            c = jv3.r(ooVar);
        } else {
            c = ((oo) mi2Var.n(obj)).c();
        }
        this.Z = c;
        this.c0 = -1L;
    }

    @Override // defpackage.yn
    public final boolean a() {
        return this.A.a();
    }

    public final void b(Object obj) {
        if (!b53.x(obj, this.R)) {
            this.R = obj;
            this.X = (oo) this.B.a.n(obj);
            this.d0 = null;
            this.c0 = -1L;
        }
    }

    @Override // defpackage.yn
    public final Object c(long j) {
        if (!i(j)) {
            oo p = this.A.p(j, this.X, this.Y, this.Z);
            int b = p.b();
            for (int i = 0; i < b; i++) {
                if (Float.isNaN(p.a(i))) {
                    qr4.b("AnimationVector cannot contain a NaN. " + p + ". Animation: " + this + ", playTimeNanos: " + j);
                }
            }
            return this.B.b.n(p);
        }
        return this.L;
    }

    @Override // defpackage.yn
    public final long d() {
        if (this.c0 < 0) {
            this.c0 = this.A.b(this.X, this.Y, this.Z);
        }
        return this.c0;
    }

    @Override // defpackage.yn
    public final bz6 e() {
        return this.B;
    }

    @Override // defpackage.yn
    public final Object f() {
        return this.L;
    }

    @Override // defpackage.yn
    public final oo g(long j) {
        if (!i(j)) {
            return this.A.l(j, this.X, this.Y, this.Z);
        }
        oo ooVar = this.d0;
        if (ooVar == null) {
            oo q = this.A.q(this.X, this.Y, this.Z);
            this.d0 = q;
            return q;
        }
        return ooVar;
    }

    public final void h(Object obj) {
        if (!b53.x(this.L, obj)) {
            this.L = obj;
            this.Y = (oo) this.B.a.n(obj);
            this.d0 = null;
            this.c0 = -1L;
        }
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.R + " -> " + this.L + ",initial velocity: " + this.Z + ", duration: " + (d() / 1000000) + " ms,animationSpec: " + this.A;
    }
}
