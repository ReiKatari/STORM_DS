package me.magnum.melonds;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MelonDSAndroidInterface {
    public static final me.magnum.melonds.MelonDSAndroidInterface a = null;

    static {
            me.magnum.melonds.MelonDSAndroidInterface r0 = new me.magnum.melonds.MelonDSAndroidInterface
            r0.<init>()
            me.magnum.melonds.MelonDSAndroidInterface.a = r0
            return
    }

    private final native boolean canInitializeVulkanRendererForProfileNative(boolean r1);

    private final native void configureVulkanDriverNative(boolean r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6);

    private final native void setupNative(me.magnum.melonds.common.UriFileHandler r1, boolean r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7);

    public final boolean a(me.magnum.melonds.domain.model.VulkanPipelineProfile r2) {
            r1 = this;
            r2.getClass()
            boolean r2 = r2.getUsesFastPath()     // Catch: java.lang.Throwable -> L10
            boolean r1 = r1.canInitializeVulkanRendererForProfileNative(r2)     // Catch: java.lang.Throwable -> L10
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L10
            goto L17
        L10:
            r1 = move-exception
            em5 r2 = new em5
            r2.<init>(r1)
            r1 = r2
        L17:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r0 = r1 instanceof defpackage.em5
            if (r0 == 0) goto L1e
            r1 = r2
        L1e:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    public final void b(defpackage.yq7 r9) {
            r8 = this;
            sr7 r0 = r9.a
            sr7 r1 = defpackage.sr7.CUSTOM
            if (r0 != r1) goto L9
            r0 = 1
        L7:
            r2 = r0
            goto Lb
        L9:
            r0 = 0
            goto L7
        Lb:
            java.lang.String r3 = r9.b
            java.lang.String r4 = r9.c
            java.lang.String r5 = r9.d
            java.lang.String r6 = r9.e
            java.lang.String r7 = r9.f
            r1 = r8
            r1.configureVulkanDriverNative(r2, r3, r4, r5, r6, r7)
            return
    }

    public final boolean c() {
            r2 = this;
            int r2 = r2.getRendererCapabilities()     // Catch: java.lang.Throwable -> L10
            r2 = r2 & 2
            if (r2 == 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L10
            goto L17
        L10:
            r2 = move-exception
            em5 r0 = new em5
            r0.<init>(r2)
            r2 = r0
        L17:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r2 instanceof defpackage.em5
            if (r1 == 0) goto L1e
            r2 = r0
        L1e:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    public final native void cleanup();

    public final void d(me.magnum.melonds.common.UriFileHandler r10, defpackage.yq7 r11) {
            r9 = this;
            sr7 r0 = r11.a
            sr7 r1 = defpackage.sr7.CUSTOM
            if (r0 != r1) goto L9
            r0 = 1
        L7:
            r3 = r0
            goto Lb
        L9:
            r0 = 0
            goto L7
        Lb:
            java.lang.String r4 = r11.b
            java.lang.String r5 = r11.c
            java.lang.String r6 = r11.d
            java.lang.String r7 = r11.e
            java.lang.String r8 = r11.f
            r1 = r9
            r2 = r10
            r1.setupNative(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public final native long getEmulatorGlContext();

    public final native int getRendererCapabilities();
}
