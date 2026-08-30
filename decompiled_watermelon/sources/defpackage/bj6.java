package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bj6  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class bj6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[yi6.values().length];
        try {
            iArr[yi6.END.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yi6.ROLLBACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yi6.BEGIN_EXCLUSIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yi6.BEGIN_IMMEDIATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[yi6.BEGIN_DEFERRED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
