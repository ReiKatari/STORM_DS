package ed;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zc.e0;
import zc.l0;
import zc.n1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends e0 implements ec.d, cc.c {

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4453b0 = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    public final zc.q R;
    public final ec.c X;
    public Object Y;
    public final Object Z;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    public f(zc.q qVar, ec.c cVar) {
        super(-1);
        this.R = qVar;
        this.X = cVar;
        this.Y = b.f4446b;
        this.Z = b.m(cVar.g());
    }

    @Override // ec.d
    public final ec.d f() {
        return this.X;
    }

    @Override // cc.c
    public final cc.g g() {
        return this.X.g();
    }

    @Override // cc.c
    public final void h(Object obj) {
        Object oVar;
        Throwable a10 = yb.l.a(obj);
        if (a10 == null) {
            oVar = obj;
        } else {
            oVar = new zc.o(a10, false);
        }
        ec.c cVar = this.X;
        cc.g g10 = cVar.g();
        zc.q qVar = this.R;
        if (b.j(qVar, g10)) {
            this.Y = oVar;
            this.L = 0;
            b.i(qVar, cVar.g(), this);
            return;
        }
        l0 a11 = n1.a();
        if (a11.L >= 4294967296L) {
            this.Y = oVar;
            this.L = 0;
            a11.c0(this);
            return;
        }
        a11.d0(true);
        try {
            cc.g g11 = cVar.g();
            Object n10 = b.n(g11, this.Z);
            cVar.h(obj);
            b.g(g11, n10);
            do {
            } while (a11.f0());
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // zc.e0
    public final Object k() {
        Object obj = this.Y;
        this.Y = b.f4446b;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.R + ", " + zc.x.B(this.X) + ']';
    }

    @Override // zc.e0
    public final cc.c c() {
        return this;
    }
}
