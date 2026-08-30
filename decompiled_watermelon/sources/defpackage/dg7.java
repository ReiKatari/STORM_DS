package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dg7  reason: default package */
/* loaded from: classes.dex */
public final class dg7 {
    public static final WeakHashMap w = new WeakHashMap();
    public final pm a;
    public final pm b;
    public final pm c;
    public final pm d;
    public final pm e;
    public final pm f;
    public final pm g;
    public final pm h;
    public final pm i;
    public final p67 j;
    public final tj4 k;
    public final n27 l;
    public final p67 m;
    public final p67 n;
    public final p67 o;
    public final p67 p;
    public final p67 q;
    public final p67 r;
    public final p67 s;
    public final boolean t;
    public int u;
    public final d23 v;

    public dg7(View view) {
        View view2;
        Object obj;
        Boolean bool;
        boolean z;
        pm h = hm1.h(4, "captionBar");
        this.a = h;
        pm h2 = hm1.h(128, "displayCutout");
        this.b = h2;
        pm h3 = hm1.h(8, "ime");
        this.c = h3;
        pm h4 = hm1.h(32, "mandatorySystemGestures");
        this.d = h4;
        pm h5 = hm1.h(2, "navigationBars");
        this.e = h5;
        pm h6 = hm1.h(1, "statusBars");
        this.f = h6;
        pm h7 = hm1.h(519, "systemBars");
        this.g = h7;
        pm h8 = hm1.h(16, "systemGestures");
        this.h = h8;
        pm h9 = hm1.h(64, "tappableElement");
        this.i = h9;
        p67 p67Var = new p67(new i23(0, 0, 0, 0), "waterfall");
        this.j = p67Var;
        this.k = me2.G(null);
        n27 n27Var = new n27(new n27(h7, h3), h2);
        this.l = n27Var;
        new n27(n27Var, new n27(new n27(new n27(h9, h4), h8), p67Var));
        this.m = hm1.i(4, "captionBarIgnoringVisibility");
        this.n = hm1.i(2, "navigationBarsIgnoringVisibility");
        this.o = hm1.i(1, "statusBarsIgnoringVisibility");
        this.p = hm1.i(519, "systemBarsIgnoringVisibility");
        this.q = hm1.i(64, "tappableElementIgnoringVisibility");
        this.r = new p67(new i23(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new p67(new i23(0, 0, 0, 0), "imeAnimationSource");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            obj = view2.getTag(R.id.consume_window_insets_tag);
        } else {
            obj = null;
        }
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            bool = null;
        }
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.t = z;
        this.v = new d23(this);
        WeakHashMap weakHashMap = aa7.a;
        vf7 a = t97.a(view);
        if (a != null) {
            rf7 rf7Var = a.a;
            h.f(rf7Var.t(4));
            h2.f(rf7Var.t(128));
            h3.f(rf7Var.t(8));
            h4.f(rf7Var.t(32));
            h5.f(rf7Var.t(2));
            h6.f(rf7Var.t(1));
            h7.f(rf7Var.t(519));
            h8.f(rf7Var.t(16));
            h9.f(rf7Var.t(64));
        }
    }

    public static void b(dg7 dg7Var, vf7 vf7Var) {
        x13 x13Var;
        Path path;
        boolean z = false;
        dg7Var.a.g(vf7Var, 0);
        dg7Var.c.g(vf7Var, 0);
        dg7Var.b.g(vf7Var, 0);
        dg7Var.e.g(vf7Var, 0);
        dg7Var.f.g(vf7Var, 0);
        dg7Var.g.g(vf7Var, 0);
        dg7Var.h.g(vf7Var, 0);
        dg7Var.i.g(vf7Var, 0);
        dg7Var.d.g(vf7Var, 0);
        dg7Var.m.f(jg7.b(vf7Var.a.i(4)));
        dg7Var.n.f(jg7.b(vf7Var.a.i(2)));
        dg7Var.o.f(jg7.b(vf7Var.a.i(1)));
        dg7Var.p.f(jg7.b(vf7Var.a.i(519)));
        dg7Var.q.f(jg7.b(vf7Var.a.i(64)));
        ug1 g = vf7Var.a.g();
        p67 p67Var = dg7Var.j;
        if (g != null) {
            x13Var = g.a();
        } else {
            x13Var = x13.e;
        }
        p67Var.f(jg7.b(x13Var));
        vi viVar = null;
        if (g != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                path = ip.d(g.a);
            } else {
                path = null;
            }
            if (path != null) {
                viVar = new vi(path);
            }
        }
        dg7Var.k.setValue(viVar);
        synchronized (ma6.c) {
            e24 e24Var = ma6.j.h;
            if (e24Var != null) {
                if (e24Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            ma6.a();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            WeakHashMap weakHashMap = aa7.a;
            d23 d23Var = this.v;
            s97.c(view, d23Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(d23Var);
            aa7.p(view, d23Var);
        }
        this.u++;
    }
}
