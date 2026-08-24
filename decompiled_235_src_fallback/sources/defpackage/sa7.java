package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sa7  reason: default package */
/* loaded from: classes.dex */
public final class sa7 {
    public final java.util.HashMap a;
    public final android.view.View b;
    public final java.util.ArrayList c;

    public sa7(android.view.View r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            r1.b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.sa7
            if (r0 == 0) goto L18
            sa7 r3 = (defpackage.sa7) r3
            android.view.View r0 = r3.b
            android.view.View r1 = r2.b
            if (r1 != r0) goto L18
            java.util.HashMap r2 = r2.a
            java.util.HashMap r3 = r3.a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L18
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            android.view.View r0 = r1.b
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.HashMap r1 = r1.a
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TransitionValues@"
            r0.<init>(r1)
            int r1 = r5.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ":\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "    view = "
            java.lang.StringBuilder r0 = defpackage.i61.r(r0, r1)
            android.view.View r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "    values:"
            java.lang.String r0 = r0.concat(r2)
            java.util.HashMap r5 = r5.a
            java.util.Set r2 = r5.keySet()
            java.util.Iterator r2 = r2.iterator()
        L3f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "    "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = ": "
            r4.append(r0)
            java.lang.Object r0 = r5.get(r3)
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            goto L3f
        L6f:
            return r0
    }
}
