package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hs4  reason: default package */
/* loaded from: classes.dex */
public final class hs4 extends uj2 {
    public final /* synthetic */ int h;
    public final String i;
    public final d90 j;
    public final boolean k;

    public hs4(String str, int i, boolean z) {
        this.h = i;
        switch (i) {
            case 1:
                d90 d90Var = d90.B;
                Objects.requireNonNull(str, "name == null");
                this.i = str;
                this.j = d90Var;
                this.k = z;
                return;
            case 2:
                d90 d90Var2 = d90.B;
                Objects.requireNonNull(str, "name == null");
                this.i = str;
                this.j = d90Var2;
                this.k = z;
                return;
            default:
                d90 d90Var3 = d90.B;
                Objects.requireNonNull(str, "name == null");
                this.i = str;
                this.j = d90Var3;
                this.k = z;
                return;
        }
    }

    @Override // defpackage.uj2
    public final void l(ok5 ok5Var, Object obj) {
        int i = this.h;
        boolean z = this.k;
        String str = this.i;
        d90 d90Var = this.j;
        switch (i) {
            case 0:
                if (obj != null) {
                    d90Var.getClass();
                    String obj2 = obj.toString();
                    if (obj2 != null) {
                        ok5Var.a(str, obj2, z);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (obj != null) {
                    d90Var.getClass();
                    String obj3 = obj.toString();
                    if (obj3 != null) {
                        ok5Var.b(str, obj3, z);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (obj != null) {
                    d90Var.getClass();
                    String obj4 = obj.toString();
                    if (obj4 != null) {
                        ok5Var.d(str, obj4, z);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
