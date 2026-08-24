package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vr5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vr5 implements on2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ int B;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ vr5(ls0 ls0Var, int i, int i2, ci ciVar, go3 go3Var) {
        this.R = ls0Var;
        this.B = i;
        this.L = i2;
        this.X = ciVar;
        this.Y = go3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
        if (r1 < 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
        if (r1 < 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cf, code lost:
        return java.lang.Integer.valueOf(r3);
     */
    @Override // defpackage.on2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c() {
        int g;
        int i;
        boolean z;
        int i2 = this.A;
        int i3 = 0;
        Object obj = this.Y;
        Object obj2 = this.X;
        int i4 = this.L;
        int i5 = this.B;
        Object obj3 = this.R;
        switch (i2) {
            case 0:
                ss5 ss5Var = (ss5) obj3;
                ip3 ip3Var = (ip3) obj2;
                pr3 pr3Var = (pr3) obj;
                n06 n06Var = ss5Var.f;
                int[] iArr = ps5.a;
                int i6 = iArr[n06Var.ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        g = pr3Var.h();
                    } else {
                        i.d();
                        return null;
                    }
                } else {
                    g = ip3Var.g();
                }
                int i7 = iArr[ss5Var.f.ordinal()];
                if (i7 != 1) {
                    if (i7 == 2) {
                        i = g - i5;
                        break;
                    } else {
                        i.d();
                        return null;
                    }
                } else {
                    i = (g - i5) + i4;
                    break;
                }
            default:
                ls0 ls0Var = (ls0) obj3;
                a47 a47Var = (a47) ls0Var.e;
                ci ciVar = (ci) obj2;
                int intValue = ((Number) ((go3) obj).getValue()).intValue();
                boolean z2 = ciVar.B;
                if (ciVar.m() == m71.CROSSED) {
                    z = true;
                } else {
                    z = false;
                }
                long j = a47Var.j(i5);
                v84 v84Var = a47Var.b;
                int i8 = k47.c;
                int i9 = (int) (j >> 32);
                int d = v84Var.d(i9);
                int i10 = v84Var.f;
                if (d != intValue) {
                    if (intValue >= i10) {
                        i9 = a47Var.g(i10 - 1);
                    } else {
                        i9 = a47Var.g(intValue);
                    }
                }
                int i11 = (int) (j & 4294967295L);
                if (v84Var.d(i11) != intValue) {
                    if (intValue >= i10) {
                        i11 = v84Var.c(i10 - 1, false);
                    } else {
                        i11 = v84Var.c(intValue, false);
                    }
                }
                if (i9 == i4) {
                    return ls0Var.b(i11);
                }
                if (i11 == i4) {
                    return ls0Var.b(i9);
                }
                if (!(z2 ^ z) ? i5 >= i9 : i5 > i11) {
                    i9 = i11;
                }
                return ls0Var.b(i9);
        }
    }

    public /* synthetic */ vr5(ss5 ss5Var, ip3 ip3Var, pr3 pr3Var, int i, int i2) {
        this.R = ss5Var;
        this.X = ip3Var;
        this.Y = pr3Var;
        this.B = i;
        this.L = i2;
    }
}
