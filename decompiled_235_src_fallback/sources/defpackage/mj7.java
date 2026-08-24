package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mj7  reason: default package */
/* loaded from: classes.dex */
public final class mj7 {
    public static defpackage.oj7 a(defpackage.di7 r1) {
            r1.getClass()
            boolean r0 = r1 instanceof defpackage.p25
            if (r0 == 0) goto La
            oj7 r1 = defpackage.oj7.PREVIEW
            return r1
        La:
            boolean r0 = r1 instanceof defpackage.d23
            if (r0 == 0) goto L11
            oj7 r1 = defpackage.oj7.IMAGE_CAPTURE
            return r1
        L11:
            boolean r0 = r1 instanceof defpackage.r13
            if (r0 == 0) goto L18
            oj7 r1 = defpackage.oj7.IMAGE_ANALYSIS
            return r1
        L18:
            boolean r0 = defpackage.ej2.L(r1)
            if (r0 == 0) goto L21
            oj7 r1 = defpackage.oj7.VIDEO_CAPTURE
            return r1
        L21:
            boolean r1 = r1 instanceof defpackage.pr6
            if (r1 == 0) goto L28
            oj7 r1 = defpackage.oj7.STREAM_SHARING
            return r1
        L28:
            oj7 r1 = defpackage.oj7.UNDEFINED
            return r1
    }

    public static defpackage.oj7 b(defpackage.zi7 r1) {
            r1.getClass()
            bj7 r1 = r1.x()
            int[] r0 = defpackage.lj7.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L2d
            r0 = 2
            if (r1 == r0) goto L2a
            r0 = 3
            if (r1 == r0) goto L27
            r0 = 4
            if (r1 == r0) goto L24
            r0 = 5
            if (r1 == r0) goto L21
            oj7 r1 = defpackage.oj7.UNDEFINED
            return r1
        L21:
            oj7 r1 = defpackage.oj7.STREAM_SHARING
            return r1
        L24:
            oj7 r1 = defpackage.oj7.VIDEO_CAPTURE
            return r1
        L27:
            oj7 r1 = defpackage.oj7.PREVIEW
            return r1
        L2a:
            oj7 r1 = defpackage.oj7.IMAGE_CAPTURE
            return r1
        L2d:
            oj7 r1 = defpackage.oj7.IMAGE_ANALYSIS
            return r1
    }
}
