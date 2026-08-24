package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y12  reason: default package */
/* loaded from: classes.dex */
public final class y12 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ sz1 Y;
    public final /* synthetic */ ConsoleType Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y12(sz1 sz1Var, ConsoleType consoleType, r41 r41Var) {
        super(2, r41Var);
        this.Y = sz1Var;
        this.Z = consoleType;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((y12) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new y12(this.Y, this.Z, r41Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006e, code lost:
        if (defpackage.sz1.i(r0, null, r10) == r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
        if (r11 == r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
        return r3;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        sz1 sz1Var = this.Y;
        tp6 tp6Var = sz1Var.p0;
        o41 o41Var = sz1Var.z;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        ConsoleType consoleType = this.Z;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    oi2.Y(obj);
                    bd2 bd2Var = (bd2) obj;
                    if (bd2Var instanceof zc2) {
                        xx1 xx1Var = new xx1(((zc2) bd2Var).a);
                        tp6Var.getClass();
                        tp6Var.m(null, xx1Var);
                    } else if (nb3.k(bd2Var, ad2.a)) {
                        cy1 cy1Var = new cy1(consoleType);
                        tp6Var.getClass();
                        tp6Var.m(null, cy1Var);
                        hv.L(o41Var, null, null, new p12(1, null, sz1Var), 3);
                    } else {
                        i.d();
                        return null;
                    }
                    return jg7.a;
                }
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oi2.Y(obj);
        } else {
            oi2.Y(obj);
            hv.L(o41Var, null, null, new hz1(22, null, sz1Var), 3);
            hv.L(o41Var, null, null, new hz1(25, null, sz1Var), 3);
            hv.L(o41Var, null, null, new hz1(24, null, sz1Var), 3);
            hv.L(o41Var, null, null, new hz1(23, null, sz1Var), 3);
            sz1Var.r0.l(null);
            hv.L(o41Var, null, null, new hz1(20, null, sz1Var), 3);
            hv.L(o41Var, null, null, new hz1(19, null, sz1Var), 3);
            this.X = 1;
        }
        jh jhVar = sz1Var.v;
        this.X = 2;
        jhVar.getClass();
        xe1 xe1Var = xk1.a;
        obj = hv.d0(de1.L, new bh(jhVar, consoleType, null), this);
    }
}
