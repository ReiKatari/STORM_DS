package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wc1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class wc1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[xc1.values().length];
        try {
            iArr[xc1.CONFIRM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xc1.DECRYPTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xc1.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[xc1.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
