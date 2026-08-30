package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s42  reason: default package */
/* loaded from: classes.dex */
public final class s42 implements or5 {
    public final nr5 a;

    public s42(Throwable th) {
        this.a = new nr5(this, th, 2);
    }

    @Override // defpackage.or5
    public final or5 a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.or5
    public final nr5 c() {
        return this.a;
    }

    @Override // defpackage.or5, defpackage.d22
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.or5
    public final x45 d() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // defpackage.or5
    public final boolean e() {
        return false;
    }

    @Override // defpackage.or5
    public final nr5 g() {
        return this.a;
    }
}
