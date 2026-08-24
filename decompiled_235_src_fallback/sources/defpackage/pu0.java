package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pu0  reason: default package */
/* loaded from: classes.dex */
public final class pu0 implements defpackage.ds1 {
    public final defpackage.fp a;
    public final int b;

    public pu0(defpackage.fp r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public pu0(java.lang.String r2, int r3) {
            r1 = this;
            fp r0 = new fp
            r0.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    @Override // defpackage.ds1
    public final void a(defpackage.gs1 r6) {
            r5 = this;
            int r0 = r6.R
            fp r1 = r5.a
            r2 = -1
            if (r0 == r2) goto Lf
            int r3 = r6.X
            java.lang.String r4 = r1.B
            r6.d(r0, r3, r4)
            goto L18
        Lf:
            int r0 = r6.B
            int r3 = r6.L
            java.lang.String r4 = r1.B
            r6.d(r0, r3, r4)
        L18:
            int r0 = r6.B
            int r3 = r6.L
            if (r0 != r3) goto L1f
            r2 = r3
        L1f:
            int r5 = r5.b
            if (r5 <= 0) goto L27
            int r2 = r2 + r5
            int r2 = r2 + (-1)
            goto L2f
        L27:
            int r2 = r2 + r5
            java.lang.String r5 = r1.B
            int r5 = r5.length()
            int r2 = r2 - r5
        L2f:
            java.lang.Object r5 = r6.Y
            m42 r5 = (defpackage.m42) r5
            int r5 = r5.b()
            r0 = 0
            int r5 = defpackage.gi2.q(r2, r0, r5)
            r6.f(r5, r5)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.pu0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fp r1 = r4.a
            java.lang.String r1 = r1.B
            pu0 r5 = (defpackage.pu0) r5
            fp r3 = r5.a
            java.lang.String r3 = r3.B
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L1b
            return r2
        L1b:
            int r4 = r4.b
            int r5 = r5.b
            if (r4 == r5) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            fp r0 = r1.a
            java.lang.String r0 = r0.B
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r1.b
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CommitTextCommand(text='"
            r0.<init>(r1)
            fp r1 = r2.a
            java.lang.String r1 = r1.B
            r0.append(r1)
            java.lang.String r1 = "', newCursorPosition="
            r0.append(r1)
            int r2 = r2.b
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
