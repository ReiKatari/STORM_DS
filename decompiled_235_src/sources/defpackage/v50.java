package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v50  reason: default package */
/* loaded from: classes.dex */
public final class v50 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ gn d0;
    public final /* synthetic */ on2 e0;
    public final /* synthetic */ qa4 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v50(boolean z, gn gnVar, on2 on2Var, qa4 qa4Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = z;
        this.d0 = gnVar;
        this.e0 = on2Var;
        this.f0 = qa4Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((v50) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((v50) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new v50(this.Z, this.d0, this.e0, this.f0, r41Var, 0);
            default:
                return new v50(this.Z, this.d0, this.e0, this.f0, r41Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (defpackage.q60.t(90, r13) == r12) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
        if (defpackage.gn.c(r13.d0, r0, r2, null, r13, 12) == r12) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        return r12;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        on2 on2Var = this.e0;
        qa4 qa4Var = this.f0;
        boolean z = this.Z;
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
                    if (z && ((Boolean) qa4Var.getValue()).booleanValue()) {
                        Float f = new Float(1.0f);
                        sc7 Y = ge7.Y(380, 0, ir1.a, 2);
                        this.Y = 1;
                        if (gn.c(this.d0, f, Y, null, this, 12) == x61Var) {
                            return x61Var;
                        }
                    } else {
                        return jg7Var;
                    }
                }
                on2Var.c();
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            oi2.Y(obj);
                            on2Var.c();
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    if (z && ((Boolean) qa4Var.getValue()).booleanValue()) {
                        this.Y = 1;
                        break;
                    } else {
                        return jg7Var;
                    }
                }
                Float f2 = new Float(1.0f);
                sc7 Y2 = ge7.Y(420, 0, ir1.a, 2);
                this.Y = 2;
                break;
        }
    }
}
