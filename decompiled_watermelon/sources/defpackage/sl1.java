package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sl1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sl1 implements aj2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ String L;
    public final /* synthetic */ ki2 R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ sl1(am1 am1Var, boolean z, String str, zy3 zy3Var, String str2, ki2 ki2Var, int i) {
        this.X = am1Var;
        this.B = z;
        this.L = str;
        this.Z = zy3Var;
        this.Y = str2;
        this.R = ki2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        o27 o27Var = o27.a;
        Object obj3 = this.Z;
        Object obj4 = this.Y;
        Object obj5 = this.X;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ep2.I(7);
                mh7.f((am1) obj5, this.B, this.L, (zy3) obj3, (String) obj4, this.R, (tu0) obj, I);
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                int I2 = ep2.I(1);
                mh7.m((List) obj5, this.B, this.L, (mi2) obj4, (mi2) obj3, this.R, (tu0) obj, I2);
                return o27Var;
        }
    }

    public /* synthetic */ sl1(List list, boolean z, String str, mi2 mi2Var, mi2 mi2Var2, ki2 ki2Var, int i) {
        this.X = list;
        this.B = z;
        this.L = str;
        this.Y = mi2Var;
        this.Z = mi2Var2;
        this.R = ki2Var;
    }
}
