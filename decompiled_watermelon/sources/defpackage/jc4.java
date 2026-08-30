package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jc4  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class jc4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[pm3.values().length];
        try {
            iArr[pm3.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pm3.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pm3.ON_DESTROY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
