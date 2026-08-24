package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jz6  reason: default package */
/* loaded from: classes.dex */
public final class jz6 implements lo {
    public final il7 A;
    public final wc7 B;
    public Object L;
    public Object R;
    public ap X;
    public ap Y;
    public final ap Z;
    public long d0;
    public ap e0;

    public jz6(to toVar, wc7 wc7Var, Object obj, Object obj2, ap apVar) {
        ap c;
        this.A = toVar.a(wc7Var);
        this.B = wc7Var;
        this.L = obj2;
        this.R = obj;
        this.X = (ap) wc7Var.a.g(obj);
        qn2 qn2Var = wc7Var.a;
        this.Y = (ap) qn2Var.g(obj2);
        if (apVar != null) {
            c = nw7.R(apVar);
        } else {
            c = ((ap) qn2Var.g(obj)).c();
        }
        this.Z = c;
        this.d0 = -1L;
    }

    @Override // defpackage.lo
    public final boolean a() {
        return this.A.a();
    }

    @Override // defpackage.lo
    public final long b() {
        if (this.d0 < 0) {
            this.d0 = this.A.b(this.X, this.Y, this.Z);
        }
        return this.d0;
    }

    @Override // defpackage.lo
    public final wc7 c() {
        return this.B;
    }

    @Override // defpackage.lo
    public final ap d(long j) {
        if (!e(j)) {
            return this.A.h(j, this.X, this.Y, this.Z);
        }
        ap apVar = this.e0;
        if (apVar == null) {
            ap r = this.A.r(this.X, this.Y, this.Z);
            this.e0 = r;
            return r;
        }
        return apVar;
    }

    public final void f(Object obj) {
        if (!nb3.k(obj, this.R)) {
            this.R = obj;
            this.X = (ap) this.B.a.g(obj);
            this.e0 = null;
            this.d0 = -1L;
        }
    }

    @Override // defpackage.lo
    public final Object g(long j) {
        if (!e(j)) {
            ap q = this.A.q(j, this.X, this.Y, this.Z);
            int b = q.b();
            for (int i = 0; i < b; i++) {
                if (Float.isNaN(q.a(i))) {
                    t05.b("AnimationVector cannot contain a NaN. " + q + ". Animation: " + this + ", playTimeNanos: " + j);
                }
            }
            return this.B.b.g(q);
        }
        return this.L;
    }

    @Override // defpackage.lo
    public final Object h() {
        return this.L;
    }

    public final void i(Object obj) {
        if (!nb3.k(this.L, obj)) {
            this.L = obj;
            this.Y = (ap) this.B.a.g(obj);
            this.e0 = null;
            this.d0 = -1L;
        }
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.R + " -> " + this.L + ",initial velocity: " + this.Z + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.A;
    }
}
