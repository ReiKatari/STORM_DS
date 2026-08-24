package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ly7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ly7 implements eo2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ dh5 B;
    public final /* synthetic */ fe5 L;
    public final /* synthetic */ dh5 R;
    public final /* synthetic */ dh5 X;

    public /* synthetic */ ly7(fe5 fe5Var, dh5 dh5Var, dh5 dh5Var2, dh5 dh5Var3) {
        this.L = fe5Var;
        this.B = dh5Var;
        this.R = dh5Var2;
        this.X = dh5Var3;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        dh5 dh5Var = this.X;
        dh5 dh5Var2 = this.R;
        fe5 fe5Var = this.L;
        dh5 dh5Var3 = this.B;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue == 21589) {
                    long j = 1;
                    if (longValue >= 1) {
                        byte readByte = fe5Var.readByte();
                        boolean z3 = false;
                        if ((readByte & 1) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((readByte & 2) == 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if ((readByte & 4) == 4) {
                            z3 = true;
                        }
                        if (z) {
                            j = 5;
                        }
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (longValue >= j) {
                            if (z) {
                                dh5Var3.A = Integer.valueOf(fe5Var.n());
                            }
                            if (z2) {
                                dh5Var2.A = Integer.valueOf(fe5Var.n());
                            }
                            if (z3) {
                                dh5Var.A = Integer.valueOf(fe5Var.n());
                                return jg7Var;
                            }
                            return jg7Var;
                        }
                        e41.i("bad zip: extended timestamp extra too short");
                    } else {
                        e41.i("bad zip: extended timestamp extra too short");
                    }
                    return null;
                }
                return jg7Var;
            default:
                int intValue2 = ((Integer) obj).intValue();
                long longValue2 = ((Long) obj2).longValue();
                if (intValue2 == 1) {
                    if (dh5Var3.A == null) {
                        if (longValue2 == 24) {
                            dh5Var3.A = Long.valueOf(fe5Var.r());
                            dh5Var2.A = Long.valueOf(fe5Var.r());
                            dh5Var.A = Long.valueOf(fe5Var.r());
                            return jg7Var;
                        }
                        e41.i("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    } else {
                        e41.i("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    return null;
                }
                return jg7Var;
        }
    }

    public /* synthetic */ ly7(dh5 dh5Var, fe5 fe5Var, dh5 dh5Var2, dh5 dh5Var3) {
        this.B = dh5Var;
        this.L = fe5Var;
        this.R = dh5Var2;
        this.X = dh5Var3;
    }
}
