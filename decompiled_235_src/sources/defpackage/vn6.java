package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vn6  reason: default package */
/* loaded from: classes.dex */
public final class vn6 extends e93 {
    public int A;
    public final /* synthetic */ un6 B;

    public vn6(un6 un6Var) {
        this.B = un6Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A < this.B.f()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e93
    public final int nextInt() {
        int i = this.A;
        this.A = i + 1;
        return this.B.d(i);
    }
}
