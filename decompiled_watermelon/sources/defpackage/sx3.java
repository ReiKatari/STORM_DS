package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sx3  reason: default package */
/* loaded from: classes.dex */
public final class sx3 implements cv5 {
    public final b1 a;
    public final s27 b;
    public final q32 c;

    public sx3(s27 s27Var, q32 q32Var, b1 b1Var) {
        this.b = s27Var;
        q32Var.getClass();
        this.c = q32Var;
        this.a = b1Var;
    }

    @Override // defpackage.cv5
    public final void a(Object obj, bq0 bq0Var) {
        this.c.getClass();
        ej6.j(obj);
        throw null;
    }

    @Override // defpackage.cv5
    public final int b(jl2 jl2Var) {
        this.b.getClass();
        return jl2Var.unknownFields.hashCode();
    }

    @Override // defpackage.cv5
    public final void c(jl2 jl2Var, jl2 jl2Var2) {
        dv5.x(this.b, jl2Var, jl2Var2);
    }

    @Override // defpackage.cv5
    public final void d(Object obj) {
        this.b.getClass();
        ((jl2) obj).unknownFields.e = false;
        this.c.getClass();
        ej6.j(obj);
        throw null;
    }

    @Override // defpackage.cv5
    public final boolean e(Object obj) {
        this.c.getClass();
        ej6.j(obj);
        throw null;
    }

    @Override // defpackage.cv5
    public final void f(Object obj, byte[] bArr, int i, int i2, wt wtVar) {
        jl2 jl2Var = (jl2) obj;
        if (jl2Var.unknownFields == r27.f) {
            jl2Var.unknownFields = r27.b();
        }
        throw b31.l(obj);
    }

    @Override // defpackage.cv5
    public final int g(b1 b1Var) {
        this.b.getClass();
        r27 r27Var = ((jl2) b1Var).unknownFields;
        int i = r27Var.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < r27Var.a; i3++) {
            i2 += zp0.a(3, (x70) r27Var.c[i3]) + zp0.i(r27Var.b[i3] >>> 3) + zp0.h(2) + (zp0.h(1) * 2);
        }
        r27Var.d = i2;
        return i2;
    }

    @Override // defpackage.cv5
    public final boolean h(jl2 jl2Var, jl2 jl2Var2) {
        this.b.getClass();
        if (!jl2Var.unknownFields.equals(jl2Var2.unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.cv5
    public final void i(Object obj, yp0 yp0Var, o32 o32Var) {
        this.b.getClass();
        jl2 jl2Var = (jl2) obj;
        if (jl2Var.unknownFields == r27.f) {
            jl2Var.unknownFields = r27.b();
        }
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.cv5
    public final Object j() {
        jl2 jl2Var = (jl2) this.a;
        jl2Var.getClass();
        return ((gl2) jl2Var.f(il2.NEW_BUILDER)).b();
    }
}
