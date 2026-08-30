package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nx5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class nx5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[mx5.values().length];
        try {
            iArr[mx5.SecureOff.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mx5.SecureOn.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[mx5.Inherit.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
