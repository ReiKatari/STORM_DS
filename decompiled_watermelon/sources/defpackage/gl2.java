package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gl2  reason: default package */
/* loaded from: classes.dex */
public abstract class gl2 implements Cloneable {
    public final jl2 A;
    public jl2 B;
    public boolean L = false;

    public gl2(jl2 jl2Var) {
        this.A = jl2Var;
        this.B = (jl2) jl2Var.f(il2.NEW_MUTABLE_INSTANCE);
    }

    public final jl2 a() {
        jl2 b = b();
        if (b.i()) {
            return b;
        }
        throw new hg(13);
    }

    public final jl2 b() {
        boolean z = this.L;
        jl2 jl2Var = this.B;
        if (z) {
            return jl2Var;
        }
        jl2Var.getClass();
        rv4 rv4Var = rv4.c;
        rv4Var.getClass();
        rv4Var.a(jl2Var.getClass()).d(jl2Var);
        this.L = true;
        return this.B;
    }

    public final void c() {
        if (this.L) {
            jl2 jl2Var = (jl2) this.B.f(il2.NEW_MUTABLE_INSTANCE);
            jl2 jl2Var2 = this.B;
            rv4 rv4Var = rv4.c;
            rv4Var.getClass();
            rv4Var.a(jl2Var.getClass()).c(jl2Var, jl2Var2);
            this.B = jl2Var;
            this.L = false;
        }
    }

    public final Object clone() {
        jl2 jl2Var = this.A;
        jl2Var.getClass();
        gl2 gl2Var = (gl2) jl2Var.f(il2.NEW_BUILDER);
        gl2Var.e(b());
        return gl2Var;
    }

    public final void e(jl2 jl2Var) {
        c();
        jl2 jl2Var2 = this.B;
        rv4 rv4Var = rv4.c;
        rv4Var.getClass();
        rv4Var.a(jl2Var2.getClass()).c(jl2Var2, jl2Var);
    }
}
