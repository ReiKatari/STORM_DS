package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ny1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ny1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[d35.values().length];
        try {
            iArr[d35.EXIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d35.RESUME_SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d35.KEEP_SESSION_PAUSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
