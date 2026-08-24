package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w94  reason: default package */
/* loaded from: classes.dex */
public final class w94 extends t04 implements bg3 {
    public final dw4 R;
    public Object X;

    public w94(dw4 dw4Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.R = dw4Var;
        this.X = obj2;
    }

    @Override // defpackage.t04, java.util.Map.Entry
    public final Object getValue() {
        return this.X;
    }

    @Override // defpackage.t04, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i;
        Object obj2 = this.X;
        this.X = obj;
        bw4 bw4Var = (bw4) this.R.B;
        aw4 aw4Var = bw4Var.R;
        Object obj3 = this.B;
        if (!aw4Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = bw4Var.L;
        if (z) {
            if (z) {
                bc7 bc7Var = bw4Var.A[bw4Var.B];
                Object obj4 = bc7Var.A[bc7Var.L];
                aw4Var.put(obj3, obj);
                if (obj4 != null) {
                    i = obj4.hashCode();
                } else {
                    i = 0;
                }
                bw4Var.c(i, aw4Var.L, obj4, 0);
            } else {
                fa6.c();
                return null;
            }
        } else {
            aw4Var.put(obj3, obj);
        }
        bw4Var.Z = aw4Var.X;
        return obj2;
    }
}
