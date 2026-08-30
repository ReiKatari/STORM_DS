package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mf3  reason: default package */
/* loaded from: classes.dex */
public interface mf3 extends vc1 {
    default int H(fs3 fs3Var, mv3 mv3Var, int i) {
        return e(new g53(fs3Var, fs3Var.getLayoutDirection()), new ga1(mv3Var, p74.Min, q74.Height, 2), nz0.b(0, i, 0, 0, 13)).a();
    }

    default int Z(fs3 fs3Var, mv3 mv3Var, int i) {
        return e(new g53(fs3Var, fs3Var.getLayoutDirection()), new ga1(mv3Var, p74.Min, q74.Width, 2), nz0.b(0, 0, 0, i, 7)).c();
    }

    uv3 e(vv3 vv3Var, mv3 mv3Var, long j);

    default int h(fs3 fs3Var, mv3 mv3Var, int i) {
        return e(new g53(fs3Var, fs3Var.getLayoutDirection()), new ga1(mv3Var, p74.Max, q74.Width, 2), nz0.b(0, 0, 0, i, 7)).c();
    }

    default int r(fs3 fs3Var, mv3 mv3Var, int i) {
        return e(new g53(fs3Var, fs3Var.getLayoutDirection()), new ga1(mv3Var, p74.Max, q74.Height, 2), nz0.b(0, i, 0, 0, 13)).a();
    }
}
