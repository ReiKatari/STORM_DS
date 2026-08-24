package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kv7  reason: default package */
/* loaded from: classes.dex */
public final class kv7 {
    public final java.util.List a;

    public kv7(java.util.List r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 == 0) goto L1e
            java.lang.Class<kv7> r0 = defpackage.kv7.class
            java.lang.Class r1 = r3.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L13
            goto L1e
        L13:
            kv7 r3 = (defpackage.kv7) r3
            java.util.List r2 = r2.a
            java.util.List r3 = r3.a
            boolean r2 = r2.equals(r3)
            return r2
        L1e:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r0 = this;
            java.util.List r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            r4 = 0
            r5 = 56
            java.util.List r0 = r6.a
            java.lang.String r1 = ", "
            java.lang.String r2 = "WindowLayoutInfo{ DisplayFeatures["
            java.lang.String r3 = "] }"
            java.lang.String r6 = defpackage.gt0.P0(r0, r1, r2, r3, r4, r5)
            return r6
    }
}
