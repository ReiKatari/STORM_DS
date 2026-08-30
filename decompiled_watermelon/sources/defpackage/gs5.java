package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gs5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class gs5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[fb6.values().length];
        try {
            iArr[fb6.ALWAYS_VISIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fb6.HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fb6.HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[fb6.ALWAYS_INVISIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
