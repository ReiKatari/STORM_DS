package defpackage;

import android.content.res.Resources;
import androidx.work.impl.WorkDatabase;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r76  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r76 implements qn2 {
    public final /* synthetic */ int A;

    public /* synthetic */ r76(int i) {
        this.A = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    @Override // defpackage.qn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        xo xoVar;
        int i;
        lo4 lo4Var;
        fp fpVar;
        k47 k47Var;
        int i2 = this.A;
        jg7 jg7Var = jg7.a;
        boolean z = true;
        boolean z2 = false;
        switch (i2) {
            case 0:
                return new s76(((Integer) obj).intValue());
            case 1:
                bz4 bz4Var = (bz4) obj;
                if (bz4Var != null && bz4Var.a == 2) {
                    z2 = true;
                }
                return Boolean.valueOf(!z2);
            case 2:
                fg3[] fg3VarArr = eb6.a;
                ((gb6) obj).a(bb6.e, jg7Var);
                return jg7Var;
            case 3:
                jk4 jk4Var = (jk4) obj;
                long j = jk4Var.a;
                if ((9223372034707292159L & j) != 9205357640488583168L) {
                    return new xo(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (jk4Var.a & 4294967295L)));
                }
                return qa6.a;
            case 4:
                float f = ((xo) obj).a;
                return new jk4((Float.floatToRawIntBits(xoVar.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            case 5:
                if (obj != null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                ar0 ar0Var = (ar0) obj;
                ar0Var.getClass();
                gg3 M = jx2.M(ar0Var);
                if (M == null) {
                    if (!jx2.y(ar0Var)) {
                        return null;
                    }
                    return new fz4(ar0Var);
                }
                return M;
            case 7:
                ar0 ar0Var2 = (ar0) obj;
                ar0Var2.getClass();
                gg3 M2 = jx2.M(ar0Var2);
                if (M2 == null) {
                    if (jx2.y(ar0Var2)) {
                        M2 = new fz4(ar0Var2);
                    } else {
                        M2 = null;
                    }
                }
                if (M2 == null) {
                    return null;
                }
                return q60.I(M2);
            case 8:
                String str = (String) obj;
                str.getClass();
                return new ev(qs6.J0(str, new char[]{',', ';'}, 6), 1);
            case 9:
                String str2 = (String) obj;
                str2.getClass();
                List J0 = qs6.J0(str2, new char[]{'='}, 2);
                if (J0.size() != 2) {
                    return null;
                }
                String obj2 = qs6.T0((String) J0.get(0)).toString();
                Float U = ws6.U(qs6.T0((String) J0.get(1)).toString());
                if (qs6.v0(obj2) || U == null) {
                    return null;
                }
                return new vr4(obj2, U);
            case 10:
                return ((gk4) obj).name();
            case 11:
                return new ev(((s75) obj).f, 1);
            case 12:
                zl6 zl6Var = (zl6) obj;
                r76 r76Var = bm6.a;
                return jg7Var;
            case 13:
                WorkDatabase workDatabase = (WorkDatabase) obj;
                workDatabase.getClass();
                fa6 fa6Var = yw7.z;
                dx7 w = workDatabase.w();
                w.getClass();
                Object apply = fa6Var.apply((List) hv.Q(w.a, true, true, new ro5(w, 27)));
                apply.getClass();
                return (List) apply;
            case 14:
                fg3[] fg3VarArr2 = eb6.a;
                fb6 fb6Var = bb6.m;
                fg3 fg3Var = eb6.a[5];
                ((gb6) obj).a(fb6Var, Boolean.TRUE);
                return jg7Var;
            case 15:
                so soVar = (so) obj;
                return jg7Var;
            case 16:
                return Float.valueOf(((Float) obj).floatValue() * 0.7f);
            case 17:
                ((Resources) obj).getClass();
                return Boolean.FALSE;
            case 18:
                ((Resources) obj).getClass();
                return Boolean.TRUE;
            case 19:
                Resources resources = (Resources) obj;
                resources.getClass();
                if ((resources.getConfiguration().uiMode & 48) != 32) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                e36 e36Var = (e36) obj;
                e36Var.getClass();
                j36 i0 = e36Var.i0("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (i0.f0()) {
                        arrayList.add(i0.R(0));
                    }
                    return arrayList;
                } finally {
                    i0.close();
                }
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                ((Float) obj).getClass();
                return jg7Var;
            case 22:
                b27 b27Var = (b27) obj;
                String str3 = b27Var.g.B;
                long j2 = b27Var.f;
                int i3 = k47.c;
                int i4 = (int) (j2 & 4294967295L);
                if (i4 > 0) {
                    ws1 F = mp2.F();
                    if (F == null) {
                        if (i4 > 0) {
                            i = Character.offsetByCodePoints(str3, i4, -1);
                            if (i == -1) {
                                return null;
                            }
                            return new hh1(((int) (b27Var.f & 4294967295L)) - i, 0);
                        }
                    } else {
                        int b = F.b(i4 - 1, str3);
                        if (b < 0) {
                            if (i4 > 0) {
                                i = Character.offsetByCodePoints(str3, i4, -1);
                            }
                        } else {
                            i = b;
                        }
                        if (i == -1) {
                        }
                    }
                }
                i = -1;
                if (i == -1) {
                }
            case ConnectionResult.API_DISABLED /* 23 */:
                b27 b27Var2 = (b27) obj;
                String str4 = b27Var2.g.B;
                long j3 = b27Var2.f;
                int i5 = k47.c;
                int w2 = mp2.w((int) (j3 & 4294967295L), str4);
                if (w2 == -1) {
                    return null;
                }
                return new hh1(0, w2 - ((int) (b27Var2.f & 4294967295L)));
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                b27 b27Var3 = (b27) obj;
                Integer e = b27Var3.e();
                if (e == null) {
                    return null;
                }
                int intValue = e.intValue();
                long j4 = b27Var3.f;
                int i6 = k47.c;
                return new hh1(((int) (j4 & 4294967295L)) - intValue, 0);
            case 25:
                b27 b27Var4 = (b27) obj;
                Integer d = b27Var4.d();
                if (d == null) {
                    return null;
                }
                int intValue2 = d.intValue();
                long j5 = b27Var4.f;
                int i7 = k47.c;
                return new hh1(0, intValue2 - ((int) (j5 & 4294967295L)));
            case SubAllocator.N4 /* 26 */:
                b27 b27Var5 = (b27) obj;
                Integer c = b27Var5.c();
                if (c == null) {
                    return null;
                }
                int intValue3 = c.intValue();
                long j6 = b27Var5.f;
                int i8 = k47.c;
                return new hh1(((int) (j6 & 4294967295L)) - intValue3, 0);
            case 27:
                b27 b27Var6 = (b27) obj;
                Integer b2 = b27Var6.b();
                if (b2 == null) {
                    return null;
                }
                int intValue4 = b2.intValue();
                long j7 = b27Var6.f;
                int i9 = k47.c;
                return new hh1(0, intValue4 - ((int) (j7 & 4294967295L)));
            case 28:
                List list = (List) obj;
                Object obj3 = list.get(1);
                obj3.getClass();
                if (((Boolean) obj3).booleanValue()) {
                    lo4Var = lo4.Vertical;
                } else {
                    lo4Var = lo4.Horizontal;
                }
                Object obj4 = list.get(0);
                obj4.getClass();
                return new i27(lo4Var, ((Float) obj4).floatValue());
            default:
                obj.getClass();
                List list2 = (List) obj;
                Object obj5 = list2.get(0);
                ap3 ap3Var = p56.a;
                Boolean bool = Boolean.FALSE;
                if (nb3.k(obj5, bool) || obj5 == null) {
                    fpVar = null;
                } else {
                    fpVar = (fp) ((qn2) ap3Var.L).g(obj5);
                }
                fpVar.getClass();
                Object obj6 = list2.get(1);
                int i10 = k47.c;
                ap3 ap3Var2 = p56.p;
                if (nb3.k(obj6, bool) || obj6 == null) {
                    k47Var = null;
                } else {
                    k47Var = (k47) ((qn2) ap3Var2.L).g(obj6);
                }
                k47Var.getClass();
                return new c37(fpVar, k47Var.a, (k47) null);
        }
    }
}
