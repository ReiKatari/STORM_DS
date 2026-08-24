package androidx.camera.core.internal.compat.quirk;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements defpackage.u65 {
    public static final java.util.HashSet a = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "pixel 5"
            java.lang.String r2 = "pixel 5a"
            java.lang.String r3 = "pixel 4a"
            java.lang.String r4 = "pixel 4a (5g)"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.a = r0
            return
    }

    public static boolean b(java.util.LinkedHashSet r8) {
            int r0 = r8.size()
            r1 = 3
            r2 = 0
            if (r0 == r1) goto L9
            goto L48
        L9:
            java.util.Iterator r8 = r8.iterator()
            r0 = r2
            r1 = r0
            r3 = r1
        L10:
            boolean r4 = r8.hasNext()
            r5 = 1
            if (r4 == 0) goto L41
            java.lang.Object r4 = r8.next()
            di7 r4 = (defpackage.di7) r4
            boolean r6 = r4 instanceof defpackage.p25
            if (r6 == 0) goto L23
            r0 = r5
            goto L10
        L23:
            boolean r6 = r4 instanceof defpackage.d23
            if (r6 == 0) goto L29
            r3 = r5
            goto L10
        L29:
            zi7 r6 = r4.h
            xx r7 = defpackage.zi7.T
            boolean r6 = r6.i(r7)
            if (r6 == 0) goto L10
            zi7 r1 = r4.h
            bj7 r1 = r1.x()
            bj7 r4 = defpackage.bj7.VIDEO_CAPTURE
            if (r1 != r4) goto L3f
            r1 = r5
            goto L10
        L3f:
            r1 = r2
            goto L10
        L41:
            if (r0 == 0) goto L48
            if (r1 == 0) goto L48
            if (r3 == 0) goto L48
            return r5
        L48:
            return r2
    }
}
