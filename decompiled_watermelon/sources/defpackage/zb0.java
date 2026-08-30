package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zb0  reason: default package */
/* loaded from: classes.dex */
public enum zb0 {
    UNKNOWN,
    NONE,
    READY,
    FIRED;

    public int toFlashState() {
        int ordinal = ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            return 3;
        }
        if (ordinal == 3) {
            return 1;
        }
        return 0;
    }
}
