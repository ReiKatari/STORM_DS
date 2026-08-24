package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cs6  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class cs6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[sw2.values().length];
        a = iArr;
        try {
            iArr[sw2.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[sw2.SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[sw2.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
