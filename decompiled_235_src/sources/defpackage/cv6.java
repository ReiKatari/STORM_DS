package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cv6  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class cv6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[av6.values().length];
        try {
            iArr[av6.WITHOUT_FEATURE_COMBO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[av6.WITH_FEATURE_COMBO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[av6.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
