package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yd  reason: default package */
/* loaded from: classes.dex */
public final class yd extends ic3 implements mi2 {
    public final /* synthetic */ int B;
    public static final yd L = new yd(1, 0);
    public static final yd R = new yd(1, 1);
    public static final yd X = new yd(1, 2);
    public static final yd Y = new yd(1, 3);
    public static final yd Z = new yd(1, 4);
    public static final yd c0 = new yd(1, 5);
    public static final yd d0 = new yd(1, 6);
    public static final yd e0 = new yd(1, 7);
    public static final yd f0 = new yd(1, 8);
    public static final yd g0 = new yd(1, 9);
    public static final yd h0 = new yd(1, 10);
    public static final yd i0 = new yd(1, 11);
    public static final yd j0 = new yd(1, 12);
    public static final yd k0 = new yd(1, 13);
    public static final yd l0 = new yd(1, 14);
    public static final yd m0 = new yd(1, 15);
    public static final yd n0 = new yd(1, 16);
    public static final yd o0 = new yd(1, 17);
    public static final yd p0 = new yd(1, 18);
    public static final yd q0 = new yd(1, 19);
    public static final yd r0 = new yd(1, 20);
    public static final yd s0 = new yd(1, 21);
    public static final yd t0 = new yd(1, 22);
    public static final yd u0 = new yd(1, 23);
    public static final yd v0 = new yd(1, 24);
    public static final yd w0 = new yd(1, 25);
    public static final yd x0 = new yd(1, 26);
    public static final yd y0 = new yd(1, 27);
    public static final yd z0 = new yd(1, 28);
    public static final yd A0 = new yd(1, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd(int i, int i2) {
        super(i);
        this.B = i2;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.B;
        vf3 vf3Var = null;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                ed2 ed2Var = (ed2) obj;
                return Boolean.TRUE;
            case 1:
                ez5 k = ((iz5) obj).k();
                return Boolean.valueOf(k.A.c(mz5.B));
            case 2:
                sm4 sm4Var = (sm4) obj;
                tv0 tv0Var = ue.a;
                sm4Var.getClass();
                l.L(sm4Var, tv0Var);
                return ((Context) l.L(sm4Var, ue.b)).getResources();
            case 3:
                ez5 k2 = ((iz5) obj).k();
                return Boolean.valueOf(k2.A.c(mz5.B));
            case 4:
                l93[] l93VarArr = pz5.a;
                ((rz5) obj).b(mz5.y, o27Var);
                return o27Var;
            case 5:
                ((Number) obj).longValue();
                return o27Var;
            case ig7.b /* 6 */:
                xn4 xn4Var = (xn4) obj;
                return o27Var;
            case 7:
                l93[] l93VarArr2 = pz5.a;
                ((rz5) obj).b(mz5.x, o27Var);
                return o27Var;
            case 8:
                xn4 xn4Var2 = (xn4) obj;
                return o27Var;
            case 9:
                return obj;
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 11:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case mj2.L /* 12 */:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 13:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return bool4;
            case 14:
                long a = xq0.a(((xq0) obj).a, dr0.x);
                return new no(xq0.d(a), xq0.h(a), xq0.g(a), xq0.e(a));
            case ig7.e /* 15 */:
                ((Number) obj).longValue();
                return o27Var;
            case 16:
                nu0 nu0Var = (nu0) obj;
                if (nu0Var instanceof vf3) {
                    vf3Var = (vf3) nu0Var;
                }
                if (vf3Var != null && vf3Var.J0) {
                    mz2.c("Apply is called on deactivated node " + nu0Var);
                }
                return o27Var;
            case 17:
                return Boolean.valueOf(!(((xy3) obj) instanceof ru0));
            case 18:
                return obj;
            case 19:
                float[] fArr = ((kv3) obj).a;
                return o27Var;
            case 20:
                float[] fArr2 = ((kv3) obj).a;
                return o27Var;
            case 21:
                return Boolean.valueOf(f34.t(obj));
            case 22:
                long j = ((sw6) obj).a;
                return new lo(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            case 23:
                lo loVar = (lo) obj;
                return new sw6(ep2.g(loVar.a, loVar.b));
            case 24:
                ex6 ex6Var = (ex6) obj;
                return ct3.P0(RecyclerView.A1, RecyclerView.A1, null, 7);
            case 25:
                ((Number) obj).intValue();
                return 0;
            case 26:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 27:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 28:
                ex6 ex6Var2 = (ex6) obj;
                return t02.c;
            default:
                dh0 dh0Var = (dh0) obj;
                return o27Var;
        }
    }
}
