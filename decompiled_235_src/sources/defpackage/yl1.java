package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yl1  reason: default package */
/* loaded from: classes.dex */
public final class yl1 extends u {
    public final /* synthetic */ int a;
    public final a50 b;

    /* JADX WARN: Type inference failed for: r2v1, types: [a21, a50] */
    public yl1(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new a21();
                return;
            default:
                this.b = new zy2(1);
                return;
        }
    }

    @Override // defpackage.u
    public void a(CharSequence charSequence) {
        int i = this.a;
    }

    @Override // defpackage.u
    public boolean b(a50 a50Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(a50Var);
        }
    }

    @Override // defpackage.u
    public final a50 d() {
        int i = this.a;
        a50 a50Var = this.b;
        switch (i) {
            case 0:
                return (zy2) a50Var;
            default:
                return (d57) a50Var;
        }
    }

    @Override // defpackage.u
    public boolean e() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.e();
        }
    }

    @Override // defpackage.u
    public final b50 g(am1 am1Var) {
        switch (this.a) {
            case 0:
                return b50.a(am1Var.b);
            default:
                return null;
        }
    }

    private final void h(CharSequence charSequence) {
    }
}
