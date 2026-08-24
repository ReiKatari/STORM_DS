package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nv6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nv6 implements Runnable {
    public final /* synthetic */ qv6 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int L;

    public /* synthetic */ nv6(qv6 qv6Var, int i, int i2) {
        this.A = qv6Var;
        this.B = i;
        this.L = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        qv6 qv6Var = this.A;
        int i = qv6Var.i;
        int i2 = this.B;
        boolean z2 = true;
        if (i != i2) {
            qv6Var.i = i2;
            z = true;
        } else {
            z = false;
        }
        int i3 = qv6Var.h;
        int i4 = this.L;
        if (i3 != i4) {
            qv6Var.h = i4;
        } else {
            z2 = z;
        }
        if (z2) {
            qv6Var.e();
        }
    }
}
