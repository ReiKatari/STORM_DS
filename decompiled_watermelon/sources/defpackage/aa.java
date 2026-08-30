package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: aa  reason: default package */
/* loaded from: classes.dex */
public final class aa extends dz3 {
    public final i15 a;

    public aa(i15 i15Var) {
        this.a = i15Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, xc1, java.lang.Object, ba] */
    /* JADX WARN: Type inference failed for: r3v2, types: [yy3, vc1, z9] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? xc1Var = new xc1();
        xc1Var.l0 = this.a;
        j0 j0Var = new j0(9, (Object) xc1Var);
        ?? yy3Var = new yy3();
        yy3Var.j0 = j0Var;
        xc1Var.R0(yy3Var);
        return xc1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aa) {
                if (this.a != ((aa) obj).a) {
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
        ((ba) yy3Var).l0 = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
