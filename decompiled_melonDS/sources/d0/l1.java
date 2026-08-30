package d0;

import android.util.Size;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l1 extends d0 {
    public final Object R;
    public final t0 X;
    public final int Y;
    public final int Z;

    public l1(y0 y0Var, Size size, t0 t0Var) {
        super(y0Var);
        this.R = new Object();
        if (size == null) {
            this.Y = this.B.c();
            this.Z = this.B.a();
        } else {
            this.Y = size.getWidth();
            this.Z = size.getHeight();
        }
        this.X = t0Var;
    }

    @Override // d0.d0, d0.y0
    public final int a() {
        return this.Z;
    }

    @Override // d0.d0, d0.y0
    public final int c() {
        return this.Y;
    }

    @Override // d0.d0, d0.y0
    public final t0 q() {
        return this.X;
    }
}
