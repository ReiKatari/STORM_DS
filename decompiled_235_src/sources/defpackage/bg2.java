package defpackage;

import android.hardware.camera2.CaptureResult;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bg2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bg2 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ bg2(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04f4  */
    @Override // defpackage.qn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        boolean z;
        wo3 wo3Var;
        jr3 jr3Var;
        boolean z2;
        Object em5Var;
        String str;
        String str2;
        BufferedInputStream bufferedInputStream;
        gk4 gk4Var;
        boolean z3;
        boolean z4;
        int i = this.A;
        float f = RecyclerView.B1;
        boolean z5 = false;
        wo3 wo3Var2 = null;
        Object obj2 = null;
        String str3 = null;
        jr3 jr3Var2 = null;
        switch (i) {
            case 0:
                ua4 ua4Var = (ua4) this.B;
                cx4 cx4Var = (cx4) obj;
                Object[] objArr = ua4Var.A;
                int i2 = ua4Var.L;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((f34) objArr[i3]).a();
                }
                return jg7.a;
            case 1:
                te7 te7Var = (te7) obj;
                return ((mi2) this.B).a(new te7(null, te7Var.b, te7Var.c, te7Var.d, te7Var.e)).getValue();
            case 2:
                fs2 fs2Var = (fs2) this.B;
                ki5 ki5Var = (ki5) obj;
                ki5Var.getClass();
                if (fs2Var != fs2.STABLE_AND_PRERELEASE && ki5Var.h) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return Integer.valueOf(((dp3) this.B).d(((Integer) obj).intValue()));
            case 4:
                ip3 ip3Var = (ip3) this.B;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= RecyclerView.B1 || ip3Var.c()) && (f2 <= RecyclerView.B1 || ip3Var.b())) {
                    if (Math.abs(ip3Var.g) > 0.5f) {
                        s53.c("entered drag with non-zero pending scroll");
                    }
                    float f3 = ip3Var.g + f2;
                    ip3Var.g = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = ip3Var.g;
                        int E = u24.E(f4);
                        wo3 d = ((wo3) ip3Var.e.getValue()).d(E, !ip3Var.b);
                        if (d != null && (wo3Var = ip3Var.c) != null) {
                            wo3 d2 = wo3Var.d(E, true);
                            if (d2 != null) {
                                ip3Var.c = d2;
                            }
                            if (wo3Var2 == null) {
                                ip3Var.f(wo3Var2, ip3Var.b, true);
                                ip3Var.r.setValue(jg7.a);
                                ip3Var.i(f4 - ip3Var.g, wo3Var2);
                            } else {
                                sm3 sm3Var = ip3Var.j;
                                if (sm3Var != null) {
                                    sm3Var.k();
                                }
                                ip3Var.i(f4 - ip3Var.g, ip3Var.h());
                            }
                        }
                        wo3Var2 = d;
                        if (wo3Var2 == null) {
                        }
                    }
                    if (Math.abs(ip3Var.g) > 0.5f) {
                        f2 -= ip3Var.g;
                        ip3Var.g = RecyclerView.B1;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case 5:
                gl1 gl1Var = (gl1) obj;
                return new z3((aq3) this.B, 10);
            case 6:
                gl1 gl1Var2 = (gl1) obj;
                return new z3((lq3) this.B, 12);
            case 7:
                hr3 hr3Var = (hr3) this.B;
                return hr3Var.o(((Integer) obj).intValue(), hr3Var.d);
            case 8:
                pr3 pr3Var = (pr3) this.B;
                float f5 = -((Float) obj).floatValue();
                if ((f5 >= RecyclerView.B1 || pr3Var.c()) && (f5 <= RecyclerView.B1 || pr3Var.b())) {
                    if (Math.abs(pr3Var.h) > 0.5f) {
                        s53.c("entered drag with non-zero pending scroll");
                    }
                    pr3Var.d = true;
                    float f6 = pr3Var.h + f5;
                    pr3Var.h = f6;
                    if (Math.abs(f6) > 0.5f) {
                        float f7 = pr3Var.h;
                        int round = Math.round(f7);
                        jr3 d3 = ((jr3) pr3Var.f.getValue()).d(round, !pr3Var.b);
                        if (d3 != null && (jr3Var = pr3Var.c) != null) {
                            jr3 d4 = jr3Var.d(round, true);
                            if (d4 != null) {
                                pr3Var.c = d4;
                            }
                            if (jr3Var2 == null) {
                                pr3Var.g(jr3Var2, pr3Var.b, true);
                                pr3Var.w.setValue(jg7.a);
                                pr3Var.k(f7 - pr3Var.h, jr3Var2);
                            } else {
                                sm3 sm3Var2 = pr3Var.l;
                                if (sm3Var2 != null) {
                                    sm3Var2.k();
                                }
                                pr3Var.k(f7 - pr3Var.h, pr3Var.j());
                            }
                        }
                        jr3Var2 = d3;
                        if (jr3Var2 == null) {
                        }
                    }
                    if (Math.abs(pr3Var.h) > 0.5f) {
                        f5 -= pr3Var.h;
                        pr3Var.h = RecyclerView.B1;
                    }
                    f = f5;
                }
                return Float.valueOf(-f);
            case 9:
                q46 q46Var = (q46) this.B;
                if (q46Var != null) {
                    z2 = q46Var.c(obj);
                } else {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 10:
                Void r1 = (Void) obj;
                return ((gj0) this.B).m;
            case 11:
                return ((m14) this.B).b(((Integer) obj).intValue());
            case 12:
                b64 b64Var = (b64) this.B;
                oq5 oq5Var = (oq5) obj;
                oq5Var.getClass();
                try {
                    InputStream openInputStream = b64Var.b.getContentResolver().openInputStream(oq5Var.o());
                    if (openInputStream != null) {
                        if (openInputStream instanceof BufferedInputStream) {
                            bufferedInputStream = (BufferedInputStream) openInputStream;
                        } else {
                            bufferedInputStream = new BufferedInputStream(openInputStream, 8192);
                        }
                        Object K = kn2.K(bufferedInputStream);
                        openInputStream.close();
                        em5Var = K;
                    } else {
                        em5Var = null;
                    }
                } catch (Throwable th) {
                    em5Var = new em5(th);
                }
                boolean z6 = em5Var instanceof em5;
                Object obj3 = em5Var;
                if (z6) {
                    obj3 = null;
                }
                uz5 uz5Var = (uz5) obj3;
                if (uz5Var == null) {
                    return null;
                }
                String m = oq5Var.m();
                String str4 = uz5Var.b;
                String k = oq5Var.k();
                String uri = oq5Var.o().toString();
                uri.getClass();
                String uri2 = oq5Var.n().toString();
                uri2.getClass();
                u26 m2 = oq5Var.j().m();
                a36 n = oq5Var.j().n();
                UUID k2 = oq5Var.j().k();
                if (k2 != null) {
                    str = k2.toString();
                } else {
                    str = null;
                }
                boolean l = oq5Var.j().l();
                Uri i4 = oq5Var.j().i();
                if (i4 != null) {
                    str2 = i4.toString();
                } else {
                    str2 = null;
                }
                Uri j = oq5Var.j().j();
                if (j != null) {
                    str3 = j.toString();
                }
                return new nw5(m, str4, k, uri, uri2, new nt5(m2, n, str, l, str2, str3), oq5Var.l(), uz5Var.c, uz5Var.d);
            case 13:
                Throwable th2 = (Throwable) obj;
                ((hb4) this.B).h(null);
                return jg7.a;
            case 14:
                qd4 qd4Var = (qd4) this.B;
                sb4 sb4Var = (sb4) obj;
                sb4Var.getClass();
                uk1 uk1Var = sb4Var.d0;
                ic4 ic4Var = sb4Var.B;
                if (ic4Var == null) {
                    ic4Var = null;
                }
                if (ic4Var == null) {
                    return null;
                }
                uk1Var.c();
                ic4 c = qd4Var.c(ic4Var);
                if (c == null) {
                    return null;
                }
                if (c.equals(ic4Var)) {
                    return sb4Var;
                }
                return qd4Var.b().b(c, c.a(uk1Var.c()));
            case 15:
                br0 br0Var = (br0) obj;
                br0Var.getClass();
                List list = ((wh4) this.B).b;
                list.getClass();
                br0Var.b = list;
                return jg7.a;
            case 16:
                bj4 bj4Var = (bj4) obj;
                bj4Var.getClass();
                yi4 yi4Var = bj4Var.a;
                ((oj4) this.B).getClass();
                gk4 gk4Var2 = yi4Var.o;
                ik4 ik4Var = yi4Var.p;
                int i5 = fj4.b[gk4Var2.ordinal()];
                if (i5 != 1 && i5 != 2) {
                    if (i5 == 3) {
                        if (yi4Var.g) {
                            gk4Var = gk4.HARDCORE;
                        } else {
                            gk4Var = gk4.SOFTCORE;
                        }
                    } else {
                        i.d();
                        return null;
                    }
                } else {
                    gk4Var = yi4Var.o;
                }
                int i6 = fj4.c[ik4Var.ordinal()];
                if (i6 != 1 && i6 != 2) {
                    if (i6 == 3) {
                        ik4Var = ik4.OFFLINE_AFTER_START;
                    } else {
                        i.d();
                        return null;
                    }
                }
                ik4 ik4Var2 = ik4Var;
                long j2 = yi4Var.b;
                String str5 = yi4Var.c;
                String str6 = yi4Var.d;
                long j3 = yi4Var.e;
                long j4 = yi4Var.f;
                if (gk4Var == gk4.HARDCORE) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String str7 = yi4Var.h;
                long j5 = yi4Var.i;
                long j6 = yi4Var.j;
                long j7 = yi4Var.k;
                if (!yi4Var.q && yi4Var.a != dj4.ACHIEVEMENT_UNLOCK) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                return new ek4(j2, str5, str6, j3, j4, z3, str7, j5, j6, j7, gk4Var, ik4Var2, z4);
            case 17:
                float floatValue = ((Float) obj).floatValue();
                ue1 ue1Var = ((rr4) this.B).b;
                if (ue1Var.p() != 0) {
                    f = floatValue / ue1Var.p();
                }
                ue1Var.q.i(ue1Var.j(ue1Var.k() + u24.E(f)));
                return jg7.a;
            case 18:
                wb6 wb6Var = (wb6) this.B;
                int intValue = ((Integer) obj).intValue();
                return wb6Var.g(intValue) + ": " + wb6Var.j(intValue).a();
            case 19:
                br0 br0Var2 = (br0) obj;
                br0Var2.getClass();
                br0.a(br0Var2, "type", ps6.b);
                br0.a(br0Var2, "value", mp2.m("kotlinx.serialization.Polymorphic<" + ((fz4) this.B).a.c() + '>', ac6.e, new wb6[0]));
                br0Var2.b = yt1.A;
                return jg7.a;
            case 20:
                ((pu) ((s9) this.B).e).addLast(obj);
                return jg7.a;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                Throwable th3 = (Throwable) obj;
                tu0 tu0Var = ((rk5) this.B).b;
                jg7 jg7Var = jg7.a;
                tu0Var.b0(jg7Var);
                return jg7Var;
            case 22:
                n8 n8Var = (n8) obj;
                n8Var.getClass();
                ((v80) ((e65) this.B).e.Y).c(new pk5(n8Var));
                return jg7.a;
            case ConnectionResult.API_DISABLED /* 23 */:
                ((pu) ((pa) this.B).Z).addLast(obj);
                return jg7.a;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                op5 op5Var = (op5) obj;
                op5Var.t(((n65) this.B).e.h() - Float.intBitsToFloat((int) (op5Var.k0 & 4294967295L)));
                return jg7.a;
            case 25:
                ((ey0) this.B).y(obj);
                return jg7.a;
            case SubAllocator.N4 /* 26 */:
                if5 if5Var = (if5) this.B;
                Throwable th4 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th4);
                synchronized (if5Var.c) {
                    try {
                        rc3 rc3Var = if5Var.d;
                        if (rc3Var != null) {
                            if5Var.u.l(ff5.ShuttingDown);
                            rc3Var.h(cancellationException);
                            if5Var.r = null;
                            rc3Var.a0(new qk4(9, if5Var, th4));
                        } else {
                            if5Var.e = cancellationException;
                            if5Var.u.l(ff5.ShutDown);
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return jg7.a;
            case 27:
                ((lf5) this.B).a((ds1) obj);
                return jg7.a;
            case 28:
                j56 j56Var = (j56) this.B;
                qa4 qa4Var = (qa4) obj;
                if (qa4Var instanceof gm6) {
                    gm6 gm6Var = (gm6) qa4Var;
                    if (gm6Var.getValue() != null) {
                        Object value = gm6Var.getValue();
                        value.getClass();
                        obj2 = j56Var.c(value);
                    }
                    im6 d5 = gm6Var.d();
                    d5.getClass();
                    return new vs4(obj2, d5);
                }
                i.h("Failed requirement.");
                return null;
            default:
                uh uhVar = (uh) obj;
                uhVar.getClass();
                Iterator it = ((Map) this.B).entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        CaptureResult.Key key = (CaptureResult.Key) entry.getKey();
                        key.getClass();
                        if (!gt0.C0((List) entry.getValue(), uhVar.A.get(key))) {
                        }
                    } else {
                        z5 = true;
                    }
                }
                return Boolean.valueOf(z5);
        }
    }

    public /* synthetic */ bg2(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }
}
