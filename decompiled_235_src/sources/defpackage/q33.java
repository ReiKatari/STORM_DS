package defpackage;

import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q33  reason: default package */
/* loaded from: classes.dex */
public final class q33 implements kw2, s03 {
    public boolean A;

    public q33(boolean z) {
        this.A = z;
    }

    @Override // defpackage.s03
    public void a(my4 my4Var) {
        my4Var.getClass();
        MelonEmulator.a.onScreenTouch(my4Var.a, my4Var.b);
    }

    @Override // defpackage.s03
    public void b(b63 b63Var) {
        b63Var.getClass();
        if (b63Var != b63.HINGE) {
            MelonEmulator.a.e(b63Var);
        }
    }

    @Override // defpackage.s03
    public void c(b63 b63Var) {
        b63Var.getClass();
        b63 b63Var2 = b63.HINGE;
        MelonEmulator melonEmulator = MelonEmulator.a;
        if (b63Var == b63Var2) {
            boolean z = this.A;
            this.A = !z;
            if (!z) {
                melonEmulator.d(b63Var2);
                return;
            } else {
                melonEmulator.e(b63Var2);
                return;
            }
        }
        melonEmulator.d(b63Var);
    }

    @Override // defpackage.kw2
    public boolean d() {
        return this.A;
    }

    @Override // defpackage.kw2
    public boolean e(wi6 wi6Var) {
        return this.A;
    }
}
