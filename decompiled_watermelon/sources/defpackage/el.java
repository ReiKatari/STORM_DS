package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: el  reason: default package */
/* loaded from: classes.dex */
public final class el extends yy3 implements jv0, gk1, sc3 {
    public final l14 j0;
    public final boolean k0;
    public final float l0;
    public final bd1 m0;
    public final ad1 n0;
    public c80 o0;
    public float p0;
    public boolean r0;
    public ig5 t0;
    public jg5 u0;
    public long q0 = 0;
    public final w14 s0 = new w14();

    public el(l14 l14Var, boolean z, float f, bd1 bd1Var, ad1 ad1Var) {
        this.j0 = l14Var;
        this.k0 = z;
        this.l0 = f;
        this.m0 = bd1Var;
        this.n0 = ad1Var;
    }

    @Override // defpackage.yy3
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.yy3
    public final void J0() {
        tq5.w(F0(), null, null, new v74(this, (j11) null, 10), 3);
    }

    @Override // defpackage.yy3
    public final void K0() {
        ig5 ig5Var = this.t0;
        if (ig5Var != null) {
            this.u0 = null;
            n40.M(this);
            ci3 ci3Var = ig5Var.R;
            jg5 jg5Var = (jg5) ((LinkedHashMap) ci3Var.B).get(this);
            if (jg5Var != null) {
                jg5Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) ci3Var.B;
                jg5 jg5Var2 = (jg5) linkedHashMap.get(this);
                if (jg5Var2 != null) {
                    el elVar = (el) ((LinkedHashMap) ci3Var.L).remove(jg5Var2);
                }
                linkedHashMap.remove(this);
                ig5Var.L.add(jg5Var);
            }
        }
    }

    public final void R0(lt4 lt4Var) {
        jg5 jg5Var;
        Object remove;
        jg5 jg5Var2;
        if (lt4Var instanceof jt4) {
            jt4 jt4Var = (jt4) lt4Var;
            long j = this.q0;
            float f = this.p0;
            ig5 ig5Var = this.t0;
            if (ig5Var == null) {
                View view = (View) mh7.t(this, ue.f);
                while (!(view instanceof ViewGroup)) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = parent;
                    } else {
                        c44.t(view, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                        return;
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i < childCount) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof ig5) {
                            ig5Var = (ig5) childAt;
                            break;
                        }
                        i++;
                    } else {
                        ig5 ig5Var2 = new ig5(viewGroup.getContext());
                        viewGroup.addView(ig5Var2);
                        ig5Var = ig5Var2;
                        break;
                    }
                }
                this.t0 = ig5Var;
            }
            ArrayList arrayList = ig5Var.B;
            ci3 ci3Var = ig5Var.R;
            LinkedHashMap linkedHashMap = (LinkedHashMap) ci3Var.B;
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) ci3Var.L;
            jg5 jg5Var3 = (jg5) ((LinkedHashMap) ci3Var.B).get(this);
            if (jg5Var3 == null) {
                ArrayList arrayList2 = ig5Var.L;
                arrayList2.getClass();
                if (arrayList2.isEmpty()) {
                    remove = null;
                } else {
                    remove = arrayList2.remove(0);
                }
                jg5 jg5Var4 = (jg5) remove;
                jg5Var3 = jg5Var4;
                if (jg5Var4 == null) {
                    if (ig5Var.c0 > l07.P(arrayList)) {
                        View view2 = new View(ig5Var.getContext());
                        ig5Var.addView(view2);
                        arrayList.add(view2);
                        jg5Var2 = view2;
                    } else {
                        jg5 jg5Var5 = (jg5) arrayList.get(ig5Var.c0);
                        el elVar = (el) linkedHashMap2.get(jg5Var5);
                        jg5Var2 = jg5Var5;
                        if (elVar != null) {
                            elVar.u0 = null;
                            n40.M(elVar);
                            jg5 jg5Var6 = (jg5) linkedHashMap.get(elVar);
                            if (jg5Var6 != null) {
                                el elVar2 = (el) linkedHashMap2.remove(jg5Var6);
                            }
                            linkedHashMap.remove(elVar);
                            jg5Var5.c();
                            jg5Var2 = jg5Var5;
                        }
                    }
                    int i2 = ig5Var.c0;
                    if (i2 < ig5Var.A - 1) {
                        ig5Var.c0 = i2 + 1;
                        jg5Var3 = jg5Var2;
                    } else {
                        ig5Var.c0 = 0;
                        jg5Var3 = jg5Var2;
                    }
                }
                linkedHashMap.put(this, jg5Var3);
                linkedHashMap2.put(jg5Var3, this);
            }
            jg5 jg5Var7 = jg5Var3;
            jg5Var7.b(jt4Var, this.k0, j, jv3.X(f), this.m0.a(), ((gg5) this.n0.c()).d, new b5(2, this));
            this.u0 = jg5Var7;
            n40.M(this);
        } else if (lt4Var instanceof kt4) {
            jg5 jg5Var8 = this.u0;
            if (jg5Var8 != null) {
                jg5Var8.d();
            }
        } else if ((lt4Var instanceof it4) && (jg5Var = this.u0) != null) {
            jg5Var.d();
        }
    }

    @Override // defpackage.gk1
    public final void T(xf3 xf3Var) {
        rh0 rh0Var = xf3Var.A;
        xf3Var.a();
        c80 c80Var = this.o0;
        if (c80Var != null) {
            float f = this.p0;
            long a = this.m0.a();
            float floatValue = ((Number) ((um) c80Var.c).d()).floatValue();
            if (floatValue > RecyclerView.A1) {
                long b = xq0.b(floatValue, a);
                if (c80Var.a) {
                    float e = i76.e(rh0Var.d());
                    float c = i76.c(rh0Var.d());
                    os osVar = rh0Var.B;
                    long E = osVar.E();
                    osVar.s().m();
                    try {
                        ((bq0) osVar.B).P(RecyclerView.A1, RecyclerView.A1, e, c, 1);
                        hk1.J(xf3Var, b, f, 0L, null, 124);
                    } finally {
                        wh1.u(osVar, E);
                    }
                } else {
                    hk1.J(xf3Var, b, f, 0L, null, 124);
                }
            }
        }
        oh0 s = rh0Var.B.s();
        jg5 jg5Var = this.u0;
        if (jg5Var != null) {
            jg5Var.e(this.q0, jv3.X(this.p0), this.m0.a(), ((gg5) this.n0.c()).d);
            jg5Var.draw(jd.a(s));
        }
    }

    @Override // defpackage.sc3, defpackage.yv3
    public final void c(long j) {
        float C;
        this.r0 = true;
        od1 od1Var = l.P(this).t0;
        this.q0 = hk2.U(j);
        float f = this.l0;
        if (Float.isNaN(f)) {
            long j2 = this.q0;
            float e = i76.e(j2);
            C = mb4.c((Float.floatToRawIntBits(i76.c(j2)) & 4294967295L) | (Float.floatToRawIntBits(e) << 32)) / 2.0f;
            if (this.k0) {
                C += od1Var.C(10.0f);
            }
        } else {
            C = od1Var.C(f);
        }
        this.p0 = C;
        w14 w14Var = this.s0;
        Object[] objArr = w14Var.a;
        int i = w14Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            R0((lt4) objArr[i2]);
        }
        w14Var.d();
    }
}
