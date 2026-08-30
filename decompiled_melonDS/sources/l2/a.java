package l2;

import a1.h0;
import a4.i;
import a4.l;
import a4.n;
import a4.p;
import a4.z;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b3.o;
import b4.r0;
import fj.j;
import g2.e1;
import g2.f1;
import i3.q;
import i3.s;
import j1.k;
import j1.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kf.s0;
import p7.t;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends o implements i, p, z {

    /* renamed from: i0  reason: collision with root package name */
    public final j1.i f8656i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f8657j0;

    /* renamed from: k0  reason: collision with root package name */
    public final float f8658k0;

    /* renamed from: l0  reason: collision with root package name */
    public final f1 f8659l0;

    /* renamed from: m0  reason: collision with root package name */
    public final e1 f8660m0;

    /* renamed from: n0  reason: collision with root package name */
    public g f8661n0;

    /* renamed from: o0  reason: collision with root package name */
    public float f8662o0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f8663q0;

    /* renamed from: s0  reason: collision with root package name */
    public d f8665s0;

    /* renamed from: t0  reason: collision with root package name */
    public e f8666t0;
    public long p0 = 0;

    /* renamed from: r0  reason: collision with root package name */
    public final h0 f8664r0 = new h0();

    public a(j1.i iVar, boolean z10, float f8, f1 f1Var, e1 e1Var) {
        this.f8656i0 = iVar;
        this.f8657j0 = z10;
        this.f8658k0 = f8;
        this.f8659l0 = f1Var;
        this.f8660m0 = e1Var;
    }

    @Override // b3.o
    public final boolean D0() {
        return false;
    }

    @Override // b3.o
    public final void G0() {
        x.v(C0(), null, null, new di.b(24, (cc.c) null, this), 3);
    }

    @Override // b3.o
    public final void H0() {
        d dVar = this.f8665s0;
        if (dVar != null) {
            this.f8666t0 = null;
            l.j(this);
            jb.c cVar = dVar.R;
            e eVar = (e) ((LinkedHashMap) cVar.B).get(this);
            if (eVar != null) {
                eVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.B;
                e eVar2 = (e) linkedHashMap.get(this);
                if (eVar2 != null) {
                    a aVar = (a) ((LinkedHashMap) cVar.L).remove(eVar2);
                }
                linkedHashMap.remove(this);
                dVar.L.add(eVar);
            }
        }
    }

    public final void O0(m mVar) {
        e eVar;
        Object remove;
        e eVar2;
        if (mVar instanceof k) {
            k kVar = (k) mVar;
            long j2 = this.p0;
            float f8 = this.f8662o0;
            d dVar = this.f8665s0;
            if (dVar == null) {
                View view = (View) l.h(this, r0.f1941f);
                while (!(view instanceof ViewGroup)) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = parent;
                    } else {
                        j.m(view, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                        return;
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 < childCount) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof d) {
                            dVar = (d) childAt;
                            break;
                        }
                        i2++;
                    } else {
                        d dVar2 = new d(viewGroup.getContext());
                        viewGroup.addView(dVar2);
                        dVar = dVar2;
                        break;
                    }
                }
                this.f8665s0 = dVar;
            }
            ArrayList arrayList = dVar.B;
            jb.c cVar = dVar.R;
            LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.B;
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) cVar.L;
            e eVar3 = (e) ((LinkedHashMap) cVar.B).get(this);
            if (eVar3 == null) {
                ArrayList arrayList2 = dVar.L;
                arrayList2.getClass();
                if (arrayList2.isEmpty()) {
                    remove = null;
                } else {
                    remove = arrayList2.remove(0);
                }
                e eVar4 = (e) remove;
                eVar3 = eVar4;
                if (eVar4 == null) {
                    if (dVar.f8672b0 > t.l(arrayList)) {
                        View view2 = new View(dVar.getContext());
                        dVar.addView(view2);
                        arrayList.add(view2);
                        eVar2 = view2;
                    } else {
                        e eVar5 = (e) arrayList.get(dVar.f8672b0);
                        a aVar = (a) linkedHashMap2.get(eVar5);
                        eVar2 = eVar5;
                        if (aVar != null) {
                            aVar.f8666t0 = null;
                            l.j(aVar);
                            e eVar6 = (e) linkedHashMap.get(aVar);
                            if (eVar6 != null) {
                                a aVar2 = (a) linkedHashMap2.remove(eVar6);
                            }
                            linkedHashMap.remove(aVar);
                            eVar5.c();
                            eVar2 = eVar5;
                        }
                    }
                    int i10 = dVar.f8672b0;
                    if (i10 < dVar.A - 1) {
                        dVar.f8672b0 = i10 + 1;
                        eVar3 = eVar2;
                    } else {
                        dVar.f8672b0 = 0;
                        eVar3 = eVar2;
                    }
                }
                linkedHashMap.put(this, eVar3);
                linkedHashMap2.put(eVar3, this);
            }
            e eVar7 = eVar3;
            eVar7.b(kVar, this.f8657j0, j2, pc.a.M(f8), this.f8659l0.a(), ((b) this.f8660m0.b()).f8670d, new s0(1, this));
            this.f8666t0 = eVar7;
            l.j(this);
        } else if (mVar instanceof j1.l) {
            e eVar8 = this.f8666t0;
            if (eVar8 != null) {
                eVar8.d();
            }
        } else if ((mVar instanceof j1.j) && (eVar = this.f8666t0) != null) {
            eVar.d();
        }
    }

    @Override // a4.z
    public final void o(long j2) {
        float v10;
        this.f8663q0 = true;
        x4.c cVar = l.t(this).f295t0;
        this.p0 = zb.k.T(j2);
        float f8 = this.f8658k0;
        if (Float.isNaN(f8)) {
            long j10 = this.p0;
            float f10 = c.f8671a;
            float e6 = h3.e.e(j10);
            v10 = h3.b.c((Float.floatToRawIntBits(h3.e.c(j10)) & 4294967295L) | (Float.floatToRawIntBits(e6) << 32)) / 2.0f;
            if (this.f8657j0) {
                v10 += cVar.v(c.f8671a);
            }
        } else {
            v10 = cVar.v(f8);
        }
        this.f8662o0 = v10;
        h0 h0Var = this.f8664r0;
        Object[] objArr = h0Var.f44a;
        int i2 = h0Var.f45b;
        for (int i10 = 0; i10 < i2; i10++) {
            O0((m) objArr[i10]);
        }
        h0Var.d();
    }

    @Override // a4.p
    public final void z(a4.r0 r0Var) {
        k3.b bVar = r0Var.A;
        r0Var.a();
        g gVar = this.f8661n0;
        if (gVar != null) {
            float f8 = this.f8662o0;
            long a10 = this.f8659l0.a();
            float floatValue = ((Number) ((d1.c) gVar.f8679c).e()).floatValue();
            if (floatValue > 0.0f) {
                long b10 = s.b(a10, floatValue);
                if (gVar.f8677a) {
                    float e6 = h3.e.e(bVar.c());
                    float c4 = h3.e.c(bVar.c());
                    n nVar = bVar.B;
                    long t5 = nVar.t();
                    nVar.p().p();
                    try {
                        ((n) ((d2.t) nVar.B).B).p().j(0.0f, 0.0f, e6, c4, 1);
                        k3.d.y(r0Var, b10, f8, 0L, null, 124);
                    } finally {
                        w.d.y(nVar, t5);
                    }
                } else {
                    k3.d.y(r0Var, b10, f8, 0L, null, 124);
                }
            }
        }
        q p10 = bVar.B.p();
        e eVar = this.f8666t0;
        if (eVar != null) {
            eVar.e(this.p0, pc.a.M(this.f8662o0), this.f8659l0.a(), ((b) this.f8660m0.b()).f8670d);
            eVar.draw(i3.c.a(p10));
        }
    }
}
