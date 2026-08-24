package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pp5  reason: default package */
/* loaded from: classes.dex */
public final class pp5 implements defpackage.h26 {
    public final defpackage.ke5 a;

    public pp5(defpackage.ke5 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.h26
    public final defpackage.h26 a() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected retry"
            r1.<init>(r0)
            throw r1
    }

    @Override // defpackage.h26
    public final defpackage.ke5 b() {
            r0 = this;
            ke5 r0 = r0.a
            return r0
    }

    @Override // defpackage.h26
    public final boolean c() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.h26, defpackage.u62
    public final void cancel() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected cancel"
            r1.<init>(r0)
            throw r1
    }

    @Override // defpackage.h26
    public final defpackage.g26 d() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "already connected"
            r1.<init>(r0)
            throw r1
    }

    @Override // defpackage.h26
    public final defpackage.g26 g() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "already connected"
            r1.<init>(r0)
            throw r1
    }
}
