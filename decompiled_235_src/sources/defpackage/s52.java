package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s52  reason: default package */
/* loaded from: classes.dex */
public final class s52 extends ly4 {
    public final bc6 l;
    public final ex6 m;

    public s52(String str, int i) {
        super(str, null, i);
        this.l = bc6.e;
        this.m = new ex6(new r52(i, str, this));
    }

    @Override // defpackage.ly4, defpackage.wb6
    public final np2 e() {
        return this.l;
    }

    @Override // defpackage.ly4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof wb6)) {
                wb6 wb6Var = (wb6) obj;
                if (wb6Var.e() != bc6.e || !this.a.equals(wb6Var.a()) || !nb3.k(q60.k(this), q60.k(wb6Var))) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.ly4
    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode();
        w0 w0Var = new w0(this);
        int i2 = 1;
        while (w0Var.hasNext()) {
            int i3 = i2 * 31;
            String str = (String) w0Var.next();
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return (hashCode * 31) + i2;
    }

    @Override // defpackage.ly4, defpackage.wb6
    public final wb6 j(int i) {
        return ((wb6[]) this.m.getValue())[i];
    }

    @Override // defpackage.ly4
    public final String toString() {
        return gt0.P0(new dv(this, 5), ", ", this.a.concat("("), ")", null, 56);
    }
}
