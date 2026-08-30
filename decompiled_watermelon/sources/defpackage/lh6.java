package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lh6  reason: default package */
/* loaded from: classes.dex */
public final class lh6 extends dz3 {
    public final ki2 a;

    public lh6(ki2 ki2Var) {
        this.a = ki2Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new mh6(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh6)) {
            return false;
        }
        if (this.a == ((lh6) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        ((mh6) yy3Var).l0 = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
