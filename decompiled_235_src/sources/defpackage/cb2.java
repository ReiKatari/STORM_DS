package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cb2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class cb2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[bz0.values().length];
        try {
            iArr[bz0.PRESENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bz0.INVALID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bz0.MISSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
