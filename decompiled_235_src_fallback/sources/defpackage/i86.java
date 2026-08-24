package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i86  reason: default package */
/* loaded from: classes.dex */
public final class i86 implements defpackage.p76 {
    public final /* synthetic */ defpackage.m86 a;
    public final /* synthetic */ defpackage.k86 b;

    public i86(defpackage.m86 r1, defpackage.k86 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.p76
    public final float a(float r5) {
            r4 = this;
            float r0 = java.lang.Math.abs(r5)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            m86 r1 = r4.a
            if (r0 != 0) goto Lc
            goto L1a
        Lc:
            a86 r0 = r1.h
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L32
        L1a:
            long r2 = r1.h(r5)
            long r2 = r1.e(r2)
            r5 = 2
            k86 r4 = r4.b
            long r4 = r4.a(r5, r2)
            float r4 = r1.g(r4)
            float r4 = r1.d(r4)
            return r4
        L32:
            vd2 r4 = new vd2
            java.lang.String r5 = "The fling animation was cancelled"
            r0 = 0
            r4.<init>(r5, r0)
            throw r4
    }
}
