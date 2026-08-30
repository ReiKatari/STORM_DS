package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iq4  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class iq4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[pw6.values().length];
        try {
            iArr[pw6.DEFERRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pw6.IMMEDIATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pw6.EXCLUSIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
