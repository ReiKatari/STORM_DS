package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x23  reason: default package */
/* loaded from: classes.dex */
public final class x23 {
    public final Context a;
    public we1 b;
    public Object c;
    public iz6 d;
    public y23 e;
    public c44 f;
    public n05 g;
    public final List h;
    public x97 i;
    public final ww2 j;
    public final LinkedHashMap k;
    public final boolean l;
    public Boolean m;
    public final boolean n;
    public ra0 o;
    public ra0 p;
    public final wb1 q;
    public fj6 r;
    public y56 s;
    public ut3 t;
    public fj6 u;
    public y56 v;

    public x23(z23 z23Var, Context context) {
        this.a = context;
        this.b = z23Var.B;
        this.c = z23Var.b;
        this.d = z23Var.c;
        this.e = z23Var.d;
        this.f = z23Var.e;
        rg1 rg1Var = z23Var.A;
        this.g = rg1Var.d;
        this.h = z23Var.h;
        this.i = rg1Var.c;
        this.j = z23Var.j.c();
        this.k = c14.t0(z23Var.k.a);
        this.l = z23Var.l;
        this.m = rg1Var.e;
        this.n = z23Var.o;
        this.o = rg1Var.f;
        this.p = rg1Var.g;
        this.q = new wb1(z23Var.z);
        this.r = rg1Var.a;
        this.s = rg1Var.b;
        if (z23Var.a == context) {
            this.t = z23Var.w;
            this.u = z23Var.x;
            this.v = z23Var.y;
            return;
        }
        this.t = null;
        this.u = null;
        this.v = null;
    }

    public final z23 a() {
        yw2 yw2Var;
        ty6 ty6Var;
        boolean z;
        fj6 fj6Var;
        ps4 ps4Var;
        lp7 lp7Var;
        Object obj = this.c;
        if (obj == null) {
            obj = cs1.i0;
        }
        Object obj2 = obj;
        iz6 iz6Var = this.d;
        y23 y23Var = this.e;
        c44 c44Var = this.f;
        we1 we1Var = this.b;
        Bitmap.Config config = we1Var.g;
        n05 n05Var = this.g;
        if (n05Var == null) {
            n05Var = we1Var.f;
        }
        n05 n05Var2 = n05Var;
        x97 x97Var = this.i;
        if (x97Var == null) {
            x97Var = we1Var.e;
        }
        x97 x97Var2 = x97Var;
        ww2 ww2Var = this.j;
        if (ww2Var != null) {
            yw2Var = ww2Var.f();
        } else {
            yw2Var = null;
        }
        if (yw2Var == null) {
            yw2Var = k.c;
        } else {
            Bitmap.Config[] configArr = k.a;
        }
        yw2 yw2Var2 = yw2Var;
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap != null) {
            ty6Var = new ty6(g04.V(linkedHashMap));
        } else {
            ty6Var = null;
        }
        if (ty6Var == null) {
            ty6Var = ty6.b;
        }
        ty6 ty6Var2 = ty6Var;
        Boolean bool = this.m;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.b.h;
        }
        boolean z2 = z;
        we1 we1Var2 = this.b;
        boolean z3 = we1Var2.i;
        ra0 ra0Var = this.o;
        if (ra0Var == null) {
            ra0Var = we1Var2.m;
        }
        ra0 ra0Var2 = ra0Var;
        ra0 ra0Var3 = this.p;
        if (ra0Var3 == null) {
            ra0Var3 = we1Var2.n;
        }
        ra0 ra0Var4 = ra0Var3;
        ra0 ra0Var5 = we1Var2.o;
        n61 n61Var = we1Var2.a;
        n61 n61Var2 = we1Var2.b;
        n61 n61Var3 = we1Var2.c;
        n61 n61Var4 = we1Var2.d;
        ut3 ut3Var = this.t;
        Context context = this.a;
        if (ut3Var == null) {
            Context context2 = context;
            while (true) {
                if (context2 instanceof hu3) {
                    ut3Var = ((hu3) context2).getLifecycle();
                    break;
                } else if (!(context2 instanceof ContextWrapper)) {
                    ut3Var = null;
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (ut3Var == null) {
                ut3Var = js2.b;
            }
        }
        ut3 ut3Var2 = ut3Var;
        fj6 fj6Var2 = this.r;
        if (fj6Var2 == null) {
            fj6 fj6Var3 = this.u;
            if (fj6Var3 == null) {
                fj6Var3 = new dl1(context);
            }
            fj6Var = fj6Var3;
        } else {
            fj6Var = fj6Var2;
        }
        y56 y56Var = this.s;
        if (y56Var == null && (y56Var = this.v) == null) {
            if (fj6Var2 instanceof lp7) {
                lp7Var = (lp7) fj6Var2;
            } else {
                lp7Var = null;
            }
            if (lp7Var == null) {
                y56Var = y56.FIT;
            } else {
                throw null;
            }
        }
        y56 y56Var2 = y56Var;
        wb1 wb1Var = this.q;
        if (wb1Var != null) {
            ps4Var = new ps4(g04.V(wb1Var.b));
        } else {
            ps4Var = null;
        }
        if (ps4Var == null) {
            ps4Var = ps4.B;
        }
        return new z23(context, obj2, iz6Var, y23Var, c44Var, config, n05Var2, this.h, x97Var2, yw2Var2, ty6Var2, this.l, z2, z3, this.n, ra0Var2, ra0Var4, ra0Var5, n61Var, n61Var2, n61Var3, n61Var4, ut3Var2, fj6Var, y56Var2, ps4Var, new rg1(this.r, this.s, this.i, this.g, this.m, this.o, this.p), this.b);
    }

    public final void b(boolean z) {
        int i;
        x97 x97Var;
        if (z) {
            i = 100;
        } else {
            i = 0;
        }
        if (i > 0) {
            x97Var = new s71(i);
        } else {
            x97Var = x97.a;
        }
        this.i = x97Var;
    }

    public x23(Context context) {
        this.a = context;
        this.b = h.a;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = yt1.A;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = true;
        this.m = null;
        this.n = true;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
    }
}
