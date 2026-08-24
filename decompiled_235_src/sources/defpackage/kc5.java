package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kc5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class kc5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[cv4.values().length];
        try {
            iArr[cv4.RETRYABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cv4.PERMANENT_FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
