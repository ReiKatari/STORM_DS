package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s97  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s97 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.ga7 B;

    public /* synthetic */ s97(defpackage.ga7 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r4 = this;
            int r0 = r4.A
            ga7 r4 = r4.B
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            long r0 = r4.b()
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            return r4
        L10:
            vs4 r0 = r4.d
            java.lang.Object r0 = r0.getValue()
            gx0 r1 = r4.a
            java.lang.Object r1 = r1.f()
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L40
            ts4 r0 = r4.g
            long r0 = r0.h()
            r2 = -9223372036854775808
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2f
            goto L40
        L2f:
            vs4 r4 = r4.h
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L3e
            goto L40
        L3e:
            r4 = 0
            goto L41
        L40:
            r4 = 1
        L41:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
    }
}
