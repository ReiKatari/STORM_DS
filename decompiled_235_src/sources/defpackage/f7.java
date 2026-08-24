package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f7  reason: default package */
/* loaded from: classes.dex */
public final class f7 implements ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ qa4 B;
    public final /* synthetic */ rs4 L;

    public /* synthetic */ f7(qa4 qa4Var, rs4 rs4Var, int i) {
        this.A = i;
        this.B = qa4Var;
        this.L = rs4Var;
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        switch (this.A) {
            case 0:
                return b((zz4) obj, r41Var);
            default:
                this.B.setValue(Boolean.TRUE);
                this.L.i(((b00) obj).c);
                return jg7.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (defpackage.kj2.l(-1.0f, androidx.recyclerview.widget.RecyclerView.B1, r3, r4, r5, 4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (defpackage.q60.t(5500, r5) != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
        if (defpackage.kj2.l(androidx.recyclerview.widget.RecyclerView.B1, -1.0f, r3, r4, r5, 4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(zz4 zz4Var, r41 r41Var) {
        e7 e7Var;
        int i;
        if (r41Var instanceof e7) {
            e7Var = (e7) r41Var;
            int i2 = e7Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e7Var.Y = i2 - Integer.MIN_VALUE;
                e7 e7Var2 = e7Var;
                Object obj = e7Var2.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = e7Var2.Y;
                final rs4 rs4Var = this.L;
                qa4 qa4Var = this.B;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                oi2.Y(obj);
                                qa4Var.setValue(null);
                                return jg7.a;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        sc7 Y = ge7.Y(0, 0, ir1.c, 3);
                        eo2 eo2Var = new eo2() { // from class: d7
                            @Override // defpackage.eo2
                            public final Object o(Object obj2, Object obj3) {
                                int i3 = r2;
                                jg7 jg7Var = jg7.a;
                                rs4 rs4Var2 = rs4Var;
                                float floatValue = ((Float) obj2).floatValue();
                                ((Float) obj3).floatValue();
                                switch (i3) {
                                    case 0:
                                        rs4Var2.i(floatValue);
                                        return jg7Var;
                                    default:
                                        rs4Var2.i(floatValue);
                                        return jg7Var;
                                }
                            }
                        };
                        e7Var2.Y = 3;
                    } else {
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj);
                    qa4Var.setValue(zz4Var);
                    sc7 Y2 = ge7.Y(0, 0, ir1.c, 3);
                    eo2 eo2Var2 = new eo2() { // from class: d7
                        @Override // defpackage.eo2
                        public final Object o(Object obj2, Object obj3) {
                            int i3 = r2;
                            jg7 jg7Var = jg7.a;
                            rs4 rs4Var2 = rs4Var;
                            float floatValue = ((Float) obj2).floatValue();
                            ((Float) obj3).floatValue();
                            switch (i3) {
                                case 0:
                                    rs4Var2.i(floatValue);
                                    return jg7Var;
                                default:
                                    rs4Var2.i(floatValue);
                                    return jg7Var;
                            }
                        }
                    };
                    e7Var2.Y = 1;
                }
                e7Var2.Y = 2;
            }
        }
        e7Var = new e7(this, r41Var);
        e7 e7Var22 = e7Var;
        Object obj2 = e7Var22.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = e7Var22.Y;
        final rs4 rs4Var2 = this.L;
        qa4 qa4Var2 = this.B;
        if (i == 0) {
        }
        e7Var22.Y = 2;
    }
}
