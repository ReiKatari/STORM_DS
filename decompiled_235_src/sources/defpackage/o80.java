package defpackage;

import android.net.Uri;
import me.magnum.melonds.domain.model.DSiWareTitle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o80  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o80 extends po2 implements fo2 {
    public final /* synthetic */ int d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o80(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.d0 = i4;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.d0;
        jg7 jg7Var = jg7.a;
        Object obj4 = this.B;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                qn2 qn2Var = ((v80) obj4).B;
                qn2Var.getClass();
                oi2.k(qn2Var, obj2, (l61) obj3);
                return jg7Var;
            case 1:
                Throwable th2 = (Throwable) obj;
                Object obj5 = ((gm0) obj2).a;
                qn2 qn2Var2 = ((v80) obj4).B;
                qn2Var2.getClass();
                Object a = gm0.a(obj5);
                a.getClass();
                oi2.k(qn2Var2, a, (l61) obj3);
                return jg7Var;
            case 2:
                DSiWareTitle dSiWareTitle = (DSiWareTitle) obj;
                bb1 bb1Var = (bb1) obj2;
                Uri uri = (Uri) obj3;
                dSiWareTitle.getClass();
                bb1Var.getClass();
                uri.getClass();
                la1 la1Var = (la1) obj4;
                la1Var.getClass();
                tp6 tp6Var = la1Var.i;
                Boolean bool = Boolean.TRUE;
                tp6Var.getClass();
                tp6Var.m(null, bool);
                hv.L(to7.a(la1Var), null, null, new ha1(la1Var, dSiWareTitle, bb1Var, uri, null, 1), 3);
                return jg7Var;
            default:
                DSiWareTitle dSiWareTitle2 = (DSiWareTitle) obj;
                bb1 bb1Var2 = (bb1) obj2;
                Uri uri2 = (Uri) obj3;
                dSiWareTitle2.getClass();
                bb1Var2.getClass();
                uri2.getClass();
                la1 la1Var2 = (la1) obj4;
                la1Var2.getClass();
                tp6 tp6Var2 = la1Var2.i;
                Boolean bool2 = Boolean.TRUE;
                tp6Var2.getClass();
                tp6Var2.m(null, bool2);
                hv.L(to7.a(la1Var2), null, null, new ha1(la1Var2, dSiWareTitle2, bb1Var2, uri2, null, 3), 3);
                return jg7Var;
        }
    }
}
