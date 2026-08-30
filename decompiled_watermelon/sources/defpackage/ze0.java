package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ze0  reason: default package */
/* loaded from: classes.dex */
public final class ze0 implements nf5 {
    public final /* synthetic */ int b;
    public final nf5 c;

    public ze0(int i, long j) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = new ot6(j, new ye0(j));
                return;
            default:
                this.c = new ze0(1, j);
                return;
        }
    }

    @Override // defpackage.nf5
    public final mf5 a(wt wtVar) {
        int i = this.b;
        nf5 nf5Var = this.c;
        switch (i) {
            case 0:
                if (!((ot6) ((ze0) nf5Var).c).a(wtVar).b) {
                    Throwable th = (Throwable) wtVar.c;
                    if (th instanceof sg0) {
                        ve2.w("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                        if (((sg0) th).A > 0) {
                            return mf5.f;
                        }
                    }
                    return mf5.d;
                }
                return mf5.e;
            default:
                return ((ot6) nf5Var).a(wtVar);
        }
    }

    @Override // defpackage.nf5
    public final long b() {
        switch (this.b) {
            case 0:
                return ((ot6) ((ze0) this.c).c).b;
            default:
                return ((ot6) this.c).b;
        }
    }
}
