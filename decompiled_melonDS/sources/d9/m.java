package d9;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f4027a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.RESPECT_PERFORMANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.IGNORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.RESPECT_ALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f4027a = iArr;
    }
}
