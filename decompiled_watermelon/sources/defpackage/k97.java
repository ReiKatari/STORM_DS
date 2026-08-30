package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k97  reason: default package */
/* loaded from: classes.dex */
public final class k97 extends no2 {
    public static final i97 c = i97.OFF;
    public final i97 a;
    public final k52 b;

    public k97(i97 i97Var) {
        i97Var.getClass();
        this.a = i97Var;
        this.b = k52.VIDEO_STABILIZATION;
    }

    @Override // defpackage.no2
    public final k52 a() {
        return this.b;
    }

    @Override // defpackage.no2
    public final boolean b(td0 td0Var, me1 me1Var) {
        int i = j97.a[this.a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return true;
                }
                i.c();
                return false;
            }
            return td0Var.u();
        }
        return td0Var.e();
    }

    public final String toString() {
        return "VideoStabilizationFeature(mode=" + this.a.name() + ')';
    }
}
