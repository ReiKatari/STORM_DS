package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fg3  reason: default package */
/* loaded from: classes.dex */
public final class fg3 extends sf3 {
    public final /* synthetic */ jg3 b;
    public final /* synthetic */ aj2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg3(jg3 jg3Var, aj2 aj2Var, String str) {
        super(str);
        this.b = jg3Var;
        this.c = aj2Var;
    }

    @Override // defpackage.tv3
    public final uv3 f(vv3 vv3Var, List list, long j) {
        jg3 jg3Var = this.b;
        dg3 dg3Var = jg3Var.c0;
        dg3Var.A = vv3Var.getLayoutDirection();
        dg3Var.B = vv3Var.b();
        dg3Var.L = vv3Var.o();
        boolean w = vv3Var.w();
        aj2 aj2Var = this.c;
        if (!w && jg3Var.A.d0 != null) {
            jg3Var.X = 0;
            uv3 uv3Var = (uv3) aj2Var.j(jg3Var.d0, new lz0(j));
            return new eg3(uv3Var, jg3Var, jg3Var.X, uv3Var, 0);
        }
        jg3Var.R = 0;
        uv3 uv3Var2 = (uv3) aj2Var.j(dg3Var, new lz0(j));
        return new eg3(uv3Var2, jg3Var, jg3Var.R, uv3Var2, 1);
    }
}
