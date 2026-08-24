package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sc  reason: default package */
/* loaded from: classes.dex */
public final class sc extends hw6 implements go2 {
    public int X;
    public /* synthetic */ bd Y;
    public /* synthetic */ s04 Z;
    public /* synthetic */ Object d0;
    public final /* synthetic */ dd e0;
    public final /* synthetic */ float f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(dd ddVar, float f, r41 r41Var) {
        super(4, r41Var);
        this.e0 = ddVar;
        this.f0 = f;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        sc scVar = new sc(this.e0, this.f0, (r41) obj4);
        scVar.Y = (bd) obj;
        scVar.Z = (s04) obj2;
        scVar.d0 = obj3;
        return scVar.s(jg7.a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ah5] */
    @Override // defpackage.d20
    public final Object s(Object obj) {
        float h;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            bd bdVar = this.Y;
            float c = this.Z.c(this.d0);
            if (!Float.isNaN(c)) {
                ?? obj2 = new Object();
                dd ddVar = this.e0;
                if (Float.isNaN(ddVar.j.h())) {
                    h = RecyclerView.B1;
                } else {
                    h = ddVar.j.h();
                }
                obj2.A = h;
                to toVar = ddVar.c;
                ql1 ql1Var = new ql1(3, bdVar, obj2);
                this.Y = null;
                this.Z = null;
                this.X = 1;
                if (kj2.j(h, c, this.f0, toVar, ql1Var, this) == x61Var) {
                    return x61Var;
                }
            }
        }
        return jg7.a;
    }
}
