package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a46  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a46 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[h60.values().length];
        try {
            iArr[h60.SUSPEND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h60.DROP_LATEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h60.DROP_OLDEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
