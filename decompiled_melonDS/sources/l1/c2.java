package l1;

import a6.i2;
import android.graphics.Path;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: w  reason: collision with root package name */
    public static final WeakHashMap f8518w = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final b f8519a;

    /* renamed from: b  reason: collision with root package name */
    public final b f8520b;

    /* renamed from: c  reason: collision with root package name */
    public final b f8521c;

    /* renamed from: d  reason: collision with root package name */
    public final b f8522d;

    /* renamed from: e  reason: collision with root package name */
    public final b f8523e;

    /* renamed from: f  reason: collision with root package name */
    public final b f8524f;

    /* renamed from: g  reason: collision with root package name */
    public final b f8525g;

    /* renamed from: h  reason: collision with root package name */
    public final b f8526h;

    /* renamed from: i  reason: collision with root package name */
    public final b f8527i;

    /* renamed from: j  reason: collision with root package name */
    public final y1 f8528j;

    /* renamed from: k  reason: collision with root package name */
    public final n2.f1 f8529k;

    /* renamed from: l  reason: collision with root package name */
    public final v1 f8530l;
    public final y1 m;

    /* renamed from: n  reason: collision with root package name */
    public final y1 f8531n;

    /* renamed from: o  reason: collision with root package name */
    public final y1 f8532o;

    /* renamed from: p  reason: collision with root package name */
    public final y1 f8533p;

    /* renamed from: q  reason: collision with root package name */
    public final y1 f8534q;

    /* renamed from: r  reason: collision with root package name */
    public final y1 f8535r;

    /* renamed from: s  reason: collision with root package name */
    public final y1 f8536s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f8537t;

    /* renamed from: u  reason: collision with root package name */
    public int f8538u;

    /* renamed from: v  reason: collision with root package name */
    public final m0 f8539v;

    public c2(View view) {
        View view2;
        Object obj;
        Boolean bool;
        b b10 = s.b(4, "captionBar");
        this.f8519a = b10;
        b b11 = s.b(128, "displayCutout");
        this.f8520b = b11;
        b b12 = s.b(8, "ime");
        this.f8521c = b12;
        b b13 = s.b(32, "mandatorySystemGestures");
        this.f8522d = b13;
        b b14 = s.b(2, "navigationBars");
        this.f8523e = b14;
        b b15 = s.b(1, "statusBars");
        this.f8524f = b15;
        b b16 = s.b(519, "systemBars");
        this.f8525g = b16;
        b b17 = s.b(16, "systemGestures");
        this.f8526h = b17;
        b b18 = s.b(64, "tappableElement");
        this.f8527i = b18;
        y1 y1Var = new y1(new q0(0, 0, 0, 0), "waterfall");
        this.f8528j = y1Var;
        this.f8529k = n2.s.w(null);
        this.f8530l = new v1(new v1(b16, b12), b11);
        new v1(new v1(new v1(b18, b13), b17), y1Var);
        this.m = s.d(4, "captionBarIgnoringVisibility");
        this.f8531n = s.d(2, "navigationBarsIgnoringVisibility");
        this.f8532o = s.d(1, "statusBarsIgnoringVisibility");
        this.f8533p = s.d(519, "systemBarsIgnoringVisibility");
        this.f8534q = s.d(64, "tappableElementIgnoringVisibility");
        this.f8535r = new y1(new q0(0, 0, 0, 0), "imeAnimationTarget");
        this.f8536s = new y1(new q0(0, 0, 0, 0), "imeAnimationSource");
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
        this.f8537t = bool != null ? bool.booleanValue() : false;
        this.f8539v = new m0(this);
        WeakHashMap weakHashMap = a6.x0.f533a;
        i2 a10 = a6.q0.a(view);
        if (a10 != null) {
            a6.d2 d2Var = a10.f479a;
            b10.f(d2Var.p(4));
            b11.f(d2Var.p(128));
            b12.f(d2Var.p(8));
            b13.f(d2Var.p(32));
            b14.f(d2Var.p(2));
            b15.f(d2Var.p(1));
            b16.f(d2Var.p(519));
            b17.f(d2Var.p(16));
            b18.f(d2Var.p(64));
        }
    }

    public static void b(c2 c2Var, i2 i2Var) {
        q5.b bVar;
        Path path;
        boolean z10 = false;
        c2Var.f8519a.g(i2Var, 0);
        c2Var.f8521c.g(i2Var, 0);
        c2Var.f8520b.g(i2Var, 0);
        c2Var.f8523e.g(i2Var, 0);
        c2Var.f8524f.g(i2Var, 0);
        c2Var.f8525g.g(i2Var, 0);
        c2Var.f8526h.g(i2Var, 0);
        c2Var.f8527i.g(i2Var, 0);
        c2Var.f8522d.g(i2Var, 0);
        c2Var.m.f(c.z(i2Var.f479a.g(4)));
        c2Var.f8531n.f(c.z(i2Var.f479a.g(2)));
        c2Var.f8532o.f(c.z(i2Var.f479a.g(1)));
        c2Var.f8533p.f(c.z(i2Var.f479a.g(519)));
        c2Var.f8534q.f(c.z(i2Var.f479a.g(64)));
        a6.n e6 = i2Var.f479a.e();
        y1 y1Var = c2Var.f8528j;
        if (e6 != null) {
            bVar = e6.a();
        } else {
            bVar = q5.b.f12282e;
        }
        y1Var.f(c.z(bVar));
        i3.h hVar = null;
        if (e6 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                path = a6.m.a(e6.f493a);
            } else {
                path = null;
            }
            if (path != null) {
                hVar = new i3.h(path);
            }
        }
        c2Var.f8529k.setValue(hVar);
        synchronized (z2.l.f14919c) {
            a1.n0 n0Var = z2.l.f14926j.f14888h;
            if (n0Var != null) {
                if (n0Var.h()) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            z2.l.a();
        }
    }

    public final void a(View view) {
        if (this.f8538u == 0) {
            WeakHashMap weakHashMap = a6.x0.f533a;
            m0 m0Var = this.f8539v;
            a6.p0.k(view, m0Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(m0Var);
            a6.x0.q(view, m0Var);
        }
        this.f8538u++;
    }
}
