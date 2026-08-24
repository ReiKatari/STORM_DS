package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n80  reason: default package */
/* loaded from: classes.dex */
public final class n80 implements zr7 {
    public Object A = x80.p;
    public rj0 B;
    public final /* synthetic */ v80 L;

    public n80(v80 v80Var) {
        this.L = v80Var;
    }

    @Override // defpackage.zr7
    public final void a(p96 p96Var, int i) {
        rj0 rj0Var = this.B;
        if (rj0Var != null) {
            rj0Var.a(p96Var, i);
        }
    }

    public final Object b(s41 s41Var) {
        hm0 hm0Var;
        Boolean bool;
        Object obj = this.A;
        boolean z = true;
        if (obj == x80.p || obj == x80.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v80.e0;
            v80 v80Var = this.L;
            hm0 hm0Var2 = (hm0) atomicReferenceFieldUpdater.get(v80Var);
            while (true) {
                if (v80Var.F()) {
                    this.A = x80.l;
                    Throwable v = v80Var.v();
                    if (v == null) {
                        z = false;
                    } else {
                        int i = to6.a;
                        throw v;
                    }
                } else {
                    long andIncrement = v80.X.getAndIncrement(v80Var);
                    long j = x80.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (hm0Var2.X != j2) {
                        hm0Var = v80Var.t(j2, hm0Var2);
                        if (hm0Var == null) {
                            continue;
                        }
                    } else {
                        hm0Var = hm0Var2;
                    }
                    Object U = v80Var.U(hm0Var, i2, andIncrement, null);
                    gr1 gr1Var = x80.m;
                    l4 l4Var = null;
                    if (U != gr1Var) {
                        gr1 gr1Var2 = x80.o;
                        if (U == gr1Var2) {
                            if (andIncrement < v80Var.z()) {
                                hm0Var.a();
                            }
                            hm0Var2 = hm0Var;
                        } else if (U == x80.n) {
                            v80 v80Var2 = this.L;
                            rj0 C = n16.C(np2.V(s41Var));
                            try {
                                this.B = C;
                                Object U2 = v80Var2.U(hm0Var, i2, andIncrement, this);
                                qn2 qn2Var = v80Var2.B;
                                if (U2 == gr1Var) {
                                    a(hm0Var, i2);
                                } else {
                                    if (U2 == gr1Var2) {
                                        if (andIncrement < v80Var2.z()) {
                                            hm0Var.a();
                                        }
                                        hm0 hm0Var3 = (hm0) v80.e0.get(v80Var2);
                                        while (true) {
                                            if (v80Var2.F()) {
                                                rj0 rj0Var = this.B;
                                                rj0Var.getClass();
                                                this.B = null;
                                                this.A = x80.l;
                                                Throwable v2 = v80Var.v();
                                                if (v2 == null) {
                                                    rj0Var.i(Boolean.FALSE);
                                                } else {
                                                    rj0Var.i(new em5(v2));
                                                }
                                            } else {
                                                long andIncrement2 = v80.X.getAndIncrement(v80Var2);
                                                long j3 = x80.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (hm0Var3.X != j4) {
                                                    hm0 t = v80Var2.t(j4, hm0Var3);
                                                    if (t != null) {
                                                        hm0Var3 = t;
                                                    }
                                                }
                                                Object U3 = v80Var2.U(hm0Var3, i3, andIncrement2, this);
                                                if (U3 == x80.m) {
                                                    a(hm0Var3, i3);
                                                    break;
                                                } else if (U3 == x80.o) {
                                                    if (andIncrement2 < v80Var2.z()) {
                                                        hm0Var3.a();
                                                    }
                                                } else if (U3 != x80.n) {
                                                    hm0Var3.a();
                                                    this.A = U3;
                                                    this.B = null;
                                                    bool = Boolean.TRUE;
                                                    if (qn2Var != null) {
                                                        l4Var = new l4(2, qn2Var, U3);
                                                    }
                                                } else {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                            }
                                        }
                                    } else {
                                        hm0Var.a();
                                        this.A = U2;
                                        this.B = null;
                                        bool = Boolean.TRUE;
                                        if (qn2Var != null) {
                                            l4Var = new l4(2, qn2Var, U2);
                                        }
                                    }
                                    C.t(bool, l4Var);
                                }
                                Object s = C.s();
                                x61 x61Var = x61.COROUTINE_SUSPENDED;
                                return s;
                            } catch (Throwable th) {
                                C.E();
                                throw th;
                            }
                        } else {
                            hm0Var.a();
                            this.A = U;
                        }
                    } else {
                        i.m("unreachable");
                        return null;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.A;
        gr1 gr1Var = x80.p;
        if (obj != gr1Var) {
            this.A = gr1Var;
            if (obj != x80.l) {
                return obj;
            }
            Throwable x = this.L.x();
            int i = to6.a;
            throw x;
        }
        i.m("`hasNext()` has not been invoked");
        return null;
    }
}
