package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f67  reason: default package */
/* loaded from: classes.dex */
public final class f67 implements defpackage.jp5 {
    public final long b;
    public final defpackage.jp5 c;

    public f67(long r3, defpackage.jp5 r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.String r1 = "Timeout must be non-negative."
            defpackage.np2.s(r1, r0)
            r2.b = r3
            r2.c = r5
            return
    }

    @Override // defpackage.jp5
    public final long a() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    @Override // defpackage.jp5
    public final defpackage.ip5 b(defpackage.ou r6) {
            r5 = this;
            jp5 r0 = r5.c
            ip5 r0 = r0.b(r6)
            r1 = 0
            long r3 = r5.b
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L1a
            long r5 = r6.b
            long r1 = r0.a
            long r3 = r3 - r1
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L1a
            ip5 r5 = defpackage.ip5.d
            return r5
        L1a:
            return r0
    }
}
