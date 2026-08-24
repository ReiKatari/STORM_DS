package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kq1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class kq1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[jq1.values().length];
        try {
            iArr[jq1.INTERNAL_TOP_EXTERNAL_BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jq1.INTERNAL_BOTTOM_EXTERNAL_TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jq1.OFF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
