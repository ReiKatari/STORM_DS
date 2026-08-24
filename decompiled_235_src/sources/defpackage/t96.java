package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t96  reason: default package */
/* loaded from: classes.dex */
public final class t96 {
    public final Object a;
    public final fo2 b;
    public final fo2 c;
    public final Object d;
    public final hw6 e;
    public final fo2 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ v96 i;

    public t96(v96 v96Var, Object obj, fo2 fo2Var, fo2 fo2Var2, gr1 gr1Var, hw6 hw6Var, fo2 fo2Var3) {
        this.i = v96Var;
        this.a = obj;
        this.b = fo2Var;
        this.c = fo2Var2;
        this.d = gr1Var;
        this.e = hw6Var;
        this.f = fo2Var3;
    }

    public final void a() {
        il1 il1Var;
        Object obj = this.g;
        if (obj instanceof p96) {
            ((p96) obj).m(this.h, this.i.A);
            return;
        }
        if (obj instanceof il1) {
            il1Var = (il1) obj;
        } else {
            il1Var = null;
        }
        if (il1Var != null) {
            il1Var.dispose();
        }
    }
}
