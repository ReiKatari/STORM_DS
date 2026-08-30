package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o5  reason: default package */
/* loaded from: classes.dex */
public final class o5 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ k24 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o5(List list, k24 k24Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = list;
        this.Z = k24Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                ((o5) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            default:
                ((o5) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new o5(this.Y, this.Z, j11Var, 0);
            default:
                return new o5(this.Y, this.Z, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        k24 k24Var = this.Z;
        List list = this.Y;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (!list.contains((k6) k24Var.getValue())) {
                    k24Var.setValue(k6.All);
                }
                return o27Var;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (!list.contains((f6) k24Var.getValue())) {
                    k24Var.setValue(f6.All);
                }
                return o27Var;
        }
    }
}
