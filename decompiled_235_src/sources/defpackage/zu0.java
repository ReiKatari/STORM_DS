package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zu0  reason: default package */
/* loaded from: classes.dex */
public final class zu0 implements r41 {
    public static final zu0 B = new zu0(0);
    public static final zu0 L = new zu0(1);
    public final /* synthetic */ int A;

    public /* synthetic */ zu0(int i) {
        this.A = i;
    }

    @Override // defpackage.r41
    public final l61 b() {
        switch (this.A) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return vt1.A;
        }
    }

    @Override // defpackage.r41
    public final void i(Object obj) {
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

    private final void a(Object obj) {
    }
}
