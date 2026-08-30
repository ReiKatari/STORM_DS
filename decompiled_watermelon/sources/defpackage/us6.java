package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: us6  reason: default package */
/* loaded from: classes.dex */
public final class us6 implements c31 {
    public final Object A;
    public final ThreadLocal B;
    public final ws6 L;

    public us6(Object obj, ThreadLocal threadLocal) {
        this.A = obj;
        this.B = threadLocal;
        this.L = new ws6(threadLocal);
    }

    @Override // defpackage.e31
    public final e31 C(e31 e31Var) {
        return se.O(this, e31Var);
    }

    @Override // defpackage.e31
    public final c31 I(d31 d31Var) {
        if (this.L.equals(d31Var)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.e31
    public final Object N(aj2 aj2Var, Object obj) {
        return aj2Var.j(obj, this);
    }

    @Override // defpackage.e31
    public final e31 T(d31 d31Var) {
        if (this.L.equals(d31Var)) {
            return mp1.A;
        }
        return this;
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

    @Override // defpackage.c31
    public final d31 getKey() {
        return this.L;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.A + ", threadLocal = " + this.B + ')';
    }
}
