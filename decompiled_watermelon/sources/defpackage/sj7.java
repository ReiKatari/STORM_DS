package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sj7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sj7 implements aj2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ n75 B;
    public final /* synthetic */ s45 L;
    public final /* synthetic */ n75 R;
    public final /* synthetic */ n75 X;

    public /* synthetic */ sj7(s45 s45Var, n75 n75Var, n75 n75Var2, n75 n75Var3) {
        this.L = s45Var;
        this.B = n75Var;
        this.R = n75Var2;
        this.X = n75Var3;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        o27 o27Var = o27.a;
        n75 n75Var = this.X;
        n75 n75Var2 = this.R;
        s45 s45Var = this.L;
        n75 n75Var3 = this.B;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue == 21589) {
                    long j = 1;
                    if (longValue >= 1) {
                        byte readByte = s45Var.readByte();
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
                                n75Var3.A = Integer.valueOf(s45Var.w());
                            }
                            if (z2) {
                                n75Var2.A = Integer.valueOf(s45Var.w());
                            }
                            if (z3) {
                                n75Var.A = Integer.valueOf(s45Var.w());
                                return o27Var;
                            }
                            return o27Var;
                        }
                        f81.j("bad zip: extended timestamp extra too short");
                    } else {
                        f81.j("bad zip: extended timestamp extra too short");
                    }
                    return null;
                }
                return o27Var;
            default:
                int intValue2 = ((Integer) obj).intValue();
                long longValue2 = ((Long) obj2).longValue();
                if (intValue2 == 1) {
                    if (n75Var3.A == null) {
                        if (longValue2 == 24) {
                            n75Var3.A = Long.valueOf(s45Var.x());
                            n75Var2.A = Long.valueOf(s45Var.x());
                            n75Var.A = Long.valueOf(s45Var.x());
                            return o27Var;
                        }
                        f81.j("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    } else {
                        f81.j("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    return null;
                }
                return o27Var;
        }
    }

    public /* synthetic */ sj7(n75 n75Var, s45 s45Var, n75 n75Var2, n75 n75Var3) {
        this.B = n75Var;
        this.L = s45Var;
        this.R = n75Var2;
        this.X = n75Var3;
    }
}
