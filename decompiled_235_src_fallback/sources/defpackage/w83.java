package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w83  reason: default package */
/* loaded from: classes.dex */
public final class w83 implements defpackage.x83 {
    public long A;
    public int B;

    @Override // defpackage.x83
    public defpackage.s83 toInstant() {
            r4 = this;
            long r0 = r4.A
            s83 r2 = defpackage.s83.L
            long r2 = r2.A
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L19
            s83 r2 = defpackage.s83.R
            long r2 = r2.A
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L19
            int r4 = r4.B
            s83 r4 = defpackage.bl2.A(r4, r0)
            return r4
        L19:
            t83 r4 = new t83
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "The parsed date is outside the range representable by Instant (Unix epoch second "
            r2.<init>(r3)
            r2.append(r0)
            r0 = 41
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.<init>(r0)
            throw r4
    }
}
