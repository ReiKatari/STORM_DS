package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vl3  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class vl3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ul3.values().length];
        try {
            iArr[ul3.RC_CLIENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ul3.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ul3.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
