package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hh2  reason: default package */
/* loaded from: classes.dex */
public final class hh2 extends aj3 implements qn2 {
    public static final hh2 L = new hh2(1, 0);
    public static final hh2 R = new hh2(1, 1);
    public static final hh2 X = new hh2(1, 2);
    public static final hh2 Y = new hh2(1, 3);
    public static final hh2 Z = new hh2(1, 4);
    public static final hh2 d0 = new hh2(1, 5);
    public static final hh2 e0 = new hh2(1, 6);
    public static final hh2 f0 = new hh2(1, 7);
    public static final hh2 g0 = new hh2(1, 8);
    public static final hh2 h0 = new hh2(1, 9);
    public static final hh2 i0 = new hh2(1, 10);
    public static final hh2 j0 = new hh2(1, 11);
    public static final hh2 k0 = new hh2(1, 12);
    public static final hh2 l0 = new hh2(1, 13);
    public static final hh2 m0 = new hh2(1, 14);
    public static final hh2 n0 = new hh2(1, 15);
    public static final hh2 o0 = new hh2(1, 16);
    public static final hh2 p0 = new hh2(1, 17);
    public static final hh2 q0 = new hh2(1, 18);
    public static final hh2 r0 = new hh2(1, 19);
    public static final hh2 s0 = new hh2(1, 20);
    public static final hh2 t0 = new hh2(1, 21);
    public static final hh2 u0 = new hh2(1, 22);
    public static final hh2 v0 = new hh2(1, 23);
    public static final hh2 w0 = new hh2(1, 24);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh2(dh5 dh5Var) {
        super(1);
        this.B = 28;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.B;
        boolean z = true;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                mj0 mj0Var = (mj0) obj;
                return jg7Var;
            case 1:
                mj0 mj0Var2 = (mj0) obj;
                return jg7Var;
            case 2:
                no1 no1Var = (no1) obj;
                return jg7Var;
            case 3:
                no1.F((no1) obj, kt0.g, 0L, 0L, RecyclerView.B1, null, 126);
                return jg7Var;
            case 4:
                fx4 fx4Var = (fx4) obj;
                if (fx4Var.r()) {
                    kz3 kz3Var = fx4Var.B;
                    if (!kz3Var.g0) {
                        qn2 c = fx4Var.A.c();
                        ja4 ja4Var = kz3Var.j0;
                        if (c == null) {
                            if (ja4Var != null) {
                                Object[] objArr = ja4Var.c;
                                long[] jArr = ja4Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i2 = 0;
                                    while (true) {
                                        long j = jArr[i2];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                                            for (int i4 = 0; i4 < i3; i4++) {
                                                if ((255 & j) < 128) {
                                                    kz3Var.L0((ka4) objArr[(i2 << 3) + i4]);
                                                }
                                                j >>= 8;
                                            }
                                            if (i3 != 8) {
                                            }
                                        }
                                        if (i2 != length) {
                                            i2++;
                                        }
                                    }
                                }
                                ja4Var.a();
                            }
                        } else {
                            kz3Var.w0(fx4Var, 9223372034707292159L, 0L);
                            kz3Var.Z = c;
                        }
                    }
                }
                return jg7Var;
            case 5:
                yp4 yp4Var = ((eg4) obj).J0;
                if (yp4Var != null) {
                    ((xt2) yp4Var).c();
                }
                return jg7Var;
            case 6:
                eg4 eg4Var = (eg4) obj;
                sm3 sm3Var = eg4Var.k0;
                try {
                    if (eg4Var.r()) {
                        eg4Var.y1(true);
                    }
                    return jg7Var;
                } catch (Throwable th) {
                    sm3Var.Y(th);
                    throw null;
                }
            case 7:
                hi4 hi4Var = (hi4) obj;
                if (hi4Var.r()) {
                    hi4Var.A.l0();
                }
                return jg7Var;
            case 8:
                sm3 sm3Var2 = (sm3) obj;
                if (sm3Var2.H()) {
                    sm3Var2.U(false);
                }
                return jg7Var;
            case 9:
                sm3 sm3Var3 = (sm3) obj;
                if (sm3Var3.H()) {
                    sm3Var3.U(false);
                }
                return jg7Var;
            case 10:
                sm3 sm3Var4 = (sm3) obj;
                if (sm3Var4.H()) {
                    sm3Var4.S(false);
                }
                return jg7Var;
            case 11:
                sm3 sm3Var5 = (sm3) obj;
                if (sm3Var5.H()) {
                    sm3Var5.S(false);
                }
                return jg7Var;
            case 12:
                sm3 sm3Var6 = (sm3) obj;
                if (sm3Var6.H()) {
                    sm3.T(sm3Var6, false, 7);
                }
                return jg7Var;
            case 13:
                sm3 sm3Var7 = (sm3) obj;
                if (sm3Var7.H()) {
                    sm3.V(sm3Var7, false, 7);
                }
                return jg7Var;
            case 14:
                sm3 sm3Var8 = (sm3) obj;
                if (sm3Var8.H()) {
                    sm3Var8.F();
                }
                return jg7Var;
            case 15:
                op5 op5Var = (op5) obj;
                return jg7Var;
            case 16:
                c05 c05Var = (c05) obj;
                if (c05Var.isAttachedToWindow()) {
                    c05Var.q();
                }
                return jg7Var;
            case 17:
                cx4 cx4Var = (cx4) obj;
                return jg7Var;
            case 18:
                return Integer.valueOf(((g76) obj).b);
            case 19:
                return Integer.valueOf(((g76) obj).c.a());
            case 20:
                if (((z42) obj) != z42.Visible) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                List list = (List) obj;
                return jg7Var;
            case 22:
                int i5 = ((k33) obj).a;
                return jg7Var;
            case ConnectionResult.API_DISABLED /* 23 */:
                List list2 = (List) obj;
                return jg7Var;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                int i6 = ((k33) obj).a;
                return jg7Var;
            case 25:
                return new q93((0 << 32) | (4294967295L & ((int) (((q93) obj).a & 4294967295L))));
            case SubAllocator.N4 /* 26 */:
                return new q93((((int) (((q93) obj).a >> 32)) << 32) | (0 & 4294967295L));
            case 27:
                return new q93((((int) (((q93) obj).a >> 32)) << 32) | (0 & 4294967295L));
            default:
                ((ny2) obj).getClass();
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh2(int i, int i2) {
        super(i);
        this.B = i2;
    }
}
