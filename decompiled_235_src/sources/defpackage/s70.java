package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s70  reason: default package */
/* loaded from: classes.dex */
public final class s70 {
    public final ua4 a = new ua4(new t70[16]);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(of5 of5Var, s41 s41Var) {
        r70 r70Var;
        int i;
        int i2;
        of5 of5Var2;
        int i3;
        Object[] objArr;
        if (s41Var instanceof r70) {
            r70Var = (r70) s41Var;
            int i4 = r70Var.f0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                r70Var.f0 = i4 - Integer.MIN_VALUE;
                Object obj = r70Var.d0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = r70Var.f0;
                if (i == 0) {
                    if (i == 1) {
                        i2 = r70Var.Z;
                        i3 = r70Var.Y;
                        objArr = r70Var.X;
                        of5 of5Var3 = r70Var.R;
                        oi2.Y(obj);
                        of5Var2 = of5Var3;
                        i3++;
                        if (i3 < i2) {
                            a5 a5Var = new a5(of5Var2, 9);
                            r70Var.R = of5Var2;
                            r70Var.X = objArr;
                            r70Var.Y = i3;
                            r70Var.Z = i2;
                            r70Var.f0 = 1;
                            if (l.j((t70) objArr[i3], a5Var, r70Var) == x61Var) {
                                return x61Var;
                            }
                            i3++;
                            if (i3 < i2) {
                                return jg7.a;
                            }
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ua4 ua4Var = this.a;
                    Object[] objArr2 = ua4Var.A;
                    i2 = ua4Var.L;
                    of5Var2 = of5Var;
                    i3 = 0;
                    objArr = objArr2;
                    if (i3 < i2) {
                    }
                }
            }
        }
        r70Var = new r70(this, s41Var);
        Object obj2 = r70Var.d0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = r70Var.f0;
        if (i == 0) {
        }
    }
}
