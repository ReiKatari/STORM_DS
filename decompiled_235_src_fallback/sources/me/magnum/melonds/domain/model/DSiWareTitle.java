package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class DSiWareTitle {
    public static final int $stable = 8;
    private final int appFlags;
    private final byte[] icon;
    private final java.lang.String name;
    private final long privateSavSize;
    private final java.lang.String producer;
    private final long publicSavSize;
    private final long titleId;

    public DSiWareTitle(java.lang.String r1, java.lang.String r2, long r3, byte[] r5, long r6, long r8, int r10) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r5.getClass()
            r0.<init>()
            r0.name = r1
            r0.producer = r2
            r0.titleId = r3
            r0.icon = r5
            r0.publicSavSize = r6
            r0.privateSavSize = r8
            r0.appFlags = r10
            return
    }

    public final int getAppFlags() {
            r0 = this;
            int r0 = r0.appFlags
            return r0
    }

    public final byte[] getIcon() {
            r0 = this;
            byte[] r0 = r0.icon
            return r0
    }

    public final java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.name
            return r0
    }

    public final long getPrivateSavSize() {
            r2 = this;
            long r0 = r2.privateSavSize
            return r0
    }

    public final java.lang.String getProducer() {
            r0 = this;
            java.lang.String r0 = r0.producer
            return r0
    }

    public final long getPublicSavSize() {
            r2 = this;
            long r0 = r2.publicSavSize
            return r0
    }

    public final long getTitleId() {
            r2 = this;
            long r0 = r2.titleId
            return r0
    }

    public final boolean hasBannerSavFile() {
            r0 = this;
            int r0 = r0.appFlags
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean hasPrivateSavFile() {
            r4 = this;
            long r0 = r4.privateSavSize
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r4 = 1
            return r4
        La:
            r4 = 0
            return r4
    }

    public final boolean hasPublicSavFile() {
            r4 = this;
            long r0 = r4.publicSavSize
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r4 = 1
            return r4
        La:
            r4 = 0
            return r4
    }
}
