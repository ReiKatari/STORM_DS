package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l92  reason: default package */
/* loaded from: classes.dex */
public final class l92 implements defpackage.h26 {
    public final defpackage.g26 a;

    public l92(java.lang.Throwable r3) {
            r2 = this;
            r2.<init>()
            g26 r0 = new g26
            r1 = 2
            r0.<init>(r2, r3, r1)
            r2.a = r0
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
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected call"
            r1.<init>(r0)
            throw r1
    }

    @Override // defpackage.h26
    public final boolean c() {
            r0 = this;
            r0 = 0
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
            r0 = this;
            g26 r0 = r0.a
            return r0
    }

    @Override // defpackage.h26
    public final defpackage.g26 g() {
            r0 = this;
            g26 r0 = r0.a
            return r0
    }
}
