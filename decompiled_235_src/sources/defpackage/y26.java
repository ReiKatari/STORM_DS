package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y26  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class y26 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[um6.values().length];
        try {
            iArr[um6.ALWAYS_VISIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[um6.HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[um6.HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[um6.ALWAYS_INVISIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
