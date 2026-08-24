package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zm3  reason: default package */
/* loaded from: classes.dex */
public final class zm3 implements f34 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ qn2 d;
    public final /* synthetic */ an3 e;
    public final /* synthetic */ gn3 f;
    public final /* synthetic */ qn2 g;

    public zm3(int i, int i2, Map map, qn2 qn2Var, an3 an3Var, gn3 gn3Var, qn2 qn2Var2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = qn2Var;
        this.e = an3Var;
        this.f = gn3Var;
        this.g = qn2Var2;
    }

    @Override // defpackage.f34
    public final void a() {
        x53 x53Var;
        sm3 sm3Var = this.f.A;
        boolean a0 = this.e.a0();
        qn2 qn2Var = this.g;
        if (a0 && (x53Var = ((y53) sm3Var.B0.d).Q0) != null) {
            qn2Var.g(x53Var.h0);
        } else {
            qn2Var.g(((y53) sm3Var.B0.d).h0);
        }
    }

    @Override // defpackage.f34
    public final Map b() {
        return this.c;
    }

    @Override // defpackage.f34
    public final qn2 c() {
        return this.d;
    }

    @Override // defpackage.f34
    public final int getHeight() {
        return this.b;
    }

    @Override // defpackage.f34
    public final int getWidth() {
        return this.a;
    }
}
