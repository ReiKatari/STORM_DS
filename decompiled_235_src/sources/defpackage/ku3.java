package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ku3  reason: default package */
/* loaded from: classes.dex */
public final class ku3 extends ut3 {
    public final boolean b;
    public r92 c = new r92();
    public tt3 d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final tp6 j;

    public ku3(hu3 hu3Var, boolean z) {
        this.b = z;
        tt3 tt3Var = tt3.INITIALIZED;
        this.d = tt3Var;
        this.i = new ArrayList();
        this.e = new WeakReference(hu3Var);
        this.j = up6.a(tt3Var);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ju3, java.lang.Object] */
    @Override // defpackage.ut3
    public final void a(gu3 gu3Var) {
        fu3 se1Var;
        hu3 hu3Var;
        gu3Var.getClass();
        e("addObserver");
        tt3 tt3Var = this.d;
        tt3 tt3Var2 = tt3.DESTROYED;
        if (tt3Var != tt3Var2) {
            tt3Var2 = tt3.INITIALIZED;
        }
        tt3Var2.getClass();
        ?? obj = new Object();
        HashMap hashMap = pu3.a;
        boolean z = gu3Var instanceof fu3;
        boolean z2 = gu3Var instanceof qe1;
        Object obj2 = null;
        boolean z3 = false;
        if (z && z2) {
            se1Var = new se1((qe1) gu3Var, (fu3) gu3Var);
        } else if (z2) {
            se1Var = new se1((qe1) gu3Var, (fu3) null);
        } else if (z) {
            se1Var = (fu3) gu3Var;
        } else {
            Class<?> cls = gu3Var.getClass();
            if (pu3.b(cls) == 2) {
                Object obj3 = pu3.b.get(cls);
                obj3.getClass();
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    hr2[] hr2VarArr = new hr2[size];
                    if (size <= 0) {
                        se1Var = new mf5(hr2VarArr, 2);
                    } else {
                        pu3.a((Constructor) list.get(0), gu3Var);
                        throw null;
                    }
                } else {
                    pu3.a((Constructor) list.get(0), gu3Var);
                    throw null;
                }
            } else {
                se1Var = new se1(gu3Var);
            }
        }
        obj.b = se1Var;
        obj.a = tt3Var2;
        r92 r92Var = this.c;
        p36 a = r92Var.a(gu3Var);
        if (a != null) {
            obj2 = a.B;
        } else {
            HashMap hashMap2 = r92Var.X;
            p36 p36Var = new p36(gu3Var, obj);
            r92Var.R++;
            p36 p36Var2 = r92Var.B;
            if (p36Var2 == null) {
                r92Var.A = p36Var;
                r92Var.B = p36Var;
            } else {
                p36Var2.L = p36Var;
                p36Var.R = p36Var2;
                r92Var.B = p36Var;
            }
            hashMap2.put(gu3Var, p36Var);
        }
        if (((ju3) obj2) != null || (hu3Var = (hu3) this.e.get()) == null) {
            return;
        }
        if (this.f != 0 || this.g) {
            z3 = true;
        }
        tt3 d = d(gu3Var);
        this.f++;
        while (obj.a.compareTo(d) < 0 && this.c.X.containsKey(gu3Var)) {
            tt3 tt3Var3 = obj.a;
            ArrayList arrayList = this.i;
            arrayList.add(tt3Var3);
            qt3 qt3Var = st3.Companion;
            tt3 tt3Var4 = obj.a;
            qt3Var.getClass();
            st3 b = qt3.b(tt3Var4);
            if (b != null) {
                obj.a(hu3Var, b);
                arrayList.remove(arrayList.size() - 1);
                d = d(gu3Var);
            } else {
                e41.z(obj.a, "no event up from ");
                return;
            }
        }
        if (!z3) {
            i();
        }
        this.f--;
    }

    @Override // defpackage.ut3
    public final tt3 b() {
        return this.d;
    }

    @Override // defpackage.ut3
    public final void c(gu3 gu3Var) {
        gu3Var.getClass();
        e("removeObserver");
        this.c.b(gu3Var);
    }

    public final tt3 d(gu3 gu3Var) {
        p36 p36Var;
        tt3 tt3Var;
        HashMap hashMap = this.c.X;
        tt3 tt3Var2 = null;
        if (hashMap.containsKey(gu3Var)) {
            p36Var = ((p36) hashMap.get(gu3Var)).R;
        } else {
            p36Var = null;
        }
        if (p36Var != null) {
            tt3Var = ((ju3) p36Var.B).a;
        } else {
            tt3Var = null;
        }
        ArrayList arrayList = this.i;
        if (!arrayList.isEmpty()) {
            tt3Var2 = (tt3) arrayList.get(arrayList.size() - 1);
        }
        tt3 tt3Var3 = this.d;
        tt3Var3.getClass();
        if (tt3Var == null || tt3Var.compareTo(tt3Var3) >= 0) {
            tt3Var = tt3Var3;
        }
        if (tt3Var2 != null && tt3Var2.compareTo(tt3Var) < 0) {
            return tt3Var2;
        }
        return tt3Var;
    }

    public final void e(String str) {
        if (this.b) {
            zt.l0().e.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            u34.f(lb1.A("Method ", str, " must be called on the main thread"));
        }
    }

    public final void f(st3 st3Var) {
        st3Var.getClass();
        e("handleLifecycleEvent");
        g(st3Var.getTargetState());
    }

    public final void g(tt3 tt3Var) {
        if (this.d != tt3Var) {
            hu3 hu3Var = (hu3) this.e.get();
            tt3 tt3Var2 = this.d;
            tt3Var2.getClass();
            tt3Var.getClass();
            if (tt3Var2 == tt3.INITIALIZED && tt3Var == tt3.DESTROYED) {
                tt3 tt3Var3 = tt3.CREATED;
                throw new IllegalStateException(("State must be at least '" + tt3Var3 + "' to be moved to '" + tt3Var + "' in component " + hu3Var).toString());
            }
            tt3 tt3Var4 = tt3.DESTROYED;
            if (tt3Var2 == tt3Var4 && tt3Var2 != tt3Var) {
                throw new IllegalStateException(("State is '" + tt3Var4 + "' and cannot be moved to `" + tt3Var + "` in component " + hu3Var).toString());
            }
            this.d = tt3Var;
            if (!this.g && this.f == 0) {
                this.g = true;
                i();
                this.g = false;
                if (this.d == tt3Var4) {
                    this.c = new r92();
                    return;
                }
                return;
            }
            this.h = true;
        }
    }

    public final void h(tt3 tt3Var) {
        tt3Var.getClass();
        e("setCurrentState");
        g(tt3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        r8.h = false;
        r8.j.l(r8.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        hu3 hu3Var = (hu3) this.e.get();
        if (hu3Var == null) {
            i.m("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            r92 r92Var = this.c;
            if (r92Var.R != 0) {
                p36 p36Var = r92Var.A;
                p36Var.getClass();
                tt3 tt3Var = ((ju3) p36Var.B).a;
                p36 p36Var2 = this.c.B;
                p36Var2.getClass();
                tt3 tt3Var2 = ((ju3) p36Var2.B).a;
                if (tt3Var == tt3Var2 && this.d == tt3Var2) {
                    break;
                }
                this.h = false;
                tt3 tt3Var3 = this.d;
                p36 p36Var3 = this.c.A;
                p36Var3.getClass();
                int compareTo = tt3Var3.compareTo(((ju3) p36Var3.B).a);
                ArrayList arrayList = this.i;
                if (compareTo < 0) {
                    r92 r92Var2 = this.c;
                    o36 o36Var = new o36(r92Var2.B, r92Var2.A, 1);
                    r92Var2.L.put(o36Var, Boolean.FALSE);
                    while (o36Var.hasNext() && !this.h) {
                        Map.Entry entry = (Map.Entry) o36Var.next();
                        entry.getClass();
                        gu3 gu3Var = (gu3) entry.getKey();
                        ju3 ju3Var = (ju3) entry.getValue();
                        while (ju3Var.a.compareTo(this.d) > 0 && !this.h && this.c.X.containsKey(gu3Var)) {
                            qt3 qt3Var = st3.Companion;
                            tt3 tt3Var4 = ju3Var.a;
                            qt3Var.getClass();
                            st3 a = qt3.a(tt3Var4);
                            if (a != null) {
                                arrayList.add(a.getTargetState());
                                ju3Var.a(hu3Var, a);
                                arrayList.remove(arrayList.size() - 1);
                            } else {
                                e41.z(ju3Var.a, "no event down from ");
                                return;
                            }
                        }
                    }
                }
                p36 p36Var4 = this.c.B;
                if (!this.h && p36Var4 != null && this.d.compareTo(((ju3) p36Var4.B).a) > 0) {
                    r92 r92Var3 = this.c;
                    r92Var3.getClass();
                    q36 q36Var = new q36(r92Var3);
                    r92Var3.L.put(q36Var, Boolean.FALSE);
                    while (q36Var.hasNext() && !this.h) {
                        Map.Entry entry2 = (Map.Entry) q36Var.next();
                        gu3 gu3Var2 = (gu3) entry2.getKey();
                        ju3 ju3Var2 = (ju3) entry2.getValue();
                        while (ju3Var2.a.compareTo(this.d) < 0 && !this.h && this.c.X.containsKey(gu3Var2)) {
                            arrayList.add(ju3Var2.a);
                            qt3 qt3Var2 = st3.Companion;
                            tt3 tt3Var5 = ju3Var2.a;
                            qt3Var2.getClass();
                            st3 b = qt3.b(tt3Var5);
                            if (b != null) {
                                ju3Var2.a(hu3Var, b);
                                arrayList.remove(arrayList.size() - 1);
                            } else {
                                e41.z(ju3Var2.a, "no event up from ");
                                return;
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
