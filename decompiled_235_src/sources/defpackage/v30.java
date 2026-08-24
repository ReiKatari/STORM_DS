package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v30  reason: default package */
/* loaded from: classes.dex */
public final class v30 extends c20 {
    public final /* synthetic */ int b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(a21 a21Var, int i) {
        super(a21Var);
        this.b = i;
        a21Var.getClass();
        switch (i) {
            case 4:
                super(a21Var);
                this.c = 9;
                return;
            default:
                this.c = 6;
                return;
        }
    }

    @Override // defpackage.k11
    public final boolean c(yw7 yw7Var) {
        int i = this.b;
        yw7Var.getClass();
        switch (i) {
            case 0:
                return yw7Var.j.c;
            case 1:
                return yw7Var.j.e;
            case 2:
                if (yw7Var.j.a != kf4.CONNECTED) {
                    return false;
                }
                return true;
            case 3:
                if (yw7Var.j.a != kf4.UNMETERED) {
                    return false;
                }
                return true;
            default:
                return yw7Var.j.f;
        }
    }

    @Override // defpackage.c20
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

    @Override // defpackage.c20
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
                gf4 gf4Var = (gf4) obj;
                gf4Var.getClass();
                if (!gf4Var.e && gf4Var.a && (Build.VERSION.SDK_INT < 26 || gf4Var.b)) {
                    return false;
                }
                return true;
            case 3:
                gf4 gf4Var2 = (gf4) obj;
                gf4Var2.getClass();
                if (gf4Var2.a && !gf4Var2.c && !gf4Var2.e) {
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
    public v30(w30 w30Var) {
        super(w30Var);
        this.b = 1;
        w30Var.getClass();
        this.c = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(if4 if4Var, int i) {
        super(if4Var);
        this.b = i;
        if4Var.getClass();
        switch (i) {
            case 3:
                super(if4Var);
                this.c = 7;
                return;
            default:
                this.c = 7;
                return;
        }
    }
}
