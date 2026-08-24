package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vl0  reason: default package */
/* loaded from: classes.dex */
public final class vl0 extends wl0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(vl0.class, "consumed$volatile");
    public final ul0 R;
    public final boolean X;
    private volatile /* synthetic */ int consumed$volatile;

    public /* synthetic */ vl0(ul0 ul0Var, boolean z) {
        this(ul0Var, z, vt1.A, -3, m80.SUSPEND);
    }

    @Override // defpackage.wl0, defpackage.le2
    public final Object b(ne2 ne2Var, r41 r41Var) {
        if (this.B == -3) {
            boolean z = this.X;
            if (z && Y.getAndSet(this, 1) == 1) {
                i.m("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object D = g04.D(ne2Var, this.R, z, r41Var);
            if (D == x61.COROUTINE_SUSPENDED) {
                return D;
            }
        } else {
            Object b = super.b(ne2Var, r41Var);
            if (b == x61.COROUTINE_SUSPENDED) {
                return b;
            }
        }
        return jg7.a;
    }

    @Override // defpackage.wl0
    public final String d() {
        return "channel=" + this.R;
    }

    @Override // defpackage.wl0
    public final Object e(r35 r35Var, r41 r41Var) {
        Object D = g04.D(new pb6(r35Var), this.R, this.X, r41Var);
        if (D == x61.COROUTINE_SUSPENDED) {
            return D;
        }
        return jg7.a;
    }

    @Override // defpackage.wl0
    public final wl0 f(l61 l61Var, int i, m80 m80Var) {
        return new vl0(this.R, this.X, l61Var, i, m80Var);
    }

    @Override // defpackage.wl0
    public final le2 g() {
        return new vl0(this.R, this.X);
    }

    @Override // defpackage.wl0
    public final ul0 i(w61 w61Var) {
        if (this.X && Y.getAndSet(this, 1) == 1) {
            i.m("ReceiveChannel.consumeAsFlow can be collected just once");
            return null;
        } else if (this.B == -3) {
            return this.R;
        } else {
            return super.i(w61Var);
        }
    }

    public vl0(ul0 ul0Var, boolean z, l61 l61Var, int i, m80 m80Var) {
        super(l61Var, i, m80Var);
        this.R = ul0Var;
        this.X = z;
    }
}
