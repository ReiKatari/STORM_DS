package defpackage;

import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w6  reason: default package */
/* loaded from: classes.dex */
public final class w6 {
    public final mm6 a = new mm6();
    public final LinkedHashSet b = new LinkedHashSet();
    public long c;

    public final void a(o75 o75Var, n3 n3Var) {
        s6 s6Var = new s6(o75Var, n3Var, 1);
        mm6 mm6Var = this.a;
        gt0.W0(mm6Var, s6Var);
        mm6Var.add(0, new m3(o75Var, n3Var, new bt(new u6(this, o75Var, n3Var, 1)), f()));
    }

    public final void b(o3 o3Var, n3 n3Var) {
        p6 p6Var = new p6(o3Var, n3Var, 0);
        mm6 mm6Var = this.a;
        gt0.W0(mm6Var, p6Var);
        mm6Var.add(0, new p3(o3Var.a, o3Var.b, o3Var.c, o3Var.d, n3Var, new bt(new u6(this, o3Var, n3Var, 0)), f()));
    }

    public final void c(o95 o95Var) {
        this.a.add(0, new l3(o95Var.a, o95Var.b, o95Var.c, o95Var.d, new bt(new q6(2, this, o95Var)), f()));
    }

    public final void d(int i, nb3 nb3Var, boolean z) {
        mm6 mm6Var = this.a;
        Object obj = mm6Var.get(i);
        obj.getClass();
        u3 u3Var = (u3) obj;
        bt btVar = u3Var.c;
        u3 u3Var2 = new u3(nb3Var, z, btVar, u3Var.d);
        ((ta4) btVar.L).c.setValue(Boolean.TRUE);
        mm6Var.set(i, u3Var2);
    }

    public final void e(int i, o95 o95Var) {
        mm6 mm6Var = this.a;
        Object obj = mm6Var.get(i);
        obj.getClass();
        l3 l3Var = (l3) obj;
        bt btVar = l3Var.e;
        long j = l3Var.a.a;
        o75 o75Var = o95Var.a;
        int i2 = (j > o75Var.a ? 1 : (j == o75Var.a ? 0 : -1));
        int i3 = o95Var.b;
        if (i2 == 0) {
            mm6Var.set(i, new l3(o75Var, i3, o95Var.c, o95Var.d, btVar, l3Var.f));
        } else if (i3 / o95Var.c > l3Var.b / l3Var.c) {
            btVar.E();
            c(o95Var);
        }
    }

    public final long f() {
        long j = this.c;
        this.c = 1 + j;
        return j;
    }
}
