package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k93  reason: default package */
/* loaded from: classes.dex */
public final class k93 extends e93 {
    public final int A;
    public final int B;
    public boolean L;
    public int R;

    public k93(int i, int i2, int i3) {
        this.A = i3;
        this.B = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.L = z;
        this.R = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.L;
    }

    @Override // defpackage.e93
    public final int nextInt() {
        int i = this.R;
        if (i == this.B) {
            if (this.L) {
                this.L = false;
                return i;
            }
            fa6.c();
            return 0;
        }
        this.R = this.A + i;
        return i;
    }
}
