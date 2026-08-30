package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: in3  reason: default package */
/* loaded from: classes.dex */
public final class in3 extends rm3 {
    public final boolean b;
    public y42 c = new y42();
    public qm3 d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final ee6 j;

    public in3(fn3 fn3Var, boolean z) {
        this.b = z;
        qm3 qm3Var = qm3.INITIALIZED;
        this.d = qm3Var;
        this.i = new ArrayList();
        this.e = new WeakReference(fn3Var);
        this.j = fe6.a(qm3Var);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hn3] */
    @Override // defpackage.rm3
    public final void a(en3 en3Var) {
        dn3 wa1Var;
        fn3 fn3Var;
        en3Var.getClass();
        e("addObserver");
        qm3 qm3Var = this.d;
        qm3 qm3Var2 = qm3.DESTROYED;
        if (qm3Var != qm3Var2) {
            qm3Var2 = qm3.INITIALIZED;
        }
        qm3Var2.getClass();
        ?? obj = new Object();
        HashMap hashMap = nn3.a;
        boolean z = en3Var instanceof dn3;
        boolean z2 = en3Var instanceof ua1;
        Object obj2 = null;
        boolean z3 = false;
        if (z && z2) {
            wa1Var = new wa1((ua1) en3Var, (dn3) en3Var);
        } else if (z2) {
            wa1Var = new wa1((ua1) en3Var, (dn3) null);
        } else if (z) {
            wa1Var = (dn3) en3Var;
        } else {
            Class<?> cls = en3Var.getClass();
            if (nn3.b(cls) == 2) {
                Object obj3 = nn3.b.get(cls);
                obj3.getClass();
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    bl2[] bl2VarArr = new bl2[size];
                    if (size <= 0) {
                        wa1Var = new w55(2, bl2VarArr);
                    } else {
                        nn3.a((Constructor) list.get(0), en3Var);
                        throw null;
                    }
                } else {
                    nn3.a((Constructor) list.get(0), en3Var);
                    throw null;
                }
            } else {
                wa1Var = new wa1(en3Var);
            }
        }
        obj.b = wa1Var;
        obj.a = qm3Var2;
        y42 y42Var = this.c;
        ts5 b = y42Var.b(en3Var);
        if (b != null) {
            obj2 = b.B;
        } else {
            HashMap hashMap2 = y42Var.X;
            ts5 ts5Var = new ts5(en3Var, obj);
            y42Var.R++;
            ts5 ts5Var2 = y42Var.B;
            if (ts5Var2 == null) {
                y42Var.A = ts5Var;
                y42Var.B = ts5Var;
            } else {
                ts5Var2.L = ts5Var;
                ts5Var.R = ts5Var2;
                y42Var.B = ts5Var;
            }
            hashMap2.put(en3Var, ts5Var);
        }
        if (((hn3) obj2) != null || (fn3Var = (fn3) this.e.get()) == null) {
            return;
        }
        if (this.f != 0 || this.g) {
            z3 = true;
        }
        qm3 d = d(en3Var);
        this.f++;
        while (obj.a.compareTo(d) < 0 && this.c.X.containsKey(en3Var)) {
            qm3 qm3Var3 = obj.a;
            ArrayList arrayList = this.i;
            arrayList.add(qm3Var3);
            nm3 nm3Var = pm3.Companion;
            qm3 qm3Var4 = obj.a;
            nm3Var.getClass();
            pm3 b2 = nm3.b(qm3Var4);
            if (b2 != null) {
                obj.a(fn3Var, b2);
                arrayList.remove(arrayList.size() - 1);
                d = d(en3Var);
            } else {
                f81.A(obj.a, "no event up from ");
                return;
            }
        }
        if (!z3) {
            i();
        }
        this.f--;
    }

    @Override // defpackage.rm3
    public final qm3 b() {
        return this.d;
    }

    @Override // defpackage.rm3
    public final void c(en3 en3Var) {
        en3Var.getClass();
        e("removeObserver");
        this.c.c(en3Var);
    }

    public final qm3 d(en3 en3Var) {
        ts5 ts5Var;
        qm3 qm3Var;
        HashMap hashMap = this.c.X;
        qm3 qm3Var2 = null;
        if (hashMap.containsKey(en3Var)) {
            ts5Var = ((ts5) hashMap.get(en3Var)).R;
        } else {
            ts5Var = null;
        }
        if (ts5Var != null) {
            qm3Var = ((hn3) ts5Var.B).a;
        } else {
            qm3Var = null;
        }
        ArrayList arrayList = this.i;
        if (!arrayList.isEmpty()) {
            qm3Var2 = (qm3) arrayList.get(arrayList.size() - 1);
        }
        qm3 qm3Var3 = this.d;
        qm3Var3.getClass();
        if (qm3Var == null || qm3Var.compareTo(qm3Var3) >= 0) {
            qm3Var = qm3Var3;
        }
        if (qm3Var2 != null && qm3Var2.compareTo(qm3Var) < 0) {
            return qm3Var2;
        }
        return qm3Var;
    }

    public final void e(String str) {
        if (this.b) {
            kt.L().h.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            c44.e(wh1.A("Method ", str, " must be called on the main thread"));
        }
    }

    public final void f(pm3 pm3Var) {
        pm3Var.getClass();
        e("handleLifecycleEvent");
        g(pm3Var.getTargetState());
    }

    public final void g(qm3 qm3Var) {
        if (this.d != qm3Var) {
            fn3 fn3Var = (fn3) this.e.get();
            qm3 qm3Var2 = this.d;
            qm3Var2.getClass();
            qm3Var.getClass();
            if (qm3Var2 == qm3.INITIALIZED && qm3Var == qm3.DESTROYED) {
                qm3 qm3Var3 = qm3.CREATED;
                throw new IllegalStateException(("State must be at least '" + qm3Var3 + "' to be moved to '" + qm3Var + "' in component " + fn3Var).toString());
            }
            qm3 qm3Var4 = qm3.DESTROYED;
            if (qm3Var2 == qm3Var4 && qm3Var2 != qm3Var) {
                throw new IllegalStateException(("State is '" + qm3Var4 + "' and cannot be moved to `" + qm3Var + "` in component " + fn3Var).toString());
            }
            this.d = qm3Var;
            if (!this.g && this.f == 0) {
                this.g = true;
                i();
                this.g = false;
                if (this.d == qm3Var4) {
                    this.c = new y42();
                    return;
                }
                return;
            }
            this.h = true;
        }
    }

    public final void h(qm3 qm3Var) {
        qm3Var.getClass();
        e("setCurrentState");
        g(qm3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        r8.h = false;
        r8.j.k(r8.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in3.i():void");
    }
}
