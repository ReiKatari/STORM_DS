package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l31  reason: default package */
/* loaded from: classes.dex */
public final class l31 {
    public final defpackage.u70 a;
    public final defpackage.rj0 b;

    public l31(defpackage.u70 r1, defpackage.rj0 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            rj0 r0 = r5.b
            l61 r1 = r0.X
            q61 r2 = defpackage.r61.L
            j61 r1 = r1.Z(r2)
            r61 r1 = (defpackage.r61) r1
            if (r1 == 0) goto L11
            java.lang.String r1 = r1.B
            goto L12
        L11:
            r1 = 0
        L12:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Request@"
            r2.<init>(r3)
            int r3 = r5.hashCode()
            r4 = 16
            defpackage.g04.y(r4)
            java.lang.String r3 = java.lang.Integer.toString(r3, r4)
            r3.getClass()
            r2.append(r3)
            if (r1 == 0) goto L37
            java.lang.String r3 = "["
            java.lang.String r4 = "]("
            java.lang.String r1 = defpackage.lb1.A(r3, r1, r4)
            goto L39
        L37:
            java.lang.String r1 = "("
        L39:
            r2.append(r1)
            java.lang.String r1 = "currentBounds()="
            r2.append(r1)
            u70 r5 = r5.a
            java.lang.Object r5 = r5.c()
            r2.append(r5)
            java.lang.String r5 = ", continuation="
            r2.append(r5)
            r2.append(r0)
            r5 = 41
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            return r5
    }
}
