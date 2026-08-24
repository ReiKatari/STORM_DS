package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uk4  reason: default package */
/* loaded from: classes.dex */
public final class uk4 extends defpackage.yl5 {
    public final defpackage.n34 B;
    public final long L;

    public uk4(defpackage.n34 r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r0.L = r2
            return
    }

    @Override // defpackage.yl5
    public final long h() {
            r2 = this;
            long r0 = r2.L
            return r0
    }

    @Override // defpackage.yl5
    public final defpackage.n34 k() {
            r0 = this;
            n34 r0 = r0.B
            return r0
    }

    @Override // defpackage.yl5
    public final defpackage.z80 n() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot read raw response body of a converted body."
            r1.<init>(r0)
            throw r1
    }
}
