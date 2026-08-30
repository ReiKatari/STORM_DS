package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n56  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class n56 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[be6.values().length];
        try {
            iArr[be6.NoMatchFound.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[be6.NoRequest.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[be6.MatchFound.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[be6.VisibleContentAbsentDuringTransition.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
