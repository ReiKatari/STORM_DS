package defpackage;

import android.content.res.Resources;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.ui.layouteditor.b;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ti  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ti implements cj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ ti(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        String W;
        String str;
        int i = this.A;
        o27 o27Var = o27.a;
        Object obj5 = this.B;
        switch (i) {
            case 0:
                ui uiVar = (ui) obj5;
                b17 b = ((qd2) uiVar.e).b((pd2) obj, (pe2) obj2, ((ke2) obj3).a, ((le2) obj4).a);
                if (!(b instanceof a17)) {
                    n85 n85Var = new n85(b, uiVar.j);
                    uiVar.j = n85Var;
                    Object obj6 = n85Var.R;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                Object obj7 = ((a17) b).A;
                obj7.getClass();
                return (Typeface) obj7;
            case 1:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                ((xi6) obj5).i(new ci2(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 2:
                i05 i05Var = (i05) obj5;
                gu3 gu3Var = (gu3) obj2;
                tu0 tu0Var = (tu0) obj3;
                ((Integer) obj4).getClass();
                ((gn) obj).getClass();
                gu3Var.getClass();
                int i2 = ik2.a[gu3Var.ordinal()];
                wy3 wy3Var = wy3.a;
                if (i2 != 1) {
                    if (i2 == 2) {
                        sk2 sk2Var = (sk2) tu0Var;
                        sk2Var.X(-1073592757);
                        Resources resources = (Resources) sk2Var.j(ue.c);
                        boolean z = i05Var.e;
                        String str2 = i05Var.c;
                        im1 im1Var = i05Var.d;
                        String str3 = i05Var.a;
                        if (z) {
                            sk2Var.X(-1073521922);
                            W = me2.W(R.string.game_mastered, new Object[]{str3}, sk2Var);
                            sk2Var.p(false);
                        } else {
                            sk2Var.X(-1073398883);
                            W = me2.W(R.string.game_completed, new Object[]{str3}, sk2Var);
                            sk2Var.p(false);
                        }
                        String str4 = W;
                        boolean f = sk2Var.f(im1Var);
                        Object L = sk2Var.L();
                        sn1 sn1Var = su0.a;
                        if (f || L == sn1Var) {
                            if (im1Var != null) {
                                long j = im1Var.A;
                                long k = im1.k(j, om1.HOURS);
                                int f2 = im1.f(j);
                                im1.h(j);
                                if (k > 0) {
                                    str = resources.getString(R.string.info_play_time_hours_minutes, Long.valueOf(k), Integer.valueOf(f2));
                                } else {
                                    str = resources.getString(R.string.info_play_time_minutes, Integer.valueOf(f2));
                                }
                            } else {
                                str = null;
                            }
                            L = str;
                            sk2Var.h0(L);
                        }
                        String str5 = (String) L;
                        boolean f3 = sk2Var.f(i05Var);
                        Object L2 = sk2Var.L();
                        if (f3 || L2 == sn1Var) {
                            StringBuilder sb = new StringBuilder();
                            if (str2 != null) {
                                sb.append(str2);
                            }
                            if (str2 != null && str5 != null) {
                                sb.append(" • ");
                            }
                            if (str5 != null) {
                                sb.append(str5);
                            }
                            L2 = sb.toString();
                            sk2Var.h0(L2);
                        }
                        String str6 = (String) L2;
                        zy3 b0 = b53.b0(wy3Var, 8.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14);
                        lr0 a = jr0.a(rt.c, y60.j0, sk2Var, 0);
                        int hashCode = Long.hashCode(sk2Var.T);
                        sm4 l = sk2Var.l();
                        zy3 e0 = l07.e0(sk2Var, b0);
                        nu0.i.getClass();
                        mv0 mv0Var = mu0.b;
                        sk2Var.b0();
                        if (sk2Var.S) {
                            sk2Var.k(mv0Var);
                        } else {
                            sk2Var.k0();
                        }
                        oo2.S(sk2Var, mu0.f, a);
                        oo2.S(sk2Var, mu0.e, l);
                        oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
                        oo2.P(sk2Var, mu0.h);
                        oo2.S(sk2Var, mu0.d, e0);
                        ye6 ye6Var = d17.b;
                        ir6.b(str4, null, 0L, 0L, pe2.d0, null, 0L, null, 0L, 0, false, 1, 0, null, ((c17) sk2Var.j(ye6Var)).j, sk2Var, 196608, 3072, 57310);
                        if (str6.length() > 0) {
                            sk2Var.X(2034755377);
                            ir6.b(str6, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, ((c17) sk2Var.j(ye6Var)).j, sk2Var, 0, 3072, 57342);
                            sk2Var.p(false);
                        } else {
                            sk2Var.X(2034994635);
                            sk2Var.p(false);
                        }
                        sk2Var.p(true);
                        sk2Var.p(false);
                    } else {
                        throw ej6.d((sk2) tu0Var, -588827287, false);
                    }
                } else {
                    sk2 sk2Var2 = (sk2) tu0Var;
                    sk2Var2.X(-1073791033);
                    d50.a(o76.b(wy3Var, 1.0f), sk2Var2, 6);
                    sk2Var2.p(false);
                }
                return o27Var;
            default:
                b.b((b) obj5, (String) obj, (kd3) obj2, ((Boolean) obj3).booleanValue(), ((Integer) obj4).intValue());
                return o27Var;
        }
    }
}
