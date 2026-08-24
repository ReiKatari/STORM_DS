package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.stormds.emulator.R;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dv7  reason: default package */
/* loaded from: classes.dex */
public final class dv7 {
    public static final WeakHashMap w = new WeakHashMap();
    public final bn a;
    public final bn b;
    public final bn c;
    public final bn d;
    public final bn e;
    public final bn f;
    public final bn g;
    public final bn h;
    public final bn i;
    public final ok7 j;
    public final vs4 k;
    public final ig7 l;
    public final ok7 m;
    public final ok7 n;
    public final ok7 o;
    public final ok7 p;
    public final ok7 q;
    public final ok7 r;
    public final ok7 s;
    public final boolean t;
    public int u;
    public final k83 v;

    public dv7(View view) {
        View view2;
        Object obj;
        Boolean bool;
        boolean z;
        bn b = th7.b(4, "captionBar");
        this.a = b;
        bn b2 = th7.b(128, "displayCutout");
        this.b = b2;
        bn b3 = th7.b(8, "ime");
        this.c = b3;
        bn b4 = th7.b(32, "mandatorySystemGestures");
        this.d = b4;
        bn b5 = th7.b(2, "navigationBars");
        this.e = b5;
        bn b6 = th7.b(1, "statusBars");
        this.f = b6;
        bn b7 = th7.b(519, "systemBars");
        this.g = b7;
        bn b8 = th7.b(16, "systemGestures");
        this.h = b8;
        bn b9 = th7.b(64, "tappableElement");
        this.i = b9;
        ok7 ok7Var = new ok7(new p83(0, 0, 0, 0), "waterfall");
        this.j = ok7Var;
        this.k = np2.Y(null);
        ig7 ig7Var = new ig7(new ig7(b7, b3), b2);
        this.l = ig7Var;
        new ig7(ig7Var, new ig7(new ig7(new ig7(b9, b4), b8), ok7Var));
        this.m = th7.c(4, "captionBarIgnoringVisibility");
        this.n = th7.c(2, "navigationBarsIgnoringVisibility");
        this.o = th7.c(1, "statusBarsIgnoringVisibility");
        this.p = th7.c(519, "systemBarsIgnoringVisibility");
        this.q = th7.c(64, "tappableElementIgnoringVisibility");
        this.r = new ok7(new p83(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new ok7(new p83(0, 0, 0, 0), "imeAnimationSource");
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
        this.v = new k83(this);
        WeakHashMap weakHashMap = ao7.a;
        vu7 a = tn7.a(view);
        if (a != null) {
            ru7 ru7Var = a.a;
            b.f(ru7Var.t(4));
            b2.f(ru7Var.t(128));
            b3.f(ru7Var.t(8));
            b4.f(ru7Var.t(32));
            b5.f(ru7Var.t(2));
            b6.f(ru7Var.t(1));
            b7.f(ru7Var.t(519));
            b8.f(ru7Var.t(16));
            b9.f(ru7Var.t(64));
        }
    }

    public static void b(dv7 dv7Var, vu7 vu7Var) {
        e83 e83Var;
        Path path;
        boolean z = false;
        dv7Var.a.g(vu7Var, 0);
        dv7Var.c.g(vu7Var, 0);
        dv7Var.b.g(vu7Var, 0);
        dv7Var.e.g(vu7Var, 0);
        dv7Var.f.g(vu7Var, 0);
        dv7Var.g.g(vu7Var, 0);
        dv7Var.h.g(vu7Var, 0);
        dv7Var.i.g(vu7Var, 0);
        dv7Var.d.g(vu7Var, 0);
        dv7Var.m.f(jv7.b(vu7Var.a.i(4)));
        dv7Var.n.f(jv7.b(vu7Var.a.i(2)));
        dv7Var.o.f(jv7.b(vu7Var.a.i(1)));
        dv7Var.p.f(jv7.b(vu7Var.a.i(519)));
        dv7Var.q.f(jv7.b(vu7Var.a.i(64)));
        yk1 g = vu7Var.a.g();
        ok7 ok7Var = dv7Var.j;
        if (g != null) {
            e83Var = g.a();
        } else {
            e83Var = e83.e;
        }
        ok7Var.f(jv7.b(e83Var));
        hj hjVar = null;
        if (g != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                path = up.d(g.a);
            } else {
                path = null;
            }
            if (path != null) {
                hjVar = new hj(path);
            }
        }
        dv7Var.k.setValue(hjVar);
        synchronized (bm6.c) {
            ka4 ka4Var = bm6.j.h;
            if (ka4Var != null) {
                if (ka4Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            bm6.a();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            WeakHashMap weakHashMap = ao7.a;
            k83 k83Var = this.v;
            sn7.c(view, k83Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(k83Var);
            ao7.p(view, k83Var);
        }
        this.u++;
    }
}
