package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r50  reason: default package */
/* loaded from: classes.dex */
public final class r50 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object c0;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r50(yo5 yo5Var, List list, List list2, qb6 qb6Var, rb6 rb6Var, j11 j11Var) {
        super(2, j11Var);
        this.X = 2;
        this.Y = yo5Var;
        this.Z = list;
        this.c0 = list2;
        this.d0 = qb6Var;
        this.e0 = rb6Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((r50) t(j11Var, o31Var)).v(o27Var);
            case 1:
                ((r50) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            default:
                return ((r50) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.e0;
        Object obj3 = this.d0;
        Object obj4 = this.c0;
        Object obj5 = this.Z;
        switch (i) {
            case 0:
                r50 r50Var = new r50((s50) obj5, (m74) obj4, (wd) obj3, (t6) obj2, j11Var, 0);
                r50Var.Y = obj;
                return r50Var;
            case 1:
                r50 r50Var2 = new r50((jm4) obj5, (hv1) obj4, (rg5) obj3, (q60) obj2, j11Var, 1);
                r50Var2.Y = obj;
                return r50Var2;
            default:
                return new r50((yo5) this.Y, (List) obj5, (List) obj4, (qb6) obj3, (rb6) obj2, j11Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        pj pjVar;
        int i = this.X;
        Object obj2 = this.e0;
        Object obj3 = this.d0;
        Object obj4 = this.c0;
        Object obj5 = this.Z;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                o31 o31Var = (o31) this.Y;
                s50 s50Var = (s50) obj5;
                tq5.w(o31Var, null, null, new a0(s50Var, (m74) obj4, (wd) obj3, (j11) null, 9), 3);
                return tq5.w(o31Var, null, null, new y(s50Var, (t6) obj2, null, 9), 3);
            case 1:
                o31 o31Var2 = (o31) this.Y;
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                hv1 hv1Var = (hv1) obj4;
                tq5.w(o31Var2, null, null, new a0((jm4) obj5, hv1Var, (rg5) obj3, (j11) null, 27), 3);
                tq5.w(o31Var2, null, null, new wu1(12, null, hv1Var), 3);
                tq5.w(o31Var2, null, null, new a0((q60) obj2, hv1Var, null, 28), 3);
                return o27.a;
            default:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ArrayList X0 = tq0.X0((List) obj5, (List) obj4);
                qb6 qb6Var = (qb6) obj3;
                rb6 rb6Var = (rb6) obj2;
                h85 h85Var = yo5.I;
                int i2 = ro5.c[qb6Var.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            if (rb6Var == rb6.ASCENDING) {
                                pjVar = new pj(10);
                            } else {
                                pjVar = new pj(11);
                            }
                        } else {
                            i.c();
                            return null;
                        }
                    } else if (rb6Var == rb6.ASCENDING) {
                        pjVar = new pj(8);
                    } else {
                        pjVar = new pj(9);
                    }
                } else if (rb6Var == rb6.ASCENDING) {
                    pjVar = new pj(12);
                } else {
                    pjVar = new pj(13);
                }
                return new ti4(tq0.g1(X0, new fs0(2, new z5(27, pjVar))), qb6Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r50(Object obj, Object obj2, Object obj3, Object obj4, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = obj;
        this.c0 = obj2;
        this.d0 = obj3;
        this.e0 = obj4;
    }
}
