package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l57  reason: default package */
/* loaded from: classes.dex */
public final class l57 implements j61 {
    public final Object A;
    public final ThreadLocal B;
    public final n57 L;

    public l57(Object obj, ThreadLocal threadLocal) {
        this.A = obj;
        this.B = threadLocal;
        this.L = new n57(threadLocal);
    }

    @Override // defpackage.l61
    public final l61 D(k61 k61Var) {
        if (this.L.equals(k61Var)) {
            return vt1.A;
        }
        return this;
    }

    @Override // defpackage.l61
    public final l61 N(l61 l61Var) {
        return jw2.y(this, l61Var);
    }

    @Override // defpackage.l61
    public final j61 Z(k61 k61Var) {
        if (this.L.equals(k61Var)) {
            return this;
        }
        return null;
    }

    public final void a(Object obj) {
        this.B.set(obj);
    }

    public final Object b() {
        ThreadLocal threadLocal = this.B;
        Object obj = threadLocal.get();
        threadLocal.set(this.A);
        return obj;
    }

    @Override // defpackage.j61
    public final k61 getKey() {
        return this.L;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.A + ", threadLocal = " + this.B + ')';
    }

    @Override // defpackage.l61
    public final Object x(eo2 eo2Var, Object obj) {
        return eo2Var.o(obj, this);
    }
}
