package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v10  reason: default package */
/* loaded from: classes.dex */
public final class v10 extends qo7 {
    public final ha3 b;
    public final wh7 c;
    public final tp6 d;
    public final de5 e;
    public final tp6 f;
    public final de5 g;

    public v10(ha3 ha3Var, wh7 wh7Var, v46 v46Var) {
        UUID uuid;
        ha3Var.getClass();
        wh7Var.getClass();
        v46Var.getClass();
        this.b = ha3Var;
        this.c = wh7Var;
        tp6 a = up6.a(null);
        this.d = a;
        this.e = new de5(a);
        tp6 a2 = up6.a(null);
        this.f = a2;
        this.g = new de5(a2);
        String str = (String) v46Var.a("initial_background_id");
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        a2.l(uuid);
        hv.L(to7.a(this), null, null, new a6(this, null, 4), 3);
    }

    public final void e(n00 n00Var) {
        n00Var.getClass();
        this.c.a(n00Var.c, sv4.READ);
        hv.L(to7.a(this), null, null, new u10(this, n00Var, null, 0), 3);
    }
}
