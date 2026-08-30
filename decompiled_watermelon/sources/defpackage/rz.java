package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rz implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ rz(ki2 ki2Var, zy3 zy3Var, ih4 ih4Var, bj2 bj2Var, int i) {
        this.A = 5;
        this.B = ki2Var;
        this.R = zy3Var;
        this.X = ih4Var;
        this.Y = bj2Var;
        this.L = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        Object obj3 = this.X;
        Object obj4 = this.Y;
        Object obj5 = this.B;
        o27 o27Var = o27.a;
        int i2 = this.L;
        Object obj6 = this.R;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                jv3.d((vy) obj6, (g56) obj3, (gn) obj4, (ki2) obj5, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
            case 1:
                ((Integer) obj2).intValue();
                b53.e((zy3) obj6, (pl0) obj3, (ih4) obj4, (ki2) obj5, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
            case 2:
                ((Integer) obj2).getClass();
                ((et0) obj6).k(this.X, this.Y, this.B, (tu0) obj, ep2.I(i2) | 1);
                return o27Var;
            case 3:
                ((Integer) obj2).getClass();
                pu.i((Drawable) obj6, (String) obj3, (String) obj4, (String) obj5, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
            case 4:
                ((Integer) obj2).getClass();
                int I = ep2.I(i2 | 1);
                gk2.h((Boolean) obj6, this.X, (fn3) obj4, (mi2) obj5, (tu0) obj, I);
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                gk2.e((ki2) obj5, (zy3) obj6, (ih4) obj3, (bj2) obj4, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
        }
    }

    public /* synthetic */ rz(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A = i2;
        this.R = obj;
        this.X = obj2;
        this.Y = obj3;
        this.B = obj4;
        this.L = i;
    }
}
