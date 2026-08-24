package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: af2  reason: default package */
/* loaded from: classes.dex */
public final class af2 implements le2 {
    public final /* synthetic */ le2 A;
    public final /* synthetic */ fo2 B;

    public af2(le2 le2Var, fo2 fo2Var) {
        this.A = le2Var;
        this.B = fo2Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:22|23))(2:24|25))(2:26|27))(2:38|39)|28|29|30|(3:32|15|16)|33))|46|6|7|(0)(0)|28|29|30|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r10.b(r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
        r10 = new defpackage.w57(r9);
        r9 = r9.B;
        r0.Z = r9;
        r0.d0 = null;
        r0.X = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
        if (defpackage.u24.e(r10, r9, r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    @Override // defpackage.le2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ne2 ne2Var, r41 r41Var) {
        ze2 ze2Var;
        x61 x61Var;
        int i;
        k36 k36Var;
        k36 k36Var2;
        fo2 fo2Var;
        try {
            if (r41Var instanceof ze2) {
                ze2Var = (ze2) r41Var;
                int i2 = ze2Var.X;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ze2Var.X = i2 - Integer.MIN_VALUE;
                    Object obj = ze2Var.R;
                    x61Var = x61.COROUTINE_SUSPENDED;
                    i = ze2Var.X;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    k36Var2 = (k36) ze2Var.Z;
                                    try {
                                        oi2.Y(obj);
                                        k36Var2.u();
                                        return jg7.a;
                                    } catch (Throwable th) {
                                        th = th;
                                        k36Var2.u();
                                        throw th;
                                    }
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th2 = (Throwable) ze2Var.Z;
                            oi2.Y(obj);
                            throw th2;
                        }
                        ne2Var = ze2Var.d0;
                        this = (af2) ze2Var.Z;
                        oi2.Y(obj);
                    } else {
                        oi2.Y(obj);
                        le2 le2Var = this.A;
                        ze2Var.Z = this;
                        ze2Var.d0 = ne2Var;
                        ze2Var.X = 1;
                    }
                    l61 l61Var = ze2Var.B;
                    l61Var.getClass();
                    k36Var = new k36(ne2Var, l61Var);
                    fo2Var = this.B;
                    ze2Var.Z = k36Var;
                    ze2Var.d0 = null;
                    ze2Var.X = 3;
                    if (fo2Var.e(k36Var, null, ze2Var) != x61Var) {
                        k36Var2 = k36Var;
                        k36Var2.u();
                        return jg7.a;
                    }
                    return x61Var;
                }
            }
            fo2Var = this.B;
            ze2Var.Z = k36Var;
            ze2Var.d0 = null;
            ze2Var.X = 3;
            if (fo2Var.e(k36Var, null, ze2Var) != x61Var) {
            }
            return x61Var;
        } catch (Throwable th3) {
            th = th3;
            k36Var2 = k36Var;
            k36Var2.u();
            throw th;
        }
        ze2Var = new ze2(this, r41Var);
        Object obj2 = ze2Var.R;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = ze2Var.X;
        if (i == 0) {
        }
        l61 l61Var2 = ze2Var.B;
        l61Var2.getClass();
        k36Var = new k36(ne2Var, l61Var2);
    }
}
