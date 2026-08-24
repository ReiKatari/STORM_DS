package defpackage;

import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oe4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class oe4 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ qa4 B;

    public /* synthetic */ oe4(qa4 qa4Var, int i) {
        this.A = i;
        this.B = qa4Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        qa4 qa4Var = this.B;
        switch (i) {
            case 0:
                qa4Var.setValue(0);
                return jg7Var;
            case 1:
                qa4Var.setValue(1);
                return jg7Var;
            case 2:
                qa4Var.setValue(null);
                return jg7Var;
            case 3:
                jk3 jk3Var = (jk3) qa4Var.getValue();
                if (jk3Var != null) {
                    return jk3Var;
                }
                s53.d("Required value was null.");
                e41.c();
                return null;
            case 4:
                qa4Var.setValue(Boolean.FALSE);
                return jg7Var;
            case 5:
                ak7.E(qa4Var, true);
                return jg7Var;
            case 6:
                qa4Var.setValue(Boolean.valueOf(!((Boolean) qa4Var.getValue()).booleanValue()));
                return jg7Var;
            case 7:
                qa4Var.setValue(Boolean.FALSE);
                return jg7Var;
            case 8:
                qa4Var.setValue(Boolean.FALSE);
                return jg7Var;
            case 9:
                qa4Var.setValue(Boolean.TRUE);
                return jg7Var;
            case 10:
                qa4Var.setValue(Boolean.TRUE);
                return jg7Var;
            case 11:
                qa4Var.setValue(Boolean.FALSE);
                return jg7Var;
            case 12:
                qa4Var.setValue(Boolean.TRUE);
                return jg7Var;
            case 13:
                qa4Var.setValue(Boolean.TRUE);
                return jg7Var;
            case 14:
                qa4Var.setValue(Boolean.FALSE);
                return jg7Var;
            case 15:
                qa4Var.setValue(null);
                return jg7Var;
            case 16:
                qa4Var.setValue(null);
                return jg7Var;
            case 17:
                qa4Var.setValue(Boolean.TRUE);
                return jg7Var;
            case 18:
                qa4Var.setValue(Boolean.FALSE);
                return jg7Var;
            case 19:
                qa4Var.setValue(null);
                return jg7Var;
            case 20:
                qa4Var.setValue(Boolean.TRUE);
                return jg7Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                qa4Var.setValue(Boolean.FALSE);
                return jg7Var;
            case 22:
                qa4Var.setValue(null);
                return jg7Var;
            case ConnectionResult.API_DISABLED /* 23 */:
                qa4Var.setValue(null);
                return jg7Var;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                qa4Var.setValue(Boolean.FALSE);
                return jg7Var;
            case 25:
                qa4Var.setValue(Boolean.TRUE);
                return jg7Var;
            case SubAllocator.N4 /* 26 */:
                qa4Var.setValue(Boolean.FALSE);
                return jg7Var;
            case 27:
                qa4Var.setValue(Boolean.FALSE);
                return jg7Var;
            case 28:
                qa4Var.setValue(Boolean.FALSE);
                return jg7Var;
            default:
                qa4Var.setValue(Boolean.TRUE);
                return jg7Var;
        }
    }
}
