package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cg3  reason: default package */
/* loaded from: classes.dex */
public final class cg3 implements uv3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ mi2 d;
    public final /* synthetic */ dg3 e;
    public final /* synthetic */ jg3 f;
    public final /* synthetic */ mi2 g;

    public cg3(int i, int i2, Map map, mi2 mi2Var, dg3 dg3Var, jg3 jg3Var, mi2 mi2Var2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = mi2Var;
        this.e = dg3Var;
        this.f = jg3Var;
        this.g = mi2Var2;
    }

    @Override // defpackage.uv3
    public final int a() {
        return this.b;
    }

    @Override // defpackage.uv3
    public final void b() {
        uz2 uz2Var;
        vf3 vf3Var = this.f.A;
        boolean w = this.e.w();
        mi2 mi2Var = this.g;
        if (w && (uz2Var = ((vz2) vf3Var.A0.d).P0) != null) {
            mi2Var.n(uz2Var.g0);
        } else {
            mi2Var.n(((vz2) vf3Var.A0.d).g0);
        }
    }

    @Override // defpackage.uv3
    public final int c() {
        return this.a;
    }

    @Override // defpackage.uv3
    public final mi2 d() {
        return this.d;
    }

    @Override // defpackage.uv3
    public final Map e() {
        return this.c;
    }
}
