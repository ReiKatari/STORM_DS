package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ie0  reason: default package */
/* loaded from: classes.dex */
public enum ie0 {
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
