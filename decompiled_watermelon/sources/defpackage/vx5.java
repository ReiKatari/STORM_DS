package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vx5  reason: default package */
/* loaded from: classes.dex */
public final class vx5 extends nk6 implements mi2 {
    public final /* synthetic */ int X = 1;
    public int Y;
    public final /* synthetic */ by5 Z;
    public final /* synthetic */ Object c0;
    public final /* synthetic */ kx6 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx5(kx6 kx6Var, by5 by5Var, Object obj, j11 j11Var) {
        super(1, j11Var);
        this.d0 = kx6Var;
        this.Z = by5Var;
        this.c0 = obj;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        kx6 kx6Var = this.d0;
        Object obj2 = this.c0;
        by5 by5Var = this.Z;
        j11 j11Var = (j11) obj;
        switch (i) {
            case 0:
                return new vx5(kx6Var, by5Var, obj2, j11Var).v(o27Var);
            default:
                return new vx5(by5Var, obj2, kx6Var, j11Var).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        float f;
        int i = this.X;
        o27 o27Var = o27.a;
        by5 by5Var = this.Z;
        Object obj2 = this.c0;
        kx6 kx6Var = this.d0;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    xh xhVar = new xh(by5Var, obj2, kx6Var, (j11) null);
                    this.Y = 1;
                    if (iq2.k(xhVar, this) == p31Var) {
                        return p31Var;
                    }
                }
                kx6Var.i();
                return o27Var;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    by5Var.t();
                    tj4 tj4Var = by5Var.b;
                    by5Var.m = Long.MIN_VALUE;
                    by5Var.x(RecyclerView.A1);
                    if (obj2.equals(by5Var.c.getValue())) {
                        f = -4.0f;
                    } else if (obj2.equals(tj4Var.getValue())) {
                        f = -5.0f;
                    } else {
                        f = -3.0f;
                    }
                    kx6Var.p(obj2);
                    kx6Var.n(0L);
                    tj4Var.setValue(obj2);
                    by5Var.x(RecyclerView.A1);
                    by5Var.l(obj2);
                    kx6Var.j(f);
                    if (f == -3.0f) {
                        this.Y = 1;
                        if (by5.r(by5Var, this) == p31Var2) {
                            return p31Var2;
                        }
                    }
                }
                kx6Var.i();
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx5(by5 by5Var, Object obj, kx6 kx6Var, j11 j11Var) {
        super(1, j11Var);
        this.Z = by5Var;
        this.c0 = obj;
        this.d0 = kx6Var;
    }
}
