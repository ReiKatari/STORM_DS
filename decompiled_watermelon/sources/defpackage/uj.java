package defpackage;

import android.content.SharedPreferences;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uj  reason: default package */
/* loaded from: classes.dex */
public final class uj extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public b34 Y;
    public vj Z;
    public String c0;
    public String d0;
    public int e0;
    public final /* synthetic */ vj f0;
    public final /* synthetic */ String g0;
    public final /* synthetic */ String h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uj(vj vjVar, String str, String str2, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.f0 = vjVar;
        this.g0 = str;
        this.h0 = str2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((uj) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((uj) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new uj(this.f0, this.g0, this.h0, j11Var, 0);
            default:
                return new uj(this.f0, this.g0, this.h0, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        b34 b34Var;
        b34 b34Var2;
        int i = this.X;
        String str = this.h0;
        String str2 = this.g0;
        vj vjVar = this.f0;
        boolean z = true;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.e0;
                if (i2 != 0) {
                    if (i2 == 1) {
                        str = this.d0;
                        str2 = this.c0;
                        vjVar = this.Z;
                        b34Var = this.Y;
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    b34 b34Var3 = vjVar.b;
                    this.Y = b34Var3;
                    this.Z = vjVar;
                    this.c0 = str2;
                    this.d0 = str;
                    this.e0 = 1;
                    if (b34Var3.i(this) == p31Var) {
                        return p31Var;
                    }
                    b34Var = b34Var3;
                }
                try {
                    SharedPreferences sharedPreferences = vjVar.a;
                    String string = sharedPreferences.getString("ra_username", null);
                    String string2 = sharedPreferences.getString("ra_token", null);
                    if (b53.x(string, str2) && b53.x(string2, str)) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.remove("ra_username");
                        edit.remove("ra_token");
                        edit.apply();
                        Boolean valueOf = Boolean.valueOf(z);
                        b34Var2.d(null);
                        return valueOf;
                    }
                    z = false;
                    Boolean valueOf2 = Boolean.valueOf(z);
                    b34Var2.d(null);
                    return valueOf2;
                } finally {
                }
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.e0;
                if (i3 != 0) {
                    if (i3 == 1) {
                        str = this.d0;
                        str2 = this.c0;
                        vjVar = this.Z;
                        b34Var2 = this.Y;
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    b34 b34Var4 = vjVar.b;
                    this.Y = b34Var4;
                    this.Z = vjVar;
                    this.c0 = str2;
                    this.d0 = str;
                    this.e0 = 1;
                    if (b34Var4.i(this) == p31Var2) {
                        return p31Var2;
                    }
                    b34Var2 = b34Var4;
                }
                try {
                    SharedPreferences sharedPreferences2 = vjVar.a;
                    String string3 = sharedPreferences2.getString("ra_username", null);
                    String string4 = sharedPreferences2.getString("ra_token", null);
                    if (b53.x(string3, str2) && b53.x(string4, str)) {
                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                        edit2.remove("ra_token");
                        edit2.apply();
                        Boolean valueOf3 = Boolean.valueOf(z);
                        b34Var2.d(null);
                        return valueOf3;
                    }
                    z = false;
                    Boolean valueOf32 = Boolean.valueOf(z);
                    b34Var2.d(null);
                    return valueOf32;
                } finally {
                }
        }
    }
}
