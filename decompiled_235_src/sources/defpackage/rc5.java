package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rc5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class rc5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[mc5.values().length];
        try {
            iArr[mc5.RESUMABLE_SESSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mc5.TERMINAL_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
