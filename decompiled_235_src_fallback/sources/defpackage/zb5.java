package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zb5  reason: default package */
/* loaded from: classes.dex */
public final class zb5 implements defpackage.bc5 {
    public final defpackage.xb5 a;
    public final boolean b;
    public final java.util.ArrayList c;

    public zb5(defpackage.xb5 r1, boolean r2, java.util.ArrayList r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof defpackage.zb5
            if (r0 != 0) goto L8
            goto L26
        L8:
            zb5 r3 = (defpackage.zb5) r3
            xb5 r0 = r2.a
            xb5 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            boolean r0 = r2.b
            boolean r1 = r3.b
            if (r0 == r1) goto L1c
            goto L26
        L1c:
            java.util.ArrayList r2 = r2.c
            java.util.ArrayList r3 = r3.c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            xb5 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.b
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.util.ArrayList r3 = r3.c
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Committed(discarded="
            r0.<init>(r1)
            xb5 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", authenticationCleared="
            r0.append(r1)
            boolean r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", failures="
            r0.append(r1)
            java.util.ArrayList r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
