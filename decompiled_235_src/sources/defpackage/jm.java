package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jm implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ Object L;

    public /* synthetic */ jm(Object obj, long j, int i) {
        this.A = i;
        this.L = obj;
        this.B = j;
    }

    @Override // defpackage.on2
    public final Object c() {
        xs7 xs7Var;
        int i;
        switch (this.A) {
            case 0:
                return ((xd6) ((f80) this.L)).b(this.B);
            default:
                af5 af5Var = (af5) this.L;
                long j = this.B;
                synchronized (af5Var) {
                    try {
                        if (!af5Var.u && (xs7Var = af5Var.k) != null) {
                            if (af5Var.w) {
                                i = af5Var.v;
                            } else {
                                i = -1;
                            }
                            af5Var.v++;
                            af5Var.w = true;
                            if (i != -1) {
                                StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                                sb.append(af5Var.c);
                                sb.append("ms (after ");
                                af5.c(af5Var, new SocketTimeoutException(lb1.o(sb, i - 1, " successful ping/pongs)")), 2);
                            } else {
                                try {
                                    da0 da0Var = da0.R;
                                    da0Var.getClass();
                                    xs7Var.e(9, da0Var);
                                } catch (IOException e) {
                                    af5.c(af5Var, e, 2);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Long.valueOf(j);
        }
    }
}
