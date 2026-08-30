package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c33  reason: default package */
/* loaded from: classes.dex */
public final class c33 extends w23 {
    public final int A;
    public final int B;
    public boolean L;
    public int R;

    public c33(int i, int i2, int i3) {
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

    @Override // defpackage.w23
    public final int nextInt() {
        int i = this.R;
        if (i == this.B) {
            if (this.L) {
                this.L = false;
                return i;
            }
            vd6.b();
            return 0;
        }
        this.R = this.A + i;
        return i;
    }
}
