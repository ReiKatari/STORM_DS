package defpackage;

import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p12  reason: default package */
/* loaded from: classes.dex */
public final class p12 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ sz1 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p12(int i, r41 r41Var, sz1 sz1Var) {
        super(2, r41Var);
        this.X = i;
        this.d0 = sz1Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((p12) q((r41) obj2, (hb5) obj)).s(jg7Var);
            default:
                return ((p12) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        sz1 sz1Var = this.d0;
        switch (i) {
            case 0:
                p12 p12Var = new p12(0, r41Var, sz1Var);
                p12Var.Z = obj;
                return p12Var;
            default:
                p12 p12Var2 = new p12(1, r41Var, sz1Var);
                p12Var2.Z = obj;
                return p12Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
        if (((java.lang.Boolean) r9).booleanValue() != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0038 -> B:15:0x003c). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int i = this.X;
        sz1 sz1Var = this.d0;
        boolean z = true;
        switch (i) {
            case 0:
                hb5 hb5Var = (hb5) this.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (nb3.k(sz1.W0(sz1Var.N), hb5Var)) {
                        this.Z = null;
                        this.Y = 1;
                        obj = sz1Var.W(sz1Var.N, this);
                        if (obj == x61Var) {
                            return x61Var;
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                break;
            default:
                w61 w61Var = (w61) this.Z;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        tp6 tp6Var = sz1Var.H0;
                        sz1Var.v.getClass();
                        Integer num = new Integer(u24.E(MelonEmulator.a.getFPS()));
                        tp6Var.getClass();
                        tp6Var.m(null, num);
                        if (g04.H(w61Var)) {
                            jd1 jd1Var = oq1.B;
                            long L = n16.L(1, uq1.SECONDS);
                            this.Z = w61Var;
                            this.Y = 1;
                            if (q60.u(L, this) == x61Var2) {
                                return x61Var2;
                            }
                            tp6 tp6Var2 = sz1Var.H0;
                            sz1Var.v.getClass();
                            Integer num2 = new Integer(u24.E(MelonEmulator.a.getFPS()));
                            tp6Var2.getClass();
                            tp6Var2.m(null, num2);
                            if (g04.H(w61Var)) {
                                return jg7.a;
                            }
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (g04.H(w61Var)) {
                    }
                }
        }
    }
}
