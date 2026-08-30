package cd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends dd.e {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(d.class, "consumed$volatile");
    public final bd.l R;
    public final boolean X;
    private volatile /* synthetic */ int consumed$volatile;

    public /* synthetic */ d(bd.l lVar, boolean z10) {
        this(lVar, z10, cc.h.A, -3, bd.a.SUSPEND);
    }

    @Override // dd.e, cd.h
    public final Object c(i iVar, cc.c cVar) {
        if (this.B == -3) {
            boolean z10 = this.X;
            if (z10 && Y.getAndSet(this, 1) == 1) {
                a0.j.p("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object p10 = q.p(iVar, this.R, z10, cVar);
            if (p10 == dc.a.COROUTINE_SUSPENDED) {
                return p10;
            }
        } else {
            Object c4 = super.c(iVar, cVar);
            if (c4 == dc.a.COROUTINE_SUSPENDED) {
                return c4;
            }
        }
        return yb.y.f14813a;
    }

    @Override // dd.e
    public final String d() {
        return "channel=" + this.R;
    }

    @Override // dd.e
    public final Object e(bd.v vVar, cc.c cVar) {
        Object p10 = q.p(new dd.y(vVar), this.R, this.X, cVar);
        if (p10 == dc.a.COROUTINE_SUSPENDED) {
            return p10;
        }
        return yb.y.f14813a;
    }

    @Override // dd.e
    public final dd.e f(cc.g gVar, int i2, bd.a aVar) {
        return new d(this.R, this.X, gVar, i2, aVar);
    }

    @Override // dd.e
    public final h g() {
        return new d(this.R, this.X);
    }

    @Override // dd.e
    public final bd.l h(zc.u uVar) {
        if (this.X && Y.getAndSet(this, 1) == 1) {
            a0.j.p("ReceiveChannel.consumeAsFlow can be collected just once");
            return null;
        } else if (this.B == -3) {
            return this.R;
        } else {
            return super.h(uVar);
        }
    }

    public d(bd.l lVar, boolean z10, cc.g gVar, int i2, bd.a aVar) {
        super(gVar, i2, aVar);
        this.R = lVar;
        this.X = z10;
    }
}
