package defpackage;

import android.content.SharedPreferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gk  reason: default package */
/* loaded from: classes.dex */
public final class gk extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public hb4 Y;
    public hk Z;
    public String d0;
    public String e0;
    public int f0;
    public final /* synthetic */ hk g0;
    public final /* synthetic */ String h0;
    public final /* synthetic */ String i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk(hk hkVar, String str, String str2, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.g0 = hkVar;
        this.h0 = str;
        this.i0 = str2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((gk) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((gk) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new gk(this.g0, this.h0, this.i0, r41Var, 0);
            default:
                return new gk(this.g0, this.h0, this.i0, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        hb4 hb4Var;
        hb4 hb4Var2;
        int i = this.X;
        String str = this.i0;
        String str2 = this.h0;
        hk hkVar = this.g0;
        boolean z = true;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.f0;
                if (i2 != 0) {
                    if (i2 == 1) {
                        str = this.e0;
                        str2 = this.d0;
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
                    this.d0 = str2;
                    this.e0 = str;
                    this.f0 = 1;
                    if (hb4Var3.e(this) == x61Var) {
                        return x61Var;
                    }
                    hb4Var = hb4Var3;
                }
                try {
                    SharedPreferences sharedPreferences = hkVar.a;
                    String string = sharedPreferences.getString("ra_username", null);
                    String string2 = sharedPreferences.getString("ra_token", null);
                    if (nb3.k(string, str2) && nb3.k(string2, str)) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.remove("ra_username");
                        edit.remove("ra_token");
                        edit.apply();
                        Boolean valueOf = Boolean.valueOf(z);
                        hb4Var2.h(null);
                        return valueOf;
                    }
                    z = false;
                    Boolean valueOf2 = Boolean.valueOf(z);
                    hb4Var2.h(null);
                    return valueOf2;
                } finally {
                }
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.f0;
                if (i3 != 0) {
                    if (i3 == 1) {
                        str = this.e0;
                        str2 = this.d0;
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
                    this.d0 = str2;
                    this.e0 = str;
                    this.f0 = 1;
                    if (hb4Var4.e(this) == x61Var2) {
                        return x61Var2;
                    }
                    hb4Var2 = hb4Var4;
                }
                try {
                    SharedPreferences sharedPreferences2 = hkVar.a;
                    String string3 = sharedPreferences2.getString("ra_username", null);
                    String string4 = sharedPreferences2.getString("ra_token", null);
                    if (nb3.k(string3, str2) && nb3.k(string4, str)) {
                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                        edit2.remove("ra_token");
                        edit2.apply();
                        Boolean valueOf3 = Boolean.valueOf(z);
                        hb4Var2.h(null);
                        return valueOf3;
                    }
                    z = false;
                    Boolean valueOf32 = Boolean.valueOf(z);
                    hb4Var2.h(null);
                    return valueOf32;
                } finally {
                }
        }
    }
}
