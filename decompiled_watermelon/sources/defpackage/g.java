package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[kr4.values().length];
        try {
            iArr[kr4.EXACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kr4.INEXACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kr4.AUTOMATIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
