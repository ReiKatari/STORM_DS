package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pb0  reason: default package */
/* loaded from: classes.dex */
public final class pb0 extends wl0 {
    public final eo2 R;
    public final eo2 X;

    public pb0(eo2 eo2Var, l61 l61Var, int i, m80 m80Var) {
        super(l61Var, i, m80Var);
        this.R = eo2Var;
        this.X = eo2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    @Override // defpackage.wl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(r35 r35Var, r41 r41Var) {
        ob0 ob0Var;
        int i;
        if (r41Var instanceof ob0) {
            ob0Var = (ob0) r41Var;
            int i2 = ob0Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ob0Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = ob0Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ob0Var.Z;
                jg7 jg7Var = jg7.a;
                if (i == 0) {
                    if (i == 1) {
                        r35Var = ob0Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ob0Var.R = r35Var;
                    ob0Var.Z = 1;
                    Object o = this.R.o(r35Var, ob0Var);
                    if (o != x61Var) {
                        o = jg7Var;
                    }
                    if (o == x61Var) {
                        return x61Var;
                    }
                }
                if (!r35Var.Y.G()) {
                    return jg7Var;
                }
                i.m("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                return null;
            }
        }
        ob0Var = new ob0(this, (s41) r41Var);
        Object obj2 = ob0Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ob0Var.Z;
        jg7 jg7Var2 = jg7.a;
        if (i == 0) {
        }
        if (!r35Var.Y.G()) {
        }
    }

    @Override // defpackage.wl0
    public final wl0 f(l61 l61Var, int i, m80 m80Var) {
        return new pb0(this.X, l61Var, i, m80Var);
    }

    @Override // defpackage.wl0
    public final String toString() {
        return "block[" + this.R + "] -> " + super.toString();
    }
}
