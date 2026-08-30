package v0;

import j0.b0;
import j0.x0;
import java.util.UUID;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends x0 {

    /* renamed from: b  reason: collision with root package name */
    public final String f13607b;

    /* renamed from: c  reason: collision with root package name */
    public int f13608c;

    public i(b0 b0Var) {
        super(b0Var);
        this.f13607b = "virtual-" + b0Var.d() + "-" + UUID.randomUUID().toString();
    }

    @Override // j0.x0, j0.b0
    public final int b() {
        return e(0);
    }

    @Override // j0.x0, j0.b0
    public final String d() {
        return this.f13607b;
    }

    @Override // j0.x0, j0.b0
    public final int e(int i2) {
        return k0.h.i(this.f7325a.e(i2) - this.f13608c);
    }
}
