package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h55  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h55 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[g55.values().length];
        try {
            iArr[g55.OPTIONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g55.COLLECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g55.LIST_ELEMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g55.NOT_NULL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
