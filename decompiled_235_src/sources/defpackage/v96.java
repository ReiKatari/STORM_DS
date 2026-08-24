package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v96  reason: default package */
/* loaded from: classes.dex */
public final class v96 implements lj0, zr7 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(v96.class, Object.class, "state$volatile");
    public static final /* synthetic */ long Z = v36.a.objectFieldOffset(v96.class.getDeclaredField("state$volatile"));
    public final l61 A;
    public Object L;
    private volatile /* synthetic */ Object state$volatile = w96.a;
    public ArrayList B = new ArrayList(2);
    public int R = -1;
    public Object X = w96.d;

    public v96(l61 l61Var) {
        this.A = l61Var;
    }

    @Override // defpackage.zr7
    public final void a(p96 p96Var, int i) {
        this.L = p96Var;
        this.R = i;
    }

    @Override // defpackage.lj0
    public final void b(Throwable th) {
        v96 v96Var;
        while (true) {
            Y.getClass();
            Unsafe unsafe = v36.a;
            long j = Z;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == w96.b) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = v36.a;
                v96Var = this;
                if (unsafe2.compareAndSwapObject(v96Var, Z, objectVolatile, w96.c)) {
                    ArrayList arrayList = v96Var.B;
                    if (arrayList == null) {
                        return;
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((t96) obj).a();
                    }
                    v96Var.X = w96.d;
                    v96Var.B = null;
                    return;
                } else if (unsafe2.getObjectVolatile(v96Var, j) != objectVolatile) {
                    break;
                } else {
                    this = v96Var;
                }
            }
            this = v96Var;
        }
    }

    public final void c(t96 t96Var) {
        ArrayList arrayList = this.B;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            t96 t96Var2 = (t96) obj;
            if (t96Var2 != t96Var) {
                t96Var2.a();
            }
        }
        Y.getClass();
        v36.a.putObjectVolatile(this, Z, w96.b);
        this.X = w96.d;
        this.B = null;
    }

    public final Object d(s41 s41Var) {
        Y.getClass();
        Object objectVolatile = v36.a.getObjectVolatile(this, Z);
        objectVolatile.getClass();
        t96 t96Var = (t96) objectVolatile;
        Object obj = this.X;
        c(t96Var);
        fo2 fo2Var = t96Var.c;
        Object obj2 = t96Var.a;
        Object obj3 = t96Var.d;
        Object e = fo2Var.e(obj2, obj3, obj);
        hw6 hw6Var = t96Var.e;
        if (obj3 == w96.e) {
            return ((qn2) hw6Var).g(s41Var);
        }
        return ((eo2) hw6Var).o(e, s41Var);
    }

    public final Object e(hw6 hw6Var) {
        if (i()) {
            return d(hw6Var);
        }
        return f(hw6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (m(r0) == r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(s41 s41Var) {
        u96 u96Var;
        x61 x61Var;
        int i;
        Object d;
        if (s41Var instanceof u96) {
            u96Var = (u96) s41Var;
            int i2 = u96Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u96Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = u96Var.X;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = u96Var.Z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            return obj;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = u96Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    u96Var.R = this;
                    u96Var.Z = 1;
                }
                u96Var.R = null;
                u96Var.Z = 2;
                d = this.d(u96Var);
                if (d != x61Var) {
                    return x61Var;
                }
                return d;
            }
        }
        u96Var = new u96(this, s41Var);
        Object obj2 = u96Var.X;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = u96Var.Z;
        if (i == 0) {
        }
        u96Var.R = null;
        u96Var.Z = 2;
        d = this.d(u96Var);
        if (d != x61Var) {
        }
    }

    public final t96 g(Object obj) {
        ArrayList arrayList = this.B;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj3 = arrayList.get(i);
            i++;
            if (((t96) obj3).a == obj) {
                obj2 = obj3;
                break;
            }
        }
        t96 t96Var = (t96) obj2;
        if (t96Var != null) {
            return t96Var;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void h(eb ebVar, eo2 eo2Var) {
        j(new t96(this, ebVar.B, (fo2) ebVar.L, (fo2) ebVar.R, null, (hw6) eo2Var, (fo2) ebVar.X), false);
    }

    public final boolean i() {
        Y.getClass();
        return v36.a.getObjectVolatile(this, Z) instanceof t96;
    }

    public final void j(t96 t96Var, boolean z) {
        Object obj = t96Var.a;
        Y.getClass();
        Unsafe unsafe = v36.a;
        long j = Z;
        if (unsafe.getObjectVolatile(this, j) instanceof t96) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.B;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((t96) obj2).a == obj) {
                        u34.i(obj, "Cannot use select clauses on the same object: ");
                        return;
                    }
                }
            }
        }
        t96Var.b.e(obj, this, t96Var.d);
        if (this.X == w96.d) {
            if (!z) {
                ArrayList arrayList2 = this.B;
                arrayList2.getClass();
                arrayList2.add(t96Var);
            }
            t96Var.g = this.L;
            t96Var.h = this.R;
            this.L = null;
            this.R = -1;
            return;
        }
        v36.a.putObjectVolatile(this, j, t96Var);
    }

    public final boolean k(Object obj, Object obj2) {
        if (l(obj, obj2) == 0) {
            return true;
        }
        return false;
    }

    public final int l(Object obj, Object obj2) {
        v96 v96Var;
        Unsafe unsafe;
        Unsafe unsafe2;
        fo2 fo2Var;
        while (true) {
            Y.getClass();
            Unsafe unsafe3 = v36.a;
            long j = Z;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof qj0) {
                t96 g = this.g(obj);
                if (g != null) {
                    fo2 fo2Var2 = g.f;
                    if (fo2Var2 != null) {
                        fo2Var = (fo2) fo2Var2.e(this, g.d, obj2);
                    } else {
                        fo2Var = null;
                    }
                    while (true) {
                        Unsafe unsafe4 = v36.a;
                        v96Var = this;
                        if (unsafe4.compareAndSwapObject(v96Var, Z, objectVolatile, g)) {
                            qj0 qj0Var = (qj0) objectVolatile;
                            v96Var.X = obj2;
                            gr1 j2 = qj0Var.j(jg7.a, fo2Var);
                            if (j2 == null) {
                                v96Var.X = w96.d;
                                return 2;
                            }
                            qj0Var.y(j2);
                            return 0;
                        } else if (unsafe4.getObjectVolatile(v96Var, j) != objectVolatile) {
                            break;
                        } else {
                            this = v96Var;
                        }
                    }
                } else {
                    continue;
                }
            } else {
                v96Var = this;
                if (!nb3.k(objectVolatile, w96.b) && !(objectVolatile instanceof t96)) {
                    if (nb3.k(objectVolatile, w96.c)) {
                        return 2;
                    }
                    if (nb3.k(objectVolatile, w96.a)) {
                        List b0 = hf.b0(obj);
                        do {
                            unsafe2 = v36.a;
                            if (unsafe2.compareAndSwapObject(v96Var, Z, objectVolatile, b0)) {
                                return 1;
                            }
                        } while (unsafe2.getObjectVolatile(v96Var, j) == objectVolatile);
                    } else if (objectVolatile instanceof List) {
                        ArrayList U0 = gt0.U0(obj, (Collection) objectVolatile);
                        do {
                            unsafe = v36.a;
                            if (unsafe.compareAndSwapObject(v96Var, Z, objectVolatile, U0)) {
                                return 1;
                            }
                        } while (unsafe.getObjectVolatile(v96Var, j) == objectVolatile);
                    } else {
                        e41.h(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                } else {
                    return 3;
                }
            }
            this = v96Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
        r0 = r10.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (r0 != defpackage.x61.COROUTINE_SUSPENDED) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(u96 u96Var) {
        rj0 rj0Var;
        rj0 rj0Var2 = new rj0(1, np2.V(u96Var));
        rj0Var2.v();
        loop0: while (true) {
            Y.getClass();
            Unsafe unsafe = v36.a;
            long j = Z;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            jg7 jg7Var = jg7.a;
            rj0 rj0Var3 = rj0Var2;
            gr1 gr1Var = w96.a;
            if (objectVolatile == gr1Var) {
                rj0 rj0Var4 = rj0Var3;
                while (true) {
                    Unsafe unsafe2 = v36.a;
                    rj0Var = rj0Var4;
                    if (unsafe2.compareAndSwapObject(this, Z, objectVolatile, rj0Var4)) {
                        rj0Var.A(this);
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) != objectVolatile) {
                        break;
                    } else {
                        rj0Var4 = rj0Var;
                    }
                }
            } else {
                rj0Var = rj0Var3;
                fo2 fo2Var = null;
                if (objectVolatile instanceof List) {
                    while (true) {
                        Unsafe unsafe3 = v36.a;
                        if (unsafe3.compareAndSwapObject(this, Z, objectVolatile, gr1Var)) {
                            for (Object obj : (Iterable) objectVolatile) {
                                t96 g = g(obj);
                                g.getClass();
                                g.g = null;
                                g.h = -1;
                                j(g, true);
                            }
                        } else if (unsafe3.getObjectVolatile(this, j) != objectVolatile) {
                            break;
                        }
                    }
                    rj0Var2 = rj0Var;
                } else if (objectVolatile instanceof t96) {
                    t96 t96Var = (t96) objectVolatile;
                    Object obj2 = this.X;
                    fo2 fo2Var2 = t96Var.f;
                    if (fo2Var2 != null) {
                        fo2Var = (fo2) fo2Var2.e(this, t96Var.d, obj2);
                    }
                    rj0Var.t(jg7Var, fo2Var);
                } else {
                    e41.h(objectVolatile, "unexpected state: ");
                    return null;
                }
            }
        }
    }
}
