package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vw1  reason: default package */
/* loaded from: classes.dex */
public final class vw1 extends qo7 {
    public final s9 b;
    public final kd6 c;
    public final of6 d;
    public final be5 e;
    public mb3 f;

    public vw1(s9 s9Var, kd6 kd6Var) {
        kd6Var.getClass();
        this.b = s9Var;
        this.c = kd6Var;
        of6 a = bl2.a();
        this.d = a;
        this.e = new be5(a);
    }

    public final void e() {
        mb3 mb3Var = this.f;
        if (mb3Var != null) {
            if (mb3Var instanceof uw1) {
                pq5 pq5Var = ((uw1) mb3Var).F;
                pq5Var.getClass();
                this.f = new uw1(pq5Var);
                hv.L(to7.a(this), null, null, new xd1(this, pq5Var, null, 6), 3);
            } else if (mb3Var instanceof tw1) {
                ConsoleType consoleType = ((tw1) mb3Var).F;
                consoleType.getClass();
                this.f = new tw1(consoleType);
                hv.L(to7.a(this), null, null, new xd1(this, consoleType, null, 5), 3);
            } else {
                i.d();
            }
        }
    }
}
