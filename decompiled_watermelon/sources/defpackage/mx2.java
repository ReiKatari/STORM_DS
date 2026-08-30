package defpackage;

import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mx2  reason: default package */
/* loaded from: classes.dex */
public final class mx2 implements jq2, qu2 {
    public boolean A;

    public mx2(boolean z) {
        this.A = z;
    }

    @Override // defpackage.qu2
    public void a(ip4 ip4Var) {
        ip4Var.getClass();
        MelonEmulator.a.onScreenTouch(ip4Var.a, ip4Var.b);
    }

    @Override // defpackage.qu2
    public void b(yz2 yz2Var) {
        yz2Var.getClass();
        if (yz2Var != yz2.HINGE) {
            MelonEmulator.a.e(yz2Var);
        }
    }

    @Override // defpackage.qu2
    public void c(yz2 yz2Var) {
        yz2Var.getClass();
        yz2 yz2Var2 = yz2.HINGE;
        MelonEmulator melonEmulator = MelonEmulator.a;
        if (yz2Var == yz2Var2) {
            boolean z = this.A;
            this.A = !z;
            if (!z) {
                melonEmulator.d(yz2Var2);
                return;
            } else {
                melonEmulator.e(yz2Var2);
                return;
            }
        }
        melonEmulator.d(yz2Var);
    }

    @Override // defpackage.jq2
    public boolean d() {
        return this.A;
    }

    @Override // defpackage.jq2
    public boolean e(h76 h76Var) {
        return this.A;
    }
}
