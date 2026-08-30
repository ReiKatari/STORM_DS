package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: aq4  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class aq4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[po0.values().length];
        try {
            iArr[po0.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[po0.POLYMORPHIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[po0.ALL_JSON_OBJECTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
