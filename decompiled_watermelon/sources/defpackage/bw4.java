package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bw4  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class bw4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[jv4.values().length];
        try {
            iArr[jv4.FIXED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jv4.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jv4.SIGNED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
