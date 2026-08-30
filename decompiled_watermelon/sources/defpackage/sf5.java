package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sf5  reason: default package */
/* loaded from: classes.dex */
public final class sf5 implements or5 {
    public final x45 a;

    public sf5(x45 x45Var) {
        x45Var.getClass();
        this.a = x45Var;
    }

    @Override // defpackage.or5
    public final or5 a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.or5
    public final nr5 c() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.or5, defpackage.d22
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.or5
    public final x45 d() {
        return this.a;
    }

    @Override // defpackage.or5
    public final boolean e() {
        return true;
    }

    @Override // defpackage.or5
    public final nr5 g() {
        throw new IllegalStateException("already connected");
    }
}
