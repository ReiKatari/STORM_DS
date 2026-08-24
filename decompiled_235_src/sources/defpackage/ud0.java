package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ud0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ud0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ be0 B;
    public final /* synthetic */ yk5 L;

    public /* synthetic */ ud0(be0 be0Var, ae0 ae0Var, yk5 yk5Var, int i) {
        this.A = i;
        this.B = be0Var;
        this.L = yk5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.e(ae0.b(this.L));
                return;
            default:
                this.B.a(ae0.b(this.L));
                return;
        }
    }
}
