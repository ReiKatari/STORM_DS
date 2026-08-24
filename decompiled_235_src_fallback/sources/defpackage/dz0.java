package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dz0  reason: default package */
/* loaded from: classes.dex */
public final class dz0 {
    public final me.magnum.melonds.domain.model.ConsoleType a;
    public final defpackage.cz0 b;
    public final java.lang.String[] c;
    public final defpackage.vr4[] d;

    public dz0(me.magnum.melonds.domain.model.ConsoleType r1, defpackage.cz0 r2, java.lang.String[] r3, defpackage.vr4[] r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.dz0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            dz0 r5 = (defpackage.dz0) r5
            me.magnum.melonds.domain.model.ConsoleType r1 = r4.a
            me.magnum.melonds.domain.model.ConsoleType r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            cz0 r1 = r4.b
            cz0 r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            java.lang.String[] r1 = r4.c
            java.lang.String[] r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L25
            return r2
        L25:
            vr4[] r4 = r4.d
            vr4[] r5 = r5.d
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L30
            return r2
        L30:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            me.magnum.melonds.domain.model.ConsoleType r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            cz0 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String[] r0 = r2.c
            int r0 = java.util.Arrays.hashCode(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            vr4[] r2 = r2.d
            int r2 = java.util.Arrays.hashCode(r2)
            int r1 = r1 + r2
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String[] r0 = r4.c
            java.lang.String r0 = java.util.Arrays.toString(r0)
            vr4[] r1 = r4.d
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ConfigurationDirResult(consoleType="
            r2.<init>(r3)
            me.magnum.melonds.domain.model.ConsoleType r3 = r4.a
            r2.append(r3)
            java.lang.String r3 = ", status="
            r2.append(r3)
            cz0 r4 = r4.b
            r2.append(r4)
            java.lang.String r4 = ", requiredFiles="
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = ", fileResults="
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = ")"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }
}
