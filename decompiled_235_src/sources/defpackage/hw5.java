package defpackage;

import com.github.junrar.unpack.vm.RarVM;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hw5  reason: default package */
/* loaded from: classes.dex */
public final class hw5 extends qo7 {
    public final bw5 b;
    public final p06 c;
    public final kd6 d;
    public final wh7 e;
    public final tp6 f;
    public final de5 g;
    public final tp6 h;
    public final ex6 i;

    public hw5(bw5 bw5Var, p06 p06Var, kd6 kd6Var, kx5 kx5Var, wh7 wh7Var, v46 v46Var) {
        bw5Var.getClass();
        p06Var.getClass();
        kd6Var.getClass();
        kx5Var.getClass();
        wh7Var.getClass();
        v46Var.getClass();
        this.b = bw5Var;
        this.c = p06Var;
        this.d = kd6Var;
        this.e = wh7Var;
        Object a = v46Var.a("rom");
        a.getClass();
        tp6 a2 = up6.a(((wz5) a).A);
        this.f = a2;
        this.g = new de5(a2);
        this.h = up6.a(((pq5) a2.getValue()).f);
        hv.L(to7.a(this), null, null, new ns3(this, null, 9), 3);
        this.i = new ex6(new er2(this, 22));
    }

    public static final boolean e(hw5 hw5Var, pq5 pq5Var) {
        jt5 jt5Var;
        if (pq5Var.h) {
            jt5Var = new jt5(u26.DSi, a36.DEFAULT, null, uw5.o, null, false, nx5.GLOBAL, null, null, null, null, null, null, null, null, null, null, null);
        } else {
            jt5Var = new jt5(null, null, null, null, null, false, null, null, null, null, null, null, null, null, RarVM.VM_MEMMASK);
        }
        return nb3.k(pq5Var.f, jt5Var);
    }
}
