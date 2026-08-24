package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u66  reason: default package */
/* loaded from: classes.dex */
public final class u66 {
    public final boolean a;
    public final boolean b;

    public u66(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L19
        L3:
            boolean r0 = r3 instanceof defpackage.u66
            if (r0 != 0) goto L8
            goto L17
        L8:
            u66 r3 = (defpackage.u66) r3
            boolean r0 = r2.a
            boolean r1 = r3.a
            if (r0 == r1) goto L11
            goto L17
        L11:
            boolean r2 = r2.b
            boolean r3 = r3.b
            if (r2 == r3) goto L19
        L17:
            r2 = 0
            return r2
        L19:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.a
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r3 = r3.b
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScreenEditorState(isMenuShown=false, isPropertiesDialogShown="
            r0.<init>(r1)
            boolean r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", isBackgroundPropertiesDialogShown="
            r0.append(r1)
            boolean r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
