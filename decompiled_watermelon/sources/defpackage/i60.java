package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i60  reason: default package */
/* loaded from: classes.dex */
public final class i60 implements fd7 {
    public Object A = s60.p;
    public ih0 B;
    public final /* synthetic */ q60 L;

    public i60(q60 q60Var) {
        this.L = q60Var;
    }

    public final Object a(k11 k11Var) {
        yj0 yj0Var;
        Boolean bool;
        Object obj = this.A;
        boolean z = true;
        if (obj == s60.p || obj == s60.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q60.d0;
            q60 q60Var = this.L;
            yj0 yj0Var2 = (yj0) atomicReferenceFieldUpdater.get(q60Var);
            while (true) {
                if (q60Var.F()) {
                    this.A = s60.l;
                    Throwable v = q60Var.v();
                    if (v == null) {
                        z = false;
                    } else {
                        int i = dd6.a;
                        throw v;
                    }
                } else {
                    long andIncrement = q60.X.getAndIncrement(q60Var);
                    long j = s60.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (yj0Var2.X != j2) {
                        yj0Var = q60Var.t(j2, yj0Var2);
                        if (yj0Var == null) {
                            continue;
                        }
                    } else {
                        yj0Var = yj0Var2;
                    }
                    Object U = q60Var.U(yj0Var, i2, andIncrement, null);
                    an1 an1Var = s60.m;
                    l4 l4Var = null;
                    if (U != an1Var) {
                        an1 an1Var2 = s60.o;
                        if (U == an1Var2) {
                            if (andIncrement < q60Var.z()) {
                                yj0Var.b();
                            }
                            yj0Var2 = yj0Var;
                        } else if (U == s60.n) {
                            q60 q60Var2 = this.L;
                            ih0 O = b53.O(nk2.J(k11Var));
                            try {
                                this.B = O;
                                Object U2 = q60Var2.U(yj0Var, i2, andIncrement, this);
                                mi2 mi2Var = q60Var2.B;
                                if (U2 == an1Var) {
                                    b(yj0Var, i2);
                                } else {
                                    if (U2 == an1Var2) {
                                        if (andIncrement < q60Var2.z()) {
                                            yj0Var.b();
                                        }
                                        yj0 yj0Var3 = (yj0) q60.d0.get(q60Var2);
                                        while (true) {
                                            if (q60Var2.F()) {
                                                ih0 ih0Var = this.B;
                                                ih0Var.getClass();
                                                this.B = null;
                                                this.A = s60.l;
                                                Throwable v2 = q60Var.v();
                                                if (v2 == null) {
                                                    ih0Var.k(Boolean.FALSE);
                                                } else {
                                                    ih0Var.k(new kc5(v2));
                                                }
                                            } else {
                                                long andIncrement2 = q60.X.getAndIncrement(q60Var2);
                                                long j3 = s60.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (yj0Var3.X != j4) {
                                                    yj0 t = q60Var2.t(j4, yj0Var3);
                                                    if (t != null) {
                                                        yj0Var3 = t;
                                                    }
                                                }
                                                Object U3 = q60Var2.U(yj0Var3, i3, andIncrement2, this);
                                                if (U3 == s60.m) {
                                                    b(yj0Var3, i3);
                                                    break;
                                                } else if (U3 == s60.o) {
                                                    if (andIncrement2 < q60Var2.z()) {
                                                        yj0Var3.b();
                                                    }
                                                } else if (U3 != s60.n) {
                                                    yj0Var3.b();
                                                    this.A = U3;
                                                    this.B = null;
                                                    bool = Boolean.TRUE;
                                                    if (mi2Var != null) {
                                                        l4Var = new l4(2, mi2Var, U3);
                                                    }
                                                } else {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                            }
                                        }
                                    } else {
                                        yj0Var.b();
                                        this.A = U2;
                                        this.B = null;
                                        bool = Boolean.TRUE;
                                        if (mi2Var != null) {
                                            l4Var = new l4(2, mi2Var, U2);
                                        }
                                    }
                                    O.l(bool, l4Var);
                                }
                                Object v3 = O.v();
                                p31 p31Var = p31.COROUTINE_SUSPENDED;
                                return v3;
                            } catch (Throwable th) {
                                O.E();
                                throw th;
                            }
                        } else {
                            yj0Var.b();
                            this.A = U;
                        }
                    } else {
                        i.n("unreachable");
                        return null;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fd7
    public final void b(dy5 dy5Var, int i) {
        ih0 ih0Var = this.B;
        if (ih0Var != null) {
            ih0Var.b(dy5Var, i);
        }
    }

    public final Object c() {
        Object obj = this.A;
        an1 an1Var = s60.p;
        if (obj != an1Var) {
            this.A = an1Var;
            if (obj != s60.l) {
                return obj;
            }
            Throwable x = this.L.x();
            int i = dd6.a;
            throw x;
        }
        i.n("`hasNext()` has not been invoked");
        return null;
    }
}
