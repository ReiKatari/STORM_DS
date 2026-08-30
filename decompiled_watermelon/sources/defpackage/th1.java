package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: th1  reason: default package */
/* loaded from: classes.dex */
public final class th1 extends t {
    public final /* synthetic */ int a;
    public final c30 b;

    /* JADX WARN: Type inference failed for: r2v1, types: [c30, vy0] */
    public th1(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new vy0();
                return;
            default:
                this.b = new ys2(1);
                return;
        }
    }

    @Override // defpackage.t
    public void a(CharSequence charSequence) {
        int i = this.a;
    }

    @Override // defpackage.t
    public boolean b(c30 c30Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(c30Var);
        }
    }

    @Override // defpackage.t
    public final c30 d() {
        int i = this.a;
        c30 c30Var = this.b;
        switch (i) {
            case 0:
                return (ys2) c30Var;
            default:
                return (os6) c30Var;
        }
    }

    @Override // defpackage.t
    public boolean e() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.e();
        }
    }

    @Override // defpackage.t
    public final d30 g(vh1 vh1Var) {
        switch (this.a) {
            case 0:
                return d30.a(vh1Var.b);
            default:
                return null;
        }
    }

    private final void h(CharSequence charSequence) {
    }
}
