package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qn5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class qn5 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[tp5.values().length];
        try {
            iArr[tp5.GRID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tp5.LIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[x77.values().length];
        try {
            iArr2[x77.ALPHA.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[x77.BETA.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[x77.RC.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[x77.FINAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[x77.NIGHTLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
