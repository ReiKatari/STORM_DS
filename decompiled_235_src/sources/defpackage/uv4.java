package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uv4  reason: default package */
/* loaded from: classes.dex */
public final class uv4 {
    public final Context a;
    public final of6 b = pf6.b(0, Integer.MAX_VALUE, null, 4);
    public final LinkedHashMap c = new LinkedHashMap();

    public uv4(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, s41 s41Var) {
        tv4 tv4Var;
        int i;
        Context context;
        if (s41Var instanceof tv4) {
            tv4Var = (tv4) s41Var;
            int i2 = tv4Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tv4Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = tv4Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = tv4Var.Z;
                boolean z = false;
                context = this.a;
                boolean z2 = true;
                if (i == 0) {
                    if (i == 1) {
                        str = tv4Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (ge7.s(context, str) != 0) {
                        LinkedHashMap linkedHashMap = this.c;
                        Object obj2 = linkedHashMap.get(str);
                        if (obj2 == null) {
                            obj2 = pf6.a(0, 1, m80.DROP_OLDEST);
                            linkedHashMap.put(str, obj2);
                        }
                        wt6 wt6Var = new wt6((na4) obj2, new bf4(this, str, null, 4));
                        tv4Var.R = str;
                        tv4Var.Z = 1;
                        if (f04.B(wt6Var, tv4Var) == x61Var) {
                            return x61Var;
                        }
                    }
                    return Boolean.valueOf(z2);
                }
                if (ge7.s(context, str) == 0) {
                    z = true;
                }
                z2 = z;
                return Boolean.valueOf(z2);
            }
        }
        tv4Var = new tv4(this, s41Var);
        Object obj3 = tv4Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = tv4Var.Z;
        boolean z3 = false;
        context = this.a;
        boolean z22 = true;
        if (i == 0) {
        }
        if (ge7.s(context, str) == 0) {
        }
        z22 = z3;
        return Boolean.valueOf(z22);
    }
}
