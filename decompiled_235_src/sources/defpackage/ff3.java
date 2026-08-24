package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ff3  reason: default package */
/* loaded from: classes.dex */
public final class ff3 extends v0 {
    public final de3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff3(id3 id3Var, de3 de3Var, String str) {
        super(id3Var, str);
        id3Var.getClass();
        de3Var.getClass();
        this.Y = de3Var;
        this.A.add("primitive");
    }

    @Override // defpackage.v0
    public final de3 E() {
        return this.Y;
    }

    @Override // defpackage.v0
    public final de3 d(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.Y;
        }
        i.h("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // defpackage.ux0
    public final int q(wb6 wb6Var) {
        wb6Var.getClass();
        return 0;
    }
}
