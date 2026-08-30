package id;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends g implements a {

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7032b0 = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c() {
        super(1);
        this.owner$volatile = d.f7033a;
    }

    @Override // id.a
    public final void d(Object obj) {
        while (e()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7032b0;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            a0.c cVar = d.f7033a;
            if (obj2 != cVar) {
                if (obj2 != obj && obj != null) {
                    fj.j.j("This mutex is locked by ", obj2, ", but ", obj, " is expected");
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, cVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                c();
                return;
            }
        }
        a0.j.p("This mutex is not locked");
    }

    public final boolean e() {
        if (Math.max(g.Z.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        int i2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.Z;
            int i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = this.A;
            if (i10 > i11) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 > i11) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i11));
            } else if (i10 <= 0) {
                return false;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    f7032b0.set(this, null);
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        r2 = id.c.f7032b0;
        r3 = r0.B;
        r2.set(r3, null);
        r2 = r0.A;
        r2.E(r1, r2.L, new ai.q0(16, new a2.c(23, r3, r0)));
     */
    @Override // id.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(cc.c r7) {
        /*
            r6 = this;
            boolean r0 = r6.f()
            yb.y r1 = yb.y.f14813a
            if (r0 == 0) goto L9
            goto L53
        L9:
            cc.c r7 = pc.a.A(r7)
            zc.h r7 = zc.x.p(r7)
            id.b r0 = new id.b     // Catch: java.lang.Throwable -> L54
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L54
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = id.g.Z     // Catch: java.lang.Throwable -> L54
            int r2 = r2.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L54
            int r3 = r6.A     // Catch: java.lang.Throwable -> L54
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L40
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = id.c.f7032b0     // Catch: java.lang.Throwable -> L54
            id.c r3 = r0.B     // Catch: java.lang.Throwable -> L54
            r4 = 0
            r2.set(r3, r4)     // Catch: java.lang.Throwable -> L54
            zc.h r2 = r0.A     // Catch: java.lang.Throwable -> L54
            a2.c r4 = new a2.c     // Catch: java.lang.Throwable -> L54
            r5 = 23
            r4.<init>(r5, r3, r0)     // Catch: java.lang.Throwable -> L54
            int r0 = r2.L     // Catch: java.lang.Throwable -> L54
            ai.q0 r3 = new ai.q0     // Catch: java.lang.Throwable -> L54
            r5 = 16
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L54
            r2.E(r1, r0, r3)     // Catch: java.lang.Throwable -> L54
            goto L46
        L40:
            boolean r2 = r6.b(r0)     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L16
        L46:
            java.lang.Object r7 = r7.u()
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            if (r7 != r0) goto L4f
            goto L50
        L4f:
            r7 = r1
        L50:
            if (r7 != r0) goto L53
            return r7
        L53:
            return r1
        L54:
            r0 = move-exception
            r7.D()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.c.i(cc.c):java.lang.Object");
    }

    public final String toString() {
        return "Mutex@" + x.n(this) + "[isLocked=" + e() + ",owner=" + f7032b0.get(this) + ']';
    }
}
