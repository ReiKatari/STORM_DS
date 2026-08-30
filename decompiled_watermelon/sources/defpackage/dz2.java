package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dz2  reason: default package */
/* loaded from: classes.dex */
public final class dz2 {
    public final o24 a = new o24(new az2[16]);
    public final tj4 b = me2.G(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final tj4 d = me2.G(Boolean.TRUE);

    public final void a(tu0 tu0Var, int i) {
        int i2;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-318043801);
        if (sk2Var.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = me2.G(null);
                sk2Var.h0(L);
            }
            k24 k24Var = (k24) L;
            if (!((Boolean) this.d.getValue()).booleanValue() && !((Boolean) this.b.getValue()).booleanValue()) {
                sk2Var.X(-143455237);
                sk2Var.p(false);
            } else {
                sk2Var.X(-144841960);
                boolean h = sk2Var.h(this);
                Object L2 = sk2Var.L();
                if (h || L2 == sn1Var) {
                    L2 = new m5(k24Var, this, null);
                    sk2Var.h0(L2);
                }
                l.g(sk2Var, (aj2) L2, this);
                sk2Var.p(false);
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new z5(i, 13, this);
        }
    }
}
