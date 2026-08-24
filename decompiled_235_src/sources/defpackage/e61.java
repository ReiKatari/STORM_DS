package defpackage;

import android.os.Build;
import android.view.autofill.AutofillValue;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e61  reason: default package */
/* loaded from: classes.dex */
public final class e61 extends zg1 implements va6 {
    public p97 m0;
    public c37 n0;
    public jt3 o0;
    public boolean p0;
    public boolean q0;
    public mk4 r0;
    public p27 s0;
    public l33 t0;
    public nh2 u0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void U0(jt3 jt3Var, String str, boolean z) {
        if (!z) {
            return;
        }
        t37 t37Var = jt3Var.e;
        w51 w51Var = jt3Var.v;
        if (t37Var != null) {
            c37 n = jt3Var.d.n(hf.c0(new Object(), new pu0(str, 1)));
            t37Var.a(null, n);
            w51Var.g(n);
            return;
        }
        int length = str.length();
        w51Var.g(new c37(str, 4, jx2.f(length, length)));
    }

    @Override // defpackage.va6
    public final void A0(gb6 gb6Var) {
        oh ohVar;
        AutofillValue forText;
        boolean z = this.q0;
        fp fpVar = this.n0.a;
        fg3[] fg3VarArr = eb6.a;
        fb6 fb6Var = bb6.F;
        fg3[] fg3VarArr2 = eb6.a;
        fg3 fg3Var = fg3VarArr2[18];
        gb6Var.a(fb6Var, fpVar);
        fp fpVar2 = this.m0.a;
        fb6 fb6Var2 = bb6.G;
        fg3 fg3Var2 = fg3VarArr2[19];
        gb6Var.a(fb6Var2, fpVar2);
        long j = this.n0.b;
        fb6 fb6Var3 = bb6.H;
        fg3 fg3Var3 = fg3VarArr2[20];
        gb6Var.a(fb6Var3, new k47(j));
        rf rfVar = xd5.Y;
        fb6 fb6Var4 = bb6.s;
        fg3 fg3Var4 = fg3VarArr2[9];
        gb6Var.a(fb6Var4, rfVar);
        fp fpVar3 = this.n0.a;
        if (Build.VERSION.SDK_INT >= 26) {
            forText = AutofillValue.forText(fpVar3);
            ohVar = new oh(forText);
        } else {
            ohVar = null;
        }
        if (ohVar != null) {
            fb6 fb6Var5 = bb6.t;
            fg3 fg3Var5 = fg3VarArr2[10];
            gb6Var.a(fb6Var5, ohVar);
        }
        gb6Var.a(sa6.h, new y1(null, new d61(this, 0)));
        int i = this.t0.d;
        if (i == 6) {
            d41.a.getClass();
            eb6.c(gb6Var, c41.d);
        } else if (i == 7 || i == 8) {
            d41.a.getClass();
            eb6.c(gb6Var, c41.c);
        } else if (i == 4) {
            d41.a.getClass();
            eb6.c(gb6Var, c41.e);
        }
        boolean z2 = this.p0;
        jg7 jg7Var = jg7.a;
        if (!z2) {
            gb6Var.a(bb6.j, jg7Var);
        }
        if (z) {
            gb6Var.a(bb6.L, jg7Var);
        }
        boolean z3 = this.p0;
        fb6 fb6Var6 = bb6.O;
        fg3 fg3Var6 = fg3VarArr2[28];
        gb6Var.a(fb6Var6, Boolean.valueOf(z3));
        eb6.a(gb6Var, new d61(this, 1));
        if (z3) {
            gb6Var.a(sa6.k, new y1(null, new d61(this, 2)));
            gb6Var.a(sa6.o, new y1(null, new d61(this, gb6Var)));
        }
        gb6Var.a(sa6.j, new y1(null, new ov4(this, 5)));
        int i2 = this.t0.e;
        c61 c61Var = new c61(this, 6);
        gb6Var.a(bb6.I, new k33(i2));
        gb6Var.a(sa6.p, new y1(null, c61Var));
        gb6Var.a(sa6.b, new y1(null, new c61(this, 7)));
        gb6Var.a(sa6.c, new y1(null, new c61(this, 1)));
        if (!k47.c(this.n0.b) && !z) {
            gb6Var.a(sa6.q, new y1(null, new c61(this, 2)));
            if (this.p0) {
                gb6Var.a(sa6.r, new y1(null, new c61(this, 3)));
            }
        }
        if (this.p0) {
            gb6Var.a(sa6.s, new y1(null, new c61(this, 5)));
        }
    }

    @Override // defpackage.va6
    public final boolean C0() {
        return true;
    }
}
