package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ms6  reason: default package */
/* loaded from: classes.dex */
public final class ms6 implements defpackage.bp {
    public final java.lang.String a;

    public /* synthetic */ ms6(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.ms6
            if (r0 != 0) goto L5
            goto L11
        L5:
            ms6 r2 = (defpackage.ms6) r2
            java.lang.String r2 = r2.a
            java.lang.String r1 = r1.a
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "StringAnnotation(value="
            r1 = 41
            java.lang.String r2 = r2.a
            java.lang.String r2 = defpackage.i61.k(r1, r0, r2)
            return r2
    }
}
