package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pk5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class pk5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[il5.values().length];
        try {
            iArr[il5.MISSING_FROM_CURRENT_SET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[il5.DEFINITION_CHANGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[il5.NOT_IN_PREFETCH_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[il5.SERVER_REJECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
