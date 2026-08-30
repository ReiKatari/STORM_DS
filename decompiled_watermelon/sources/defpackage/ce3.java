package defpackage;

import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ce3  reason: default package */
/* loaded from: classes.dex */
public final class ce3 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ LayoutEditorActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ce3(LayoutEditorActivity layoutEditorActivity, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = layoutEditorActivity;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((ce3) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((ce3) t(j11Var, o31Var)).v(o27Var);
            case 2:
                return ((ce3) t(j11Var, o31Var)).v(o27Var);
            case 3:
                return ((ce3) t(j11Var, o31Var)).v(o27Var);
            case 4:
                return ((ce3) t(j11Var, o31Var)).v(o27Var);
            case 5:
                return ((ce3) t(j11Var, o31Var)).v(o27Var);
            case ig7.b /* 6 */:
                return ((ce3) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((ce3) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        LayoutEditorActivity layoutEditorActivity = this.Z;
        switch (i) {
            case 0:
                return new ce3(layoutEditorActivity, j11Var, 0);
            case 1:
                return new ce3(layoutEditorActivity, j11Var, 1);
            case 2:
                return new ce3(layoutEditorActivity, j11Var, 2);
            case 3:
                return new ce3(layoutEditorActivity, j11Var, 3);
            case 4:
                return new ce3(layoutEditorActivity, j11Var, 4);
            case 5:
                return new ce3(layoutEditorActivity, j11Var, 5);
            case ig7.b /* 6 */:
                return new ce3(layoutEditorActivity, j11Var, 6);
            default:
                return new ce3(layoutEditorActivity, j11Var, 7);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        LayoutEditorActivity layoutEditorActivity = this.Z;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    me2.a0(obj);
                } else {
                    me2.a0(obj);
                    int i3 = LayoutEditorActivity.M0;
                    q45 q45Var = layoutEditorActivity.B().p;
                    be3 be3Var = new be3(layoutEditorActivity, 0);
                    this.Y = 1;
                    if (q45Var.A.a(be3Var, this) == p31Var) {
                        return p31Var;
                    }
                }
                f81.c();
                return null;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                in3 in3Var = layoutEditorActivity.A;
                qm3 qm3Var = qm3.STARTED;
                ce3 ce3Var = new ce3(layoutEditorActivity, null, 0);
                this.Y = 1;
                if (nl2.Q(in3Var, qm3Var, ce3Var, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 != 1) {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    me2.a0(obj);
                } else {
                    me2.a0(obj);
                    int i6 = LayoutEditorActivity.M0;
                    q45 q45Var2 = layoutEditorActivity.B().l;
                    be3 be3Var2 = new be3(layoutEditorActivity, 1);
                    this.Y = 1;
                    if (q45Var2.A.a(be3Var2, this) == p31Var3) {
                        return p31Var3;
                    }
                }
                f81.c();
                return null;
            case 3:
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                in3 in3Var2 = layoutEditorActivity.A;
                qm3 qm3Var2 = qm3.STARTED;
                ce3 ce3Var2 = new ce3(layoutEditorActivity, null, 2);
                this.Y = 1;
                if (nl2.Q(in3Var2, qm3Var2, ce3Var2, this) == p31Var4) {
                    return p31Var4;
                }
                return o27Var;
            case 4:
                p31 p31Var5 = p31.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                if (i8 != 0) {
                    if (i8 != 1) {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    me2.a0(obj);
                } else {
                    me2.a0(obj);
                    int i9 = LayoutEditorActivity.M0;
                    q45 q45Var3 = layoutEditorActivity.B().n;
                    be3 be3Var3 = new be3(layoutEditorActivity, 2);
                    this.Y = 1;
                    if (q45Var3.A.a(be3Var3, this) == p31Var5) {
                        return p31Var5;
                    }
                }
                f81.c();
                return null;
            case 5:
                p31 p31Var6 = p31.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                in3 in3Var3 = layoutEditorActivity.A;
                qm3 qm3Var3 = qm3.STARTED;
                ce3 ce3Var3 = new ce3(layoutEditorActivity, null, 4);
                this.Y = 1;
                if (nl2.Q(in3Var3, qm3Var3, ce3Var3, this) == p31Var6) {
                    return p31Var6;
                }
                return o27Var;
            case ig7.b /* 6 */:
                p31 p31Var7 = p31.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                pe7.b0.getClass();
                h90 k = se.k(new zw5(oe7.a(layoutEditorActivity), layoutEditorActivity, null, 14));
                bb1 bb1Var = tg1.a;
                u92 x = se.x(k, bt3.a);
                be3 be3Var4 = new be3(layoutEditorActivity, 3);
                this.Y = 1;
                if (x.a(be3Var4, this) == p31Var7) {
                    return p31Var7;
                }
                return o27Var;
            default:
                p31 p31Var8 = p31.COROUTINE_SUSPENDED;
                int i12 = this.Y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                in3 in3Var4 = layoutEditorActivity.A;
                qm3 qm3Var4 = qm3.STARTED;
                ce3 ce3Var4 = new ce3(layoutEditorActivity, null, 6);
                this.Y = 1;
                if (nl2.Q(in3Var4, qm3Var4, ce3Var4, this) == p31Var8) {
                    return p31Var8;
                }
                return o27Var;
        }
    }
}
