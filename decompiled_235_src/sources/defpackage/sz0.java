package defpackage;

import android.database.SQLException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sz0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sz0 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;

    public /* synthetic */ sz0(uz0 uz0Var, boolean z) {
        this.A = 0;
        this.L = uz0Var;
        this.B = z;
    }

    @Override // defpackage.on2
    public final Object c() {
        String str;
        na4 i;
        int i2 = this.A;
        boolean z = true;
        jg7 jg7Var = jg7.a;
        Object obj = this.L;
        boolean z2 = this.B;
        switch (i2) {
            case 0:
                uz0 uz0Var = (uz0) obj;
                if (z2) {
                    str = "reader";
                } else {
                    str = "writer";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                uz0Var.B.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                uz0Var.A.d(sb);
                try {
                    ii2.T(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    int i3 = uz0Var.Z;
                    if (i3 != 1) {
                        if (i3 == 2) {
                            e.printStackTrace();
                        }
                        return jg7Var;
                    }
                    throw e;
                }
            case 1:
                on2 on2Var = (on2) obj;
                if (z2) {
                    on2Var.c();
                }
                return jg7Var;
            case 2:
                ki kiVar = (ki) obj;
                if (z2 && (i = kiVar.i()) != null) {
                    ((of6) i).k(jg7Var);
                }
                return jg7Var;
            default:
                n65 n65Var = (n65) obj;
                if (!z2 && n65Var.e.h() <= 0.5f) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ sz0(boolean z, Object obj, int i) {
        this.A = i;
        this.B = z;
        this.L = obj;
    }
}
