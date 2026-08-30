package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q14  reason: default package */
/* loaded from: classes.dex */
public final class q14 extends qt3 implements h93 {
    public final ym4 R;
    public Object X;

    public q14(ym4 ym4Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.R = ym4Var;
        this.X = obj2;
    }

    @Override // defpackage.qt3, java.util.Map.Entry
    public final Object getValue() {
        return this.X;
    }

    @Override // defpackage.qt3, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i;
        Object obj2 = this.X;
        this.X = obj;
        wm4 wm4Var = (wm4) this.R.B;
        vm4 vm4Var = wm4Var.R;
        Object obj3 = this.B;
        if (!vm4Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = wm4Var.L;
        if (z) {
            if (z) {
                gy6 gy6Var = wm4Var.A[wm4Var.B];
                Object obj4 = gy6Var.A[gy6Var.L];
                vm4Var.put(obj3, obj);
                if (obj4 != null) {
                    i = obj4.hashCode();
                } else {
                    i = 0;
                }
                wm4Var.c(i, vm4Var.L, obj4, 0);
            } else {
                vd6.b();
                return null;
            }
        } else {
            vm4Var.put(obj3, obj);
        }
        wm4Var.Z = vm4Var.X;
        return obj2;
    }
}
