package defpackage;

import android.database.SQLException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vw0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vw0 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;

    public /* synthetic */ vw0(xw0 xw0Var, boolean z) {
        this.A = 0;
        this.L = xw0Var;
        this.B = z;
    }

    @Override // defpackage.ki2
    public final Object c() {
        String str;
        h24 i;
        int i2 = this.A;
        boolean z = true;
        o27 o27Var = o27.a;
        Object obj = this.L;
        boolean z2 = this.B;
        switch (i2) {
            case 0:
                xw0 xw0Var = (xw0) obj;
                if (z2) {
                    str = "reader";
                } else {
                    str = "writer";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                xw0Var.B.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                xw0Var.A.d(sb);
                try {
                    yf2.T(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    int i3 = xw0Var.Z;
                    if (i3 != 1) {
                        if (i3 == 2) {
                            e.printStackTrace();
                        }
                        return o27Var;
                    }
                    throw e;
                }
            case 1:
                ki2 ki2Var = (ki2) obj;
                if (z2) {
                    ki2Var.c();
                }
                return o27Var;
            case 2:
                yh yhVar = (yh) obj;
                if (z2 && (i = yhVar.i()) != null) {
                    ((c46) i).p(o27Var);
                }
                return o27Var;
            default:
                ex4 ex4Var = (ex4) obj;
                if (!z2 && ex4Var.e.h() <= 0.5f) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ vw0(boolean z, Object obj, int i) {
        this.A = i;
        this.B = z;
        this.L = obj;
    }
}
