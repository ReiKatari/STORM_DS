package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e00  reason: default package */
/* loaded from: classes.dex */
public final class e00 extends ra7 {
    public final z33 b;
    public final y37 c;
    public final ee6 d;
    public final q45 e;
    public final ee6 f;
    public final q45 g;

    public e00(z33 z33Var, y37 y37Var, pt5 pt5Var) {
        UUID uuid;
        z33Var.getClass();
        y37Var.getClass();
        pt5Var.getClass();
        this.b = z33Var;
        this.c = y37Var;
        ee6 a = fe6.a(null);
        this.d = a;
        this.e = new q45(a);
        ee6 a2 = fe6.a(null);
        this.f = a2;
        this.g = new q45(a2);
        String str = (String) pt5Var.a("initial_background_id");
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        a2.k(uuid);
        tq5.w(ua7.a(this), null, null, new a6(this, null, 4), 3);
    }

    public final void e(vy vyVar) {
        vyVar.getClass();
        this.c.a(vyVar.c, nm4.READ);
        tq5.w(ua7.a(this), null, null, new d00(this, vyVar, null, 0), 3);
    }
}
