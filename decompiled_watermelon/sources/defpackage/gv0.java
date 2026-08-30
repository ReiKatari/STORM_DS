package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gv0  reason: default package */
/* loaded from: classes.dex */
public final class gv0 implements af4, c31 {
    public static final k45 B = new k45(26);
    public final sk2 A;

    public gv0(sk2 sk2Var) {
        this.A = sk2Var;
    }

    @Override // defpackage.e31
    public final /* bridge */ e31 C(e31 e31Var) {
        return se.O(this, e31Var);
    }

    @Override // defpackage.e31
    public final /* bridge */ c31 I(d31 d31Var) {
        return se.z(this, d31Var);
    }

    @Override // defpackage.e31
    public final Object N(aj2 aj2Var, Object obj) {
        return aj2Var.j(obj, this);
    }

    @Override // defpackage.e31
    public final /* bridge */ e31 T(d31 d31Var) {
        return se.J(this, d31Var);
    }

    @Override // defpackage.af4
    public final List g(Integer num) {
        return this.A.E();
    }

    @Override // defpackage.c31
    public final d31 getKey() {
        return B;
    }

    @Override // defpackage.af4
    public final boolean j() {
        return this.A.C;
    }
}
