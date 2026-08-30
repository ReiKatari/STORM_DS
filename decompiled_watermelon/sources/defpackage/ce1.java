package defpackage;

import androidx.preference.Preference;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ce1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ce1 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ ce1(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.A = i2;
        this.L = obj;
        this.R = obj2;
        this.B = i;
        this.X = obj3;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i;
        boolean z;
        qr5 qr5Var;
        b53 b53Var;
        int a;
        int i2 = this.A;
        int i3 = 0;
        o27 o27Var = o27.a;
        lr6 lr6Var = null;
        int i4 = this.B;
        Object obj2 = this.X;
        Object obj3 = this.R;
        Object obj4 = this.L;
        switch (i2) {
            case 0:
                f33 f33Var = (f33) obj3;
                s14 s14Var = (s14) obj2;
                if (obj != ((ee1) obj4)) {
                    if (obj instanceof pe6) {
                        int i5 = f33Var.a - i4;
                        int d = s14Var.d(obj);
                        if (d >= 0) {
                            i = s14Var.c[d];
                        } else {
                            i = Preference.DEFAULT_ORDER;
                        }
                        s14Var.g(Math.min(i5, i), obj);
                        return o27Var;
                    }
                    return o27Var;
                }
                i.n("A derived state calculation cannot read itself");
                return null;
            case 1:
                hs2 hs2Var = (hs2) obj4;
                vv3 vv3Var = (vv3) obj3;
                yn4 yn4Var = (yn4) obj2;
                xn4 xn4Var = (xn4) obj;
                int i6 = hs2Var.b;
                up6 up6Var = hs2Var.a;
                uw6 uw6Var = hs2Var.c;
                mr6 mr6Var = (mr6) hs2Var.d.c();
                if (mr6Var != null) {
                    lr6Var = mr6Var.a;
                }
                lr6 lr6Var2 = lr6Var;
                if (vv3Var.getLayoutDirection() == sd3.Rtl) {
                    z = true;
                } else {
                    z = false;
                }
                up6Var.a(jf4.Horizontal, nl2.o(xn4Var, i6, uw6Var, lr6Var2, z, yn4Var.A), i4, yn4Var.A);
                xn4.m(xn4Var, yn4Var, Math.round(-up6Var.a.h()), 0);
                return o27Var;
            case 2:
                mi2 mi2Var = (mi2) obj4;
                ((ch1) obj).getClass();
                mi2Var.n(new th5((ri5) obj3, i4, (qj4) obj2, 0));
                return new y3(13, mi2Var);
            case 3:
                yn4[] yn4VarArr = (yn4[]) obj4;
                sr5 sr5Var = (sr5) obj3;
                int[] iArr = (int[]) obj2;
                xn4 xn4Var2 = (xn4) obj;
                int length = yn4VarArr.length;
                int i7 = 0;
                while (i3 < length) {
                    yn4 yn4Var2 = yn4VarArr[i3];
                    int i8 = i7 + 1;
                    yn4Var2.getClass();
                    Object l = yn4Var2.l();
                    if (l instanceof qr5) {
                        qr5Var = (qr5) l;
                    } else {
                        qr5Var = null;
                    }
                    if (qr5Var != null) {
                        b53Var = qr5Var.c;
                    } else {
                        b53Var = null;
                    }
                    if (b53Var != null) {
                        a = b53Var.w(i4, yn4Var2.B, sd3.Ltr);
                    } else {
                        a = sr5Var.b.a(yn4Var2.B, i4);
                    }
                    xn4.k(xn4Var2, yn4Var2, iArr[i7], a);
                    i3++;
                    i7 = i8;
                }
                return o27Var;
            default:
                List list = (List) obj4;
                ek3 ek3Var = (ek3) obj;
                ek3Var.getClass();
                ek3Var.b0(list.size(), null, new k5(19, list), new et0(2039820996, true, new b76(list, (mi2) obj3, (ki2) obj2, i4)));
                return o27Var;
        }
    }

    public /* synthetic */ ce1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A = i2;
        this.L = obj;
        this.R = obj2;
        this.X = obj3;
        this.B = i;
    }
}
