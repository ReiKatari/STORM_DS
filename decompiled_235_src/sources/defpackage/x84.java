package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x84  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class x84 implements qn2 {
    public final /* synthetic */ int A;

    public /* synthetic */ x84(int i) {
        this.A = i;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        ContextWrapper contextWrapper;
        int i = this.A;
        boolean z = false;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                yr4 yr4Var = (yr4) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(yr4Var.b);
                sb.append(", ");
                return xg6.q(sb, yr4Var.c, ')');
            case 1:
                j71 j71Var = (j71) obj;
                j71Var.getClass();
                return new tb4(y46.a(j71Var));
            case 2:
                return new k00(y46.a((j71) obj));
            case 3:
                Context context = (Context) obj;
                context.getClass();
                if (!(context instanceof ContextWrapper)) {
                    return null;
                }
                return ((ContextWrapper) context).getBaseContext();
            case 4:
                ic4 ic4Var = (ic4) obj;
                ic4Var.getClass();
                mc4 mc4Var = ic4Var.L;
                if (mc4Var == null || mc4Var.Y.L != ic4Var.B.a) {
                    return null;
                }
                return mc4Var;
            case 5:
                ic4 ic4Var2 = (ic4) obj;
                ic4Var2.getClass();
                mc4 mc4Var2 = ic4Var2.L;
                if (mc4Var2 == null || mc4Var2.Y.L != ic4Var2.B.a) {
                    return null;
                }
                return mc4Var2;
            case 6:
                ic4 ic4Var3 = (ic4) obj;
                ic4Var3.getClass();
                return Integer.valueOf(ic4Var3.B.a);
            case 7:
                ((j71) obj).getClass();
                return new ac4();
            case 8:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    contextWrapper = (ContextWrapper) context2;
                } else {
                    contextWrapper = null;
                }
                if (contextWrapper == null) {
                    return null;
                }
                return contextWrapper.getBaseContext();
            case 9:
                Context context3 = (Context) obj;
                context3.getClass();
                if (!(context3 instanceof Activity)) {
                    return null;
                }
                return (Activity) context3;
            case 10:
                ic4 ic4Var4 = (ic4) obj;
                ic4Var4.getClass();
                return ic4Var4.L;
            case 11:
                ic4 ic4Var5 = (ic4) obj;
                ic4Var5.getClass();
                if (!(ic4Var5 instanceof mc4)) {
                    return null;
                }
                dk0 dk0Var = ((mc4) ic4Var5).Y;
                return dk0Var.l(dk0Var.L);
            case 12:
                ic4 ic4Var6 = ((sb4) ((yn) obj).c()).B;
                ic4Var6.getClass();
                int i2 = ic4.X;
                for (ic4 ic4Var7 : mp2.G((tw0) ic4Var6)) {
                }
                return null;
            case 13:
                yn ynVar = (yn) obj;
                return i52.e(ge7.Y(700, 0, null, 6), 2);
            case 14:
                return ((sb4) obj).Y;
            case 15:
                pj pjVar = ((of4) obj).a;
                if (pjVar != null) {
                    pjVar.c();
                }
                return jg7Var;
            case 16:
                return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Byte) obj).byteValue() & 255)}, 1));
            case 17:
                bj4 bj4Var = (bj4) obj;
                bj4Var.getClass();
                if (bj4Var.a.a == dj4.ACHIEVEMENT_UNLOCK) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                bj4 bj4Var2 = (bj4) obj;
                bj4Var2.getClass();
                if (bj4Var2.a.a == dj4.ACHIEVEMENT_ACK) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                bj4 bj4Var3 = (bj4) obj;
                bj4Var3.getClass();
                return Long.valueOf(bj4Var3.a.l);
            case 20:
                if (((Long) obj).longValue() != 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                ek4 ek4Var = (ek4) obj;
                ek4Var.getClass();
                return Long.valueOf(ek4Var.h);
            case 22:
                if (((Long) obj).longValue() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case ConnectionResult.API_DISABLED /* 23 */:
                gb6 gb6Var = (gb6) obj;
                int i3 = zo4.b;
                return jg7Var;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                xv4 xv4Var = (xv4) obj;
                int i4 = yi.a;
                nq6 nq6Var = kf.b;
                xv4Var.getClass();
                Context context4 = (Context) q60.U(xv4Var, nq6Var);
                qh1 qh1Var = (qh1) q60.U(xv4Var, ky0.h);
                vp4 vp4Var = (vp4) q60.U(xv4Var, wp4.a);
                if (vp4Var == null) {
                    return null;
                }
                return new tg(context4, qh1Var, vp4Var.a, vp4Var.b);
            case 25:
                fh2 fh2Var = (fh2) obj;
                fh2Var.getClass();
                fh2Var.a();
                return jg7Var;
            case SubAllocator.N4 /* 26 */:
                nu4 nu4Var = (nu4) obj;
                nu4Var.getClass();
                return nu4Var.toString();
            case 27:
                fh2 fh2Var2 = (fh2) obj;
                fh2Var2.getClass();
                fh2Var2.a();
                return jg7Var;
            case 28:
                fh2 fh2Var3 = (fh2) obj;
                fh2Var3.getClass();
                fh2Var3.a();
                return jg7Var;
            default:
                fh2 fh2Var4 = (fh2) obj;
                fh2Var4.getClass();
                fh2Var4.a();
                return jg7Var;
        }
    }
}
