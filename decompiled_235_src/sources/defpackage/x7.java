package defpackage;

import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class x7 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ on2 B;

    public /* synthetic */ x7(int i, on2 on2Var) {
        this.A = i;
        this.B = on2Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        on2 on2Var = this.B;
        switch (i) {
            case 0:
                on2Var.c();
                return jg7Var;
            case 1:
                on2Var.c();
                return jg7Var;
            case 2:
                on2Var.c();
                return jg7Var;
            case 3:
                on2Var.c();
                return jg7Var;
            case 4:
                on2Var.c();
                return jg7Var;
            case 5:
                on2Var.c();
                return jg7Var;
            case 6:
                on2Var.c();
                return jg7Var;
            case 7:
                on2Var.c();
                return jg7Var;
            case 8:
                on2Var.c();
                return jg7Var;
            case 9:
                on2Var.c();
                return jg7Var;
            case 10:
                try {
                    return (List) on2Var.c();
                } catch (SSLPeerUnverifiedException unused) {
                    return yt1.A;
                }
            case 11:
                on2Var.c();
                return jg7Var;
            case 12:
                on2Var.c();
                return jg7Var;
            case 13:
                on2Var.c();
                return jg7Var;
            case 14:
                on2Var.c();
                return jg7Var;
            case 15:
                on2Var.c();
                return jg7Var;
            case 16:
                on2Var.c();
                return jg7Var;
            case 17:
                on2Var.c();
                return jg7Var;
            case 18:
                on2Var.c();
                return jg7Var;
            case 19:
                on2Var.c();
                return jg7Var;
            case 20:
                return (Handler) on2Var.c();
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                on2Var.c();
                return jg7Var;
            case 22:
                on2Var.c();
                return jg7Var;
            case ConnectionResult.API_DISABLED /* 23 */:
                on2Var.c();
                return jg7Var;
            default:
                on2Var.c();
                return jg7Var;
        }
    }
}
