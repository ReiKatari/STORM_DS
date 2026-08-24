package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mi2  reason: default package */
/* loaded from: classes.dex */
public final class mi2 implements ki2 {
    public final rh a;
    public final sh b;
    public final rr6 c;
    public final ri2 d;
    public final s63 e;
    public final bg2 f;

    public mi2(rh rhVar, sh shVar) {
        rr6 rr6Var = ni2.a;
        ri2 ri2Var = new ri2(ni2.b);
        s63 s63Var = new s63(27, (byte) 0);
        this.a = rhVar;
        this.b = shVar;
        this.c = rr6Var;
        this.d = ri2Var;
        this.e = s63Var;
        this.f = new bg2(this, 1);
    }

    public final we7 a(te7 te7Var) {
        rr6 rr6Var = this.c;
        bi2 bi2Var = new bi2(1, this, te7Var);
        synchronized (((w31) rr6Var.B)) {
            we7 we7Var = (we7) ((yz3) rr6Var.L).h(te7Var);
            if (we7Var != null) {
                if (we7Var.c()) {
                    return we7Var;
                }
                we7 we7Var2 = (we7) ((yz3) rr6Var.L).m(te7Var);
            }
            try {
                we7 we7Var3 = (we7) bi2Var.g(new ja7(4, rr6Var, te7Var));
                synchronized (((w31) rr6Var.B)) {
                    if (((yz3) rr6Var.L).h(te7Var) == null && we7Var3.c()) {
                        ((yz3) rr6Var.L).l(te7Var, we7Var3);
                    }
                }
                return we7Var3;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final we7 b(li2 li2Var, oj2 oj2Var, int i, int i2) {
        oj2 oj2Var2;
        sh shVar = this.b;
        shVar.getClass();
        int i3 = shVar.A;
        if (i3 != 0 && i3 != Integer.MAX_VALUE) {
            oj2Var2 = new oj2(gi2.q(oj2Var.A + i3, 1, 1000));
        } else {
            oj2Var2 = oj2Var;
        }
        this.a.getClass();
        return a(new te7(li2Var, oj2Var2, i, i2, null));
    }
}
