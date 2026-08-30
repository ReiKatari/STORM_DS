package androidx.lifecycle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f1477a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.RESUMED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q.DESTROYED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[q.INITIALIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f1477a = iArr;
    }
}
