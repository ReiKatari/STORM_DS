package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class DldiSdCardConfiguration {
    public static final int $stable = 0;
    private final boolean enabled;
    private final java.lang.String folderPath;
    private final boolean folderSync;
    private final java.lang.String imagePath;
    private final int imageSize;

    public DldiSdCardConfiguration(boolean r1, java.lang.String r2, int r3, boolean r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.enabled = r1
            r0.imagePath = r2
            r0.imageSize = r3
            r0.folderSync = r4
            r0.folderPath = r5
            return
    }

    public static /* synthetic */ me.magnum.melonds.domain.model.DldiSdCardConfiguration copy$default(me.magnum.melonds.domain.model.DldiSdCardConfiguration r0, boolean r1, java.lang.String r2, int r3, boolean r4, java.lang.String r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L6
            boolean r1 = r0.enabled
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lc
            java.lang.String r2 = r0.imagePath
        Lc:
            r7 = r6 & 4
            if (r7 == 0) goto L12
            int r3 = r0.imageSize
        L12:
            r7 = r6 & 8
            if (r7 == 0) goto L18
            boolean r4 = r0.folderSync
        L18:
            r6 = r6 & 16
            if (r6 == 0) goto L1e
            java.lang.String r5 = r0.folderPath
        L1e:
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r2 = r0
            r3 = r1
            me.magnum.melonds.domain.model.DldiSdCardConfiguration r0 = r2.copy(r3, r4, r5, r6, r7)
            return r0
    }

    public final boolean component1() {
            r0 = this;
            boolean r0 = r0.enabled
            return r0
    }

    public final java.lang.String component2() {
            r0 = this;
            java.lang.String r0 = r0.imagePath
            return r0
    }

    public final int component3() {
            r0 = this;
            int r0 = r0.imageSize
            return r0
    }

    public final boolean component4() {
            r0 = this;
            boolean r0 = r0.folderSync
            return r0
    }

    public final java.lang.String component5() {
            r0 = this;
            java.lang.String r0 = r0.folderPath
            return r0
    }

    public final me.magnum.melonds.domain.model.DldiSdCardConfiguration copy(boolean r1, java.lang.String r2, int r3, boolean r4, java.lang.String r5) {
            r0 = this;
            me.magnum.melonds.domain.model.DldiSdCardConfiguration r0 = new me.magnum.melonds.domain.model.DldiSdCardConfiguration
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof me.magnum.melonds.domain.model.DldiSdCardConfiguration
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            me.magnum.melonds.domain.model.DldiSdCardConfiguration r5 = (me.magnum.melonds.domain.model.DldiSdCardConfiguration) r5
            boolean r1 = r4.enabled
            boolean r3 = r5.enabled
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.imagePath
            java.lang.String r3 = r5.imagePath
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            int r1 = r4.imageSize
            int r3 = r5.imageSize
            if (r1 == r3) goto L25
            return r2
        L25:
            boolean r1 = r4.folderSync
            boolean r3 = r5.folderSync
            if (r1 == r3) goto L2c
            return r2
        L2c:
            java.lang.String r4 = r4.folderPath
            java.lang.String r5 = r5.folderPath
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L37
            return r2
        L37:
            return r0
    }

    public final boolean getEnabled() {
            r0 = this;
            boolean r0 = r0.enabled
            return r0
    }

    public final java.lang.String getFolderPath() {
            r0 = this;
            java.lang.String r0 = r0.folderPath
            return r0
    }

    public final boolean getFolderSync() {
            r0 = this;
            boolean r0 = r0.folderSync
            return r0
    }

    public final java.lang.String getImagePath() {
            r0 = this;
            java.lang.String r0 = r0.imagePath
            return r0
    }

    public final int getImageSize() {
            r0 = this;
            int r0 = r0.imageSize
            return r0
    }

    public int hashCode() {
            r4 = this;
            boolean r0 = r4.enabled
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.imagePath
            r3 = 0
            if (r2 != 0) goto L10
            r2 = r3
            goto L14
        L10:
            int r2 = r2.hashCode()
        L14:
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r4.imageSize
            int r0 = defpackage.lb1.a(r2, r0, r1)
            boolean r2 = r4.folderSync
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.lang.String r4 = r4.folderPath
            if (r4 != 0) goto L27
            goto L2b
        L27:
            int r3 = r4.hashCode()
        L2b:
            int r0 = r0 + r3
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            boolean r0 = r6.enabled
            java.lang.String r1 = r6.imagePath
            int r2 = r6.imageSize
            boolean r3 = r6.folderSync
            java.lang.String r6 = r6.folderPath
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DldiSdCardConfiguration(enabled="
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = ", imagePath="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = ", imageSize="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", folderSync="
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = ", folderPath="
            r4.append(r0)
            java.lang.String r0 = ")"
            java.lang.String r6 = defpackage.i61.n(r4, r6, r0)
            return r6
    }
}
