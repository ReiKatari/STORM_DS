package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bl5  reason: default package */
/* loaded from: classes.dex */
public final class bl5 {
    public final int a;

    public /* synthetic */ bl5(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static final java.lang.String a(int r1) {
            switch(r1) {
                case 1: goto L19;
                case 2: goto L16;
                case 3: goto L13;
                case 4: goto L10;
                case 5: goto Ld;
                case 6: goto La;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "UNKNOWN-"
            java.lang.String r1 = defpackage.lb1.g(r1, r0)
            return r1
        La:
            java.lang.String r1 = "TEMPLATE_MANUAL"
            return r1
        Ld:
            java.lang.String r1 = "TEMPLATE_ZERO_SHUTTER_LAG"
            return r1
        L10:
            java.lang.String r1 = "TEMPLATE_VIDEO_SNAPSHOT"
            return r1
        L13:
            java.lang.String r1 = "TEMPLATE_RECORD"
            return r1
        L16:
            java.lang.String r1 = "TEMPLATE_STILL_CAPTURE"
            return r1
        L19:
            java.lang.String r1 = "TEMPLATE_PREVIEW"
            return r1
    }

    public static java.lang.String b(int r2) {
            java.lang.String r0 = "RequestTemplate(value="
            r1 = 41
            java.lang.String r2 = defpackage.xg6.o(r0, r2, r1)
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.bl5
            if (r0 != 0) goto L5
            goto Ld
        L5:
            bl5 r2 = (defpackage.bl5) r2
            int r2 = r2.a
            int r1 = r1.a
            if (r1 == r2) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            int r0 = r0.a
            java.lang.String r0 = b(r0)
            return r0
    }
}
