package hd;

import ec.j;
import ed.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m9.o;
import mc.l;
import mc.p;
import mc.q;
import nc.k;
import p7.t;
import yb.y;
import zc.v1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements zc.f, v1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state$volatile");
    public final cc.g A;
    public Object L;
    private volatile /* synthetic */ Object state$volatile = g.f6455a;
    public ArrayList B = new ArrayList(2);
    public int R = -1;
    public Object X = g.f6458d;

    public e(cc.g gVar) {
        this.A = gVar;
    }

    @Override // zc.f
    public final void a(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != g.f6456b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g.f6457c)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                ArrayList arrayList = this.B;
                if (arrayList == null) {
                    return;
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ((c) obj2).a();
                }
                this.X = g.f6458d;
                this.B = null;
                return;
            }
            return;
        }
    }

    @Override // zc.v1
    public final void b(r rVar, int i2) {
        this.L = rVar;
        this.R = i2;
    }

    public final Object c(ec.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
        Object obj = atomicReferenceFieldUpdater.get(this);
        obj.getClass();
        c cVar2 = (c) obj;
        Object obj2 = cVar2.f6449d;
        Object obj3 = this.X;
        ArrayList arrayList = this.B;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj4 = arrayList.get(i2);
                i2++;
                c cVar3 = (c) obj4;
                if (cVar3 != cVar2) {
                    cVar3.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, g.f6456b);
            this.X = g.f6458d;
            this.B = null;
        }
        Object i10 = cVar2.f6448c.i(cVar2.f6446a, obj2, obj3);
        j jVar = cVar2.f6450e;
        if (obj2 == g.f6459e) {
            return ((l) jVar).k(cVar);
        }
        return ((p) jVar).j(i10, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(ec.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof hd.d
            if (r0 == 0) goto L13
            r0 = r11
            hd.d r0 = (hd.d) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            hd.d r0 = new hd.d
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L32
            if (r2 != r4) goto L2b
            p7.j.I(r11)
            return r11
        L2b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r11)
        L30:
            r11 = 0
            return r11
        L32:
            hd.e r2 = r0.R
            p7.j.I(r11)
            goto Lc0
        L39:
            p7.j.I(r11)
            r0.R = r10
            r0.Z = r5
            zc.h r11 = new zc.h
            cc.c r2 = pc.a.A(r0)
            r11.<init>(r5, r2)
            r11.v()
        L4c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = hd.e.Y
            java.lang.Object r6 = r2.get(r10)
            yb.y r7 = yb.y.f14813a
            a0.c r8 = hd.g.f6455a
            if (r6 != r8) goto L69
        L58:
            boolean r8 = r2.compareAndSet(r10, r6, r11)
            if (r8 == 0) goto L62
            r11.y(r10)
            goto Lb3
        L62:
            java.lang.Object r8 = r2.get(r10)
            if (r8 == r6) goto L58
            goto L4c
        L69:
            boolean r9 = r6 instanceof java.util.List
            if (r9 == 0) goto L9a
        L6d:
            boolean r7 = r2.compareAndSet(r10, r6, r8)
            if (r7 == 0) goto L93
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r2 = r6.iterator()
        L79:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L4c
            java.lang.Object r6 = r2.next()
            hd.c r6 = r10.e(r6)
            r6.getClass()
            r6.f6452g = r3
            r7 = -1
            r6.f6453h = r7
            r10.f(r6, r5)
            goto L79
        L93:
            java.lang.Object r7 = r2.get(r10)
            if (r7 == r6) goto L6d
            goto L4c
        L9a:
            boolean r2 = r6 instanceof hd.c
            if (r2 == 0) goto Lcc
            hd.c r6 = (hd.c) r6
            java.lang.Object r2 = r10.X
            mc.q r5 = r6.f6451f
            if (r5 == 0) goto Laf
            java.lang.Object r6 = r6.f6449d
            java.lang.Object r2 = r5.i(r10, r6, r2)
            mc.q r2 = (mc.q) r2
            goto Lb0
        Laf:
            r2 = r3
        Lb0:
            r11.e(r7, r2)
        Lb3:
            java.lang.Object r11 = r11.u()
            dc.a r2 = dc.a.COROUTINE_SUSPENDED
            if (r11 != r2) goto Lbc
            r7 = r11
        Lbc:
            if (r7 != r1) goto Lbf
            goto Lca
        Lbf:
            r2 = r10
        Lc0:
            r0.R = r3
            r0.Z = r4
            java.lang.Object r11 = r2.c(r0)
            if (r11 != r1) goto Lcb
        Lca:
            return r1
        Lcb:
            return r11
        Lcc:
            java.lang.String r11 = "unexpected state: "
            wa.b.e(r6, r11)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.e.d(ec.c):java.lang.Object");
    }

    public final c e(Object obj) {
        ArrayList arrayList = this.B;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj3 = arrayList.get(i2);
            i2++;
            if (((c) obj3).f6446a == obj) {
                obj2 = obj3;
                break;
            }
        }
        c cVar = (c) obj2;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void f(c cVar, boolean z10) {
        Object obj = cVar.f6446a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
        if (atomicReferenceFieldUpdater.get(this) instanceof c) {
            return;
        }
        if (!z10) {
            ArrayList arrayList = this.B;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (((c) obj2).f6446a == obj) {
                        o.u(obj, "Cannot use select clauses on the same object: ");
                        return;
                    }
                }
            }
        }
        cVar.f6447b.i(obj, this, cVar.f6449d);
        if (this.X == g.f6458d) {
            if (!z10) {
                ArrayList arrayList2 = this.B;
                arrayList2.getClass();
                arrayList2.add(cVar);
            }
            cVar.f6452g = this.L;
            cVar.f6453h = this.R;
            this.L = null;
            this.R = -1;
            return;
        }
        atomicReferenceFieldUpdater.set(this, cVar);
    }

    public final int g(Object obj, Object obj2) {
        q qVar;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof zc.g) {
                c e6 = e(obj);
                if (e6 != null) {
                    q qVar2 = e6.f6451f;
                    if (qVar2 != null) {
                        qVar = (q) qVar2.i(this, e6.f6449d, obj2);
                    } else {
                        qVar = null;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, e6)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    zc.g gVar = (zc.g) obj3;
                    this.X = obj2;
                    a0.c o5 = gVar.o(y.f14813a, qVar);
                    if (o5 == null) {
                        this.X = g.f6458d;
                        return 2;
                    }
                    gVar.s(o5);
                    return 0;
                }
                continue;
            } else if (!k.a(obj3, g.f6456b) && !(obj3 instanceof c)) {
                if (k.a(obj3, g.f6457c)) {
                    return 2;
                }
                if (k.a(obj3, g.f6455a)) {
                    List x9 = t.x(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, x9)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                } else if (obj3 instanceof List) {
                    ArrayList d02 = zb.l.d0((Collection) obj3, obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, d02)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                } else {
                    wa.b.e(obj3, "Unexpected state: ");
                    return 0;
                }
            } else {
                return 3;
            }
        }
    }
}
