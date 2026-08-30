package f7;

import cd.q;
import cd.q1;
import cd.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p7.t;
import zb.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final q1 f4938a = q.c(h.f4951e);

    /* renamed from: b  reason: collision with root package name */
    public final q1 f4939b;

    /* renamed from: c  reason: collision with root package name */
    public final y0 f4940c;

    /* renamed from: d  reason: collision with root package name */
    public final zb.j f4941d;

    /* renamed from: e  reason: collision with root package name */
    public final zb.j f4942e;

    /* renamed from: f  reason: collision with root package name */
    public d f4943f;

    /* renamed from: g  reason: collision with root package name */
    public int f4944g;

    /* renamed from: h  reason: collision with root package name */
    public f f4945h;

    /* renamed from: i  reason: collision with root package name */
    public final LinkedHashSet f4946i;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashSet f4947j;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashSet f4948k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4949l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4950n;

    public g() {
        q1 c4 = q.c(new e());
        this.f4939b = c4;
        this.f4940c = new y0(c4);
        this.f4941d = new zb.j();
        this.f4942e = new zb.j();
        this.f4946i = new LinkedHashSet();
        this.f4947j = new LinkedHashSet();
        this.f4948k = new LinkedHashSet();
    }

    public final void a(b9.e eVar, f fVar, int i2) {
        LinkedHashSet linkedHashSet;
        boolean z10;
        eVar.getClass();
        if (fVar.f4936a == null) {
            if (i2 != 0) {
                if (i2 != 1) {
                    linkedHashSet = this.f4946i;
                } else {
                    linkedHashSet = this.f4947j;
                }
            } else {
                linkedHashSet = this.f4948k;
            }
            linkedHashSet.add(fVar);
            fVar.f4936a = eVar;
            ((e) this.f4940c.A.getValue()).getClass();
            if (i2 != 0) {
                if (i2 != 1) {
                    z10 = this.f4950n;
                } else {
                    z10 = this.f4949l;
                }
            } else {
                z10 = this.m;
            }
            fVar.b(z10);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Input '");
        sb2.append(fVar);
        b9.e eVar2 = fVar.f4936a;
        sb2.append("' is already added to dispatcher ");
        sb2.append(eVar2);
        sb2.append('.');
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public final void b() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        e eVar;
        boolean z15 = true;
        zb.j jVar = this.f4941d;
        if (jVar == null || !jVar.isEmpty()) {
            Iterator it = jVar.iterator();
            while (it.hasNext()) {
                if (((d) it.next()).f4932b) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        zb.j jVar2 = this.f4942e;
        if (jVar2 == null || !jVar2.isEmpty()) {
            Iterator it2 = jVar2.iterator();
            while (it2.hasNext()) {
                if (((d) it2.next()).f4932b) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (!z10 && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (this.m != z10) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.f4949l != z11) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (this.f4950n == z12) {
            z15 = false;
        }
        LinkedHashSet<f> linkedHashSet = this.f4948k;
        if (z13) {
            for (f fVar : linkedHashSet) {
                fVar.b(z10);
            }
        }
        LinkedHashSet<f> linkedHashSet2 = this.f4947j;
        if (z14) {
            for (f fVar2 : linkedHashSet2) {
                fVar2.b(z11);
            }
        }
        LinkedHashSet<f> linkedHashSet3 = this.f4946i;
        if (z15) {
            for (f fVar3 : linkedHashSet3) {
                fVar3.b(z12);
            }
        }
        this.m = z10;
        this.f4949l = z11;
        this.f4950n = z12;
        d dVar = this.f4943f;
        if (dVar == null) {
            dVar = c(0);
        }
        d dVar2 = this.f4943f;
        if (dVar2 == null) {
            dVar2 = c(0);
        }
        if (nc.k.a(dVar2, dVar)) {
            if (dVar2 == null) {
                eVar = new e();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it3 = jVar.iterator();
                while (it3.hasNext()) {
                    boolean z16 = ((d) it3.next()).f4932b;
                }
                Iterator<E> it4 = jVar2.iterator();
                while (it4.hasNext()) {
                    boolean z17 = ((d) it4.next()).f4932b;
                }
                d0.d dVar3 = dVar2.f4931a;
                ac.b g10 = t.g();
                l.L(arrayList, g10);
                g10.add(dVar3);
                l.L(zb.q.A, g10);
                eVar = new e(arrayList.size(), t.d(g10));
            }
            q1 q1Var = this.f4939b;
            if (!nc.k.a((e) q1Var.getValue(), eVar)) {
                q1Var.k(null, eVar);
                for (f fVar4 : linkedHashSet) {
                    fVar4.getClass();
                }
                for (f fVar5 : linkedHashSet2) {
                    fVar5.getClass();
                }
                for (f fVar6 : linkedHashSet3) {
                    fVar6.getClass();
                }
            }
        }
    }

    public final d c(int i2) {
        Object obj;
        Object obj2;
        zb.j jVar = this.f4942e;
        zb.j jVar2 = this.f4941d;
        Object obj3 = null;
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 == 1) {
                    Iterator it = jVar2.iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).getClass();
                    }
                    Iterator it2 = jVar.iterator();
                    while (it2.hasNext()) {
                        ((d) it2.next()).getClass();
                    }
                    return null;
                }
                throw new IllegalStateException(("Unsupported direction: '" + i2 + "'.").toString());
            }
            Iterator it3 = jVar2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj2 = it3.next();
                    if (((d) obj2).f4932b) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            d dVar = (d) obj2;
            if (dVar == null) {
                Iterator it4 = jVar.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (((d) next).f4932b) {
                        obj3 = next;
                        break;
                    }
                }
                return (d) obj3;
            }
            return dVar;
        }
        Iterator it5 = jVar2.iterator();
        while (true) {
            if (it5.hasNext()) {
                obj = it5.next();
                if (((d) obj).f4932b) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        d dVar2 = (d) obj;
        if (dVar2 == null) {
            Iterator it6 = jVar.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next2 = it6.next();
                if (((d) next2).f4932b) {
                    obj3 = next2;
                    break;
                }
            }
            return (d) obj3;
        }
        return dVar2;
    }
}
