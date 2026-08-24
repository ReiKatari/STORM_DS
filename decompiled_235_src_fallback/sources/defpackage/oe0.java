package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oe0  reason: default package */
/* loaded from: classes.dex */
public interface oe0 extends defpackage.yd5 {
    public static final defpackage.xx b = null;
    public static final defpackage.xx c = null;
    public static final defpackage.xx d = null;
    public static final defpackage.xx e = null;
    public static final defpackage.xx f = null;

    static {
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.camera.useCaseConfigFactory"
            java.lang.Class<cj7> r2 = defpackage.cj7.class
            r3 = 0
            r0.<init>(r1, r2, r3)
            defpackage.oe0.b = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.camera.useCaseCombinationRequiredRule"
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r0.<init>(r1, r2, r3)
            defpackage.oe0.c = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.camera.SessionProcessor"
            java.lang.Class<wc6> r2 = defpackage.wc6.class
            r0.<init>(r1, r2, r3)
            defpackage.oe0.d = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.camera.isPostviewSupported"
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r0.<init>(r1, r2, r3)
            defpackage.oe0.e = r0
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.camera.isCaptureProcessProgressSupported"
            r0.<init>(r1, r2, r3)
            defpackage.oe0.f = r0
            return
    }

    default void z() {
            r2 = this;
            r0 = 0
            xx r1 = defpackage.oe0.d
            java.lang.Object r2 = r2.b(r1, r0)
            if (r2 != 0) goto La
            return
        La:
            defpackage.u34.a()
            return
    }
}
