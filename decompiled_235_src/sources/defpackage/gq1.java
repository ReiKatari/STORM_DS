package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gq1  reason: default package */
/* loaded from: classes.dex */
public final class gq1 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ gn Z;
    public final /* synthetic */ qa4 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gq1(gn gnVar, qa4 qa4Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = gnVar;
        this.d0 = qa4Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((gq1) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((gq1) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new gq1(this.Z, this.d0, r41Var, 0);
            default:
                return new gq1(this.Z, this.d0, r41Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (defpackage.q60.u(r0, r10) == r8) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (defpackage.q60.u(r0, r10) == r8) goto L16;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        qa4 qa4Var = this.d0;
        switch (i) {
            case 0:
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
                    Float f = new Float(1.0f);
                    sc7 Y = ge7.Y(820, 0, ir1.a, 2);
                    this.Y = 1;
                    if (gn.c(this.Z, f, Y, null, this, 12) == x61Var) {
                        return x61Var;
                    }
                }
                qa4Var.setValue(Boolean.TRUE);
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                oi2.Y(obj);
                                return jg7Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        qa4Var.setValue(Boolean.FALSE);
                        Float f2 = new Float(0.5f);
                        this.Y = 3;
                        if (gn.c(this.Z, f2, null, null, this, 14) != x61Var2) {
                            return jg7Var;
                        }
                        return x61Var2;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    jd1 jd1Var = oq1.B;
                    long L = n16.L(500, uq1.MILLISECONDS);
                    this.Y = 1;
                    break;
                }
                qa4Var.setValue(Boolean.TRUE);
                jd1 jd1Var2 = oq1.B;
                long L2 = n16.L(3, uq1.SECONDS);
                this.Y = 2;
                break;
        }
    }
}
