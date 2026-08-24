package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k82  reason: default package */
/* loaded from: classes.dex */
public final class k82 {
    public final java.util.ArrayList a;
    public final defpackage.pi b;
    public final defpackage.le0 c;
    public final int d;
    public final java.util.Map e;
    public final java.lang.Integer f;
    public final defpackage.l82 g;
    public final defpackage.xi h;

    public k82(java.util.ArrayList r1, defpackage.pi r2, defpackage.yk0 r3, int r4, java.util.Map r5, java.lang.Integer r6, defpackage.l82 r7, defpackage.xi r8) {
            r0 = this;
            r3.getClass()
            r5.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L3
            goto L57
        L3:
            boolean r0 = r4 instanceof defpackage.k82
            r1 = 0
            if (r0 != 0) goto L9
            goto L56
        L9:
            k82 r4 = (defpackage.k82) r4
            java.util.ArrayList r0 = r3.a
            java.util.ArrayList r2 = r4.a
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L16
            goto L56
        L16:
            pi r0 = r3.b
            pi r2 = r4.b
            if (r0 == r2) goto L1d
            return r1
        L1d:
            le0 r0 = r3.c
            le0 r2 = r4.c
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L28
            goto L56
        L28:
            int r0 = r3.d
            int r2 = r4.d
            if (r0 == r2) goto L2f
            goto L56
        L2f:
            java.util.Map r0 = r3.e
            java.util.Map r2 = r4.e
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L3a
            goto L56
        L3a:
            java.lang.Integer r0 = r3.f
            java.lang.Integer r2 = r4.f
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L45
            goto L56
        L45:
            l82 r0 = r3.g
            l82 r2 = r4.g
            if (r0 == r2) goto L4c
            return r1
        L4c:
            xi r3 = r3.h
            xi r4 = r4.h
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L57
        L56:
            return r1
        L57:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            r0 = 2
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.util.ArrayList r2 = r3.a
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            pi r0 = r3.b
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            le0 r2 = r3.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r3.d
            int r0 = defpackage.lb1.a(r0, r2, r1)
            java.util.Map r2 = r3.e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.Integer r0 = r3.f
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            l82 r2 = r3.g
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            xi r3 = r3.h
            if (r3 != 0) goto L44
            r3 = 0
            goto L48
        L44:
            int r3 = r3.hashCode()
        L48:
            int r2 = r2 + r3
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ExtensionSessionConfigData(sessionType=2, outputConfigurations="
            r0.<init>(r1)
            java.util.ArrayList r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", executor="
            r0.append(r1)
            pi r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", stateCallback="
            r0.append(r1)
            le0 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", sessionTemplateId="
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", sessionParameters="
            r0.append(r1)
            java.util.Map r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", extensionMode="
            r0.append(r1)
            java.lang.Integer r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", extensionStateCallback="
            r0.append(r1)
            l82 r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", postviewOutputConfiguration="
            r0.append(r1)
            xi r2 = r2.h
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
