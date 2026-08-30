package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qu0  reason: default package */
/* loaded from: classes.dex */
public final class qu0 {
    public final View a;
    public final dv0 b;
    public final fn3 c;
    public final au5 d;
    public final ab7 e;
    public final dx2 f;
    public final ub5 g;
    public final Configuration h;
    public final k24 i;
    public final uc j;
    public final jm k;
    public final od l;
    public final nd m;
    public final nd2 n;
    public final k24 o;
    public final sp2 p;
    public final lm q;
    public final xf3 r;
    public final yk3 s;
    public final sh0 t;
    public int u;
    public final dj v;
    public final pu0 w;

    public qu0(qu0 qu0Var, View view, dv0 dv0Var, fn3 fn3Var, au5 au5Var, ab7 ab7Var) {
        Context context;
        dx2 dx2Var;
        ub5 ub5Var;
        Configuration configuration;
        k24 G;
        uc ucVar;
        jm jmVar;
        od odVar;
        nd ndVar;
        nd2 sn1Var;
        k24 tj4Var;
        sp2 ho4Var;
        lm lmVar;
        xf3 xf3Var;
        sh0 sh0Var;
        View view2;
        if (qu0Var != null && (view2 = qu0Var.a) != null) {
            context = view2.getContext();
        } else {
            context = null;
        }
        boolean x = b53.x(context, view.getContext());
        this.a = view;
        this.b = dv0Var;
        this.c = fn3Var;
        this.d = au5Var;
        this.e = ab7Var;
        if (x) {
            qu0Var.getClass();
            dx2Var = qu0Var.f;
        } else {
            dx2Var = new dx2();
        }
        this.f = dx2Var;
        this.g = (qu0Var == null || (ub5Var = qu0Var.g) == null) ? new ub5() : ub5Var;
        if (x) {
            qu0Var.getClass();
            configuration = qu0Var.h;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.h = configuration;
        if (x) {
            qu0Var.getClass();
            G = qu0Var.i;
        } else {
            G = me2.G(new Configuration(configuration));
        }
        this.i = G;
        if (x) {
            qu0Var.getClass();
            ucVar = qu0Var.j;
        } else {
            ucVar = new uc(view.getContext());
        }
        this.j = ucVar;
        if (x) {
            qu0Var.getClass();
            jmVar = qu0Var.k;
        } else {
            jmVar = new jm(view.getContext());
        }
        this.k = jmVar;
        if (x) {
            qu0Var.getClass();
            odVar = qu0Var.l;
        } else {
            odVar = new od(view.getContext());
        }
        this.l = odVar;
        if (x) {
            qu0Var.getClass();
            ndVar = qu0Var.m;
        } else {
            ndVar = new nd(odVar);
        }
        this.m = ndVar;
        if (x) {
            qu0Var.getClass();
            sn1Var = qu0Var.n;
        } else {
            view.getContext();
            sn1Var = new sn1(20);
        }
        this.n = sn1Var;
        if (x) {
            qu0Var.getClass();
            tj4Var = qu0Var.o;
        } else {
            tj4Var = new tj4(pj7.a(view.getContext()), sn1.q0);
        }
        this.o = tj4Var;
        if (view == (qu0Var != null ? qu0Var.a : null)) {
            ho4Var = qu0Var.p;
        } else {
            ho4Var = new ho4(view);
        }
        this.p = ho4Var;
        if (x) {
            qu0Var.getClass();
            lmVar = qu0Var.q;
        } else {
            lmVar = new lm(ViewConfiguration.get(view.getContext()));
        }
        this.q = lmVar;
        this.r = (qu0Var == null || (xf3Var = qu0Var.r) == null) ? new xf3() : xf3Var;
        this.s = new yk3();
        this.t = (qu0Var == null || (sh0Var = qu0Var.t) == null) ? new sh0() : sh0Var;
        this.v = new dj(6, this);
        this.w = new pu0(this);
    }

    public final void a(ee eeVar, aj2 aj2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        Set set;
        String str;
        boolean z2;
        View view;
        Object obj;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(123858079);
        if (sk2Var.h(eeVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (sk2Var.h(aj2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (sk2Var.h(this)) {
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
        if (sk2Var.O(i7 & 1, z)) {
            Object tag = eeVar.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            if ((tag instanceof Set) && (!(tag instanceof f93) || (tag instanceof j93))) {
                set = (Set) tag;
            } else {
                set = null;
            }
            if (set == null) {
                ViewParent parent = eeVar.getParent();
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
                if ((obj instanceof Set) && (!(obj instanceof f93) || (obj instanceof j93))) {
                    set = obj;
                } else {
                    set = null;
                }
            }
            if (set != null) {
                set.add(sk2Var.w());
                sk2Var.q = true;
                sk2Var.C = true;
                sk2Var.c.c();
                sk2Var.H.c();
                z86 z86Var = sk2Var.I;
                w86 w86Var = z86Var.a;
                z86Var.e = w86Var.e0;
                z86Var.f = w86Var.f0;
            }
            Object L = sk2Var.L();
            au5 au5Var = this.d;
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                ViewParent parent2 = eeVar.getParent();
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
                String p = b31.p("SaveableStateRegistry:", str);
                xt5 savedStateRegistry = au5Var.getSavedStateRegistry();
                Bundle a = savedStateRegistry.a(p);
                if (a != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : a.keySet()) {
                        ArrayList parcelableArrayList = a.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                }
                yd ydVar = yd.s0;
                ye6 ye6Var = nt5.a;
                mt5 mt5Var = new mt5(linkedHashMap, ydVar);
                if (savedStateRegistry.b(p) == null) {
                    try {
                        savedStateRegistry.c(p, new ss0(1, mt5Var));
                        z2 = true;
                    } catch (IllegalArgumentException unused) {
                    }
                    fh1 fh1Var = new fh1(mt5Var, new gh1(z2, savedStateRegistry, p));
                    sk2Var.h0(fh1Var);
                    L = fh1Var;
                }
                z2 = false;
                fh1 fh1Var2 = new fh1(mt5Var, new gh1(z2, savedStateRegistry, p));
                sk2Var.h0(fh1Var2);
                L = fh1Var2;
            }
            fh1 fh1Var3 = (fh1) L;
            boolean h = sk2Var.h(fh1Var3);
            Object L2 = sk2Var.L();
            if (h || L2 == sn1Var) {
                L2 = new yb(11, fh1Var3);
                sk2Var.h0(L2);
            }
            l.d(o27.a, (mi2) L2, sk2Var);
            tv0 tv0Var = ov0.w;
            boolean booleanValue = ((Boolean) sk2Var.j(tv0Var)).booleanValue() | eeVar.getScrollCaptureInProgress$ui();
            boolean f = sk2Var.f(eeVar.getView());
            Object L3 = sk2Var.L();
            if (f || L3 == sn1Var) {
                eeVar.getView();
                L3 = new Object();
                sk2Var.h0(L3);
            }
            dk7.b(new dq[]{yq3.a.a(this.c), cr3.a.a(au5Var), ue.d.a(this.f), ue.e.a(this.g), ue.b.a(eeVar.getContext()), k23.a.a(set), ue.a.a(eeVar.getConfiguration()), nt5.a.a(fh1Var3), ue.f.a(eeVar.getView()), tv0Var.a(Boolean.valueOf(booleanValue)), ov0.t.a(eeVar.getViewConfiguration()), ls2.a.a((yb7) L3)}, ct3.H0(1317454175, new ou0(eeVar, this, aj2Var), sk2Var), sk2Var, 56);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new ou0(this, eeVar, aj2Var, i);
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
            pu0 pu0Var = this.w;
            context.unregisterComponentCallbacks(pu0Var);
            yk3 yk3Var = this.s;
            if (yk3Var.b == null) {
                yk3Var.a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(pu0Var);
        }
    }

    public final void c() {
        int i = this.u + 1;
        this.u = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            pu0 pu0Var = this.w;
            context.registerComponentCallbacks(pu0Var);
            d(view.getResources().getConfiguration());
            boolean hasWindowFocus = view.hasWindowFocus();
            yk3 yk3Var = this.s;
            yk3Var.c.setValue(Boolean.valueOf(hasWindowFocus));
            tj4 tj4Var = yk3Var.b;
            dj djVar = this.v;
            if (tj4Var == null) {
                yk3Var.a = djVar;
            }
            if (tj4Var != null) {
                tj4Var.setValue(djVar.c());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(pu0Var);
        }
    }

    public final void d(Configuration configuration) {
        int updateFrom = this.h.updateFrom(configuration);
        if (updateFrom != 0) {
            Iterator it = this.f.a.entrySet().iterator();
            while (it.hasNext()) {
                bx2 bx2Var = (bx2) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (bx2Var == null || Configuration.needNewResources(updateFrom, bx2Var.b)) {
                    it.remove();
                }
            }
            this.i.setValue(new Configuration(configuration));
            ub5 ub5Var = this.g;
            synchronized (ub5Var) {
                ub5Var.a.c();
            }
            if ((268435456 & updateFrom) != 0) {
                this.o.setValue(pj7.a(this.a.getContext()));
            }
            if (((-1342235264) & updateFrom) != 0) {
                yk3 yk3Var = this.s;
                dj djVar = this.v;
                tj4 tj4Var = yk3Var.b;
                if (tj4Var != null) {
                    tj4Var.setValue(djVar.c());
                }
            }
        }
    }
}
