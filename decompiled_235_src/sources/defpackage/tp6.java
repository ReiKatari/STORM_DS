package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tp6  reason: default package */
/* loaded from: classes.dex */
public final class tp6 extends t1 implements le2, ro2, rp6, na4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(tp6.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long Z = v36.a.objectFieldOffset(tp6.class.getDeclaredField("_state$volatile"));
    public int X;
    private volatile /* synthetic */ Object _state$volatile;

    public tp6(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.na4, defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        l(obj);
        return jg7.a;
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
    /* JADX WARN: Type inference failed for: r1v2, types: [t1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [vp6] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2, types: [u1] */
    /* JADX WARN: Type inference failed for: r5v7, types: [vp6] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00e0 -> B:35:0x0096). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0116 -> B:35:0x0096). Please submit an issue!!! */
    @Override // defpackage.le2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ne2 ne2Var, r41 r41Var) {
        sp6 sp6Var;
        x61 x61Var;
        vp6 vp6Var;
        tp6 tp6Var;
        ne2 ne2Var2;
        vp6 vp6Var2;
        rc3 rc3Var;
        Object obj;
        rc3 rc3Var2;
        Object andSet;
        Object obj2;
        Object obj3;
        tp6 tp6Var2;
        tp6 tp6Var3 = this;
        ne2 ne2Var3 = ne2Var;
        try {
            if (r41Var instanceof sp6) {
                sp6Var = (sp6) r41Var;
                int i = sp6Var.g0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    sp6Var.g0 = i - Integer.MIN_VALUE;
                    Object obj4 = sp6Var.e0;
                    x61Var = x61.COROUTINE_SUSPENDED;
                    vp6Var = sp6Var.g0;
                    if (vp6Var == 0) {
                        if (vp6Var != 1) {
                            try {
                                if (vp6Var != 2) {
                                    if (vp6Var == 3) {
                                        obj = sp6Var.d0;
                                        rc3 rc3Var3 = sp6Var.Z;
                                        vp6Var = sp6Var.Y;
                                        ne2Var2 = sp6Var.X;
                                        tp6 tp6Var4 = sp6Var.R;
                                        oi2.Y(obj4);
                                        rc3Var2 = rc3Var3;
                                        tp6Var3 = tp6Var4;
                                        obj2 = Y.get(tp6Var3);
                                        if (rc3Var2 != null && !rc3Var2.e()) {
                                            throw rc3Var2.v();
                                        }
                                        if (obj2 == fh4.a) {
                                            obj3 = null;
                                        } else {
                                            obj3 = obj2;
                                        }
                                        sp6Var.R = tp6Var3;
                                        sp6Var.X = ne2Var2;
                                        sp6Var.Y = vp6Var;
                                        sp6Var.Z = rc3Var2;
                                        sp6Var.d0 = obj2;
                                        sp6Var.g0 = 2;
                                        if (ne2Var2.a(obj3, sp6Var) != x61Var) {
                                            obj = obj2;
                                            tp6Var = tp6Var3;
                                            rc3Var = rc3Var2;
                                            vp6Var2 = vp6Var;
                                            rc3Var2 = rc3Var;
                                            tp6Var3 = tp6Var;
                                            vp6Var = vp6Var2;
                                            AtomicReference atomicReference = vp6Var.a;
                                            gr1 gr1Var = up6.a;
                                            andSet = atomicReference.getAndSet(gr1Var);
                                            andSet.getClass();
                                            if (andSet == up6.b) {
                                                sp6Var.R = tp6Var3;
                                                sp6Var.X = ne2Var2;
                                                sp6Var.Y = vp6Var;
                                                sp6Var.Z = rc3Var2;
                                                sp6Var.d0 = obj;
                                                sp6Var.g0 = 3;
                                                Object obj5 = jg7.a;
                                                rj0 rj0Var = new rj0(1, np2.V(sp6Var));
                                                rj0Var.v();
                                                AtomicReference atomicReference2 = vp6Var.a;
                                                while (true) {
                                                    if (!atomicReference2.compareAndSet(gr1Var, rj0Var)) {
                                                        if (atomicReference2.get() != gr1Var) {
                                                            rj0Var.i(obj5);
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                                Object s = rj0Var.s();
                                                if (s == x61.COROUTINE_SUSPENDED) {
                                                    obj5 = s;
                                                }
                                            }
                                            obj2 = Y.get(tp6Var3);
                                            if (rc3Var2 != null) {
                                                throw rc3Var2.v();
                                            }
                                            if (obj2 == fh4.a) {
                                            }
                                            sp6Var.R = tp6Var3;
                                            sp6Var.X = ne2Var2;
                                            sp6Var.Y = vp6Var;
                                            sp6Var.Z = rc3Var2;
                                            sp6Var.d0 = obj2;
                                            sp6Var.g0 = 2;
                                            if (ne2Var2.a(obj3, sp6Var) != x61Var) {
                                            }
                                        } else {
                                            return x61Var;
                                        }
                                    } else {
                                        i.m("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                } else {
                                    obj = sp6Var.d0;
                                    rc3Var = sp6Var.Z;
                                    vp6 vp6Var3 = sp6Var.Y;
                                    ne2Var2 = sp6Var.X;
                                    tp6Var = sp6Var.R;
                                    oi2.Y(obj4);
                                    vp6Var2 = vp6Var3;
                                    rc3Var2 = rc3Var;
                                    tp6Var3 = tp6Var;
                                    vp6Var = vp6Var2;
                                    AtomicReference atomicReference3 = vp6Var.a;
                                    gr1 gr1Var2 = up6.a;
                                    andSet = atomicReference3.getAndSet(gr1Var2);
                                    andSet.getClass();
                                    if (andSet == up6.b) {
                                    }
                                    obj2 = Y.get(tp6Var3);
                                    if (rc3Var2 != null) {
                                    }
                                    if (obj2 == fh4.a) {
                                    }
                                    sp6Var.R = tp6Var3;
                                    sp6Var.X = ne2Var2;
                                    sp6Var.Y = vp6Var;
                                    sp6Var.Z = rc3Var2;
                                    sp6Var.d0 = obj2;
                                    sp6Var.g0 = 2;
                                    if (ne2Var2.a(obj3, sp6Var) != x61Var) {
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                tp6Var3 = tp6Var2;
                                tp6Var3.g(vp6Var);
                                throw th;
                            }
                        } else {
                            vp6 vp6Var4 = sp6Var.Y;
                            ne2Var3 = sp6Var.X;
                            tp6Var3 = sp6Var.R;
                            oi2.Y(obj4);
                            vp6Var = vp6Var4;
                        }
                    } else {
                        oi2.Y(obj4);
                        vp6 vp6Var5 = (vp6) tp6Var3.d();
                        vp6Var = vp6Var5;
                        if (ne2Var3 instanceof ut6) {
                            sp6Var.R = tp6Var3;
                            sp6Var.X = ne2Var3;
                            sp6Var.Y = vp6Var5;
                            sp6Var.g0 = 1;
                            vp6Var = vp6Var5;
                            if (((ut6) ne2Var3).b(sp6Var) == x61Var) {
                                return x61Var;
                            }
                        }
                    }
                    l61 l61Var = sp6Var.B;
                    l61Var.getClass();
                    rc3Var2 = (rc3) l61Var.Z(vs0.h0);
                    ne2Var2 = ne2Var3;
                    obj = null;
                    obj2 = Y.get(tp6Var3);
                    if (rc3Var2 != null) {
                    }
                    if (obj2 == fh4.a) {
                    }
                    sp6Var.R = tp6Var3;
                    sp6Var.X = ne2Var2;
                    sp6Var.Y = vp6Var;
                    sp6Var.Z = rc3Var2;
                    sp6Var.d0 = obj2;
                    sp6Var.g0 = 2;
                    if (ne2Var2.a(obj3, sp6Var) != x61Var) {
                    }
                }
            }
            if (vp6Var == 0) {
            }
            l61 l61Var2 = sp6Var.B;
            l61Var2.getClass();
            rc3Var2 = (rc3) l61Var2.Z(vs0.h0);
            ne2Var2 = ne2Var3;
            obj = null;
            obj2 = Y.get(tp6Var3);
            if (rc3Var2 != null) {
            }
            if (obj2 == fh4.a) {
            }
            sp6Var.R = tp6Var3;
            sp6Var.X = ne2Var2;
            sp6Var.Y = vp6Var;
            sp6Var.Z = rc3Var2;
            sp6Var.d0 = obj2;
            sp6Var.g0 = 2;
            if (ne2Var2.a(obj3, sp6Var) != x61Var) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        sp6Var = new sp6(tp6Var3, r41Var);
        Object obj42 = sp6Var.e0;
        x61Var = x61.COROUTINE_SUSPENDED;
        vp6Var = sp6Var.g0;
    }

    @Override // defpackage.ro2
    public final le2 c(l61 l61Var, int i, m80 m80Var) {
        if (((i < 0 || i >= 2) && i != -2) || m80Var != m80.DROP_OLDEST) {
            return pf6.d(this, l61Var, i, m80Var);
        }
        return this;
    }

    @Override // defpackage.t1
    public final u1 e() {
        return new vp6();
    }

    @Override // defpackage.t1
    public final u1[] f() {
        return new vp6[2];
    }

    @Override // defpackage.rp6
    public final Object getValue() {
        Y.getClass();
        Object objectVolatile = v36.a.getObjectVolatile(this, Z);
        if (objectVolatile == fh4.a) {
            return null;
        }
        return objectVolatile;
    }

    @Override // defpackage.na4
    public final void h() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public final boolean j(Object obj, Object obj2) {
        gr1 gr1Var = fh4.a;
        if (obj == null) {
            obj = gr1Var;
        }
        if (obj2 == null) {
            obj2 = gr1Var;
        }
        return m(obj, obj2);
    }

    @Override // defpackage.na4
    public final boolean k(Object obj) {
        l(obj);
        return true;
    }

    public final void l(Object obj) {
        if (obj == null) {
            obj = fh4.a;
        }
        m(null, obj);
    }

    public final boolean m(Object obj, Object obj2) {
        int i;
        u1[] u1VarArr;
        gr1 gr1Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !nb3.k(obj3, obj)) {
                return false;
            }
            if (nb3.k(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.X;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.X = i3;
                u1[] u1VarArr2 = this.A;
                while (true) {
                    vp6[] vp6VarArr = (vp6[]) u1VarArr2;
                    if (vp6VarArr != null) {
                        for (vp6 vp6Var : vp6VarArr) {
                            if (vp6Var != null) {
                                AtomicReference atomicReference = vp6Var.a;
                                while (true) {
                                    Object obj4 = atomicReference.get();
                                    if (obj4 != null && obj4 != (gr1Var = up6.b)) {
                                        gr1 gr1Var2 = up6.a;
                                        if (obj4 == gr1Var2) {
                                            while (!atomicReference.compareAndSet(obj4, gr1Var)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj4, gr1Var2)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                            ((rj0) obj4).i(jg7.a);
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
                        u1VarArr = this.A;
                    }
                    u1VarArr2 = u1VarArr;
                    i3 = i;
                }
            } else {
                this.X = i2 + 2;
                return true;
            }
        }
    }
}
