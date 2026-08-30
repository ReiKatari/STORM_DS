package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lr5  reason: default package */
/* loaded from: classes.dex */
public final class lr5 extends ct3 {
    public final ci3 o0;
    public int p0 = -1;
    public String q0 = "";
    public final vn1 r0 = u06.a;

    public lr5(Bundle bundle, LinkedHashMap linkedHashMap) {
        this.o0 = new ci3(21, bundle, linkedHashMap);
    }

    @Override // defpackage.ct3
    public final Object S() {
        return Y0();
    }

    @Override // defpackage.ct3, defpackage.b91
    public final b91 T(h06 h06Var) {
        h06Var.getClass();
        if (io2.V(h06Var)) {
            this.q0 = h06Var.e(0);
            this.p0 = 0;
        }
        return this;
    }

    public final Object Y0() {
        Object obj;
        String str = this.q0;
        ci3 ci3Var = this.o0;
        ci3Var.getClass();
        str.getClass();
        z44 z44Var = (z44) ((LinkedHashMap) ci3Var.L).get(str);
        if (z44Var != null) {
            obj = z44Var.a((Bundle) ci3Var.B, str);
        } else {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        c44.h(this.q0, "Unexpected null value for non-nullable argument ");
        return null;
    }

    @Override // defpackage.yu0
    public final vn1 b() {
        return this.r0;
    }

    @Override // defpackage.ct3, defpackage.b91
    public final boolean i() {
        Object obj;
        String str = this.q0;
        ci3 ci3Var = this.o0;
        ci3Var.getClass();
        str.getClass();
        z44 z44Var = (z44) ((LinkedHashMap) ci3Var.L).get(str);
        if (z44Var != null) {
            obj = z44Var.a((Bundle) ci3Var.B, str);
        } else {
            obj = null;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.b91
    public final Object n(m93 m93Var) {
        m93Var.getClass();
        return Y0();
    }

    @Override // defpackage.yu0
    public final int v(h06 h06Var) {
        String e;
        ci3 ci3Var;
        h06Var.getClass();
        int i = this.p0;
        do {
            i++;
            if (i >= h06Var.d()) {
                return -1;
            }
            e = h06Var.e(i);
            ci3Var = this.o0;
            ci3Var.getClass();
            e.getClass();
        } while (!((Bundle) ci3Var.B).containsKey(e));
        this.p0 = i;
        this.q0 = e;
        return i;
    }
}
