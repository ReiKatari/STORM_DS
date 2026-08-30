package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: db2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class db2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[p56.values().length];
        try {
            iArr[p56.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p56.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p56.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
