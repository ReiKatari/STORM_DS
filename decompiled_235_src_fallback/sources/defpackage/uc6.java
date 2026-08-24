package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uc6  reason: default package */
/* loaded from: classes.dex */
public final class uc6 {
    public final int a;
    public final java.util.List b;
    public final java.util.ArrayList c;
    public final java.util.concurrent.Executor d;
    public final defpackage.le0 e;
    public final int f;
    public final java.util.Map g;

    public uc6(int r1, java.util.ArrayList r2, java.util.ArrayList r3, java.util.concurrent.Executor r4, defpackage.yk0 r5, int r6, java.util.Map r7) {
            r0 = this;
            r4.getClass()
            r5.getClass()
            r7.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L50
        L3:
            boolean r0 = r3 instanceof defpackage.uc6
            if (r0 != 0) goto L8
            goto L4e
        L8:
            uc6 r3 = (defpackage.uc6) r3
            int r0 = r2.a
            int r1 = r3.a
            if (r0 == r1) goto L11
            goto L4e
        L11:
            java.util.List r0 = r2.b
            java.util.List r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L1c
            goto L4e
        L1c:
            java.util.ArrayList r0 = r2.c
            java.util.ArrayList r1 = r3.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L4e
        L27:
            java.util.concurrent.Executor r0 = r2.d
            java.util.concurrent.Executor r1 = r3.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L32
            goto L4e
        L32:
            le0 r0 = r2.e
            le0 r1 = r3.e
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L3d
            goto L4e
        L3d:
            int r0 = r2.f
            int r1 = r3.f
            if (r0 == r1) goto L44
            goto L4e
        L44:
            java.util.Map r2 = r2.g
            java.util.Map r3 = r3.g
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L50
        L4e:
            r2 = 0
            return r2
        L50:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.b
            if (r2 != 0) goto Lf
            r2 = 0
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.ArrayList r2 = r3.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.concurrent.Executor r0 = r3.d
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            le0 r2 = r3.e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r3.f
            int r0 = defpackage.lb1.a(r0, r2, r1)
            java.util.Map r3 = r3.g
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            int r3 = r3 * r1
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SessionConfigData(sessionType="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", inputConfiguration="
            r0.append(r1)
            java.util.List r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", outputConfigurations="
            r0.append(r1)
            java.util.ArrayList r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", executor="
            r0.append(r1)
            java.util.concurrent.Executor r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", stateCallback="
            r0.append(r1)
            le0 r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", sessionTemplateId="
            r0.append(r1)
            int r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", sessionParameters="
            r0.append(r1)
            java.util.Map r2 = r2.g
            r0.append(r2)
            java.lang.String r2 = ", sessionColorSpace="
            r0.append(r2)
            java.lang.String r2 = "null"
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
