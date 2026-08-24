package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.ModelPPM;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ql  reason: default package */
/* loaded from: classes.dex */
public final class ql extends z64 implements fy0, mo1, kj3 {
    public final r94 k0;
    public final boolean l0;
    public final float m0;
    public final dh1 n0;
    public final ch1 o0;
    public ka0 p0;
    public float q0;
    public boolean s0;
    public gq5 u0;
    public hq5 v0;
    public long r0 = 0;
    public final ca4 t0 = new ca4();

    public ql(r94 r94Var, boolean z, float f, dh1 dh1Var, ch1 ch1Var) {
        this.k0 = r94Var;
        this.l0 = z;
        this.m0 = f;
        this.n0 = dh1Var;
        this.o0 = ch1Var;
    }

    @Override // defpackage.z64
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.z64
    public final void J0() {
        hv.L(F0(), null, null, new bf4(this, null, 11), 3);
    }

    @Override // defpackage.z64
    public final void K0() {
        gq5 gq5Var = this.u0;
        if (gq5Var != null) {
            this.v0 = null;
            f04.I(this);
            ap3 ap3Var = gq5Var.R;
            hq5 hq5Var = (hq5) ((LinkedHashMap) ap3Var.B).get(this);
            if (hq5Var != null) {
                hq5Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) ap3Var.B;
                hq5 hq5Var2 = (hq5) linkedHashMap.get(this);
                if (hq5Var2 != null) {
                    ql qlVar = (ql) ((LinkedHashMap) ap3Var.L).remove(hq5Var2);
                }
                linkedHashMap.remove(this);
                gq5Var.L.add(hq5Var);
            }
        }
    }

    public final void R0(n25 n25Var) {
        hq5 hq5Var;
        Object remove;
        hq5 hq5Var2;
        if (n25Var instanceof l25) {
            l25 l25Var = (l25) n25Var;
            long j = this.r0;
            float f = this.q0;
            gq5 gq5Var = this.u0;
            if (gq5Var == null) {
                View view = (View) hf.K(this, kf.f);
                while (!(view instanceof ViewGroup)) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = parent;
                    } else {
                        u34.A(view, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                        return;
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i < childCount) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof gq5) {
                            gq5Var = (gq5) childAt;
                            break;
                        }
                        i++;
                    } else {
                        gq5 gq5Var2 = new gq5(viewGroup.getContext());
                        viewGroup.addView(gq5Var2);
                        gq5Var = gq5Var2;
                        break;
                    }
                }
                this.u0 = gq5Var;
            }
            ArrayList arrayList = gq5Var.B;
            ap3 ap3Var = gq5Var.R;
            LinkedHashMap linkedHashMap = (LinkedHashMap) ap3Var.B;
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) ap3Var.L;
            hq5 hq5Var3 = (hq5) ((LinkedHashMap) ap3Var.B).get(this);
            if (hq5Var3 == null) {
                ArrayList arrayList2 = gq5Var.L;
                arrayList2.getClass();
                if (arrayList2.isEmpty()) {
                    remove = null;
                } else {
                    remove = arrayList2.remove(0);
                }
                hq5 hq5Var4 = (hq5) remove;
                hq5Var3 = hq5Var4;
                if (hq5Var4 == null) {
                    if (gq5Var.d0 > hf.U(arrayList)) {
                        View view2 = new View(gq5Var.getContext());
                        gq5Var.addView(view2);
                        arrayList.add(view2);
                        hq5Var2 = view2;
                    } else {
                        hq5 hq5Var5 = (hq5) arrayList.get(gq5Var.d0);
                        ql qlVar = (ql) linkedHashMap2.get(hq5Var5);
                        hq5Var2 = hq5Var5;
                        if (qlVar != null) {
                            qlVar.v0 = null;
                            f04.I(qlVar);
                            hq5 hq5Var6 = (hq5) linkedHashMap.get(qlVar);
                            if (hq5Var6 != null) {
                                ql qlVar2 = (ql) linkedHashMap2.remove(hq5Var6);
                            }
                            linkedHashMap.remove(qlVar);
                            hq5Var5.c();
                            hq5Var2 = hq5Var5;
                        }
                    }
                    int i2 = gq5Var.d0;
                    if (i2 < gq5Var.A - 1) {
                        gq5Var.d0 = i2 + 1;
                        hq5Var3 = hq5Var2;
                    } else {
                        gq5Var.d0 = 0;
                        hq5Var3 = hq5Var2;
                    }
                }
                linkedHashMap.put(this, hq5Var3);
                linkedHashMap2.put(hq5Var3, this);
            }
            hq5 hq5Var7 = hq5Var3;
            hq5Var7.b(l25Var, this.l0, j, u24.E(f), this.n0.a(), ((eq5) this.o0.c()).d, new a5(this, 2));
            this.v0 = hq5Var7;
            f04.I(this);
        } else if (n25Var instanceof m25) {
            hq5 hq5Var8 = this.v0;
            if (hq5Var8 != null) {
                hq5Var8.d();
            }
        } else if ((n25Var instanceof k25) && (hq5Var = this.v0) != null) {
            hq5Var.d();
        }
    }

    @Override // defpackage.kj3, defpackage.j34
    public final void b(long j) {
        float e0;
        this.s0 = true;
        qh1 qh1Var = nc1.f0(this).u0;
        this.r0 = qo2.S(j);
        float f = this.m0;
        if (Float.isNaN(f)) {
            long j2 = this.r0;
            float e = xi6.e(j2);
            e0 = jk4.d((Float.floatToRawIntBits(xi6.c(j2)) & 4294967295L) | (Float.floatToRawIntBits(e) << 32)) / 2.0f;
            if (this.l0) {
                e0 += qh1Var.e0(10.0f);
            }
        } else {
            e0 = qh1Var.e0(f);
        }
        this.q0 = e0;
        ca4 ca4Var = this.t0;
        Object[] objArr = ca4Var.a;
        int i = ca4Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            R0((n25) objArr[i2]);
        }
        ca4Var.d();
    }

    @Override // defpackage.mo1
    public final void m0(um3 um3Var) {
        zj0 zj0Var = um3Var.A;
        um3Var.b();
        ka0 ka0Var = this.p0;
        if (ka0Var != null) {
            float f = this.q0;
            long a = this.n0.a();
            float floatValue = ((Number) ((gn) ka0Var.c).d()).floatValue();
            if (floatValue > RecyclerView.B1) {
                long c = kt0.c(floatValue, a);
                if (ka0Var.a) {
                    float e = xi6.e(zj0Var.e());
                    float c2 = xi6.c(zj0Var.e());
                    bt btVar = zj0Var.B;
                    long L = btVar.L();
                    btVar.G().h();
                    try {
                        ((os0) btVar.B).Q(RecyclerView.B1, RecyclerView.B1, e, c2, 1);
                        no1.j0(um3Var, c, f, 0L, null, ModelPPM.MAX_FREQ);
                    } finally {
                        xg6.v(btVar, L);
                    }
                } else {
                    no1.j0(um3Var, c, f, 0L, null, ModelPPM.MAX_FREQ);
                }
            }
        }
        xj0 G = zj0Var.B.G();
        hq5 hq5Var = this.v0;
        if (hq5Var != null) {
            hq5Var.e(this.r0, u24.E(this.q0), this.n0.a(), ((eq5) this.o0.c()).d);
            hq5Var.draw(xd.a(G));
        }
    }
}
