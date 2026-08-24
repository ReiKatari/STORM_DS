package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o31  reason: default package */
/* loaded from: classes.dex */
public final class o31 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 0;
    public int Y;
    public final /* synthetic */ long Z;
    public /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o31(sz1 sz1Var, qz1 qz1Var, long j, gk4 gk4Var, ik4 ik4Var, r41 r41Var) {
        super(2, r41Var);
        this.d0 = sz1Var;
        this.e0 = qz1Var;
        this.Z = j;
        this.f0 = gk4Var;
        this.g0 = ik4Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((o31) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((o31) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.g0;
        Object obj3 = this.f0;
        Object obj4 = this.e0;
        switch (i) {
            case 0:
                o31 o31Var = new o31((p31) obj4, (nh7) obj3, (z70) obj2, this.Z, r41Var);
                o31Var.d0 = obj;
                return o31Var;
            default:
                return new o31((sz1) this.d0, (qz1) obj4, this.Z, (gk4) obj3, (ik4) obj2, r41Var);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        CancellationException cancellationException;
        boolean z;
        Object e;
        int i = this.X;
        Object obj2 = this.g0;
        Object obj3 = this.f0;
        Object obj4 = this.e0;
        switch (i) {
            case 0:
                p31 p31Var = (p31) obj4;
                p70 p70Var = p31Var.p0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            try {
                                oi2.Y(obj);
                            } catch (Throwable th) {
                                th = th;
                                cancellationException = null;
                                p31Var.s0 = false;
                                p70Var.a(cancellationException);
                                p31Var.q0 = false;
                                throw th;
                            }
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        rc3 u = yh2.u(((w61) this.d0).A());
                        try {
                            p31Var.s0 = true;
                            m86 m86Var = p31Var.l0;
                            xa4 xa4Var = xa4.Default;
                            n31 n31Var = new n31((nh7) obj3, p31Var, (z70) obj2, this.Z, u, (r41) null);
                            this.Y = 1;
                            if (m86Var.f(xa4Var, n31Var, this) == x61Var) {
                                return x61Var;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cancellationException = null;
                            p31Var.s0 = false;
                            p70Var.a(cancellationException);
                            p31Var.q0 = false;
                            throw th;
                        }
                    }
                    p70Var.b();
                    p31Var.s0 = false;
                    p70Var.a(null);
                    p31Var.q0 = false;
                    return jg7.a;
                } catch (CancellationException e2) {
                    cancellationException = e2;
                    try {
                        throw cancellationException;
                    } catch (Throwable th3) {
                        th = th3;
                        p31Var.s0 = false;
                        p70Var.a(cancellationException);
                        p31Var.q0 = false;
                        throw th;
                    }
                }
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        e = ((hm5) obj).A;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    oj4 oj4Var = ((sz1) this.d0).i;
                    qz1 qz1Var = (qz1) obj4;
                    String str = qz1Var.a;
                    String str2 = qz1Var.b;
                    long j = qz1Var.c;
                    String str3 = qz1Var.f;
                    gk4 gk4Var = (gk4) obj3;
                    if (gk4Var == gk4.HARDCORE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.Y = 1;
                    e = oj4Var.e(str, str2, j, str3, this.Z, z, gk4Var, (ik4) obj2, this);
                    if (e == x61Var2) {
                        return x61Var2;
                    }
                }
                return new hm5(e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o31(p31 p31Var, nh7 nh7Var, z70 z70Var, long j, r41 r41Var) {
        super(2, r41Var);
        this.e0 = p31Var;
        this.f0 = nh7Var;
        this.g0 = z70Var;
        this.Z = j;
    }
}
