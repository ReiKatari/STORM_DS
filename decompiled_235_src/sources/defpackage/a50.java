package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a50  reason: default package */
/* loaded from: classes.dex */
public abstract class a50 extends a21 {
    @Override // defpackage.a21
    public final a21 c() {
        return (a50) ((a21) this.b);
    }

    @Override // defpackage.a21
    public final void e(a21 a21Var) {
        if (a21Var instanceof a50) {
            this.b = a21Var;
        } else {
            i.h("Parent of block must also be block (can not be inline)");
        }
    }
}
