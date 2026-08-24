package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xf0  reason: default package */
/* loaded from: classes.dex */
public final class xf0 {
    public final java.lang.String a;

    public /* synthetic */ xf0(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static void a(java.lang.String r0) {
            r0.getClass()
            boolean r0 = defpackage.qs6.v0(r0)
            if (r0 != 0) goto La
            return
        La:
            java.lang.String r0 = "CameraId cannot be null or blank!"
            defpackage.i.h(r0)
            return
    }

    public static java.lang.String b(java.lang.String r1) {
            java.lang.String r0 = "CameraId-"
            java.lang.String r1 = defpackage.i61.m(r0, r1)
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.xf0
            if (r0 != 0) goto L5
            goto L11
        L5:
            xf0 r2 = (defpackage.xf0) r2
            java.lang.String r2 = r2.a
            java.lang.String r1 = r1.a
            boolean r1 = defpackage.nb3.k(r1, r2)
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
            r0 = this;
            java.lang.String r0 = r0.a
            java.lang.String r0 = b(r0)
            return r0
    }
}
