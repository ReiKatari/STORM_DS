package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
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

    public DSiWareTitle(String str, String str2, long j, byte[] bArr, long j2, long j3, int i) {
        str.getClass();
        str2.getClass();
        bArr.getClass();
        this.name = str;
        this.producer = str2;
        this.titleId = j;
        this.icon = bArr;
        this.publicSavSize = j2;
        this.privateSavSize = j3;
        this.appFlags = i;
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
