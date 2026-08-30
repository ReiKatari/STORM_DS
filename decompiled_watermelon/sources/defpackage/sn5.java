package defpackage;

import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sn5  reason: default package */
/* loaded from: classes.dex */
public final class sn5 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ RomListActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sn5(RomListActivity romListActivity, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = romListActivity;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((sn5) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((sn5) t(j11Var, o31Var)).v(o27Var);
            case 2:
                return ((sn5) t(j11Var, o31Var)).v(o27Var);
            case 3:
                return ((sn5) t(j11Var, o31Var)).v(o27Var);
            case 4:
                return ((sn5) t(j11Var, o31Var)).v(o27Var);
            case 5:
                return ((sn5) t(j11Var, o31Var)).v(o27Var);
            case ig7.b /* 6 */:
                return ((sn5) t(j11Var, o31Var)).v(o27Var);
            case 7:
                return ((sn5) t(j11Var, o31Var)).v(o27Var);
            case 8:
                return ((sn5) t(j11Var, o31Var)).v(o27Var);
            case 9:
                return ((sn5) t(j11Var, o31Var)).v(o27Var);
            case 10:
                return ((sn5) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((sn5) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        RomListActivity romListActivity = this.Z;
        switch (i) {
            case 0:
                return new sn5(romListActivity, j11Var, 0);
            case 1:
                return new sn5(romListActivity, j11Var, 1);
            case 2:
                return new sn5(romListActivity, j11Var, 2);
            case 3:
                return new sn5(romListActivity, j11Var, 3);
            case 4:
                return new sn5(romListActivity, j11Var, 4);
            case 5:
                return new sn5(romListActivity, j11Var, 5);
            case ig7.b /* 6 */:
                return new sn5(romListActivity, j11Var, 6);
            case 7:
                return new sn5(romListActivity, j11Var, 7);
            case 8:
                return new sn5(romListActivity, j11Var, 8);
            case 9:
                return new sn5(romListActivity, j11Var, 9);
            case 10:
                return new sn5(romListActivity, j11Var, 10);
            default:
                return new sn5(romListActivity, j11Var, 11);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        RomListActivity romListActivity = this.Z;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                int i3 = RomListActivity.J0;
                c46 c46Var = romListActivity.C().u;
                dm0 dm0Var = new dm0(romListActivity, (j11) null, 2);
                this.Y = 1;
                if (se.m(c46Var, dm0Var, this) == p31Var) {
                    return p31Var;
                }
                return o27Var;
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
                qm3 qm3Var = qm3.STARTED;
                sn5 sn5Var = new sn5(romListActivity, null, 0);
                this.Y = 1;
                if (nl2.R(romListActivity, qm3Var, sn5Var, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                int i6 = RomListActivity.J0;
                c46 c46Var2 = romListActivity.C().w;
                tn5 tn5Var = new tn5(romListActivity, null, 0);
                this.Y = 1;
                if (se.m(c46Var2, tn5Var, this) == p31Var3) {
                    return p31Var3;
                }
                return o27Var;
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
                qm3 qm3Var2 = qm3.STARTED;
                sn5 sn5Var2 = new sn5(romListActivity, null, 2);
                this.Y = 1;
                if (nl2.R(romListActivity, qm3Var2, sn5Var2, this) == p31Var4) {
                    return p31Var4;
                }
                return o27Var;
            case 4:
                p31 p31Var5 = p31.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                int i9 = RomListActivity.J0;
                c46 c46Var3 = romListActivity.C().y;
                tn5 tn5Var2 = new tn5(romListActivity, null, 1);
                this.Y = 1;
                if (se.m(c46Var3, tn5Var2, this) == p31Var5) {
                    return p31Var5;
                }
                return o27Var;
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
                qm3 qm3Var3 = qm3.STARTED;
                sn5 sn5Var3 = new sn5(romListActivity, null, 4);
                this.Y = 1;
                if (nl2.R(romListActivity, qm3Var3, sn5Var3, this) == p31Var6) {
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
                int i12 = RomListActivity.J0;
                mj0 mj0Var = romListActivity.B().e;
                vn5 vn5Var = new vn5(romListActivity, null, 0);
                this.Y = 1;
                if (se.m(mj0Var, vn5Var, this) == p31Var7) {
                    return p31Var7;
                }
                return o27Var;
            case 7:
                p31 p31Var8 = p31.COROUTINE_SUSPENDED;
                int i13 = this.Y;
                if (i13 != 0) {
                    if (i13 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                qm3 qm3Var4 = qm3.STARTED;
                sn5 sn5Var4 = new sn5(romListActivity, null, 6);
                this.Y = 1;
                if (nl2.R(romListActivity, qm3Var4, sn5Var4, this) == p31Var8) {
                    return p31Var8;
                }
                return o27Var;
            case 8:
                p31 p31Var9 = p31.COROUTINE_SUSPENDED;
                int i14 = this.Y;
                if (i14 != 0) {
                    if (i14 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                int i15 = RomListActivity.J0;
                mj0 mj0Var2 = romListActivity.B().g;
                vn5 vn5Var2 = new vn5(romListActivity, null, 1);
                this.Y = 1;
                if (se.m(mj0Var2, vn5Var2, this) == p31Var9) {
                    return p31Var9;
                }
                return o27Var;
            case 9:
                p31 p31Var10 = p31.COROUTINE_SUSPENDED;
                int i16 = this.Y;
                if (i16 != 0) {
                    if (i16 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                qm3 qm3Var5 = qm3.STARTED;
                sn5 sn5Var5 = new sn5(romListActivity, null, 8);
                this.Y = 1;
                if (nl2.R(romListActivity, qm3Var5, sn5Var5, this) == p31Var10) {
                    return p31Var10;
                }
                return o27Var;
            case 10:
                p31 p31Var11 = p31.COROUTINE_SUSPENDED;
                int i17 = this.Y;
                if (i17 != 0) {
                    if (i17 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                int i18 = RomListActivity.J0;
                q45 q45Var = romListActivity.C().q;
                tn5 tn5Var3 = new tn5(romListActivity, null, 2);
                this.Y = 1;
                if (se.m(q45Var, tn5Var3, this) == p31Var11) {
                    return p31Var11;
                }
                return o27Var;
            default:
                p31 p31Var12 = p31.COROUTINE_SUSPENDED;
                int i19 = this.Y;
                if (i19 != 0) {
                    if (i19 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                qm3 qm3Var6 = qm3.STARTED;
                sn5 sn5Var6 = new sn5(romListActivity, null, 10);
                this.Y = 1;
                if (nl2.R(romListActivity, qm3Var6, sn5Var6, this) == p31Var12) {
                    return p31Var12;
                }
                return o27Var;
        }
    }
}
