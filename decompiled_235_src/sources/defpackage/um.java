package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: um  reason: default package */
/* loaded from: classes.dex */
public final class um implements j61 {
    public final /* synthetic */ int A;
    public final Object B;
    public final Object L;

    public um(um umVar) {
        this.A = 2;
        this.B = umVar;
        this.L = new bk1(3);
    }

    @Override // defpackage.l61
    public final l61 D(k61 k61Var) {
        switch (this.A) {
            case 0:
                return jw2.w(this, k61Var);
            case 1:
                return jw2.w(this, k61Var);
            default:
                return jw2.w(this, k61Var);
        }
    }

    @Override // defpackage.l61
    public final l61 N(l61 l61Var) {
        switch (this.A) {
            case 0:
                return jw2.y(this, l61Var);
            case 1:
                return jw2.y(this, l61Var);
            default:
                return jw2.y(this, l61Var);
        }
    }

    @Override // defpackage.l61
    public final j61 Z(k61 k61Var) {
        switch (this.A) {
            case 0:
                return jw2.p(this, k61Var);
            case 1:
                return jw2.p(this, k61Var);
            default:
                return jw2.p(this, k61Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
        if (r9 == r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [vz, java.lang.Object, c80] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(qn2 qn2Var, r41 r41Var) {
        lu4 lu4Var;
        x61 x61Var;
        int i;
        boolean z;
        Object s;
        Object a;
        switch (this.A) {
            case 0:
                sm smVar = (sm) this.L;
                rj0 rj0Var = new rj0(1, np2.V(r41Var));
                rj0Var.v();
                tm tmVar = new tm(rj0Var, this, qn2Var);
                if (nb3.k(smVar.L, (Choreographer) this.B)) {
                    synchronized (smVar.X) {
                        smVar.Z.add(tmVar);
                        if (!smVar.f0) {
                            smVar.f0 = true;
                            smVar.L.postFrameCallback(smVar.g0);
                        }
                    }
                    rj0Var.z(new qj(3, smVar, tmVar));
                } else {
                    ((Choreographer) this.B).postFrameCallback(tmVar);
                    rj0Var.z(new qj(4, this, tmVar));
                }
                Object s2 = rj0Var.s();
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                return s2;
            case 1:
                rj0 rj0Var2 = new rj0(1, np2.V(r41Var));
                rj0Var2.v();
                ?? obj = new Object();
                obj.a = rj0Var2;
                obj.b = qn2Var;
                rj0Var2.z(new d80(((s9) this.L).i(obj, (df5) this.B), 0));
                Object s3 = rj0Var2.s();
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                return s3;
            default:
                if (r41Var instanceof lu4) {
                    lu4Var = (lu4) r41Var;
                    int i2 = lu4Var.Z;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        lu4Var.Z = i2 - Integer.MIN_VALUE;
                        Object obj2 = lu4Var.X;
                        x61Var = x61.COROUTINE_SUSPENDED;
                        i = lu4Var.Z;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    oi2.Y(obj2);
                                    return obj2;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qn2Var = lu4Var.R;
                            oi2.Y(obj2);
                        } else {
                            oi2.Y(obj2);
                            bk1 bk1Var = (bk1) this.L;
                            lu4Var.R = qn2Var;
                            lu4Var.Z = 1;
                            synchronized (bk1Var.L) {
                                z = bk1Var.A;
                            }
                            if (z) {
                                s = jg7.a;
                                break;
                            } else {
                                rj0 rj0Var3 = new rj0(1, np2.V(lu4Var));
                                rj0Var3.v();
                                synchronized (bk1Var.L) {
                                    ((ArrayList) bk1Var.B).add(rj0Var3);
                                }
                                rj0Var3.z(new r5(14, bk1Var, rj0Var3));
                                s = rj0Var3.s();
                                if (s != x61Var) {
                                    s = jg7.a;
                                    break;
                                }
                            }
                        }
                        lu4Var.R = null;
                        lu4Var.Z = 2;
                        a = ((um) this.B).a(qn2Var, lu4Var);
                        if (a != x61Var) {
                            return a;
                        }
                        return x61Var;
                    }
                }
                lu4Var = new lu4(this, r41Var);
                Object obj22 = lu4Var.X;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = lu4Var.Z;
                if (i == 0) {
                }
                lu4Var.R = null;
                lu4Var.Z = 2;
                a = ((um) this.B).a(qn2Var, lu4Var);
                if (a != x61Var) {
                }
                return x61Var;
        }
    }

    @Override // defpackage.j61
    public k61 getKey() {
        return vs0.i0;
    }

    @Override // defpackage.l61
    public final Object x(eo2 eo2Var, Object obj) {
        switch (this.A) {
            case 0:
                return eo2Var.o(obj, this);
            case 1:
                return eo2Var.o(obj, this);
            default:
                return eo2Var.o(obj, this);
        }
    }

    public um(Choreographer choreographer, sm smVar) {
        this.A = 0;
        this.B = choreographer;
        this.L = smVar;
    }

    public um(df5 df5Var) {
        this.A = 1;
        this.B = df5Var;
        this.L = new s9(2);
    }
}
