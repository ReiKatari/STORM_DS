package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zh2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class zh2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[yh2.values().length];
        try {
            iArr[yh2.ON_CONFIGURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yh2.ON_CREATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yh2.ON_UPGRADE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yh2.ON_DOWNGRADE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[yh2.ON_OPEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
