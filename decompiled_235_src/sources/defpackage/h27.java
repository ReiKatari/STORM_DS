package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h27  reason: default package */
/* loaded from: classes.dex */
public final class h27 implements f86 {
    public final /* synthetic */ f86 a;
    public final ii1 b;
    public final ii1 c;

    public h27(f86 f86Var, final i27 i27Var) {
        this.a = f86Var;
        this.b = np2.I(new on2() { // from class: g27
            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                boolean z = false;
                i27 i27Var2 = i27Var;
                switch (i) {
                    case 0:
                        if (i27Var2.a.h() < i27Var2.b.h()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (i27Var2.a.h() > RecyclerView.B1) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        this.c = np2.I(new on2() { // from class: g27
            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                boolean z = false;
                i27 i27Var2 = i27Var;
                switch (i) {
                    case 0:
                        if (i27Var2.a.h() < i27Var2.b.h()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (i27Var2.a.h() > RecyclerView.B1) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
    }

    @Override // defpackage.f86
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.f86
    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.f86
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.f86
    public final Object d(xa4 xa4Var, eo2 eo2Var, s41 s41Var) {
        return this.a.d(xa4Var, eo2Var, s41Var);
    }

    @Override // defpackage.f86
    public final float e(float f) {
        return this.a.e(f);
    }
}
