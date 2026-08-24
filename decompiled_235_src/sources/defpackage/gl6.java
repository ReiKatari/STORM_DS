package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gl6  reason: default package */
/* loaded from: classes.dex */
public final class gl6 {
    public final hb4 a = new hb4();
    public final vs4 b = np2.Y(null);

    public static /* synthetic */ Object b(gl6 gl6Var, String str, String str2, s41 s41Var, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return gl6Var.a(str, str2, al6.Short, s41Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r11 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
        if (r11 != r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Type inference failed for: r7v0, types: [gl6] */
    /* JADX WARN: Type inference failed for: r7v1, types: [fb4] */
    /* JADX WARN: Type inference failed for: r7v4, types: [fb4] */
    /* JADX WARN: Type inference failed for: r7v5, types: [fb4] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, al6 al6Var, s41 s41Var) {
        fl6 fl6Var;
        int i;
        hb4 hb4Var;
        try {
            if (s41Var instanceof fl6) {
                fl6Var = (fl6) s41Var;
                int i2 = fl6Var.f0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fl6Var.f0 = i2 - Integer.MIN_VALUE;
                    Object obj = fl6Var.d0;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = fl6Var.f0;
                    vs4 vs4Var = this.b;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                fb4 fb4Var = fl6Var.Z;
                                oi2.Y(obj);
                                this = fb4Var;
                                vs4Var.setValue(null);
                                return obj;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r7 = fl6Var.Z;
                        al6Var = fl6Var.Y;
                        str2 = fl6Var.X;
                        str = fl6Var.R;
                        oi2.Y(obj);
                        hb4Var = r7;
                    } else {
                        oi2.Y(obj);
                        fl6Var.R = str;
                        fl6Var.X = str2;
                        fl6Var.Y = al6Var;
                        hb4 hb4Var2 = this.a;
                        fl6Var.Z = hb4Var2;
                        fl6Var.f0 = 1;
                        Object e = hb4Var2.e(fl6Var);
                        hb4Var = hb4Var2;
                    }
                    fl6Var.R = str;
                    fl6Var.X = str2;
                    fl6Var.Y = al6Var;
                    fl6Var.Z = hb4Var;
                    fl6Var.f0 = 2;
                    rj0 rj0Var = new rj0(1, np2.V(fl6Var));
                    rj0Var.v();
                    vs4Var.setValue(new el6(str, str2, al6Var, rj0Var));
                    obj = rj0Var.s();
                    this = hb4Var;
                }
            }
            if (i == 0) {
            }
            fl6Var.R = str;
            fl6Var.X = str2;
            fl6Var.Y = al6Var;
            fl6Var.Z = hb4Var;
            fl6Var.f0 = 2;
            rj0 rj0Var2 = new rj0(1, np2.V(fl6Var));
            rj0Var2.v();
            vs4Var.setValue(new el6(str, str2, al6Var, rj0Var2));
            obj = rj0Var2.s();
            this = hb4Var;
        } finally {
            this.h(null);
        }
        fl6Var = new fl6(this, s41Var);
        Object obj2 = fl6Var.d0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = fl6Var.f0;
        vs4 vs4Var2 = this.b;
    }
}
