package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r27  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class r27 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[fv2.values().length];
        try {
            iArr[fv2.Cursor.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fv2.SelectionStart.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fv2.SelectionEnd.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
