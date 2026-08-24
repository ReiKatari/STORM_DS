package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ks1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ks1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[nj3.values().length];
        try {
            iArr[nj3.TOP_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[nj3.BOTTOM_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[nj3.HYBRID_SCREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[nj3.DPAD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[nj3.BUTTONS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
