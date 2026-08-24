package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ih0  reason: default package */
/* loaded from: classes.dex */
public final class ih0 implements jp5 {
    public final /* synthetic */ int b;
    public final jp5 c;

    public ih0(int i, long j) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = new f67(j, new hh0(j));
                return;
            default:
                this.c = new ih0(1, j);
                return;
        }
    }

    @Override // defpackage.jp5
    public final long a() {
        switch (this.b) {
            case 0:
                return ((f67) ((ih0) this.c).c).b;
            default:
                return ((f67) this.c).b;
        }
    }

    @Override // defpackage.jp5
    public final ip5 b(ou ouVar) {
        int i = this.b;
        jp5 jp5Var = this.c;
        switch (i) {
            case 0:
                if (!((f67) ((ih0) jp5Var).c).b(ouVar).b) {
                    Throwable th = (Throwable) ouVar.c;
                    if (th instanceof bj0) {
                        kj2.v("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                        if (((bj0) th).A > 0) {
                            return ip5.f;
                        }
                    }
                    return ip5.d;
                }
                return ip5.e;
            default:
                return ((f67) jp5Var).b(ouVar);
        }
    }
}
