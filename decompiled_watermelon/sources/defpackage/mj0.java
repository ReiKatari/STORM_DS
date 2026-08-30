package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mj0  reason: default package */
/* loaded from: classes.dex */
public final class mj0 extends nj0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(mj0.class, "consumed$volatile");
    public final lj0 R;
    public final boolean X;
    private volatile /* synthetic */ int consumed$volatile;

    public /* synthetic */ mj0(lj0 lj0Var, boolean z) {
        this(lj0Var, z, mp1.A, -3, h60.SUSPEND);
    }

    @Override // defpackage.nj0, defpackage.u92
    public final Object a(w92 w92Var, j11 j11Var) {
        if (this.B == -3) {
            boolean z = this.X;
            if (z && Y.getAndSet(this, 1) == 1) {
                i.n("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object a = sf7.a(w92Var, this.R, z, j11Var);
            if (a == p31.COROUTINE_SUSPENDED) {
                return a;
            }
        } else {
            Object a2 = super.a(w92Var, j11Var);
            if (a2 == p31.COROUTINE_SUSPENDED) {
                return a2;
            }
        }
        return o27.a;
    }

    @Override // defpackage.nj0
    public final String e() {
        return "channel=" + this.R;
    }

    @Override // defpackage.nj0
    public final Object f(nu4 nu4Var, j11 j11Var) {
        Object a = sf7.a(new a06(nu4Var), this.R, this.X, j11Var);
        if (a == p31.COROUTINE_SUSPENDED) {
            return a;
        }
        return o27.a;
    }

    @Override // defpackage.nj0
    public final nj0 g(e31 e31Var, int i, h60 h60Var) {
        return new mj0(this.R, this.X, e31Var, i, h60Var);
    }

    @Override // defpackage.nj0
    public final u92 h() {
        return new mj0(this.R, this.X);
    }

    @Override // defpackage.nj0
    public final lj0 i(o31 o31Var) {
        if (this.X && Y.getAndSet(this, 1) == 1) {
            i.n("ReceiveChannel.consumeAsFlow can be collected just once");
            return null;
        } else if (this.B == -3) {
            return this.R;
        } else {
            return super.i(o31Var);
        }
    }

    public mj0(lj0 lj0Var, boolean z, e31 e31Var, int i, h60 h60Var) {
        super(e31Var, i, h60Var);
        this.R = lj0Var;
        this.X = z;
    }
}
