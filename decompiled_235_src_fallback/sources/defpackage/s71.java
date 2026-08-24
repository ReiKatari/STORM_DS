package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s71  reason: default package */
/* loaded from: classes.dex */
public final class s71 implements defpackage.x97 {
    public final int b;

    public s71(int r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            if (r1 <= 0) goto L8
            return
        L8:
            java.lang.String r0 = "durationMillis must be > 0."
            defpackage.i.h(r0)
            r0 = 0
            throw r0
    }

    @Override // defpackage.x97
    public final defpackage.fa7 a(defpackage.mw r3, defpackage.a33 r4) {
            r2 = this;
            boolean r0 = r4 instanceof defpackage.bu6
            if (r0 != 0) goto La
            qg4 r2 = new qg4
            r2.<init>(r3, r4)
            return r2
        La:
            r0 = r4
            bu6 r0 = (defpackage.bu6) r0
            zb1 r0 = r0.c
            zb1 r1 = defpackage.zb1.MEMORY_CACHE
            if (r0 != r1) goto L19
            qg4 r2 = new qg4
            r2.<init>(r3, r4)
            return r2
        L19:
            t71 r0 = new t71
            int r2 = r2.b
            r0.<init>(r3, r4, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof defpackage.s71
            if (r1 == 0) goto L11
            s71 r3 = (defpackage.s71) r3
            int r3 = r3.b
            int r2 = r2.b
            if (r2 != r3) goto L11
            return r0
        L11:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r1 = r1.b
            int r1 = r1 * 31
            r0 = 0
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }
}
