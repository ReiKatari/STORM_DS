package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lg6  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class lg6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[rq2.values().length];
        a = iArr;
        try {
            iArr[rq2.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[rq2.SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[rq2.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
