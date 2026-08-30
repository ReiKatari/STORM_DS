package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e32  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class e32 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[c32.values().length];
        try {
            iArr[c32.RESPECT_PERFORMANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c32.IGNORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c32.RESPECT_ALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
