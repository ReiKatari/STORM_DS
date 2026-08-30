package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oi5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class oi5 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[tp5.values().length];
        try {
            iArr[tp5.GRID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tp5.LIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[bm5.values().length];
        try {
            iArr2[bm5.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[bm5.FAVORITES.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
