package cd;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q1 extends dd.b implements h, dd.s, o1, w0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(q1.class, Object.class, "_state$volatile");
    public int X;
    private volatile /* synthetic */ Object _state$volatile;

    public q1(Object obj) {
        this._state$volatile = obj;
    }

    @Override // cd.w0, cd.i
    public final Object a(Object obj, cc.c cVar) {
        j(obj);
        return yb.y.f14813a;
    }

    @Override // dd.s
    public final h b(cc.g gVar, int i2, bd.a aVar) {
        if (((i2 >= 0 && i2 < 2) || i2 == -2) && aVar == bd.a.DROP_OLDEST) {
            return this;
        }
        return q.u(this, gVar, i2, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
        if (((cd.t1) r0).b(r3) == r4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
        if (r0.equals(r2) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0112, code lost:
        if (r2 == r4) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0039, B:36:0x0096, B:38:0x009e, B:41:0x00a5, B:42:0x00a9, B:44:0x00ac, B:54:0x00cd, B:57:0x00dd, B:58:0x00f9, B:64:0x0109, B:61:0x0100, B:63:0x0106, B:46:0x00b2, B:50:0x00b9, B:21:0x0051, B:24:0x005c, B:35:0x0086), top: B:73:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0039, B:36:0x0096, B:38:0x009e, B:41:0x00a5, B:42:0x00a9, B:44:0x00ac, B:54:0x00cd, B:57:0x00dd, B:58:0x00f9, B:64:0x0109, B:61:0x0100, B:63:0x0106, B:46:0x00b2, B:50:0x00b9, B:21:0x0051, B:24:0x005c, B:35:0x0086), top: B:73:0x0027 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00dc -> B:36:0x0096). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0112 -> B:36:0x0096). Please submit an issue!!! */
    @Override // cd.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(cd.i r18, cc.c r19) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.q1.c(cd.i, cc.c):java.lang.Object");
    }

    @Override // dd.b
    public final dd.d e() {
        return new r1();
    }

    @Override // dd.b
    public final dd.d[] f() {
        return new r1[2];
    }

    @Override // cd.o1
    public final Object getValue() {
        a0.c cVar = dd.c.f4036b;
        Object obj = Y.get(this);
        if (obj == cVar) {
            return null;
        }
        return obj;
    }

    public final boolean i(Object obj, Object obj2) {
        a0.c cVar = dd.c.f4036b;
        if (obj == null) {
            obj = cVar;
        }
        if (obj2 == null) {
            obj2 = cVar;
        }
        return k(obj, obj2);
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = dd.c.f4036b;
        }
        k(null, obj);
    }

    public final boolean k(Object obj, Object obj2) {
        int i2;
        dd.d[] dVarArr;
        a0.c cVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !nc.k.a(obj3, obj)) {
                return false;
            }
            if (nc.k.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.X;
            if ((i10 & 1) == 0) {
                int i11 = i10 + 1;
                this.X = i11;
                dd.d[] dVarArr2 = this.A;
                while (true) {
                    r1[] r1VarArr = (r1[]) dVarArr2;
                    if (r1VarArr != null) {
                        for (r1 r1Var : r1VarArr) {
                            if (r1Var != null) {
                                AtomicReference atomicReference = r1Var.f2859a;
                                while (true) {
                                    Object obj4 = atomicReference.get();
                                    if (obj4 != null && obj4 != (cVar = q.f2857d)) {
                                        a0.c cVar2 = q.f2856c;
                                        if (obj4 == cVar2) {
                                            while (!atomicReference.compareAndSet(obj4, cVar)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj4, cVar2)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                            ((zc.h) obj4).h(yb.y.f14813a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i2 = this.X;
                        if (i2 == i11) {
                            this.X = i11 + 1;
                            return true;
                        }
                        dVarArr = this.A;
                    }
                    dVarArr2 = dVarArr;
                    i11 = i2;
                }
            } else {
                this.X = i10 + 2;
                return true;
            }
        }
    }

    @Override // cd.w0
    public final void m() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // cd.w0
    public final boolean p(Object obj) {
        k(null, obj);
        return true;
    }
}
