package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class DldiSdCardConfiguration {
    public static final int $stable = 0;
    private final boolean enabled;
    private final String folderPath;
    private final boolean folderSync;
    private final String imagePath;
    private final int imageSize;

    public DldiSdCardConfiguration(boolean z, String str, int i, boolean z2, String str2) {
        this.enabled = z;
        this.imagePath = str;
        this.imageSize = i;
        this.folderSync = z2;
        this.folderPath = str2;
    }

    public static /* synthetic */ DldiSdCardConfiguration copy$default(DldiSdCardConfiguration dldiSdCardConfiguration, boolean z, String str, int i, boolean z2, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = dldiSdCardConfiguration.enabled;
        }
        if ((i2 & 2) != 0) {
            str = dldiSdCardConfiguration.imagePath;
        }
        if ((i2 & 4) != 0) {
            i = dldiSdCardConfiguration.imageSize;
        }
        if ((i2 & 8) != 0) {
            z2 = dldiSdCardConfiguration.folderSync;
        }
        if ((i2 & 16) != 0) {
            str2 = dldiSdCardConfiguration.folderPath;
        }
        String str3 = str2;
        int i3 = i;
        return dldiSdCardConfiguration.copy(z, str, i3, z2, str3);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final String component2() {
        return this.imagePath;
    }

    public final int component3() {
        return this.imageSize;
    }

    public final boolean component4() {
        return this.folderSync;
    }

    public final String component5() {
        return this.folderPath;
    }

    public final DldiSdCardConfiguration copy(boolean z, String str, int i, boolean z2, String str2) {
        return new DldiSdCardConfiguration(z, str, i, z2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DldiSdCardConfiguration)) {
            return false;
        }
        DldiSdCardConfiguration dldiSdCardConfiguration = (DldiSdCardConfiguration) obj;
        if (this.enabled == dldiSdCardConfiguration.enabled && nb3.k(this.imagePath, dldiSdCardConfiguration.imagePath) && this.imageSize == dldiSdCardConfiguration.imageSize && this.folderSync == dldiSdCardConfiguration.folderSync && nb3.k(this.folderPath, dldiSdCardConfiguration.folderPath)) {
            return true;
        }
        return false;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getFolderPath() {
        return this.folderPath;
    }

    public final boolean getFolderSync() {
        return this.folderSync;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final int getImageSize() {
        return this.imageSize;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.enabled) * 31;
        String str = this.imagePath;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int e = xg6.e(lb1.a(this.imageSize, (hashCode2 + hashCode) * 31, 31), this.folderSync, 31);
        String str2 = this.folderPath;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return e + i;
    }

    public String toString() {
        boolean z = this.enabled;
        String str = this.imagePath;
        int i = this.imageSize;
        boolean z2 = this.folderSync;
        String str2 = this.folderPath;
        StringBuilder sb = new StringBuilder("DldiSdCardConfiguration(enabled=");
        sb.append(z);
        sb.append(", imagePath=");
        sb.append(str);
        sb.append(", imageSize=");
        sb.append(i);
        sb.append(", folderSync=");
        sb.append(z2);
        sb.append(", folderPath=");
        return i61.n(sb, str2, ")");
    }
}
