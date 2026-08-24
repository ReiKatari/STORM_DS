package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lf4  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class lf4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[kf4.values().length];
        try {
            iArr[kf4.METERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kf4.UNMETERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kf4.NOT_ROAMING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
