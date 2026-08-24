package defpackage;

import android.content.res.Resources;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fj implements go2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ fj(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        String N;
        String str;
        int i = this.A;
        boolean z = false;
        int i2 = 2;
        jg7 jg7Var = jg7.a;
        Object obj5 = this.B;
        switch (i) {
            case 0:
                gj gjVar = (gj) obj5;
                we7 b = ((mi2) gjVar.e).b((li2) obj, (oj2) obj2, ((ij2) obj3).a, ((jj2) obj4).a);
                if (!(b instanceof ve7)) {
                    m44 m44Var = new m44(b, gjVar.j);
                    gjVar.j = m44Var;
                    Object obj6 = m44Var.R;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                Object obj7 = ((ve7) b).A;
                obj7.getClass();
                return (Typeface) obj7;
            case 1:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                ((ru6) obj5).l(new cn2(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 2:
                s95 s95Var = (s95) obj5;
                j14 j14Var = (j14) obj2;
                px0 px0Var = (px0) obj3;
                ((Integer) obj4).getClass();
                ((sn) obj).getClass();
                j14Var.getClass();
                int i3 = op2.a[j14Var.ordinal()];
                x64 x64Var = x64.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        xq2 xq2Var = (xq2) px0Var;
                        xq2Var.b0(-1073592757);
                        Resources resources = (Resources) xq2Var.j(kf.c);
                        boolean z2 = s95Var.e;
                        String str2 = s95Var.c;
                        oq1 oq1Var = s95Var.d;
                        String str3 = s95Var.a;
                        if (z2) {
                            xq2Var.b0(-1073521922);
                            N = yh2.N(R.string.game_mastered, new Object[]{str3}, xq2Var);
                            xq2Var.p(false);
                        } else {
                            xq2Var.b0(-1073398883);
                            N = yh2.N(R.string.game_completed, new Object[]{str3}, xq2Var);
                            xq2Var.p(false);
                        }
                        boolean f = xq2Var.f(oq1Var);
                        Object P = xq2Var.P();
                        vs0 vs0Var = ox0.a;
                        if (f || P == vs0Var) {
                            if (oq1Var != null) {
                                long j = oq1Var.A;
                                long k = oq1.k(j, uq1.HOURS);
                                int f2 = oq1.f(j);
                                oq1.h(j);
                                if (k > 0) {
                                    str = resources.getString(R.string.info_play_time_hours_minutes, Long.valueOf(k), Integer.valueOf(f2));
                                } else {
                                    str = resources.getString(R.string.info_play_time_minutes, Integer.valueOf(f2));
                                }
                            } else {
                                str = null;
                            }
                            P = str;
                            xq2Var.l0(P);
                        }
                        String str4 = (String) P;
                        boolean f3 = xq2Var.f(s95Var);
                        Object P2 = xq2Var.P();
                        if (f3 || P2 == vs0Var) {
                            StringBuilder sb = new StringBuilder();
                            if (str2 != null) {
                                sb.append(str2);
                            }
                            if (str2 != null && str4 != null) {
                                sb.append(" • ");
                            }
                            if (str4 != null) {
                                sb.append(str4);
                            }
                            P2 = sb.toString();
                            xq2Var.l0(P2);
                        }
                        String str5 = (String) P2;
                        a74 S = ge7.S(x64Var, 8.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14);
                        yt0 a = wt0.a(ju.c, d90.k0, xq2Var, 0);
                        int hashCode = Long.hashCode(xq2Var.T);
                        xv4 l = xq2Var.l();
                        a74 E = l.E(xq2Var, S);
                        jx0.i.getClass();
                        iy0 iy0Var = ix0.b;
                        xq2Var.f0();
                        if (xq2Var.S) {
                            xq2Var.k(iy0Var);
                        } else {
                            xq2Var.o0();
                        }
                        yh2.K(xq2Var, ix0.f, a);
                        yh2.K(xq2Var, ix0.e, l);
                        yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                        yh2.F(xq2Var, ix0.h);
                        yh2.K(xq2Var, ix0.d, E);
                        nq6 nq6Var = ye7.b;
                        x37.b(N, null, 0L, 0L, oj2.e0, null, 0L, null, 0L, 0, false, 1, 0, null, ((xe7) xq2Var.j(nq6Var)).j, xq2Var, 196608, 3072, 57310);
                        if (str5.length() > 0) {
                            xq2Var.b0(2034755377);
                            x37.b(str5, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, ((xe7) xq2Var.j(nq6Var)).j, xq2Var, 0, 3072, 57342);
                            xq2Var.p(false);
                        } else {
                            xq2Var.b0(2034994635);
                            xq2Var.p(false);
                        }
                        xq2Var.p(true);
                        xq2Var.p(false);
                    } else {
                        throw xg6.f((xq2) px0Var, -588827287, false);
                    }
                } else {
                    xq2 xq2Var2 = (xq2) px0Var;
                    xq2Var2.b0(-1073791033);
                    h70.a(dj6.b(x64Var, 1.0f), xq2Var2, 6);
                    xq2Var2.p(false);
                }
                return jg7Var;
            case 3:
                b.b((b) obj5, (String) obj, (ck3) obj2, ((Boolean) obj3).booleanValue(), ((Integer) obj4).intValue());
                return jg7Var;
            case 4:
                zv0 zv0Var = (zv0) obj5;
                ro3 ro3Var = (ro3) obj;
                ((Integer) obj2).getClass();
                px0 px0Var2 = (px0) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    if (((xq2) px0Var2).f(ro3Var)) {
                        i2 = 4;
                    }
                    intValue |= i2;
                }
                if ((intValue & 131) != 130) {
                    z = true;
                }
                xq2 xq2Var3 = (xq2) px0Var2;
                if (xq2Var3.S(intValue & 1, z)) {
                    zv0Var.e(ro3Var, xq2Var3, Integer.valueOf(intValue & 14));
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            default:
                Float f4 = (Float) obj2;
                f4.getClass();
                Float f5 = (Float) obj4;
                f5.getClass();
                ((go2) ((qa4) obj5).getValue()).l((jk4) obj, f4, (jk4) obj3, f5);
                return jg7Var;
        }
    }
}
