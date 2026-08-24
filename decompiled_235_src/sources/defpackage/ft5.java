package defpackage;

import java.util.List;
import me.magnum.melonds.database.MelonDatabase;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ft5  reason: default package */
/* loaded from: classes.dex */
public final class ft5 implements ne2 {
    public final /* synthetic */ MelonDatabase A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String L;
    public final /* synthetic */ String R;
    public final /* synthetic */ qa4 X;
    public final /* synthetic */ om6 Y;
    public final /* synthetic */ qa4 Z;

    public ft5(MelonDatabase melonDatabase, String str, String str2, String str3, qa4 qa4Var, om6 om6Var, qa4 qa4Var2) {
        this.A = melonDatabase;
        this.B = str;
        this.L = str2;
        this.R = str3;
        this.X = qa4Var;
        this.Y = om6Var;
        this.Z = qa4Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    @Override // defpackage.ne2
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, r41 r41Var) {
        et5 et5Var;
        int i;
        if (r41Var instanceof et5) {
            et5Var = (et5) r41Var;
            int i2 = et5Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                et5Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = et5Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = et5Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        list = et5Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (list.isEmpty()) {
                        et5Var.R = list;
                        et5Var.Z = 1;
                        xe1 xe1Var = xk1.a;
                        if (hv.d0(de1.L, new ja1(this.B, this.R, this.A, this.L, (r41) null), et5Var) == x61Var) {
                            return x61Var;
                        }
                    }
                }
                this.X.setValue(list);
                for (an0 an0Var : list) {
                    Long l = an0Var.a;
                    if (l != null) {
                        long longValue = l.longValue();
                        Long l2 = new Long(longValue);
                        om6 om6Var = this.Y;
                        if (!om6Var.containsKey(l2)) {
                            om6Var.put(new Long(longValue), Boolean.TRUE);
                        }
                    }
                }
                this.Z.setValue(Boolean.FALSE);
                return jg7.a;
            }
        }
        et5Var = new et5(this, r41Var);
        Object obj2 = et5Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = et5Var.Z;
        if (i == 0) {
        }
        this.X.setValue(list);
        while (r9.hasNext()) {
        }
        this.Z.setValue(Boolean.FALSE);
        return jg7.a;
    }
}
