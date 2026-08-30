package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qw3  reason: default package */
/* loaded from: classes.dex */
public enum qw3 {
    NO_CACHE(1),
    NO_STORE(2);
    
    final int index;

    qw3(int i) {
        this.index = i;
    }

    public static boolean shouldReadFromMemoryCache(int i) {
        if ((i & NO_CACHE.index) == 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldWriteToMemoryCache(int i) {
        if ((i & NO_STORE.index) == 0) {
            return true;
        }
        return false;
    }
}
