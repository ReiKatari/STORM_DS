package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ms0  reason: default package */
/* loaded from: classes.dex */
public final class ms0 implements j11 {
    public static final ms0 B = new ms0(0);
    public static final ms0 L = new ms0(1);
    public final /* synthetic */ int A;

    public /* synthetic */ ms0(int i) {
        this.A = i;
    }

    @Override // defpackage.j11
    public final e31 a() {
        switch (this.A) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return mp1.A;
        }
    }

    @Override // defpackage.j11
    public final void k(Object obj) {
        switch (this.A) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.A) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void b(Object obj) {
    }
}
