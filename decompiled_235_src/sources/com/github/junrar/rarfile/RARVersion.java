package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum RARVersion {
    OLD,
    V4,
    V5;

    public static boolean isOldFormat(RARVersion rARVersion) {
        if (rARVersion == OLD) {
            return true;
        }
        return false;
    }
}
