package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ie2  reason: default package */
/* loaded from: classes.dex */
public final class ie2 {
    public final gn a = new gn(new om1(6.0f), nw7.g0, null, 12);
    public t93 b;
    public t93 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, jg7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(t93 t93Var, s41 s41Var) {
        ge2 ge2Var;
        int i;
        float f;
        gn gnVar = this.a;
        try {
            if (s41Var instanceof ge2) {
                ge2Var = (ge2) s41Var;
                int i2 = ge2Var.Z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ge2Var.Z = i2 - Integer.MIN_VALUE;
                    Object obj = ge2Var.X;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = ge2Var.Z;
                    if (i == 0) {
                        if (i == 1) {
                            t93Var = ge2Var.R;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        if (t93Var instanceof l25) {
                            f = 12.0f;
                        } else if ((t93Var instanceof oy2) || (t93Var instanceof sg2)) {
                            f = 8.0f;
                        } else {
                            f = 6.0f;
                        }
                        this.c = t93Var;
                        if (!om1.b(((om1) gnVar.e.getValue()).A, f)) {
                            t93 t93Var2 = this.b;
                            ge2Var.R = t93Var;
                            ge2Var.Z = 1;
                            if (ms1.a(gnVar, f, t93Var2, t93Var, ge2Var) == x61Var) {
                                return x61Var;
                            }
                        }
                    }
                    this.b = t93Var;
                    this = jg7.a;
                    return this;
                }
            }
            if (i == 0) {
            }
            this.b = t93Var;
            this = jg7.a;
            return this;
        } catch (Throwable th) {
            this.b = t93Var;
            throw th;
        }
        ge2Var = new ge2(this, s41Var);
        Object obj2 = ge2Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ge2Var.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(s41 s41Var) {
        he2 he2Var;
        int i;
        float f;
        try {
            if (s41Var instanceof he2) {
                he2Var = (he2) s41Var;
                int i2 = he2Var.Y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    he2Var.Y = i2 - Integer.MIN_VALUE;
                    Object obj = he2Var.R;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = he2Var.Y;
                    if (i == 0) {
                        if (i == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        t93 t93Var = this.c;
                        if (t93Var instanceof l25) {
                            f = 12.0f;
                        } else if ((t93Var instanceof oy2) || (t93Var instanceof sg2)) {
                            f = 8.0f;
                        } else {
                            f = 6.0f;
                        }
                        gn gnVar = this.a;
                        if (!om1.b(((om1) gnVar.e.getValue()).A, f)) {
                            om1 om1Var = new om1(f);
                            he2Var.Y = 1;
                            if (gnVar.e(he2Var, om1Var) == x61Var) {
                                return x61Var;
                            }
                        }
                        return jg7.a;
                    }
                    return jg7.a;
                }
            }
            if (i == 0) {
            }
            return jg7.a;
        } finally {
            this.b = this.c;
        }
        he2Var = new he2(this, s41Var);
        Object obj2 = he2Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = he2Var.Y;
    }
}
