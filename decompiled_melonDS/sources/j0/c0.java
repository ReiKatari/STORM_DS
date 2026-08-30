package j0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public enum c0 {
    RELEASED(false),
    RELEASING(true),
    CLOSED(false),
    PENDING_OPEN(false),
    CLOSING(true),
    OPENING(true),
    OPEN(true),
    CONFIGURED(true);
    
    private final boolean mHoldsCameraSlot;

    c0(boolean z10) {
        this.mHoldsCameraSlot = z10;
    }

    public boolean holdsCameraSlot() {
        return this.mHoldsCameraSlot;
    }
}
