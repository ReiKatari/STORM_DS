package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class DSiWareTitle {
    public static final int $stable = 8;
    private final int appFlags;
    private final byte[] icon;
    private final String name;
    private final long privateSavSize;
    private final String producer;
    private final long publicSavSize;
    private final long titleId;

    public DSiWareTitle(String str, String str2, long j2, byte[] bArr, long j10, long j11, int i2) {
        str.getClass();
        str2.getClass();
        bArr.getClass();
        this.name = str;
        this.producer = str2;
        this.titleId = j2;
        this.icon = bArr;
        this.publicSavSize = j10;
        this.privateSavSize = j11;
        this.appFlags = i2;
    }

    public final int getAppFlags() {
        return this.appFlags;
    }

    public final byte[] getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final long getPrivateSavSize() {
        return this.privateSavSize;
    }

    public final String getProducer() {
        return this.producer;
    }

    public final long getPublicSavSize() {
        return this.publicSavSize;
    }

    public final long getTitleId() {
        return this.titleId;
    }

    public final boolean hasBannerSavFile() {
        if ((this.appFlags & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean hasPrivateSavFile() {
        if (this.privateSavSize != 0) {
            return true;
        }
        return false;
    }

    public final boolean hasPublicSavFile() {
        if (this.publicSavSize != 0) {
            return true;
        }
        return false;
    }
}
