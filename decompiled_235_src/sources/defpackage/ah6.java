package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ah6  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ah6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[qp6.values().length];
        try {
            iArr[qp6.NoMatchFound.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qp6.NoRequest.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qp6.MatchFound.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[qp6.VisibleContentAbsentDuringTransition.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
