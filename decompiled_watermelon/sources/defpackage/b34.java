package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b34  reason: default package */
/* loaded from: classes.dex */
public final class b34 extends vz5 implements z24 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e0 = AtomicReferenceFieldUpdater.newUpdater(b34.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long f0 = ys5.a.objectFieldOffset(b34.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public b34() {
        super(1);
        this.owner$volatile = c34.a;
    }

    @Override // defpackage.z24
    public final void d(Object obj) {
        while (this.f()) {
            e0.getClass();
            Unsafe unsafe = ys5.a;
            long j = f0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            an1 an1Var = c34.a;
            if (objectVolatile != an1Var) {
                if (objectVolatile != obj && obj != null) {
                    f81.m("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    Unsafe unsafe2 = ys5.a;
                    b34 b34Var = this;
                    if (unsafe2.compareAndSwapObject(b34Var, f0, objectVolatile, an1Var)) {
                        b34Var.c();
                        return;
                    } else if (unsafe2.getObjectVolatile(b34Var, j) != objectVolatile) {
                        this = b34Var;
                        break;
                    } else {
                        this = b34Var;
                    }
                }
            }
        }
        i.n("This mutex is not locked");
    }

    public final boolean f() {
        if (Math.max(vz5.Z.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        int h = h();
        if (h == 0) {
            return true;
        }
        if (h != 1) {
            if (h != 2) {
                i.n("unexpected");
                return false;
            }
            c44.e("This mutex is already locked by the specified owner: null");
            return false;
        }
        return false;
    }

    public final int h() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = vz5.Z;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.A;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else if (i2 <= 0) {
                return 1;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    e0.getClass();
                    ys5.a.putObjectVolatile(this, f0, (Object) null);
                    return 0;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        r5 = defpackage.b34.e0;
        r2 = r0.B;
        r5.set(r2, null);
        r5 = r0.A;
        r5.G(r1, r5.L, new defpackage.km4(4, new defpackage.kb2(13, r2, r0)));
     */
    @Override // defpackage.z24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.j11 r6) {
        /*
            r5 = this;
            boolean r0 = r5.g()
            o27 r1 = defpackage.o27.a
            if (r0 == 0) goto L9
            goto L52
        L9:
            j11 r6 = defpackage.nk2.J(r6)
            ih0 r6 = defpackage.b53.O(r6)
            a34 r0 = new a34     // Catch: java.lang.Throwable -> L53
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L53
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.vz5.Z     // Catch: java.lang.Throwable -> L53
            int r2 = r2.getAndDecrement(r5)     // Catch: java.lang.Throwable -> L53
            int r3 = r5.A     // Catch: java.lang.Throwable -> L53
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L3f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.b34.e0     // Catch: java.lang.Throwable -> L53
            b34 r2 = r0.B     // Catch: java.lang.Throwable -> L53
            r3 = 0
            r5.set(r2, r3)     // Catch: java.lang.Throwable -> L53
            ih0 r5 = r0.A     // Catch: java.lang.Throwable -> L53
            kb2 r3 = new kb2     // Catch: java.lang.Throwable -> L53
            r4 = 13
            r3.<init>(r4, r2, r0)     // Catch: java.lang.Throwable -> L53
            int r0 = r5.L     // Catch: java.lang.Throwable -> L53
            km4 r2 = new km4     // Catch: java.lang.Throwable -> L53
            r4 = 4
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L53
            r5.G(r1, r0, r2)     // Catch: java.lang.Throwable -> L53
            goto L45
        L3f:
            boolean r2 = r5.b(r0)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L16
        L45:
            java.lang.Object r5 = r6.v()
            p31 r6 = defpackage.p31.COROUTINE_SUSPENDED
            if (r5 != r6) goto L4e
            goto L4f
        L4e:
            r5 = r1
        L4f:
            if (r5 != r6) goto L52
            return r5
        L52:
            return r1
        L53:
            r5 = move-exception
            r6.E()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b34.i(j11):java.lang.Object");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(w81.s(this));
        sb.append("[isLocked=");
        sb.append(f());
        sb.append(",owner=");
        e0.getClass();
        sb.append(ys5.a.getObjectVolatile(this, f0));
        sb.append(']');
        return sb.toString();
    }
}
