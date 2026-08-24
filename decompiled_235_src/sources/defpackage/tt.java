package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tt  reason: default package */
/* loaded from: classes.dex */
public final class tt implements f34 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final Map d;
    public final qn2 e;
    public final /* synthetic */ qn2 f;
    public final /* synthetic */ g34 g;

    public /* synthetic */ tt(int i, int i2, Map map, qn2 qn2Var, qn2 qn2Var2, g34 g34Var, int i3) {
        this.a = i3;
        this.f = qn2Var2;
        this.g = g34Var;
        this.b = i;
        this.c = i2;
        this.d = map;
        this.e = qn2Var;
    }

    @Override // defpackage.f34
    public final void a() {
        int i = this.a;
        g34 g34Var = this.g;
        qn2 qn2Var = this.f;
        switch (i) {
            case 0:
                qn2Var.g(((ut) g34Var).A.h0);
                return;
            default:
                qn2Var.g(((kz3) g34Var).h0);
                return;
        }
    }

    @Override // defpackage.f34
    public final Map b() {
        switch (this.a) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    @Override // defpackage.f34
    public final qn2 c() {
        switch (this.a) {
            case 0:
                return this.e;
            default:
                return this.e;
        }
    }

    @Override // defpackage.f34
    public final int getHeight() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    @Override // defpackage.f34
    public final int getWidth() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }
}
