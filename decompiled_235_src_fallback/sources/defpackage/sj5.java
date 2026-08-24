package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sj5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class sj5 {
    public static final /* synthetic */ int[] a = null;

    static {
            me.magnum.melonds.domain.model.VideoRenderer[] r0 = me.magnum.melonds.domain.model.VideoRenderer.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            me.magnum.melonds.domain.model.VideoRenderer r1 = me.magnum.melonds.domain.model.VideoRenderer.SOFTWARE     // Catch: java.lang.NoSuchFieldError -> L10
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
        L10:
            me.magnum.melonds.domain.model.VideoRenderer r1 = me.magnum.melonds.domain.model.VideoRenderer.OPENGL     // Catch: java.lang.NoSuchFieldError -> L19
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
        L19:
            me.magnum.melonds.domain.model.VideoRenderer r1 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN     // Catch: java.lang.NoSuchFieldError -> L22
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
        L22:
            me.magnum.melonds.domain.model.VideoRenderer r1 = me.magnum.melonds.domain.model.VideoRenderer.COMPUTE     // Catch: java.lang.NoSuchFieldError -> L2b
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
        L2b:
            defpackage.sj5.a = r0
            return
    }
}
