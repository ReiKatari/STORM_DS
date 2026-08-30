package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w61  reason: default package */
/* loaded from: classes.dex */
public final class w61 extends ra7 {
    public final qf b;
    public final w16 c;
    public final l62 d;
    public final ee6 e;
    public final ee6 f;
    public final ee6 g;
    public final q45 h;
    public final c46 i;
    public final o45 j;
    public final c46 k;
    public final o45 l;

    public w61(qf qfVar, w16 w16Var, l62 l62Var) {
        qfVar.getClass();
        w16Var.getClass();
        l62Var.getClass();
        this.b = qfVar;
        this.c = w16Var;
        this.d = l62Var;
        ee6 a = fe6.a(p61.a);
        this.e = a;
        this.f = a;
        ee6 a2 = fe6.a(Boolean.FALSE);
        this.g = a2;
        this.h = new q45(a2);
        h60 h60Var = h60.DROP_OLDEST;
        c46 b = d46.b(0, 1, h60Var, 1);
        this.i = b;
        this.j = new o45(b);
        c46 b2 = d46.b(0, 1, h60Var, 1);
        this.k = b2;
        this.l = new o45(b2);
        f();
    }

    @Override // defpackage.ra7
    public final void d() {
        this.b.d();
    }

    public final void e(Uri uri) {
        uri.getClass();
        Boolean bool = Boolean.TRUE;
        ee6 ee6Var = this.g;
        ee6Var.getClass();
        ee6Var.l(null, bool);
        tq5.w(ua7.a(this), null, null, new u61(this, uri, null, 1), 3);
    }

    public final void f() {
        gw0 gw0Var = this.d.c().b;
        if (gw0Var != gw0.VALID) {
            n61 n61Var = new n61(gw0Var);
            ee6 ee6Var = this.e;
            ee6Var.getClass();
            ee6Var.l(null, n61Var);
            return;
        }
        tq5.w(ua7.a(this), null, null, new v61(this, null, 1), 3);
    }
}
