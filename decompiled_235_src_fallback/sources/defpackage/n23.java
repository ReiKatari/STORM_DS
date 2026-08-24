package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n23  reason: default package */
/* loaded from: classes.dex */
public interface n23 extends defpackage.yd5 {
    public static final defpackage.xx o = null;
    public static final defpackage.xx p = null;
    public static final defpackage.xx q = null;
    public static final defpackage.xx r = null;
    public static final defpackage.xx s = null;
    public static final defpackage.xx t = null;
    public static final defpackage.xx u = null;
    public static final defpackage.xx v = null;
    public static final defpackage.xx w = null;
    public static final defpackage.xx x = null;

    static {
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageOutput.targetAspectRatio"
            java.lang.Class<hv> r2 = defpackage.hv.class
            r3 = 0
            r0.<init>(r1, r2, r3)
            defpackage.n23.o = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageOutput.targetRotation"
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0.<init>(r1, r2, r3)
            defpackage.n23.p = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageOutput.appTargetRotation"
            r0.<init>(r1, r2, r3)
            defpackage.n23.q = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageOutput.mirrorMode"
            r0.<init>(r1, r2, r3)
            defpackage.n23.r = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageOutput.targetResolution"
            java.lang.Class<android.util.Size> r2 = android.util.Size.class
            r0.<init>(r1, r2, r3)
            defpackage.n23.s = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageOutput.defaultResolution"
            r0.<init>(r1, r2, r3)
            defpackage.n23.t = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageOutput.maxResolution"
            r0.<init>(r1, r2, r3)
            defpackage.n23.u = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageOutput.supportedResolutions"
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r0.<init>(r1, r2, r3)
            defpackage.n23.v = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageOutput.resolutionSelector"
            java.lang.Class<el5> r4 = defpackage.el5.class
            r0.<init>(r1, r4, r3)
            defpackage.n23.w = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.imageOutput.customOrderedResolutions"
            r0.<init>(r1, r2, r3)
            defpackage.n23.x = r0
            return
    }

    static void J(defpackage.n23 r4) {
            xx r0 = defpackage.n23.o
            boolean r0 = r4.i(r0)
            xx r1 = defpackage.n23.s
            r2 = 0
            java.lang.Object r1 = r4.b(r1, r2)
            android.util.Size r1 = (android.util.Size) r1
            if (r1 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            if (r0 == 0) goto L1f
            if (r1 != 0) goto L19
            goto L1f
        L19:
            java.lang.String r4 = "Cannot use both setTargetResolution and setTargetAspectRatio on the same config."
            defpackage.i.h(r4)
            return
        L1f:
            xx r3 = defpackage.n23.w
            java.lang.Object r4 = r4.b(r3, r2)
            el5 r4 = (defpackage.el5) r4
            if (r4 == 0) goto L33
            if (r0 != 0) goto L2e
            if (r1 != 0) goto L2e
            goto L33
        L2e:
            java.lang.String r4 = "Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config."
            defpackage.i.h(r4)
        L33:
            return
    }

    default int K(int r2) {
            r1 = this;
            xx r0 = defpackage.n23.p
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.b(r0, r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }
}
