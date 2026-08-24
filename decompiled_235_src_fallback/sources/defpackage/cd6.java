package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cd6  reason: default package */
/* loaded from: classes.dex */
public final class cd6 implements defpackage.ds1 {
    public final defpackage.fp a;
    public final int b;

    public cd6(java.lang.String r2, int r3) {
            r1 = this;
            fp r0 = new fp
            r0.<init>(r2)
            r1.<init>()
            r1.a = r0
            r1.b = r3
            return
    }

    @Override // defpackage.ds1
    public final void a(defpackage.gs1 r7) {
            r6 = this;
            int r0 = r7.R
            fp r1 = r6.a
            r2 = -1
            if (r0 == r2) goto L1f
            int r3 = r7.X
            java.lang.String r4 = r1.B
            java.lang.String r5 = r1.B
            r7.d(r0, r3, r4)
            int r3 = r5.length()
            if (r3 <= 0) goto L38
            int r3 = r5.length()
            int r3 = r3 + r0
            r7.e(r0, r3)
            goto L38
        L1f:
            int r0 = r7.B
            int r3 = r7.L
            java.lang.String r4 = r1.B
            java.lang.String r5 = r1.B
            r7.d(r0, r3, r4)
            int r3 = r5.length()
            if (r3 <= 0) goto L38
            int r3 = r5.length()
            int r3 = r3 + r0
            r7.e(r0, r3)
        L38:
            int r0 = r7.B
            int r3 = r7.L
            if (r0 != r3) goto L3f
            r2 = r3
        L3f:
            int r6 = r6.b
            if (r6 <= 0) goto L47
            int r2 = r2 + r6
            int r2 = r2 + (-1)
            goto L4f
        L47:
            int r2 = r2 + r6
            java.lang.String r6 = r1.B
            int r6 = r6.length()
            int r2 = r2 - r6
        L4f:
            java.lang.Object r6 = r7.Y
            m42 r6 = (defpackage.m42) r6
            int r6 = r6.b()
            r0 = 0
            int r6 = defpackage.gi2.q(r2, r0, r6)
            r7.f(r6, r6)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.cd6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fp r1 = r4.a
            java.lang.String r1 = r1.B
            cd6 r5 = (defpackage.cd6) r5
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
            java.lang.String r1 = "SetComposingTextCommand(text='"
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
