package com.squareup.picasso;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public enum s {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    
    final int index;

    s(int i2) {
        this.index = i2;
    }

    public static boolean isOfflineOnly(int i2) {
        if ((i2 & OFFLINE.index) != 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldReadFromDiskCache(int i2) {
        if ((i2 & NO_CACHE.index) == 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldWriteToDiskCache(int i2) {
        if ((i2 & NO_STORE.index) == 0) {
            return true;
        }
        return false;
    }
}
