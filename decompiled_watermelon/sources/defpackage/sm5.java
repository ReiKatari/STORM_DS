package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sm5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class sm5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[gl5.values().length];
        try {
            iArr[gl5.CONFIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gl5.RETRO_ACHIEVEMENTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gl5.OFFLINE_ACHIEVEMENTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
