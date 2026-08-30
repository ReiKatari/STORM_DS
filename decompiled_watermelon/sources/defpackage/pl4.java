package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pl4  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class pl4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[sl4.values().length];
        try {
            iArr[sl4.InitialPending.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sl4.RecomposePending.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[sl4.Recomposing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[sl4.ApplyPending.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[sl4.Applied.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[sl4.Cancelled.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[sl4.Invalid.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
