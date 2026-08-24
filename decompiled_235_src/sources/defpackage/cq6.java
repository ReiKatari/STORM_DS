package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cq6  reason: default package */
/* loaded from: classes.dex */
public final class cq6 implements Map.Entry, bg3 {
    public final Object A;
    public Object B;
    public final /* synthetic */ dq6 L;

    public cq6(dq6 dq6Var) {
        this.L = dq6Var;
        Map.Entry entry = (Map.Entry) dq6Var.X;
        entry.getClass();
        this.A = entry.getKey();
        Map.Entry entry2 = (Map.Entry) dq6Var.X;
        entry2.getClass();
        this.B = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.A;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.B;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        dq6 dq6Var = this.L;
        om6 om6Var = (om6) dq6Var.L;
        if (om6Var.d().d == dq6Var.B) {
            Object obj2 = this.B;
            om6Var.put(this.A, obj);
            this.B = obj;
            return obj2;
        }
        i.l();
        return null;
    }
}
