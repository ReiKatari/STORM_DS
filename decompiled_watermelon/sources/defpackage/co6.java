package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: co6  reason: default package */
/* loaded from: classes.dex */
public final class co6 extends dz3 {
    public final vp6 a;

    public co6(vp6 vp6Var) {
        this.a = vp6Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new eo6(this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof co6) {
                if (this.a != ((co6) obj).a) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        ((eo6) yy3Var).l0 = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
