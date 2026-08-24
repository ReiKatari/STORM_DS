package defpackage;

import android.content.SharedPreferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fk  reason: default package */
/* loaded from: classes.dex */
public final class fk extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public hb4 Y;
    public hk Z;
    public int d0;
    public final /* synthetic */ hk e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk(hk hkVar, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.e0 = hkVar;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((fk) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((fk) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        hk hkVar = this.e0;
        switch (i) {
            case 0:
                return new fk(hkVar, r41Var, 0);
            default:
                return new fk(hkVar, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        hb4 hb4Var;
        hb4 hb4Var2;
        int i = this.X;
        hk hkVar = this.e0;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.d0;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hkVar = this.Z;
                        hb4Var = this.Y;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    hb4 hb4Var3 = hkVar.b;
                    this.Y = hb4Var3;
                    this.Z = hkVar;
                    this.d0 = 1;
                    if (hb4Var3.e(this) == x61Var) {
                        return x61Var;
                    }
                    hb4Var = hb4Var3;
                }
                try {
                    SharedPreferences.Editor edit = hkVar.a.edit();
                    edit.remove("ra_username");
                    edit.remove("ra_token");
                    edit.apply();
                    hb4Var.h(null);
                    return jg7.a;
                } finally {
                    hb4Var.h(null);
                }
            default:
                Object obj2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.d0;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            hkVar = this.Z;
                            hb4Var2 = this.Y;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        hb4 hb4Var4 = hkVar.b;
                        this.Y = hb4Var4;
                        this.Z = hkVar;
                        this.d0 = 1;
                        if (hb4Var4.e(this) != obj2) {
                            hb4Var2 = hb4Var4;
                        }
                        return obj2;
                    }
                    String string = hkVar.a.getString("ra_username", null);
                    if (string == null) {
                        obj2 = null;
                    } else {
                        String string2 = hkVar.a.getString("ra_token", null);
                        if (string2 == null) {
                            obj2 = new ib5(string);
                        } else {
                            obj2 = new hb5(string, string2);
                        }
                    }
                    return obj2;
                } finally {
                }
        }
    }
}
