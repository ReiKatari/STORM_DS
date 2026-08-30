package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cs1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class cs1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[bs1.values().length];
        try {
            iArr[bs1.UNSUPPORTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bs1.INIT_FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
