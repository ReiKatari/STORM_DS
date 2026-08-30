package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ud0  reason: default package */
/* loaded from: classes.dex */
public enum ud0 {
    RELEASED(false),
    RELEASING(true),
    CLOSED(false),
    PENDING_OPEN(false),
    CLOSING(true),
    OPENING(true),
    OPEN(true),
    CONFIGURED(true);
    
    private final boolean mHoldsCameraSlot;

    ud0(boolean z) {
        this.mHoldsCameraSlot = z;
    }

    public boolean holdsCameraSlot() {
        return this.mHoldsCameraSlot;
    }
}
