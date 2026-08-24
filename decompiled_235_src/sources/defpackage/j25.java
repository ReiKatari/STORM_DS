package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j25  reason: default package */
/* loaded from: classes.dex */
public final class j25 implements qh1 {
    public final /* synthetic */ qh1 A;
    public boolean B;
    public boolean L;
    public final hb4 R = new hb4();

    public j25(qh1 qh1Var) {
        this.A = qh1Var;
    }

    @Override // defpackage.qh1
    public final long M(float f) {
        return this.A.M(f);
    }

    @Override // defpackage.qh1
    public final float Q(int i) {
        return this.A.Q(i);
    }

    @Override // defpackage.qh1
    public final float T(float f) {
        return this.A.T(f);
    }

    @Override // defpackage.qh1
    public final float Y() {
        return this.A.Y();
    }

    @Override // defpackage.qh1
    public final float a() {
        return this.A.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(s41 s41Var) {
        g25 g25Var;
        Object obj;
        int i;
        if (s41Var instanceof g25) {
            g25Var = (g25) s41Var;
            int i2 = g25Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g25Var.Y = i2 - Integer.MIN_VALUE;
                obj = g25Var.R;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = g25Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    g25Var.Y = 1;
                    obj = i(g25Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    return jg7.a;
                }
                throw new CancellationException("The press gesture was canceled.");
            }
        }
        g25Var = new g25(this, s41Var);
        obj = g25Var.R;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = g25Var.Y;
        if (i == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public final void c() {
        this.L = true;
        hb4 hb4Var = this.R;
        if (hb4Var.f()) {
            hb4Var.h(null);
        }
    }

    public final void d() {
        this.B = true;
        hb4 hb4Var = this.R;
        if (hb4Var.f()) {
            hb4Var.h(null);
        }
    }

    @Override // defpackage.qh1
    public final float e0(float f) {
        return this.A.e0(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(s41 s41Var) {
        h25 h25Var;
        int i;
        if (s41Var instanceof h25) {
            h25Var = (h25) s41Var;
            int i2 = h25Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h25Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = h25Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = h25Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    h25Var.Y = 1;
                    if (this.R.e(h25Var) == x61Var) {
                        return x61Var;
                    }
                }
                this.B = false;
                this.L = false;
                return jg7.a;
            }
        }
        h25Var = new h25(this, s41Var);
        Object obj2 = h25Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = h25Var.Y;
        if (i == 0) {
        }
        this.B = false;
        this.L = false;
        return jg7.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(s41 s41Var) {
        i25 i25Var;
        int i;
        if (s41Var instanceof i25) {
            i25Var = (i25) s41Var;
            int i2 = i25Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i25Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = i25Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = i25Var.Y;
                hb4 hb4Var = this.R;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (!this.B && !this.L) {
                        i25Var.Y = 1;
                        if (hb4Var.e(i25Var) == x61Var) {
                            return x61Var;
                        }
                    }
                    return Boolean.valueOf(this.B);
                }
                hb4Var.h(null);
                return Boolean.valueOf(this.B);
            }
        }
        i25Var = new i25(this, s41Var);
        Object obj2 = i25Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = i25Var.Y;
        hb4 hb4Var2 = this.R;
        if (i == 0) {
        }
        hb4Var2.h(null);
        return Boolean.valueOf(this.B);
    }

    @Override // defpackage.qh1
    public final int k0(long j) {
        return this.A.k0(j);
    }

    @Override // defpackage.qh1
    public final long p(float f) {
        return this.A.p(f);
    }

    @Override // defpackage.qh1
    public final long q(long j) {
        return this.A.q(j);
    }

    @Override // defpackage.qh1
    public final int r0(float f) {
        return this.A.r0(f);
    }

    @Override // defpackage.qh1
    public final long v0(long j) {
        return this.A.v0(j);
    }

    @Override // defpackage.qh1
    public final float x(long j) {
        return this.A.x(j);
    }

    @Override // defpackage.qh1
    public final float y0(long j) {
        return this.A.y0(j);
    }
}
