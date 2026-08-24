package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h22  reason: default package */
/* loaded from: classes.dex */
public final class h22 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ sz1 Z;
    public long d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h22(sz1 sz1Var, long j, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = sz1Var;
        this.d0 = j;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((h22) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((h22) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((h22) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((h22) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new h22(this.Z, this.d0, r41Var, 0);
            case 1:
                return new h22(this.Z, this.d0, r41Var, 1);
            case 2:
                return new h22(this.Z, this.d0, r41Var, 2);
            default:
                return new h22(this.Z, r41Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0199, code lost:
        if (defpackage.sz1.N(r6, r2, r11) == r7) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0120, code lost:
        if (r12 == r7) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0152, code lost:
        if (r12 == r7) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object h;
        String str;
        Object a;
        lc5 lc5Var;
        qc5 qc5Var;
        long j;
        de5 de5Var;
        bv4 bv4Var;
        Long l = 0;
        switch (this.X) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i = this.Y;
                if (i != 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    of6 of6Var = this.Z.F0;
                    n95 n95Var = new n95(this.d0);
                    this.Y = 1;
                    if (of6Var.a(n95Var, this) == x61Var) {
                        return x61Var;
                    }
                }
                return jg7.a;
            case 1:
                jg7 jg7Var = jg7.a;
                long j2 = this.d0;
                sz1 sz1Var = this.Z;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                oi2.Y(obj);
                                return jg7Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        if (((Boolean) obj).booleanValue()) {
                            sz1Var.H0("rc_client_submit_failed_queued_hardcore", new vr4("achievement_id", new Long(j2)));
                            return jg7Var;
                        }
                        sz1Var.H0("rc_client_submit_failed_queue_rejected", new vr4("achievement_id", new Long(j2)), new vr4("reason", "runtime_authentication_mismatch"));
                        return jg7Var;
                    }
                    oi2.Y(obj);
                    h = ((hm5) obj).A;
                } else {
                    oi2.Y(obj);
                    pn5 pn5Var = sz1Var.g;
                    this.Y = 1;
                    h = ((pl) pn5Var).h(j2, this);
                    break;
                }
                if (!(h instanceof em5)) {
                    l = h;
                }
                o75 o75Var = (o75) l;
                if (o75Var != null) {
                    if (sz1Var.w.a) {
                        hb5 W0 = sz1.W0(sz1Var.N);
                        if (W0 != null) {
                            this.Y = 2;
                            synchronized (sz1Var.P) {
                                str = sz1Var.R;
                            }
                            if (str == null) {
                                a = Boolean.FALSE;
                            } else {
                                a = sz1Var.o0.a(str, o75Var, W0, this);
                            }
                            obj = a;
                            break;
                        }
                        sz1Var.H0("rc_client_submit_failed_queue_rejected", new vr4("achievement_id", new Long(j2)), new vr4("reason", "runtime_authentication_mismatch"));
                    } else {
                        this.Y = 3;
                        break;
                    }
                    return x61Var2;
                }
                return jg7Var;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    sz1 sz1Var2 = this.Z;
                    long j3 = this.d0;
                    boolean z = sz1Var2.w.a;
                    this.Y = 1;
                    if (sz1.U(sz1Var2, j3, z, this) == x61Var3) {
                        return x61Var3;
                    }
                }
                return jg7.a;
            default:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        j = this.d0;
                        try {
                            oi2.Y(obj);
                        } catch (CancellationException e) {
                            e = e;
                            this.Z.h0.n(j);
                            throw e;
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    nv4 nv4Var = this.Z.b0;
                    if (nv4Var != null && (de5Var = nv4Var.i) != null && (bv4Var = (bv4) de5Var.A.getValue()) != null) {
                        lc5Var = bv4Var.c;
                    } else {
                        lc5Var = lc5.f;
                    }
                    if (lc5Var.a > 0) {
                        qc5Var = qc5.START_SYNC;
                    } else {
                        qc5Var = qc5.REOPEN_PAUSE_MENU;
                    }
                    qc5 qc5Var2 = qc5.REOPEN_PAUSE_MENU;
                    sz1 sz1Var3 = this.Z;
                    if (qc5Var == qc5Var2) {
                        sz1Var3.M0(true);
                        return jg7.a;
                    }
                    eb ebVar = sz1Var3.h0;
                    ebVar.getClass();
                    synchronized (ebVar.B) {
                        if (nb3.k(((tp6) ebVar.R).getValue(), uc5.a)) {
                            long I = ebVar.I();
                            Long valueOf = Long.valueOf(I);
                            tp6 tp6Var = (tp6) ebVar.R;
                            wc5 wc5Var = new wc5(I, lc5Var, sc5.MANUAL_SYNC);
                            tp6Var.getClass();
                            tp6Var.m(null, wc5Var);
                            l = valueOf;
                        }
                    }
                    if (l != null) {
                        long longValue = l.longValue();
                        try {
                            sz1 sz1Var4 = this.Z;
                            fd5 fd5Var = fd5.PAUSE_MENU;
                            this.d0 = longValue;
                            this.Y = 1;
                            obj = sz1Var4.d1(fd5Var, this);
                            if (obj == x61Var4) {
                                return x61Var4;
                            }
                            j = longValue;
                        } catch (CancellationException e2) {
                            e = e2;
                            j = longValue;
                            this.Z.h0.n(j);
                            throw e;
                        }
                    } else {
                        return jg7.a;
                    }
                }
                this.Z.h0.N(j, (dd5) obj, ed5.REOPEN_PAUSE_MENU);
                return jg7.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h22(sz1 sz1Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 3;
        this.Z = sz1Var;
    }
}
