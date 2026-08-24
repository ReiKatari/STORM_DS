package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ob2  reason: default package */
/* loaded from: classes.dex */
public final class ob2 {
    public final defpackage.mt5 a;

    public ob2(defpackage.mt5 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof defpackage.ob2
            if (r0 != 0) goto L8
            goto L14
        L8:
            ob2 r2 = (defpackage.ob2) r2
            mt5 r1 = r1.a
            mt5 r2 = r2.a
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r1 = this;
            r0 = 1
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            mt5 r1 = r1.a
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RomOptionsDto(version=1, config="
            r0.<init>(r1)
            mt5 r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
