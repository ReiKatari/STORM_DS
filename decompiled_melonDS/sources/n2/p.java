package n2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends v {

    /* renamed from: a  reason: collision with root package name */
    public final long f9971a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9972b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9973c;

    /* renamed from: d  reason: collision with root package name */
    public HashSet f9974d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet f9975e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    public final f1 f9976f = new f1(v2.g.R, e.X);

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ r f9977g;

    public p(r rVar, long j2, boolean z10, boolean z11, l.i0 i0Var) {
        this.f9977g = rVar;
        this.f9971a = j2;
        this.f9972b = z10;
        this.f9973c = z11;
    }

    @Override // n2.v
    public final void a(y yVar, mc.p pVar) {
        this.f9977g.f9995b.a(yVar, pVar);
    }

    @Override // n2.v
    public final a1.n0 b(y yVar, c2 c2Var, mc.p pVar) {
        return this.f9977g.f9995b.b(yVar, c2Var, pVar);
    }

    @Override // n2.v
    public final void c() {
        r rVar = this.f9977g;
        rVar.A--;
    }

    @Override // n2.v
    public final boolean d() {
        return this.f9977g.f9995b.d();
    }

    @Override // n2.v
    public final boolean e() {
        return this.f9972b;
    }

    @Override // n2.v
    public final boolean f() {
        return this.f9973c;
    }

    @Override // n2.v
    public final long g() {
        return this.f9971a;
    }

    @Override // n2.v
    public final u h() {
        return this.f9977g.f10001h;
    }

    @Override // n2.v
    public final v2.g i() {
        return (v2.g) this.f9976f.getValue();
    }

    @Override // n2.v
    public final cc.g j() {
        return this.f9977g.f9995b.j();
    }

    @Override // n2.v
    public final boolean k() {
        return this.f9977g.f9995b.k();
    }

    @Override // n2.v
    public final void l(y yVar) {
        r rVar = this.f9977g;
        rVar.f9995b.l(rVar.f10001h);
        rVar.f9995b.l(yVar);
    }

    @Override // n2.v
    public final u0 m(v0 v0Var) {
        return this.f9977g.f9995b.m(v0Var);
    }

    @Override // n2.v
    public final a1.n0 n(y yVar, c2 c2Var, a1.n0 n0Var) {
        return this.f9977g.f9995b.n(yVar, c2Var, n0Var);
    }

    @Override // n2.v
    public final void o(Set set) {
        HashSet hashSet = this.f9974d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f9974d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // n2.v
    public final void p(r rVar) {
        this.f9975e.add(rVar);
    }

    @Override // n2.v
    public final void q(p1 p1Var) {
        this.f9977g.f9995b.q(p1Var);
    }

    @Override // n2.v
    public final void r(y yVar) {
        this.f9977g.f9995b.r(yVar);
    }

    @Override // n2.v
    public final f s(a4.m0 m0Var) {
        return this.f9977g.f9995b.s(m0Var);
    }

    @Override // n2.v
    public final void t() {
        this.f9977g.A++;
    }

    @Override // n2.v
    public final void u(m mVar) {
        HashSet hashSet = this.f9974d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                mVar.getClass();
                ((Set) it.next()).remove(((r) mVar).w());
            }
        }
        LinkedHashSet linkedHashSet = this.f9975e;
        if ((linkedHashSet instanceof oc.a) && !(linkedHashSet instanceof oc.b)) {
            nc.w.f(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        } else {
            linkedHashSet.remove(mVar);
        }
    }

    @Override // n2.v
    public final void v(y yVar) {
        this.f9977g.f9995b.v(yVar);
    }

    public final void w() {
        LinkedHashSet<r> linkedHashSet = this.f9975e;
        if (!linkedHashSet.isEmpty()) {
            HashSet hashSet = this.f9974d;
            if (hashSet != null) {
                for (r rVar : linkedHashSet) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(rVar.w());
                    }
                }
            }
            linkedHashSet.clear();
        }
    }
}
