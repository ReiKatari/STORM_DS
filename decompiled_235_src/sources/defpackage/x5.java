package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x5  reason: default package */
/* loaded from: classes.dex */
public final class x5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ qa4 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5(qa4 qa4Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = qa4Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((x5) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((x5) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((x5) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new x5(this.Z, r41Var, 0);
            case 1:
                return new x5(this.Z, r41Var, 1);
            default:
                return new x5(this.Z, r41Var, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
        if (defpackage.q60.t(500, r10) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (defpackage.q60.t(2000, r10) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        return r0;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        qa4 qa4Var = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            oi2.Y(obj);
                            qa4Var.setValue(h05.SHOW_DESCRIPTION);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    break;
                }
                qa4Var.setValue(h05.SHOW_TITLE);
                this.Y = 2;
                break;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    if (q60.t(650L, this) == x61Var2) {
                        return x61Var2;
                    }
                }
                qa4Var.setValue(Boolean.TRUE);
                return jg7Var;
            default:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    if (q60.t(500L, this) == x61Var3) {
                        return x61Var3;
                    }
                }
                qa4Var.setValue(j14.SHOW_FULL);
                return jg7Var;
        }
    }
}
