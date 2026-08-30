package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r31  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class r31 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[s31.values().length];
        try {
            iArr[s31.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s31.ATOMIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s31.UNDISPATCHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s31.LAZY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
