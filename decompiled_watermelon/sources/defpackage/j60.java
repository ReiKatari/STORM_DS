package defpackage;

import android.net.Uri;
import me.magnum.melonds.domain.model.DSiWareTitle;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j60  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j60 extends lj2 implements bj2 {
    public final /* synthetic */ int c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j60(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.c0 = i4;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.c0;
        o27 o27Var = o27.a;
        Object obj4 = this.B;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                mi2 mi2Var = ((q60) obj4).B;
                mi2Var.getClass();
                oo2.v(mi2Var, obj2, (e31) obj3);
                return o27Var;
            case 1:
                Throwable th2 = (Throwable) obj;
                Object obj5 = ((xj0) obj2).a;
                mi2 mi2Var2 = ((q60) obj4).B;
                mi2Var2.getClass();
                Object a = xj0.a(obj5);
                a.getClass();
                oo2.v(mi2Var2, a, (e31) obj3);
                return o27Var;
            case 2:
                DSiWareTitle dSiWareTitle = (DSiWareTitle) obj;
                m71 m71Var = (m71) obj2;
                Uri uri = (Uri) obj3;
                dSiWareTitle.getClass();
                m71Var.getClass();
                uri.getClass();
                w61 w61Var = (w61) obj4;
                w61Var.getClass();
                ee6 ee6Var = w61Var.g;
                Boolean bool = Boolean.TRUE;
                ee6Var.getClass();
                ee6Var.l(null, bool);
                tq5.w(ua7.a(w61Var), null, null, new t61(w61Var, dSiWareTitle, m71Var, uri, null, 1), 3);
                return o27Var;
            default:
                DSiWareTitle dSiWareTitle2 = (DSiWareTitle) obj;
                m71 m71Var2 = (m71) obj2;
                Uri uri2 = (Uri) obj3;
                dSiWareTitle2.getClass();
                m71Var2.getClass();
                uri2.getClass();
                w61 w61Var2 = (w61) obj4;
                w61Var2.getClass();
                ee6 ee6Var2 = w61Var2.g;
                Boolean bool2 = Boolean.TRUE;
                ee6Var2.getClass();
                ee6Var2.l(null, bool2);
                tq5.w(ua7.a(w61Var2), null, null, new t61(w61Var2, dSiWareTitle2, m71Var2, uri2, null, 3), 3);
                return o27Var;
        }
    }
}
