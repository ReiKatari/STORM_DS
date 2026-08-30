package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tj6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tj6 implements Runnable {
    public final /* synthetic */ wj6 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int L;

    public /* synthetic */ tj6(wj6 wj6Var, int i, int i2) {
        this.A = wj6Var;
        this.B = i;
        this.L = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        wj6 wj6Var = this.A;
        int i = wj6Var.i;
        int i2 = this.B;
        boolean z2 = true;
        if (i != i2) {
            wj6Var.i = i2;
            z = true;
        } else {
            z = false;
        }
        int i3 = wj6Var.h;
        int i4 = this.L;
        if (i3 != i4) {
            wj6Var.h = i4;
        } else {
            z2 = z;
        }
        if (z2) {
            wj6Var.e();
        }
    }
}
