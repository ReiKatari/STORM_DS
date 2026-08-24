package com.github.junrar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ContentDescription {
    public String path;
    public long size;

    public ContentDescription(String str, long j) {
        this.path = str;
        this.size = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContentDescription contentDescription = (ContentDescription) obj;
        String str = this.path;
        String str2 = contentDescription.path;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        if (this.size == contentDescription.size) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.path;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.size;
        return ((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return this.path + ": " + this.size;
    }
}
