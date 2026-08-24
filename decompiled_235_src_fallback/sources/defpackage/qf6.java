package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qf6  reason: default package */
/* loaded from: classes.dex */
public final class qf6 extends defpackage.u1 {
    public long a;
    public defpackage.rj0 b;

    @Override // defpackage.u1
    public final boolean a(defpackage.t1 r5) {
            r4 = this;
            of6 r5 = (defpackage.of6) r5
            long r0 = r4.a
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto Lc
            r4 = 0
            return r4
        Lc:
            long r0 = r5.e0
            long r2 = r5.f0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L16
            r5.f0 = r0
        L16:
            r4.a = r0
            r4 = 1
            return r4
    }

    @Override // defpackage.u1
    public final defpackage.r41[] b(defpackage.t1 r5) {
            r4 = this;
            of6 r5 = (defpackage.of6) r5
            long r0 = r4.a
            r2 = -1
            r4.a = r2
            r2 = 0
            r4.b = r2
            r41[] r4 = r5.w(r0)
            return r4
    }
}
