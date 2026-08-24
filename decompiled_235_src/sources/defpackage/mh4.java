package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mh4  reason: default package */
/* loaded from: classes.dex */
public final class mh4 extends yc7 {
    public static final kh4 b = new kh4(new mh4(n67.LAZILY_PARSED_NUMBER), 0);
    public final o67 a;

    public mh4(o67 o67Var) {
        this.a = o67Var;
    }

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        jf3 n0 = hf3Var.n0();
        int i = lh4.a[n0.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                StringBuilder sb = new StringBuilder("Expecting number, got: ");
                sb.append(n0);
                String x = hf3Var.x();
                sb.append("; at path ");
                sb.append(x);
                throw new RuntimeException(sb.toString());
            }
            return this.a.readNumber(hf3Var);
        }
        hf3Var.j0();
        return null;
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        vf3Var.a0((Number) obj);
    }
}
