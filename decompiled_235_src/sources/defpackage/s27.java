package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s27  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s27 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ s27(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.R;
        Object obj3 = this.L;
        Object obj4 = this.B;
        switch (i) {
            case 0:
                final p27 p27Var = (p27) obj4;
                w61 w61Var = (w61) obj3;
                Context context = (Context) obj2;
                j07 j07Var = (j07) obj;
                ca4 ca4Var = j07Var.a;
                ca4 ca4Var2 = j07Var.a;
                w07 w07Var = w07.b;
                ca4Var.a(w07Var);
                t07 t07Var = t07.Cut;
                if (!k47.c(p27Var.n().b) && p27Var.j() && !(p27Var.f instanceof jt4) && p27Var.h != null) {
                    z = true;
                } else {
                    z = false;
                }
                yu6 yu6Var = new yu6(2, w61Var, new k27(p27Var, null, 1));
                Resources resources = context.getResources();
                qk4 qk4Var = new qk4(23, yu6Var, (Object) null);
                if (z) {
                    ca4Var2.a(new s07(t07Var.getKey(), resources.getString(t07Var.m9getStringId9Hzcbyc()), t07Var.m8getDrawableId3I4p1mQ(), qk4Var));
                }
                t07 t07Var2 = t07.Copy;
                if (!k47.c(p27Var.n().b) && !(p27Var.f instanceof jt4) && p27Var.h != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                yu6 yu6Var2 = new yu6(2, w61Var, new k27(p27Var, null, 2));
                Resources resources2 = context.getResources();
                qk4 qk4Var2 = new qk4(23, yu6Var2, (Object) null);
                if (z2) {
                    ca4Var2.a(new s07(t07Var2.getKey(), resources2.getString(t07Var2.m9getStringId9Hzcbyc()), t07Var2.m8getDrawableId3I4p1mQ(), qk4Var2));
                }
                t07 t07Var3 = t07.Paste;
                if (p27Var.j() && ((Boolean) p27Var.x.getValue()).booleanValue() && p27Var.h != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                yu6 yu6Var3 = new yu6(2, w61Var, new k27(p27Var, null, 3));
                Resources resources3 = context.getResources();
                qk4 qk4Var3 = new qk4(23, yu6Var3, (Object) null);
                if (z3) {
                    ca4Var2.a(new s07(t07Var3.getKey(), resources3.getString(t07Var3.m9getStringId9Hzcbyc()), t07Var3.m8getDrawableId3I4p1mQ(), qk4Var3));
                }
                t07 t07Var4 = t07.SelectAll;
                if (k47.d(p27Var.n().b) != p27Var.n().a.B.length()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                on2 on2Var = new on2() { // from class: u27
                    @Override // defpackage.on2
                    public final Object c() {
                        int i2 = r2;
                        jg7 jg7Var2 = jg7.a;
                        p27 p27Var2 = p27Var;
                        switch (i2) {
                            case 0:
                                return Boolean.valueOf(!p27Var2.B);
                            case 1:
                                c37 e = p27.e(p27Var2.n().a, jx2.f(0, p27Var2.n().a.B.length()));
                                p27Var2.c.g(e);
                                long j = e.b;
                                p27Var2.w = new k47(j);
                                p27Var2.u = c37.a(p27Var2.u, null, j, 5);
                                p27Var2.h(true);
                                return jg7Var2;
                            default:
                                on2 on2Var2 = p27Var2.g;
                                if (on2Var2 != null) {
                                    on2Var2.c();
                                }
                                return jg7Var2;
                        }
                    }
                };
                on2 on2Var2 = new on2() { // from class: u27
                    @Override // defpackage.on2
                    public final Object c() {
                        int i2 = r2;
                        jg7 jg7Var2 = jg7.a;
                        p27 p27Var2 = p27Var;
                        switch (i2) {
                            case 0:
                                return Boolean.valueOf(!p27Var2.B);
                            case 1:
                                c37 e = p27.e(p27Var2.n().a, jx2.f(0, p27Var2.n().a.B.length()));
                                p27Var2.c.g(e);
                                long j = e.b;
                                p27Var2.w = new k47(j);
                                p27Var2.u = c37.a(p27Var2.u, null, j, 5);
                                p27Var2.h(true);
                                return jg7Var2;
                            default:
                                on2 on2Var22 = p27Var2.g;
                                if (on2Var22 != null) {
                                    on2Var22.c();
                                }
                                return jg7Var2;
                        }
                    }
                };
                Resources resources4 = context.getResources();
                qk4 qk4Var4 = new qk4(23, on2Var2, on2Var);
                if (z4) {
                    ca4Var2.a(new s07(t07Var4.getKey(), resources4.getString(t07Var4.m9getStringId9Hzcbyc()), t07Var4.m8getDrawableId3I4p1mQ(), qk4Var4));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    t07 t07Var5 = t07.Autofill;
                    if (p27Var.j() && k47.c(p27Var.n().b)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    on2 on2Var3 = new on2() { // from class: u27
                        @Override // defpackage.on2
                        public final Object c() {
                            int i2 = r2;
                            jg7 jg7Var2 = jg7.a;
                            p27 p27Var2 = p27Var;
                            switch (i2) {
                                case 0:
                                    return Boolean.valueOf(!p27Var2.B);
                                case 1:
                                    c37 e = p27.e(p27Var2.n().a, jx2.f(0, p27Var2.n().a.B.length()));
                                    p27Var2.c.g(e);
                                    long j = e.b;
                                    p27Var2.w = new k47(j);
                                    p27Var2.u = c37.a(p27Var2.u, null, j, 5);
                                    p27Var2.h(true);
                                    return jg7Var2;
                                default:
                                    on2 on2Var22 = p27Var2.g;
                                    if (on2Var22 != null) {
                                        on2Var22.c();
                                    }
                                    return jg7Var2;
                            }
                        }
                    };
                    Resources resources5 = context.getResources();
                    qk4 qk4Var5 = new qk4(23, on2Var3, (Object) null);
                    if (z5) {
                        ca4Var2.a(new s07(t07Var5.getKey(), resources5.getString(t07Var5.m9getStringId9Hzcbyc()), t07Var5.m8getDrawableId3I4p1mQ(), qk4Var5));
                    }
                }
                ca4Var2.a(w07Var);
                return jg7Var;
            case 1:
                j37 j37Var = (j37) obj4;
                c37 c37Var = (c37) obj;
                c37Var.getClass();
                j37Var.getClass();
                j37Var.b.setValue(c37Var);
                ((qa4) obj2).setValue(Boolean.valueOf(!((Boolean) ((qn2) obj3).g(c37Var.a.B)).booleanValue()));
                return jg7Var;
            case 2:
                eo2 eo2Var = (eo2) obj4;
                qa4 qa4Var = (qa4) obj2;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ((qa4) obj3).setValue(bool);
                eo2Var.o("translator_tts_enabled", bool);
                if (!booleanValue && ((Boolean) qa4Var.getValue()).booleanValue()) {
                    Boolean bool2 = Boolean.FALSE;
                    qa4Var.setValue(bool2);
                    eo2Var.o("translator_local_voice_actor_studio", bool2);
                }
                return jg7Var;
            default:
                sr4 sr4Var = (sr4) obj4;
                sr4 sr4Var2 = (sr4) obj3;
                sr4 sr4Var3 = (sr4) obj2;
                hw hwVar = (hw) obj;
                if (hwVar instanceof fw) {
                    if (sr4Var != null) {
                        return new fw(sr4Var);
                    }
                    return (fw) hwVar;
                } else if (hwVar instanceof ew) {
                    ew ewVar = (ew) hwVar;
                    b62 b62Var = ewVar.b;
                    if (b62Var.c instanceof eh4) {
                        if (sr4Var2 != null) {
                            return new ew(sr4Var2, b62Var);
                        }
                        return ewVar;
                    } else if (sr4Var3 != null) {
                        return new ew(sr4Var3, b62Var);
                    } else {
                        return ewVar;
                    }
                } else {
                    return hwVar;
                }
        }
    }
}
