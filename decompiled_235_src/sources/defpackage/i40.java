package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i40  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i40 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[cz0.values().length];
        try {
            iArr[cz0.VALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cz0.INVALID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cz0.UNSET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
