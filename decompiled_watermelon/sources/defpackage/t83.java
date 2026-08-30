package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t83  reason: default package */
/* loaded from: classes.dex */
public final class t83 extends r83 {
    public final f83 e0;
    public final List f0;
    public final int g0;
    public int h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t83(t63 t63Var, f83 f83Var) {
        super(t63Var, f83Var, (String) null, 12);
        t63Var.getClass();
        this.e0 = f83Var;
        List n1 = tq0.n1(f83Var.A.keySet());
        this.f0 = n1;
        this.g0 = n1.size() * 2;
        this.h0 = -1;
    }

    @Override // defpackage.r83, defpackage.u0
    public final k73 C() {
        return this.e0;
    }

    @Override // defpackage.r83
    public final f83 N() {
        return this.e0;
    }

    @Override // defpackage.r83, defpackage.u0, defpackage.yu0
    public final void a(h06 h06Var) {
        h06Var.getClass();
    }

    @Override // defpackage.r83, defpackage.u0
    public final k73 d(String str) {
        str.getClass();
        if (this.h0 % 2 == 0) {
            return m73.b(str);
        }
        return (k73) zt3.i0(str, this.e0);
    }

    @Override // defpackage.r83, defpackage.yu0
    public final int v(h06 h06Var) {
        h06Var.getClass();
        int i = this.h0;
        if (i < this.g0 - 1) {
            int i2 = i + 1;
            this.h0 = i2;
            return i2;
        }
        return -1;
    }

    @Override // defpackage.r83, defpackage.u0
    public final String z(h06 h06Var, int i) {
        h06Var.getClass();
        return (String) this.f0.get(i / 2);
    }
}
