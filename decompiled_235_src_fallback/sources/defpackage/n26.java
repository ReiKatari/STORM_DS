package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n26  reason: default package */
/* loaded from: classes.dex */
public final class n26 implements defpackage.m26 {
    public static final defpackage.n26 a = null;

    static {
            n26 r0 = new n26
            r0.<init>()
            defpackage.n26.a = r0
            return
    }

    @Override // defpackage.m26
    public final defpackage.a74 b(defpackage.a74 r5, float r6, boolean r7) {
            r4 = this;
            double r0 = (double) r6
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L8
            goto Ld
        L8:
            java.lang.String r4 = "invalid weight; must be greater than zero"
            defpackage.n53.a(r4)
        Ld:
            vn3 r4 = new vn3
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 <= 0) goto L17
            r6 = r0
        L17:
            r4.<init>(r6, r7)
            a74 r4 = r5.d(r4)
            return r4
    }
}
