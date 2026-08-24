package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sr5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sr5 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ss5 B;
    public final /* synthetic */ int L;
    public final /* synthetic */ ss4 R;

    public /* synthetic */ sr5(ss5 ss5Var, int i, ss4 ss4Var, int i2) {
        this.A = i2;
        this.B = ss5Var;
        this.L = i;
        this.R = ss4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r5.h() >= r6) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        return java.lang.Boolean.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r5.h() == (r8.a.size() - 1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
        if (r5.h() >= r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r5.h() == (r8.a.size() - 1)) goto L9;
     */
    @Override // defpackage.on2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c() {
        int i = this.A;
        boolean z = true;
        ss4 ss4Var = this.R;
        int i2 = this.L;
        ss5 ss5Var = this.B;
        switch (i) {
            case 0:
                if (!ss5Var.a.isEmpty() && ss4Var.h() >= 0) {
                    int i3 = ps5.a[ss5Var.f.ordinal()];
                    if (i3 == 1) {
                        break;
                    } else if (i3 != 2) {
                        i.d();
                        return null;
                    } else {
                        break;
                    }
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                int i4 = ks5.a[ss5Var.f.ordinal()];
                if (i4 == 1) {
                    break;
                } else if (i4 != 2) {
                    i.d();
                    return null;
                } else {
                    break;
                }
        }
    }
}
