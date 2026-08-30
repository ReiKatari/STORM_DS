package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ee6  reason: default package */
/* loaded from: classes.dex */
public final class ee6 extends s1 implements u92, nj2, ce6, h24 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(ee6.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long Z = ys5.a.objectFieldOffset(ee6.class.getDeclaredField("_state$volatile"));
    public int X;
    private volatile /* synthetic */ Object _state$volatile;

    public ee6(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
        if (r0.equals(r11) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0116, code lost:
        if (r11 == r4) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0041: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:17:0x0041 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:35:0x0096, B:37:0x009e, B:40:0x00a5, B:41:0x00a9, B:43:0x00ac, B:54:0x00d1, B:57:0x00e1, B:58:0x00fd, B:64:0x010d, B:61:0x0104, B:63:0x010a, B:45:0x00b2, B:49:0x00b9, B:24:0x005f, B:34:0x0087, B:29:0x0070, B:31:0x0074), top: B:72:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1 A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:35:0x0096, B:37:0x009e, B:40:0x00a5, B:41:0x00a9, B:43:0x00ac, B:54:0x00d1, B:57:0x00e1, B:58:0x00fd, B:64:0x010d, B:61:0x0104, B:63:0x010a, B:45:0x00b2, B:49:0x00b9, B:24:0x005f, B:34:0x0087, B:29:0x0070, B:31:0x0074), top: B:72:0x0028 }] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [s1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [ge6] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2, types: [t1] */
    /* JADX WARN: Type inference failed for: r5v7, types: [ge6] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00e0 -> B:35:0x0096). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0116 -> B:35:0x0096). Please submit an issue!!! */
    @Override // defpackage.u92
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.w92 r17, defpackage.j11 r18) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee6.a(w92, j11):java.lang.Object");
    }

    @Override // defpackage.h24, defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        k(obj);
        return o27.a;
    }

    @Override // defpackage.nj2
    public final u92 c(e31 e31Var, int i, h60 h60Var) {
        if (((i < 0 || i >= 2) && i != -2) || h60Var != h60.DROP_OLDEST) {
            return d46.d(this, e31Var, i, h60Var);
        }
        return this;
    }

    @Override // defpackage.h24
    public final void d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.s1
    public final t1 f() {
        return new ge6();
    }

    @Override // defpackage.s1
    public final t1[] g() {
        return new ge6[2];
    }

    @Override // defpackage.ce6
    public final Object getValue() {
        Y.getClass();
        Object objectVolatile = ys5.a.getObjectVolatile(this, Z);
        if (objectVolatile == n84.a) {
            return null;
        }
        return objectVolatile;
    }

    public final boolean j(Object obj, Object obj2) {
        an1 an1Var = n84.a;
        if (obj == null) {
            obj = an1Var;
        }
        if (obj2 == null) {
            obj2 = an1Var;
        }
        return l(obj, obj2);
    }

    public final void k(Object obj) {
        if (obj == null) {
            obj = n84.a;
        }
        l(null, obj);
    }

    public final boolean l(Object obj, Object obj2) {
        int i;
        t1[] t1VarArr;
        an1 an1Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !b53.x(obj3, obj)) {
                return false;
            }
            if (b53.x(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.X;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.X = i3;
                t1[] t1VarArr2 = this.A;
                while (true) {
                    ge6[] ge6VarArr = (ge6[]) t1VarArr2;
                    if (ge6VarArr != null) {
                        for (ge6 ge6Var : ge6VarArr) {
                            if (ge6Var != null) {
                                AtomicReference atomicReference = ge6Var.a;
                                while (true) {
                                    Object obj4 = atomicReference.get();
                                    if (obj4 != null && obj4 != (an1Var = fe6.b)) {
                                        an1 an1Var2 = fe6.a;
                                        if (obj4 == an1Var2) {
                                            while (!atomicReference.compareAndSet(obj4, an1Var)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj4, an1Var2)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                            ((ih0) obj4).k(o27.a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.X;
                        if (i == i3) {
                            this.X = i3 + 1;
                            return true;
                        }
                        t1VarArr = this.A;
                    }
                    t1VarArr2 = t1VarArr;
                    i3 = i;
                }
            } else {
                this.X = i2 + 2;
                return true;
            }
        }
    }

    @Override // defpackage.h24
    public final boolean p(Object obj) {
        k(obj);
        return true;
    }
}
