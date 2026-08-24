package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jt2  reason: default package */
/* loaded from: classes.dex */
public final class jt2 {
    public final hb4 a = new hb4();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(s41 s41Var) {
        it2 it2Var;
        int i;
        hb4 hb4Var;
        if (s41Var instanceof it2) {
            it2Var = (it2) s41Var;
            int i2 = it2Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                it2Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = it2Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = it2Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        hb4Var = it2Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    hb4Var = this.a;
                    it2Var.R = hb4Var;
                    it2Var.Z = 1;
                    if (hb4Var.e(it2Var) == x61Var) {
                        return x61Var;
                    }
                }
                return new jb4(hb4Var);
            }
        }
        it2Var = new it2(this, s41Var);
        Object obj2 = it2Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = it2Var.Z;
        if (i == 0) {
        }
        return new jb4(hb4Var);
    }
}
