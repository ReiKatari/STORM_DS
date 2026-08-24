package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: md4  reason: default package */
/* loaded from: classes.dex */
public final class md4 {
    public final tp6 a = up6.a(nd4.i);
    public final tp6 b;
    public final de5 c;
    public final pu d;
    public final pu e;
    public jd4 f;
    public int g;
    public ld4 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public md4() {
        tp6 a = up6.a(new kd4());
        this.b = a;
        this.c = new de5(a);
        this.d = new pu();
        this.e = new pu();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(eb ebVar, ld4 ld4Var, int i) {
        LinkedHashSet linkedHashSet;
        boolean z;
        ebVar.getClass();
        if (ld4Var.a == null) {
            if (i != 0) {
                if (i != 1) {
                    linkedHashSet = this.i;
                } else {
                    linkedHashSet = this.j;
                }
            } else {
                linkedHashSet = this.k;
            }
            linkedHashSet.add(ld4Var);
            ld4Var.a = ebVar;
            ((kd4) this.c.A.getValue()).getClass();
            if (i != 0) {
                if (i != 1) {
                    z = this.n;
                } else {
                    z = this.l;
                }
            } else {
                z = this.m;
            }
            ld4Var.b(z);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(ld4Var);
        eb ebVar2 = ld4Var.a;
        sb.append("' is already added to dispatcher ");
        sb.append(ebVar2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        kd4 kd4Var;
        boolean z6 = true;
        pu puVar = this.d;
        if (puVar == null || !puVar.isEmpty()) {
            Iterator it = puVar.iterator();
            while (it.hasNext()) {
                if (((jd4) it.next()).b) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        pu puVar2 = this.e;
        if (puVar2 == null || !puVar2.isEmpty()) {
            Iterator it2 = puVar2.iterator();
            while (it2.hasNext()) {
                if (((jd4) it2.next()).b) {
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
        LinkedHashSet<ld4> linkedHashSet = this.k;
        if (z4) {
            for (ld4 ld4Var : linkedHashSet) {
                ld4Var.b(z);
            }
        }
        LinkedHashSet<ld4> linkedHashSet2 = this.j;
        if (z5) {
            for (ld4 ld4Var2 : linkedHashSet2) {
                ld4Var2.b(z2);
            }
        }
        LinkedHashSet<ld4> linkedHashSet3 = this.i;
        if (z6) {
            for (ld4 ld4Var3 : linkedHashSet3) {
                ld4Var3.b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        jd4 jd4Var = this.f;
        if (jd4Var == null) {
            jd4Var = c(0);
        }
        jd4 jd4Var2 = this.f;
        if (jd4Var2 == null) {
            jd4Var2 = c(0);
        }
        if (nb3.k(jd4Var2, jd4Var)) {
            if (jd4Var2 == null) {
                kd4Var = new kd4();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it3 = puVar.iterator();
                while (it3.hasNext()) {
                    boolean z7 = ((jd4) it3.next()).b;
                }
                Iterator<E> it4 = puVar2.iterator();
                while (it4.hasNext()) {
                    boolean z8 = ((jd4) it4.next()).b;
                }
                kj2 kj2Var = jd4Var2.a;
                kw3 I = hf.I();
                gt0.A0(I, arrayList);
                I.add(kj2Var);
                gt0.A0(I, yt1.A);
                kd4Var = new kd4(arrayList.size(), hf.A(I));
            }
            tp6 tp6Var = this.b;
            if (!nb3.k((kd4) tp6Var.getValue(), kd4Var)) {
                tp6Var.m(null, kd4Var);
                for (ld4 ld4Var4 : linkedHashSet) {
                    ld4Var4.getClass();
                }
                for (ld4 ld4Var5 : linkedHashSet2) {
                    ld4Var5.getClass();
                }
                for (ld4 ld4Var6 : linkedHashSet3) {
                    ld4Var6.getClass();
                }
            }
        }
    }

    public final jd4 c(int i) {
        Object obj;
        Object obj2;
        pu puVar = this.e;
        pu puVar2 = this.d;
        Object obj3 = null;
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    Iterator it = puVar2.iterator();
                    while (it.hasNext()) {
                        ((jd4) it.next()).getClass();
                    }
                    Iterator it2 = puVar.iterator();
                    while (it2.hasNext()) {
                        ((jd4) it2.next()).getClass();
                    }
                    return null;
                }
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = puVar2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj2 = it3.next();
                    if (((jd4) obj2).b) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            jd4 jd4Var = (jd4) obj2;
            if (jd4Var == null) {
                Iterator it4 = puVar.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (((jd4) next).b) {
                        obj3 = next;
                        break;
                    }
                }
                return (jd4) obj3;
            }
            return jd4Var;
        }
        Iterator it5 = puVar2.iterator();
        while (true) {
            if (it5.hasNext()) {
                obj = it5.next();
                if (((jd4) obj).b) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        jd4 jd4Var2 = (jd4) obj;
        if (jd4Var2 == null) {
            Iterator it6 = puVar.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next2 = it6.next();
                if (((jd4) next2).b) {
                    obj3 = next2;
                    break;
                }
            }
            return (jd4) obj3;
        }
        return jd4Var2;
    }
}
