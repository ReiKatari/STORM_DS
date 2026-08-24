package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mz1  reason: default package */
/* loaded from: classes.dex */
public final class mz1 {
    public final java.lang.String a;
    public final long b;
    public final boolean c;
    public final defpackage.tu0 d;

    public mz1(java.lang.String r1, long r2, boolean r4, defpackage.tu0 r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r5
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.mz1
            r2 = 0
            if (r1 != 0) goto La
            goto L26
        La:
            mz1 r8 = (defpackage.mz1) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.a
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L17
            goto L26
        L17:
            long r3 = r7.b
            long r5 = r8.b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L20
            goto L26
        L20:
            boolean r1 = r7.c
            boolean r3 = r8.c
            if (r1 == r3) goto L27
        L26:
            return r2
        L27:
            tu0 r7 = r7.d
            tu0 r8 = r8.d
            if (r7 == r8) goto L2e
            return r2
        L2e:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            boolean r2 = r4.c
            int r0 = defpackage.xg6.e(r0, r2, r1)
            tu0 r4 = r4.d
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HeavyShaderCompileRequest(presetName="
            r0.<init>(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", estimatedMillis="
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", isMeasured="
            r0.append(r1)
            boolean r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", response="
            r0.append(r1)
            tu0 r3 = r3.d
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
