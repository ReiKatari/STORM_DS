package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e44  reason: default package */
/* loaded from: classes.dex */
public enum e44 {
    NO_CACHE(1),
    NO_STORE(2);
    
    final int index;

    e44(int i) {
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
