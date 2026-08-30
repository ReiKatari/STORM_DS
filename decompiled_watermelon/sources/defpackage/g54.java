package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g54  reason: default package */
/* loaded from: classes.dex */
public final class g54 {
    public final ee6 a = fe6.a(h54.e);
    public final ee6 b;
    public final q45 c;
    public final xt d;
    public final xt e;
    public d54 f;
    public int g;
    public f54 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public g54() {
        ee6 a = fe6.a(new e54());
        this.b = a;
        this.c = new q45(a);
        this.d = new xt();
        this.e = new xt();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(q9 q9Var, f54 f54Var, int i) {
        LinkedHashSet linkedHashSet;
        boolean z;
        q9Var.getClass();
        if (f54Var.a == null) {
            if (i != 0) {
                if (i != 1) {
                    linkedHashSet = this.i;
                } else {
                    linkedHashSet = this.j;
                }
            } else {
                linkedHashSet = this.k;
            }
            linkedHashSet.add(f54Var);
            f54Var.a = q9Var;
            ((e54) this.c.A.getValue()).getClass();
            if (i != 0) {
                if (i != 1) {
                    z = this.n;
                } else {
                    z = this.l;
                }
            } else {
                z = this.m;
            }
            f54Var.b(z);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(f54Var);
        q9 q9Var2 = f54Var.a;
        sb.append("' is already added to dispatcher ");
        sb.append(q9Var2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        e54 e54Var;
        boolean z6 = true;
        xt xtVar = this.d;
        if (xtVar == null || !xtVar.isEmpty()) {
            Iterator it = xtVar.iterator();
            while (it.hasNext()) {
                if (((d54) it.next()).b) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        xt xtVar2 = this.e;
        if (xtVar2 == null || !xtVar2.isEmpty()) {
            Iterator it2 = xtVar2.iterator();
            while (it2.hasNext()) {
                if (((d54) it2.next()).b) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (!z && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.m != z) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.l != z2) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.n == z3) {
            z6 = false;
        }
        LinkedHashSet<f54> linkedHashSet = this.k;
        if (z4) {
            for (f54 f54Var : linkedHashSet) {
                f54Var.b(z);
            }
        }
        LinkedHashSet<f54> linkedHashSet2 = this.j;
        if (z5) {
            for (f54 f54Var2 : linkedHashSet2) {
                f54Var2.b(z2);
            }
        }
        LinkedHashSet<f54> linkedHashSet3 = this.i;
        if (z6) {
            for (f54 f54Var3 : linkedHashSet3) {
                f54Var3.b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        d54 d54Var = this.f;
        if (d54Var == null) {
            d54Var = c(0);
        }
        d54 d54Var2 = this.f;
        if (d54Var2 == null) {
            d54Var2 = c(0);
        }
        if (b53.x(d54Var2, d54Var)) {
            if (d54Var2 == null) {
                e54Var = new e54();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it3 = xtVar.iterator();
                while (it3.hasNext()) {
                    boolean z7 = ((d54) it3.next()).b;
                }
                Iterator<E> it4 = xtVar2.iterator();
                while (it4.hasNext()) {
                    boolean z8 = ((d54) it4.next()).b;
                }
                ve2 ve2Var = d54Var2.a;
                ip3 C = l07.C();
                tq0.D0(C, arrayList);
                C.add(ve2Var);
                tq0.D0(C, pp1.A);
                e54Var = new e54(arrayList.size(), l07.t(C));
            }
            ee6 ee6Var = this.b;
            if (!b53.x((e54) ee6Var.getValue(), e54Var)) {
                ee6Var.l(null, e54Var);
                for (f54 f54Var4 : linkedHashSet) {
                    f54Var4.getClass();
                }
                for (f54 f54Var5 : linkedHashSet2) {
                    f54Var5.getClass();
                }
                for (f54 f54Var6 : linkedHashSet3) {
                    f54Var6.getClass();
                }
            }
        }
    }

    public final d54 c(int i) {
        Object obj;
        Object obj2;
        xt xtVar = this.e;
        xt xtVar2 = this.d;
        Object obj3 = null;
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    Iterator it = xtVar2.iterator();
                    while (it.hasNext()) {
                        ((d54) it.next()).getClass();
                    }
                    Iterator it2 = xtVar.iterator();
                    while (it2.hasNext()) {
                        ((d54) it2.next()).getClass();
                    }
                    return null;
                }
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = xtVar2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj2 = it3.next();
                    if (((d54) obj2).b) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            d54 d54Var = (d54) obj2;
            if (d54Var == null) {
                Iterator it4 = xtVar.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (((d54) next).b) {
                        obj3 = next;
                        break;
                    }
                }
                return (d54) obj3;
            }
            return d54Var;
        }
        Iterator it5 = xtVar2.iterator();
        while (true) {
            if (it5.hasNext()) {
                obj = it5.next();
                if (((d54) obj).b) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        d54 d54Var2 = (d54) obj;
        if (d54Var2 == null) {
            Iterator it6 = xtVar.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next2 = it6.next();
                if (((d54) next2).b) {
                    obj3 = next2;
                    break;
                }
            }
            return (d54) obj3;
        }
        return d54Var2;
    }
}
