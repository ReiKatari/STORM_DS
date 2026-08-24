package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m92  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m92 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[vl7.values().length];
        try {
            iArr[vl7.STRICT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vl7.LOG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vl7.QUIET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
