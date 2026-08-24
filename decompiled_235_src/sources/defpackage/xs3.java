package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xs3  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class xs3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ws3.values().length];
        try {
            iArr[ws3.RC_CLIENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ws3.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ws3.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
