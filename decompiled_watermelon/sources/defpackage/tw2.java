package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tw2  reason: default package */
/* loaded from: classes.dex */
public final class tw2 {
    public final Context a;
    public ab1 b;
    public Object c;
    public ym6 d;
    public uw2 e;
    public ow3 f;
    public kr4 g;
    public final List h;
    public bx6 i;
    public final vq2 j;
    public final LinkedHashMap k;
    public final boolean l;
    public final boolean m;
    public j80 n;
    public j80 o;
    public final e81 p;
    public q76 q;
    public uu5 r;
    public rm3 s;
    public q76 t;
    public uu5 u;

    public tw2(vw2 vw2Var, Context context) {
        this.a = context;
        this.b = vw2Var.B;
        this.c = vw2Var.b;
        this.d = vw2Var.c;
        this.e = vw2Var.d;
        this.f = vw2Var.e;
        qc1 qc1Var = vw2Var.A;
        this.g = qc1Var.d;
        this.h = vw2Var.h;
        this.i = qc1Var.c;
        this.j = vw2Var.j.d();
        this.k = zt3.s0(vw2Var.k.a);
        this.l = vw2Var.l;
        this.m = vw2Var.o;
        this.n = qc1Var.e;
        this.o = qc1Var.f;
        this.p = new e81(vw2Var.z);
        this.q = qc1Var.a;
        this.r = qc1Var.b;
        if (vw2Var.a == context) {
            this.s = vw2Var.w;
            this.t = vw2Var.x;
            this.u = vw2Var.y;
            return;
        }
        this.s = null;
        this.t = null;
        this.u = null;
    }

    public final vw2 a() {
        xq2 xq2Var;
        jm6 jm6Var;
        q76 q76Var;
        nj4 nj4Var;
        kb7 kb7Var;
        Object obj = this.c;
        if (obj == null) {
            obj = y60.x0;
        }
        Object obj2 = obj;
        ym6 ym6Var = this.d;
        uw2 uw2Var = this.e;
        ow3 ow3Var = this.f;
        ab1 ab1Var = this.b;
        Bitmap.Config config = ab1Var.g;
        kr4 kr4Var = this.g;
        if (kr4Var == null) {
            kr4Var = ab1Var.f;
        }
        kr4 kr4Var2 = kr4Var;
        bx6 bx6Var = this.i;
        if (bx6Var == null) {
            bx6Var = ab1Var.e;
        }
        bx6 bx6Var2 = bx6Var;
        vq2 vq2Var = this.j;
        if (vq2Var != null) {
            xq2Var = vq2Var.f();
        } else {
            xq2Var = null;
        }
        if (xq2Var == null) {
            xq2Var = k.c;
        } else {
            Bitmap.Config[] configArr = k.a;
        }
        xq2 xq2Var2 = xq2Var;
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap != null) {
            jm6Var = new jm6(pu.L(linkedHashMap));
        } else {
            jm6Var = null;
        }
        if (jm6Var == null) {
            jm6Var = jm6.b;
        }
        jm6 jm6Var2 = jm6Var;
        ab1 ab1Var2 = this.b;
        boolean z = ab1Var2.h;
        boolean z2 = ab1Var2.i;
        j80 j80Var = this.n;
        if (j80Var == null) {
            j80Var = ab1Var2.m;
        }
        j80 j80Var2 = j80Var;
        j80 j80Var3 = this.o;
        if (j80Var3 == null) {
            j80Var3 = ab1Var2.n;
        }
        j80 j80Var4 = j80Var3;
        j80 j80Var5 = ab1Var2.o;
        g31 g31Var = ab1Var2.a;
        g31 g31Var2 = ab1Var2.b;
        g31 g31Var3 = ab1Var2.c;
        g31 g31Var4 = ab1Var2.d;
        rm3 rm3Var = this.s;
        Context context = this.a;
        if (rm3Var == null) {
            Context context2 = context;
            while (true) {
                if (context2 instanceof fn3) {
                    rm3Var = ((fn3) context2).getLifecycle();
                    break;
                } else if (!(context2 instanceof ContextWrapper)) {
                    rm3Var = null;
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rm3Var == null) {
                rm3Var = em2.b;
            }
        }
        rm3 rm3Var2 = rm3Var;
        q76 q76Var2 = this.q;
        if (q76Var2 == null) {
            q76 q76Var3 = this.t;
            if (q76Var3 == null) {
                q76Var3 = new zg1(context);
            }
            q76Var = q76Var3;
        } else {
            q76Var = q76Var2;
        }
        uu5 uu5Var = this.r;
        if (uu5Var == null && (uu5Var = this.u) == null) {
            if (q76Var2 instanceof kb7) {
                kb7Var = (kb7) q76Var2;
            } else {
                kb7Var = null;
            }
            if (kb7Var == null) {
                uu5Var = uu5.FIT;
            } else {
                throw null;
            }
        }
        uu5 uu5Var2 = uu5Var;
        e81 e81Var = this.p;
        if (e81Var != null) {
            nj4Var = new nj4(pu.L(e81Var.b));
        } else {
            nj4Var = null;
        }
        if (nj4Var == null) {
            nj4Var = nj4.B;
        }
        return new vw2(context, obj2, ym6Var, uw2Var, ow3Var, config, kr4Var2, this.h, bx6Var2, xq2Var2, jm6Var2, this.l, z, z2, this.m, j80Var2, j80Var4, j80Var5, g31Var, g31Var2, g31Var3, g31Var4, rm3Var2, q76Var, uu5Var2, nj4Var, new qc1(this.q, this.r, this.i, this.g, this.n, this.o), this.b);
    }

    public final void b(boolean z) {
        int i;
        bx6 bx6Var;
        if (z) {
            i = 100;
        } else {
            i = 0;
        }
        if (i > 0) {
            bx6Var = new i41(i);
        } else {
            bx6Var = bx6.a;
        }
        this.i = bx6Var;
    }

    public tw2(Context context) {
        this.a = context;
        this.b = h.a;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = pp1.A;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = true;
        this.m = true;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
    }
}
