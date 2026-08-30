package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d76  reason: default package */
/* loaded from: classes.dex */
public final class d76 extends ln2 {
    public final b11 L;
    public final tj4 R = me2.G(null);

    public d76(b11 b11Var) {
        this.L = b11Var;
    }

    @Override // defpackage.ln2
    public final Object C(b11 b11Var) {
        if (b11Var != this.L) {
            mz2.c("Check failed.");
        }
        Object value = this.R.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }

    @Override // defpackage.ln2
    public final boolean y(b11 b11Var) {
        if (b11Var == this.L) {
            return true;
        }
        return false;
    }
}
