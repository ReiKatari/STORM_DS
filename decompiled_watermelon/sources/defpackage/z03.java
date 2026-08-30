package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z03  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class z03 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[a03.values().length];
        try {
            iArr[a03.POSITIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a03.NEGATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[yz2.values().length];
        try {
            iArr2[yz2.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[yz2.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[yz2.UP.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[yz2.DOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
