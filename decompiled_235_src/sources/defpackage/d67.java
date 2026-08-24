package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d67  reason: default package */
/* loaded from: classes.dex */
public final class d67 extends o66 implements Runnable {
    public final long Z;

    public d67(long j, s41 s41Var) {
        super(s41Var, s41Var.b());
        this.Z = j;
    }

    @Override // defpackage.ed3
    public final String f0() {
        return super.f0() + "(timeMillis=" + this.Z + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        q60.D(this.X);
        s(new c67("Timed out waiting for " + this.Z + " ms", this));
    }
}
