package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dg0  reason: default package */
/* loaded from: classes.dex */
public enum dg0 {
    RELEASED(false),
    RELEASING(true),
    CLOSED(false),
    PENDING_OPEN(false),
    CLOSING(true),
    OPENING(true),
    OPEN(true),
    CONFIGURED(true);
    
    private final boolean mHoldsCameraSlot;

    dg0(boolean z) {
        this.mHoldsCameraSlot = z;
    }

    public boolean holdsCameraSlot() {
        return this.mHoldsCameraSlot;
    }
}
