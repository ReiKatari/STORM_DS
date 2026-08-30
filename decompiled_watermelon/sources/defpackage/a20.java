package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a20  reason: default package */
/* loaded from: classes.dex */
public final class a20 extends l00 {
    public final /* synthetic */ int b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a20(vy0 vy0Var, int i) {
        super(vy0Var);
        this.b = i;
        vy0Var.getClass();
        switch (i) {
            case 4:
                super(vy0Var);
                this.c = 9;
                return;
            default:
                this.c = 6;
                return;
        }
    }

    @Override // defpackage.fy0
    public final boolean a(xh7 xh7Var) {
        int i = this.b;
        xh7Var.getClass();
        switch (i) {
            case 0:
                return xh7Var.j.c;
            case 1:
                return xh7Var.j.e;
            case 2:
                if (xh7Var.j.a != v64.CONNECTED) {
                    return false;
                }
                return true;
            case 3:
                if (xh7Var.j.a != v64.UNMETERED) {
                    return false;
                }
                return true;
            default:
                return xh7Var.j.f;
        }
    }

    @Override // defpackage.l00
    public final int d() {
        switch (this.b) {
            case 0:
                return this.c;
            case 1:
                return this.c;
            case 2:
                return this.c;
            case 3:
                return this.c;
            default:
                return this.c;
        }
    }

    @Override // defpackage.l00
    public final boolean e(Object obj) {
        boolean booleanValue;
        switch (this.b) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                r64 r64Var = (r64) obj;
                r64Var.getClass();
                if (!r64Var.e && r64Var.a && (Build.VERSION.SDK_INT < 26 || r64Var.b)) {
                    return false;
                }
                return true;
            case 3:
                r64 r64Var2 = (r64) obj;
                r64Var2.getClass();
                if (r64Var2.a && !r64Var2.c && !r64Var2.e) {
                    return false;
                }
                return true;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a20(b20 b20Var) {
        super(b20Var);
        this.b = 1;
        b20Var.getClass();
        this.c = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a20(t64 t64Var, int i) {
        super(t64Var);
        this.b = i;
        t64Var.getClass();
        switch (i) {
            case 3:
                super(t64Var);
                this.c = 7;
                return;
            default:
                this.c = 7;
                return;
        }
    }
}
