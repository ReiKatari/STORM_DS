package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ne  reason: default package */
/* loaded from: classes.dex */
public final class ne extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public static final ne L = new ne(1, 0);
    public static final ne R = new ne(1, 1);
    public static final ne X = new ne(1, 2);
    public static final ne Y = new ne(1, 3);
    public static final ne Z = new ne(1, 4);
    public static final ne d0 = new ne(1, 5);
    public static final ne e0 = new ne(1, 6);
    public static final ne f0 = new ne(1, 7);
    public static final ne g0 = new ne(1, 8);
    public static final ne h0 = new ne(1, 9);
    public static final ne i0 = new ne(1, 10);
    public static final ne j0 = new ne(1, 11);
    public static final ne k0 = new ne(1, 12);
    public static final ne l0 = new ne(1, 13);
    public static final ne m0 = new ne(1, 14);
    public static final ne n0 = new ne(1, 15);
    public static final ne o0 = new ne(1, 16);
    public static final ne p0 = new ne(1, 17);
    public static final ne q0 = new ne(1, 18);
    public static final ne r0 = new ne(1, 19);
    public static final ne s0 = new ne(1, 20);
    public static final ne t0 = new ne(1, 21);
    public static final ne u0 = new ne(1, 22);
    public static final ne v0 = new ne(1, 23);
    public static final ne w0 = new ne(1, 24);
    public static final ne x0 = new ne(1, 25);
    public static final ne y0 = new ne(1, 26);
    public static final ne z0 = new ne(1, 27);
    public static final ne A0 = new ne(1, 28);
    public static final ne B0 = new ne(1, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne(int i, int i2) {
        super(i);
        this.B = i2;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.B;
        sm3 sm3Var = null;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                vh2 vh2Var = (vh2) obj;
                return Boolean.TRUE;
            case 1:
                ta6 k = ((xa6) obj).k();
                return Boolean.valueOf(k.A.c(bb6.B));
            case 2:
                xv4 xv4Var = (xv4) obj;
                py0 py0Var = kf.a;
                xv4Var.getClass();
                q60.U(xv4Var, py0Var);
                return ((Context) q60.U(xv4Var, kf.b)).getResources();
            case 3:
                ta6 k2 = ((xa6) obj).k();
                return Boolean.valueOf(k2.A.c(bb6.B));
            case 4:
                fg3[] fg3VarArr = eb6.a;
                ((gb6) obj).a(bb6.y, jg7Var);
                return jg7Var;
            case 5:
                ((Number) obj).longValue();
                return jg7Var;
            case 6:
                cx4 cx4Var = (cx4) obj;
                return jg7Var;
            case 7:
                fg3[] fg3VarArr2 = eb6.a;
                ((gb6) obj).a(bb6.x, jg7Var);
                return jg7Var;
            case 8:
                cx4 cx4Var2 = (cx4) obj;
                return jg7Var;
            case 9:
                yn ynVar = (yn) obj;
                return f04.U(i52.d(ge7.Y(220, 90, null, 4), 2).a(new o52(new ha7((i92) null, (pj6) null, (sl0) null, new z56(i97.b, ge7.Y(220, 90, null, 4)), (LinkedHashMap) null, 119))), i52.e(ge7.Y(90, 0, null, 6), 2));
            case 10:
                return obj;
            case 11:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 12:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 13:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 14:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return bool4;
            case 15:
                long b = kt0.b(((kt0) obj).a, qt0.x);
                return new zo(kt0.e(b), kt0.i(b), kt0.h(b), kt0.f(b));
            case 16:
                ((Number) obj).longValue();
                return jg7Var;
            case 17:
                jx0 jx0Var = (jx0) obj;
                if (jx0Var instanceof sm3) {
                    sm3Var = (sm3) jx0Var;
                }
                if (sm3Var != null && sm3Var.K0) {
                    p53.c("Apply is called on deactivated node " + jx0Var);
                }
                return jg7Var;
            case 18:
                return Boolean.valueOf(!(((y64) obj) instanceof nx0));
            case 19:
                return obj;
            case 20:
                float[] fArr = ((v24) obj).a;
                return jg7Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                float[] fArr2 = ((v24) obj).a;
                return jg7Var;
            case 22:
                return Boolean.valueOf(hf.B(obj));
            case ConnectionResult.API_DISABLED /* 23 */:
                long j = ((i97) obj).a;
                return new xo(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                xo xoVar = (xo) obj;
                return new i97(jx2.g(xoVar.a, xoVar.b));
            case 25:
                aa7 aa7Var = (aa7) obj;
                return ge7.U(RecyclerView.B1, RecyclerView.B1, null, 7);
            case SubAllocator.N4 /* 26 */:
                ((Number) obj).intValue();
                return 0;
            case 27:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 28:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            default:
                aa7 aa7Var2 = (aa7) obj;
                return i52.c;
        }
    }
}
