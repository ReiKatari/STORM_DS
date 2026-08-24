package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jm3  reason: default package */
/* loaded from: classes.dex */
public interface jm3 extends xg1 {
    default int Z(kz3 kz3Var, x24 x24Var, int i) {
        return c(new sb3(kz3Var, kz3Var.getLayoutDirection()), new ce1(x24Var, hg4.Max, ig4.Height, 2), s21.b(0, i, 0, 0, 13)).getHeight();
    }

    f34 c(g34 g34Var, x24 x24Var, long j);

    default int f(kz3 kz3Var, x24 x24Var, int i) {
        return c(new sb3(kz3Var, kz3Var.getLayoutDirection()), new ce1(x24Var, hg4.Max, ig4.Width, 2), s21.b(0, 0, 0, i, 7)).getWidth();
    }

    default int h0(kz3 kz3Var, x24 x24Var, int i) {
        return c(new sb3(kz3Var, kz3Var.getLayoutDirection()), new ce1(x24Var, hg4.Min, ig4.Height, 2), s21.b(0, i, 0, 0, 13)).getHeight();
    }

    default int s0(kz3 kz3Var, x24 x24Var, int i) {
        return c(new sb3(kz3Var, kz3Var.getLayoutDirection()), new ce1(x24Var, hg4.Min, ig4.Width, 2), s21.b(0, 0, 0, i, 7)).getWidth();
    }
}
