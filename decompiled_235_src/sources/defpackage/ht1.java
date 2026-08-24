package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ht1  reason: default package */
/* loaded from: classes.dex */
public final class ht1 implements gt1 {
    public final int A;
    public int B = -1;
    public int L = -1;

    public ht1(int i) {
        this.A = i;
    }

    @Override // defpackage.gt1
    public final boolean m(CharSequence charSequence, int i, int i2, re7 re7Var) {
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

    @Override // defpackage.gt1
    public final Object d() {
        return this;
    }
}
