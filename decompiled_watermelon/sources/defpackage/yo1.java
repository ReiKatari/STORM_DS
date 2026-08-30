package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yo1  reason: default package */
/* loaded from: classes.dex */
public final class yo1 implements xo1 {
    public final int A;
    public int B = -1;
    public int L = -1;

    public yo1(int i) {
        this.A = i;
    }

    @Override // defpackage.xo1
    public final boolean m(CharSequence charSequence, int i, int i2, w07 w07Var) {
        int i3 = this.A;
        if (i <= i3 && i3 < i2) {
            this.B = i;
            this.L = i2;
            return false;
        } else if (i2 > i3) {
            return false;
        } else {
            return true;
        }
    }

    @Override // defpackage.xo1
    public final Object a() {
        return this;
    }
}
