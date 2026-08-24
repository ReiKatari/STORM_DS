package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.stormds.emulator.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mx0  reason: default package */
/* loaded from: classes.dex */
public final class mx0 {
    public final View a;
    public final zx0 b;
    public final hu3 c;
    public final g56 d;
    public final bp7 e;
    public final h33 f;
    public final ml5 g;
    public final Configuration h;
    public final qa4 i;
    public final id j;
    public final vm k;
    public final de l;
    public final ce m;
    public final ji2 n;
    public final qa4 o;
    public final tv2 p;
    public final xm q;
    public final um3 r;
    public final zr3 s;
    public final ak0 t;
    public int u;
    public final pj v;
    public final lx0 w;

    public mx0(mx0 mx0Var, View view, zx0 zx0Var, hu3 hu3Var, g56 g56Var, bp7 bp7Var) {
        Context context;
        h33 h33Var;
        ml5 ml5Var;
        Configuration configuration;
        qa4 Y;
        id idVar;
        vm vmVar;
        de deVar;
        ce ceVar;
        ji2 d90Var;
        qa4 vs4Var;
        tv2 lx4Var;
        xm xmVar;
        um3 um3Var;
        ak0 ak0Var;
        View view2;
        if (mx0Var != null && (view2 = mx0Var.a) != null) {
            context = view2.getContext();
        } else {
            context = null;
        }
        boolean k = nb3.k(context, view.getContext());
        this.a = view;
        this.b = zx0Var;
        this.c = hu3Var;
        this.d = g56Var;
        this.e = bp7Var;
        if (k) {
            mx0Var.getClass();
            h33Var = mx0Var.f;
        } else {
            h33Var = new h33();
        }
        this.f = h33Var;
        this.g = (mx0Var == null || (ml5Var = mx0Var.g) == null) ? new ml5() : ml5Var;
        if (k) {
            mx0Var.getClass();
            configuration = mx0Var.h;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.h = configuration;
        if (k) {
            mx0Var.getClass();
            Y = mx0Var.i;
        } else {
            Y = np2.Y(new Configuration(configuration));
        }
        this.i = Y;
        if (k) {
            mx0Var.getClass();
            idVar = mx0Var.j;
        } else {
            idVar = new id(view.getContext());
        }
        this.j = idVar;
        if (k) {
            mx0Var.getClass();
            vmVar = mx0Var.k;
        } else {
            vmVar = new vm(view.getContext());
        }
        this.k = vmVar;
        if (k) {
            mx0Var.getClass();
            deVar = mx0Var.l;
        } else {
            deVar = new de(view.getContext());
        }
        this.l = deVar;
        if (k) {
            mx0Var.getClass();
            ceVar = mx0Var.m;
        } else {
            ceVar = new ce(deVar);
        }
        this.m = ceVar;
        if (k) {
            mx0Var.getClass();
            d90Var = mx0Var.n;
        } else {
            view.getContext();
            d90Var = new d90(22);
        }
        this.n = d90Var;
        if (k) {
            mx0Var.getClass();
            vs4Var = mx0Var.o;
        } else {
            vs4Var = new vs4(oi2.q(view.getContext()), vs0.s0);
        }
        this.o = vs4Var;
        if (view == (mx0Var != null ? mx0Var.a : null)) {
            lx4Var = mx0Var.p;
        } else {
            lx4Var = new lx4(view);
        }
        this.p = lx4Var;
        if (k) {
            mx0Var.getClass();
            xmVar = mx0Var.q;
        } else {
            xmVar = new xm(ViewConfiguration.get(view.getContext()));
        }
        this.q = xmVar;
        this.r = (mx0Var == null || (um3Var = mx0Var.r) == null) ? new um3() : um3Var;
        this.s = new zr3();
        this.t = (mx0Var == null || (ak0Var = mx0Var.t) == null) ? new ak0() : ak0Var;
        this.v = new pj(this, 6);
        this.w = new lx0(this);
    }

    public final void a(te teVar, eo2 eo2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        Set set;
        String str;
        boolean z2;
        View view;
        Object obj;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(123858079);
        if (xq2Var.h(teVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (xq2Var.h(eo2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (xq2Var.h(this)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i7 & 1, z)) {
            Object tag = teVar.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            if ((tag instanceof Set) && (!(tag instanceof zf3) || (tag instanceof dg3))) {
                set = (Set) tag;
            } else {
                set = null;
            }
            if (set == null) {
                ViewParent parent = teVar.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view != null) {
                    obj = view.getTag(R.id.inspection_slot_table_set);
                } else {
                    obj = null;
                }
                if ((obj instanceof Set) && (!(obj instanceof zf3) || (obj instanceof dg3))) {
                    set = obj;
                } else {
                    set = null;
                }
            }
            if (set != null) {
                set.add(xq2Var.y());
                xq2Var.q = true;
                xq2Var.C = true;
                xq2Var.c.b();
                xq2Var.H.b();
                pk6 pk6Var = xq2Var.I;
                mk6 mk6Var = pk6Var.a;
                pk6Var.e = mk6Var.f0;
                pk6Var.f = mk6Var.g0;
            }
            Object P = xq2Var.P();
            g56 g56Var = this.d;
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                ViewParent parent2 = teVar.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag2 = view2.getTag(R.id.compose_view_saveable_id_tag);
                if (tag2 instanceof String) {
                    str = (String) tag2;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = String.valueOf(view2.getId());
                }
                String m = i61.m("SaveableStateRegistry:", str);
                d56 savedStateRegistry = g56Var.getSavedStateRegistry();
                Bundle a = savedStateRegistry.a(m);
                if (a != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : a.keySet()) {
                        ArrayList parcelableArrayList = a.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                }
                ne neVar = ne.u0;
                nq6 nq6Var = s46.a;
                r46 r46Var = new r46(linkedHashMap, neVar);
                if (savedStateRegistry.b(m) == null) {
                    try {
                        savedStateRegistry.c(m, new gv0(r46Var, 1));
                        z2 = true;
                    } catch (IllegalArgumentException unused) {
                    }
                    jl1 jl1Var = new jl1(r46Var, new kl1(z2, savedStateRegistry, m));
                    xq2Var.l0(jl1Var);
                    P = jl1Var;
                }
                z2 = false;
                jl1 jl1Var2 = new jl1(r46Var, new kl1(z2, savedStateRegistry, m));
                xq2Var.l0(jl1Var2);
                P = jl1Var2;
            }
            jl1 jl1Var3 = (jl1) P;
            boolean h = xq2Var.h(jl1Var3);
            Object P2 = xq2Var.P();
            if (h || P2 == vs0Var) {
                P2 = new mc(jl1Var3, 10);
                xq2Var.l0(P2);
            }
            mb3.d(jg7.a, (qn2) P2, xq2Var);
            py0 py0Var = ky0.w;
            boolean booleanValue = ((Boolean) xq2Var.j(py0Var)).booleanValue() | teVar.getScrollCaptureInProgress$ui();
            boolean f = xq2Var.f(teVar.getView());
            Object P3 = xq2Var.P();
            if (f || P3 == vs0Var) {
                teVar.getView();
                P3 = new Object();
                xq2Var.l0(P3);
            }
            hv.e(new pq[]{zx3.a.a(this.c), dy3.a.a(g56Var), kf.d.a(this.f), kf.e.a(this.g), kf.b.a(teVar.getContext()), r83.a.a(set), kf.a.a(teVar.getConfiguration()), s46.a.a(jl1Var3), kf.f.a(teVar.getView()), py0Var.a(Boolean.valueOf(booleanValue)), ky0.t.a(teVar.getViewConfiguration()), my2.a.a((zp7) P3)}, n16.I(1317454175, new kx0(teVar, this, eo2Var), xq2Var), xq2Var, 56);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new kx0(this, teVar, eo2Var, i);
        }
    }

    public final void b() {
        int i = this.u - 1;
        this.u = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.u = 0;
        }
        if (this.u == 0) {
            View view = this.a;
            Context context = view.getContext();
            lx0 lx0Var = this.w;
            context.unregisterComponentCallbacks(lx0Var);
            zr3 zr3Var = this.s;
            if (zr3Var.b == null) {
                zr3Var.a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(lx0Var);
        }
    }

    public final void c() {
        int i = this.u + 1;
        this.u = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            lx0 lx0Var = this.w;
            context.registerComponentCallbacks(lx0Var);
            d(view.getResources().getConfiguration());
            boolean hasWindowFocus = view.hasWindowFocus();
            zr3 zr3Var = this.s;
            zr3Var.c.setValue(Boolean.valueOf(hasWindowFocus));
            vs4 vs4Var = zr3Var.b;
            pj pjVar = this.v;
            if (vs4Var == null) {
                zr3Var.a = pjVar;
            }
            if (vs4Var != null) {
                vs4Var.setValue(pjVar.c());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(lx0Var);
        }
    }

    public final void d(Configuration configuration) {
        int updateFrom = this.h.updateFrom(configuration);
        if (updateFrom != 0) {
            Iterator it = this.f.a.entrySet().iterator();
            while (it.hasNext()) {
                f33 f33Var = (f33) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (f33Var == null || Configuration.needNewResources(updateFrom, f33Var.b)) {
                    it.remove();
                }
            }
            this.i.setValue(new Configuration(configuration));
            ml5 ml5Var = this.g;
            synchronized (ml5Var) {
                ml5Var.a.c();
            }
            if ((268435456 & updateFrom) != 0) {
                this.o.setValue(oi2.q(this.a.getContext()));
            }
            if (((-1342235264) & updateFrom) != 0) {
                zr3 zr3Var = this.s;
                pj pjVar = this.v;
                vs4 vs4Var = zr3Var.b;
                if (vs4Var != null) {
                    vs4Var.setValue(pjVar.c());
                }
            }
        }
    }
}
