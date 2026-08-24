package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kr5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class kr5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[gn6.values().length];
        try {
            iArr[gn6.RECENTLY_PLAYED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gn6.MOST_PLAYED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
