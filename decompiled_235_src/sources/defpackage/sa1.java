package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sa1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sa1 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ pr3 B;

    public /* synthetic */ sa1(pr3 pr3Var, int i) {
        this.A = i;
        this.B = pr3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        if ((r0.l + r0.m) <= r3) goto L18;
     */
    @Override // defpackage.on2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c() {
        boolean z;
        int i = this.A;
        pr3 pr3Var = this.B;
        switch (i) {
            case 0:
                jr3 j = pr3Var.j();
                List list = j.k;
                int i2 = j.n;
                if (i2 != 0) {
                    kr3 kr3Var = (kr3) gt0.H0(list);
                    kr3 kr3Var2 = (kr3) gt0.Q0(list);
                    int i3 = j.m + j.l;
                    z = true;
                    if (kr3Var.a == 0) {
                        if (kr3Var.l == 0) {
                            if (kr3Var2.a + 1 == i2) {
                                break;
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                return Integer.valueOf(pr3Var.j().n);
        }
    }
}
