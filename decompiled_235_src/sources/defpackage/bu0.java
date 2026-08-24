package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bu0  reason: default package */
/* loaded from: classes.dex */
public final class bu0 implements ne2 {
    public final /* synthetic */ v80 A;
    public final /* synthetic */ int B;

    public bu0(v80 v80Var, int i) {
        this.A = v80Var;
        this.B = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r5.A.a(r0, r7) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (defpackage.ps7.b(r0) != r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    @Override // defpackage.ne2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, r41 r41Var) {
        au0 au0Var;
        int i;
        if (r41Var instanceof au0) {
            au0Var = (au0) r41Var;
            int i2 = au0Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                au0Var.Y = i2 - Integer.MIN_VALUE;
                Object obj2 = au0Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = au0Var.Y;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj2);
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj2);
                } else {
                    oi2.Y(obj2);
                    j43 j43Var = new j43(this.B, obj);
                    au0Var.Y = 1;
                }
                au0Var.Y = 2;
            }
        }
        au0Var = new au0(this, r41Var);
        Object obj22 = au0Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = au0Var.Y;
        if (i == 0) {
        }
        au0Var.Y = 2;
    }
}
