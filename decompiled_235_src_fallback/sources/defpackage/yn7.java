package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yn7  reason: default package */
/* loaded from: classes.dex */
public abstract class yn7 {
    public static java.lang.String[] a(android.view.View r0) {
            java.lang.String[] r0 = r0.getReceiveContentMimeTypes()
            return r0
    }

    public static defpackage.t31 b(android.view.View r1, defpackage.t31 r2) {
            s31 r0 = r2.a
            android.view.ContentInfo r0 = r0.G()
            java.util.Objects.requireNonNull(r0)
            android.view.ContentInfo r1 = r1.performReceiveContent(r0)
            if (r1 != 0) goto L11
            r1 = 0
            return r1
        L11:
            if (r1 != r0) goto L14
            return r2
        L14:
            t31 r2 = new t31
            os0 r0 = new os0
            r0.<init>(r1)
            r2.<init>(r0)
            return r2
    }
}
