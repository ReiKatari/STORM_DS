package defpackage;

import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ok5  reason: default package */
/* loaded from: classes.dex */
public final class ok5 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ RomDetailsActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ok5(RomDetailsActivity romDetailsActivity, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = romDetailsActivity;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((ok5) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((ok5) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        RomDetailsActivity romDetailsActivity = this.Z;
        switch (i) {
            case 0:
                return new ok5(romDetailsActivity, j11Var, 0);
            default:
                return new ok5(romDetailsActivity, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        RomDetailsActivity romDetailsActivity = this.Z;
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
                    int i3 = RomDetailsActivity.I0;
                    o45 o45Var = romDetailsActivity.A().g;
                    x6 x6Var = new x6(13, romDetailsActivity);
                    this.Y = 1;
                    if (o45Var.A.a(x6Var, this) == p31Var) {
                        return p31Var;
                    }
                }
                f81.c();
                return null;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    int i5 = RomDetailsActivity.I0;
                    o45 o45Var2 = romDetailsActivity.A().r;
                    n5 n5Var = new n5(romDetailsActivity, null, 24);
                    this.Y = 1;
                    if (se.m(o45Var2, n5Var, this) == p31Var2) {
                        return p31Var2;
                    }
                }
                return o27.a;
        }
    }
}
