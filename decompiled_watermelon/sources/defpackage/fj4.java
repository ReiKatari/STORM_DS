package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fj4  reason: default package */
/* loaded from: classes.dex */
public final class fj4 extends cg2 {
    public final /* synthetic */ int g;
    public final String h;
    public final y60 i;
    public final boolean j;

    public fj4(String str, int i, boolean z) {
        this.g = i;
        switch (i) {
            case 1:
                y60 y60Var = y60.B;
                Objects.requireNonNull(str, "name == null");
                this.h = str;
                this.i = y60Var;
                this.j = z;
                return;
            case 2:
                y60 y60Var2 = y60.B;
                Objects.requireNonNull(str, "name == null");
                this.h = str;
                this.i = y60Var2;
                this.j = z;
                return;
            default:
                y60 y60Var3 = y60.B;
                Objects.requireNonNull(str, "name == null");
                this.h = str;
                this.i = y60Var3;
                this.j = z;
                return;
        }
    }

    @Override // defpackage.cg2
    public final void t(wa5 wa5Var, Object obj) {
        int i = this.g;
        boolean z = this.j;
        String str = this.h;
        y60 y60Var = this.i;
        switch (i) {
            case 0:
                if (obj != null) {
                    y60Var.getClass();
                    String obj2 = obj.toString();
                    if (obj2 != null) {
                        wa5Var.a(str, obj2, z);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (obj != null) {
                    y60Var.getClass();
                    String obj3 = obj.toString();
                    if (obj3 != null) {
                        wa5Var.b(str, obj3, z);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (obj != null) {
                    y60Var.getClass();
                    String obj4 = obj.toString();
                    if (obj4 != null) {
                        wa5Var.d(str, obj4, z);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
