package defpackage;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Locale;
import me.magnum.melonds.domain.model.DSiWareTitle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ka1  reason: default package */
/* loaded from: classes.dex */
public final class ka1 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ la1 Z;
    public final /* synthetic */ DSiWareTitle d0;
    public final /* synthetic */ String e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ka1(la1 la1Var, DSiWareTitle dSiWareTitle, String str, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = la1Var;
        this.d0 = dSiWareTitle;
        this.e0 = str;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((ka1) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((ka1) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new ka1(this.Z, this.d0, this.e0, r41Var, 0);
            default:
                return new ka1(this.Z, this.d0, this.e0, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                la1 la1Var = this.Z;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    db1 db1Var = la1Var.e;
                    long titleId = this.d0.getTitleId();
                    db1Var.getClass();
                    g04.y(16);
                    String l = Long.toString(titleId & 4294967295L, 16);
                    l.getClass();
                    String lowerCase = qs6.B0(8, l).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    SharedPreferences.Editor edit = db1Var.c().edit();
                    String str = this.e0;
                    if (str != null && !qs6.v0(str)) {
                        edit.putString("custom_name_".concat(lowerCase), qs6.T0(str).toString());
                    } else {
                        edit.remove("custom_name_".concat(lowerCase));
                    }
                    edit.apply();
                    fg fgVar = la1Var.b;
                    this.Y = 1;
                    obj = fgVar.h(this);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                tp6 tp6Var = la1Var.g;
                ea1 ea1Var = new ea1((List) obj);
                tp6Var.getClass();
                tp6Var.m(null, ea1Var);
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                xe1 xe1Var = xk1.a;
                ka1 ka1Var = new ka1(this.Z, this.d0, this.e0, null, 0);
                this.Y = 1;
                if (hv.d0(xe1Var, ka1Var, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
        }
    }
}
