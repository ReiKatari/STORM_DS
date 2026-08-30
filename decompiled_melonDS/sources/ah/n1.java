package ah;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class n1 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f801a;

    static {
        int[] iArr = new int[ue.a.values().length];
        try {
            iArr[ue.a.ALWAYS_VISIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ue.a.HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ue.a.HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ue.a.ALWAYS_INVISIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f801a = iArr;
    }
}
