package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ay  reason: default package */
/* loaded from: classes.dex */
public final class ay extends dz3 {
    public zx a;
    public gs0 b;

    @Override // defpackage.dz3
    public final yy3 c() {
        return new zx(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final /* bridge */ /* synthetic */ void g(yy3 yy3Var) {
        zx zxVar = (zx) yy3Var;
    }

    public final Object h(k11 k11Var) {
        gs0 gs0Var = this.b;
        if (gs0Var == null) {
            gs0Var = new gs0();
            this.b = gs0Var;
            zx zxVar = this.a;
            if (zxVar != null && zxVar.i0) {
                zxVar.R0();
            }
        }
        Object h = gs0Var.h(k11Var);
        if (h == p31.COROUTINE_SUSPENDED) {
            return h;
        }
        return o27.a;
    }

    public final int hashCode() {
        return 234;
    }
}
