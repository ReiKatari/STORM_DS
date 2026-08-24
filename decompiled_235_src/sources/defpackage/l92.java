package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l92  reason: default package */
/* loaded from: classes.dex */
public final class l92 implements h26 {
    public final g26 a;

    public l92(Throwable th) {
        this.a = new g26(this, th, 2);
    }

    @Override // defpackage.h26
    public final h26 a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.h26
    public final ke5 b() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // defpackage.h26
    public final boolean c() {
        return false;
    }

    @Override // defpackage.h26, defpackage.u62
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.h26
    public final g26 d() {
        return this.a;
    }

    @Override // defpackage.h26
    public final g26 g() {
        return this.a;
    }
}
