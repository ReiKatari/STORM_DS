package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pp5  reason: default package */
/* loaded from: classes.dex */
public final class pp5 implements h26 {
    public final ke5 a;

    public pp5(ke5 ke5Var) {
        ke5Var.getClass();
        this.a = ke5Var;
    }

    @Override // defpackage.h26
    public final h26 a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.h26
    public final ke5 b() {
        return this.a;
    }

    @Override // defpackage.h26
    public final boolean c() {
        return true;
    }

    @Override // defpackage.h26, defpackage.u62
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.h26
    public final g26 d() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.h26
    public final g26 g() {
        throw new IllegalStateException("already connected");
    }
}
