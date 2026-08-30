package a4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface a0 extends j {
    default int B0(x0 x0Var, y3.u0 u0Var, int i2) {
        return d(new y3.y(x0Var, x0Var.getLayoutDirection()), new t1(u0Var, v1.Min, w1.Height, 0), x4.b.b(i2, 0, 13)).a();
    }

    default int K(x0 x0Var, y3.u0 u0Var, int i2) {
        return d(new y3.y(x0Var, x0Var.getLayoutDirection()), new t1(u0Var, v1.Max, w1.Height, 0), x4.b.b(i2, 0, 13)).a();
    }

    y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2);

    default int p0(x0 x0Var, y3.u0 u0Var, int i2) {
        return d(new y3.y(x0Var, x0Var.getLayoutDirection()), new t1(u0Var, v1.Max, w1.Width, 0), x4.b.b(0, i2, 7)).c();
    }

    default int y0(x0 x0Var, y3.u0 u0Var, int i2) {
        return d(new y3.y(x0Var, x0Var.getLayoutDirection()), new t1(u0Var, v1.Min, w1.Width, 0), x4.b.b(0, i2, 7)).c();
    }
}
